package gaur.himanshu.august.hiltmarket.di.wheeldi

import javax.inject.Inject

class Rim @Inject constructor() : Components {
    override fun giveComponents(): String {
        return "wheel Rim"
    }
}