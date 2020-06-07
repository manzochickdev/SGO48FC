package com.example.sgo48fc.repository

import com.example.sgo48fc.model.Member

object Repository {
    fun getMember():ArrayList<Member>{
        val memberList = ArrayList<Member>()
        memberList.add(Member("Anna",null))
        memberList.add(Member("Dona",null))
        memberList.add(Member("Janie",null))
        return memberList
    }
}