package eqa.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import wkd.b;
import te6.b;
import cra.w;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.video.wayne.player.util.CacheKeyUtil;
import com.kwai.video.hodor.Hodor;

public final class a	// class@0027a7
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final boolean a(String p0){
       boolean b1;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       String obj = PatchProxy.applyOneRefs(p0, this, uoa, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = "url";
       a.p(p0, obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, this, uoa, "2");
       boolean b = false;
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else {
          a.p(p0, obj);
          b1 = b.a(-1427269270).t(p0);
          Object[] objArray1 = new Object[b];
          w.C().w("GrowthPreDownloadUtil", "isVideoExistByWarmup url="+p0+", result="+b1, objArray1);
       }
       if (!b1) {
          Object obj2 = PatchProxy.applyOneRefs(p0, this, uoa, "1");
          if (obj2 != patchProxyRe) {
             b2 = obj2.booleanValue();
          }else {
             a.p(p0, obj);
             boolean b3 = Hodor.instance().isFullyCached(CacheKeyUtil.getCacheKey(p0, b), b);
             Object[] objArray = new Object[b];
             w.C().w("GrowthPreDownloadUtil", "isVideoExistByHodor url="+p0+", result="+b3, objArray);
             b2 = b3;
          }
          if (!b2) {
          label_00a0 :
             return b;
          }
       }
       b = true;
       goto label_00a0 ;
    }
}
