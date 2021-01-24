package com.demoqa.hooks;

import com.demoqa.common.BrowserManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hook extends BrowserManager
{
    private String CHROME = "Chrome";

    @Before
    public void setUp()
    {
        launchBrowser(CHROME);
    }
    @After
    public void tearDown()
    {
        closeBrowser();
    }
}
