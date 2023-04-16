package dw1.b;
import im8.g;
import k51.c;
import dw1.h;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import dw1.b$a;
import dw1.b$b;
import dw1.b$c;
import dw1.b$d;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dw1.a;
import java.util.Objects;
import java.util.Set;
import com.kwai.feature.api.live.base.service.scenetype.LiveSceneType;
import p91.m;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import hz1.a;
import cw1.j0;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.g;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.c;
import cw1.s;
import cw1.d0;
import cw1.p0;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.d;
import cw1.m0;
import cw1.n0;
import lp3.e;
import lp3.c;
import lnc.a1;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.LiveRightPendantView;
import android.widget.RelativeLayout;
import d71.c;
import d71.a;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantContainerPosition;
import com.kwai.feature.api.live.base.service.pendant.LivePendantContainerHideFlags;
import ea1.a;
import com.kuaishou.live.common.core.basic.optimizeui.ViewElement;
import cw1.q0;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.a;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.b;
import ekd.k1;
import java.util.Iterator;
import java.util.List;
import rq5.a;
import pq5.a;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantContainerScene;
import java.util.BitSet;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.util.SparseArray;
import android.util.Pair;
import android.view.View$OnLayoutChangeListener;
import java.lang.Boolean;
import a2.i0;
import android.widget.LinearLayout;
import java.lang.Math;
import com.kwai.feature.api.live.service.show.comments.view.LayoutParamsType;
import com.kwai.feature.api.live.service.show.comments.LiveCommentsBiz;
import java.lang.Enum;
import com.kuaishou.live.comments.view.a;
import i81.g;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager$BizType;
import dw1.g;
import java.util.Map;
import java.util.HashMap;
import jv1.b;
import cs3.a;
import mw1.c;
import w37.b;
import lt5.a;
import mw1.b;
import j47.d;
import g81.c;

public class b extends c implements g	// class@002044
{
    public a A;
    public i B;
    public final Object C;
    public Map D;
    public final s E;
    public final b0 F;
    public final c G;
    public final c H;
    public m p;
    public b q;
    public a r;
    public a s;
    public c t;
    public b u;
    public a v;
    public b w;
    public d x;
    public c y;
    public e z;
    public static String sLivePresenterClassName = "LiveRightPendantContainerPresenter";

