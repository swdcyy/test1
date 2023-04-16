package pf.c$a;
import android.graphics.Bitmap$Config;

public class c$a	// class@00291b
{
    public static final int[] a;

    static {
       int[] ointArray = new int[Bitmap$Config.values().length];
       try{
          c$a.a = ointArray;
          ointArray[Bitmap$Config.ALPHA_8.ordinal()] = 1;
          try{
             c$a.a[Bitmap$Config.RGB_565.ordinal()] = 2;
             try{
                c$a.a[Bitmap$Config.HARDWARE.ordinal()] = 3;
                try{
                   c$a.a[Bitmap$Config.RGBA_F16.ordinal()] = 4;
                   try{
                      c$a.a[Bitmap$Config.ARGB_8888.ordinal()] = 5;
                      try{
                         c$a.a[Bitmap$Config.ARGB_4444.ordinal()] = 6;
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
