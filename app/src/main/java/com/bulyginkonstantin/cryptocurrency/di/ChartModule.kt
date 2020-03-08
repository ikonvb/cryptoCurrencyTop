package com.bulyginkonstantin.cryptocurrency.di

import com.bulyginkonstantin.cryptocurrency.chart.LatestChart
import com.bulyginkonstantin.cryptocurrency.formatters.YearValueFormatter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ChartModule {

    @Provides
    @Singleton
    fun provideLatestChart() = LatestChart()

    @Provides
    @Singleton
    fun provideYearFormatter() = YearValueFormatter()
}
