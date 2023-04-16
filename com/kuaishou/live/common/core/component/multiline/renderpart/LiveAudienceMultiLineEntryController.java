package com.kuaishou.live.common.core.component.multiline.renderpart.LiveAudienceMultiLineEntryController;
import com.kuaishou.live.viewcontroller.ViewController;
import xp5.g;
import sz1.e;
import hf3.a;
import i81.g;
import sq1.a;
import xp5.i;
import jk1.f;
import gq1.o;
import mq5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lq1.c;
import lq1.b;
import com.kuaishou.live.common.core.component.multiline.renderpart.LiveAudienceMultiLineEntryController$liveMultiLineLayoutConfigLegacy$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.common.core.component.multiline.renderpart.LiveAudienceMultiLineEntryController$d;
import com.kuaishou.live.common.core.component.multiline.renderpart.LiveAudienceMultiLineEntryController$containerView$2;
import com.kuaishou.live.common.core.component.multiline.renderpart.LiveAudienceMultiLineEntryController$f;
import com.kuaishou.live.common.core.component.multiline.renderpart.LiveAudienceMultiLineEntryController$e;
import com.kuaishou.live.common.core.component.multiline.renderpart.LiveAudienceMultiLineEntryController$g;
import com.kuaishou.live.common.core.component.multiline.renderpart.LiveAudienceMultiLineEntryController$c;
import com.kuaishou.live.common.core.component.multiline.renderpart.LiveAudienceMultiLineEntryController$a;
import com.kuaishou.live.common.core.component.multiline.renderpart.LiveAudienceMultiLineEntryController$b;
import mq1.a;
import nq1.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import android.view.View;
import gq1.n;
import oh3.a;
import mq1.c;
import mq1.b;
import xq5.c;
import mq5.h;
import rq1.a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.LiveAudienceMultiLineBasicViewController;
import oq1.e;
import oq1.b;
import nq1.a;
import f02.b;
import sq1.e;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;

public final class LiveAudienceMultiLineEntryController extends ViewController	// class@0014ff
{
    public final g A;
    public final e B;
    public final a C;
    public final g D;
    public final a E;
    public final i F;
    public final f G;
    public final o H;
    public final b I;
    public final LiveSlidePlayService J;
    public final c j;
    public d k;
    public a l;
    public e m;
    public final p n;
    public final LiveAudienceMultiLineEntryController$d o;
    public f p;
    public final p q;
    public RenderAreaView r;
    public ViewController s;
    public a t;
    public final h u;
    public final c v;
    public final LiveAudienceMultiLineEntryController$g w;
    public final LiveAudienceMultiLineEntryController$c x;
    public final LiveAudienceMultiLineEntryController$a y;
    public final LiveAudienceMultiLineEntryController$b z;

    public void LiveAudienceMultiLineEntryController(g p0,e p1,a p2,g p3,a p4,i p5,f p6,o p7,b p8,LiveSlidePlayService p9){
       a.p(p0, "liveInfoManager");
       a.p(p1, "multiInteractManager");
       a.p(p2, "longConnection");
       a.p(p3, "layoutManagerService");
       a.p(p4, "multiLineDelegate");
       a.p(p5, "logPackageProvider");
       a.p(p6, "liveAudienceGiftBoxService");
       a.p(p7, "liveAudienceMultiLineServiceV2");
       a.p(p8, "endService");
       a.p(p9, "slideService");
       super();
       this.A = p0;
       this.B = p1;
       this.C = p2;
       this.D = p3;
       this.E = p4;
       this.F = p5;
       this.G = p6;
       this.H = p7;
       this.I = p8;
       this.J = p9;
       this.j = new c(p1, p2, null);
       this.n = s.c(LiveAudienceMultiLineEntryController$liveMultiLineLayoutConfigLegacy$2.INSTANCE);
       this.o = new LiveAudienceMultiLineEntryController$d(this);
       this.q = s.c(new LiveAudienceMultiLineEntryController$containerView$2(this));
       this.u = new LiveAudienceMultiLineEntryController$f(this);
       this.v = new LiveAudienceMultiLineEntryController$e(this);
       this.w = new LiveAudienceMultiLineEntryController$g(this);
       this.x = new LiveAudienceMultiLineEntryController$c(this);
       this.y = new LiveAudienceMultiLineEntryController$a(this);
       this.z = new LiveAudienceMultiLineEntryController$b(this);
    }
    public static final a V2(LiveAudienceMultiLineEntryController p0){
       p0 = p0.l;
       if (p0 == null) {
          a.S("mLineChatModeManager");
       }
       return p0;
    }
    public static final d W2(LiveAudienceMultiLineEntryController p0){
       p0 = p0.k;
       if (p0 == null) {
          a.S("multiLineBasicModel");
       }
       return p0;
    }
    public void F2(){
       LiveAudienceMultiLineEntryController liveAudience = LiveAudienceMultiLineEntryController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveAudience, "3")) {
          return;
       }
       this.R2(this.Y2());
       this.H.Vh(this.o);
       this.j.O(this.x);
       c uoc = new c(this.j);
       this.l = uoc;
       uoc.h(this.y);
       if (!PatchProxy.applyVoid(objArray, this, liveAudience, "18")) {
          this.J.P4(this.v);
          this.I.Km(this.u);
       }
       return;
    }
    public void J2(){
       LiveAudienceMultiLineEntryController liveAudience = LiveAudienceMultiLineEntryController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveAudience, "4")) {
          return;
       }
       this.j.R(this.x);
       LiveAudienceMultiLineEntryController tl = this.l;
       if (tl == null) {
          a.S("mLineChatModeManager");
       }
       tl.B(this.y);
       this.H.Vh(objArray);
       tl = this.t;
       if (tl != null) {
          tl.d();
       }
       if (!PatchProxy.applyVoid(objArray, this, liveAudience, "19")) {
          this.J.d5(this.v);
          this.I.le(this.u);
       }
       return;
    }
    public final ViewController X2(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiLineEntryController.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveAudienceMultiLineEntryController tm = this.m;
       LiveAudienceMultiLineEntryController tz = this.z;
       LiveAudienceMultiLineEntryController tE = this.E;
       LiveAudienceMultiLineEntryController tk = this.k;
       if (tk == null) {
          a.S("multiLineBasicModel");
       }
       LiveAudienceMultiLineBasicViewController liveAudience = new LiveAudienceMultiLineBasicViewController(tm, tz, tE, tk, this.B, this.F);
       return obj;
    }
    public final FrameLayout Y2(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiLineEntryController.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q.getValue();
    }
    public final b Z2(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiLineEntryController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n.getValue();
    }
    public final void a3(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiLineEntryController.class, "11")) {
          return;
       }
       LiveAudienceMultiLineEntryController ts = this.s;
       if (ts != null) {
          b.P(e.a, "remove currentSubVc "+this.s);
          this.O2(ts);
       }
       this.s = null;
       return;
    }
}
