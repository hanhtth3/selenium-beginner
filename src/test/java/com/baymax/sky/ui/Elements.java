package com.baymax.sky.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Elements {

    public static final Target INPUT_FORMS =
            Target.the("menu Input Forms")
                    .located(By.linkText("Input Forms"));
    public static final Target SIMPLE_FORM_DEMO =
            Target.the("menu Simple Form Demo")
                    .located(By.linkText("Simple Form Demo"));
    public static final Target NUM_A =
            Target.the("Number a")
                    .located(By.id("value1"));
    public static final Target NUM_B =
            Target.the("Number b")
                    .located(By.id("value2"));
    public static final Target TOTAL_BUTTON =
            Target.the("button Get total")
                    .locatedBy("//button[@onclick='return total()']");
    public static final Target TOTAL =
            Target.the("Total")
                    .located(By.id("displayvalue"));

    public static final Target SINGLE_FIELD =
            Target.the("Single Field")
                    .located(By.id("user-message"));

    public static final Target SHOW_INPUT =
            Target.the("Show messange")
                    .locatedBy("//button[@onclick='showInput();']");

    public static final Target ECHO_MESSANGE =
            Target.the("Display")
                    .located(By.id("display"));
    public static final String URL = "https://demo.seleniumeasy.com/";
}
