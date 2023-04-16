package com.yxcorp.gifshow.prettify.makeup.h;
import n1c.m$a;
import l0c.f;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicLoadEffectFailedListener;
import i1c.c;
import o0c.d;
import oc9.q;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import ng9.c;
import com.yxcorp.gifshow.prettify.makeup.h$a;
import com.yxcorp.gifshow.prettify.makeup.h$b;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupKey;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.feature.post.api.componet.prettify.makeup.model.a;
import f1c.i;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import com.yxcorp.gifshow.prettify.makeup.b;
import oc9.t;
import n0c.a;
import java.lang.Object;
import h1c.c;
import h1c.e;
import h1c.b;
import androidx.fragment.app.Fragment;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import oe6.b;
import j8c.a;
import q87.c;
import android.os.Bundle;
import um6.e;
import h80.j;
import h80.k;
import h1c.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupPart;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupMaterial;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.gifshow.prettify.widget.PrettifyTextSwitcherView;
import f1c.c2;
import lnc.a1;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import java.util.List;
import o0c.c;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupGroup$a;
import java.lang.Float;
import k2b.e0;
import f1c.f0;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import android.content.Context;
import i1c.b;
import com.kwai.feature.post.api.componet.prettify.PrettyGuideInfo;
import p0c.h;
import p0c.d;
import java.util.ArrayList;
import java.lang.Integer;
import p0c.f;
import p0c.f$c;
import k1c.c;
import com.yxcorp.gifshow.prettify.makeup.i0;
import z0c.k0;
import n0c.c;
import android.view.View;
import f1c.j;
import erd.g;
import crd.b;
import eoc.f;
import w16.i;
import f1c.k;
import com.yxcorp.gifshow.prettify.makeup.g;
import java.lang.Runnable;
import com.yxcorp.gifshow.prettify.makeup.d;
import com.yxcorp.gifshow.prettify.makeup.m;
import com.yxcorp.gifshow.camerasdk.q;
import f1c.m;
import ui9.j;
import com.yxcorp.gifshow.prettify.makeup.m$b;
import f1c.h0;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import com.kwai.feature.post.api.componet.prettify.makeup.model.a$a;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.io.File;
import i4b.g;
import w46.b;
import com.kwai.video.westeros.models.MakeupResource;
import ekd.j;
import z3b.a0;
import com.yxcorp.gifshow.prettify.makeup.h$c;
import z3b.f;
import xi9.r;
import ue9.a;
import java.util.Objects;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import be9.a;
import boc.b;

public class h extends q implements m$a, f, FaceMagicController$FaceMagicLoadEffectFailedListener, c, d	// class@001180
{
    public c p;
    public MakeupKey q;
    public List r;
    public f s;
    public boolean t;
    public c u;
    public PrettifyTextSwitcherView v;
    public e w;
    public b x;

