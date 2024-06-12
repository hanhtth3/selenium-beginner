package com.baymax.sky.tasks;

import com.baymax.sky.ui.Elements;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenMenuSimpleFormDemo implements Task {
    @Step("Open the simple form demo")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
    //private static Performable OpenMenuSimpleFormDemo() {
        //return Task.where("Open the simple form demo", actor -> actor.attemptsTo(
                Open.url(Elements.URL),
                Click.on(Elements.INPUT_FORMS),
                Click.on(Elements.SIMPLE_FORM_DEMO)
        );
    };
}
