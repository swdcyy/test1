package cl0.b;
import java.lang.Object;
import java.lang.Math;
import java.io.OutputStream;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Byte;
import java.lang.String;
import java.lang.Integer;

public class b	// class@0004db
{
    public int a;
    public int b;
    public byte[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int[] k;
    public int[] l;
    public int m;
    public int n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int[] u;
    public int v;
    public byte[] w;

    public void b(int p0,int p1,byte[] p2,int p3){
       super();
       this.h = 12;
       this.j = 4096;
       int[] ointArray = new int[5003];
       this.k = ointArray;
       ointArray = new int[5003];
       this.l = ointArray;
       this.m = 5003;
       this.n = 0;
       this.o = false;
       this.s = 0;
       this.t = 0;
       this.u = new int[17]{0,1,3,7,15,31,'?',127,255,511,1023,2047,4095,8191,0x3fff,0x7fff,0xffff};
       byte[] uobyteArray = new byte[256];
       this.w = uobyteArray;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = Math.max(2, p3);
    }
    public final int a(int p0){
       return ((1 << p0) - 1);
    }
    public void b(byte p0,OutputStream p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Byte.valueOf(p0), p1, this, uob, "1")) {
          return;
       }
       b tv = this.v;
       int i = tv + 1;
       this.v = i;
       this.w[tv] = p0;
       if (i >= 254) {
          this.d(p1);
       }
       return;
    }
    public void c(int p0){
       for (int i = 0; i < p0; i = i + 1) {
          this.k[i] = -1;
       }
       return;
    }
    public void d(OutputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       b tv = this.v;
       if (tv > null) {
          p0.write(tv);
          p0.write(this.w, 0, this.v);
          this.v = 0;
       }
       return;
    }
    public final int e(){
       b te = this.e;
       if (te == null) {
          return -1;
       }
       this.e = te - 1;
       b tf = this.f;
       this.f = tf + 1;
       return (this.c[tf] & 0x00ff);
    }
    public void f(int p0,OutputStream p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "6")) {
          return;
       }
       b tt = this.t;
       int i = this.s & this.u[tt];
       this.s = i;
       this.s = (tt > null)? i | (p0 << tt): p0;
       this.t = tt + this.g;
       while (this.t >= 8) {
          i = this.s & 0x00ff;
          this.b((byte)i, p1);
          i = this.s >> 8;
          this.s = i;
          i = this.t - 8;
          this.t = i;
       }
       if (this.n > this.i || this.o != null) {
          if (this.o != null) {
             uob = this.p;
             this.g = uob;
             this.i = this.a(uob);
             this.o = false;
          }else {
             i = this.g + 1;
             this.g = i;
             this.i = (i == this.h)? this.j: this.a(i);
          }
       }
       if (p0 == this.r) {
          while (this.t > null) {
             p0 = this.s & 0x00ff;
             this.b((byte)p0, p1);
             p0 = this.s >> 8;
             this.s = p0;
             p0 = this.t - 8;
             this.t = p0;
          }
          this.d(p1);
       }
       return;
    }
}
