package com.example.navigationalcomponentmultiplebackstack.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.navigationalcomponentmultiplebackstack.R
import com.example.navigationalcomponentmultiplebackstack.databinding.FragmentFailureBinding
import com.example.navigationalcomponentmultiplebackstack.utils.Helper

class FragmentFailure : Fragment() {

    private var binding: FragmentFailureBinding? = null
    private var navController: NavController? = null

    private fun initializations() {
        navController = findNavController()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFailureBinding.inflate(layoutInflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initializations()

        binding?.apply {
            btnScoreFailure.setOnClickListener { onScoreClick() }
            btnTryAgainFailure.setOnClickListener { onTryAgainClick() }
        }
    }

    private fun onScoreClick() {
        if (Helper.isCurrentDestination(navController!!, R.id.fragmentFailure)) {
            navController?.navigate(R.id.action_fragmentFailure_to_fragmentScore)
        }
    }

    private fun onTryAgainClick() {
        if (Helper.isCurrentDestination(navController!!, R.id.fragmentFailure)) {
            navController?.popBackStack()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}