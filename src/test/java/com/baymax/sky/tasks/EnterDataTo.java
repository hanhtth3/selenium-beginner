package com.baymax.sky.tasks;

import com.baymax.sky.ui.Elements;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterDataTo {
    public static Performable SingleFiled(String field1) {
        return Task.where("{0} Enter data to single field and compare with result", actor -> actor.attemptsTo(
                Enter.theValue(field1).into(Elements.SINGLE_FIELD),
                Click.on(Elements.SHOW_INPUT)
        ));

    }
}
