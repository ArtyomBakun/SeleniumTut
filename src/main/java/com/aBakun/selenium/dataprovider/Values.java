package com.aBakun.selenium.dataprovider;

public class Values {
	public static String DRIVER_PROPERTY = "webdriver.chrome.driver";
	public static String PATH_TO_DRIVER = "chromeDriver.exe";
	public static String START_URL = "http://www.tut.by";
	public static String XPATH_WORK_SECTION = "//li/a[text()='Работа']";
	public static String XPATH_SEARCH_FORM = "//input[@data-qa='vacancy-serp__query']";
	public static String SEARCH_CRITERIA = "специалист по тестированию";
	public static String XPATH_COUNT_OF_PAGES = "//ul/li[@data-qa='pager-page']";
	public static String XPATH_FIND_MATHED_ELEMENTS = "//div/a[contains(@class,'search-result-item__name')]";
	public static String XPATH_LINK_O_NEXT_PAGE = "//ul/li[@data-qa='pager-page'][%d]";
	public static int WAIT_SECONDS = 10;
}
