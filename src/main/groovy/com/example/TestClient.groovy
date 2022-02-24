package com.example


import io.micronaut.http.client.annotation.Client

@Client(id = "test", path = "/")
interface TestClient extends TestOperations {

}