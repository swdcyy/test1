package com.kuaishou.live.core.voiceparty.f0;
import k51.c;
import co2.b2;
import com.kuaishou.live.core.voiceparty.f0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import aq5.a;
import aq5.b;
import m91.b;
import android.view.View;
import ekd.m1;
import t02.a0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import co2.f2;
import lp3.e;
import i81.g;
import lp3.c;

public class f0 extends c	// class@0014ea
{
    public View p;
    public a0 q;
    public b r;
    public f2 s;
    public g t;
    public final c u;
    public final b v;
    public static String sLivePresenterClassName = "VoicePartyAudienceGiftSlotContainerPositionPresenter";

    public void f0(){
       super();
       this.u = new b2(this);
       this.v = new f0$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f0.class, "3")) {
          return;
       }
       a[] uoaArray = new a[0];
       this.r.u5(this.v, uoaArray);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f0.class, "4")) {
          return;
       }
       a[] uoaArray = new a[0];
       this.r.G5(this.v, uoaArray);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f0.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a1092);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f0.class, "1")) {
          return;
       }
       this.q = this.q8(a0.class);
       this.r = this.r8("LIVE_BIZ_RELATION_SERVICE");
       this.s = this.q8(f2.class);
       this.t = this.r8("LIVE_SERVICE_MANAGER").a(g.class);
       return;
    }
}
