package com.kwai.live.gzone.commandlottery.f;
import erd.g;
import com.kwai.live.gzone.commandlottery.d;
import e47.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import e47.a$a;
import brd.t;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.kwai.live.gzone.commandlottery.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class f implements g	// class@000c97
{
    public final a b;
    public final d c;

    public void f(d p0,a p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else if(!p0.booleanValue()){
          b9.a(this.c.z);
          this.c.X7(t.just(this.b.d.mJumpUrl).delaySubscription(500, TimeUnit.MILLISECONDS, d.a).subscribe(new e(this)));
       }
       return;
    }
}
