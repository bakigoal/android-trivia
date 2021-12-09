package com.bakigoal.androidtrivia.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.bakigoal.androidtrivia.R
import com.bakigoal.androidtrivia.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentTitleBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_title, container, false
        )
        setListeners(binding)
        return binding.root
    }

    private fun setListeners(binding: FragmentTitleBinding) {
        binding.playButton.setOnClickListener {
            val navController = Navigation.findNavController(it)
            navController.navigate(R.id.action_titleFragment_to_gameFragment)
        }
    }
}