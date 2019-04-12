package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.umssdiplo.automationv01.core.managepage.Login.Isocode;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.dialogo.Persona;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private Login login;
    private Isocode isocode;

    @Given("^'PHP travel' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentials();
    }

    @And("^click 'Registrar Accidente' tab in 'header' page$")
    public void clickRegistrarAccidenteTabInHeaderPage() throws Throwable  {
        login.clickRegistrarAccidenteTab();
    }

    @Given("^registro de una persona a traves de interfaz$")
    public void registroDeUnaPersonaATravesDeInterfaz() {
        login = LoadPage.loginPage();
        login.clickRegistrarPersona();
    }

    @And("^ingresar a interfaz de registro$")
    public void ingresarAInterfazDeRegistro() {
    }

    @And("^registrar formulario$")
    public void registrarFormulario() {
        login.registrarFormularioPersona();
    }

    @Given("^actualizacion de una persona por interfaz$")
    public void actualizacionDeUnaPersonaPorInterfaz() {
        login = LoadPage.loginPage();
        
    }

    @And("^ingreasr a interfaz de actualizacion$")
    public void ingreasrAInterfazDeActualizacion() {
        login.clickActualizarPersona();
    }

    @And("^realizar la actualizacion$")
    public void realizarLaActualizacion() {
     //   login.actualizarFormularioPersona();
    }

    @Given("^eliminar a la persona por interfaz$")
    public void eliminarAUnaPersonaPorInterfaz() {
        login = LoadPage.loginPage();
    }

    @And("^realizar la eliminacion$")
    public void realizarLaEliminacion() {

        //login.eliminarPersona();
    }

    @And("^realizar la eliminacion de la persona '(\\d+)'$")
    public void realizarLaEliminacionDeLaPersona(int arg0) {
        login.eliminarPersona(arg0);
    }

    @And("^asjsjsjsjjs 'asdf' yy '(\\d+)' hhh \"([^\"]*)\"$")
    public void asjsjsjsjjsAsdfYyHhh(int arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^verificar que el registro fue exitoso$")
    public void verificarQueElRegistroFueExitoso() {

    }

    @And("^registrar formulario con los datos \"([^\"]*)\"$")
    public void registrarFormularioConLosDatos(String persona) throws Throwable {
        Persona p = new Persona();
        p.setNombres(persona);
        p.setApellidos("morales");
        p.setDireccion("temporal calle 10");
        p.setEmail("personaUno@gmail.com");
        p.setNacimiento("19091990");
        p.setNacionalidad("Bolivia");
        p.setTelefono("67504804");
        p.setCi("5165165");
        login.registrarFormularioPersona(p);
        throw new PendingException();
    }

    @And("^realizar la actualizacion del nombre por \"([^\"]*)\"$")
    public void realizarLaActualizacionDelNombrePor(String arg0) throws Throwable {
        login.actualizarFormularioPersona(arg0);
        throw new PendingException();
    }
}
