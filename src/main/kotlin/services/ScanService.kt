import java.io.BufferedReader
import java.io.InputStreamReader

class ScanService {

    fun runScan(domain: String): String {
        val command = arrayOf(
            "docker", "run", "--rm", "theharvester",  domain, "-b", "all"
        )

        val process = ProcessBuilder(*command).start()
        val reader = BufferedReader(InputStreamReader(process.inputStream))

        val result = StringBuilder()
        reader.lines().forEach { line ->
            result.append(line).append("\n")
        }

        process.waitFor()
        return result.toString()
    }
}
