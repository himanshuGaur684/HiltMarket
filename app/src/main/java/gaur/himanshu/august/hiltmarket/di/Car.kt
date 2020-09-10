package gaur.himanshu.august.hiltmarket.di

import android.content.Context
import android.widget.Toast
import javax.inject.Inject

class Car @Inject constructor(
    val engine: Engine,
   val wheel: Wheel
) {

    fun  toastMsg(context: Context){
        Toast.makeText(context,"My Toast",Toast.LENGTH_SHORT).show()
    }

}