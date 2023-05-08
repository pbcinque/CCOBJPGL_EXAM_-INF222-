import Locations.*;
import Tourists.*;



public class App {
    public static void main(String[] args) throws Exception {

        Locations Batangas = new Batangas();
        Locations Boracay = new Boracay();
        Locations Bicol = new Bicol();
        Locations Ifugao = new Ifugao();
        Locations Samar = new Samar();
        Locations Davao = new Davao();

        Tourist Phoebe = new Phoebe();

        Boracay.accept(Phoebe);
        Batangas.accept(Phoebe);
        Bicol.accept(Phoebe);
        Ifugao.accept(Phoebe);
        Samar.accept(Phoebe);
        Davao.accept(Phoebe);



    }
}