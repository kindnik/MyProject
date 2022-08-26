package TK;

import pages.AboutCompany;
import pages.Contact;
import pages.Taip;

import static automationTesting.allureReport.Steps.result;
import static automationTesting.allureReport.Steps.step;


public class T2 {

    private AboutCompany aboutCompany;
    private Taip taip;
    private Contact contact;

    public void scenario_T2() {
        step("[Step 1]: нажать на вкладку о компании", () -> {
            taip = new Taip();
            aboutCompany = taip.нажать_о_компании();

            result("Перешли на вкладку «о компании»");
        });

        step("[Step 2]: проверка текста страницы", () -> {
            aboutCompany.проверка_текста("С уважением, директор ООО «ТАиП», Агафонников Дмитрий Анатольевич.");

            result("Проверили текст");
        });

        step("[Step 3]: нажать на вкладку контакты", () -> {

            contact = aboutCompany.нажать_контакты();


            result("Перешли на вкладку «контакты»");
        });

        step("[Step 4]: заполнить имя и маил", () -> {


            contact.заполнять_поля_форм_Contact("nik", "mailnik");

            result("заполнил имя и маил");
        });

        step("[Step 5]: проверить факс и телефон", () -> {

             contact.проверка_текста_факса_телефона("Телефон/факс: +7 (812) 244-33-19,\n" +
                     "E-mail: info-service@taip.su");


            result("проверка факса и телефона");
        });
    }
}
