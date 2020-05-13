package com.si.pages.web;

import framework.utils.PropertiesReader;
import java.util.Properties;
import lombok.Getter;

public class BasePage {

  private PropertiesReader propertiesReader = new PropertiesReader();
  private Properties properties = propertiesReader.loadPropertiesFile("run.properties");

  @Getter
  private String baseUrl = properties.getProperty("url");

}
