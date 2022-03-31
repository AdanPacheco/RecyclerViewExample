package com.portfolio.recyclerviewexample.adapter

import android.content.DialogInterface
import android.view.View
import android.widget.Toast

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.portfolio.recyclerviewexample.SuperHero
import com.portfolio.recyclerviewexample.databinding.SuperHeroViewholderBinding


class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = SuperHeroViewholderBinding.bind(view)

    fun render(superHero: SuperHero, onClickListener: (SuperHero) -> Unit) {
        binding.tvSuperHeroName.text = superHero.superHero
        binding.tvRealName.text = superHero.realName
        binding.tvPublisher.text = superHero.publisher
        Glide.with(binding.ivSuperHero.context).load(superHero.photo).into(binding.ivSuperHero)
        itemView.setOnClickListener { onClickListener(superHero) }
    }
}