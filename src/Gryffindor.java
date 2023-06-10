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
    public String toString() {
        return "Гриффиндор: " + "Имя - " + getName() + ", Сила магии - " + getPowerMagic() + ", Трансгрессия - " + getTransgression() +
                ", Благородство - " + nobility +
                ", Честь - " + honor +
                ", Храбрость - " + bravery ;
    }
}
