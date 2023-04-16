package b56.z;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class z	// class@000419
{

    public void z(){
       super();
    }
    public static int a(long p0,long p1,int p2){
       if (p1 > 0) {
          return (int)((((float)p0 * 0x3f800000) / (float)p1) * (float)p2);
       }
       return 0;
    }
    public static long b(int p0,int p1,long p2){
       return (long)((((float)p0 * 0x3f800000) * (float)p2) / (float)p1);
    }
    public static String c(long p0){
       z oz = z.class;
       if (PatchProxy.isSupport(oz)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), null, oz, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       long l = p0 / 0xea60;
       p0 = (p0 / 1000) - (60 * l);
       StringBuilder str = "";
       if (l - 10 < 0) {
          str = str+"0";
       }
       str = str+l+":";
       if (p0 - 10 < 0) {
          str = str+"0";
       }
       return str+p0;
    }
}
