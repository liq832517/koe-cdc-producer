package com.koe.cdc.config;

import io.debezium.engine.DebeziumEngine;
import lombok.Data;
import lombok.SneakyThrows;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.SmartLifecycle;
import org.springframework.util.Assert;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author n1
 * @since 2021/6/2 10:45
 */
@Data
public class DebeziumServerBootstrap implements InitializingBean, SmartLifecycle {

    private final Executor executor = Executors.newSingleThreadExecutor();
    private DebeziumEngine<?> debeziumEngine;

    @Override
    public void start() {
        executor.execute(debeziumEngine);
    }

    @SneakyThrows
    @Override
    public void stop() {
        debeziumEngine.close();
    }

    @Override
    public boolean isRunning() {
        return false;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(debeziumEngine, "debeziumEngine must not be null");
    }
}
