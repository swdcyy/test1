package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatOpenVideoTipsController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import ts2.a;
import ts2.h;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import brd.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.OpenVideoTipsLogic;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatOpenVideoTipsController$onCreate$1;
import msd.l;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatOpenVideoTipsController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public final class MicSeatOpenVideoTipsController extends ViewController	// class@0016ce
{
    public final OpenVideoTipsLogic j;
    public final a k;
    public final h l;
    public final MicSeatStyle m;

    public void MicSeatOpenVideoTipsController(f p0,a p1,h p2,MicSeatStyle p3,t p4){
       a.p(p0, "micSeatStateService");
       a.p(p1, "micSeatPendantService");
       a.p(p2, "micSeatViewManager");
       a.p(p3, "style");
       a.p(p4, "openVideoUserIds");
       super();
       this.k = p1;
       this.l = p2;
       this.m = p3;
       this.j = new OpenVideoTipsLogic(p0, p4);
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, MicSeatOpenVideoTipsController.class, "1")) {
          return;
       }
       this.l.a(MicSeatPendantId.OpenVideoTips, new MicSeatOpenVideoTipsController$onCreate$1(this));
       this.j.a().observe(this, new MicSeatOpenVideoTipsController$a(this));
       return;
    }
}
