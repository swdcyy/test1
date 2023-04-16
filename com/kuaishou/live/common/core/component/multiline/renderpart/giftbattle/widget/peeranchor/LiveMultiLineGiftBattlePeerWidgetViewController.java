package com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.widget.peeranchor.LiveMultiLineGiftBattlePeerWidgetViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import j83.b;
import tr1.a;
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
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.widget.peeranchor.LiveMultiLineGiftBattlePeerWidgetViewController$onCreate$1;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.widget.peeranchor.LiveMultiLineGiftBattlePeerWidgetViewController$onCreate$2;
import androidx.lifecycle.LifecycleOwner;
import msd.l;
import android.view.View;
import java.util.Objects;
import android.view.ViewGroup;
import ur1.c;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.widget.peeranchor.LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding;
import kr1.b;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.widget.LiveMultiLineWidgetUserTagDataBinding;
import com.yxcorp.plugin.live.widget.LiveMediumTextView;
import qrd.l1;
import wr1.e;
import androidx.lifecycle.LiveData;

public final class LiveMultiLineGiftBattlePeerWidgetViewController extends ViewController	// class@00157f
{
    public LiveMultiLineWidgetUserTagDataBinding j;
    public final b k;
    public final a l;
    public final p m;
    public final a n;
    public final a o;
    public final e p;
    public final i q;

    public void LiveMultiLineGiftBattlePeerWidgetViewController(b p0,a p1,p p2,a p3,a p4,e p5,i p6){
       a.p(p0, "widgetBasicModel");
       a.p(p1, "widgetGiftBattleModel");
       a.p(p2, "updatePositionCallback");
       a.p(p3, "minWidgetWidthSupplier");
       a.p(p4, "roomDelegate");
       a.p(p5, "liveMultiInteractManager");
       a.p(p6, "liveLogPackageProvider");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.o = p4;
       this.p = p5;
       this.q = p6;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, LiveMultiLineGiftBattlePeerWidgetViewController.class, "1")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0a2a);
       b uob = new b(this.D2(), this, this.m, this.o, new LiveMultiLineGiftBattlePeerWidgetViewController$onCreate$1(this), new LiveMultiLineGiftBattlePeerWidgetViewController$onCreate$2(this));
       View view = this.P2();
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
       View view1 = view;
       b.b(v0, view1, this.k, 0, 4, null);
       View view2 = this.P2();
       Objects.requireNonNull(view2, "null cannot be cast to non-null type android.view.ViewGroup");
       c uoc = new c(view2, this.k, this.l, this.n);
       view2 = this.P2();
       Objects.requireNonNull(view2, "null cannot be cast to non-null type android.view.ViewGroup");
       LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding liveMultiLin = new LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding(view2, this, this.k, this.l, this.o, uoc);
       LiveMultiLineWidgetUserTagDataBinding liveMultiLin1 = new LiveMultiLineWidgetUserTagDataBinding(this, this.o, this.p, this.q);
       view1 = this.P2().findViewById(R.id.live_multi_line_user_tag);
       a.o(view1, "requireContentView\(\).fin¡­live_multi_line_user_tag\)");
       liveMultiLin1.a(this.k, view1);
       this.j = liveMultiLin1;
       view2 = this.P2();
       Objects.requireNonNull(view2, "null cannot be cast to non-null type android.view.ViewGroup");
       this.y2(view2, new e(this.l.a()));
       return;
    }
}
