package nl.apache.wicketapplication;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.DropDownChoice;

public class HelloWicket extends WebPage {

    public HelloWicket() {
        add(new Label("welcome", "Welcome to Wicket!"));


    }

}
