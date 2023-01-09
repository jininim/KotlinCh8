package com.example.inventory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.inventory.data.Item
import com.example.inventory.data.ItemDao
import kotlinx.coroutines.launch

//ViewModel 클래스에서 InventoryViewModel 클래스를 확장 , ItemDao 객체를 매개변수로 기본 생성사에 전달.
class InventoryViewModel(private val itemDao: ItemDao) : ViewModel() {
    //InventoryViewModel 클래스에서 Item 객체를 가져오고 비차단 방식으로 데이터를 데이터베이스에 추가하는 insertItem()이라는 private 함수를 추가
    private fun insertItem(item: Item) {
        viewModelScope.launch {
            itemDao.insert(item)
        }
    }
    //문자열 세 개를 가져오고 Item 인스턴스를 반환하는 또 다른 비공개 함수를 추가
    private fun getNewItemEntry(itemName: String, itemPrice: String, itemCount: String): Item{
        return Item(
            itemName = itemName,
            itemPrice = itemPrice.toDouble(),
            quantityInStock = itemCount.toInt()
        )
    }
    //항목 세부정보 문자열을 세 개 가져오는 addNewItem()이라는 공개 함수를 추가
    fun addNewItem(itemName: String,itemPrice: String, itemCount: String){
        val newItem = getNewItemEntry(itemName,itemPrice,itemCount)
        insertItem(newItem)
    }
    fun isEntryValid(itemName: String,itemPrice: String,itemCount: String): Boolean{
        if(itemName.isBlank() || itemPrice.isBlank() || itemCount.isBlank() ){
            return false
        }
        return true
    }
}

class InventoryViewModelFactory(private val itemDao: ItemDao) : ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(InventoryViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return InventoryViewModel(itemDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}

