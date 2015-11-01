package com.alan.demo;

import com.alan.demo.resources.WordReverseResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class WordReverseApplication extends Application<WordReverseConfiguration> {

    public static void main(final String[] args) throws Exception {
        new WordReverseApplication().run(args);
    }

    @Override
    public String getName() {
        return "WordReverse";
    }

    @Override
    public void initialize(final Bootstrap<WordReverseConfiguration> bootstrap) {

    }

    @Override
    public void run(final WordReverseConfiguration configuration,
                    final Environment environment) {
        final String defaultWord = configuration.getDefaultWord();
        environment.jersey().register(new WordReverseResource(defaultWord));
    }

}
