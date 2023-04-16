package b.a$a;
import b.a;
import java.lang.Object;
import c.a;
import c.b;

public class a$a	// class@000ab1
{
    public short[] a;
    public a[] b;
    public a[] c;
    public a d;
    public int e;
    public final a f;

    public void a$a(a p0){
       this.f = p0;
       super();
       short[] oshortArray = new short[2];
       this.a = oshortArray;
       a[] uoaArray = new a[16];
       this.b = uoaArray;
       a[] uoaArray1 = new a[16];
       this.c = uoaArray1;
       this.d = new a(8);
       this.e = 0;
    }
    public void a(int p0){
       a$a te = this.e;
       while (te < p0) {
          this.b[te] = new a(3);
          this.c[this.e] = new a(3);
          int i = this.e + 1;
          this.e = i;
       }
       return;
    }
    public int b(b p0,int p1){
       if (!p0.a(this.a, 0)) {
          return this.b[p1].a(p0);
       }
       int i = (!p0.a(this.a, 1))? this.c[p1].a(p0): this.d.a(p0) + 8;
       return (i + 8);
    }
    public void c(){
       b.b(this.a);
       for (int i = 0; i < this.e; i = i + 1) {
          this.b[i].b();
          this.c[i].b();
       }
       this.d.b();
       return;
    }
}
