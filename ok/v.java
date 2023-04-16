package ok.v;
import java.lang.Object;
import ok.y;
import ok.n;
import java.util.concurrent.TimeUnit;
import java.lang.String;
import java.lang.StringBuilder;
import ok.m;
import java.util.Locale;
import java.lang.Double;
import ok.v$a;
import java.lang.AssertionError;

public final class v	// class@002803
{
    public final y a;
    public boolean b;
    public long c;
    public long d;

    public void v(){
       super();
       this.a = y.b();
    }
    public void v(y p0){
       super();
       n.k(p0, "ticker");
       this.a = p0;
    }
    public static v a(){
       return new v();
    }
    public long b(TimeUnit p0){
       return p0.convert(this.c(), TimeUnit.NANOSECONDS);
    }
    public final long c(){
       long l = (this.b != null)? (this.a.a() - this.d) + this.c: this.c;
       return l;
    }
    public v d(){
       n.o((this.b ^ 1), "This stopwatch is already running.");
       this.b = true;
       this.d = this.a.a();
       return this;
    }
    public String toString(){
       String str1;
       long l = this.c();
       TimeUnit dAYS = TimeUnit.DAYS;
       TimeUnit nANOSECONDS = TimeUnit.NANOSECONDS;
       if (dAYS.convert(l, nANOSECONDS) > 0) {
       }else {
          dAYS = TimeUnit.HOURS;
          if (dAYS.convert(l, nANOSECONDS) <= 0) {
             dAYS = TimeUnit.MINUTES;
             if (dAYS.convert(l, nANOSECONDS) <= 0) {
                dAYS = TimeUnit.SECONDS;
                if (dAYS.convert(l, nANOSECONDS) <= 0) {
                   dAYS = TimeUnit.MILLISECONDS;
                   if (dAYS.convert(l, nANOSECONDS) <= 0) {
                      dAYS = TimeUnit.MICROSECONDS;
                      if (dAYS.convert(l, nANOSECONDS) <= 0) {
                         dAYS = nANOSECONDS;
                      }
                   }
                }
             }
          }
       }
       Object[] objArray = new Object[]{Double.valueOf(((double)l / (double)nANOSECONDS.convert(1, dAYS)))};
       StringBuilder str = String.format(Locale.ROOT, "%.4g", objArray)+" ";
       switch (v$a.a[dAYS.ordinal()]){
           case 1:
             str1 = "ns";
             break;
           case 2:
             str1 = "¦Ìs";
             break;
           case 3:
             str1 = "ms";
             break;
           case 4:
             str1 = "s";
             break;
           case 5:
             str1 = "min";
             break;
           case 6:
             str1 = "h";
             break;
           case 7:
             str1 = "d";
             break;
           default:
             throw new AssertionError();
       }
       return str+str1;
    }
}
