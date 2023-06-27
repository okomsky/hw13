public class SlytherinStudent extends HogwartsStudent {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness ;
    private int thirstForPower;


    public SlytherinStudent(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }


    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    @Override
    public String toString() {
        return super.toString() + ", хитрость " + cunning + ", решительность " + determination + ", амбициозность  " + ambition + ", находчивость  " + resourcefulness + ", жажда власти " + thirstForPower;
    }


    private int getCharacteristic() {
        return cunning + determination + ambition + resourcefulness + thirstForPower;
    }

    public void characterComparison(SlytherinStudent another) {
        if (this.getCharacteristic() > another.getCharacteristic()) {
            System.out.println(this.getName() + " лучший студент Слизерина чем " + another.getName());
        } else if (this.getCharacteristic() < another.getCharacteristic()) {
            System.out.println(another.getName() + " лучший студент Слизерина чем " + this.getName());
        } else {
            System.out.println("Студенты одинаково успешны");
        }
    }
}
