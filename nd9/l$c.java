package nd9.l$c;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import java.lang.Enum;

public class l$c	// class@003149
{
    public static final int[] a;

    static {
       int[] ointArray = new int[CameraPageType.values().length];
       try{
          l$c.a = ointArray;
          ointArray[CameraPageType.VIDEO.ordinal()] = 1;
          try{
             l$c.a[CameraPageType.PHOTO.ordinal()] = 2;
             try{
                l$c.a[CameraPageType.LIVE_COVER.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
