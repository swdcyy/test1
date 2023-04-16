package k79.n;
import java.util.Comparator;
import java.lang.Object;
import jlb.c;

public final class n implements Comparator	// class@002b5b
{
    public static final n b;

    static {
       n.b = new n();
    }
    public void n(){
       super();
    }
    public int compare(Object p0,Object p1){
       int i;
       if ((v2 = p1.f - p0.f) > 0) {
          i = 1;
       }else if(v2 < 0){
          i = -1;
       }else {
          i = 0;
       }
       return i;
    }
}
