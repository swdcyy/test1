package com.kwai.live.gzone.accompanyplay.edit.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import mrd.a;
import k37.p1;
import java.lang.String;
import g37.d;
import java.lang.Object;
import java.lang.Integer;
import com.kwai.live.gzone.accompanyplay.api.ResultResponse;
import brd.w;
import j37.b;
import j37.a;
import brd.t;
import cjd.e;
import erd.o;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.retrofit.model.KwaiException;
import u07.t$a;
import android.app.Activity;
import lnc.a1;
import java.lang.CharSequence;
import u07.f;
import com.kwai.live.gzone.accompanyplay.edit.g$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.robust.PatchProxyResult;
import fq5.b;
import com.kwai.live.gzone.accompanyplay.edit.g$e;
import h37.f0;
import java.lang.Boolean;
import crd.b;
import lnc.b9;
import com.kwai.live.gzone.accompanyplay.edit.g$d;
import erd.g;
import io.reactivex.internal.functions.Functions;
import sfc.a;
import n37.j;
import androidx.fragment.app.KwaiDialogFragment;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting;
import com.kwai.live.gzone.accompanyplay.edit.g$a;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import g37.e;
import com.yxcorp.utility.TextUtils;
import com.kwai.live.gzone.accompanyplay.edit.g$i;
import e17.i;
import com.kwai.live.gzone.accompanyplay.edit.g0$b;
import com.kwai.live.gzone.accompanyplay.edit.m;
import com.yxcorp.utility.n;
import com.kwai.live.gzone.accompanyplay.edit.f;
import com.kwai.live.gzone.accompanyplay.edit.g$f;
import n37.i;
import com.kwai.live.gzone.accompanyplay.edit.g$g;
import com.kwai.live.gzone.accompanyplay.edit.g0;
import com.kwai.live.gzone.accompanyplay.anchor.z;
import com.kwai.live.gzone.accompanyplay.anchor.z$d;
import com.kwai.live.gzone.accompanyplay.edit.g$c;
import com.kwai.live.gzone.accompanyplay.edit.g$h;

public class g	// class@000bf5
{
    public final String a;
    public ProgressFragment b;
    public b c;
    public b d;
    public b e;
    public g0 f;
    public z g;
    public c h;
    public GifshowActivity i;
    public d j;
    public a k;
    public a l;
    public p1 m;
    public f0 n;
    public g$i o;

