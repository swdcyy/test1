package dl9.m0$b;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import java.lang.Enum;

public class m0$b	// class@001f81
{
    public static final int[] a;

    static {
       int[] ointArray = new int[BubbleInterface$Position.values().length];
       try{
          m0$b.a = ointArray;
          ointArray[BubbleInterface$Position.BOTTOM.ordinal()] = 1;
          try{
             m0$b.a[BubbleInterface$Position.TOP.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
