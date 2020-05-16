package com.si.pages;

import framework.utils.PropertiesReader;
import java.util.Properties;

public class PagePaths {

  private static PropertiesReader propertiesReader = new PropertiesReader();
  private static Properties properties = propertiesReader.loadPropertiesFile("run.properties");

  public static final String HOMEPAGE = properties.getProperty("url");
  public static final String MENU_PAGE = HOMEPAGE + "menu";
  public static final String HOT_DRINKS_PAGE = HOMEPAGE + "menu/drinks/hot-drinks";
  public static final String HOT_CHOCOLATE_DETAILS_PAGE = HOMEPAGE + "menu/product/471/hot?parent=%2Fdrinks%2Fhot-drinks%2Fhot-chocolates";
  public static final String STORE_MAP_PAGE = HOMEPAGE + "store-locator?map=39.635307,-101.337891,5z";

}
