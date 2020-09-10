package gaur.himanshu.august.hiltmarket.di.wheeldi

import javax.inject.Inject

class Spikes @Inject constructor() : Components {
    override fun giveComponents(): String {
        return "Wheel Spikes"
    }
}