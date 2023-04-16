package c.b;
import java.lang.Object;
import java.io.InputStream;

public class b	// class@000bb0
{
    public int a;
    public int b;
    public InputStream c;

    public void b(){
       super();
    }
    public static void b(short[] p0){
       for (int i = 0; i < p0.length; i = i + 1) {
          p0[i] = 1024;
       }
       return;
    }
    public int a(short[] p0,int p1){
       short s = p0[p1];
       b ta = this.a;
       int i = (ta >> 11) * s;
       b tb = this.b;
       if ((tb ^ Integer.MIN_VALUE) < (Integer.MIN_VALUE ^ i)) {
          this.a = i;
          p0[p1] = (short)(s + ((s - 2048) >> 5));
          if (!(i & 0xff000000)) {
             this.b = (tb << 8) | this.c.read();
             this.a = this.a << 8;
          }
          return 0;
       }else {
          int i1 = ta - i;
          this.a = i1;
          int i2 = tb - i;
          this.b = i2;
          p0[p1] = (short)(s - (s >> 5));
          if (!(i1 & 0xff000000)) {
             this.b = (i2 << 8) | this.c.read();
             this.a = this.a << 8;
          }
          return 1;
       }
    }
}
