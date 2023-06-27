public abstract class HogwartsStudent {
    private final String name;
    private final int magicPower;
    private final int transgressionDistance;



    public HogwartsStudent(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    private int getWizardAbilities() {
        return magicPower + transgressionDistance;
    }

    public void comparisonOfWizards(HogwartsStudent another) {
        if (this.getWizardAbilities() > another.getWizardAbilities()) {
            System.out.println(this.getName() + " могущественее чем " + another.getName());
        } else if (this.getWizardAbilities() < another.getWizardAbilities()) {
            System.out.println(another.getName() + " могущественее чем " + this.getName());
        } else {
            System.out.println("Волшебники одинаково могущественны");
        }
    }
    @Override
    public String toString() {
        return this.getName() + " имеет силу магии " + getMagicPower() + ", расстояение трансгрессии " + getTransgressionDistance();
    }
}
