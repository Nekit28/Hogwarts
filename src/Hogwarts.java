import java.util.Objects;

public abstract class Hogwarts {
    private String name;
    private int powerMagic;
    private int transgression;

    public Hogwarts(String name, int powerMagic, int transgression) {
        this.name = name;
        this.powerMagic = powerMagic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    abstract int calculateSpecificScore();
    abstract void printCompareOfStudents(Hogwarts best, Hogwarts worst);
    private int calculateGeneralScore() {
        return this.powerMagic + transgression;
    }

    public void compare(Hogwarts hogwarts) {
        if (this.getClass().equals(hogwarts.getClass())) {
            this.compareBySpecific(hogwarts);
        } else {
            this.compareByGeneral(hogwarts );
        }
    }

    private void compareBySpecific(Hogwarts hogwarts) {
        int thisScore = this.calculateGeneralScore() + this.calculateGeneralScore();
        int otherScore = hogwarts.calculateGeneralScore() + hogwarts.calculateSpecificScore();

        if (thisScore > otherScore) {
            printCompareOfStudents(this, hogwarts);
        } else if (thisScore < otherScore) {
           printCompareOfStudents(hogwarts, this);
        } else {
            System.out.println("Ученики равны по силе");
        }

    }

   private void compareByGeneral(Hogwarts hogwarts) {
        int thisScore = this.calculateGeneralScore();
        int otherScore = hogwarts.calculateGeneralScore();
        if (thisScore > otherScore) {
            System.out.println(String.format("Ученик %s сильнее ученика %s", this.name, hogwarts.name));
        } else if (thisScore < otherScore) {
            System.out.println(String.format("Ученик %s сильнее ученика %s", hogwarts.name, this.name));
        } else {
            System.out.println("Ученики равны по силе");
        }
    }


    @Override
    public String toString() {
        return
                "Имя - " + name +
                ", Сила магии - " + powerMagic +
                ", Трансгрессия - " + transgression;
    }
}
