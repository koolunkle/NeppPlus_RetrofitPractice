package com.neppplus.retrofitlibrarypractice.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.neppplus.retrofitlibrarypractice.datas.ReviewData

class MainRecyclerAdapter(val mContext: Context, val mList: List<ReviewData>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

//    2가지 ViewHolder 필요 -> 0번 칸 : 상단부(Header) xml / 나머지 칸(Item) : 리뷰 모양 xml

    inner class HeaderViewHolder(row: View) : RecyclerView.ViewHolder(row) {

    }

    inner class ItemViewHolder(row: View) : RecyclerView.ViewHolder(row) {

    }

    // position 별로 어떤 모양이 나가야 하는지 (viewType 어떻게 되는지) 알려줄 함수
    val HEADER_VIEW_TYPE = 1000
    val REVIEW_ITEM_TYPE = 1001

    override fun getItemViewType(position: Int): Int {

//        position 0 : 맨 윗칸 -> 상단 뷰
//        position 그 외 : 목록 표시 -> 리뷰 아이템
        return when (position) {
            0 -> HEADER_VIEW_TYPE
            else -> REVIEW_ITEM_TYPE
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    override fun getItemCount() = mList.size + 1

}