package com.example.login;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

public class StartView extends VerticalLayout implements View{
	
	protected static final String RegisterView="register"; 
	
	Navigator navigator;
	public StartView() {
		
	    setWidth(null);
	    setSizeFull();
	    setMargin(true);
	    
	    Label LableLogIn=new Label("");
		
		TextField username=new TextField("UserName");
		username.setRequired(true);
		username.setInputPrompt("UserName");
		//username.addValidator(new EmailValidator("@email"));
		
		PasswordField  password=new PasswordField("Password");
		password.setRequired(true);
		password.setInputPrompt("");

		
	   /* VerticalLayout uspa=new VerticalLayout();
	    uspa.addComponents(LableLogIn,uspassForm);*/
	   
	   // uspass.setComponentAlignment(username, Alignment.BOTTOM_RIGHT);
		
		Button registerButton=new Button("Register",new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
			//	Notification.show(username.getValue()); 
				 navigator.navigateTo(RegisterView);
				}
		});
		registerButton.addStyleName(ValoTheme.BUTTON_BORDERLESS);
		
		Button logInButton = new Button("LogIn",new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				VaadinSession.getCurrent().setAttribute("users",username);
				UI.getCurrent().getNavigator().navigateTo(LogInView.name);
				//VaadinSession.getCurrent().getAttribute("user").toString();
				//getSession().setAttribute("user",username);
				//VaadinService.getCurrentRequest().getWrappedSession()
               //.setAttribute("user",username);
				
				
			}
		});
		
		HorizontalLayout LogReg=new HorizontalLayout();
		LogReg.addComponents(registerButton,logInButton);
		
		FormLayout uspassForm=new FormLayout();
	    uspassForm.addComponents(username,password,LogReg);
	    
	    HorizontalLayout withLabel=new HorizontalLayout();
	    withLabel.addComponents(uspassForm,LableLogIn);
	    
	  /*  addComponent(uspassForm);
	    setComponentAlignment(uspassForm, Alignment.MIDDLE_CENTER);*/
		 
	    
		addComponent(withLabel);
		
		setComponentAlignment(withLabel, Alignment.MIDDLE_CENTER);
		 
		setSpacing(false);
		 
		
		setSizeFull();
		
		//setComponentAlignment(LogReg,Alignment.MIDDLE_CENTER);
		//VerticalLayout form=new VerticalLayout();
		
		
		//setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
		//form.addComponents(uspass,LogReg);
		 
		
		
	  // addComponent(form);
      //  setSizeFull();
     // setComponentAlignment(uspass, Alignment.MIDDLE_CENTER);
       // setStyleName(Reindeer.LAYOUT_BLUE);
       // setCompositionRoot(form);
		
		
	    
	   // LogReg.setSpacing(true); 
	
	}
		
		/*logInButton.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				layout.addComponent(new Label("Thank you for clicking"));
			}
		});
		layout.addComponents(username,password,LogReg);
		layout.setSpacing(true);
	}
*/
	@Override
	public void enter(ViewChangeEvent event) {
		 
		Notification.show("Start View");
	}

}