    public void b(){
       super();
       this.A = new h();
       this.C = new Object();
       this.D = new ConcurrentHashMap();
       this.E = new b$a(this);
       this.F = new b$b(this);
       this.G = new b$c(this);
       this.H = new b$d(this);
    }
    public void E8(){
       b b;
       b q;
       a uoa2;
       i b2;
       i oi = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi1 = i.class;
       String str = "2";
       if (PatchProxy.applyVoid(null, oi, b.class, str)) {
          return;
       }
       i oi2 = new i(oi.A);
       oi.B = oi2;
       b f = oi.F;
       Objects.requireNonNull(oi2);
       if (!PatchProxy.applyVoidOneRefs(f, oi2, oi1, "28")) {
          oi2.u.add(f);
       }
       LiveSceneType audience = LiveSceneType.Audience;
       if (oi.p.u5() == audience) {
          b = oi.B;
          View view = this.m8();
          b p = oi.p;
          b e = oi.E;
          q = oi.q;
          Objects.requireNonNull(b);
          b uob = q;
          a uoa = a.class;
          b uob1 = q;
          if (!PatchProxy.applyVoidFourRefs(view, p, e, uob, b, i.class, "3")) {
             b.doBindView(view);
             b.b = p;
             b.B = 0x3f800000;
             i q1 = b.q;
             c uoc = PatchProxy.applyThreeRefs(p, e, q1, null, j0.class, "1");
             if (uoc != patchProxyRe) {
             }else {
                uoc = new c(p, e, q1);
             }
             b.r = uoc;
             b.B3();
             if (!PatchProxy.applyVoidTwoRefs(p, uob1, b, oi1, "7")) {
                d uod = new d();
                b.s = uod;
                uod.c = p;
                uod.d = uob1;
                uod.f(new p0(b));
             }
             if (PatchProxy.applyVoid(null, b, oi1, "9")) {
             label_00eb :
                uoa2 = uoa;
             }else {
                b2 = b.b;
                if (b2 != null && (b2.u5() == audience && b.b.t5() != null)) {
                   uoa2 = uoa;
                   if (b.b.t5().a(uoa2) != null && b.b.t5().a(uoa2).e5()) {
                      b.i.setDividerHeight(a1.e(10.00f));
                   }
                }else {
                   goto label_00eb ;
                }
             }
             if (!PatchProxy.applyVoid(null, b, oi1, "5")) {
                b2 = b.b;
                if (b2 != null && (b2.u5() == audience && (b.b.t5() != null && (b.b.t5().a(uoa2) != null && (b.b.t5().a(uoa2).ci() || b.b.t5().a(uoa2).l()))))) {
                   b.g.setPaddingRelative(0, 0, a1.e(3.00f), 0);
                }
             }
          }
       label_0145 :
          oi.r.c(oi.H);
          b b1 = oi.B;
          Objects.requireNonNull(b1);
          if (!PatchProxy.applyVoid(null, b1, oi1, "4")) {
             b1.c6(4, (LivePendantContainerPosition.TOP.flag | LivePendantContainerPosition.BOTTOM.flag), LivePendantContainerHideFlags.DELAY_FOR_UI_OPT);
             a uoa1 = new a(ViewElement.RIGHT_PENDANT, new q0(b1));
             b1.E = uoa1;
             uoa1.c();
          }
          oi.H.a(oi.r.h());
       }else if(oi.p.u5() == LiveSceneType.Anchor){
          b = oi.B;
          View view1 = this.m8();
          b p1 = oi.p;
          q = oi.s;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoidThreeRefs(view1, p1, q, b, i.class, "2")) {
             b.doBindView(view1);
             b.b = p1;
             b.c = q;
             i q2 = b.q;
             a uoa3 = PatchProxy.applyTwoRefs(p1, q2, null, j0.class, str);
             if (uoa3 != patchProxyRe) {
             }else {
                uoa3 = new a(p1, q2);
             }
             b.r = uoa3;
             b.B3();
             if (!PatchProxy.applyVoidOneRefs(p1, b, oi1, "8")) {
                b uob2 = new b();
                b.t = uob2;
                uob2.c = p1;
                uob2.f(new p0(b));
             }
          }
       }else {
          oi.B.doBindView(this.m8());
       }
       return;
    }
    public void J8(){
       int i;
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "4")) {
          return;
       }
       if (this.p.u5() == LiveSceneType.Audience) {
          this.r.a(this.H);
       }
       b tB = this.B;
       b tF = this.F;
       Objects.requireNonNull(tB);
       if (!PatchProxy.applyVoidOneRefs(tF, tB, oi, "29")) {
          tB.u.remove(tF);
       }
       tB = this.B;
       Objects.requireNonNull(tB);
       if (!PatchProxy.applyVoid(objArray, tB, oi, "35")) {
          tB.w = true;
          k1.n(tB);
          k1.n(tB.z);
          tB.v = true;
          Iterator iterator = tB.x.iterator();
          while (iterator.hasNext()) {
             iterator.next().v(objArray);
          }
          i r = tB.r;
          if (r != null && !PatchProxy.applyVoid(objArray, r, g.class, "8")) {
             r.a.clear();
             r.B();
             r.y();
             r.z();
             r.A();
             r.G();
             r.F();
             r.D();
             r.v();
             r.C();
             r.t();
             r.w();
             r.x();
             r.u();
             r.E();
          }
          tB.x.clear();
          tB.u.clear();
          r = tB.q;
          Objects.requireNonNull(r);
          if (!PatchProxy.applyVoid(objArray, r, d0.class, "7")) {
             r.b.clear();
             LivePendantContainerScene pLAY_CONFIG_ = LivePendantContainerScene.PLAY_CONFIG_PORTRAIT;
             r.e = pLAY_CONFIG_;
             r.f = pLAY_CONFIG_;
          }
          tB.p.clear();
          i = 0;
          tB.k = i;
          tB.l = i;
          tB.m = -1;
          if (tB.e.getViewTreeObserver().isAlive()) {
             tB.e.getViewTreeObserver().removeOnGlobalLayoutListener(tB.A);
          }
          if (!PatchProxy.applyVoid(objArray, tB, oi, "33")) {
             for (; i < tB.y.size(); i = i + 1) {
                Pair pair = tB.y.valueAt(i);
                pair.second.removeOnLayoutChangeListener(pair.first);
             }
             tB.y.clear();
          }
          k1.n(tB);
          oi = tB.E;
          if (oi != null) {
             oi.b();
          }
       }
       k1.n(this.C);
       return;
    }
    public void P8(){
       boolean b;
       int b1;
       i k;
       boolean b2;
       i oi = i.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "3")) {
          return;
       }
       b = true;
       if (this.B.x4()) {
          b tB = this.B;
          Objects.requireNonNull(tB);
          b obj = PatchProxy.apply(objArray, tB, oi, "50");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else {
             k = tB.i;
             Objects.requireNonNull(k);
             Object obj3 = PatchProxy.apply(objArray, k, LiveRightPendantView.class, "14");
             if (obj3 != patchProxyRe) {
                b1 = obj3.booleanValue();
             }else if(i0.X(k.b) && (!k.b.getVisibility() && k.b.getChildCount() > 0)){
                b1 = true;
             }else {
                b1 = false;
             }
          }
          if (b1) {
             k = this.B.k;
          label_0067 :
             obj = this.B;
             Objects.requireNonNull(obj);
             LiveBulletinLayoutManager obj1 = PatchProxy.apply(objArray, obj, oi, "51");
             if (obj1 != patchProxyRe) {
                b2 = obj1.booleanValue();
             }else {
                oi = obj.i;
                Objects.requireNonNull(oi);
                Object obj2 = PatchProxy.apply(objArray, oi, LiveRightPendantView.class, "15");
                if (obj2 != patchProxyRe) {
                   b = obj2.booleanValue();
                }else if(i0.X(oi.c) && (!oi.c.getVisibility() && oi.c.getChildCount() > 0)){
                   b = 0;
                }
                b2 = b;
             }
             if (b2) {
                k = Math.max(k, this.B.l);
             }
             float f = (k > 0)? 20.00f: 10.00f;
             b1 = k + a1.e(f);
             this.y.K0(LayoutParamsType.RIGHT_MARGIN, LiveCommentsBiz.RIGHT_PENDANT.ordinal(), b1);
             obj1 = this.z.a(g.class).i7();
             if (obj1 != null) {
                if (b1 > 0) {
                   obj1.h(LiveBulletinLayoutManager$BizType.LIVE_RIGHT_PENDANT, b1);
                }else {
                   obj1.k(LiveBulletinLayoutManager$BizType.LIVE_RIGHT_PENDANT);
                }
             }
             return;
          }
       }
       k = 0;
       goto label_0067 ;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new g());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       this.q = this.s8(b.class);
       this.r = this.t8("LIVE_AUDIENCE_BOTTOM_BAR_SERVICE");
       this.s = this.s8(a.class);
       this.t = this.s8(c.class);
       this.u = this.t8("LIVE_GZONE_AUDIENCE_ACTIVITY_BANNER_PRESENTER");
       this.v = this.s8(a.class);
       this.w = this.t8("LIVE_AUDIENCE_PLAY_VIEW_LAYOUT_SERVICE");
       this.x = this.s8(d.class);
       this.y = this.q8(c.class);
       this.z = this.r8("LIVE_SERVICE_MANAGER");
       return;
    }
}
