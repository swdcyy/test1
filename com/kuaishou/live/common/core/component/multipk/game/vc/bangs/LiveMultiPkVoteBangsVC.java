package com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkVoteBangsVC;
import ws1.e;
import com.kuaishou.live.viewcontroller.ViewController;
import ut1.d;
import zs1.b;
import ft1.b;
import ws1.c;
import st1.a;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkVoteBangsVC$countDownViewModel$2;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkVoteBangsVC$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import lt1.j;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkVoteBangsVC$$special$$inlined$viewModels$2;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ws1.d;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkVoteBangsVC$d;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import android.widget.TextView;
import xh3.g;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkVoteBangsVC$a;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkVoteBangsVC$b;
import android.view.View$OnClickListener;
import qrd.p;
import android.content.Context;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import android.util.AttributeSet;
import nsd.u;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import android.widget.ImageView;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkVoteBangsVC$c;
import com.yxcorp.plugin.live.widget.LiveNoShrinkTextView;
import lt1.d;
import java.lang.Boolean;
import lt1.c;
import com.kuaishou.live.common.core.component.multipk.logger.LiveMultiPkLogType;
import st1.c;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import st1.e;
import com.kuaishou.live.common.core.component.multipk.container.LiveMultiPKAreaType;

public class LiveMultiPkVoteBangsVC extends ViewController implements e	// class@00161e
{
    public View j;
    public LiveNoShrinkTextView k;
    public View l;
    public final p m;
    public final d n;
    public final b o;
    public final b p;
    public final c q;
    public final a r;
    public final a s;

    public void LiveMultiPkVoteBangsVC(d p0,b p1,b p2,c p3,a p4,a p5){
       a.p(p0, "countDownModel");
       a.p(p1, "coreModel");
       a.p(p2, "gameModel");
       a.p(p3, "pkContainerLayout");
       a.p(p4, "logDelegate");
       a.p(p5, "isAnchorSide");
       super();
       this.n = p0;
       this.o = p1;
       this.p = p2;
       this.q = p3;
       this.r = p4;
       this.s = p5;
       this.m = new ViewModelLazy(m0.d(j.class), new LiveMultiPkVoteBangsVC$$special$$inlined$viewModels$2(new LiveMultiPkVoteBangsVC$$special$$inlined$viewModels$1(this)), new LiveMultiPkVoteBangsVC$countDownViewModel$2(this));
    }
    public View B1(ViewGroup p0){
       LiveMultiPkVoteBangsVC obj = PatchProxy.applyOneRefs(p0, this, LiveMultiPkVoteBangsVC.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parentViewGroup");
       obj = this.j;
       if (obj != null) {
          return obj;
       }
       View view = this.X2(p0);
       this.j = view;
       this.V2(this.W2());
       return view;
    }
    public void D(){
       d.a(this);
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkVoteBangsVC.class, "2")) {
          return;
       }
       this.W2().w0().observe(this, new LiveMultiPkVoteBangsVC$d(this));
       return;
    }
    public void V2(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkVoteBangsVC.class, "5")) {
          return;
       }
       a.p(p0, "viewModel");
       LiveMultiPkVoteBangsVC tk = this.k;
       if (tk != null) {
          g.a(tk, this, p0.u0());
       }
       p0.v0().observe(this, new LiveMultiPkVoteBangsVC$a(this));
       tk = this.l;
       if (tk != null) {
          tk.setOnClickListener(new LiveMultiPkVoteBangsVC$b(p0));
       }
       return;
    }
    public final j W2(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkVoteBangsVC.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m.getValue();
    }
    public View X2(ViewGroup p0){
       KwaiCDNImageView obj = PatchProxy.applyOneRefs(p0, this, LiveMultiPkVoteBangsVC.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parent");
       Context context = p0.getContext();
       a.o(context, "context");
       AttributeSet uAttributeSe = null;
       obj = new KwaiCDNImageView(context, uAttributeSe, 2, uAttributeSe);
       obj.setLayoutParams(new ViewGroup$LayoutParams(-2, a1.e(10.00f)));
       this.W2().d.observe(this, new LiveMultiPkVoteBangsVC$c(obj));
       this.k = d.b(context);
       if (this.s.invoke().booleanValue()) {
          this.l = d.a(context, 0x7f102934);
       }
       return c.d(c.d(new c(context), obj, uAttributeSe, 2, uAttributeSe), this.k, uAttributeSe, 2, uAttributeSe).c(this.l, Boolean.TRUE).e();
    }
    public int getPriority(){
       return 2;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkVoteBangsVC.class, "4")) {
          return;
       }
       if (!this.p.n()) {
          this.p.u(true);
          e.b(LiveMultiPkLogType.SHOW, "EXIT", this.r.l(), this.r.i(), this.r.a());
       }
       return;
    }
    public LiveMultiPKAreaType w1(){
       return LiveMultiPKAreaType.BANGS;
    }
}
