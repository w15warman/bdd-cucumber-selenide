package com.si.pages.web;

import framework.utils.PropertiesReader;
import java.util.Properties;

public class PagePaths {

  private static PropertiesReader propertiesReader = new PropertiesReader();
  private static Properties properties = propertiesReader.loadPropertiesFile("run.properties");

  public static final String HOMEPAGE = properties.getProperty("url");
  public static final String MENU_PAGE = HOMEPAGE + "menu";

}
