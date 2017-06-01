package com.example.login;


import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Layout;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
 
public class RegisterView extends FormLayout implements View{

	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
	/*FormLayout layout = new FormLayout();
    layout.setSpacing(false);
    layout.setMargin(false);
    layout.setCaption("Registration Form");*/

    TextField fullNameField = new TextField("Full Name");
    TextField emailField = new TextField("Email");
    PasswordField passwordField = new PasswordField("Password");
    PasswordField confirmPasswordField = new PasswordField("Confirm Password");
    
     //addC
    

}
