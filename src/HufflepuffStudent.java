public class HufflepuffStudent extends HogwartsStudent{
    private int diligence;
    private int loyalty;
    private int honestly;



    public HufflepuffStudent(String name, int magicPower, int transgressionDistance, int diligence, int loyalty, int honestly) {
        super(name, magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honestly = honestly;
    }


    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonestly() {
        return honestly;
    }
    @Override
    public String toString() {
        return super.toString() + ", трудолюбие " + diligence + ", верность " + loyalty + ", честность " + honestly;
    }


    private int getCharacteristic() {
        return diligence + loyalty + honestly;
    }

    public void characterComparison(HufflepuffStudent another) {
        if (this.getCharacteristic() > another.getCharacteristic()) {
            System.out.println(this.getName() + " лучший студент Пуффендуя чем " + another.getName());
        } else if (this.getCharacteristic() < another.getCharacteristic()) {
            System.out.println(another.getName() + " лучший студент Пуффендуя чем " + this.getName());
        } else {
            System.out.println("Студенты одинаково успешны");
        }
    }
}
