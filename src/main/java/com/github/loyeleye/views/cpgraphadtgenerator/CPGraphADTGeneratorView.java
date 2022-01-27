package com.github.loyeleye.views.cpgraphadtgenerator;

import com.github.loyeleye.views.MainLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("About")
@Route(value = "home", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class CPGraphADTGeneratorView extends VerticalLayout {

    public CPGraphADTGeneratorView() {
        setSpacing(false);

        Image img = new Image("images/anim.gif", "placeholder plant");
        img.setWidth("200px");
        add(img);

        add(new H2("Graph Abstract Data Structure Generator"));
        add(new Paragraph("Generate a graph that you can use for your toy / competitive programming problems 🤗"));

        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }

}
