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


    @Then("^verificar que el registro fue exitoso$")
    public void verificarQueElRegistroFueExitoso() {
        isocode.verificarElRegistro();
    }


    @And("^realizar la actualizacion del nombre por \"([^\"]*)\"$")
    public void realizarLaActualizacionDelNombrePor(String arg0) throws Throwable {
        login.actualizarFormularioPersona(arg0);
        throw new PendingException();
    }

}
