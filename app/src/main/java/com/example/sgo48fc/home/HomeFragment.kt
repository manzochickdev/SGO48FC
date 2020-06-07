package com.example.sgo48fc.home

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.sgo48fc.R
import com.example.sgo48fc.customTag
import com.example.sgo48fc.databinding.FragmentHomeBinding
import com.example.sgo48fc.model.Member
import com.example.sgo48fc.repository.Repository


class HomeFragment : Fragment() {
    lateinit var fragmentHomeBinding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentHomeBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_home, container, false)

        setUpView()

        return fragmentHomeBinding.root
    }

    private fun setUpView(){
        val memberList = Repository.getMember()
        val adapter = MemberAdapter(memberList,this::onMemberPress)
        fragmentHomeBinding.rvMember.adapter = adapter
    }

    private fun onMemberPress(m: Member){
        Log.d("OK", "onMemberPress: ${m.name}")

        val memberDetailBottomFragment = MemberDetailBottomFragment()
        memberDetailBottomFragment.show(fragmentManager!!,memberDetailBottomFragment.customTag())
    }

}