package tests;

import dto.Student;
import manager.AppManager;
import org.testng.annotations.Test;
import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;

public class PracticeFormTests extends AppManager {

    @Test
    public void studentRegFormPositiveTest() {
        Student student = new Student("Vasy","Vasil","vas33@gmail.com","male"
                ,"3344556677","23 marz 2020","Maths,Physics,Chemistry","musik","",
                "ASDOD 1", "NSR", "Deli");
        new HomePage(getDriver()).clickBtnForms();
        new FormsPage(getDriver()).clickBtnPracticeForm();
        new PracticeFormPage(getDriver()).typePracticeForm(student);
    }
}