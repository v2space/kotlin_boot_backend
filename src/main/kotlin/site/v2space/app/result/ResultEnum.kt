package site.v2space.app.result

enum class ResultEnum(val code: Int, val message: String, val status: Boolean) {
    OK(200, "OK", true),
    ERROR(500, "ERROR", false);

//    fun getCode() = code
//    fun getMessage() = message
//    fun getStatus() = status
}