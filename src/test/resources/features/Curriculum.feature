Feature: Creates Curriculums

  @DeleteCurriculum @Logout @Acceptance @Curriculum
  Scenario: Create a curriculum with the minimum data required
    Given the user goes to login page
    And the user puts his username and password
    When the user navigates to CV summary page
    And the user fill the datas in the first form page with the following characteristics
      | Nombre              | Pedro         |
      | Apellido            | Perez Pereira |
      | Celular             | 47436272      |
      | Documento           | Pasaporte     |
      | Numero documento    | 47385675      |
      | Fecha de nacimiento | 25-12-1980    |
      | Direccion           | Av Bolivia    |
      | Estado civil        | Soltero(a)    |
    And the user fill the datas in the second form page with the following characteristics
      | Cargo en la empresa  | Ingeniero  |
      | Nombre de la empresa | Test S.A.  |
      | País                 | Bolivia    |
      | Ciudad               | cochabamba |
      | Fecha de Inicio      | 1-10-1999  |
      | Fecha de Fin         | 31-10-2003 |
    And the user fill the datas in the third form page with the following characteristics
      | Colegio o Institución          | Estenssoro               |
      | Nivel de Estudio               | Bachiller en Humanidades |
      | País                           | Bolivia                  |
      | Ciudad                         | Cochabamba               |
      | Fecha de Inicio del colegio    | 1-10-1999                |
      | Fecha de Fin del colegio       | 31-10-2003               |
      | Universidad o Institución      | UMSS                     |
      | Carrera, Curso o Seminario     | Ingenieria               |
      | Nivel de Estudio Universitario | Licenciatura             |
      | País Universidad               | Bolivia                  |
      | Ciudad Universidad             | Cochabamba               |
      | Fecha de Inicio Universidad    | 1-10-2004                |
      | Fecha de Fin Universidad       | 31-10-2010               |
      | Idioma                         | Inglés                   |
      | Nivel Escrito                  | Avanzado                 |
      | Nivel Oral                     | Avanzado                 |
      | Nivel Lectura                  | Avanzado                 |
    And the user fill the datas in the four form page with the following characteristics
      | Título                    | Ingeniero de Software                    |
      | Categoría                 | Ingeniería                               |
      | Contrato                  | full time                                |
      | Pretensión Salarial (Bs.) | 20000                                    |
      | País de residencia        | Bolivia                                  |
      | Ciudad actual             | Cochabamba                               |
      | Privacidad del Currículum | Solamente las empresas a las que Postulo |
    Then the curriculum is created with and the following basic information is displayed in the curriculum page
    And the curriculum with the following user language information is displayed in the results page
    And the curriculum with the following user work experience information is displayed in the results page