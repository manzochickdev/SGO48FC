package com.example.sgo48fc.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sgo48fc.databinding.LayoutMemberItemBinding
import com.example.sgo48fc.model.Member

class MemberAdapter(private val memberList: ArrayList<Member>,val onMemberPress:(m:Member)->Unit):RecyclerView.Adapter<MemberAdapter.ViewHolder>() {
    class ViewHolder(private val layoutMemberItemBinding: LayoutMemberItemBinding):RecyclerView.ViewHolder(layoutMemberItemBinding.root){
        fun bind(member:Member){
            layoutMemberItemBinding.member = member
            layoutMemberItemBinding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutMemberItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun getItemCount(): Int {
        return memberList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(memberList[position])
        holder.itemView.setOnClickListener { onMemberPress(memberList[position]) }
    }
}