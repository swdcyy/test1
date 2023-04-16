package c5.o$a;
import com.airbnb.lottie.ex.model.content.PolystarShape$Type;
import java.lang.Enum;

public class o$a	// class@000cda
{
    public static final int[] a;

    static {
       int[] ointArray = new int[PolystarShape$Type.values().length];
       try{
          o$a.a = ointArray;
          ointArray[PolystarShape$Type.STAR.ordinal()] = 1;
          try{
             o$a.a[PolystarShape$Type.POLYGON.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
