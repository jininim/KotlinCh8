package com.example.ch11_jetpack

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.ch11_jetpact.databinding.FragmentOneBinding
import com.example.ch11_jetpact.databinding.ItemRecyclerviewBinding

class OneFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentOneBinding.inflate(inflater,container,false)
        val datas = mutableListOf<String>()
        for (i in 1..9){
            datas.add("Item $i")
        }
        val layoutManager = LinearLayoutManager(activity)
        binding.recyclerView.layoutManager=layoutManager
        val adapter = MyAdapter(datas)
        binding.recyclerView.adapter = adapter // 어답터 등록
        binding.recyclerView.addItemDecoration(DividerItemDecoration(activity,LinearLayoutManager.VERTICAL))

        return binding.root
    }

}
// 항목 뷰를 가지는 역할
class MyViewHolder(val binding : ItemRecyclerviewBinding) : RecyclerView.ViewHolder(binding.root)

//항목 구성자. 어댑터
class MyAdapter(private val datas:MutableList<String>):RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    //항목 뷰를 가지는 뷰 홀더를 준비하기 위해 자동 호출
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        MyViewHolder(ItemRecyclerviewBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    // 각 항목을 구성하기 위해 호출
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding = (holder as MyViewHolder).binding
        //뷰에 데이터 출력
        binding.itemData.text = datas[position]
    }

    override fun getItemCount(): Int {
        return datas.size
    }

}