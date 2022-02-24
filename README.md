# ClientArgumentRequestBinder does not take precedence

See https://github.com/micronaut-projects/micronaut-core/issues/6960.

`Locale` as argument is now converted to an `accept-language header` by a `ClientArgumentRequestBinder` in 
the `DefaultHttpClientBinderRegistry`
see [here](https://github.com/micronaut-projects/micronaut-core/blob/3.3.x/http-client-core/src/main/java/io/micronaut/http/client/bind/DefaultHttpClientBinderRegistry.java#L94).
To make a `locale` work as path param I tried to register my own `ClientArgumentRequestBinder` but the one from the `DefaultHttpClientBinderRegistry` always took precedence.

I solved the original problem by annotation the `Locale` param with `@PathVariable`.