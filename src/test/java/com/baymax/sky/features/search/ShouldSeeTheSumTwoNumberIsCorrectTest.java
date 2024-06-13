package com.baymax.sky.features.search;

import com.baymax.sky.tasks.NavigateTo;
import com.baymax.sky.tasks.OpenMenuSimpleFormDemo;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.WithTag;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.baymax.sky.ui.Elements;

@RunWith(SerenityRunner.class)
public class ShouldSeeTheSumTwoNumberIsCorrectTest {

    Actor hanh = Actor.named("Hanh");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;

    @Steps
    OpenMenuSimpleFormDemo OpenMenuSimpleFormDemo;

    @Before
    public void HanhCanBrowseTheWeb() {
        // Cứ MỖI LẦN thực hiện một @Test thì đoạn code này sẽ chạy trước
        /*
         * Bài Tập.
         * Tìm kiếm trong kịch bản này những đoạn  nào dùng chung thì bỏ vào phần Before
         * */
        hanh.can(BrowseTheWeb.with(herBrowser));
    }

    @WithTag("TC001")
    @Test
    public void sum_when_input_data() {

        hanh.attemptsTo(
                NavigateTo.Calculator(),
                Ensure.that(Elements.TOTAL).text().isEqualTo("5")
        );


    }

    @WithTag("TC002")
    @Test
    public void sum_when_no_input_data() {

        hanh.attemptsTo(
                OpenMenuSimpleFormDemo,
                Click.on(Elements.TOTAL_BUTTON),
                Ensure.that(Elements.TOTAL).text().isEqualTo("NaN")
        );

    }

    @WithTag("TC003")
    @Test
    public void check_when_input_data() {

        hanh.attemptsTo(
                OpenMenuSimpleFormDemo,
                Enter.theValue("Hello").into(Elements.SINGLE_FIELD),
                Click.on(Elements.SHOW_INPUT),
                Ensure.that(Elements.SHOW).text().isEqualTo("Hello")
        );


    }
}