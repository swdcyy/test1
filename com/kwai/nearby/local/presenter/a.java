package com.kwai.nearby.local.presenter.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.nearby.local.HomeLocalFragment;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kwai.nearby.local.utils.d;
import v1b.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import kotlin.jvm.internal.a;
import f2b.a;
import tkd.b;
import tkd.d;
import msb.a;
import a2b.h;
import com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.d;
import com.yxcorp.gifshow.util.rx.RxBus;
import irb.c;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import dd7.d;
import erd.g;
import crd.b;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import com.kwai.library.widget.refresh.CustomRefreshLayout;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public class a extends PresenterV2	// class@000fa8
{
    public CustomRecyclerView p;
    public CustomRefreshLayout q;
    public RecyclerFragment r;

    public void a(HomeLocalFragment p0){
       super();
       boolean b = d.d(p0.getArguments());
       if (!PatchProxy.isSupport2(d.class, "1") || !PatchProxy.applyVoidThreeRefsWithListener(this, p0, Boolean.valueOf(b), null, d.class, "1")) {
          a.p(this, "presenterV2");
          this.U7(new a());
          if (b || !d.a(0x3e918ed8).rd()) {
             this.U7(new h());
          }
          this.U7(new d());
          PatchProxy.onMethodExit(d.class, "1");
       }
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.X7(RxBus.f.g(c.class, RxBus$ThreadMode.MAIN).subscribe(new d(this)));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a34da);
       this.q = m1.f(p0, 0x7f0a3537);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.r = this.r8("FRAGMENT");
       return;
    }
}
