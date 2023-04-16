package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.other.LiveAudienceMultiLineArenaLineOtherWidgetController;
import com.kuaishou.live.viewcontroller.ViewController;
import xp5.g;
import com.kuaishou.live.common.core.component.multiline.model.a;
import j83.b;
import dr1.f;
import msd.p;
import er1.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.LiveMultiLineArenaLineMemberModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.other.LiveAudienceMultiLineArenaLineOtherWidgetController$arenaMemberModel$1;
import msd.a;
import zq1.k;
import androidx.lifecycle.ViewModelProvider;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.other.LiveAudienceMultiLineArenaLineOtherWidgetController$a;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewGroup;
import tq1.b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import yq1.c;
import androidx.lifecycle.Observer;
import zq1.c;
import zq1.e;
import yq1.a;
import java.util.Objects;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.score.LiveMultiLineArenaLineOtherScoreViewModel;
import androidx.lifecycle.ViewModel;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.ordertag.LiveAudienceMultiLineArenaLineOrderTagViewModel;
import zq1.d;
import java.lang.Boolean;
import wq1.a;
import com.kuaishou.live.common.core.component.multiline.view.icontext.LiveMultiLineIconTextView;
import ms1.a;
import ms1.b;
import android.widget.TextView;
import xh3.l;
import xh3.g;
import zq1.j;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.userinfo.LiveAudienceMultiLineUserInfoViewModel;

public final class LiveAudienceMultiLineArenaLineOtherWidgetController extends ViewController	// class@001514
{
    public final LiveMultiLineArenaLineMemberModel j;
    public e k;
    public ViewController l;
    public ViewGroup m;
    public final k n;
    public final ViewModelProvider o;
    public final a p;
    public final b q;
    public final f r;
    public final p s;
    public final c t;

    public void LiveAudienceMultiLineArenaLineOtherWidgetController(g p0,a p1,b p2,f p3,p p4,c p5){
       a.p(p0, "liveInfoManager");
       a.p(p1, "participantInfo");
       a.p(p2, "widgetBasicModel");
       a.p(p3, "arenaLineModel");
       a.p(p4, "updatePositionCallback");
       a.p(p5, "arenaWidgetDelegate");
       super();
       this.p = p1;
       this.q = p2;
       this.r = p3;
       this.s = p4;
       this.t = p5;
       String str = p1.a();
       a.o(str, "participantInfo.cellInfoId");
       LiveMultiLineArenaLineMemberModel liveMultiLin = new LiveMultiLineArenaLineMemberModel(TextUtils.n(p1.a(), p0.d()), str, p3, LiveAudienceMultiLineArenaLineOtherWidgetController$arenaMemberModel$1.INSTANCE, false);
       this.j = p2;
       this.n = new k();
       this.o = new ViewModelProvider(this, new LiveAudienceMultiLineArenaLineOtherWidgetController$a(this));
    }
    public void F2(){
       boolean b;
       ViewGroup viewGroup = this;
       LiveAudienceMultiLineArenaLineOtherWidgetController liveAudience = LiveAudienceMultiLineArenaLineOtherWidgetController.class;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, viewGroup, liveAudience, str)) {
          return;
       }
       viewGroup.Q2(R.layout.arg_RES_7f0d0a22);
       View view = this.P2().findViewById(R.id.live_audience_multi_line_audio_state_container);
       a.o(view, "requireContentView\(\).fin¡­ne_audio_state_container\)");
       viewGroup.m = view;
       String str1 = "3";
       if (!PatchProxy.applyVoid(objArray, viewGroup, liveAudience, str1)) {
          String str2 = viewGroup.p.a();
          a.o(str2, "participantInfo.cellInfoId");
          b.a.a(this.P2(), str2, viewGroup, viewGroup.r);
       }
       if (!PatchProxy.applyVoid(objArray, viewGroup, liveAudience, "4")) {
          viewGroup.q.f().observe(viewGroup, new c(viewGroup));
       }
       c uoc = new c(this.P2());
       viewGroup.k = uoc;
       viewGroup.n.g(uoc);
       View view1 = this.P2();
       Objects.requireNonNull(view1, "null cannot be cast to non-null type android.view.ViewGroup");
       LiveAudienceMultiLineArenaLineOtherWidgetController k = viewGroup.k;
       if (k == null) {
          a.S("bottomInfoViewHolder");
       }
       a uoa = new a(view1, k, viewGroup.s, viewGroup.t);
       b = viewGroup.j.f();
       LiveAudienceMultiLineArenaLineOtherWidgetController q = viewGroup.q;
       ViewModel viewModel = viewGroup.o.get(LiveMultiLineArenaLineOtherScoreViewModel.class);
       a.o(viewModel, "viewModelProvider.get\(Li¡­oreViewModel::class.java\)");
       ViewModel viewModel1 = viewModel;
       viewModel = viewGroup.o.get(LiveAudienceMultiLineArenaLineOrderTagViewModel.class);
       a.o(viewModel, "viewModelProvider.get\(Li¡­TagViewModel::class.java\)");
       ViewModel viewModel2 = viewModel;
       viewModel = viewGroup.o.get(d.class);
       a.o(viewModel, "viewModelProvider.get\(Li¡­nfoViewModel::class.java\)");
       ViewModel viewModel3 = viewModel;
       if (PatchProxy.isSupport(a.class)) {
          Object[] objArray1 = new Object[]{viewGroup,Boolean.valueOf(b),q,viewModel1,viewModel2,viewModel3};
          if (!PatchProxy.applyVoid(objArray1, uoa, a.class, str)) {
          label_00ec :
             a.p(viewGroup, "lifecycleOwner");
             a.p(q, "widgetBasicModel");
             a.p(viewModel1, "scoreViewModel");
             a.p(viewModel2, "orderTagViewModel");
             a.p(viewModel3, "userInfoViewModel");
             if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(this, Boolean.valueOf(b), q, uoa, a.class, "2")) {
                new a(uoa.a, uoa.c, uoa.d).a(viewGroup, b, q);
             }
             if (!PatchProxy.applyVoidTwoRefs(viewGroup, viewModel1, uoa, a.class, str1)) {
                LiveMultiLineIconTextView liveMultiLin = uoa.a.findViewById(R.id.multi_line_arena_score_view);
                a.o(liveMultiLin, "scoreView");
                b.a(liveMultiLin, viewGroup, viewModel1);
             }
             if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(this, Boolean.valueOf(b), viewModel2, uoa, a.class, "4")) {
                View view2 = uoa.a.findViewById(R.id.multi_line_arena_order_container);
                view = uoa.a.findViewById(0x7f0a2c42);
                View view3 = uoa.a.findViewById(0x7f0a2c40);
                a.o(view2, "orderContainer");
                l.d(view2, viewGroup, viewModel2.w0(), 1);
                a.o(view3, "orderView");
                g.a(view3, viewGroup, viewModel2.v0());
                a.o(view, "orderSelfTag");
                b.a.c(b, view2, view, view3, this, viewModel2.u0());
             }
             if (!PatchProxy.applyVoidThreeRefs(this, q, viewModel3, uoa, a.class, "5")) {
                new j(268, 269, uoa.b).a(viewGroup, q, viewModel3);
                l.e(uoa.b.e(), this, viewModel3.v0(), false, 4, null);
             }
          }
       }else {
          goto label_00ec ;
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiLineArenaLineOtherWidgetController.class, "2")) {
          return;
       }
       this.j.g();
       this.n.i();
       return;
    }
}
