import java.security.KeyStore.TrustedCertificateEntry

fun main(args: Array<String>) {
    // Numbers
    var Int1: Int = 13
    var Long1 = 75L
    var Float1: Float = 3.14F
    var Double1: Double = 105.69873
    var Short1: Short = 7
    var Byte1: Byte = 2


    println("An Int Value is " + Int1);
    println("A Double  Value is " + Double1);
    println("A Float Value is " + Float1);
    println("A Long Value is ${Long1}");
    println("A Short Value is ${Short1}");
    println("A Byte Value is ${Byte1}");

    //Char
    val Char1: Char = 'J'
    println("A Char value is ${Char1}")

    //Booleans
    var Boolean1: Boolean = true
    Boolean1 = false
    println("A Boolean value is ${Boolean1}")

    //Strings
    var String1 = "Misc sentence string!"
    var String2 = "Secondary misc sentence string!! \n"
    var multiLines1 = """
        Random thing 1
        Random thing 2
        Random thing 3
    """
    println(String2)
    println("Here is an example of a multiline string ${multiLines1}")

    val account = 560
    val acBalance = "Your balance is $account dollars"
    println(acBalance)

}