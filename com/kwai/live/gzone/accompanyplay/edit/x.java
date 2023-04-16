package com.kwai.live.gzone.accompanyplay.edit.x;
import erd.g;
import com.kwai.live.gzone.accompanyplay.edit.v;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.u1;

public class x implements g	// class@000c22
{
    public final v b;

    public void x(v p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "1")) {
       }else if(p0 == ActivityEvent.STOP){
          u1.a(this.b);
       }
       return;
    }
}
