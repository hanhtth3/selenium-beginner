package com.baymax.sky.features.search;

import com.baymax.sky.tasks.Send;
import com.baymax.sky.tasks.NavigateTo;
import com.baymax.sky.ui.Elements;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.WithTag;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class ShouldSeeTheMessageIsRepeatedTest {

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

    @WithTag("TC003")
    @Test
    public void should_see_the_messange_display_when_input_vailid_data() {

        hanh.attemptsTo(
                NavigateTo.theCalculator(),
                Send.aMessage("Hello"),
                Ensure.that(Elements.ECHO_MESSANGE).text().isEqualTo("Hello")
        );


    }

}