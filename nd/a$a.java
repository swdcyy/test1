package nd.a$a;
import android.graphics.Bitmap$Config;

public class a$a	// class@0026ed
{
    public static final int[] a;

    static {
       int[] ointArray = new int[Bitmap$Config.values().length];
       try{
          a$a.a = ointArray;
          ointArray[Bitmap$Config.ARGB_8888.ordinal()] = 1;
          try{
             a$a.a[Bitmap$Config.ALPHA_8.ordinal()] = 2;
             try{
                a$a.a[Bitmap$Config.ARGB_4444.ordinal()] = 3;
                try{
                   a$a.a[Bitmap$Config.RGB_565.ordinal()] = 4;
                   try{
                      a$a.a[Bitmap$Config.RGBA_F16.ordinal()] = 5;
                      try{
                         a$a.a[Bitmap$Config.HARDWARE.ordinal()] = 6;
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
