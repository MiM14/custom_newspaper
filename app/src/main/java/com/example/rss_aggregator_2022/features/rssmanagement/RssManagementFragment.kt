package com.example.rss_aggregator_2022.features.rssmanagement

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.rss_aggregator_2022.databinding.FragmentRssManagementBinding

class RssManagementFragment : Fragment() {
    var binding: FragmentRssManagementBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRssManagementBinding.inflate(inflater)
        return binding?.root
    }
}