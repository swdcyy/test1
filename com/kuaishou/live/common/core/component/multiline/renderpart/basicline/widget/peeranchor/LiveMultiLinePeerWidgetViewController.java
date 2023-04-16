package com.kuaishou.live.common.core.component.multiline.renderpart.basicline.widget.peeranchor.LiveMultiLinePeerWidgetViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import j83.b;
import msd.p;
import msd.a;
import sq1.a;
import sz1.e;
import xp5.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import mr1.b;
import android.content.Context;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.widget.peeranchor.LiveMultiLinePeerWidgetViewController$onCreate$1;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.widget.peeranchor.LiveMultiLinePeerWidgetViewController$onCreate$2;
import androidx.lifecycle.LifecycleOwner;
import msd.l;
import android.view.View;
import java.util.Objects;
import android.view.ViewGroup;
import mr1.e;
import mr1.l;
import kr1.b;
import android.widget.TextView;
import ekd.m1;
import com.kuaishou.live.core.basic.widget.LiveKidLottieAnimationView;
import mr1.f;
import android.animation.Animator$AnimatorListener;
import com.airbnb.lottie.LottieAnimationView;
import androidx.lifecycle.LiveData;
import mr1.k;
import z0.a;
import androidx.lifecycle.Transformations;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.widget.peeranchor.LiveMultiLinePeerAnchorWidgetDataBinding$bindViewModel$2;
import msd.q;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import mr1.g;
import androidx.lifecycle.Observer;
import mr1.h;
import mr1.i;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import mr1.j;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.widget.LiveMultiLineWidgetUserTagDataBinding;
import com.yxcorp.plugin.live.widget.LiveMediumTextView;
import qrd.l1;

public final class LiveMultiLinePeerWidgetViewController extends ViewController	// class@00155e
{
    public LiveMultiLineWidgetUserTagDataBinding j;
    public final b k;
    public final p l;
    public final a m;
    public final a n;
    public final e o;
    public final i p;

    public void LiveMultiLinePeerWidgetViewController(b p0,p p1,a p2,a p3,e p4,i p5){
       a.p(p0, "widgetModel");
       a.p(p1, "updatePositionCallback");
       a.p(p2, "minWidgetWidthSupplier");
       a.p(p3, "roomDelegate");
       a.p(p4, "liveMultiInteractManager");
       a.p(p5, "liveLogPackageProvider");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.o = p4;
       this.p = p5;
    }
    public void F2(){
       View view2;
       l a;
       String str = "1";
       if (PatchProxy.applyVoid(null, this, LiveMultiLinePeerWidgetViewController.class, str)) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0a2c);
       b uob = new b(this.D2(), this, this.l, this.n, new LiveMultiLinePeerWidgetViewController$onCreate$1(this), new LiveMultiLinePeerWidgetViewController$onCreate$2(this));
       View view = this.P2();
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
       b.b(v0, view, this.k, 0, 4, null);
       view = this.P2();
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
       e uoe = new e(view, this.k, this.m);
       l ol = new l(this, uoe);
       View view1 = this.P2();
       Objects.requireNonNull(view1, "null cannot be cast to non-null type android.view.ViewGroup");
       LiveMultiLinePeerWidgetViewController tk = this.k;
       if (!PatchProxy.applyVoidTwoRefs(view1, tk, ol, l.class, str)) {
          a.p(view1, "rootView");
          a.p(tk, "widgetModel");
          view2 = view1.findViewById(R.id.multi_line_peer_name);
          a.o(view2, "rootView.findViewById\(R.id.multi_line_peer_name\)");
          view1 = m1.f(view1, R.id.multi_line_peer_follow_button);
          a.o(view1, "ViewBindUtils.bindWidget¡­_line_peer_follow_button\)");
          ol.a = view1;
          if (view1 == null) {
             a.S("followLottie");
          }
          view1.a(new f(ol));
          LiveData liveData = Transformations.map(tk.d(), k.a);
          a.o(liveData, "Transformations.map\(widg¡­yName\(it.mUserInfo\)\n    }");
          liveData = Transformations.distinctUntilChanged(liveData);
          a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
          LiveData liveData1 = Transformations.distinctUntilChanged(tk.a());
          a.o(liveData1, "Transformations.distinct¡­d\(widgetModel.muteStatus\)");
          liveData = LiveDataOperators.a(liveData, liveData1, tk.b(), new LiveMultiLinePeerAnchorWidgetDataBinding$bindViewModel$2(view2));
          liveData.observe(ol.b, new g(ol));
          tk.h().observe(ol.b, new h(ol, tk));
          a = ol.a;
          if (a == null) {
             a.S("followLottie");
          }
          a.setOnClickListener(new i(tk));
          tk.c().observe(ol.b, new j(ol));
       }
       LiveMultiLineWidgetUserTagDataBinding liveMultiLin = new LiveMultiLineWidgetUserTagDataBinding(this, this.n, this.o, this.p);
       view2 = this.P2().findViewById(R.id.live_multi_line_user_tag);
       a.o(view2, "requireContentView\(\).fin¡­live_multi_line_user_tag\)");
       liveMultiLin.a(this.k, view2);
       this.j = liveMultiLin;
       return;
    }
}
