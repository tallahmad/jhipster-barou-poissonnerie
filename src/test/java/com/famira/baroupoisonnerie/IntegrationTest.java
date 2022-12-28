package com.famira.baroupoisonnerie;

import com.famira.baroupoisonnerie.BaroupoissonnerieApp;
import com.famira.baroupoisonnerie.config.AsyncSyncConfiguration;
import com.famira.baroupoisonnerie.config.EmbeddedElasticsearch;
import com.famira.baroupoisonnerie.config.EmbeddedKafka;
import com.famira.baroupoisonnerie.config.EmbeddedSQL;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { BaroupoissonnerieApp.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedKafka
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
