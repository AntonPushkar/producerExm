import org.springframework.cloud.contract.spec.Contract
Contract.make {
    description"should return even when number input is even"
    request {
        method GET()
        url("/factorial") {
            queryParameters {
                parameter("number", "3")
            }
        }
    }
    response {
        body("6")
        status 200
    }

}
