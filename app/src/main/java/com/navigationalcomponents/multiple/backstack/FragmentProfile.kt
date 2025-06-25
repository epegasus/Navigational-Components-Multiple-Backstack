package com.navigationalcomponents.multiple.backstack

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.navigationalcomponents.multiple.backstack.databinding.FragmentNotificationsBinding
import com.navigationalcomponents.multiple.backstack.databinding.FragmentProfileBinding

class FragmentProfile : Fragment() {

    private var binding: FragmentProfileBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentProfileBinding.inflate(layoutInflater, container, false)
        return binding!!.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}