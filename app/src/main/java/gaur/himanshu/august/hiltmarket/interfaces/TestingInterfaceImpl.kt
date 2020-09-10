package gaur.himanshu.august.hiltmarket.interfaces

import javax.inject.Inject

class TestingInterfaceImpl @Inject constructor() : TestingInteraface {
    override fun giveRandomName(): String {
       return "Tested Interface Implemented Successfully [First] "
    }
}