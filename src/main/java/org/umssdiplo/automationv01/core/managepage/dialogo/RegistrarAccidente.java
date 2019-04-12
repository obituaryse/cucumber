package org.umssdiplo.automationv01.core.managepage.dialogo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class RegistrarAccidente extends BasePage {
    @FindBy(xpath = "//mat-dialog-container")
    private WebElement containerDialog;

    public RegistrarAccidente(){
        CommonEvents.waitWebElementVisible(containerDialog);
    }

    public void insertProjectName(){

    }
}
