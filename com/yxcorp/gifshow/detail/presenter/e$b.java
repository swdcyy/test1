package com.yxcorp.gifshow.detail.presenter.e$b;
import jta.f;
import com.yxcorp.gifshow.detail.presenter.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import io.reactivex.subjects.PublishSubject;

public class e$b extends f	// class@0016d5
{
    public final e a;

    public void e$b(e p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       e$b uob = e$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "1")) {
          return;
       }
       this.a.s.S.onNext(Float.valueOf(p0));
       return;
    }
}
