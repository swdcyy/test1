package com.kuaishou.live.core.show.wealthgrade.privilegedetail.LiveWealthGradeDetailFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import lnc.a1;
import crd.a;
import qm2.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import y8c.t;
import pm2.a;
import o02.e;
import brd.t;
import cjd.e;
import erd.o;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.b;
import t45.d;
import brd.z;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.a;
import erd.g;
import qm2.i;
import qm2.j;
import crd.b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.b9;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import qm2.k;
import nkc.a;
import nkc.d;
import android.widget.ImageView;
import qm2.g;
import android.view.View$OnClickListener;
import qm2.h;
import androidx.core.widget.NestedScrollView$b;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.o;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.i;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.h;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import hm2.k;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;

public class LiveWealthGradeDetailFragment extends BaseFragment	// class@001268
{
    public boolean j;
    public boolean k;
    public View l;
    public TextView m;
    public ImageView n;
    public ViewGroup o;
    public NestedScrollView p;
    public String q;
    public t r;
    public a s;
    public a0 t;
    public i0 u;
    public PresenterV2 v;
    public final a w;
    public static final int x;

    static {
       LiveWealthGradeDetailFragment.x = a1.e(20.00f);
    }
    public void LiveWealthGradeDetailFragment(){
       super();
       this.s = new a();
       this.w = new a();
    }
    public void ch(){
       if (PatchProxy.applyVoid(null, this, LiveWealthGradeDetailFragment.class, "7")) {
          return;
       }
       this.p.setVisibility(8);
       this.r.d(true);
       this.s.c(e.q().e(this.q).map(new e()).map(b.b).observeOn(d.c).doOnNext(a.b).observeOn(d.a).subscribe(new i(this), new j(this)));
       return;
    }
    public void onAttach(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveWealthGradeDetailFragment.class, "2")) {
          return;
       }
       super.onAttach(p0);
       LiveWealthGradeDetailFragment tw = this.w;
       tw.c = this.t;
       tw.e = this.u;
       tw.d = this;
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveWealthGradeDetailFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0e83, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveWealthGradeDetailFragment.class, "10")) {
          return;
       }
       super.onDestroyView();
       LiveWealthGradeDetailFragment tv = this.v;
       if (tv != null) {
          tv.unbind();
          this.v.destroy();
       }
       b9.a(this.s);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveWealthGradeDetailFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Object[] objArray = null;
       if (!PatchProxy.applyVoidOneRefs(p0, this, LiveWealthGradeDetailFragment.class, "5")) {
          this.l = p0.findViewById(0x7f0a2815);
          this.m = p0.findViewById(0x7f0a2816);
          this.o = p0.findViewById(0x7f0a2814);
          this.p = p0.findViewById(0x7f0a2811);
          this.r = new k(this, new a(this.o));
          this.n = p0.findViewById(0x7f0a2804);
          if (!PatchProxy.applyVoid(objArray, this, LiveWealthGradeDetailFragment.class, "8")) {
             this.n.setOnClickListener(new g(this));
             this.p.setOnScrollChangeListener(new h(this));
          }
       }
       String str = "6";
       PresenterV2 presenterV2 = PatchProxy.applyWithListener(objArray, this, LiveWealthGradeDetailFragment.class, str);
       if (presenterV2 != PatchProxyResult.class) {
       }else {
          presenterV2 = new PresenterV2();
          presenterV2.U7(new o());
          presenterV2.U7(new i());
          presenterV2.U7(new h());
          PatchProxy.onMethodExit(LiveWealthGradeDetailFragment.class, str);
       }
       this.v = presenterV2;
       presenterV2.f(p0);
       Object[] objArray1 = new Object[]{this.w};
       this.v.i(objArray1);
       this.ch();
       ClientContent$LiveStreamPackage liveStreamPa = this.t.Z2.a();
       if (!PatchProxy.applyVoidOneRefs(liveStreamPa, objArray, k.class, "9")) {
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "KWAI_USER_LEVEL_CARD";
          u1.u0(9, uElementPack, uContentPack);
       }
       return;
    }
}
