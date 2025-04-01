public class Personne implements Comparable<Personne>{
    String name;
    int numeroID;
    int age;

    public Personne(String name, int numeroID) {
        this.name = name;
        this.numeroID = numeroID;
        this.age=18;
    }

    public Personne(String name, int numeroID, int age) {
        this.name = name;
        this.numeroID = numeroID;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumeroID() {
        return numeroID;
    }

    public void setNumeroID(int numeroID) {
        this.numeroID = numeroID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "name='" + name + '\'' +
                ", numeroID=" + numeroID +
                ", age=" + age +
                '}';
    }



    @Override
    public int hashCode() {
        return numeroID;
    }


    @Override
    public int compareTo(Personne o) {
        return this.name.compareTo(o.name);
    }
}
