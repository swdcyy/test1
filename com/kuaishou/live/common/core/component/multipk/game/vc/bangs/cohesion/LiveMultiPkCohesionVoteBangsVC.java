package com.kuaishou.live.common.core.component.multipk.game.vc.bangs.cohesion.LiveMultiPkCohesionVoteBangsVC;
import ws1.e;
import com.kuaishou.live.viewcontroller.ViewController;
import ut1.d;
import zs1.b;
import ft1.b;
import com.kuaishou.protobuf.livestream.nano.CohesionPkInfo;
import ws1.c;
import msd.a;
import st1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.cohesion.LiveMultiPkCohesionVoteBangsVC$countDownViewModel$2;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.cohesion.LiveMultiPkCohesionVoteBangsVC$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import lt1.j;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.cohesion.LiveMultiPkCohesionVoteBangsVC$$special$$inlined$viewModels$2;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.cohesion.LiveMultiPkCohesionVoteBangsVC$bangsViewModel$2;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.cohesion.LiveMultiPkCohesionVoteBangsVC$$special$$inlined$viewModels$3;
import mt1.a;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.cohesion.LiveMultiPkCohesionVoteBangsVC$$special$$inlined$viewModels$4;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import android.util.AttributeSet;
import nsd.u;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import android.widget.ImageView;
import qrd.l1;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import com.yxcorp.plugin.live.widget.LiveNoShrinkTextView;
import lt1.d;
import java.lang.Boolean;
import android.widget.TextView;
import lt1.c;
import qrd.p;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LifecycleOwner;
import xh3.g;
import mt1.c;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import xh3.b;
import com.kuaishou.live.mvvm.viewbinder.KwaiImageViewBinder$bindUrl$2;
import xh3.c;
import msd.l;
import mt1.d;
import android.view.View$OnClickListener;
import ut1.a;
import mt1.b;
import ws1.d;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.cohesion.LiveMultiPkCohesionVoteBangsVC$a;
import com.kuaishou.live.common.core.component.multipk.container.LiveMultiPKAreaType;

public final class LiveMultiPkCohesionVoteBangsVC extends ViewController implements e	// class@00162b
{
    public View j;
    public LiveNoShrinkTextView k;
    public KwaiCDNImageView l;
    public KwaiCDNImageView m;
    public View n;
    public final p o;
    public final p p;
    public final d q;
    public final b r;
    public final b s;
    public final CohesionPkInfo t;
    public final c u;
    public final a v;
    public final a w;

