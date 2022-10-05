package com.pozetech.englishforkids.presentation.fragments.category.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.pozetech.englishforkids.R
import com.pozetech.englishforkids.databinding.CustomCategoryItemBinding

class CategoryViewHolder constructor(private val binding: CustomCategoryItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(item: String?, position: Int) {
        if (position == 0){
            binding.categoryAppleStickWithoutTop.visibility = View.VISIBLE
            binding.categoryAppleStick.visibility = View.GONE
            binding.categoryAppleIcon.setImageResource(R.drawable.ic_colored_apple)
            binding.categoryAppleStickWithoutTop.setImageResource(R.color.red)
        }
    }
}
