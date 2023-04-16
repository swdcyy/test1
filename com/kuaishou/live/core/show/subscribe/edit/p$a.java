package com.kuaishou.live.core.show.subscribe.edit.p$a;
import sfc.a;
import com.kuaishou.live.core.show.subscribe.edit.p;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class p$a extends a	// class@001122
{
    public final SlipSwitchButton c;
    public final boolean d;
    public final p e;

    public void p$a(p p0,SlipSwitchButton p1,boolean p2){
       this.e = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$a.class, "1")) {
          return;
       }
       super.b(p0);
       this.c.setSwitch((this.d ^ 0x01));
       return;
    }
}
