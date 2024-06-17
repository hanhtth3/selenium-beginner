package com.baymax.sky.features.search;

import com.baymax.sky.tasks.Send;
import com.baymax.sky.tasks.NavigateTo;
import com.baymax.sky.ui.Elements;
import net.serenitybdd.annotations.WithTag;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class ShouldSeeTheMessageIsRepeatedTest extends WebHook {

    @WithTag("TC003")
    @Test
    public void should_see_the_echo_value_when_sending_a_messange() {

        hanh.attemptsTo(
                NavigateTo.theCalculator(),
                Send.aMessage("Hello"),
                Ensure.that(Elements.ECHO_MESSANGE).text().isEqualTo("Hello")
        );


    }
    }

