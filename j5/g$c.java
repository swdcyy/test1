package j5.g$c;
import com.airbnb.lottie.ex.model.DocumentData$Justification;
import java.lang.Enum;

public class g$c	// class@00222e
{
    public static final int[] a;

    static {
       int[] ointArray = new int[DocumentData$Justification.values().length];
       try{
          g$c.a = ointArray;
          ointArray[DocumentData$Justification.LEFT_ALIGN.ordinal()] = 1;
          try{
             g$c.a[DocumentData$Justification.RIGHT_ALIGN.ordinal()] = 2;
             try{
                g$c.a[DocumentData$Justification.CENTER.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
