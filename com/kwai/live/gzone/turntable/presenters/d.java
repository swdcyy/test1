package com.kwai.live.gzone.turntable.presenters.d;
import erd.g;
import com.kwai.live.gzone.turntable.presenters.LiveGzoneAudienceTurntableWelfareTaskPresenter;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import io.reactivex.subjects.PublishSubject;
import com.kwai.live.gzone.turntable.b;

public class d implements g	// class@000e60
{
    public final LiveGzoneAudienceTurntableWelfareTaskPresenter b;

    public void d(LiveGzoneAudienceTurntableWelfareTaskPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          this.b.C.r1().onNext(p0);
       }
       return;
    }
}
