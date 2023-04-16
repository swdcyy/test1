package c.a;
import java.lang.Object;
import c.b;

public class a	// class@000baf
{
    public short[] a;
    public int b;

    public void a(int p0){
       super();
       this.b = p0;
       short[] oshortArray = new short[(1 << p0)];
       this.a = oshortArray;
    }
    public int a(b p0){
       int i = 1;
       for (a tb = this.b; tb; tb = tb - 1) {
          int i1 = i << 1;
          i = p0.a(this.a, i) + i1;
       }
       return (i - (1 << this.b));
    }
    public void b(){
       b.b(this.a);
    }
}
