package com.apicatalog.jsonld.test.loader;

import java.net.URI;

import com.apicatalog.jsonld.JsonLdError;

public interface TestLoader {

    byte[] fetchBytes(URI create) throws JsonLdError;

}
