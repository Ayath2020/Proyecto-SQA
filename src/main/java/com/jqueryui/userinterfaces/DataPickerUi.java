package com.jqueryui.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DataPickerUi extends PageObject {

    public static final Target IFRAME_ELEMENT =
            Target.the("iframe calendar").located(By.cssSelector("iframe.demo-frame"));

    public static final Target  TXT_DATE =
            Target.the("Date input").located(By.id("datepicker"));

    public static final Target OPT_CURRENT_DAY =
            Target.the("Current day link").located(By.cssSelector("td.ui-datepicker-today a"));


    public static final Target NEXT_MONTH_BTN =
            Target.the("Next month button").located(By.xpath("//a[@title='Next']"));

    public static final Target SPECIFIC_MONTH_DAY =
            Target.the("día {0} en el calendario")
                    .locatedBy("//table[contains(@class,'ui-datepicker-calendar')]//a[normalize-space()='{0}']");

}
