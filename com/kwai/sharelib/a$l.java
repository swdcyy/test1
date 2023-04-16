package com.kwai.sharelib.a$l;
import erd.o;
import com.kwai.sharelib.a;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import au6.e;
import java.lang.StringBuilder;
import java.util.Objects;
import com.kwai.sharelib.KsShareDataEngine;
import brd.t;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.kwai.sharelib.KsShareDataEngine$shareInitRequest$1;
import uo7.k;
import io.reactivex.g;
import java.util.concurrent.TimeUnit;
import brd.z;
import lrd.b;
import uo7.m;
import uo7.n;
import erd.a;
import uo7.o;

public final class a$l implements o	// class@0016af
{
    public final a b;

    public void a$l(a p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       a obj = PatchProxy.applyOneRefs(p0, this, a$l.class, str);
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "it");
          String str1 = null;
          e.d(e.a, str1, "shareInitRequest call configuration: "+this.b.g, 1, str1);
          p0 = this.b;
          obj = p0.b;
          p0 = p0.g;
          Objects.requireNonNull(obj);
          Ref$ObjectRef obj1 = PatchProxy.applyOneRefs(p0, obj, KsShareDataEngine.class, str);
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else {
             a.p(p0, "ksConf");
             Ref$ObjectRef objectRef = new Ref$ObjectRef();
             objectRef.element = str1;
             obj1 = new Ref$ObjectRef();
             obj1.element = str1;
             p0 = t.create(new KsShareDataEngine$shareInitRequest$1(obj, p0, objectRef)).timeout(11, TimeUnit.SECONDS).observeOn(b.c()).onErrorResumeNext(new m(obj, p0)).doFinally(new n(obj, objectRef, obj1, p0)).map(new o(obj, objectRef, obj1, p0));
             a.o(p0, "Observable.create<ShareI¡­      \)\n        }\n      }");
             obj = p0;
          }
       }
       return obj;
    }
}
