package iqd.b$a;
import io.github.lizhangqu.corepatch.applier.core.CoreApplierType;
import java.lang.Enum;

public class b$a	// class@0014fc
{
    public static final int[] a;

    static {
       int[] ointArray = new int[CoreApplierType.values().length];
       try{
          b$a.a = ointArray;
          ointArray[CoreApplierType.TOTAL.ordinal()] = 1;
          try{
             b$a.a[CoreApplierType.BS.ordinal()] = 2;
             try{
                b$a.a[CoreApplierType.ARCHIVE.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
