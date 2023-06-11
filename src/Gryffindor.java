import java.util.Objects;

public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int powerMagic, int transgression, int nobility, int honor, int bravery) {
        super(name, powerMagic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    int calculateSpecificScore() {
        return this.nobility + this.honor + this.bravery;
    }

    @Override
    void printCompareOfStudents(Hogwarts best, Hogwarts worst) {
        System.out.println(String.format("%s лучший Гриффиндорец, чем %s", best.getName(), worst.getName()));
    }


    @Override
    public String toString() {
        return "Gryffindor: " + super.toString() +
                ", Благородство - " + nobility +
                ", честь - " + honor +
                ", Храбрость - " + bravery;
    }
}
