fun main(args: Array<String>) {
    val like = 1000
    var result = "лайк"

    if (like < 99) {
        if (like % 10 in 2..4) {
            result = "лайка"
        } else if (like % 10 in 5..9) {
            result = "лайков"
        }
    } else {
        if (like % 10 in 2..4) {
            result = "лайка"
        } else if (like % 100 in 5..14 || like % 10 === 0) {
            result = "лайков"
        }
    }
    println("У вас $like $result")
}
