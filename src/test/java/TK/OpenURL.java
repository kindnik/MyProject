package TK;

import pages.DriverWeb;

import static automationTesting.allureReport.Steps.result;
import static automationTesting.allureReport.Steps.step;

public class OpenURL {

    public void openURL() {
        step("[Step 1]: Открытие страницы", () -> {

            DriverWeb.setUpAll();
            DriverWeb.openURL();

            result("Перешли на страницу");
        });
    }
}
