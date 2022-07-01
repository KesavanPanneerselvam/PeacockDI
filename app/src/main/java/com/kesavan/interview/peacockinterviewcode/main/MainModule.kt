package com.kesavan.interview.peacockinterviewcode.main

import com.kesavan.interview.peacockinterviewcode.data.CommonData
import com.kesavan.interview.peacockinterviewcode.di.Repository
import com.kesavan.interview.peacockinterviewcode.main.presenter.ThronesPresenter
import com.kesavan.interview.peacockinterviewcode.main.presenter.ThronesPresenterImpl
import com.kesavan.interview.peocockdi.annotation.Provides
import com.kesavan.interview.peocockdi.di.InjectorModule

class MainModule: InjectorModule {
    @Provides
    fun provideRepository(commonData: CommonData): Repository {
        return Repository(commonData)
    }

    @Provides
    fun provideMainPresenter(repository: Repository): ThronesPresenter {
        return ThronesPresenterImpl(repository)
    }
}