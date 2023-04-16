package qf.b;
import java.lang.Object;
import java.util.List;
import qf.b$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Double;
import qf.a;
import qf.b$a;
import vc.j;
import com.facebook.imagepipeline.core.ImagePipeline;
import java.util.Iterator;
import java.lang.Math;
import android.net.Uri;

public class b	// class@0029d3
{

    public void b(){
       super();
    }
    public static b$b a(int p0,int p1,List p2){
       b$b uob1;
       b$b uob2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, null, b.class, "1");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       double d = 0x3ff0000000000000;
       if (PatchProxy.isSupport(uob)) {
          uob1 = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, Double.valueOf(d), null, b.class, "2");
          if (uob1 != patchProxyRe) {
          label_00e6 :
             return uob1;
          }
       }
       a uoa = null;
       if (p2.isEmpty()) {
          uob2 = new b$b(uoa, uoa, uoa);
       }else if(p2.size() == 1){
          uob2 = new b$b(p2.get(0), uoa, uoa);
       }else if(p0 <= 0 || p1 <= 0){
          uob2 = new b$b(uoa, uoa, uoa);
       }else {
          ImagePipeline imagePipelin = j.j().h();
          double d1 = (double)(p0 * p1) * d;
          Iterator iterator = p2.iterator();
          int i = Double.MAX_VALUE;
          a uoa1 = uoa;
          a uoa2 = uoa1;
          int i1 = i;
          while (iterator.hasNext()) {
             a uoa3 = iterator.next();
             double d2 = uoa3.c / d1;
             d2 = d - d2;
             d2 = Math.abs(d2);
             if (d2 - i < 0) {
                uoa2 = uoa3;
                i = d2;
             }
             if (d2 - i1 < 0 && (imagePipelin.isInBitmapMemoryCache(uoa3.c()) || imagePipelin.isInDiskCacheSync(uoa3.c()))) {
                uoa1 = uoa3;
                i1 = d2;
             }
             d = 0x3ff0000000000000;
          }
          if (uoa1 != null && (uoa2 != null && (uoa1.b()).equals(uoa2.b()))) {
             uoa1 = uoa;
          }
       label_00d8 :
          uob2 = new b$b(uoa2, uoa1, uoa);
       }
       uob1 = uob2;
       goto label_00e6 ;
    }
}
