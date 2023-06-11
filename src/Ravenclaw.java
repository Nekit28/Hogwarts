public class Ravenclaw extends Hogwarts{
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int powerMagic, int transgression, int intelligence, int wisdom, int wit, int creativity) {
        super(name, powerMagic, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    int calculateSpecificScore() {
        return this.intelligence + this.wisdom + this.wit + this.creativity;
    }
    @Override
    void printCompareOfStudents(Hogwarts best, Hogwarts worst) {
        System.out.println(String.format("%s лучший Когтевранец, чем %s", best.getName(), worst.getName()));
    }

    @Override
    public String toString() {
        return "Ravenclaw: " + super.toString() +
                ", Ум - " + intelligence +
                ", Мудрость - " + wisdom +
                ", Остроумие - " + wit +
                ", Творчесво - " + creativity;
    }
}
