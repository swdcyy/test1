package androidx.recyclerview.widget.k$a;
import java.util.Comparator;
import java.lang.Object;
import androidx.recyclerview.widget.k$c;

public class k$a implements Comparator	// class@000919
{

    public void k$a(){
       super();
    }
    public int a(k$c p0,k$c p1){
       k$c d = p0.d;
       int i = 1;
       k$c uoc = (d == null)? 1: null;
       int i1 = (p1.d == null)? 1: 0;
       if (uoc != i1) {
          if (d != null) {
             i = -1;
          }
          return i;
       }else {
          d = p0.a;
          if (d != p1.a) {
             if (d != null) {
                i = -1;
             }
             return i;
          }else {
             int i2 = p1.b - p0.b;
             if (i2) {
                return i2;
             }else {
                int i3 = p0.c - p1.c;
                if (i3) {
                   return i3;
                }else {
                   return 0;
                }
             }
          }
       }
    }
    public int compare(Object p0,Object p1){
       return this.a(p0, p1);
    }
}
