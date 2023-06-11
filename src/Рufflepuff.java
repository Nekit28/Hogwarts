public class Рufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Рufflepuff(String name, int powerMagic, int transgression, int diligence, int loyalty, int honesty) {
        super(name, powerMagic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    int calculateSpecificScore() {
        return this.diligence + this.honesty + this.loyalty;
    }
    @Override
    void printCompareOfStudents(Hogwarts best, Hogwarts worst) {
        System.out.println(String.format("%s лучший Пуффендуец, чем %s", best.getName(), worst.getName()));
    }



    @Override
    public String toString() {
        return "Рufflepuff:" + super.toString() +
                ", Трудолюбие - " + diligence +
                ", Верность - " + loyalty +
                ", Честность - " + honesty;
    }
}
