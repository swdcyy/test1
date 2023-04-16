package com.yxcorp.gifshow.apm.TabApmTracker$b;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import brd.y;

public final class TabApmTracker$b	// class@001059
{
    public final c a;

    public void TabApmTracker$b(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create\(\)");
       this.a = publishSubje;
    }
    public final void a(boolean p0){
       if (PatchProxy.isSupport2(TabApmTracker$b.class, "2") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, TabApmTracker$b.class, "2")) {
          return;
       }
       this.a.onNext(Boolean.valueOf(p0));
       if (p0) {
          this.a.onComplete();
       }
       PatchProxy.onMethodExit(TabApmTracker$b.class, "2");
       return;
    }
}
