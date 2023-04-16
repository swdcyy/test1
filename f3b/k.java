package f3b.k;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Objects;
import android.content.Context;
import ekd.p0;
import android.net.NetworkInfo;
import com.yxcorp.utility.SystemUtil;

public class k	// class@0015c5
{

    public void k(){
       super();
    }
    public static int a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, k.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0xa5d4d503:
             if (p0.equals("5g\(nsa\)")) {
                i = 0;
             }
             break;
           case 1653:
             if (p0.equals("2g")) {
                i = 1;
             }
             break;
           case 1684:
             if (p0.equals("3g")) {
                i = 2;
             }
             break;
           case 1715:
             if (p0.equals("4g")) {
                i = 3;
             }
             break;
           case 1746:
             if (p0.equals("5g")) {
                i = 4;
             }
             break;
           case 0x60303845:
             if (p0.equals("5g\(sa\)")) {
                i = 5;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             return 8;
           case 1:
             return 5;
           case 2:
             return 4;
           case 3:
             return 3;
           case 4:
             return 7;
           case 5:
             return 9;
           default:
             return 6;
       }
    }
    public static int b(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, k.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!p0.C(p0)) {
          return 1;
       }
       if (SystemUtil.c(p0) == null) {
          return 0;
       }
       if (p0.F(p0)) {
          return 2;
       }
       return k.a(p0.d(p0));
    }
}
