package com.kwai.live.gzone.turntable.presenters.h$a;
import erd.g;
import com.kwai.live.gzone.turntable.presenters.h;
import com.kwai.live.gzone.turntable.bean.LiveGzoneTurntablePrize;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.turntable.presenters.f;
import com.kwai.live.gzone.turntable.LiveGzoneTurntableLogger;

public class h$a implements g	// class@000e68
{
    public final LiveGzoneTurntablePrize b;
    public final h c;

    public void h$a(h p0,LiveGzoneTurntablePrize p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "1")) {
       }else if(p0.booleanValue()){
          this.c.a.t.o(this.b);
       }
       return;
    }
}
