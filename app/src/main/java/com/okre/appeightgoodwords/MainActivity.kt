package com.okre.appeightgoodwords

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.okre.appeightgoodwords.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var back = false
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val sentenceList = mutableListOf<String>()
        sentenceList.add("爲之於未有 治之於未亂")
        sentenceList.add("合抱之木 生於毫末")
        sentenceList.add("九層之臺 起於累土")
        sentenceList.add("千里之行始於足下")
        sentenceList.add("爲者敗之 執者失之")
        sentenceList.add("是以聖人無爲故無敗")
        sentenceList.add("無執故無失")


        binding.showAllSentenceButton.setOnClickListener {
            val intent = Intent(this, SentenceActivity::class.java)
            startActivity(intent)
        }

        binding.goodWordTextArea.setText(sentenceList.random())
    }

    override fun onBackPressed() {
        if(back == true) {
            finish()
        }

        back = true
        Toast.makeText(this, "종료하시려면 한 번 더 클릭해주세요", Toast.LENGTH_SHORT).show()

        Handler(Looper.getMainLooper()).postDelayed({
            back = false
        }, 2000)
    }
}