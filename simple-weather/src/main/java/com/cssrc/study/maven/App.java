package com.cssrc.study.maven;

import org.apache.log4j.PropertyConfigurator;

import java.io.InputStream;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
        PropertyConfigurator.configure(App.class.getClassLoader().getResource("log4j.properties"));
        int zipcode = 224400;
        try {
            zipcode = Integer.parseInt(args[0]);
        } catch (Exception e) {

        }
        new App(zipcode).start();
    }

    private int zip;

    public App(int zip) {
        this.zip = zip;
    }

    public void start() throws Exception {
        // Retrieve Data
        InputStream dataIn = new YahooRetriever().retrieve(zip);
        // Parse Data
        Weather weather = new YahooParser().parse(dataIn);
        // Format (Print) Data
        System.out.print(new WeatherFormatter().format(weather));
    }
}
