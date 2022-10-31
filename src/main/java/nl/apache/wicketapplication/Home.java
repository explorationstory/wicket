package nl.apache.wicketapplication;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.form.AjaxFormChoiceComponentUpdatingBehavior;
import org.apache.wicket.ajax.form.AjaxFormComponentUpdatingBehavior;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.ChoiceRenderer;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.FormComponentUpdatingBehavior;
import org.apache.wicket.markup.html.form.IChoiceRenderer;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

import java.util.List;

public class Home extends WebPage {
    String defaultValue = getChoice();

    private String getChoice() {
        return "choice 1";
    }

    public Home() {
        add(new Label("welcome", "Lastige shit"));

//        List<String> choices = List.of("choice 1", "choice 2","");

        SoortBeslag selectedChoice = new SoortBeslag(BeslagType.EERDER);

        List<String> choices = List.of(new SoortBeslag(BeslagType.EERDER).getSoortBeslag(),
                new SoortBeslag(BeslagType.NIEUW).getSoortBeslag());

        Model model = new Model(selectedChoice.getSoortBeslag());

        DropDownChoice<String> dropDownChoice= new DropDownChoice<String>("dropdown" , model,choices) {

        };

        this.add(dropDownChoice);




//        add(dropDownChoice);

    }

    @Override
    protected void onInitialize() {
        super.onInitialize();

    }

}
