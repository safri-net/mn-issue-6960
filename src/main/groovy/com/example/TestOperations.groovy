package com.example

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Get

import javax.validation.constraints.NotNull

interface TestOperations {
    @Get("/{locale}")
    HttpResponse<Locale> localeTest(@NotNull Locale locale)
}