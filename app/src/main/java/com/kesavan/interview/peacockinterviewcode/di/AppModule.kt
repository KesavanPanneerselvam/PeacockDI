package com.kesavan.interview.peacockinterviewcode.di

import com.kesavan.interview.peacockinterviewcode.data.CommonData
import com.kesavan.interview.peocockdi.annotation.Provides
import com.kesavan.interview.peocockdi.di.InjectorModule

class AppModule: InjectorModule {

    @Provides
    fun provideCommonData(): CommonData {
        return CommonData()
    }
}