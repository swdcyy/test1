package com.kuaishou.live.core.voiceparty.micseats.core.data.TransformerKt;
import brd.t;
import co2.f2;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import mrd.c;
import qs2.a;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.micseats.core.data.TransformerKt$a;
import brd.w;
import erd.c;
import com.kuaishou.live.core.voiceparty.micseats.core.data.TransformerKt$applying$1;
import com.kuaishou.live.core.voiceparty.b;
import com.google.common.base.Optional;
import mrd.a;
import ss2.k;
import ss2.i;
import erd.g;
import ss2.j;
import erd.a;
import com.kuaishou.live.core.voiceparty.micseats.core.data.TransformerKt$b;
import qu2.a;
import com.kuaishou.live.core.voiceparty.micseats.core.data.TransformerKt$c;
import erd.o;
import com.kuaishou.live.core.voiceparty.micseats.core.data.TransformerKt$d;
import com.kuaishou.live.core.voiceparty.micseats.core.data.TransformerKt$e;
import com.kuaishou.live.core.voiceparty.micseats.core.data.TransformerKt$f;
import java.lang.Integer;
import com.kuaishou.live.core.voiceparty.micseats.core.data.TransformerKt$g;

public final class TransformerKt	// class@001585
{

    public static final t a(t p0,f2 p1,a p2){
       f2 obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, TransformerKt.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "dataListObservable");
       a.p(p1, "voicePartyContext");
       a.p(p2, "teamInfoFetcher");
       obj = p1.p;
       c uoc = (obj != null)? obj.z(): null;
       if (uoc != null) {
          p0 = t.combineLatest(p0, uoc.startWith(Boolean.FALSE), new TransformerKt$a(p1, p2));
          a.o(p0, "Observable.combineLatest¡­    version\n      \)\n    }");
       }
       return p0;
    }
    public static t b(t p0,f2 p1,a p2,int p3,Object p4){
       TransformerKt$applying$1 iNSTANCE = (p3 & 0x04)? TransformerKt$applying$1.INSTANCE: null;
       return TransformerKt.a(p0, p1, iNSTANCE);
    }
    public static final t c(t p0,b p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TransformerKt transformerK = TransformerKt.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, transformerK, "1");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       a.p(p0, "dataListObservable");
       if (p1 != null) {
          t ot = PatchProxy.applyOneRefs(p1, obj, transformerK, "7");
          if (ot != patchProxyRe) {
          }else {
             a uoa = a.h(Optional.absent());
             a.o(uoa, "BehaviorSubject.createDe¡­nt<MicSeatChangedInfo>\(\)\)");
             k ok = new k(uoa);
             ot = uoa.doOnSubscribe(new i(p1, ok)).doOnDispose(new j(p1, ok));
             a.o(ot, "subject\n    .doOnSubscri¡­eObserver\(observer\)\n    }");
          }
          p0 = t.combineLatest(p0, ot, TransformerKt$b.a);
          a.o(p0, "Observable.combineLatest¡­t, version\)\n      }\n    }");
       }
       return p0;
    }
    public static final t d(t p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, TransformerKt.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "dataListObservable");
       a.p(p1, "liveContextWrapper");
       p0 = p0.map(new TransformerKt$c(p1.d()));
       a.o(p0, "dataListObservable.map {¡­ anchorId }, version\)\n  }");
       return p0;
    }
    public static final t e(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TransformerKt.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "dataListObservable");
       p0 = p0.map(TransformerKt$d.b);
       a.o(p0, "dataListObservable.map {¡­t.id == 0 }, version\)\n  }");
       return p0;
    }
    public static final t f(t p0,t p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, TransformerKt.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "dataListObservable");
       if (p1 != null) {
          p0 = t.combineLatest(p0, p1.map(TransformerKt$e.b).startWith(Optional.absent()), TransformerKt$f.a);
          a.o(p0, "Observable.combineLatest¡­t, version\)\n      }\n    }");
       }
       return p0;
    }
    public static final t g(t p0,int p1){
       TransformerKt transformerK = TransformerKt.class;
       if (PatchProxy.isSupport(transformerK)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, transformerK, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "dataListObservable");
       p0 = p0.map(new TransformerKt$g(p1));
       a.o(p0, "dataListObservable.map {¡­getDataList, version\)\n  }");
       return p0;
    }
}
