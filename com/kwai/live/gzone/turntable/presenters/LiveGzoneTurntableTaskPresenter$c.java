package com.kwai.live.gzone.turntable.presenters.LiveGzoneTurntableTaskPresenter$c;
import erd.g;
import com.kwai.live.gzone.turntable.presenters.LiveGzoneTurntableTaskPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveGzoneTurntableTaskPresenter$c implements g	// class@000e51
{
    public final LiveGzoneTurntableTaskPresenter b;

    public void LiveGzoneTurntableTaskPresenter$c(LiveGzoneTurntableTaskPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneTurntableTaskPresenter$c.class, "1")) {
       }else {
          this.b.G = p0.booleanValue();
       }
       return;
    }
}
