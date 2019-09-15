/*
 * @(#) CurriculumSteps.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import project.ui.pages.*;

import java.util.Map;

/**
 * CurriculumSteps class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class CurriculumSteps {
    private FormPageOne formPageOne;
    private FormPageTwo formPageTwo;
    private FormPageThree formPageThree;
    private FormPageFour formPageFour;
    private CurriculumManager curriculumManager;

    /**
     * Constructor class init vulues.
     */
    public CurriculumSteps() {
        this.formPageOne = new FormPageOne();
        this.formPageTwo = new FormPageTwo();
        this.formPageThree = new FormPageThree();
        this.formPageFour = new FormPageFour();
        this.curriculumManager = new CurriculumManager();
    }

    /**
     * User navigates CV sumary page
     */
    @When("the user navigates CV summary page")
    public void theUserNavigatesCurriculumPage() {
        formPageOne.visitCurriculumPage();
    }

    /**
     * User fill data of the first form page.
     *
     * @param bodyFields - User Data
     */
    @When("the user fill the data in the first form page with the following characteristics")
    public void theUserFillTheDataInTheFirstFormPageWithTheFollowingCharacteristics(final Map<String, String> bodyFields) {
        String name = bodyFields.get("Nombre");
        String lastName = bodyFields.get("Apellido");
        String cellPhone = bodyFields.get("Celular");
        String document = bodyFields.get("Documento");
        String idDocument = bodyFields.get("Numero documento");
        String born = bodyFields.get("Fecha de nacimiento");
        String sex = bodyFields.get("Sexo");
        String address = bodyFields.get("Direccion");
        String civilStatus = bodyFields.get("Estado civil");
        formPageOne.fillCurriculumFormPageOne(name, lastName, cellPhone, idDocument, address);
        System.out.println(born);
        formPageOne.fillOptions(civilStatus, document, born);
    }

    /**
     * User fill data of the second form page.
     *
     * @param bodyFields - User Data
     */
    @When("the user fill the data in the second form page with the following characteristics")
    public void theUserFillTheDataInTheSecondFormPageWithTheFollowingCharacteristics(final Map<String, String> bodyFields) {
        String jobTitle = bodyFields.get("Cargo en la empresa");
        String companyNAme = bodyFields.get("Nombre de la empresa");
        String country = bodyFields.get("País");
        String city = bodyFields.get("Ciudad");
        String initDate = bodyFields.get("Fecha de Inicio");
        String endDate = bodyFields.get("Fecha de Fin");
        formPageTwo.fillForm(jobTitle, companyNAme, city);
        formPageTwo.fillComboBox(country);
        formPageTwo.fillDate(initDate, endDate);
    }

    /**
     * User fill data of the third form page.
     *
     * @param bodyFields - User Data
     */
    @When("the user fill the data in the third form page with the following characteristics")
    public void theUserFillTheDataInTheThirdFormPageWithTheFollowingCharacteristics(final Map<String, String> bodyFields) {
        String school = bodyFields.get("Colegio o Institución");
        String schoolLevel = bodyFields.get("Nivel de Estudio");
        String country = bodyFields.get("País");
        String city = bodyFields.get("Ciudad");
        String initSchool = bodyFields.get("Fecha de Inicio del colegio");
        String endSchool = bodyFields.get("Fecha de Fin del colegio");
        String university = bodyFields.get("Universidad o Institución");
        String career = bodyFields.get("Carrera, Curso o Seminario");
        String universityLevel = bodyFields.get("Nivel de Estudio Universitario");
        String countryUniversity = bodyFields.get("País Universidad");
        String universityCity = bodyFields.get("Ciudad Universidad");
        String initUniversity = bodyFields.get("Fecha de Inicio Universidad");
        String endUniversity = bodyFields.get("Fecha de Fin Universidad");
        String language = bodyFields.get("Idioma");
        String writingLevel = bodyFields.get("Nivel Escrito");
        String speakingLevel = bodyFields.get("Nivel Oral");
        String readingLevel = bodyFields.get("Nivel Lectura");
        formPageThree.fillForm(school, city, university, career, universityCity);
        formPageThree.selectComboBox(schoolLevel, country, universityLevel, countryUniversity, language,
                writingLevel, speakingLevel, readingLevel);
        formPageThree.selectDate(initSchool, endSchool, initUniversity, endUniversity);
    }

    /**
     * User fill data of the four form page.
     *
     * @param bodyFields - User Data
     */
    @When("the user fill the data in the four form page with the following characteristics")
    public void theUserFillTheDataInTheFourFormPageWithTheFollowingCharacteristics(final Map<String, String> bodyFields) {
        String title = bodyFields.get("Título");
        String category = bodyFields.get("Categoría");
        String contract = bodyFields.get("Contrato");
        String salaryPretension = bodyFields.get("Pretensión Salarial (Bs.)");
        String country = bodyFields.get("País de residencia");
        String city = bodyFields.get("Ciudad actual");
        String curriculumPrivacity = bodyFields.get("Privacidad del Currículum");
        formPageFour.fillForm(title, salaryPretension);
        formPageFour.fillComboForm(category, contract, country, city, curriculumPrivacity);
    }

    /**
     * User confirm his data in the curriculum that was created.
     */
    @Then("the curriculum is created with and the following information is displayed in the curriculum page")
    public void theCurriculumIsCreatedWithAndTheFollowingInformationIsDisplayedInTheCurriculumPage() {
        curriculumManager.clickCurriculum();
    }
}