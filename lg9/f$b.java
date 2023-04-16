package lg9.f$b;
import com.kwai.gifshow.post.api.core.model.TakePictureType;
import java.lang.Enum;

public class f$b	// class@002de5
{
    public static final int[] a;

    static {
       int[] ointArray = new int[TakePictureType.values().length];
       try{
          f$b.a = ointArray;
          ointArray[TakePictureType.LIVE_AUTHENTICATE.ordinal()] = 1;
          try{
             f$b.a[TakePictureType.SEND_IMAGE.ordinal()] = 2;
             try{
                f$b.a[TakePictureType.MOMENT.ordinal()] = 3;
                try{
                   f$b.a[TakePictureType.PROFILE.ordinal()] = 4;
                   try{
                      f$b.a[TakePictureType.LIVE_ENTRY.ordinal()] = 5;
                      try{
                         f$b.a[TakePictureType.SHOOT_IMAGE.ordinal()] = 6;
                      }catch(java.lang.NoSuchFieldError e0){
                      }
                   }catch(java.lang.NoSuchFieldError e0){
                   }
                }catch(java.lang.NoSuchFieldError e0){
                }
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
