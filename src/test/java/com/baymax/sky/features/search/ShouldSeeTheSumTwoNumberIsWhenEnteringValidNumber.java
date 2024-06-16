package com.baymax.sky.features.search;

import com.baymax.sky.tasks.Calculate;
import com.baymax.sky.tasks.NavigateTo;
import com.baymax.sky.ui.Elements;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.WithTag;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "datatest/valid-number.csv")

public class ShouldSeeTheSumTwoNumberIsWhenEnteringValidNumber extends PageObject {

    private String numbera;
    private String numberb;
    private String total;

    public void setNumbera(String numbera) {
        this.numbera = numbera;
    }

    public void setNumberb(String numberb) {
        this.numberb = numberb;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @WithTag("TC001")
    @Test
    public void calculate_the_sum_of_two_numbers_when_input_valid_data() {


        hanh.attemptsTo(
                NavigateTo.theCalculator(),
                Calculate.theSumOf(numbera, numberb),
                Ensure.that(Elements.TOTAL).text().isEqualTo(total)
        );

    }
}


