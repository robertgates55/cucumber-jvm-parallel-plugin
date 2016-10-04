package com.github.timm.cucumber.generate;

import org.apache.maven.plugin.logging.Log;

import java.io.File;

public class TestFileGeneratorConfig implements FileGeneratorConfig {

    private final boolean filterFeatureByTags = false;
    private Log log;
    private File featuresDirectory;
    private String outputDir;
    private final boolean useTestNg = false;
    private final String namingScheme = "simple";
    private final String namingPattern = null;

    public TestFileGeneratorConfig setFeaturesDirectory(final File directory) {
        this.featuresDirectory = directory;
        return this;
    }

    public TestFileGeneratorConfig setCucumberOutputDir(final Class<?> classUnderTest) {
        this.outputDir = "target/" + classUnderTest.getName();
        return this;
    }


    public boolean filterFeaturesByTags() {
        return filterFeatureByTags;
    }

    public Log getLog() {
        return log;
    }

    public File getFeaturesDirectory() {
        return featuresDirectory;
    }

    public String getEncoding() {
        return "UTF-8";
    }

    public String getCucumberOutputDir() {
        return outputDir;
    }

    public boolean useTestNG() {
        return useTestNg;
    }

    public String getNamingScheme() {
        return namingScheme;
    }

    public String getNamingPattern() {
        return namingPattern;
    }

}
