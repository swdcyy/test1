package b4d.n0$b;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Enum;

public class n0$b	// class@000380
{
    public static final int[] a;

    static {
       int[] ointArray = new int[FragmentEvent.values().length];
       try{
          n0$b.a = ointArray;
          ointArray[FragmentEvent.RESUME.ordinal()] = 1;
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
