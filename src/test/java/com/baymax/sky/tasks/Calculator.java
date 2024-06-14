package com.baymax.sky.tasks;

import com.baymax.sky.ui.Elements;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.jetbrains.annotations.NotNull;

public class Calculator {
    @NotNull
    public static Performable inputValue() {
        return Task.where(" {0} Input value to filelds and calculator", actor -> actor.attemptsTo(
                Enter.theValue("2").into(Elements.NUM_A),
                Enter.theValue("3").into(Elements.NUM_B),
                Click.on(Elements.TOTAL_BUTTON)
        ));

    }
}
