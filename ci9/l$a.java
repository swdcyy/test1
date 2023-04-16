package ci9.l$a;
import com.kuaishou.edit.draft.Shoot$RecordMode;
import java.lang.Enum;

public class l$a	// class@0005fc
{
    public static final int[] a;

    static {
       int[] ointArray = new int[Shoot$RecordMode.values().length];
       try{
          l$a.a = ointArray;
          ointArray[Shoot$RecordMode.NORMAL.ordinal()] = 1;
          try{
             l$a.a[Shoot$RecordMode.LONG.ordinal()] = 2;
             try{
                l$a.a[Shoot$RecordMode.LONG_LONG.ordinal()] = 3;
                try{
                   l$a.a[Shoot$RecordMode.VERY_LONG.ordinal()] = 4;
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
