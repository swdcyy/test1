package com.kwai.live.gzone.turntable.presenters.k;
import erd.g;
import com.kwai.live.gzone.turntable.presenters.LiveGzoneTurntableTaskPresenter;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import io.reactivex.subjects.PublishSubject;
import com.kwai.live.gzone.turntable.b;

public class k implements g	// class@000e6c
{
    public final LiveGzoneTurntableTaskPresenter b;

    public void k(LiveGzoneTurntableTaskPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
       }else {
          this.b.E.r1().onNext(p0);
       }
       return;
    }
}
