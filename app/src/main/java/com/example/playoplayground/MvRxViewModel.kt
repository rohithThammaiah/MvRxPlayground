package com.example.playoplayground

import com.airbnb.mvrx.BaseMvRxViewModel
import com.airbnb.mvrx.MvRxState

abstract class MvRxViewModel<S: MvRxState>(initialState: S): BaseMvRxViewModel<S>(initialState,debugMode = BuildConfig.DEBUG)