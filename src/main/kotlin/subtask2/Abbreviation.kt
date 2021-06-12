package subtask2

class Abbreviation {


    fun abbreviationFromA(a: String, b: String): String {
        var result: String = "YES"
        var counterA = 0

        val aList = a.toLowerCase().toList()
        val bList = b.toLowerCase().toList()

            bList.forEach {
                if (counterA == aList.lastIndex) {
                    result = "NO"
                }
                for (i in counterA..aList.lastIndex) {
                    if (aList[counterA] == it) {
                        counterA++
                        return@forEach
                    }
                    counterA++
                }
                result = "NO"
            }

        return result
    }
}
