import java.util.List;

public class Animals {
    private List<String> mammal;
    private List<String> reptile;
    private List<String> bird;
    private List<String> amphibian;
    private List<String> fish;

    public List<String> getMammal() {
        return mammal;
    }

    public void setMammal(List<String> mammal) {
        this.mammal = mammal;
    }

    public void setAmphibian(List<String> amphibian) {
        this.amphibian = amphibian;
    }

    public List<String> getReptile() {
        return reptile;
    }

    public void setReptile(List<String> reptile) {
        this.reptile = reptile;
    }

    public List<String> getBird() {
        return bird;
    }

    public void setBird(List<String> bird) {
        this.bird = bird;
    }

    public List<String> getAmphibian() {
        return amphibian;
    }

    public void setFish(List<String> fish) {
        this.fish = fish;
    }

    public List<String> getFish() {
        return fish;
    }
}
