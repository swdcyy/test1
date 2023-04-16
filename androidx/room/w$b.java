package androidx.room.w$b;
import java.lang.Object;
import java.util.Arrays;

public class w$b	// class@000276
{
    public final long[] a;
    public final boolean[] b;
    public final int[] c;
    public boolean d;
    public boolean e;

    public void w$b(int p0){
       super();
       long[] olongArray = new long[p0];
       this.a = olongArray;
       boolean[] uobooleanArr = new boolean[p0];
       this.b = uobooleanArr;
       int[] ointArray = new int[p0];
       this.c = ointArray;
       Arrays.fill(olongArray, 0);
       Arrays.fill(uobooleanArr, false);
    }
    public int[] a(){
       _monitor_enter(this);
       if (this.d == null || this.e != null) {
          _monitor_exit(this);
          return null;
       }else {
          int len = this.a.length;
          int i = 0;
          int i1 = 1;
          while (i < len) {
             boolean b = (this.a[i] > 0)? true: false;
             w$b tb = this.b;
             if (b != tb[i]) {
                w$b tc = this.c;
                if (!b) {
                   i1 = 2;
                }
                tc[i] = i1;
             }else {
                this.c[i] = 0;
             }
             tb[i] = b;
             i = i + 1;
          }
          this.e = i1;
          this.d = false;
          _monitor_exit(this);
          return this.c;
       }
    }
    public boolean b(int[] p0){
       _monitor_enter(this);
       int len = p0.length;
       int i = 0;
       boolean b = false;
       while (i < len) {
          int i1 = p0[i];
          w$b ta = this.a;
          long l = ta[i1];
          long l1 = 1 + l;
          ta[i1] = l1;
          if (!l) {
             this.d = true;
             b = true;
          }
          i = i + 1;
       }
       _monitor_exit(this);
       return b;
    }
    public boolean c(int[] p0){
       _monitor_enter(this);
       int len = p0.length;
       int i = 0;
       boolean b = false;
       while (i < len) {
          int i1 = p0[i];
          w$b ta = this.a;
          long l = ta[i1];
          long l1 = l - 1;
          ta[i1] = l1;
          if (!l - 1) {
             this.d = true;
             b = true;
          }
          i = i + 1;
       }
       _monitor_exit(this);
       return b;
    }
    public void d(){
       _monitor_enter(this);
       this.e = false;
       _monitor_exit(this);
    }
    public void e(){
       _monitor_enter(this);
       Arrays.fill(this.b, false);
       this.d = true;
       _monitor_exit(this);
    }
}
