package dm1.a;
import java.lang.Object;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import kb.c;
import dm1.a$a;
import android.os.AsyncTask;
import kb.e;
import java.util.concurrent.Executor;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.robust.PatchProxyResult;
import com.google.common.base.Optional;
import java.util.List;
import java.util.Collection;
import ekd.q;
import s0d.f;
import s0d.e;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Boolean;
import dm1.i;
import dm1.i$a;
import dm1.b;

public class a	// class@001fbf
{

    public void a(){
       super();
    }
    public static void a(int p0,ImageRequest[] p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, uoa, "9")) {
          return;
       }
       if (p0 >= p1.length) {
          return;
       }
       Fresco.getImagePipeline().prefetchToDiskCache(p1[p0], null).f(new a$a(p0, p1), AsyncTask.THREAD_POOL_EXECUTOR);
       return;
    }
    public static String b(CDNUrl p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "";
       }
       return Optional.fromNullable(p0.getUrl()).or("");
    }
    public static String c(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(p0)) {
          return "";
       }
       return a.b(p0.get(0));
    }
    public static ImageRequest[] d(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(p0)) {
          return null;
       }
       return f.x().q(p0).w();
    }
    public static boolean e(Gift p0,List p1,String p2,boolean p3){
       Object obj;
       boolean b;
       int i;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, a.class, "4");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       if (PatchProxy.isSupport(i.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, i.class, "6");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          label_0080 :
             return b;
          }
       }
       i = 2;
       if (i.c()) {
          boolean b1 = i.d(i.b(p1, true));
          if (!b1) {
             b2 = i.d(i.b(p1, false));
             if (!b2) {
             label_0072 :
                i = 0;
             }
          }else {
             b2 = b1;
             i = 1;
          }
       }else {
          b2 = i.d(i.b(p1, false));
          if (!b2) {
          }
       }
       if (p3 && b2) {
          b.a(p0, p2, i, null, i.c());
       }
       b = b2;
       goto label_0080 ;
    }
}
