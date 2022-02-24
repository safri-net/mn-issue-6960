package com.example

import io.micronaut.http.HttpStatus
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import io.micronaut.test.support.TestPropertyProvider
import jakarta.inject.Inject
import spock.lang.Specification

@MicronautTest
class MissingPathParamSpec extends Specification implements TestPropertyProvider {

    @Inject
    TestClient client

    void 'locale should be transmitted to server'() {
        when:
        def r = client.localeTest(Locale.GERMANY)

        then:
        noExceptionThrown()
        r.status() == HttpStatus.OK

        when:
        def body = r.body()

        then:
        body == Locale.GERMANY
    }

    @Override
    Map<String, String> getProperties() {
        return [
                'micronaut.server.port': 12345,
                'micronaut.http.services.test.url': "http://localhost:12345",
        ]
    }
}
