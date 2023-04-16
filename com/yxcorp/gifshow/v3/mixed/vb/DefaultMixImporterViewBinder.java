package com.yxcorp.gifshow.v3.mixed.vb.DefaultMixImporterViewBinder;
import com.yxcorp.gifshow.v3.mixed.vb.AbsMixImporterViewBinder;
import c35.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.yxcorp.gifshow.v3.mixed.timeline.MixTimeline;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.v3.mixed.MixImporterFragment;
import cwc.l;
import cwc.r;
import cwc.d;
import com.yxcorp.gifshow.v3.mixed.timeline.j;
import bwc.h;
import cwc.h;

public final class DefaultMixImporterViewBinder extends AbsMixImporterViewBinder	// class@001572
{

    public void DefaultMixImporterViewBinder(c p0){
       a.p(p0, "viewHost");
       super(p0);
    }
    public void s(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultMixImporterViewBinder.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       View view = m1.f(p0, R.id.timeline_container);
       a.o(view, "ViewBindUtils.bindWidget¡­ R.id.timeline_container\)");
       this.A(view);
       p0 = m1.f(p0, R.id.title);
       a.o(p0, "ViewBindUtils.bindWidget\(rootView, R.id.title\)");
       this.z(p0);
       return;
    }
    public View u(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DefaultMixImporterViewBinder.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.g(p0, R.layout.arg_RES_7f0d0fce, p1, false);
       a.o(view, "KwaiLayoutInflater.infla¡­esId\(\), container, false\)");
       return view;
    }
    public void y(PresenterV2 p0,MixImporterFragment p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, DefaultMixImporterViewBinder.class, "2")) {
          return;
       }
       a.p(p0, "presenter");
       a.p(p1, "mixImporterFragment");
       super.y(p0, p1);
       p0.U7(new l(p1));
       p0.U7(new r(p1));
       p0.U7(new d(p1));
       p0.U7(new j(p1));
       p0.U7(new h(p1));
       p0.U7(new h(p1));
       PatchProxy.onMethodExit(DefaultMixImporterViewBinder.class, "2");
       return;
    }
}
