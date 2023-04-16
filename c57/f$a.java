package c57.f$a;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Enum;

public class f$a	// class@0004ea
{
    public static final int[] a;

    static {
       int[] ointArray = new int[FragmentEvent.values().length];
       try{
          f$a.a = ointArray;
          ointArray[FragmentEvent.PAUSE.ordinal()] = 1;
          try{
             f$a.a[FragmentEvent.RESUME.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
