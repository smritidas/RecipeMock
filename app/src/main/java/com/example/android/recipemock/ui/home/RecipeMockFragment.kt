package com.example.android.recipemock.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView
import com.example.android.recipemock.R
import com.example.android.recipemock.api.Recipe
import com.example.android.recipemock.ui.adapter.RecipeAdapter

class RecipeMockFragment: Fragment() {
   private val adapter = RecipeAdapter()
    private val viewModel: RecipeMockViewModel by viewModels()
    private lateinit var list: List<Recipe>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.rvRecipes)
        recyclerView.adapter = adapter
        viewModel
    }


    //viewModel (name of the list variable). observe
    //lifecycle owner is this, and trailing lambda (adapter.set)

}