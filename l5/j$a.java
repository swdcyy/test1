package l5.j$a;
import android.util.JsonToken;

public class j$a	// class@002520
{
    public static final int[] a;

    static {
       int[] ointArray = new int[JsonToken.values().length];
       try{
          j$a.a = ointArray;
          ointArray[JsonToken.NUMBER.ordinal()] = 1;
          try{
             j$a.a[JsonToken.BEGIN_ARRAY.ordinal()] = 2;
             try{
                j$a.a[JsonToken.BEGIN_OBJECT.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
