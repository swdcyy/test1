package dm1.d;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import dm1.f;
import dm1.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.k1;
import dm1.g;
import java.lang.Runnable;
import t45.c;
import com.yxcorp.gifshow.models.Gift;
import java.util.List;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import dm1.a;
import com.kwai.robust.PatchProxyResult;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import android.graphics.Bitmap;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class d	// class@001fc3
{
    public ConcurrentHashMap a;
    public final f b;

    public void d(){
       super();
       this.a = new ConcurrentHashMap();
       this.b = new f();
       if (PatchProxy.applyVoid(null, null, i.class, "10")) {
       }else if(k1.g()){
          c.a(g.b);
       }else {
          i.a();
       }
       return;
    }
    public void a(Gift p0,List p1,boolean p2,String p3){
       boolean b1;
       int i;
       object this;
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, d.class, "2")) {
          return;
       }
       if (q.f(p1)) {
          return;
       }
       boolean b = true;
       if (i.c()) {
          if (!p2 && !a.e(p0, p1, p3, b)) {
             this.b.a(p0, p1, p2, p3);
          }
       }else {
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          Object obj = PatchProxy.applyThreeRefs(p0, p1, p3, this, d.class, "5");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else {
             obj = PatchProxy.applyOneRefs(p1, null, a.class, "3");
             if (obj != patchProxyRe) {
                b1 = obj.booleanValue();
             }else {
                ImageRequest[] imageRequest = a.d(p1);
                if (imageRequest != null) {
                   int len = imageRequest.length;
                   i = 0;
                   while (true) {
                      if (i < len) {
                         this = imageRequest[i];
                         if (this != null && Fresco.getImagePipeline().isInDiskCacheSync(this)) {
                            b1 = true;
                            break ;
                         }else {
                            i = i + 1;
                         }
                      }
                   }
                }
                b1 = false;
             }
             if (!b1 && !a.e(p0, p1, p3, b)) {
                b = 0;
             }
             b1 = b;
          }
          if (b1) {
             return;
          }else {
             this.b.a(p0, p1, p2, p3);
          }
       }
       return;
    }
    public void b(String p0,Bitmap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "6")) {
          return;
       }
       if (!TextUtils.x(p0) && p1 != null) {
          this.a.put(p0, p1);
       }
       return;
    }
}
