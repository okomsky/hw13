public class Main {
    public static void main(String[] args) {

        GryffindorStudent potter = new GryffindorStudent("Гарри Поттер", 40, 30, 30, 30, 30);
        GryffindorStudent granger = new GryffindorStudent("Гермиона Грейнджер", 35, 40, 25, 30, 20);
        GryffindorStudent weasley = new GryffindorStudent("Рон Уизли", 30, 25, 20, 30, 25);
        SlytherinStudent malfoy = new SlytherinStudent("Драко Малфой", 30, 20, 15, 15, 15, 15, 15);
        SlytherinStudent montague = new SlytherinStudent("Грэхэм Монтегю", 25, 10, 10, 10, 10, 10, 10);
        SlytherinStudent goyle = new SlytherinStudent("Грегори Гойл", 25, 10, 10, 10, 10, 10, 10);
        HufflepuffStudent diggory = new HufflepuffStudent("Седрик Диггори", 40, 30, 30, 30, 30);
        HufflepuffStudent smith = new HufflepuffStudent("Захария Смит", 35, 40, 25, 35, 20);
        HufflepuffStudent finchFletchley = new HufflepuffStudent("Джастин Финч-Флетчли", 30, 25, 20, 30, 25);
        RavenclawStudent chang = new RavenclawStudent("Чжоу Чанг", 35, 25, 24, 19, 22, 25);
        RavenclawStudent patil = new RavenclawStudent("Падма Патил", 25, 15, 20, 15, 20, 20);
        RavenclawStudent belby = new RavenclawStudent("Маркус Белби", 25, 15, 24, 20, 25, 5);

        weasley.comparisonOfWizards(goyle);
        System.out.println(potter);
        System.out.println(malfoy);
        System.out.println(diggory);
        System.out.println(chang);
        potter.characterComparison(granger);
        diggory.characterComparison(smith);
        belby.characterComparison(chang);
        malfoy.characterComparison(montague);
    }
}