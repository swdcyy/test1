package com.kwai.live.gzone.turntable.presenters.f$b;
import erd.g;
import com.kwai.live.gzone.turntable.presenters.f;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.turntable.widget.LiveGzoneTurntableCoreView;

public class f$b implements g	// class@000e63
{
    public final f b;

    public void f$b(f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "1")) {
       }else {
          this.b.F.setOpportunityCount(p0.intValue());
       }
       return;
    }
}
