public class Slytherin extends Hogwarts {
    private int canning;
    private int determination;
    private int ambition;
    private int power;

    public Slytherin(String name, int powerMagic, int transgression, int canning, int determination, int ambition, int power) {
        super(name, powerMagic, transgression);
        this.canning = canning;
        this.determination = determination;
        this.ambition = ambition;
        this.power = power;
    }

    public int getCanning() {
        return canning;
    }

    public void setCanning(int canning) {
        this.canning = canning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Слизерин: " + " Имя - " + getName() + ", Сила магии - " + getPowerMagic() + ", Трансгрессия - " + getTransgression() +
                ", Хитрость - " + canning +
                ", Решительность - " + determination +
                ", Амбициозность - " + ambition +
                ", Власть - " + power;
    }
}
