package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.actor.LiveAudienceMultiLineArenaLineActorWidgetController;
import com.kuaishou.live.viewcontroller.ViewController;
import xp5.g;
import com.kuaishou.live.common.core.component.multiline.model.a;
import j83.b;
import dr1.f;
import msd.p;
import er1.c;
import xp5.i;
import oq1.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.LiveMultiLineArenaLineMemberModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.actor.LiveAudienceMultiLineArenaLineActorWidgetController$arenaMemberModel$1;
import msd.a;
import zq1.k;
import androidx.lifecycle.ViewModelProvider;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.actor.LiveAudienceMultiLineArenaLineActorWidgetController$b;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tq1.b;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import zq1.c;
import zq1.e;
import xq1.a;
import java.util.Objects;
import android.view.ViewGroup;
import gr1.b;
import androidx.lifecycle.ViewModel;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.ordertag.LiveAudienceMultiLineArenaLineOrderTagViewModel;
import zq1.d;
import java.lang.Boolean;
import wq1.a;
import com.kuaishou.live.common.core.component.multiline.view.icontext.LiveMultiLineIconTextView;
import ms1.a;
import ms1.b;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import xh3.l;
import xh3.g;
import zq1.j;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.userinfo.LiveAudienceMultiLineUserInfoViewModel;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.actor.LiveAudienceMultiLineArenaLineActorWidgetController$a;
import androidx.lifecycle.Observer;

public final class LiveAudienceMultiLineArenaLineActorWidgetController extends ViewController	// class@001510
{
    public final LiveMultiLineArenaLineMemberModel j;
    public e k;
    public final k l;
    public final ViewModelProvider m;
    public ViewController n;
    public ViewController o;
    public final g p;
    public final a q;
    public final b r;
    public final f s;
    public final p t;
    public final c u;
    public final i v;
    public final b w;

    public void LiveAudienceMultiLineArenaLineActorWidgetController(g p0,a p1,b p2,f p3,p p4,c p5,i p6,b p7){
       a.p(p0, "liveInfoManager");
       a.p(p1, "participantInfo");
       a.p(p2, "widgetBasicModel");
       a.p(p3, "arenaLineModel");
       a.p(p4, "updatePositionCallback");
       a.p(p5, "arenaWidgetDelegate");
       a.p(p6, "liveLogPackageProvider");
       a.p(p7, "lineLogParamsProvider");
       super();
       this.p = p0;
       this.q = p1;
       this.r = p2;
       this.s = p3;
       this.t = p4;
       this.u = p5;
       this.v = p6;
       this.w = p7;
       String str = p1.a();
       a.o(str, "participantInfo.cellInfoId");
       LiveMultiLineArenaLineMemberModel liveMultiLin = new LiveMultiLineArenaLineMemberModel(TextUtils.n(p1.a(), p0.d()), str, p3, LiveAudienceMultiLineArenaLineActorWidgetController$arenaMemberModel$1.INSTANCE, true);
       this.j = p2;
       this.l = new k();
       this.m = new ViewModelProvider(this, new LiveAudienceMultiLineArenaLineActorWidgetController$b(this));
    }
    public void F2(){
       boolean b;
       LiveAudienceMultiLineArenaLineActorWidgetController liveAudience = LiveAudienceMultiLineArenaLineActorWidgetController.class;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, liveAudience, str)) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0a22);
       if (!PatchProxy.applyVoid(objArray, this, liveAudience, "5")) {
          String str1 = this.q.a();
          a.o(str1, "participantInfo.cellInfoId");
          b.a.a(this.P2(), str1, this, this.s);
       }
       c uoc = new c(this.P2());
       this.k = uoc;
       this.l.g(uoc);
       View view = this.P2();
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
       LiveAudienceMultiLineArenaLineActorWidgetController tk = this.k;
       if (tk == null) {
          a.S("bottomInfoViewHolder");
       }
       a uoa = new a(view, tk, this.t, this.u);
       b = this.j.f();
       LiveAudienceMultiLineArenaLineActorWidgetController tr = this.r;
       ViewModel viewModel = this.m.get(b.class);
       a.o(viewModel, "viewModelProvider.get\(Li¡­oreViewModel::class.java\)");
       ViewModel viewModel1 = viewModel;
       viewModel = this.m.get(LiveAudienceMultiLineArenaLineOrderTagViewModel.class);
       a.o(viewModel, "viewModelProvider.get\(Li¡­TagViewModel::class.java\)");
       ViewModel viewModel2 = viewModel;
       viewModel = this.m.get(d.class);
       a.o(viewModel, "viewModelProvider.get\(Li¡­nfoViewModel::class.java\)");
       ViewModel viewModel3 = viewModel;
       if (PatchProxy.isSupport(a.class)) {
          Object[] objArray1 = new Object[]{this,Boolean.valueOf(b),tr,viewModel1,viewModel2,viewModel3};
          if (!PatchProxy.applyVoid(objArray1, uoa, a.class, str)) {
          label_00bf :
             a.p(this, "lifecycleOwner");
             a.p(tr, "widgetBasicModel");
             a.p(viewModel1, "scoreViewModel");
             a.p(viewModel2, "orderTagViewModel");
             a.p(viewModel3, "userInfoViewModel");
             if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(this, Boolean.valueOf(b), tr, uoa, a.class, "2")) {
                new a(uoa.a, uoa.c, uoa.d).a(this, b, tr);
             }
             if (!PatchProxy.applyVoidTwoRefs(this, viewModel1, uoa, a.class, "3")) {
                LiveMultiLineIconTextView liveMultiLin = uoa.a.findViewById(R.id.multi_line_arena_score_view);
                a.o(liveMultiLin, "scoreView");
                b.a(liveMultiLin, this, viewModel1);
             }
             if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(this, Boolean.valueOf(b), viewModel2, uoa, a.class, "4")) {
                View view1 = uoa.a.findViewById(R.id.multi_line_arena_order_container);
                View view2 = uoa.a.findViewById(0x7f0a2c42);
                View view3 = uoa.a.findViewById(0x7f0a2c40);
                a.o(view1, "orderContainer");
                l.d(view1, this, viewModel2.w0(), 1);
                a.o(view3, "orderView");
                g.a(view3, this, viewModel2.v0());
                a.o(view2, "orderSelfTag");
                b.a.c(b, view1, view2, view3, this, viewModel2.u0());
             }
             if (!PatchProxy.applyVoidThreeRefs(this, tr, viewModel3, uoa, a.class, "5")) {
                new j(268, 269, uoa.b).a(this, tr, viewModel3);
                l.e(uoa.b.e(), this, viewModel3.v0(), false, 4, null);
             }
          }
       }else {
          goto label_00bf ;
       }
       this.s.e().observe(this, new LiveAudienceMultiLineArenaLineActorWidgetController$a(this));
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiLineArenaLineActorWidgetController.class, "2")) {
          return;
       }
       this.j.g();
       this.l.i();
       return;
    }
}
