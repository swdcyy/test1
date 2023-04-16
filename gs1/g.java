package gs1.g;
import com.kuaishou.live.viewcontroller.ViewController;
import j83.b;
import es1.a;
import msd.p;
import sq1.a;
import sz1.e;
import xp5.i;
import ls1.d;
import gs1.a;
import msd.a;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import nr1.a;
import androidx.lifecycle.LifecycleOwner;
import android.view.View;
import java.util.Objects;
import android.view.ViewGroup;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.widget.LiveMultiLineWidgetUserTagDataBinding;
import com.yxcorp.plugin.live.widget.LiveMediumTextView;
import qrd.l1;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.selfanchor.LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding;
import com.kwai.library.widget.popup.common.c;
import e93.f;

public final class g extends ViewController	// class@002575
{
    public LiveMultiLineWidgetUserTagDataBinding j;
    public LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding k;
    public final b l;
    public final a m;
    public final p n;
    public final a o;
    public final e p;
    public final i q;
    public final d r;
    public final a s;
    public final a t;
    public final l u;

    public void g(b p0,a p1,p p2,a p3,e p4,i p5,d p6,a p7,a p8,l p9){
       a.p(p0, "widgetBasicModel");
       a.p(p1, "puzzleWidgetModel");
       a.p(p2, "updatePositionCallback");
       a.p(p3, "roomDelegate");
       a.p(p4, "liveMultiInteractManager");
       a.p(p5, "liveLogPackageProvider");
       a.p(p6, "multiLineResourceManager");
       a.p(p7, "puzzleSelfWidgetModel");
       a.p(p8, "getMultiLineChatId");
       a.p(p9, "logClickPuzzleCard");
       super();
       this.l = p0;
       this.m = p1;
       this.n = p2;
       this.o = p3;
       this.p = p4;
       this.q = p5;
       this.r = p6;
       this.s = p7;
       this.t = p8;
       this.u = p9;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0a31);
       View view = this.P2();
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
       new a(this, this.n).a(view, this.l);
       LiveMultiLineWidgetUserTagDataBinding liveMultiLin = new LiveMultiLineWidgetUserTagDataBinding(this, this.o, this.p, this.q);
       View view1 = this.P2().findViewById(R.id.live_multi_line_user_tag);
       a.o(view1, "requireContentView\(\).fin¡­live_multi_line_user_tag\)");
       liveMultiLin.a(this.l, view1);
       this.j = liveMultiLin;
       view = this.P2();
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
       LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding liveAudience = new LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding(view, this, this.m, this.o, this.r, this.u, this.s, this.t);
       this.k = liveMultiLin;
       return;
    }
    public void J2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g.class, "2")) {
          return;
       }
       g tk = this.k;
       if (tk == null) {
          a.S("selfPuzzleWidgetDataBinding");
       }
       Objects.requireNonNull(tk);
       if (!PatchProxy.applyVoid(objArray, tk, LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding.class, "10")) {
          LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding h = tk.h;
          if (h != null) {
             h.o();
          }
          f.g(tk);
       }
       return;
    }
}
