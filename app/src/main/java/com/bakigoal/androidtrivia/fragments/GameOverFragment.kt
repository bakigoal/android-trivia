package com.bakigoal.androidtrivia.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.bakigoal.androidtrivia.R
import com.bakigoal.androidtrivia.databinding.FragmentGameOverBinding

class GameOverFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, s: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentGameOverBinding>(
            inflater, R.layout.fragment_game_over, container, false
        )
        addListeners(binding)
        return binding.root
    }

    private fun addListeners(binding: FragmentGameOverBinding) {
        binding.tryAgainButton.setOnClickListener {
            it.findNavController()
                .navigate(GameOverFragmentDirections.actionGameOverFragmentToGameFragment())
        }
    }
}
