package com.VP.Framework.Adviser.Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.VP.Framework.Adviser.Helper.PropReader;

public class WebdriverHelper extends EventFiringWebDriver {

	public static RemoteWebDriver driver;
	public static DesiredCapabilities caps;
	public static String platformName;
	public static String browserName;
	public static String browserDriverPath;
	static {
		platformName = PropReader.readWebdriverConfig("platform");
		browserName = PropReader.readWebdriverConfig("browser.name");
		launchDriver();
	}

	public static void launchDriver() {
		try {
			if (platformName.equalsIgnoreCase("windows") && browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "/drivers/Firefox/geckodriver.exe");
				launchFirefoxDriver();
			} else if (platformName.equalsIgnoreCase("windows") && browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "/drivers/Chrome/chromedriver.exe");
				launchChromeDriver();
			} else if (platformName.equalsIgnoreCase("windows") && browserName.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "/drivers/IE11/IEDriverServer.exe");
				launchIEDriver();
			}
		} catch (IllegalStateException e) {
			System.out.println("Please check Platform : " + platformName + " and browser : " + browserName);
			e.printStackTrace();
		}
	}

	private static void launchIEDriver() {
		driver = new InternetExplorerDriver(internetExplorercapabilities());
	}

	private static void launchChromeDriver() {
		driver = new ChromeDriver(chromecapabilities());
	}

	private static void launchFirefoxDriver() {
		driver = new FirefoxDriver(firefoxDesiredCapabilities());
	}

	public WebdriverHelper(WebDriver driver) {
		super(driver);
	}

	private static DesiredCapabilities chromecapabilities() {
		caps = DesiredCapabilities.chrome();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-extensions");
		chromeOptions.addArguments("--disable-web-security");
		chromeOptions.addArguments("--test-type");
		caps.setCapability("chrome.verbose", false);
		caps.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		caps.setBrowserName("Chrome");
		caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		return caps;
	}

	private static DesiredCapabilities internetExplorercapabilities() {
		caps = DesiredCapabilities.internetExplorer();
		caps.setBrowserName("internet explorer");
		caps.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
		caps.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
		caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		return caps;
	}

	private static DesiredCapabilities firefoxDesiredCapabilities() {
		caps = DesiredCapabilities.firefox();
		caps.setCapability("disable-restore-session-state", true);
		caps.setBrowserName("Chrome");
		caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		return caps;
	}

	public static RemoteWebDriver getWebDriver() {
		return driver;
	}

	private static final Thread CLOSE_THREAD = new Thread() {
		@Override
		public void run() {
			driver.quit();
		}
	};
	static {
		Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
	}
}
