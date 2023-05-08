package Tourists;

import Locations.Boracay;
import Locations.Locations;
import Locations.Bicol;
import Locations.Batangas;
import Locations.Ifugao;
import Locations.Samar;
import Locations.Davao;

public interface Tourist {

    int budget = 2000;

    void visit();

    void visit(Boracay boracay);

    void visit(Batangas batangas);

    void visit(Bicol bicol);

    void visit(Ifugao ifugao);

    void visit(Samar samar);

    void visit(Davao davao);

    default void visit(Locations locations) {
        System.out.println("Arrived on destination");
    };

    void checkBudget();
}
