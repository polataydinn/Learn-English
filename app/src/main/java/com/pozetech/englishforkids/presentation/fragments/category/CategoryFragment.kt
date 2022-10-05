package com.pozetech.englishforkids.presentation.fragments.category

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pozetech.englishforkids.R
import com.pozetech.englishforkids.databinding.FragmentCategoryBinding
import com.pozetech.englishforkids.databinding.FragmentWelcomeBinding
import com.pozetech.englishforkids.presentation.fragments.category.adapter.CategoryAdapter

class CategoryFragment : Fragment() {

    private val categoryAdapter : CategoryAdapter by lazy { CategoryAdapter() }
    private lateinit var binding: FragmentCategoryBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listOfString = (1..20).toList().map {
            it.toString()
        }
        categoryAdapter.submitList(listOfString)
        binding.categoryFragmentRecyclerView.adapter = categoryAdapter
    }

}