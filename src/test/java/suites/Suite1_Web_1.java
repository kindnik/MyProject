package suites;

import TK.OpenURL;
import TK.T1;
import TK.T2;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;

public class Suite1_Web_1 {

    @Test
    @Order(1)
    @DisplayName("откроет главную страницу и заполнит форму")

    public void t1() {
        new OpenURL().openURL();
        new T1().scenario_T1();
    }

    @Test
    @Order(2)
    @DisplayName("проверка текста и перход на вкладку контакты")

    public void t2() {
        new OpenURL().openURL();
        new T2().scenario_T2();

    }
}
