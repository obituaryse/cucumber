package org.umssdiplo.automationv01.core.managepage.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.dialogo.Persona;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

import java.util.Date;

public class Login extends BasePage {
    @FindBy(name = "email")
    private WebElement usernameInputField;

    @FindBy(name = "password")
    private WebElement passwordInputField;

    @FindBy(css = ".btn-primary.btn-block")
    private WebElement loginBtn;

    @FindBy(id = "botonPress")
    private WebElement botonCrear;

    @FindBy(name = "detalle")
    private WebElement detalleField;

    @FindBy(name = "fecha")
    private WebElement fecha;

    @FindBy(id = "crearAcci")
    private WebElement botonCrearAcci;
    @FindBy(id = "personas")
    private WebElement personas;
    @FindBy(id = "crearPersona")
    private WebElement crearPersona;

    @FindBy(name = "nombres")
    private WebElement nombres;
    @FindBy(name = "apellidos")
    private WebElement apellidos;
    @FindBy(name = "telefono")
    private WebElement telefono;
    @FindBy(name = "direccion")
    private WebElement direccion;
    @FindBy(name = "email")
    private WebElement email;
    @FindBy(name = "gridRadiosMA")
    private WebElement gridRadiosMA;
    @FindBy(name = "nacimiento")
    private WebElement nacimiento;
    @FindBy(name = "ci")
    private WebElement ci;
    @FindBy(name = "nacionalidad")
    private WebElement nacionalidad;
    @FindBy(id = "finalizarRegistro")
    private WebElement finalizarRegistro;

    @FindBy(id = "actualizar2")
    private WebElement actualizar2;
    @FindBy(id = "actualizarRegistro")
    private WebElement actualizarRegistro;

    @FindBy(id = "eliminar2")
    private WebElement eliminar2;

    public void setCredentials() {
        String username = PropertyAccessor.getInstance().getUser();
        String password = PropertyAccessor.getInstance().getPassword();
        System.out.println(username);
        System.out.println(password);
        CommonEvents.setInputField(usernameInputField, username);
        CommonEvents.setInputField(passwordInputField, password);
        CommonEvents.clickButton(loginBtn);
    }

    public void clickRegistrarAccidenteTab() {
        Date asd = new Date();
        CommonEvents.clickButton(botonCrear);
        CommonEvents.setInputField(fecha,"12/12/20191");
        CommonEvents.setInputField(detalleField,"detalle de cucumber");
        //CommonEvents.clickButton(botonCrearAcci);
    }
    public void clickRegistrarPersona() {
        CommonEvents.clickButton(personas);
        CommonEvents.clickButton(crearPersona);
    }
    public void registrarFormularioPersona() {
        CommonEvents.setInputField(nombres,"selenium");
        CommonEvents.setInputField(apellidos," morales");
        CommonEvents.setInputField(telefono,"123456");
        CommonEvents.setInputField(direccion,"temporal calle 10");
        CommonEvents.setInputField(email,"morales@gmail.com");
        CommonEvents.clickButton(gridRadiosMA);
        CommonEvents.setInputFieldDate(nacimiento,"19091990");
        CommonEvents.setInputField(ci,"66666");
        CommonEvents.setInputField(nacionalidad,"Bolivia");
        CommonEvents.clickButton(finalizarRegistro);
    }
    public void registrarFormularioPersona(Persona p) {
        CommonEvents.setInputField(nombres,p.nombres);
        CommonEvents.setInputField(apellidos,p.apellidos);
        CommonEvents.setInputField(telefono,p.telefono);
        CommonEvents.setInputField(direccion,p.direccion);
        CommonEvents.setInputField(email,p.email);
        CommonEvents.clickButton(gridRadiosMA);
        CommonEvents.setInputFieldDate(nacimiento,p.nacimiento);
        CommonEvents.setInputField(ci,p.ci);
        CommonEvents.setInputField(nacionalidad,p.nacionalidad);
        CommonEvents.clickButton(finalizarRegistro);
    }
    public void clickActualizarPersona() {
        CommonEvents.clickButton(personas);
        CommonEvents.clickButton(actualizar2);
    }
    public void actualizarFormularioPersona(String nombre) {
        CommonEvents.setInputField(nombres,nombre);
        CommonEvents.clickButton(actualizarRegistro);
    }
    public void eliminarPersona(int argumento) {
        System.out.println("el arugmentod jejje"+argumento);
        CommonEvents.clickButton(personas);
        //CommonEvents.clickButton(eliminar2);
    }
}
