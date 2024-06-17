package com.baymax.sky.features.search;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
//@UseTestDataFrom(value = "datatest/valid-number.csv")


public class WebHook {

    Actor hanh = Actor.named("Hanh");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;

    @Before
    public void HanhCanBrowseTheWeb() {
         hanh.can(BrowseTheWeb.with(herBrowser));
    }

}