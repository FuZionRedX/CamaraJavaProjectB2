//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestStock {
    public static void main(String[] args) {

        Ordinateur o1 = new Ordinateur("Asus", "F17", "intel i7", 32, 1000);
        Ordinateur o2 = new Ordinateur("Apple", "Macbook Air", "puce M2", 32, 1000);
        Ordinateur o3 = new Ordinateur("Apple", "McIntosh", "MX123", 1, 128);
        Ordinateur o4 = new  Ordinateur("Acer", "Aspire 14", "intel i7", 16, 512);

        Stock stock = new Stock(5);

        stock.ajouterOrdinateur(o1);
        stock.ajouterOrdinateur(o2);
        stock.ajouterOrdinateur(o3);
        stock.ajouterOrdinateur(o4);

        stock.afficherStock();

        System.out.println("Rechercher un ordinateur\n");
        Ordinateur recherche = stock.rechercherOrdinateur("Apple", "McIntosh");
        if  (recherche != null) {
            System.out.println("Information de l'ordinateur récupérée avec Succès !");
            recherche.afficherInfo();
        }else  {
            System.out.println("Erreur, l'ordinateur ne figure pas dans le stock !");
        }

        System.out.println("Supprimer un ordinateur\n");
        stock.suprrimerOrdinateur("Acer", "Aspire 14");

        stock.afficherStock();

    }
}