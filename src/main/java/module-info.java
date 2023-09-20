module javafx {


    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    requires lombok;
    requires org.apache.logging.log4j;


    requires jakarta.inject;
    requires jakarta.cdi;
    requires io.vavr;

    exports ui.main to javafx.graphics;

    exports ui.screens.login;

    exports dao.impl;

    opens ui.screens.login;
    opens ui.screens.principal;
    opens ui.main;
    opens css;
    opens fxml;
    opens services;
    opens common;
}