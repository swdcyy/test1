package com.kuaishou.gifshow.kuaishan.logic.e;
import erd.o;
import java.lang.Object;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX;
import java.util.Objects;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX$a;
import brd.t;
import u80.e;
import q87.c;
import com.kuaishou.gifshow.kuaishan.logic.a;
import io.reactivex.g;
import kotlin.jvm.internal.a;

public final class e implements o	// class@001a0b
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KSDownloadHelperX$a obj = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = KSDownloadHelperX.o;
          Objects.requireNonNull(obj);
          obj = PatchProxy.applyOneRefs(p0, obj, KSDownloadHelperX$a.class, "9");
          if (obj != patchProxyRe) {
          }else {
             Object[] objArray = new Object[0];
             e.D().w("KS_Hodor", "downloadAeBuiltInResByResourceSdk: ", objArray);
             p0 = t.create(new a(p0));
             a.o(p0, "Observable.create { emit¡­Detail, listener\)\n      }");
             obj = p0;
          }
       }
       return obj;
    }
}
