import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.scanRoutes() {
    val scanService = ScanService()

    post("/start-scan") {
        val domain = call.receive<String>() // Assuming you pass the domain in the body
        val scanResult = scanService.runScan(domain)
        call.respondText("Scan for $domain completed: \n$scanResult")
    }

    get("/scans") {
        // Placeholder: Return past scans (logic will depend on your implementation)
        call.respondText("Past scans will be listed here.")
    }
}
