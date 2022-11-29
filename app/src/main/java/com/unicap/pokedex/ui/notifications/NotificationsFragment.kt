package com.unicap.pokedex.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.unicap.pokedex.R
import com.unicap.pokedex.databinding.FragmentNotificationsBinding

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(R.layout.fragment_notifications, container, false)

        view.findViewById<ImageView>(R.id.about_lucas_imageView).setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_navigation_about_lucas)
        }

        view.findViewById<ImageView>(R.id.about_danilo_imageView).setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_navigation_about_danilo)
        }

        view.findViewById<ImageView>(R.id.about_giovanni_imageView).setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_navigation_about_giovanni)
        }

        return view;
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}