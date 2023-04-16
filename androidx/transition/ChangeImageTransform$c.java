package androidx.transition.ChangeImageTransform$c;
import android.widget.ImageView$ScaleType;

public class ChangeImageTransform$c	// class@0009b3
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ImageView$ScaleType.values().length];
       try{
          ChangeImageTransform$c.a = ointArray;
          ointArray[ImageView$ScaleType.FIT_XY.ordinal()] = 1;
          try{
             ChangeImageTransform$c.a[ImageView$ScaleType.CENTER_CROP.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
