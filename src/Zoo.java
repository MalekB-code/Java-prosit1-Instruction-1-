public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;


    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
public void displayZoo() {
    System.out.println("Zoo Name: " + name);
    System.out.println("City: " + city);
    System.out.println("Number of Cages: " + nbrCages);
}
    // la méthode toString de la classe objet et utilisée automatiquement et par défaut elle nous donne cette sorte de id et la on va la " override " pour
    @Override
    public String toString() {
        return "Zoo Name: " + name + "\nCity: " + city + "\nNumber of Cages: " + nbrCages;
    }

}