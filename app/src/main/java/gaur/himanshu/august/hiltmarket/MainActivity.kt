package gaur.himanshu.august.hiltmarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import gaur.himanshu.august.hiltmarket.di.Car
import gaur.himanshu.august.hiltmarket.di.Wheel
import gaur.himanshu.august.hiltmarket.interfaces.TestingInteraface
import gaur.himanshu.august.hiltmarket.retrofitinjection.RetrofitInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car : Car

    @Inject
    lateinit var testingInteraface: TestingInteraface

    @Inject
    lateinit var retrofitInjection: RetrofitInjection



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        car.toastMsg(context = this)


        name.text=testingInteraface.giveRandomName()  // Implemented Interface or passing Interface as Arguments


        retrofitInjection.checkRetrofitInjection(context = this) // Inject Retrofit using @Provides annotation

        retrofit_imple.text="Retrofit : "+retrofitInjection.giveCheckVerification()

      wheel_check.text= "Wheel Dependencies "+ car.wheel.rim.giveComponents()+"\n" // make diffrences between two same objects or Dependencies

       wheel_check.append( car.wheel.spikes.giveComponents())
    }
}