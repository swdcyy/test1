package c.t.m.g.az;
import c.t.m.g.az$1;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class az	// class@000bdc
{
    public final List c;
    public final List d;
    public int e;
    public int f;
    public static final Comparator a;
    public static az b;

    static {
       az.b = new az();
       az.a = new az$1();
    }
    public void az(){
       super();
       this.c = new ArrayList(32);
       this.d = new ArrayList(32);
       this.e = 0;
       this.f = 0x2800;
    }
    public static az a(){
       return az.b;
    }
    public synchronized void a(byte[] p0){
       if (p0 == null || p0.length > this.f) {
          return;
       }
       Arrays.fill(p0, 0);
       this.c.add(p0);
       int i = Collections.binarySearch(this.d, p0, az.a);
       if (i < 0) {
          i = (- i) - 1;
       }
       this.d.add(i, p0);
       this.e = this.e + p0.length;
       this.b();
       return;
    }
    public synchronized byte[] a(int p0){
       byte[] uobyteArray;
       int i = 0;
       while (true) {
          if (i < this.d.size()) {
             uobyteArray = this.d.get(i);
             if (uobyteArray.length == p0) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             byte[] uobyteArray1 = new byte[p0];
             return uobyteArray1;
          }
       }
       this.e = this.e - uobyteArray.length;
       this.d.remove(i);
       this.c.remove(uobyteArray);
       return uobyteArray;
    }
    public synchronized final void b(){
       while (this.e > this.f) {
          byte[] uobyteArray = this.c.remove(0);
          this.d.remove(uobyteArray);
          int i = this.e - uobyteArray.length;
          this.e = i;
       }
       return;
    }
}
