package com.example.login;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

@SuppressWarnings("serial")
@Theme("login")
public class LoginUI extends UI {

	Navigator navigator;
	protected static final String LogInView="logIn"; 
	protected static final String RegisterView="register"; 
	protected static final String StartView="start"; 
	
	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = LoginUI.class)
	public static class Servlet extends VaadinServlet {
	}
 
	@Override
	protected void init(VaadinRequest request) {
		getPage().setTitle("LogIn Page");
		
		navigator=new Navigator(this,this);
		
		navigator.addView(LogInView,new LogInView());
		navigator.addView(RegisterView,new RegisterView());
		navigator.addView(StartView,new StartView());
		navigator.navigateTo(StartView);
		
		/*final VerticalLayout layout = new VerticalLayout();
		layout.setMargin(true);
		
		TextField username=new TextField("UserName");
		TextField password=new TextField("Password");
		
		setContent(layout);

		HorizontalLayout LogReg=new HorizontalLayout();
		
		Button registerButton=new Button("Register");
		registerButton.addStyleName(ValoTheme.BUTTON_BORDERLESS);
		
		Button logInButton = new Button("LogIn");
		
		LogReg.addComponents(registerButton,logInButton);
		
	   // LogReg.setMargin(true);
	    LogReg.setSpacing(true); 
	    //LogReg.setSizeFull();
		//logInButton.addStyleName(ValoTheme.BUTTON_ICON_ALIGN_RIGHT);
		
		logInButton.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				layout.addComponent(new Label("Thank you for clicking"));
			}
		});
		layout.addComponents(username,password,LogReg);
		layout.setSpacing(true);
	}*/
	}
}