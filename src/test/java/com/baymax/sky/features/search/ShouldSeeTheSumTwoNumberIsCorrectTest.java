package com.baymax.sky.features.search;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.WithTag;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.ensure.Ensure;

@RunWith(SerenityRunner.class)
public class ShouldSeeTheSumTwoNumberIsCorrectTest {

   public static final Target INPUT_FORMS =
            Target.the("menu Input Forms")
                    .located(By.linkText("Input Forms"));
    public static final Target SIMPLE_FORM_DEMO =
            Target.the("menu Simple Form Demo")
                    .located(By.linkText("Simple Form Demo"));
    public static final Target NUM_A =
            Target.the("Number a")
                    .located(By.id("value1"));
    public static final Target NUM_B =
            Target.the("Number b")
                    .located(By.id("value2"));
    public static final Target TOTAL_BUTTON =
            Target.the("button Get total")
                    .locatedBy("//button[@onclick='return total()']");
    public static final Target TOTAL =
            Target.the("Total")
                    .located(By.id("displayvalue"));

    public static final Target SINGLE_FIELD =
            Target.the("Single Field")
                    .located(By.id("user-message"));

    public static final Target SHOW_INPUT =
            Target.the("Show messange")
                    .locatedBy("//button[@onclick='showInput();']");

    public static final Target SHOW =
            Target.the("Display")
                    .located(By.id("display"));
    public static final String URL = "https://demo.seleniumeasy.com/";

    Actor hanh = Actor.named("Hanh");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;

    @Before
    public void HanhCanBrowseTheWeb() {
        // Cứ MỖI LẦN thực hiện một @Test thì đoạn code này sẽ chạy trước
        /*
         * Bài Tập.
         * Tìm kiếm trong kịch bản này những đoạn  nào dùng chung thì bỏ vào phần Before
         * */
        hanh.can(BrowseTheWeb.with(herBrowser));
        hanh.attemptsTo(
                Open.url(URL),
                Click.on(INPUT_FORMS),
                Click.on(SIMPLE_FORM_DEMO)
        );
    }


    @WithTag("TC001")
    @Test
    public void sum_when_input_data() {

        hanh.attemptsTo(
                Enter.theValue("2").into(NUM_A),
                Enter.theValue("3").into(NUM_B),
                Click.on(TOTAL_BUTTON),
                //Ensure.that(TOTAL).value().isEqualTo("5")
                Ensure.that(TOTAL).text().isEqualTo("5")
        );


    }

    @WithTag("TC002")
    @Test
    public void sum_when_no_input_data() {

        hanh.attemptsTo(
                Click.on(TOTAL_BUTTON),
                Ensure.that(TOTAL).text().isEqualTo("NaN")
        );

    }

    @WithTag("TC003")
    @Test
    public void check_when_input_data() {

        hanh.attemptsTo(
                Enter.theValue("Hello").into(SINGLE_FIELD),
                Click.on(SHOW_INPUT),
                Ensure.that(SHOW).text().isEqualTo("Hello")
        );


    }
}