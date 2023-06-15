fun main(args: Array<String>) {
    val like = 100
    var a = like % 10
    var result = "лайк"
    if (like % 10 === 2 || like % 10 === 3 || like % 10 === 4 || like % 10 === 5 ) {
        result = "лайка"
    } else if (like % 10 === 6 || like % 10 === 7 || like % 10 === 8 || like % 10 === 9 ||  like % 10 === 0) {
        result = "лайков"
    }

    println("У вас $like $result")

}