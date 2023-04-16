package com.yxcorp.gifshow.v3.mixed.vb.AbsMixImporterViewBinder;
import com.kuaishou.viewbinder.BaseViewBinder;
import c35.c;
import com.yxcorp.gifshow.v3.mixed.timeline.MixTimeline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.v3.mixed.MixImporterFragment;
import ewc.q;
import com.yxcorp.gifshow.v3.mixed.timeline.i;
import bwc.l;
import ewc.h;
import bwc.e;
import pb9.p;
import bwc.a;
import com.yxcorp.gifshow.widget.KwaiActionBar;

public abstract class AbsMixImporterViewBinder extends BaseViewBinder	// class@001571
{
    public MixTimeline e;
    public KwaiActionBar f;

    public void AbsMixImporterViewBinder(c p0){
       super(p0);
    }
    public final void A(MixTimeline p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsMixImporterViewBinder.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.e = p0;
       return;
    }
    public void y(PresenterV2 p0,MixImporterFragment p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, AbsMixImporterViewBinder.class, "5")) {
          return;
       }
       a.p(p0, "presenter");
       a.p(p1, "mixImporterFragment");
       p0.U7(new q(p1));
       p0.U7(new i(p1));
       p0.U7(new l(p1));
       p0.U7(new h(p1));
       p0.U7(new e(p1));
       if (p.g(0)) {
          p0.U7(new a(p1));
       }
       PatchProxy.onMethodExit(AbsMixImporterViewBinder.class, "5");
       return;
    }
    public final void z(KwaiActionBar p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsMixImporterViewBinder.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.f = p0;
       return;
    }
}
