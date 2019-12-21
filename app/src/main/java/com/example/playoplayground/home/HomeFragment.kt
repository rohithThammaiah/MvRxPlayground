package com.example.playoplayground.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.airbnb.mvrx.BaseMvRxFragment
import com.airbnb.mvrx.MvRxState
import com.airbnb.mvrx.fragmentViewModel
import com.airbnb.mvrx.withState
import com.example.playoplayground.R

data class HomeState(val title: String = "Home") : MvRxState

class HomeFragment : BaseMvRxFragment() {

    private val viewModel: HomeViewModel by fragmentViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_fragment, container, false)
    }

    override fun invalidate(): Unit = withState(viewModel) { state ->
        requireActivity().title = state.title
    }

}
