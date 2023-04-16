package k21.k;
import im8.g;
import k51.c;
import k21.k$a;
import androidx.collection.ArraySet;
import k21.d;
import k21.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kwai.live.gzone.floatbar.LivePlayerFloatItem;
import e57.a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import p91.m;
import k21.g;
import com.kwai.feature.api.live.base.service.quitlive.AudienceQuitLiveCheckOrder;
import tq5.a;
import tq5.c;
import z12.c;
import k21.h;
import k21.i;
import erd.g;
import crd.b;
import brd.t;
import k21.f;
import m91.b;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import mw1.d;
import mw1.b;
import oq5.c;
import jv1.b;
import k21.w;
import java.util.Objects;
import androidx.lifecycle.MutableLiveData;
import x61.c;
import lp3.c;
import lp3.e;
import k21.j;
import gq5.c;
import gq5.f;
import a2.z;
import a2.i0;
import oq5.b;
import java.util.Set;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.live.core.basic.utils.e;
import java.lang.Boolean;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import com.kwai.robust.PatchProxyResult;
import k21.b;
import android.view.View$OnClickListener;
import mw1.c;
import com.kwai.video.waynelive.LivePlayerController;
import qo1.a;
import tkd.b;
import tkd.d;
import ym5.a;
import lnc.b5;
import d43.m;
import android.os.Build$VERSION;
import k21.c;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import oq5.d;
import lnc.a1;
import a2.u0;
import a2.d;
import ekd.m1;
import k21.a;
import k21.n;
import java.util.Map;
import java.util.HashMap;
import tj3.e;
import nl8.o;
import nl8.n;

public class k extends c implements g	// class@002c70
{
    public c A;
    public boolean B;
    public c C;
    public final b D;
    public b p;
    public b q;
    public a0 r;
    public e s;
    public LiveBizParam t;
    public ViewGroup u;
    public View v;
    public ImageView w;
    public w x;
    public final Set y;
    public final d z;
    public static String sLivePresenterClassName = "LiveAudienceOrientationPresenter";

