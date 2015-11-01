package com.alan.demo;

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
        // TODO: application initialization
    }

    @Override
    public void run(final WordReverseConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
