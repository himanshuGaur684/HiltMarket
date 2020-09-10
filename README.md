# Hilt Market
Hilt Android

## This Repository is taught about Hilt which is new Dependencies Injection

Here I take simple Analogy of Car and its Dependencies which is Wheel and Engine 

* Step 1 -  Create a Class naming __BaseApplication__ which Extend __Application()__ annotate with @HiltAndroidApp() and Register this Class to our <application/> tag in Android Manifest. It will generate all required component for Hilt
* Step 2 - Annotate our MainActivity class with __AndroidEntryPoint__
* Step 3 - Create a seperate Package naming di in which create three class __a__ Car @Inject constructor(wheel:Wheel,engine:Engine) and similarly for engine and wheel  Engine Wheel class too
* Step 4 - Create a Interface directory in which create a interface __TestInterface__ and a Class which implements this method [see code]
* Step 5 - Create a directory __Modules__ in which create a file or object it is up too you in which we saw how to provide Objects which can't pass as Dependencies [see code]
* Step 6 - Create a directory in di directory and in this we will see how to make diffrences between same objects [ see code]
