// Создать приложение, которое подсчитывает количество подряд идущих одинаковых символов во введенной строке.
// На вход подается, например, строка AAADSSSRRTTHAAAA. На выходе получаем A3DS3R2T2HA4.
fun main(args: Array<String>) {
    print("Введите строку: ")
    val input = readln()
    println("Строка: "+input)
    var i:Int; var j:Int = 0; var number:Int = 0
    var stop:Boolean = false
    var s:Char = 's'
    var b:String = ""
    for (i in 0..input.length-1)
    {
        if (i == j)
        {
            while (!stop) {
                if(j == input.length) break;
                stop = false
                s = input[i]
                if (s == input[j]) {
                    number++; j++
                } else stop = true
            }
            b += s;
            if (number != 1) b += number.toString()
            s = 's'
            number = 0
            stop = false
        }
    }
    print("Результат: " + b);
}