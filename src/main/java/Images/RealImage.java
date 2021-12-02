package Images;

public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    @Override
    public boolean display() {
        System.out.println("RealImage");
        return true;
    }

    public void loadFromDisk(){
        System.out.println("loading");
    }
}
