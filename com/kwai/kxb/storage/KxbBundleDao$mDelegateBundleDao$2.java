package com.kwai.kxb.storage.KxbBundleDao$mDelegateBundleDao$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.kxb.storage.KxbBundleDao;
import java.lang.Object;
import tu6.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tu6.i;
import kotlin.jvm.internal.a;
import java.util.Map;
import com.kwai.kxb.PlatformType;
import java.util.Objects;
import wu6.k;
import java.lang.Enum;
import java.io.File;
import qkd.b;
import java.util.List;

public final class KxbBundleDao$mDelegateBundleDao$2 extends Lambda implements a	// class@0007f2
{
    public final KxbBundleDao this$0;

    public void KxbBundleDao$mDelegateBundleDao$2(KxbBundleDao p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       Map b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i obj = PatchProxy.apply(null, this, KxbBundleDao$mDelegateBundleDao$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = i.f;
       KxbBundleDao d = this.this$0.d;
       _monitor_enter(obj);
       Object obj1 = PatchProxy.applyOneRefs(d, obj, i.class, "2");
       if (obj1 != patchProxyRe) {
       }else {
          a.p(d, "platformType");
          b = i.b;
          obj1 = b.get(d);
          if (obj1 == null) {
             obj1 = obj.a(d);
             b.put(d, obj1);
          }
       }
       _monitor_exit(obj);
       KxbBundleDao$mDelegateBundleDao$2 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       KxbBundleDao kxbBundleDao = KxbBundleDao.class;
       if (!PatchProxy.applyVoidOneRefs(obj1, tthis$0, kxbBundleDao, "13")) {
          if (!PatchProxy.applyVoid(null, tthis$0, kxbBundleDao, "14")) {
             b.q(k.a.e(tthis$0.d.name()));
          }
          tthis$0.k(obj1, null, obj1.getAll());
       }
       return obj1;
    }
}
