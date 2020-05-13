package com.si.pages.web;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PageCollection {

  public BasePage basePage = new BasePage();
  public HomePage homePage = new HomePage();

}
