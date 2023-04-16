package ifd.h$d;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Enum;

public class h$d	// class@00100b
{
    public static final int[] a;

    static {
       int[] ointArray = new int[FragmentEvent.values().length];
       try{
          h$d.a = ointArray;
          ointArray[FragmentEvent.RESUME.ordinal()] = 1;
          try{
             h$d.a[FragmentEvent.PAUSE.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
