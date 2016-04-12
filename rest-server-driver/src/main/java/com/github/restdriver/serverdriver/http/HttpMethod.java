/**
 * Copyright © 2010-2011 Nokia
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.restdriver.serverdriver.http;

import java.net.URI;

import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

public class HttpMethod extends HttpEntityEnclosingRequestBase {
    
    private String method;
    
    public HttpMethod(final String method) {
        super();
        this.method = method.toUpperCase();
    }
    
    public HttpMethod(final String method, final URI uri) {
        super();
        setURI(uri);
        this.method = method.toUpperCase();
    }
    
    public HttpMethod(final String method, final String uri) {
        super();
        setURI(URI.create(uri));
        this.method = method.toUpperCase();
    }
    
    @Override
    public String getMethod() {
        return method;
    }
}
