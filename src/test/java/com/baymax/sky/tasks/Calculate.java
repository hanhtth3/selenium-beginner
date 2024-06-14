package com.baymax.sky.tasks;

import com.baymax.sky.ui.Elements;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.jetbrains.annotations.NotNull;

public class Calculate {
    @NotNull
    public static Performable theSumOf23() {
        return Task.where(" {0} Calculate the sum of (2,3)", actor -> actor.attemptsTo(
                Enter.theValue("2").into(Elements.NUM_A),
                Enter.theValue("3").into(Elements.NUM_B),
                Click.on(Elements.TOTAL_BUTTON)
        ));

    }
}
