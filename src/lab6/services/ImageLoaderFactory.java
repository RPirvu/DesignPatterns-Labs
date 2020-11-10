package lab6.services;
import lab6.services.JPGImageLoader;

public class ImageLoaderFactory implements ImageLoader {

    ImageLoaderFactory() { }

    @Override
    public void load(String path) {
        if(path.endsWith(".png")) {
            new PNGImageLoader(path); 
        }
        else if(path.endsWith(".jpg")) {
            new JPGImageLoader(path);
        }
        else if(path.endsWith(".bmp")) {
            new BMPImageLoader(path); 
        }
        else {
           System.out.println("Wrong picture format.");
        }
     
    }


}
