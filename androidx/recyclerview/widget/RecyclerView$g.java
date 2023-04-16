package androidx.recyclerview.widget.RecyclerView$g;
import androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy;
import java.lang.Enum;

public class RecyclerView$g	// class@00088e
{
    public static final int[] a;

    static {
       int[] ointArray = new int[RecyclerView$Adapter$StateRestorationPolicy.values().length];
       try{
          RecyclerView$g.a = ointArray;
          ointArray[RecyclerView$Adapter$StateRestorationPolicy.PREVENT.ordinal()] = 1;
          try{
             RecyclerView$g.a[RecyclerView$Adapter$StateRestorationPolicy.PREVENT_WHEN_EMPTY.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
