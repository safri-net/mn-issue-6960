package com.example

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller

import javax.validation.constraints.NotNull

@Controller("/")
class TestController implements TestOperations {
    @Override
    HttpResponse<Locale> localeTest(@NotNull Locale locale) {
        return HttpResponse.ok(locale)
    }
}
