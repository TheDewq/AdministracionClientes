package com.example.adminstracionclientes.ui.lista

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.adminstracionclientes.R
import com.example.adminstracionclientes.databinding.FragmentListaBinding

class listaFragment : Fragment() {

    private var _binding: FragmentListaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(ListaViewModel::class.java)

        _binding = FragmentListaBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val btn:Button = root.findViewById(R.id.btn1)
        val txt:TextView = root.findViewById(R.id.txt1)
        txt.text = "nfojseoifjesof"

        btn.setOnClickListener(){
            Toast.makeText(root.context, "si sirve", Toast.LENGTH_LONG)
            txt.text = "aja"
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}