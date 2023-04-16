package v2.o0;
import a3.e;
import a3.d;
import java.util.TreeMap;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import java.util.Map$Entry;
import java.util.NavigableSet;
import java.util.Iterator;
import java.util.Arrays;

public class o0 implements e, d	// class@002656
{
    public String b;
    public final long[] c;
    public final double[] d;
    public final String[] e;
    public final byte[][] f;
    public final int[] g;
    public final int h;
    public int i;
    public static final TreeMap j;

    static {
       o0.j = new TreeMap();
    }
    public void o0(int p0){
       super();
       this.h = p0;
       p0++;
       int[] ointArray = new int[p0];
       this.g = ointArray;
       long[] olongArray = new long[p0];
       this.c = olongArray;
       double[] uodoubleArra = new double[p0];
       this.d = uodoubleArra;
       String[] stringArray = new String[p0];
       this.e = stringArray;
       byte[][] uobyteArray = new byte[][p0];
       this.f = uobyteArray;
    }
    public static o0 b(String p0,int p1){
       TreeMap j = o0.j;
       _monitor_enter(j);
       Map$Entry uEntry = j.ceilingEntry(Integer.valueOf(p1));
       if (uEntry != null) {
          j.remove(uEntry.getKey());
          o0 value = uEntry.getValue();
          value.e(p0, p1);
          _monitor_exit(j);
          return value;
       }else {
          _monitor_exit(j);
          o0 oo0 = new o0(p1);
          oo0.e(p0, p1);
          return oo0;
       }
    }
    public static void f(){
       TreeMap j = o0.j;
       if (j.size() > 15) {
          int i = j.size() - 10;
          Iterator iterator = j.descendingKeySet().iterator();
          int i1 = i - 1;
          while (i > 0) {
             iterator.next();
             iterator.remove();
             i = i1;
          }
       }
       return;
    }
    public int a(){
       return this.i;
    }
    public void bindBlob(int p0,byte[] p1){
       this.g[p0] = 5;
       this.f[p0] = p1;
    }
    public void bindDouble(int p0,double p1){
       this.g[p0] = 3;
       this.d[p0] = p1;
    }
    public void bindLong(int p0,long p1){
       this.g[p0] = 2;
       this.c[p0] = p1;
    }
    public void bindNull(int p0){
       this.g[p0] = 1;
    }
    public void bindString(int p0,String p1){
       this.g[p0] = 4;
       this.e[p0] = p1;
    }
    public String c(){
       return this.b;
    }
    public void clearBindings(){
       Arrays.fill(this.g, 1);
       Arrays.fill(this.e, null);
       Arrays.fill(this.f, null);
       this.b = null;
    }
    public void close(){
    }
    public void d(d p0){
       int i = 1;
       while (i <= this.i) {
          int i1 = this.g[i];
          if (i1 != 1) {
             if (i1 != 2) {
                if (i1 != 3) {
                   if (i1 != 4) {
                      if (i1 == 5) {
                         p0.bindBlob(i, this.f[i]);
                      }
                   }else {
                      p0.bindString(i, this.e[i]);
                   }
                }else {
                   p0.bindDouble(i, this.d[i]);
                }
             }else {
                p0.bindLong(i, this.c[i]);
             }
          }else {
             p0.bindNull(i);
          }
          i = i + 1;
       }
       return;
    }
    public void e(String p0,int p1){
       this.b = p0;
       this.i = p1;
    }
    public void release(){
       TreeMap j = o0.j;
       _monitor_enter(j);
       j.put(Integer.valueOf(this.h), this);
       o0.f();
       _monitor_exit(j);
    }
}
