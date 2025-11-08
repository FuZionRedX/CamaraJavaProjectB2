public class Stock {

    private Ordinateur[] ordinateurs;
    private int nb_ordinateurs;

    public Stock(int taille){
        ordinateurs = new Ordinateur[taille];
        nb_ordinateurs=0;
    }

    //Methode ajouterOrdinateur : compare le nombre d'ordi avec la taille du tableau puis ajoute les info dans le
    // tableau si y'a la place
    public void ajouterOrdinateur(Ordinateur o){
        if (nb_ordinateurs<ordinateurs.length){
            ordinateurs[nb_ordinateurs] = o;
            nb_ordinateurs++;
            System.out.println("Ajout de l'ordinateur " + o.getMarque() + " " + o.getModele() + " réalisé avec succès ! ");
        }else {
            System.out.println("Ajout de l'ordinateur impossible, le stock est plein !");
        }
    }

    //Methode Afficher Stock: Verifie en premier si stock vide, utilise une boucle pour afficher les ordinateurs
    // en utilisant la methode afficherInfo() dans Ordinateur.java
    public void afficherStock(){
        if (nb_ordinateurs==0){
            System.out.println("Le stock est vide !");
            return;
        }
        System.out.println("Voici le détail du stock :\n");
        System.out.println("Nombre d'ordinateurs: "+nb_ordinateurs+"\n");

        for  (int i=0; i<nb_ordinateurs; i++){
            System.out.println("========================\n");
            System.out.println("Ordinateur n° "+(i+1)+"\n");
            ordinateurs[i].afficherInfo();
        }
    }

    public void suprrimerOrdinateur(String marque, String modele){

        int position = 1;

        for (int i = 0; i < nb_ordinateurs; i++) {
            if (ordinateurs[i].getMarque().equalsIgnoreCase(marque) && ordinateurs[i].getModele().equalsIgnoreCase(modele)){
                position = i;
                break;
            }
        }
        if (position != 1) {
            for  (int i = 0; i < nb_ordinateurs - 1; i++) {
                ordinateurs[i] = ordinateurs[i+1];
            }
            ordinateurs[nb_ordinateurs-1] = null;
            nb_ordinateurs--;
            System.out.println("Suppression de l'ordinateur effectuée avec succès !");
        }else {
            System.out.println("L'ordinateur demandé n'est pas présent dans le stock !");
        }
    }

    public Ordinateur rechercherOrdinateur(String marque, String modele) {
        for (int i = 0; i < nb_ordinateurs; i++) {
            if (ordinateurs[i].getMarque().equalsIgnoreCase(marque) &&
                    ordinateurs[i].getModele().equalsIgnoreCase(modele)) {
                return ordinateurs[i];
            }
        }
        return null;
    }


    //Methode rechercherStock :
    public Ordinateur rechercherStock(String marque, String modele) {

        for (int i = 0; i < nb_ordinateurs; i++) {
            if (ordinateurs[i].getMarque().equalsIgnoreCase(marque)&&ordinateurs[i].getModele().equalsIgnoreCase(modele)){
                return ordinateurs[i];
            }
        }
        return null;
    }

}
