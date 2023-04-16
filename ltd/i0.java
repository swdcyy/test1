package ltd.i0;
import java.lang.String;
import ltd.g0;
import java.lang.Long;
import zsd.t;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Boolean;

public final class i0	// class@001e08
{

    public static final int a(String p0,int p1,int p2,int p3){
       return (int)g0.c(p0, (long)p1, (long)p2, (long)p3);
    }
    public static final long b(String p0,long p1,long p2,long p3){
       String str = g0.d(p0);
       if (str == null) {
          return p1;
       }
       Long longx = t.Z0(str);
       if (longx == null) {
          throw new IllegalStateException("System property \'"+p0+"\' has unrecognized value \'"+str+'''.toString());
       }
       long l = longx.longValue();
       if (p2 - l <= 0 && p3 - l >= 0) {
          return l;
       }
       throw new IllegalStateException("System property \'"+p0+"\' should be in range "+p2+".."+p3+", but is \'"+l+'''.toString());
    }
    public static final boolean c(String p0,boolean p1){
       p0 = g0.d(p0);
       if (p0 != null) {
          p1 = Boolean.parseBoolean(p0);
       }
       return p1;
    }
    public static int d(String p0,int p1,int p2,int p3,int p4,Object p5){
       if (p4 & 0x04) {
          p2 = 1;
       }
       if (p4 & 0x08) {
          p3 = Integer.MAX_VALUE;
       }
       return g0.b(p0, p1, p2, p3);
    }
    public static long e(String p0,long p1,long p2,long p3,int p4,Object p5){
       if (p4 & 0x04) {
          p2 = 1;
       }
       long l = p2;
       if (p4 & 0x08) {
          p3 = Long.MAX_VALUE;
       }
       return g0.c(p0, p1, l, p3);
    }
}
