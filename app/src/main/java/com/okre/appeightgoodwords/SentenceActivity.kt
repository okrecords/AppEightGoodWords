package com.okre.appeightgoodwords

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class SentenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        // 데이터 생성
        val sentenceList = mutableListOf<ListViewModel>()
        sentenceList.add(ListViewModel("爲之於未有 治之於未亂","만사가 생기기 전에 신중히 하며, 어지러워지기 전에 다스려야 한다."))
        sentenceList.add(ListViewModel("合抱之木 生於毫末", "아름드리 큰 나무도 터럭만한 싹에서부터 생겨난다."))
        sentenceList.add(ListViewModel("九層之臺 起於累土", "9층 높이의 누대도 흙을 쌓아 올려 세워진다."))
        sentenceList.add(ListViewModel("千里之行始於足下", "천 리 길도 한 걸음부터 시작되는 법이다."))
        sentenceList.add(ListViewModel("爲者敗之 執者失之", "억지로 하려는 자는 실패할 것이며, 집착하는 자는 잃게 될 것이다."))
        sentenceList.add(ListViewModel("是以聖人無爲故無敗", "이런 까닭에 성인은 억지로 하지 않으므로 실패하지 않는다."))
        sentenceList.add(ListViewModel("無執故無失", "집착하지 않으므로 잃는 것이 없다."))

        //데이터와 어댑터 연결
        val sentenceAdapter = ListViewAdapter(sentenceList)
        val listview = findViewById<ListView>(R.id.sentenceListView)
        listview.adapter = sentenceAdapter

        // AdapterView<?> parent, View view, int position, long id
        // parent AdapterView: The AdapterView where the click happened.
        // view View: The view within the AdapterView that was clicked (this will be a view provided by the adapter)
        // position int: The position of the view in the adapter.
        // id long: The row id of the item that was clicked.
        listview.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, sentenceList[i].title, Toast.LENGTH_SHORT).show()
        }
    }
}

data class ListViewModel (
    var title : String = "",
    var content : String = ""
)