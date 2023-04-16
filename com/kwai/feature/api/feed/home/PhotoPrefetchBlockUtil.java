package com.kwai.feature.api.feed.home.PhotoPrefetchBlockUtil;
import com.kwai.feature.api.feed.home.PhotoPrefetchBlockUtil$isBlockGrPr$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.feature.api.feed.home.PhotoPrefetchBlockUtil$logger$2;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import hn5.a0;
import java.lang.StringBuilder;
import q87.c;
import wh5.c;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;

public final class PhotoPrefetchBlockUtil	// class@000ee7
{
    public static final p a;
    public static final p b;
    public static final AtomicBoolean c;
    public static final PhotoPrefetchBlockUtil d;

    static {
       PhotoPrefetchBlockUtil.d = new PhotoPrefetchBlockUtil();
       PhotoPrefetchBlockUtil.a = s.c(PhotoPrefetchBlockUtil$isBlockGrPr$2.INSTANCE);
       PhotoPrefetchBlockUtil.b = s.c(PhotoPrefetchBlockUtil$logger$2.INSTANCE);
       PhotoPrefetchBlockUtil.c = new AtomicBoolean(false);
    }
    public void PhotoPrefetchBlockUtil(){
       super();
    }
    public static final boolean b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PhotoPrefetchBlockUtil photoPrefetc = PhotoPrefetchBlockUtil.class;
       Object[] objArray = null;
       PhotoPrefetchBlockUtil obj = PatchProxy.apply(objArray, objArray, photoPrefetc, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!PhotoPrefetchBlockUtil.c.getAndSet(b)) {
          obj = PhotoPrefetchBlockUtil.d;
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(objArray, obj, photoPrefetc, "2");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = PhotoPrefetchBlockUtil.b.getValue();
          }
          objArray = new Object[0];
          obj1.w("PhotoPrefetchBlockUtil", "shouldBlockPrefetchAsGRPR return:"+obj.a(), objArray);
       }
       if (PhotoPrefetchBlockUtil.d.a() || (!c.b() && !VisitorModeManager.f())) {
          b = false;
       }
    label_0069 :
       return b;
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, PhotoPrefetchBlockUtil.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = PhotoPrefetchBlockUtil.a.getValue();
       }
       return obj.booleanValue();
    }
}