    public void k(){
       super();
       this.p = new k$a(this);
       this.y = new ArraySet();
       this.z = new d(this);
       this.B = true;
       this.D = new e(this);
    }
    public void E8(){
       k ok = k.class;
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, this, ok, str)) {
          return;
       }
       w ow = null;
       if (!PatchProxy.applyVoid(objArray, this, ok, "8")) {
          a0 q1 = this.r.q1;
          if (q1 != null) {
             q1.b(LivePlayerFloatItem.ACTIVE_ORIENTATION, ow);
          }
          ImageView imageView = this.u.findViewById(LivePlayerFloatItem.ACTIVE_ORIENTATION.getLayoutResId());
          this.w = imageView;
          imageView.setImageResource(R.drawable.arg_RES_7f0813e0);
       }
       this.R8(y.d(this.getActivity()));
       if (!PatchProxy.applyVoid(objArray, this, ok, "4")) {
          k tr = this.r;
          String str1 = (tr != null)? tr.Z2.d(): objArray;
          this.r.w1.Ci(new g(this), AudienceQuitLiveCheckOrder.LANDSCAPE);
          if (c.a(str1)) {
             this.W8();
          }else {
             this.X7(this.r.s2.subscribe(new h(this), i.b));
             this.A = new f(this);
             a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY,AudienceBizRelation.GAME_INTERACTIVE};
             this.r.N().u5(this.D, uoaArray);
             this.r.q2.Y3(this.z);
             this.q.H6(this.A);
          }
       }
       this.P8();
       w ow1 = this.S8();
       Objects.requireNonNull(ow1);
       if (!PatchProxy.applyVoid(objArray, ow1, w.class, str)) {
          ow1.c.setValue(ow1.b);
          ow1.a.a(c.class).v1(ow1.c);
       }
       if (!PatchProxy.applyVoid(objArray, this, ok, "6")) {
          j oj = new j(this);
          this.C = oj;
          this.r.g2.k(oj);
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k.class, "7")) {
          return;
       }
       w ow = this.S8();
       Objects.requireNonNull(ow);
       if (!PatchProxy.applyVoid(objArray, ow, w.class, "4")) {
          ow.a.a(c.class).O0(1007);
       }
       i0.I0(this.v, objArray);
       k tr = this.r;
       if (tr != null) {
          objArray = tr.Z2.d();
       }
       if (c.a(objArray)) {
          return;
       }else {
          this.p.b();
          this.q.Q0(this.A);
          this.r.q2.X0(this.z);
          a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY,AudienceBizRelation.GAME_INTERACTIVE};
          this.r.N().G5(this.D, uoaArray);
          this.y.clear();
          return;
       }
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, k.class, "16")) {
          return;
       }
       if (!e.x(this.t)) {
          return;
       }
       this.b9();
       this.Z8();
       return;
    }
    public final void R8(boolean p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ok, "14")) {
          return;
       }
       w ow = this.S8();
       boolean b = this.r.C0().isGamePatternType();
       Objects.requireNonNull(ow);
       w ow1 = w.class;
       if (!PatchProxy.isSupport(ow1) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(b), ow, ow1, "6")) {
          w b1 = ow.b;
          int i = (p0)? 0x7f0813a5: 0x7f081399;
          b1.mIconRes = i;
          ow.c.setValue(b1);
       }
       ok = this.w;
       if (ok != null) {
          ok.setSelected(p0);
       }
       return;
    }
    public w S8(){
       Object obj = PatchProxy.apply(null, this, k.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.x == null) {
          this.x = new w(new b(this), this.r.C0().isGamePatternType());
       }
       return this.x;
    }
    public final void V8(){
       boolean b1;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k ok = k.class;
       if (PatchProxy.applyVoid(null, this, ok, "13")) {
          return;
       }
       k tr = this.r;
       a0 f2 = tr.F2;
       if (f2 != null && tr.p1 != null) {
          float videoSizeRat = f2.getVideoSizeRatio();
          Activity activity = this.getActivity();
          boolean b = y.d(activity);
          if (!this.r.E.isSideBySideStream()) {
             a0 e = this.r.E;
             Object obj = PatchProxy.applyOneRefs(e, null, a.class, "3");
             int i = 1;
             if (obj != patchProxyRe) {
                b1 = obj.booleanValue();
             }else if(e.getCurrentLiveStreamType() == 4){
                b1 = true;
             }else {
                b1 = false;
             }
             if (!b1) {
                Object obj1 = PatchProxy.apply(null, this, ok, "10");
                if (obj1 != patchProxyRe) {
                   b2 = obj1.booleanValue();
                }else {
                   b2 = this.r.N().r2(AudienceBizRelation.VOICE_PARTY);
                   if (!b2 && this.B != null) {
                      a0 e1 = this.r.e;
                      if (e1 == null || e1.mPatternType != 3) {
                         i = 0;
                      }
                   }else {
                      i = b2;
                   }
                   b2 = i;
                }
                if (!b2 && (videoSizeRat - 0x3f800000 > 0 || (b && (!this.X8() || (!this.Y8() && (!d.a(0x4c5dd1b8).f2() && !b5.a(activity))))))) {
                   this.p.f();
                }
             }
          }
       label_00b5 :
          this.p.b();
          if (this.X8() && y.d(this.getActivity())) {
             this.p.d();
          }
       }
    label_00cf :
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, k.class, "5")) {
          return;
       }
       this.p.b();
       if (y.d(this.getActivity())) {
          this.p.d();
       }
       return;
    }
    public final boolean X8(){
       a0 obj = PatchProxy.apply(null, this, k.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.r.Y0;
       if (obj != null) {
          return obj.r2(AudienceBizRelation.GAME_INTERACTIVE);
       }
       return false;
    }
    public final boolean Y8(){
       a0 obj = PatchProxy.apply(null, this, k.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.r.F2;
       if (obj != null) {
          return m.a(obj.getVideoSizeRatio());
       }
       return false;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, k.class, "17")) {
          return;
       }
       if (Build$VERSION.SDK_INT < 28) {
          return;
       }
       i0.I0(this.v, new c(this));
       return;
    }
    public boolean a9(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k ok = k.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, ok, "20");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       Object obj1 = PatchProxy.apply(objArray, this, ok, "21");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(!q.f(this.y)){
          Iterator iterator = this.y.iterator();
          while (true) {
             if (iterator.hasNext()) {
                if (iterator.next().a()) {
                   b = true;
                }
             }
          }
       }
       b = false;
       if (b) {
          return false;
       }else {
          Activity activity = this.getActivity();
          if (!a1.i(activity)) {
             return false;
          }else if(!y.d(activity)){
             activity.setRequestedOrientation(6);
          }else {
             activity.setRequestedOrientation(true);
          }
          return true;
       }
    }
    public final void b9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k.class, "18")) {
          return;
       }
       if (Build$VERSION.SDK_INT >= 28 && i0.X(this.v)) {
          u0 ou0 = i0.J(this.v);
          if (ou0 != null) {
             objArray = ou0.e();
          }
          if (objArray != null && this.q.H2()) {
             this.v.setPadding(objArray.b(), objArray.d(), objArray.c(), objArray.a());
          }else {
             this.v.setPadding(0, 0, 0, 0);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a232b);
       this.v = m1.f(p0, 0x7f0a22df);
       m1.a(p0, new a(this), R.id.live_player_bottom_orientation_button);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new n();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, k.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(k.class, new n());
       }else {
          obj.put(k.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.q = this.q8(b.class);
       this.r = this.q8(a0.class);
       this.s = this.r8("LIVE_LOG_REPORTER");
       this.t = this.q8(LiveBizParam.class);
       this.S8().i(n.a(this));
       return;
    }
}
