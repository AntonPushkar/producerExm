import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description"should return odd when number input is odd"
    request {
        method GET()
        url("/factorial") {
            queryParameters {
                parameter("number", "5")
            }
        }
    }
    response {
        body("120")
        status 200
    }
}
