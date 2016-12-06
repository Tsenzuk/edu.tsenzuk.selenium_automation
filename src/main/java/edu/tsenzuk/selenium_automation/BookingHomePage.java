package edu.tsenzuk.selenium_automation;

import org.openqa.selenium.By;

public class BookingHomePage {
    // the tabs
    public static final By INPUT_SEARCH = By.cssSelector("input#ss");
    public static final By INPUT_CHECKIN_YEAR = By.cssSelector("[data-mode='checkin'] input.sb-date-field__input.-year");
    public static final By INPUT_CHECKIN_MONTH = By.cssSelector("[data-mode='checkin'] input.sb-date-field__input.-month");
    public static final By INPUT_CHECKIN_DAY = By.cssSelector("[data-mode='checkin'] input.sb-date-field__input.-day");
    public static final By INPUT_CHECKOUT_YEAR = By.cssSelector("[data-mode='checkout'] input.sb-date-field__input.-year");
    public static final By INPUT_CHECKOUT_MONTH = By.cssSelector("[data-mode='checkout'] input.sb-date-field__input.-month");
    public static final By INPUT_CHECKOUT_DAY = By.cssSelector("[data-mode='checkout'] input.sb-date-field__input.-day");
    public static final By LIST_SEARCH_AUTOCOMPLETE = By.cssSelector("input#ss + ul.c-autocomplete__list.sb-autocomplete__list");
    public static final By LIST_SEARCH_AUTOCOMPLETE_ELEMENT = By.cssSelector("input#ss + ul.c-autocomplete__list.sb-autocomplete__list > li");
    public static final By BUTTON_FROM_DROPDOWN = By.cssSelector("[data-mode='checkin'] div.sb-date-field__display");
    public static final By BUTTON_TO_DROPDOWN = By.cssSelector("[data-mode='checkout'] div.sb-date-field__display");
    public static final String LOC_LNK_SUPPORTTAB = "li#menu_support a[href$='support/']";
    public static final String LOC_LNK_ABOUTTAB = "li#menu_about a[href$='about/']";

    // download link
    public static final By LOC_LNK_DOWNLOADSELENIUM = By.linkText("Download Selenium");
}