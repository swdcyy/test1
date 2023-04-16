package com.kwai.live.gzone.gestureguide.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import i57.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oq5.c;
import oq5.a;
import fq5.b;

public class a extends PresenterV2	// class@000d02
{
    public boolean p;
    public b q;
    public a r;
    public c s;

    public void a(){
       super();
       this.p = true;
       this.s = new a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.r.H6(this.s);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.r.Q0(this.s);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.q = this.r8("LIVE_BASIC_CONTEXT");
       this.r = this.r8("LIVE_CONFIGURATION_SERVICE");
       return;
    }
}
