package okhttp3.internal.JavaNetHeaders$1;
import java.util.Comparator;
import java.lang.Object;
import java.lang.String;

public class JavaNetHeaders$1 implements Comparator	// class@001f6c
{

    public void JavaNetHeaders$1(){
       super();
    }
    public int compare(Object p0,Object p1){
       return this.compare(p0, p1);
    }
    public int compare(String p0,String p1){
       if (p0 == p1) {
          return 0;
       }
       if (p0 == null) {
          return -1;
       }
       if (p1 == null) {
          return 1;
       }
       return String.CASE_INSENSITIVE_ORDER.compare(p0, p1);
    }
}
