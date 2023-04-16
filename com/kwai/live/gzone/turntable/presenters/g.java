package com.kwai.live.gzone.turntable.presenters.g;
import erd.g;
import com.kwai.live.gzone.turntable.presenters.f;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.turntable.widget.LiveGzoneTurntableCoreView;

public class g implements g	// class@000e67
{
    public final f b;

    public void g(f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else if(p0.booleanValue()){
          this.b.W8();
          this.b.F.d();
       }else {
          this.b.X8();
          this.b.F.e();
       }
       return;
    }
}
