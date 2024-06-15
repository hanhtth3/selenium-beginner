package com.baymax.sky.tasks;

import com.baymax.sky.ui.Elements;
import groovy.lang.GString;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.jetbrains.annotations.NotNull;

public class Calculate {
    @NotNull
    public static Performable theSumOf(String number1, String number2) {
        return Task.where(" {0} Calculate the sum of two numbers and dislay total ", actor -> actor.attemptsTo(
                Enter.theValue(number1).into(Elements.NUM_A),
                Enter.theValue(number2).into(Elements.NUM_B),
                Click.on(Elements.TOTAL_BUTTON)
        ));

    }
}
