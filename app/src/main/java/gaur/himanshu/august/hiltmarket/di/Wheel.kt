package gaur.himanshu.august.hiltmarket.di

import gaur.himanshu.august.hiltmarket.di.wheeldi.Components

import gaur.himanshu.august.hiltmarket.modules.First
import gaur.himanshu.august.hiltmarket.modules.Second
import javax.inject.Inject

class Wheel @Inject constructor(
    @First val rim:Components,
    @Second val spikes:Components
) {


}