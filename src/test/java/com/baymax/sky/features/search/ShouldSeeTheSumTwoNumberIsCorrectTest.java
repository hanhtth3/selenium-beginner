package com.baymax.sky.features.search;

import com.baymax.sky.tasks.Calculate;
import com.baymax.sky.tasks.NavigateTo;
import net.serenitybdd.annotations.Managed;
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
                NavigateTo.theCalculator(),
                Calculate.theSumOf23(),
                Ensure.that(Elements.TOTAL).text().isEqualTo("5")
        );

    }

    @WithTag("TC002")
    @Test
    public void sum_when_no_input_data() {

        hanh.attemptsTo(
                NavigateTo.theCalculator(),
                Click.on(Elements.TOTAL_BUTTON),
                Ensure.that(Elements.TOTAL).text().isEqualTo("NaN")
        );

    }

    @WithTag("TC003")
    @Test
    public void check_when_input_data() {

        hanh.attemptsTo(
                NavigateTo.theCalculator(),
                Enter.theValue("Hello").into(Elements.SINGLE_FIELD),
                Click.on(Elements.SHOW_INPUT),
                Ensure.that(Elements.SHOW).text().isEqualTo("Hello")
        );


    }
}