package ed.u;
import ed.u$b;
import java.lang.Object;
import kd.b;
import java.lang.String;
import ed.w;
import ed.j;
import ed.r;
import ed.k;
import android.util.SparseIntArray;
import eb.d;
import java.lang.Runtime;
import java.lang.Math;
import ed.u$a;
import ed.x;
import eb.c;

public class u	// class@00153d
{
    public final w a;
    public final x b;
    public final w c;
    public final c d;
    public final w e;
    public final x f;
    public final w g;
    public final x h;
    public final String i;
    public final int j;
    public final int k;
    public final boolean l;
    public final boolean m;

    public void u(u$b p0){
       r or;
       int i3;
       d uod;
       SparseIntArray sparseIntArr1;
       w ow1;
       String str;
       super();
       if (b.d()) {
          b.a("PoolConfig\(\)");
       }
       u$b a = p0.a;
       if (a == null) {
          a = j.a();
       }
       this.a = a;
       a = p0.b;
       if (a == null) {
          or = r.h();
       }
       this.b = or;
       a = p0.c;
       int i = 0x20000;
       int i1 = 0x400000;
       if (a == null) {
          int a1 = k.a;
          int i2 = a1 * i1;
          SparseIntArray sparseIntArr = new SparseIntArray();
          for (i3 = 0x20000; i3 <= i1; i3 = i3 * 2) {
             sparseIntArr.put(i3, a1);
          }
          w ow = new w(0x400000, i2, sparseIntArr, 0x20000, 0x400000, k.a);
       }
       this.c = a;
       a = p0.d;
       if (a == null) {
          uod = d.c();
       }
       this.d = uod;
       a = p0.e;
       i3 = 0x4000;
       if (a == null) {
          sparseIntArr1 = new SparseIntArray();
          sparseIntArr1.put(1024, 5);
          sparseIntArr1.put(2048, 5);
          sparseIntArr1.put(4096, 5);
          sparseIntArr1.put(8192, 5);
          sparseIntArr1.put(i3, 5);
          sparseIntArr1.put(0x8000, 5);
          sparseIntArr1.put(0x10000, 5);
          sparseIntArr1.put(i, 5);
          sparseIntArr1.put(0x40000, 2);
          sparseIntArr1.put(0x80000, 2);
          sparseIntArr1.put(0x100000, 2);
          long l = 0x7fffffff;
          int i4 = (int)Math.min(Runtime.getRuntime().maxMemory(), l);
          if (i4 < 0x1000000) {
             i4 = 0x300000;
          }else if(i4 < 0x2000000){
             i4 = 0x600000;
          }else {
             i4 = 0xc00000;
          }
          int i5 = (int)Math.min(Runtime.getRuntime().maxMemory(), l);
          i5 = (i5 < 0x1000000)? i5 / 2: (i5 / 4) * 3;
          ow1 = new w(i4, i5, sparseIntArr1);
       }
       this.e = ow1;
       a = p0.f;
       if (a == null) {
          or = r.h();
       }
       this.f = or;
       a = p0.g;
       if (a == null) {
          sparseIntArr1 = new SparseIntArray();
          sparseIntArr1.put(i3, 5);
          ow1 = new w(0x14000, 0x100000, sparseIntArr1);
       }
       this.g = ow1;
       a = p0.h;
       if (a == null) {
          or = r.h();
       }
       this.h = or;
       a = p0.i;
       if (a == null) {
          str = "legacy";
       }
       this.i = str;
       this.j = p0.j;
       a = p0.k;
       if (a > null) {
          i1 = a;
       }
       this.k = i1;
       this.l = p0.l;
       if (b.d()) {
          b.b();
       }
       this.m = p0.m;
       return;
    }
    public static u$b l(){
       return new u$b(null);
    }
    public int a(){
       return this.k;
    }
    public int b(){
       return this.j;
    }
    public w c(){
       return this.a;
    }
    public x d(){
       return this.b;
    }
    public String e(){
       return this.i;
    }
    public w f(){
       return this.c;
    }
    public w g(){
       return this.e;
    }
    public x h(){
       return this.f;
    }
    public c i(){
       return this.d;
    }
    public boolean j(){
       return this.m;
    }
    public boolean k(){
       return this.l;
    }
}
