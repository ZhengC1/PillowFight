package com.pillowfight;

import com.pillowfight.resources.PillowFightResource;
import com.pillowfight.Health.PillowHealthCheck;
import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.forms.MultiPartBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class PillowFightApplication extends Application<PillowFightConfiguration> {
    public static void main(String[] args) throws Exception {
        new PillowFightApplication().run(args);
    }

    @Override
    public String getName() {
        return "PillowFight";
    }

    @Override
    public void initialize(Bootstrap<PillowFightConfiguration> bootstrap) {
        bootstrap.addBundle(new MultiPartBundle());
 
        System.out.println(new java.io.File("src/webapp/dist/webapp/").getAbsolutePath());
        bootstrap.addBundle(new AssetsBundle("/webapp", "/", "index.html"));
    }

    @Override
    public void run(PillowFightConfiguration configuration,
                    Environment environment) {
        environment.jersey().register(new PillowFightResource());
        environment.healthChecks().register("template", new PillowHealthCheck(configuration.getTemplate()));
    }

}
