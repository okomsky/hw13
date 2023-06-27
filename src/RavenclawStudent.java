public class RavenclawStudent extends HogwartsStudent{
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;


    public RavenclawStudent(String name, int magicPower, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }


    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return super.toString() + ", ум " + intelligence + ", мудрость " + wisdom + ", остроумие  " + wit + ", креативность " + creativity;
    }

    private int getCharacteristic() {
        return intelligence + wisdom + wit +creativity;
    }

    public void characterComparison(RavenclawStudent another) {
        if (this.getCharacteristic() > another.getCharacteristic()) {
            System.out.println(this.getName() + " лучший студент Когтеврана чем " + another.getName());
        } else if (this.getCharacteristic() < another.getCharacteristic()) {
            System.out.println(another.getName() + " лучший студент Когтеврана чем " + this.getName());
        } else {
            System.out.println("Студенты одинаково успешны");
        }
    }
}
