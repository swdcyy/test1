package com.kwai.live.gzone.turntable.presenters.l;
import erd.g;
import com.kwai.live.gzone.turntable.presenters.LiveGzoneTurntableTaskPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class l implements g	// class@000e6d
{
    public final LiveGzoneTurntableTaskPresenter b;

    public void l(LiveGzoneTurntableTaskPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
       }else if(p0.booleanValue()){
          this.b.R8();
       }
       return;
    }
}
