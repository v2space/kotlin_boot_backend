package site.v2space.app.result

import java.time.LocalDateTime

@Suppress(names = ["unused"])
data class DataResult<out T>(
    val time: LocalDateTime = LocalDateTime.now(),
    val status: Boolean,
    val code: Int,
    val message: String,
    val data: T?
) {
    companion object {
        fun <T> ok(data: T?) : DataResult<T> {
            return DataResult(status = ResultEnum.OK.status, code = ResultEnum.OK.code, message = ResultEnum.OK.message, data = data)
        }
        fun <T> ok(message: String, data: T?) : DataResult<T> {
            return DataResult(status = ResultEnum.OK.status, code = ResultEnum.OK.code, message = message, data = data)
        }

        fun <T> error(): DataResult<T> {
            return DataResult(status = ResultEnum.ERROR.status, code = ResultEnum.ERROR.code, message = ResultEnum.ERROR.message, data = null)
        }
        fun <T> error(message: String) : DataResult<T> {
            return DataResult(status = ResultEnum.ERROR.status, code = ResultEnum.ERROR.code, message = message, data = null)
        }
    }
}
