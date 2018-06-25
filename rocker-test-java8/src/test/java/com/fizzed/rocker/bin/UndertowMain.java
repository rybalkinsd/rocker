package com.fizzed.rocker.bin;

/*
 * Copyright 2015 Fizzed Inc.
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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UndertowMain {
    static private final Logger log = LoggerFactory.getLogger(UndertowMain.class);

//    public static void main(String[] args) throws Exception {
//        List<Stock> stocks = Stock.dummyItems();
//
//        // fully async, nio template rendering and delivery
//        PathHandler rootHandler = Handlers.path().addExactPath("/", (final HttpServerExchange exchange) -> {
//            // dispatch to worker thread pool
//            exchange.dispatch(() -> {
//                Stocks template = rocker.Stocks.template(stocks);
//
//                ArrayOfByteArraysOutput out
//                        = template.render(
//                                ArrayOfByteArraysOutput.FACTORY);
//
//                // convert to array of bytebuffers
//                List<byte[]> byteArrays = out.getArrays();
//                int size = byteArrays.size();
//                ByteBuffer[] byteBuffers = new ByteBuffer[size];
//                for (int i = 0; i < size; i++) {
//                    byteBuffers[i] = ByteBuffer.wrap(byteArrays.get(i));
//                }
//
//                log.info("response started with {} byte buffers", byteBuffers.length);
//                exchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "text/html; charset=utf-8");
//                exchange.setResponseContentLength(out.getByteLength());
//
//                exchange.getResponseSender().send(byteBuffers, new IoCallback() {
//                    @Override
//                    public void onComplete(HttpServerExchange exchange, Sender sender) {
//                        log.info("response finished");
//                        exchange.endExchange();
//                    }
//
//                    @Override
//                    public void onException(HttpServerExchange exchange, Sender sender, IOException exception) {
//                        log.error("response exception", exception);
//                        exchange.endExchange();
//                    }
//                });
//            });
//        });
//
//        Undertow server = Undertow.builder()
//            .addHttpListener(8080, "localhost")
//            .setWorkerThreads(10)
//            .setHandler(rootHandler)
//            .build();
//
//        server.start();
//
//        log.info("Open browser to http://localhost:8080");
//    }
    
}