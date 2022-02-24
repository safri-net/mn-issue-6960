package com.example

import io.micronaut.core.annotation.NonNull
import io.micronaut.core.convert.ArgumentConversionContext
import io.micronaut.http.MutableHttpRequest
import io.micronaut.http.client.bind.ClientArgumentRequestBinder
import io.micronaut.http.client.bind.ClientRequestUriContext
import jakarta.inject.Singleton

@Singleton
class MyLocaleClientArgumentRequestBinder implements ClientArgumentRequestBinder<Locale> {
    @Override
    void bind(@NonNull ArgumentConversionContext<Locale> context, @NonNull ClientRequestUriContext uriContext, @NonNull Locale value, @NonNull MutableHttpRequest<?> request) {
        // not called
        uriContext.setPathParameter('locale', value.toString())
    }
}
