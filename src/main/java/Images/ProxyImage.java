package Images;

public class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName(){
        return this.fileName;
    }

    @Override
    public boolean display() {
        System.out.println("ProxyImage");
        return true;
    }
}
