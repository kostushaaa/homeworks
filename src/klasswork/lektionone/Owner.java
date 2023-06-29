package klasswork.lektionone;

public class Owner {
    private Cat cat;

    public Owner(Cat cat) {
        this.cat = cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Cat getCat() {
        return cat;
    }
}
