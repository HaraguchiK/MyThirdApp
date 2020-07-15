package com.example.mythirdapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

//アクティビティでは
//Viewの配置、キー操作の監視、タッチの監視、ボタン押下の監視などを行う

//AppCompatActivityを継承
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        //親クラスのコンストラクタを呼び出す
        //引数：定型文だと思っておく。
        super.onCreate(savedInstanceState)
        //Rクラス：リソースファイルを参照する ためのもの（画像、レイアウト、文字列etc）
        //int型のIDで管理している R.[layout/string… ].[.xmlのファイル名]
        setContentView(R.layout.activity_main)

        //設定ボタンが押された時
        //設定用Activityにインテントを渡して画面遷移
        setting_button.setOnClickListener{
            //intentの作成
            //引数(1:呼び出し元のインスタンス　2:呼び出したいアクティビティの"クラス")
            val intent = Intent(this, SettingActivity::class.java)
            intent.putExtra("TITLE", R.string.setting_activity_title)
            startActivity(intent)
        }

        //ギャラリー用Activityにインテントを渡して画面遷移
        gallery_button.setOnClickListener{
            val intent = Intent(this, GalleryActivity::class.java)
            intent.putExtra("TITLE", R.string.gallery_activity_title)
            startActivity(intent)
        }
    }

}