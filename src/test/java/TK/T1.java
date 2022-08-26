package TK;

import pages.Taip;

import static automationTesting.allureReport.Steps.result;
import static automationTesting.allureReport.Steps.step;

public class T1 {

    private Taip taip;

    public void scenario_T1() {
        step("[Step 1]: заполнение форму", () -> {

            taip = new Taip();
            taip.заполнять_поля_форм("nik", "mailnik", "hi people");

            result("Заполнили форму");
        });

    }
}
