package com.jqueryui.tasks;
import com.jqueryui.utils.GetCurrentDate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.jqueryui.userinterfaces.DataPickerUi.*;

public class SelectCurrentDay implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(OPT_CURRENT_DAY)
        );

      String fechaEsperada = GetCurrentDate.getCurrentDate();
      actor.remember("fechaSeleccionada", fechaEsperada);

    }


    public static SelectCurrentDay InCurrentMonth(String day){
        return new SelectCurrentDay();
    }
}
