package com.kuaishou.live.core.voiceparty.core.shared.a$b;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import kotlin.jvm.internal.a;
import brd.t;
import ut7.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public abstract class a$b	// class@0013fa
{
    public final PublishSubject a;

    public void a$b(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Event>\(\)");
       this.a = publishSubje;
    }
    public final t a(){
       return this.a;
    }
    public void b(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       a.p(p0, "event");
       this.a.onNext(p0);
       return;
    }
}
