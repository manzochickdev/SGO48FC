package com.example.sgo48fc.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.sgo48fc.R
import com.example.sgo48fc.databinding.FragmentMemberDetailBottomBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class MemberDetailBottomFragment : BottomSheetDialogFragment() {
    lateinit var fragmentMemberDetailBottomBinding: FragmentMemberDetailBottomBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentMemberDetailBottomBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_member_detail_bottom, container, false)
        fragmentMemberDetailBottomBinding.viewHolder.setOnClickListener {
            dismiss()
        }
        fragmentMemberDetailBottomBinding.ivMemberProfile.setOnClickListener {  }
        return fragmentMemberDetailBottomBinding.root
    }
}