package com.example.login;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class LogInView extends VerticalLayout implements View {
	protected static final String name = "logIn";

	private TextField textField;
	private Button logged;
	private Label names;

	 

	 
	 

	
	@Override
	public void enter(ViewChangeEvent event) {
		textField = new TextField("Hello");
		logged = new Button("", new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				names = new Label((String) VaadinSession.getCurrent()
						.getAttribute("users"));

			}
		});

		addComponents(textField, names);
	}
	
}
