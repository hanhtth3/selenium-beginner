package com.baymax.sky.features.search;

import com.baymax.sky.tasks.Calculate;
import com.baymax.sky.tasks.NavigateTo;
import net.serenitybdd.annotations.WithTag;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.baymax.sky.ui.Elements;

@RunWith(SerenityRunner.class)
public class ShouldSeeTheSumTwoNumberIsCorrectTest extends WebHook {

    @WithTag("TC001")
    @Test
    public void calculate_the_sum_of_two_numbers_when_input_valid_data() {

        hanh.attemptsTo(
                NavigateTo.theCalculator(),
                Calculate.theSumOf("7", "4"),
                Ensure.that(Elements.TOTAL).text().isEqualTo("11")
        );

    }

    @WithTag("TC002")
    @Test
    public void calculate_the_sum_of_two_numbers_when_without_input_data() {

        hanh.attemptsTo(
                NavigateTo.theCalculator(),
                Calculate.theSumOf("",""),
                Ensure.that(Elements.TOTAL).text().isEqualTo("NaN")
        );

    }

}