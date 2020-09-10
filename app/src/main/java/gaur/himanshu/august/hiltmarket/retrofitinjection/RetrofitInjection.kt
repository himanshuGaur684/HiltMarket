package gaur.himanshu.august.hiltmarket.retrofitinjection

import android.content.Context
import android.widget.Toast
import retrofit2.Retrofit
import javax.inject.Inject

class RetrofitInjection @Inject constructor(val retrofit: Retrofit) {

    fun checkRetrofitInjection(context: Context) {

        Toast.makeText(context, "Retrofit Injected Successfully", Toast.LENGTH_LONG).show()
    }

    fun giveCheckVerification():String{
        return "Dependencies Successfull"
    }
}