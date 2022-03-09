package com.example.navigationalcomponentmultiplebackstack.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationalcomponentmultiplebackstack.R
import com.example.navigationalcomponentmultiplebackstack.databinding.FragmentSettingBinding
import com.example.navigationalcomponentmultiplebackstack.utils.Helper

class FragmentSetting : Fragment() {

    private var binding: FragmentSettingBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSettingBinding.inflate(layoutInflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.btnAboutSetting?.setOnClickListener { onAboutClick() }
    }

    private fun onAboutClick() {
        val navController = findNavController()
        if (Helper.isCurrentDestination(navController, R.id.fragmentSetting))
            navController.navigate(FragmentSettingDirections.actionFragmentSetting2ToFragmentAboutApp2())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}