package dm1.f;
import java.lang.Object;
import com.yxcorp.gifshow.models.Gift;
import java.util.List;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import dm1.a;
import java.util.Collection;
import ekd.q;
import com.facebook.imagepipeline.request.ImageRequest;
import dm1.i;
import com.kwai.robust.PatchProxyResult;
import dm1.i$a;
import dm1.b;
import com.kuaishou.live.common.core.basic.tools.g$d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.common.core.basic.tools.g$d$a;
import lnc.e0;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.kuaishou.live.common.core.basic.tools.g$a;
import dm1.e;
import com.kuaishou.live.common.core.basic.tools.g$c;
import com.kuaishou.live.common.core.basic.tools.g;

public class f	// class@001fc5
{

    public void f(){
       super();
    }
    public void a(Gift p0,List p1,boolean p2,String p3){
       boolean b;
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, f.class, "1")) {
          return;
       }
       String str = "2";
       if (p2) {
          if (!PatchProxy.applyVoidOneRefs(p1, this, f.class, str) && (!PatchProxy.applyVoidOneRefs(p1, null, a.class, "8") && !q.f(p1))) {
             ImageRequest[] imageRequest = a.d(p1);
             if (imageRequest != null) {
                a.a(0, imageRequest);
             }
          }
       }else {
          i oi = i.class;
          if (!PatchProxy.applyVoidThreeRefs(p0, p1, p3, this, f.class, "3")) {
             i$a uoa = PatchProxy.applyOneRefs(p1, null, oi, str);
             if (uoa != PatchProxyResult.class) {
             }else {
                uoa = i.b(p1, i.c());
             }
             if (uoa == null) {
                b.a(p0, p3, 3, null, i.c());
             }else {
                String str1 = "4";
                Object obj = PatchProxy.applyOneRefs(uoa, this, f.class, str1);
                if (obj != PatchProxyResult.class) {
                }else {
                   str1 = PatchProxy.applyOneRefs(uoa, null, oi, str1);
                   oi = true;
                   if (str1 != PatchProxyResult.class) {
                      b = str1.booleanValue();
                   }else if(!q.f(uoa.a) && (!TextUtils.x(uoa.b) && !TextUtils.x(uoa.c))){
                      b = true;
                   }else {
                      b = false;
                   }
                   if (!b) {
                      obj = null;
                   }else {
                      g$d$a uod$a = new g$d$a();
                      uod$a.i(e0.a(uoa.a, null));
                      uod$a.g(uoa.b);
                      uod$a.h(uoa.c);
                      uod$a.d(0);
                      uod$a.c(DownloadTask$DownloadTaskType.PRE_DOWNLOAD);
                      uod$a.f(oi);
                      uod$a.a("live_gift");
                      obj = uod$a.b();
                   }
                }
                if (obj == null) {
                   b.a(p0, p3, 4, null, i.c());
                }else {
                   e uoe = PatchProxy.applyTwoRefs(p0, p3, this, f.class, "5");
                   if (uoe != PatchProxyResult.class) {
                   }else {
                      uoe = new e(this, p0, p3);
                   }
                   g.a(obj, uoe);
                }
             }
          }
       }
    label_00ff :
       return;
    }
}
