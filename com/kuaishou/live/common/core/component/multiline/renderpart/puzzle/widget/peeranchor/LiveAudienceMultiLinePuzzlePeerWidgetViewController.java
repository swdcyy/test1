package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.peeranchor.LiveAudienceMultiLinePuzzlePeerWidgetViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import j83.b;
import es1.a;
import msd.p;
import msd.a;
import sq1.a;
import sz1.e;
import xp5.i;
import ls1.d;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import mr1.b;
import android.content.Context;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.peeranchor.LiveAudienceMultiLinePuzzlePeerWidgetViewController$onCreate$1;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.peeranchor.LiveAudienceMultiLinePuzzlePeerWidgetViewController$onCreate$2;
import androidx.lifecycle.LifecycleOwner;
import android.view.View;
import java.util.Objects;
import android.view.ViewGroup;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.widget.LiveMultiLineWidgetUserTagDataBinding;
import com.yxcorp.plugin.live.widget.LiveMediumTextView;
import qrd.l1;
import fs1.b;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.peeranchor.LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding;
import kr1.b;

public final class LiveAudienceMultiLinePuzzlePeerWidgetViewController extends ViewController	// class@0015bf
{
    public LiveMultiLineWidgetUserTagDataBinding j;
    public final b k;
    public final a l;
    public final p m;
    public final a n;
    public final a o;
    public final e p;
    public final i q;
    public final d r;
    public final l s;

    public void LiveAudienceMultiLinePuzzlePeerWidgetViewController(b p0,a p1,p p2,a p3,a p4,e p5,i p6,d p7,l p8){
       a.p(p0, "widgetModel");
       a.p(p1, "puzzleWidgetModel");
       a.p(p2, "updatePositionCallback");
       a.p(p3, "minWidgetWidthSupplier");
       a.p(p4, "roomDelegate");
       a.p(p5, "liveMultiInteractManager");
       a.p(p6, "liveLogPackageProvider");
       a.p(p7, "multiLineResourceManager");
       a.p(p8, "logClickPuzzleCard");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.o = p4;
       this.p = p5;
       this.q = p6;
       this.r = p7;
       this.s = p8;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiLinePuzzlePeerWidgetViewController.class, "1")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0a30);
       b uob = new b(this.D2(), this, this.m, this.o, new LiveAudienceMultiLinePuzzlePeerWidgetViewController$onCreate$1(this), new LiveAudienceMultiLinePuzzlePeerWidgetViewController$onCreate$2(this));
       View view = this.P2();
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
       v0.a(view, this.k, 267);
       LiveMultiLineWidgetUserTagDataBinding liveMultiLin = new LiveMultiLineWidgetUserTagDataBinding(this, this.o, this.p, this.q);
       LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding View view1 = this.P2().findViewById(R.id.live_multi_line_user_tag);
       a.o(view1, "requireContentView\(\).fin¡­live_multi_line_user_tag\)");
       liveMultiLin.a(this.k, view1);
       this.j = liveMultiLin;
       View view2 = this.P2();
       Objects.requireNonNull(view2, "null cannot be cast to non-null type android.view.ViewGroup");
       b uob1 = new b(view2, this.k, this.n, this.l);
       view2 = this.P2();
       Objects.requireNonNull(view2, "null cannot be cast to non-null type android.view.ViewGroup");
       view1 = new LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding(this.l, this, view2, this.k, this.o, this.r, uob1, this.s);
       return;
    }
}
