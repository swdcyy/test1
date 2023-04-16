package d6a.i$a;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import java.lang.Enum;

public class i$a	// class@001e9d
{
    public static final int[] a;

    static {
       int[] ointArray = new int[SlideMediaType.values().length];
       try{
          i$a.a = ointArray;
          ointArray[SlideMediaType.LIVE.ordinal()] = 1;
          try{
             i$a.a[SlideMediaType.PHOTO.ordinal()] = 2;
             try{
                i$a.a[SlideMediaType.VIDEO.ordinal()] = 3;
                try{
                   i$a.a[SlideMediaType.AUTO_MODE.ordinal()] = 4;
                   try{
                      i$a.a[SlideMediaType.IGNORE_STANDARD_LIVE.ordinal()] = 5;
                      try{
                         i$a.a[SlideMediaType.ALL.ordinal()] = 6;
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
