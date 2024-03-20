package com.example.adminstracionclientes.ui.eliminar

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.adminstracionclientes.R

class eliminarFragment : Fragment() {

    companion object {
        fun newInstance() = eliminarFragment()
    }

    private val viewModel: EliminarViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_eliminar, container, false)
    }
}