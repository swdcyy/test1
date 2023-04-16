package com.kuaishou.live.livestage.overlay.FlexWindowLayoutManager$b;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import kotlin.jvm.internal.a;
import fe3.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qrd.l1;
import fe3.a;

public abstract class FlexWindowLayoutManager$b	// class@000bf1
{
    public final PublishSubject a;

    public void FlexWindowLayoutManager$b(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Unit>\(\)");
       this.a = publishSubje;
    }
    public abstract int a();
    public abstract g b(int p0);
    public final void c(){
       if (PatchProxy.applyVoid(null, this, FlexWindowLayoutManager$b.class, "1")) {
          return;
       }
       this.a.onNext(l1.a);
       return;
    }
    public abstract a d();
}
