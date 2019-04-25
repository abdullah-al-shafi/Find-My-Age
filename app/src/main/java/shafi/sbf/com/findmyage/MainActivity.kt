package shafi.sbf.com.findmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buFindAge.setOnClickListener {
            /*
            when button click by id...and use listener
             */

        }
    }

    fun findAge(view:View){

        //this is onClick method

        val dateOfBirth:Int = txDBO.text.toString().toInt()
        val CurrentYear = Calendar.getInstance().get(Calendar.YEAR)
        val myAge = CurrentYear - dateOfBirth

        tvShowAge.text = "Your age is $myAge Year"
    }
}