    public void h(CameraPageType p0,b p1,c p2){
       super(p0, p1);
       this.t = false;
       this.w = new h$a(this);
       this.x = new h$b(this);
       this.p = p2;
       this.q = (p0 == CameraPageType.LIVE_COVER || p0 == CameraPageType.LIVE)? MakeupKey.LIVE: MakeupKey.RECORD;
       this.d.n(a.class, new i(this));
       this.L0(new b(p0, p1, this));
       this.p = p2;
       c uoc = this.d.c(a.class).e();
       this.u = uoc;
       uoc.i(this.q);
       this.u.k(this.w);
       this.u.a(this.x);
       return;
    }
    public static boolean m2(Fragment p0,b p1){
       Object[] objArray;
       p1 = PatchProxy.applyTwoRefs(p0, p1, null, h.class, "21");
       if (p1 != PatchProxyResult.class) {
          return p1.booleanValue();
       }
       if (!b.o()) {
          objArray = new Object[0];
          a.D().w("MakeupController", "disable by startup", objArray);
          return 0;
       }else if(e.b(p0.getArguments())){
          objArray = new Object[0];
          a.D().w("MakeupController", "disable by ktv", objArray);
          return 0;
       }else if(k.d() != null && !k.d().f()){
          objArray = new Object[0];
          a.D().w("MakeupController", "disable by configuration", objArray);
          return 0;
       }else {
          return true;
       }
    }
    public boolean A(){
       Object obj = PatchProxy.apply(null, this, h.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.u.f();
    }
    public boolean C(){
       Object obj = PatchProxy.apply(null, this, h.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.u.d().b() || (k.d() != null && !k.d().f()))? true: false;
       return b;
    }
    public boolean C0(){
       a obj = PatchProxy.apply(null, this, h.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.i2();
       boolean b = (!this.C() && (obj != null && !TextUtils.n(obj.a, "-10")))? true: false;
       return b;
    }
    public void I1(MakeupSuite p0,MakeupPart p1,MakeupMaterial p2,boolean p3){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, h.class, "8")) {
          return;
       }
       a uoa = a.D();
       StringBuilder str = "select suite:"+p0+" part:";
       SimpleMagicFace simpleMagicF = null;
       MakeupPart mName = (p1 != null)? p1.mName: simpleMagicF;
       str = str+mName+" material:";
       if (p2 != null) {
          simpleMagicF = p2.mName;
       }
       Object[] objArray = new Object[0];
       uoa.E("MakeupController", "[makeup][keypath] ", str+simpleMagicF+" onlyUpdateIntensity:"+p3, objArray);
       if (!p3 && !TextUtils.n(this.v.getCurName(), c2.g(p0))) {
          this.v.f(c2.g(p0), a1.p(R.string.arg_RES_7f10318a), 3);
       }
       this.v2(p0, p1, p2, p3, 2);
       return;
    }
    public void L3(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "23")) {
          return;
       }
       super.L3(p0);
       this.u2(p0, this.k2());
       return;
    }
    public void M3(){
       c.g(this);
    }
    public void N1(float p0,float p1,MakeupGroup$a p2,MakeupSuite p3,MakeupPart p4,MakeupMaterial p5){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{Float.valueOf(p0),Float.valueOf(p1),p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, oh, "10")) {
             return;
          }
       }
       f0.h(this.e, p0, p1, false, p2, p3, p4, p5);
       return;
    }
    public void P(MakeupSuite p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "9")) {
          return;
       }
       List parts = p0.getParts();
       if (q.f(parts)) {
          return;
       }
       Iterator iterator = parts.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          MakeupMaterial selectMateri = obj.getSelectMaterial();
          if (selectMateri.isEmpty()) {
             continue ;
          }else {
             float f = p0.getIntensity() * selectMateri.getRecommendIntensity();
             if (selectMateri.getIntensity() - f) {
                selectMateri.setUserIntensity(Float.valueOf(f));
                this.v2(p0, obj, selectMateri, true, 3);
             }
          }
       }
       return;
    }
    public void R1(){
       if (PatchProxy.applyVoid(null, this, h.class, "27")) {
          return;
       }
       List list = this.z();
       if (!PatchProxy.applyVoidOneRefs(list, this, d.class, "9")) {
          this.c2(list, null);
       }
       return;
    }
    public void W5(){
       if (PatchProxy.applyVoid(null, this, h.class, "17")) {
          return;
       }
       RxBus.f.b(new PanelShowEvent(this.c, PanelShowEvent$PanelType.MAKEUP, this.e, true));
       return;
    }
    public void a(){
       b.a(this);
    }
    public boolean a0(PrettyGuideInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.d() == 3)? true: false;
       return b;
    }
    public void c0(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "6")) {
          return;
       }
       int i = 1;
       p0.g().c().add(Integer.valueOf(i));
       f uof = p0.i();
       this.s = uof;
       uof.t(this.q);
       this.s.q(this);
       this.s.r(this);
       this.s.x(i);
       this.s.n(this.l2());
       this.s.u(new f$c(this.g2(), false));
       if (this.u.d().b() && p0.f() != null) {
          p0.f().a(2, i);
       }
       if (this.h2()) {
          p0.i().p(i);
          p0.i().z(new i0(this.p.p1()));
       }
       d tc = this.c;
       if (tc != CameraPageType.LIVE_COVER && tc != CameraPageType.LIVE) {
          p0.i().o(i);
          p0.i().s(R.layout.arg_RES_7f0d12da);
          p0.i().C(R.layout.arg_RES_7f0d119c);
          p0.i().w(R.layout.arg_RES_7f0d1198);
          p0.i().y(R.layout.arg_RES_7f0d12dc);
          p0.i().v(R.layout.arg_RES_7f0d119c);
       }
       return;
    }
    public void f2(boolean p0){
       this.t = p0;
    }
    public void f5(){
       if (PatchProxy.applyVoid(null, this, h.class, "19")) {
          return;
       }
       RxBus.f.b(new PanelShowEvent(this.c, PanelShowEvent$PanelType.MAKEUP, this.e, false));
       return;
    }
    public void f6(){
       c.a(this);
    }
    public boolean g2(){
       boolean b = (this.c == CameraPageType.LIVE_COVER)? true: false;
       return b;
    }
    public boolean h2(){
       d tc = this.c;
       boolean b = (tc != CameraPageType.VIDEO && (tc != CameraPageType.PHOTO && (tc != CameraPageType.WHATS_UP && (tc != CameraPageType.TIE_TIE && (tc == CameraPageType.KTV_TUNE || tc == CameraPageType.LIVE_AVATAR)))))? true: false;
       return b;
    }
    public a i2(){
       Object obj = PatchProxy.apply(null, this, h.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.u.d().a();
    }
    public void j0(){
       b.b(this);
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       super.k(p0);
       Object[] objArray = new Object[0];
       a.D().w("MakeupController", "onViewCreated", objArray);
       this.v = p0.findViewById(0x7f0a31c0);
       this.Y1(f.a(PanelShowEvent.class, new j(this)));
       this.Y1(f.a(i.class, new k(this)));
       this.b2(new g(this));
       return;
    }
    public List k2(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, h.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (!this.C()) {
          objArray = this.i2();
       }
       obj.add(objArray);
       return obj;
    }
    public final boolean l2(){
       h tq = this.q;
       boolean b = (tq != MakeupKey.LIVE && tq != MakeupKey.IM_CHAT)? true: false;
       return b;
    }
    public boolean n2(){
       Object obj = PatchProxy.apply(null, this, h.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.s == null) {
          return this.o2();
       }
       boolean b = (this.o2() && this.s.j().a != null)? true: false;
       return b;
    }
    public void n4(){
       if (PatchProxy.applyVoid(null, this, h.class, "18")) {
          return;
       }
       d.a().b(this.s.h()).n();
       return;
    }
    public void nb(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "5")) {
          return;
       }
       super.nb(p0);
       this.b2(new m(this));
       if (!this.C()) {
          this.g.A0(this);
       }
       return;
    }
    public final boolean o2(){
       d obj = PatchProxy.apply(null, this, h.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c;
       boolean b = false;
       if (obj != CameraPageType.VIDEO && (obj != CameraPageType.PHOTO && (obj == CameraPageType.WHATS_UP || (obj != CameraPageType.TIE_TIE && (this.g2() || d.a().b(this.q).m()))))) {
          b = true;
       }
    label_003f :
       return b;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "4")) {
          return;
       }
       super.onDestroyView();
       d tg = this.g;
       if (tg != null) {
          tg.n0(this);
       }
       h ts = this.s;
       if (ts != null) {
          m om = ts.i();
          if (om != null) {
             if (!PatchProxy.applyVoid(objArray, om, m.class, "27")) {
                m d = om.d;
                if (d != null && d.b != null) {
                   MakeupSuite makeupSuite = om.g(d.a);
                   MakeupSuite makeupSuite1 = y.y(om.f, new h0(om)).orNull();
                   if (makeupSuite != null && makeupSuite1 != null) {
                      makeupSuite1.setIntensity(Float.valueOf(makeupSuite.getIntensity()));
                      makeupSuite1.setParts(makeupSuite.getParts());
                      makeupSuite1.setSelectedPart(makeupSuite.getSelectedPart());
                      om.n();
                   }
                }
             }
             om.a();
          }
       }
       return;
    }
    public void onLoadFileError(String p0,int p1){
       Object[] objArray;
       Object[] objArray1;
       MakeupResource[] makeupResour;
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oh, "35")) {
          return;
       }
       a uoa = this.i2();
       int i = 1;
       if (p1 != i || (this.g == null || (TextUtils.x(p0) || (uoa != null && !q.f(uoa.c))))) {
          Iterator iterator = uoa.c.iterator();
          while (iterator.hasNext()) {
             a$a uoa1 = iterator.next();
             a$a f = uoa1.f;
             if (f == null || f.isEmpty()) {
                continue ;
             }
             f = uoa1.f;
             String absolutePath = g.j(f).getAbsolutePath();
          }
       }
    label_00df :
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       super.onPause();
       d tg = this.g;
       if (tg != null) {
          tg.e0();
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       super.onResume();
       d tg = this.g;
       if (tg != null) {
          tg.a0();
       }
       return;
    }
    public void p2(){
       if (PatchProxy.applyVoid(null, this, h.class, "24")) {
          return;
       }
       boolean b = true;
       h oh = (this.C0() && !q.f(this.r))? 1: null;
       d td = this.d;
       d tc = this.c;
       if (!oh && !this.u.d().b()) {
          b = false;
       }
       td.m(new a(tc, b));
       return;
    }
    public void q4(View p0,Bundle p1){
       c.j(this, p0, p1);
    }
    public void r2(MakeupSuite p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "15")) {
          return;
       }
       this.v2(p0, null, null, false, 1);
       return;
    }
    public void s2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "14")) {
          return;
       }
       int i = 0;
       if (this.t != null) {
          objArray = new Object[i];
          a.D().w("MakeupController", "restoreLastMakeup skip", objArray);
          return;
       }else if(this.g == null){
          objArray = new Object[i];
          a.D().w("MakeupController", "restoreLastMakeup mImageHelper is null", objArray);
          return;
       }else {
          Object[] objArray1 = new Object[i];
          a.D().w("MakeupController", "restoreLastMakeup, pageType:"+this.c, objArray1);
          m om = d.a().b(this.q);
          Objects.requireNonNull(om);
          Object[] objArray2 = PatchProxy.apply(objArray, om, m.class, "18");
          if (objArray2 != PatchProxyResult.class) {
          }else {
             m e = om.e;
             if (e == null) {
                objArray2 = objArray;
             }else if(e.b != null && !q.f(om.h)){
                objArray2 = om.g(om.e.a);
             }else {
                objArray2 = om.h(om.d());
             }
          }
          a uoa = a.D();
          if (objArray2 != null) {
             objArray = objArray2.toString();
          }
          objArray1 = new Object[i];
          uoa.E("MakeupController", "[makeup][keypath][userSettings] ", objArray, objArray1);
          if (objArray2 == null && !TextUtils.x(d.a().b(this.q).b())) {
             objArray2 = MakeupSuite.getEmpty();
          }
          if (objArray2 != null) {
             this.r2(objArray2);
          }
          uoa = a.D();
          objArray = new Object[2];
          boolean b = (this.g == null)? true: false;
          objArray[i] = Boolean.valueOf(b);
          String str = (objArray2 == null)? "null": objArray2.mId;
          objArray[1] = str;
          Object[] objArray3 = new Object[i];
          uoa.A("MakeupController", String.format("imageHelper %s, suite %s", objArray), objArray3);
          return;
       }
    }
    public void t2(List p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, h.class, "32")) {
          return;
       }
       d tg = this.g;
       if (tg != null) {
          tg.s0(p0, p1, p2);
       }
       this.r = p0;
       this.p2();
       return;
    }
    public void u2(a p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "34")) {
          return;
       }
       if (p0 != null && !p1.isEmpty()) {
          p0.e.q1(p1);
       }
       return;
    }
    public void u3(){
       c.i(this);
    }
    public void v2(MakeupSuite p0,MakeupPart p1,MakeupMaterial p2,boolean p3,int p4){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, oh, "11")) {
             return;
          }
       }
       if (!this.C() && p0 != null) {
          this.u.g(p0, p1, p2, p3, p4);
          Objects.requireNonNull(a.a);
       }
       return;
    }
    public void v6(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "20")) {
          return;
       }
       if (!p0) {
          RxBus.f.b(new PanelShowEvent(this.c, PanelShowEvent$PanelType.MAKEUP, this.e, true));
       }
       return;
    }
    public void x5(){
       c.c(this);
    }
    public void y(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "22")) {
          return;
       }
       this.u.h(p0);
       return;
    }
    public void y6(){
       c.h(this);
    }
    public List z(){
       Object obj = PatchProxy.apply(null, this, h.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.u.h;
    }
    public void z0(View p0,int p1,MakeupSuite p2){
       b.d(this, p0, p1, p2);
    }
}
