package c88.c$a;
import java.util.Comparator;
import java.lang.Object;
import android.hardware.Camera$Size;

public final class c$a implements Comparator	// class@0003c1
{

    public void c$a(){
       super();
    }
    public int compare(Object p0,Object p1){
       int i = p0.height * p0.width;
       int i1 = p1.height * p1.width;
       if (i < i1) {
          i1 = 1;
       }else if(i > i1){
          i1 = -1;
       }else {
          i1 = 0;
       }
       return i1;
    }
}
