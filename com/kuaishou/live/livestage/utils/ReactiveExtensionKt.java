package com.kuaishou.live.livestage.utils.ReactiveExtensionKt;
import brd.t;
import msd.p;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.livestage.utils.ReactiveExtensionKt$a;
import brd.w;
import erd.c;
import io.reactivex.observers.TestObserver;
import grd.a;
import java.util.List;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import java.util.concurrent.TimeUnit;
import brd.z;
import java.lang.Long;
import com.kuaishou.live.livestage.utils.ReactiveExtensionKt$defaultIfTimeout$mapper$1;
import com.kuaishou.live.livestage.utils.ReactiveExtensionKt$b;
import erd.o;
import com.kuaishou.live.livestage.utils.ReactiveExtensionKt$c;
import erd.r;
import com.kuaishou.live.livestage.utils.ReactiveExtensionKt$d;
import erd.g;
import crd.b;
import com.kuaishou.live.livestage.utils.CommonUtil;

public final class ReactiveExtensionKt	// class@000bfd
{

    public static final t a(t p0,t p1,p p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, ReactiveExtensionKt.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "lhs");
       a.p(p1, "rhs");
       a.p(p2, "mapper");
       p0 = t.combineLatest(p0, p1, new ReactiveExtensionKt$a(p2));
       a.o(p0, "Observable.combineLatest¡­ -> Maybe\(mapper\(r, s\)\) }");
       p0 = ReactiveExtensionKt.e(p0);
       a.o(p0, "Observable.combineLatest¡­\)\) }\n    .filterNotNull\(\)");
       return p0;
    }
    public static final void b(t p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, ReactiveExtensionKt.class, "2")) {
          return;
       }
       a.p(p0, "$this$assertHasInitialValue");
       a.p(p1, "name");
       TestObserver testObserver = p0.test();
       String str = (testObserver.c.size() > 0)? 1: null;
       if (str) {
          testObserver.dispose();
          return;
       }else {
          throw new IllegalStateException("Observable "+p1+" must has initial value".toString());
       }
    }
    public static void c(t p0,String p1,int p2,Object p3){
       p1 = (p2 & 0x01)? "": null;
       ReactiveExtensionKt.b(p0, p1);
       return;
    }
    public static final t d(t p0,Object p1,long p2,TimeUnit p3,z p4){
       ReactiveExtensionKt$defaultIfTimeout$mapper$1 obj;
       ReactiveExtensionKt reactiveExte = ReactiveExtensionKt.class;
       if (PatchProxy.isSupport(reactiveExte)) {
          Object[] objArray = new Object[]{p0,p1,Long.valueOf(p2),p3,p4};
          obj = PatchProxy.apply(objArray, null, reactiveExte, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "$this$defaultIfTimeout");
       a.p(p1, "defaultValue");
       a.p(p3, "timeUnit");
       a.p(p4, "scheduler");
       obj = new ReactiveExtensionKt$defaultIfTimeout$mapper$1(p1, 0);
       p0 = t.merge(p0, t.timer(p2, p3, p4).map(new ReactiveExtensionKt$b(obj))).flatMap(obj);
       a.o(p0, "Observable.merge\(\n    th¡­\n  \)\n    .flatMap\(mapper\)");
       return p0;
    }
    public static final t e(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ReactiveExtensionKt.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$filterNotNull");
       return p0.filter(ReactiveExtensionKt$c.b).map(ReactiveExtensionKt$d.b);
    }
    public static final b f(t p0,g p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ReactiveExtensionKt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$subscribeWithErrorHandle");
       a.p(p1, "consumer");
       b uob = p0.subscribe(p1, CommonUtil.e.b());
       a.o(uob, "this.subscribe\(consumer, CommonUtil.onRxError\)");
       return uob;
    }
}
