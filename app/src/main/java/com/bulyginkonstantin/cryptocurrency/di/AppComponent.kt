package com.bulyginkonstantin.cryptocurrency.di

import com.bulyginkonstantin.cryptocurrency.activities.MainActivity
import com.bulyginkonstantin.cryptocurrency.fragments.CurrenciesListFragment
import com.bulyginkonstantin.cryptocurrency.mvp.presenter.CurrenciesPresenter
import com.bulyginkonstantin.cryptocurrency.mvp.presenter.LatestChartPresenter
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class, RestModule::class, MvpModule::class, ChartModule::class])
@Singleton
interface AppComponent {

    fun inject(mainActivity: MainActivity)
    fun inject(fragment: CurrenciesListFragment)
    fun inject(presenter: CurrenciesPresenter)
    fun inject(presenter: LatestChartPresenter)
}