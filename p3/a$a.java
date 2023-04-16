package p3.a$a;
import androidx.work.NetworkType;
import java.lang.Enum;

public class a$a	// class@0028ac
{
    public static final int[] a;

    static {
       int[] ointArray = new int[NetworkType.values().length];
       try{
          a$a.a = ointArray;
          ointArray[NetworkType.NOT_REQUIRED.ordinal()] = 1;
          try{
             a$a.a[NetworkType.CONNECTED.ordinal()] = 2;
             try{
                a$a.a[NetworkType.UNMETERED.ordinal()] = 3;
                try{
                   a$a.a[NetworkType.NOT_ROAMING.ordinal()] = 4;
                   try{
                      a$a.a[NetworkType.METERED.ordinal()] = 5;
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
