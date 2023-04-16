package com.kuaishou.live.core.voiceparty.micseats.core.interfaces.IMicSeatStateServiceKt;
import ts2.f;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import mrd.a;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.IMicSeatStateServiceKt$asObservable$observer$1;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.IMicSeatStateServiceKt$a;
import msd.l;
import erd.g;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.IMicSeatStateServiceKt$b;
import erd.a;
import androidx.lifecycle.LiveData;
import ts2.k;

public final class IMicSeatStateServiceKt	// class@001589
{

    public static final t a(f p0){
       a obj = PatchProxy.applyOneRefs(p0, null, IMicSeatStateServiceKt.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$asObservable");
       obj = a.g();
       a.o(obj, "BehaviorSubject.create<M¡­SeatStateInterfaceList>\(\)");
       IMicSeatStateServiceKt$asObservable$observer$1 uoasObservab = new IMicSeatStateServiceKt$asObservable$observer$1(obj);
       t ot = obj.doOnSubscribe(new IMicSeatStateServiceKt$a(p0, uoasObservab)).doOnDispose(new IMicSeatStateServiceKt$b(p0, uoasObservab));
       a.o(ot, "subject\n    .doOnSubscri¡­eObserver\(observer\)\n    }");
       return ot;
    }
    public static final LiveData b(f p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, IMicSeatStateServiceKt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$toLiveData");
       return new k(p0);
    }
}
