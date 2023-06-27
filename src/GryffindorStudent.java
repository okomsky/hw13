public class GryffindorStudent extends HogwartsStudent {
    private int nobility;
    private int honor;
    private int bravery;



    public GryffindorStudent(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }


    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return super.toString() + ", благородство " + nobility + ", честь " + honor + ", храбрость " + bravery;
    }

    private int getCharacteristic() {
        return nobility + honor + bravery;
    }

    public void characterComparison(GryffindorStudent another) {
        if (this.getCharacteristic() > another.getCharacteristic()) {
            System.out.println(this.getName() + " лучший студент Гриффиндора чем " + another.getName());
        } else if (this.getCharacteristic() < another.getCharacteristic()) {
            System.out.println(another.getName() + " лучший студент Гриффиндора чем " + this.getName());
        } else {
            System.out.println("Студенты одинаково успешны");
        }
    }
}
