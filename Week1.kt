/**
Emre Tonkal -- 09.2022 -- Patika Pazarama Bootcamp Hafta 1 Ödev
 */

/**
Ödev 1
 */

//Test için bir string değişken tanımlandı.
var testUsername = "u__hello_world123"

//Fonksiyon gövdesi oluşturuldu.
fun CodelandUsernameValidation(str: String): String {

//Bir boolean değişken oluşturulup verilen stringin boyut kontrolü yapıldı.
    var valid = str.length in 4..25

//Stringin harfle başlaması kontrolü yapıldı.
    valid = valid && (str[0] in 'a'..'z' || str[0] in 'A'..'Z')

//Stringin her bir karakterinin harf, rakam veya _ olmasının kontrolü yapıldı.
    str.forEach {
        valid = valid && (it in 'a'..'z' || it in 'A'..'Z' || it in '0'..'9' || it == '_')
    }
//Boolean değer stringe çevrildi.
    return valid.toString()

}

/**
Ödev 2
 */

//Test için bir integer array tanımlandı.
var testArray = arrayOf(2123231213,152342324,6554546,2121432,654412545)

//Fonksiyon gövdesi oluşturuldu.
fun aVeryBigSum(ar: Array<Int>): Long {

    //Long tipinde bir toplam değişkeni 0 değeriyle initialize edildi.
    var total: Long = 0

    //Arrayin her elemanı toplam değerine eklendi.
    ar.forEach { it ->
        total += it
    }
    return total
}

/**
Ödev 4
 */

//Test için bir sayı belirlendi.
var testNumber = 8

//Fonksiyon gövdesi oluşturuldu.
private fun FirstFactorial(num: Int): Int{
    var result = 1
//Faktöriyel alma işlemi yapıldı.
    for (i in num downTo 1){
        result*=i
    }
    return result
}


/**
Ödev 5
 */

//Test için bir string oluşturuldu.
var testString = "acc?7??sss?3rr1??????5"

//Fonksiyon gövdesi oluşturuldu.
fun QuestionsMarks(str: String): String {
//Gerekli değişkenler oluşturuldu.
    var QMCount = 0
    var lastDigit = -1
    var result = "false"

//Stringin gerekli şartları sağladığının kontrolü yapıldı.
    for (char in str) {
        if (char.isDigit()) {
            val digit = Integer.valueOf(char.toString())
            val sum = digit + lastDigit
            lastDigit = digit

            if (sum != 10) {
                QMCount = 0
                continue
            }

            result = if (QMCount == 3)
                "true"
            else
                "false"
            QMCount = 0
        } else if (char == '?') QMCount++
    }

    return result
}

//Fonksiyonlar main fonksiyonunda çağrıldı.
fun main(args: Array<String>) {
    println(CodelandUsernameValidation(testUsername))
    println(aVeryBigSum(testArray))
    println(FirstFactorial(testNumber))
    println(QuestionsMarks(testString))
}