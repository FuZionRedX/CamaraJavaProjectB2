public class Ordinateur {

    private String marque;
    private String modele;
    private String processeur;
    private int ram;
    private int stockage;


    //Constructeur
    public Ordinateur(String marque, String modele, String processeur, int ram, int stockage) {
        this.marque = marque;
        this.modele = modele;
        this.processeur = processeur;
        this.ram = ram;
        this.stockage = stockage;
    }


    //Getteur
    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public String getProcesseur() {
        return processeur;
    }

    public int getRam() {
        return ram;
    }

    public int getStockage() {
        return stockage;
    }


    //Setteur
    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setProcesseur(String processeur) {
        this.processeur = processeur;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setStockage(int stockage) {
        this.stockage = stockage;
    }


    public void afficherInfo(){
        System.out.println("Détail de l'ordinateur: "+ marque);
        System.out.println("Modele: "+ modele);
        System.out.println("Processeur: "+ processeur);
        System.out.println("Ram: "+ ram + "Go");
        System.out.println("Stockage: "+ stockage + "Go");
    }
}