    public void g(GifshowActivity p0,a p1,p1 p2,String p3,d p4){
       super();
       this.k = a.h(Integer.valueOf(0));
       this.i = p0;
       this.a = p3;
       this.m = p2;
       this.l = p1;
       this.j = p4;
    }
    public static w k(String p0,String p1,ResultResponse p2){
       return a.b().h(p0, p1).map(new e());
    }
    public void a(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "13")) {
          return;
       }
       if (p0 instanceof KwaiException && p0.mErrorCode == 0x10360) {
          t$a uoa = new t$a(this.i);
          uoa.X0(a1.p(R.string.arg_RES_7f10231f));
          uoa.z0(p0.mErrorMessage);
          t$a uoa1 = f.d(uoa);
          this.h = uoa1.Y(new g$b(this));
       }
       return;
    }
    public final t b(){
       Object obj = PatchProxy.apply(null, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.b().d(this.m.a.getLiveStreamId()).map(new e()).flatMap(new g$e(this));
    }
    public f0 c(String p0,String p1,String p2,String p3,boolean p4){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4)};
          p3 = PatchProxy.apply(objArray, this, og, "16");
          if (p3 != PatchProxyResult.class) {
             return p3;
          }
       }
       f0 uof0 = new f0();
       uof0.c = p0;
       uof0.a = p1;
       uof0.b = p2;
       uof0.g = p4;
       g tk = this.k;
       uof0.d = tk;
       uof0.e = this.l;
       uof0.f = this.m;
       tk.onNext(Integer.valueOf(1));
       return uof0;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, g.class, "24")) {
          return;
       }
       b9.a(this.c);
       b9.a(this.e);
       this.e = a.b().d(this.m.a.getLiveStreamId()).map(new e()).flatMap(new g$d(this)).subscribe(Functions.d(), new a());
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, g.class, "20")) {
          return;
       }
       g tf = this.f;
       if (tf != null) {
          tf.o();
          this.f = null;
       }
       return;
    }
    public w f(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, g.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.b().t(p0).map(new e()).flatMap(new j(p1, p2));
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, g.class, "21")) {
          return;
       }
       g tg = this.g;
       if (tg != null) {
          tg.o();
          this.g = null;
       }
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, g.class, "19")) {
          return;
       }
       g tb = this.b;
       if (tb != null) {
          try{
             tb.dismissAllowingStateLoss();
             this.b = null;
          }catch(java.lang.Exception e0){
          }
       }
    }
    public final t i(String p0,LiveGzoneAccompanyFleetSetting p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.b().d(p0).map(new e()).flatMap(new g$a(this, p0, p1));
    }
    public w j(LiveGzoneAccompanyGameInfo p0,LiveGzoneAccompanyFleetSetting p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.b().n(p0.mGameId, p1.mFleetId, p1.mEditingTitle, e.a(p1), TextUtils.I(p1.getEditingBindGameUid())).map(new e());
    }
    public boolean l(LiveGzoneAccompanyFleetSetting p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!p0.isItemValueChanged() && !p0.isAutoEdit())? true: false;
       return b;
    }
    public final void m(LiveGzoneAccompanyFleetSetting p0,String p1,String p2,String p3,LiveGzoneAccompanyGameInfo p4,boolean p5){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,Boolean.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, og, "15")) {
             return;
          }
       }
       this.h();
       if (p4.mEnableOneClick != null) {
          g to = this.o;
          if (to != null) {
             to.a(p0, p1, p2, p3, p4);
          }
       }else {
          this.e();
          if (p5) {
             i.a(R.style.arg_RES_7f110669, 0x7f1043d3);
          }
          f0 uof0 = this.c(p3, p0.mFleetTitle, p1, p2, p4.mEnableOneClick);
          this.n = uof0;
          this.p(uof0);
       }
       return;
    }
    public void n(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "23")) {
          return;
       }
       this.h();
       this.e();
       this.g();
       if (!PatchProxy.applyVoid(objArray, this, og, "22")) {
          og = this.h;
          if (og != null) {
             og.o();
             this.h = objArray;
          }
       }
       b9.a(this.c);
       b9.a(this.d);
       b9.a(this.e);
       this.k.onNext(Integer.valueOf(0));
       return;
    }
    public final void o(String p0,boolean p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, og, "6")) {
          return;
       }
       this.e();
       g0$b uob = new g0$b(this.i);
       m om = new m();
       om.o = this.m.a;
       g ta = this.a;
       om.w = ta;
       om.f = p1;
       p1 = ta.equals("live_watch");
       boolean b = true;
       if (p1) {
          om.h = a1.e(300.00f);
       }else if((this.a).equals("livemate_live")){
          om.g = b;
          om.h = n.k(this.i) / 2;
       }
       om.p = new f(this, p0);
       om.q = new g$f(this);
       om.e = b;
       om.d = b;
       om.u = b;
       om.b(a.b().o(p0, "").map(new e()).map(new i(this, p0)));
       uob.a0(om);
       uob.M(new g$g(this));
       g0 og0 = new g0(uob);
       this.f = og0;
       og0.r = this.j;
       og0.Z();
       return;
    }
    public void p(f0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "17")) {
          return;
       }
       z$d uod = new z$d(this.i);
       uod.M(new g$c(this));
       z oz = new z(uod, p0);
       this.g = oz;
       oz.t = this.j;
       oz.u = this.m.d;
       oz.Z();
       return;
    }
    public final t q(LiveGzoneAccompanyFleetSetting p0,LiveGzoneAccompanyGameInfo p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.b().d(this.m.a.getLiveStreamId()).map(new e()).flatMap(new g$h(this, p1, p0));
    }
}
