package com.kuaishou.live.common.core.component.multipk.playfashion.critmoment.LiveMultiPkCritMomentBangsVC;
import ws1.e;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.common.core.component.multipk.playfashion.critmoment.LiveMultiPkCritMomentBangsVC$a;
import nsd.u;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkCritMoment;
import ft1.b;
import msd.a;
import ws1.c;
import st1.a;
import ht1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multipk.playfashion.critmoment.LiveMultiPkCritMomentBangsVC$countDownViewModel$2;
import com.kuaishou.live.common.core.component.multipk.playfashion.critmoment.LiveMultiPkCritMomentBangsVC$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import xt1.e;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.multipk.playfashion.critmoment.LiveMultiPkCritMomentBangsVC$$special$$inlined$viewModels$2;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.view.LayoutInflater;
import ag6.a;
import java.util.Objects;
import com.kuaishou.live.widget.LivePkShimmerLayout;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import lnc.a1;
import ekd.p1;
import java.util.concurrent.TimeUnit;
import com.kuaishou.live.common.core.basic.degrade.j;
import qrd.p;
import androidx.lifecycle.LiveData;
import xt1.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkResourceTypes;
import pu1.d;
import xt1.c;
import ws1.d;
import android.animation.ObjectAnimator;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.common.core.component.multipk.container.LiveMultiPKAreaType;

public final class LiveMultiPkCritMomentBangsVC extends ViewController implements e	// class@00165e
{
    public LivePkShimmerLayout j;
    public KwaiImageView k;
    public TextView l;
    public TextView m;
    public ObjectAnimator n;
    public final p o;
    public final LiveMultiPkCritMoment p;
    public final b q;
    public final a r;
    public final c s;
    public final boolean t;
    public final a u;
    public final a v;
    public static final LiveMultiPkCritMomentBangsVC$a w;

    static {
       LiveMultiPkCritMomentBangsVC.w = new LiveMultiPkCritMomentBangsVC$a(null);
    }
    public void LiveMultiPkCritMomentBangsVC(LiveMultiPkCritMoment p0,b p1,a p2,c p3,boolean p4,a p5,a p6){
       a.p(p0, "critMoment");
       a.p(p1, "gameModel");
       a.p(p2, "serverTime");
       a.p(p3, "pkContainerLayout");
       a.p(p5, "pkLogDelegate");
       a.p(p6, "skinManager");
       super();
       this.p = p0;
       this.q = p1;
       this.r = p2;
       this.s = p3;
       this.t = p4;
       this.u = p5;
       this.v = p6;
       this.o = new ViewModelLazy(m0.d(e.class), new LiveMultiPkCritMomentBangsVC$$special$$inlined$viewModels$2(new LiveMultiPkCritMomentBangsVC$$special$$inlined$viewModels$1(this)), new LiveMultiPkCritMomentBangsVC$countDownViewModel$2(this));
    }
    public static final TextView V2(LiveMultiPkCritMomentBangsVC p0){
       p0 = p0.m;
       if (p0 == null) {
          a.S("countDownRightTextView");
       }
       return p0;
    }
    public static final TextView W2(LiveMultiPkCritMomentBangsVC p0){
       p0 = p0.l;
       if (p0 == null) {
          a.S("countDownTimeTextView");
       }
       return p0;
    }
    public View B1(ViewGroup p0){
       LiveMultiPkCritMomentBangsVC tl;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveMultiPkCritMomentBangsVC liveMultiPkC = LiveMultiPkCritMomentBangsVC.class;
       LiveMultiPkCritMomentBangsVC obj = PatchProxy.applyOneRefs(p0, this, liveMultiPkC, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "parentViewGroup");
       obj = this.j;
       if (obj != null) {
          return obj;
       }
       View view = PatchProxy.applyOneRefs(p0, this, liveMultiPkC, "6");
       if (view != patchProxyRe) {
       }else {
          View view1 = a.c(LayoutInflater.from(this.D2()), R.layout.arg_RES_7f0d0cbe, p0, false);
          Objects.requireNonNull(view1, "null cannot be cast to non-null type com.kuaishou.live.widget.LivePkShimmerLayout");
          view = view1;
          view1 = view.findViewById(R.id.live_multi_pk_crit_moment_rule_image_view);
          a.o(view1, "view.findViewById\(R.id.l¡­t_moment_rule_image_view\)");
          this.k = view1;
          view1 = view.findViewById(R.id.live_multi_pk_crit_moment_count_down_text_view);
          a.o(view1, "view.findViewById\(R.id.l¡­ent_count_down_text_view\)");
          this.l = view1;
          view1 = view.findViewById(R.id.live_multi_pk_count_down_right_text);
          a.o(view1, "view.findViewById\(R.id.l¡­pk_count_down_right_text\)");
          this.m = view1;
          if (this.t != null) {
             String str = "countDownRightTextView";
             if (view1 == null) {
                a.S(str);
             }
             view1.setVisibility(false);
             if (!PatchProxy.applyVoid(null, this, liveMultiPkC, "7")) {
                int i = a1.d(R.dimen.arg_RES_7f07025d);
                LiveMultiPkCritMomentBangsVC tm = this.m;
                if (tm == null) {
                   a.S(str);
                }
                p1.c(tm, false, i, false, i);
             }
          }
          this.j = view;
          j.i(view, 2, TimeUnit.SECONDS);
          e uoe = PatchProxy.apply(null, this, liveMultiPkC, "1");
          if (uoe == patchProxyRe) {
             uoe = this.o.getValue();
          }
          if (!PatchProxy.applyVoidOneRefs(uoe, this, liveMultiPkC, "8")) {
             if (this.t != null) {
                tl = this.l;
                if (tl == null) {
                   a.S("countDownTimeTextView");
                }
                tl.setZ(0x3f800000);
             }
             uoe.v0().observe(this, new a(this));
             tl = this.v;
             liveMultiPkC = this.k;
             if (liveMultiPkC == null) {
                a.S("countDownRuleView");
             }
             tl.d(liveMultiPkC, LiveMultiPkResourceTypes.GIFT_MOMENT_TIP_ICON);
             uoe.u0().observe(this, new c(this, uoe));
          }
       }
       return view;
    }
    public void D(){
       d.a(this);
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkCritMomentBangsVC.class, "2")) {
          return;
       }
       this.s.w(this);
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkCritMomentBangsVC.class, "3")) {
          return;
       }
       LiveMultiPkCritMomentBangsVC tn = this.n;
       if (tn != null) {
          tn.cancel();
       }
       this.s.n(this);
       return;
    }
    public int getPriority(){
       return 3;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkCritMomentBangsVC.class, "5")) {
          return;
       }
       LiveMultiPkCritMomentBangsVC tj = this.j;
       if (tj != null) {
          ViewGroup$LayoutParams layoutParams = tj.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.height = a1.d(0x7f070845);
          }
       }
       return;
    }
    public LiveMultiPKAreaType w1(){
       return LiveMultiPKAreaType.BANGS;
    }
}