    public void LiveMultiPkCohesionVoteBangsVC(d p0,b p1,b p2,CohesionPkInfo p3,c p4,a p5,a p6){
       a.p(p0, "countDownModel");
       a.p(p1, "coreModel");
       a.p(p2, "gameModel");
       a.p(p4, "pkContainerLayout");
       a.p(p5, "isAnchorSide");
       a.p(p6, "logDelegate");
       super();
       this.q = p0;
       this.r = p1;
       this.s = p2;
       this.t = p3;
       this.u = p4;
       this.v = p5;
       this.w = p6;
       this.o = new ViewModelLazy(m0.d(j.class), new LiveMultiPkCohesionVoteBangsVC$$special$$inlined$viewModels$2(new LiveMultiPkCohesionVoteBangsVC$$special$$inlined$viewModels$1(this)), new LiveMultiPkCohesionVoteBangsVC$countDownViewModel$2(this));
       this.p = new ViewModelLazy(m0.d(a.class), new LiveMultiPkCohesionVoteBangsVC$$special$$inlined$viewModels$4(new LiveMultiPkCohesionVoteBangsVC$$special$$inlined$viewModels$3(this)), new LiveMultiPkCohesionVoteBangsVC$bangsViewModel$2(this));
    }
    public View B1(ViewGroup p0){
       a b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveMultiPkCohesionVoteBangsVC liveMultiPkC = LiveMultiPkCohesionVoteBangsVC.class;
       LiveMultiPkCohesionVoteBangsVC obj = PatchProxy.applyOneRefs(p0, this, liveMultiPkC, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "parentViewGroup");
       obj = this.j;
       if (obj != null) {
          return obj;
       }
       Context context = p0.getContext();
       a.o(context, "parentViewGroup.context");
       View view = PatchProxy.applyOneRefs(context, this, liveMultiPkC, "6");
       Object[] objArray = null;
       if (view != patchProxyRe) {
       }else {
          int i = 2;
          KwaiCDNImageView kwaiCDNImage = new KwaiCDNImageView(context, objArray, i, objArray);
          kwaiCDNImage.setLayoutParams(new ViewGroup$LayoutParams(a1.e(16.00f), a1.e(16.00f)));
          this.l = kwaiCDNImage;
          kwaiCDNImage = new KwaiCDNImageView(context, objArray, i, objArray);
          kwaiCDNImage.setLayoutParams(new ViewGroup$LayoutParams(a1.e(44.00f), a1.e(11.00f)));
          this.m = kwaiCDNImage;
          a hierarchy = kwaiCDNImage.getHierarchy();
          if (hierarchy != null) {
             hierarchy.u(t$b.a);
          }
          this.k = d.b(context);
          if (this.v.invoke().booleanValue()) {
             this.n = d.a(context, 0x7f102934);
          }
          view = c.d(c.d(c.d(new c(context), this.l, objArray, i, objArray), this.m, objArray, i, objArray).a(R.string.arg_RES_7f1025b9, a1.e(20.00f)), this.k, objArray, i, objArray).c(this.n, Boolean.TRUE).e();
       }
       this.j = view;
       j oj = this.V2();
       String obj1 = PatchProxy.apply(objArray, this, liveMultiPkC, "2");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = this.p.getValue();
       }
       if (!PatchProxy.applyVoidTwoRefs(oj, obj1, this, liveMultiPkC, "5")) {
          LiveMultiPkCohesionVoteBangsVC tk = this.k;
          if (tk != null) {
             g.a(tk, this, oj.u0());
          }
          oj.v0().observe(this, new c(this));
          tk = this.l;
          if (tk != null) {
             b.b(tk, this, obj1.u0());
          }
          tk = this.m;
          if (tk != null) {
             b = obj1.b;
             if (!PatchProxy.applyVoidThreeRefs(tk, this, b, null, b.class, "2")) {
                obj1 = "$this$bindUrl";
                a.p(tk, obj1);
                a.p(this, "livecycleOwner");
                a.p(b, "url");
                KwaiImageViewBinder$bindUrl$2 iNSTANCE = KwaiImageViewBinder$bindUrl$2.INSTANCE;
                if (!PatchProxy.applyVoidFourRefs(tk, this, b, iNSTANCE, null, b.class, "1")) {
                   a.p(tk, obj1);
                   a.p(this, "livecycleOwner");
                   a.p(b, "url");
                   a.p(iNSTANCE, "mapper");
                   b.observe(this, new c(tk, iNSTANCE));
                }
             }
          }
          tk = this.n;
          if (tk != null) {
             tk.setOnClickListener(new d(oj));
          }
          a uoa = this.s.q();
          if (uoa != null) {
             String str = uoa.b();
             if (str != null) {
                tk = this.j;
                if (tk != null) {
                   tk.setOnClickListener(new b(str, this));
                }
             }
          }
       }
    label_0178 :
       return view;
    }
    public void D(){
       d.a(this);
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkCohesionVoteBangsVC.class, "3")) {
          return;
       }
       this.V2().w0().observe(this, new LiveMultiPkCohesionVoteBangsVC$a(this));
       return;
    }
    public final j V2(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkCohesionVoteBangsVC.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.o.getValue();
    }
    public int getPriority(){
       return 2;
    }
    public void onShow(){
       d.b(this);
    }
    public LiveMultiPKAreaType w1(){
       return LiveMultiPKAreaType.BANGS;
    }
}
