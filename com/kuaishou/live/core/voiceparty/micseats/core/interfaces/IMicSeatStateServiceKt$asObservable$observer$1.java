package com.kuaishou.live.core.voiceparty.micseats.core.interfaces.IMicSeatStateServiceKt$asObservable$observer$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import mrd.a;
import java.lang.Object;
import java.util.List;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class IMicSeatStateServiceKt$asObservable$observer$1 extends Lambda implements l	// class@001587
{
    public final a $subject;

    public void IMicSeatStateServiceKt$asObservable$observer$1(a p0){
       this.$subject = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMicSeatStateServiceKt$asObservable$observer$1.class, "1")) {
          return;
       }
       a.p(p0, "stateInterfaceList");
       this.$subject.onNext(p0);
       return;
    }
}
