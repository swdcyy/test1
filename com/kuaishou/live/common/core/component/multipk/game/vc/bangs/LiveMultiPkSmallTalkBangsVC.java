package com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkSmallTalkBangsVC;
import ws1.e;
import com.kuaishou.live.viewcontroller.ViewController;
import ws1.c;
import msd.a;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkTimeLine;
import st1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkSmallTalkBangsVC$countDownViewModel$2;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkSmallTalkBangsVC$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import lt1.i;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkSmallTalkBangsVC$$special$$inlined$viewModels$2;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.yxcorp.plugin.live.widget.LiveNoShrinkTextView;
import lt1.d;
import android.widget.TextView;
import lt1.c;
import java.lang.CharSequence;
import java.lang.Boolean;
import qrd.p;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import xh3.g;
import lt1.h;
import android.view.View$OnClickListener;
import ws1.d;
import com.kuaishou.live.common.core.component.multipk.logger.LiveMultiPkLogType;
import st1.c;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import st1.e;
import com.kuaishou.live.common.core.component.multipk.container.LiveMultiPKAreaType;

public final class LiveMultiPkSmallTalkBangsVC extends ViewController implements e	// class@001613
{
    public View j;
    public TextView k;
    public View l;
    public final p m;
    public final c n;
    public final boolean o;
    public final a p;
    public final LiveMultiPkTimeLine q;
    public final a r;
    public final a s;
    public final a t;

    public void LiveMultiPkSmallTalkBangsVC(c p0,boolean p1,a p2,LiveMultiPkTimeLine p3,a p4,a p5,a p6){
       a.p(p0, "pkContainerLayout");
       a.p(p2, "closePkEvent");
       a.p(p3, "timeLine");
       a.p(p4, "serverTime");
       a.p(p5, "logDelegate");
       a.p(p6, "bangsEndClickEvent");
       super();
       this.n = p0;
       this.o = p1;
       this.p = p2;
       this.q = p3;
       this.r = p4;
       this.s = p5;
       this.t = p6;
       this.m = new ViewModelLazy(m0.d(i.class), new LiveMultiPkSmallTalkBangsVC$$special$$inlined$viewModels$2(new LiveMultiPkSmallTalkBangsVC$$special$$inlined$viewModels$1(this)), new LiveMultiPkSmallTalkBangsVC$countDownViewModel$2(this));
    }
    public View B1(ViewGroup p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveMultiPkSmallTalkBangsVC liveMultiPkS = LiveMultiPkSmallTalkBangsVC.class;
       LiveMultiPkSmallTalkBangsVC obj = PatchProxy.applyOneRefs(p0, this, liveMultiPkS, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "parentViewGroup");
       obj = this.j;
       if (obj != null) {
          return obj;
       }
       View view = PatchProxy.applyOneRefs(p0, this, liveMultiPkS, "6");
       if (view != patchProxyRe) {
       }else {
          Context context = p0.getContext();
          a.o(context, "context");
          this.k = d.b(context);
          if (this.o != null) {
             this.l = d.a(context, 0x7f102934);
          }
          view = c.d(new c(context).b("ÏÐÁÄ»¥¶¯"), this.k, null, 2, null).c(this.l, Boolean.TRUE).e();
       }
       i oi = PatchProxy.apply(null, this, liveMultiPkS, "1");
       if (oi == patchProxyRe) {
          oi = this.m.getValue();
       }
       if (!PatchProxy.applyVoidOneRefs(oi, this, liveMultiPkS, "7")) {
          LiveMultiPkSmallTalkBangsVC tk = this.k;
          if (tk != null) {
             g.a(tk, this, oi.a);
          }
          tk = this.l;
          if (tk != null) {
             tk.setOnClickListener(new h(oi));
          }
       }
       this.j = view;
       return view;
    }
    public void D(){
       d.a(this);
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkSmallTalkBangsVC.class, "2")) {
          return;
       }
       this.n.w(this);
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkSmallTalkBangsVC.class, "3")) {
          return;
       }
       this.n.n(this);
       return;
    }
    public int getPriority(){
       return 2;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkSmallTalkBangsVC.class, "5")) {
          return;
       }
       if (this.l != null) {
          e.b(LiveMultiPkLogType.SHOW, "EXIT", this.s.l(), this.s.i(), this.s.a());
       }
       return;
    }
    public LiveMultiPKAreaType w1(){
       return LiveMultiPKAreaType.BANGS;
    }
}
