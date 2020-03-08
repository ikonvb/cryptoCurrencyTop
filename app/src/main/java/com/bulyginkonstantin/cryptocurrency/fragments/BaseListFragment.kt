package com.bulyginkonstantin.cryptocurrency.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bulyginkonstantin.cryptocurrency.R
import com.bulyginkonstantin.cryptocurrency.adapter.BaseAdapter

/**
 * A simple [Fragment] subclass.
 */
abstract class BaseListFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    protected lateinit var viewAdapter: BaseAdapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewManager = LinearLayoutManager(context)
        viewAdapter = createAdapterInstance()
        recyclerView = view.findViewById(R.id.rvList)

        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }
    }
    abstract fun createAdapterInstance(): BaseAdapter<*>
}
