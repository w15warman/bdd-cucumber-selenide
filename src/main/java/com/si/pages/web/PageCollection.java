package com.si.pages.web;

import com.si.pages.StoreMapPage;
import com.si.pages.web.drink_details.HotChocolate;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PageCollection {

  public BasePage basePage = new BasePage();
  public HomePage homePage = new HomePage();
  public MenuPage menuPage = new MenuPage();
  public HotDrinksPage hotDrinksPage = new HotDrinksPage();
  public HotChocolate hotChocolate = new HotChocolate();
  public StoreMapPage storeMapPage = new StoreMapPage();

}
