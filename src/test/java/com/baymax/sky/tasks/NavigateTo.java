package com.baymax.sky.tasks;

import com.baymax.sky.ui.Elements;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.jetbrains.annotations.NotNull;

public class NavigateTo {
    @NotNull
    public static Performable Calculator() {
        return Task.where("{0} Calculator", actor -> actor.attemptsTo(
                Open.url(Elements.URL),
                Click.on(Elements.INPUT_FORMS),
                Click.on(Elements.SIMPLE_FORM_DEMO),
                Enter.theValue("2").into(Elements.NUM_A),
                Enter.theValue("3").into(Elements.NUM_B),
                Click.on(Elements.TOTAL_BUTTON)

        ));
    }
}
