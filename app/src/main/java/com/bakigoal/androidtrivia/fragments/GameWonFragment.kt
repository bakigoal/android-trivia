package com.bakigoal.androidtrivia.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.bakigoal.androidtrivia.R
import com.bakigoal.androidtrivia.databinding.FragmentGameWonBinding


class GameWonFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, s: Bundle?): View? {
        val binding: FragmentGameWonBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_game_won, container, false
        )
        addListeners(binding)
        showResult()
        return binding.root
    }

    private fun addListeners(binding: FragmentGameWonBinding) {
        binding.nextMatchButton.setOnClickListener {
            it.findNavController()
                .navigate(GameWonFragmentDirections.actionGameWonFragmentToGameFragment())
        }
    }

    private fun showResult() {
        val args = GameWonFragmentArgs.fromBundle(requireArguments())
        Toast.makeText(
            context,
            "NumCorrect: ${args.numCorrect}, NumQuestions: ${args.numQuestions}", Toast.LENGTH_LONG
        ).show()
    }
}
