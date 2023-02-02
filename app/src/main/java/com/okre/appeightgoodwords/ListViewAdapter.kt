package com.okre.appeightgoodwords

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

//BaseAdapter 상속
class ListViewAdapter (private val List : MutableList<ListViewModel>) : BaseAdapter() {

    override fun getCount(): Int {
        return List.size
    }

    override fun getItem(positon: Int): Any {
        return List[positon]
    }

    override fun getItemId(positon: Int): Long {
        return positon.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var convertView = convertView

        if(convertView == null) {
            convertView = LayoutInflater.from(parent?.context).inflate(R.layout.listview_item, parent, false)
        }

        val title = convertView!!.findViewById<TextView>(R.id.listViewTextAreaTitle)
        val content = convertView!!.findViewById<TextView>(R.id.listViewTextAreaContent)

        title!!.text = List[position].title
        content!!.text = List[position].content

        return convertView!!
    }

}