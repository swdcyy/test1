package com.kuaishou.live.lite.adapter.component.treasurebox.LiveLiteTreasureBoxPresenter;
import b93.d;
import com.kuaishou.live.lite.adapter.component.treasurebox.LiveLiteTreasureBoxPresenter$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m83.a;
import java.util.List;
import com.kuaishou.android.live.log.b;
import j02.m;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.adapter.component.treasurebox.LiveLiteTreasureBoxPresenter$onCreate$1;
import hf3.a;
import xp5.g;
import vq5.d;
import aq5.d;
import xp5.i;
import msd.a;
import jv1.b;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import vb3.p;
import com.kuaishou.live.viewcontroller.ViewController;
import vb3.n;
import c93.b;
import or5.d;
import v51.a;
import d93.a;
import d93.b;
import gg1.b;

public final class LiveLiteTreasureBoxPresenter extends d	// class@001e25
{
    public n A;
    public m B;
    public final LiveLiteTreasureBoxPresenter$a C;
    public d v;
    public a w;
    public d x;
    public i y;
    public d z;

    public void LiveLiteTreasureBoxPresenter(){
       super();
       this.C = new LiveLiteTreasureBoxPresenter$a(this);
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteTreasureBoxPresenter.class, "4")) {
          return;
       }
       super.F8();
       b.P(a.a, "onCreate");
       LiveLiteTreasureBoxPresenter tw = this.w;
       if (tw == null) {
          a.S("liveLongConnection");
       }
       LiveLiteTreasureBoxPresenter tv = this.v;
       if (tv == null) {
          a.S("liveInfoManager");
       }
       LiveLiteTreasureBoxPresenter tx = this.x;
       if (tx == null) {
          a.S("liveRouterManager");
       }
       LiveLiteTreasureBoxPresenter tz = this.z;
       if (tz == null) {
          a.S("liveBizManager");
       }
       LiveLiteTreasureBoxPresenter ty = this.y;
       if (ty == null) {
          a.S("liveLogPackageProvider");
       }
       m om = new m(tw, tv, tx, tz, ty, LiveLiteTreasureBoxPresenter$onCreate$1.INSTANCE, null);
       this.B = v0;
       LiveLiteTreasureBoxPresenter tA = this.A;
       if (tA == null) {
          a.S("viewProviderService");
       }
       tA.c(LayoutViewType.TreasureBox, this.B);
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteTreasureBoxPresenter.class, "1")) {
          return;
       }
       a.p(p0, "provider");
       this.v = p0.a(d.class);
       this.x = p0.a(d.class);
       a uoa = p0.a(a.class).u();
       a.o(uoa, "provider.get\(LiveLongCon¡­.java\).liveLongConnection");
       this.w = uoa;
       this.y = p0.a(i.class);
       this.z = p0.a(d.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteTreasureBoxPresenter.class, "3")) {
          return;
       }
       a.p(p0, "provider");
       this.A = p0.a(n.class);
       return;
    }
    public void Z8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteTreasureBoxPresenter.class, "2")) {
          return;
       }
       a.p(p0, "register");
       p0.d(b.class, this.C);
       return;
    }
}
