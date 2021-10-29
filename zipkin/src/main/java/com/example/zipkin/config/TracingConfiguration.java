package com.example.zipkin.config;

import brave.Tracing;
import brave.context.log4j2.ThreadContextScopeDecorator;
import brave.propagation.CurrentTraceContext;
import brave.propagation.ThreadLocalCurrentTraceContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//@Configuration
public class TracingConfiguration {
//    @Bean
//    @Primary
//    public Tracing tracing() {
//        return Tracing.newBuilder()
//                .localServiceName("billing")
//                .currentTraceContext(
//                        ThreadLocalCurrentTraceContext.newBuilder()
//                                .addScopeDecorator(
//                                        ThreadContextScopeDecorator
//                                                .create()) // puts trace IDs into logs
//                                .build())
//                .build();
//    }
}
