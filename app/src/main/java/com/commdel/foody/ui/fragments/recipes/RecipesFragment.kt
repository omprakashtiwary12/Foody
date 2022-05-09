package com.commdel.foody.ui.fragments.recipes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.commdel.foody.R
import com.commdel.foody.databinding.FragmentRecipesBinding

class RecipesFragment : Fragment() {
    private lateinit var binding:FragmentRecipesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_recipes,container,false)
        binding.recyclerview.showShimmer()
        return binding.root
    }
}