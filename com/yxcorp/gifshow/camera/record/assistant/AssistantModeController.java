package com.yxcorp.gifshow.camera.record.assistant.AssistantModeController;
import in6.b;
import gxc.f;
import oh9.v;
import oc9.d0;
import com.yxcorp.gifshow.camera.record.assistant.AssistantModeController$c;
import nsd.u;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.assistant.a;
import dc9.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.intelligentidentify.AssistantGuideBubble;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.camera.record.assistant.AssistantModeController$d;
import android.app.Activity;
import com.yxcorp.gifshow.camera.record.intelligentidentify.AssistantGuideBubble$a;
import pi9.d;
import com.yxcorp.gifshow.camera.record.assistant.AssistantModeController$l;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import qc9.a;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.video.viewbinder.bottom.AbsRecordBottomBarViewBinder;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camera.record.assistant.AssistantModeController$a;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import com.yxcorp.gifshow.camera.record.assistant.AssistantModeController$b;
import com.yxcorp.gifshow.camera.record.assistant.AssistantModeController$k;
import com.kwai.robust.PatchProxy;
import oc9.b0;
import oc9.a0;
import gxc.e;
import in6.a;
import android.view.View;
import oc9.y;
import oc9.x;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper;
import com.yxcorp.gifshow.camera.record.intelligentidentify.b;
import com.yxcorp.gifshow.camerasdk.q;
import qxc.b;
import ekd.m1;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import oh9.u;
import java.lang.Integer;
import ya9.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.CameraActivity;
import eh9.a;
import ng9.d;
import android.content.Intent;
import lnc.n4;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import ee9.a;
import ekd.j0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.d7;
import wc9.v;
import zb9.c1;
import zb9.a0;
import erd.g;
import crd.b;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import zb9.b0;
import com.trello.rxlifecycle3.components.support.RxFragment;
import eoc.f;
import tkd.b;
import tkd.d;
import om6.c;
import brd.a0;
import om6.d;
import t45.d;
import brd.z;
import zb9.c0;
import oc9.w;
import com.yxcorp.gifshow.camera.bubble.c;
import zb9.d0;
import com.yxcorp.gifshow.bubble.PostBubbleManager$c;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import com.yxcorp.gifshow.camera.record.assistant.a$b;
import com.yxcorp.gifshow.camera.record.assistant.AssistantModeController$e;
import cc9.i;
import com.yxcorp.gifshow.camera.record.assistant.AssistantModeController$onViewCreated$2;
import msd.l;
import com.yxcorp.gifshow.widget.textview.TextImageView;
import lnc.s6;
import android.graphics.drawable.Drawable;
import lnc.a1;
import pi9.i;
import com.yxcorp.gifshow.camera.record.assistant.utils.AssistantUtils;
import android.widget.TextView;
import tg9.b;
import com.yxcorp.gifshow.camera.record.assistant.AssistantModeController$f;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.camera.record.assistant.AssistantModeController$g;
import zb9.j;
import com.yxcorp.gifshow.camera.record.assistant.AssistantModeController$h;
import ig9.a;
import com.yxcorp.gifshow.camera.record.assistant.AssistantModeController$i;
import ng9.a;
import com.yxcorp.gifshow.camera.record.assistant.AssistantModeController$j;
import android.view.MotionEvent;
import com.yxcorp.gifshow.camera.record.assistant.a$a;
import ec9.j;
import cc9.c;
import sa6.a;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import rd9.a;
import ec9.f1;
import dc9.c;
import bc9.k;
import k2b.e0;
import cc9.b;
import sm6.b;
import kd9.s;
import zb9.i;
import kd9.t;
import com.yxcorp.gifshow.camera.record.intelligentidentify.a;
import java.util.List;
import cc9.e;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import eg9.b;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import cc9.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import pi9.d$b;
import fw8.r;
import fw8.r$a;
import java.lang.Runnable;
import ekd.k1;
import java.util.Set;
import com.kuaishou.edit.draft.Asset$b;
import ac9.j;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import ed9.e;
import com.yxcorp.gifshow.camera.record.album.slideup.AlbumSlideUpBehavior;
import com.yxcorp.gifshow.camera.record.widget.BottomSheetBehavior;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import lnc.ka;
import com.yxcorp.gifshow.util.rx.RxBus;
import j4b.f;
import com.kwai.feature.post.api.util.g;
import com.yxcorp.utility.n;
import jg9.a1;
import jg9.a1$a;
import lnc.p3;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import com.yxcorp.gifshow.camera.bubble.b;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;
import zb9.f0;
import com.yxcorp.gifshow.bubble.b$c;
import zb9.g0;
import com.yxcorp.gifshow.camera.bubble.b$c;
import zb9.h0;
import com.yxcorp.gifshow.camera.bubble.b$b;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.util.resource.ResourceDownloadProgressHelper;
import t16.a;
import com.yxcorp.gifshow.util.resource.ResourceDownloadProgressHelper$DownloadID;
import java.lang.Enum;
import zb9.v;
import com.yxcorp.gifshow.util.resource.ResourceDownloadProgressHelper$b;

public final class AssistantModeController extends d0 implements b, f, v	// class@001cf3
{
    public boolean A;
    public c B;
    public PostBubbleManager$c C;
    public View D;
    public boolean E;
    public View F;
    public boolean G;
    public boolean H;
    public AssistantGuideBubble I;
    public final d J;
    public TextView K;
    public FrameLayout L;
    public int M;
    public final Runnable N;
    public boolean O;
    public final Runnable P;
    public final a Q;
    public final b R;
    public View o;
    public AbsRecordBottomBarViewBinder p;
    public boolean q;
    public boolean r;
    public e s;
    public TextImageView t;
    public boolean u;
    public View v;
    public b w;
    public MagicEmoji$MagicFace x;
    public boolean y;
    public boolean z;
    public static final AssistantModeController$c S;

    static {
       AssistantModeController.S = new AssistantModeController$c(null);
    }
    public void AssistantModeController(CameraPageType p0,b p1,a p2,b p3){
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       a.p(p2, "assistContext");
       a.p(p3, "viewHelper");
       super(p0, p1);
       this.Q = p2;
       this.R = p3;
       this.I = new AssistantGuideBubble(p1.a(), new AssistantModeController$d(p1));
       this.J = new d(0);
       this.M = 1;
       this.N = new AssistantModeController$l(this);
       this.O = true;
       if (p1.f() instanceof a) {
          BaseFragment uBaseFragmen = p1.f();
          Objects.requireNonNull(uBaseFragmen, "null cannot be cast to non-null type com.yxcorp.gifshow.camera.record.bottombar.IRecordBottomBarOwner");
          this.p = uBaseFragmen.zb();
       }
       this.d.n(b.class, new AssistantModeController$a(this));
       this.d.n(v.class, new AssistantModeController$b(this));
       this.P = new AssistantModeController$k(this);
       return;
    }
    public static boolean i2(AssistantModeController p0,boolean p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = false;
       }
       return p0.h2(p1);
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, AssistantModeController.class, "6")) {
          return;
       }
       a0.j(this);
       boolean b = (!this.a2() && this.f2())? true: false;
       this.t2(b);
       return;
    }
    public void B(){
       e.c(this);
    }
    public boolean H1(){
       return e.a(this);
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, AssistantModeController.class, "7")) {
          return;
       }
       a0.i(this);
       this.t2(false);
       return;
    }
    public int O0(){
       return a.c(this);
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, AssistantModeController.class, "9")) {
          return;
       }
       a0.h(this);
       boolean b = (!this.a2() && this.f2())? true: false;
       this.t2(b);
       return;
    }
    public void Q(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, AssistantModeController.class, "2")) {
          return;
       }
       a.p(p0, "view");
       x.a(this, p0);
       if (this.h != null) {
          this.Q.d().d().c(this.h);
       }
       AssistantModeController tp = this.p;
       view = (tp != null)? tp.G(): null;
       this.o = b.a(view, p0, 0x7f0a05de);
       this.D = m1.f(p0, 0x7f0a0602);
       this.v = m1.f(p0, 0x7f0a3d49);
       this.F = this.e.findViewById(0x7f0a38b7);
       this.L = this.e.findViewById(0x7f0a31ef);
       return;
    }
    public void Q1(float p0){
       e.f(this, p0);
    }
    public int R(){
       return 0x7f0d0171;
    }
    public int T(){
       return a.a(this);
    }
    public void W(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AssistantModeController.class, "32")) {
          return;
       }
       a.p(p0, "draft");
       u.a(this, p0);
       this.t2(false);
       return;
    }
    public int Y0(){
       return 12;
    }
    public int a1(){
       return a.b(this);
    }
    public void d5(int p0){
       AssistantModeController uAssistantMo = AssistantModeController.class;
       if (PatchProxy.isSupport(uAssistantMo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAssistantMo, "24")) {
          return;
       }
       super.d5(p0);
       this.v2();
       return;
    }
    public final void g2(){
       if (PatchProxy.applyVoid(null, this, AssistantModeController.class, "33")) {
          return;
       }
       AssistantModeController ts = this.s;
       if (ts != null) {
          ts.a();
       }
       return;
    }
    public final boolean h2(boolean p0){
       d obj;
       d7 a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AssistantModeController uAssistantMo = AssistantModeController.class;
       if (PatchProxy.isSupport(uAssistantMo)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uAssistantMo, "34");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       if (this.l == null) {
          return false;
       }else {
          obj = this.e;
          if (!obj instanceof CameraActivity) {
             return false;
          }else if(p0){
             Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcorp.gifshow.camera.record.CameraActivity");
             int i = 12;
             if (PatchProxy.isSupport(CameraActivity.class)) {
                Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(i), obj, CameraActivity.class, "86");
                if (obj1 != patchProxyRe) {
                   i = obj1.booleanValue();
                label_0058 :
                   if (!i) {
                      return false;
                   }
                }
             }
             i = obj.X0.D(i);
             goto label_0058 ;
          }
          if (this.d.d(d.b).a != null) {
             return false;
          }else {
             d te = this.e;
             Intent intent = null;
             Intent intent1 = (te != null)? te.getIntent(): intent;
             if (n4.c(intent1)) {
                return false;
             }else if(n4.i(intent1) != null){
                return false;
             }else if(n4.b(intent1)){
                return false;
             }else if(this.G != null){
                return false;
             }else {
                Object obj2 = this.d.d(a.g);
                a.o(obj2, "mCallerContext\n        .¡­ltAutoApplyMagicFaceData\)");
                if (obj2.a()) {
                   return false;
                }else if(intent1 != null){
                   if (j0.g(intent1, "music")) {
                      return false;
                   }else if(j0.g(intent1, "key_post_entrance_draft_params")){
                      return false;
                   }else if(!TextUtils.x(j0.f(intent1, "filterId"))){
                      return false;
                   }else if(!TextUtils.x(j0.f(intent1, "makeUpId"))){
                      return false;
                   }else if(!TextUtils.x(j0.f(intent1, "musicId")) && j0.b(intent1, "musicType", -1) != -1){
                      return false;
                   }else if(j0.a(intent1, "showFlashPopupOnCameraPage", false)){
                      return false;
                   }
                }
                a = d7.a;
                obj = this.e;
                if (obj != null) {
                   intent = obj.getIntent();
                }
                if (a.j(intent)) {
                   return false;
                }else if(this.d.d(v.e).b != null){
                   return false;
                }else if(this.a2()){
                   return false;
                }else if(!this.Q.C()){
                   return false;
                }else {
                   return true;
                }
             }
          }
       }
    }
    public void k(View p0){
       AssistantModeController tt;
       AssistantModeController uAssistantMo = AssistantModeController.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uAssistantMo, "4")) {
          return;
       }
       a.p(p0, "view");
       this.J.a = this.e;
       boolean b = false;
       this.y = b;
       if (!PatchProxy.applyVoid(null, this, uAssistantMo, "35")) {
          this.Y1(this.d.l(c1.class, new a0(this)));
          this.Y1(f.b(PanelShowEvent.class, new b0(this), this.f));
          this.Y1(d.a(-1139054219).lO().G(d.a).Q(new c0(this)));
          d td1 = this.d;
          a.o(td1, "mCallerContext");
          w ow = td1.b();
          a.o(ow, "mCallerContext.controllerManager");
          this.B = ow.V7();
          d0 uod0 = new d0(this);
          this.C = uod0;
          AssistantModeController tB = this.B;
          if (tB != null) {
             a.m(uod0);
             tB.m(uod0);
          }
       }
       this.Q.f().c(new AssistantModeController$e(this));
       super.k(p0);
       this.Q.d().f(AssistantModeController$onViewCreated$2.INSTANCE);
       if (this.A != null) {
          this.s2(b);
       }
       this.t = p0.findViewById(0x7f0a0265);
       if (s6.m()) {
          tt = this.t;
          if (tt != null) {
             tt.setTopDrawable(a1.f(R.drawable.arg_RES_7f080f3a));
          }
          i.b(this.t);
       }
       tt = this.t;
       a.m(tt);
       tt.setText(AssistantUtils.d.l(R.string.arg_RES_7f10418e));
       d td = this.d;
       a.o(td, "mCallerContext");
       td.j().addView(this.t);
       tt = this.t;
       a.m(tt);
       tt.setOnClickListener(new AssistantModeController$f(this));
       tt = this.t;
       a.m(tt);
       tt.setClickListenerWithoutEnabled(new AssistantModeController$g(this));
       if (this.u != null) {
          this.u = b;
          tt = this.t;
          a.m(tt);
          tt.setSelected(true);
       }
       this.Y1(this.d.l(j.class, new AssistantModeController$h(this)));
       this.Y1(this.d.l(a.class, new AssistantModeController$i(this)));
       this.Y1(this.d.l(a.class, new AssistantModeController$j(this)));
       this.v2();
       return;
    }
    public void k0(MotionEvent p0){
       e.b(this, p0);
    }
    public final void k2(boolean p0){
       AssistantModeController uAssistantMo = AssistantModeController.class;
       if (PatchProxy.isSupport(uAssistantMo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAssistantMo, "39")) {
          return;
       }
       if (p0) {
          this.Q.J(a.I.b());
          this.Q.g().w0(new c(1));
       }else {
          this.Q.g().w0(new c(3));
          this.Q.J(a.I.d());
       }
       return;
    }
    public boolean l(boolean p0){
       return e.i(this, p0);
    }
    public final void l2(boolean p0){
       AssistantModeController uAssistantMo = AssistantModeController.class;
       if (PatchProxy.isSupport(uAssistantMo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAssistantMo, "19")) {
          return;
       }
       if (!this.Q.D()) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("CameraAssist", "closeAssistantMode isDestroyed: "+p0, objArray);
       this.d.m(new a());
       this.Q.L(0);
       this.d.m(new j(0));
       this.Q.r().w0(new c(4));
       d td = this.d;
       a.o(td, "mCallerContext");
       BaseFragment uBaseFragmen = td.f();
       a.o(uBaseFragmen, "mCallerContext.fragment");
       this.Q.h().i(this.Q.p(), uBaseFragmen, this.Q.m());
       d td1 = this.d;
       a.o(td1, "mCallerContext");
       BaseFragment uBaseFragmen1 = td1.f();
       a.o(uBaseFragmen1, "mCallerContext.fragment");
       this.Q.h().g(uBaseFragmen1, this.Q.m());
       AssistantModeController tw = this.w;
       if (tw != null && tw.d() == true) {
          this.Q.g().w0(new c(8));
       }
       if (b.t(this.e)) {
          if (!PatchProxy.isSupport(uAssistantMo) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAssistantMo, "20")) {
             if (this.d.d(s.g).e != this.M) {
                Object[] objArray1 = new Object[0];
                a.D().w("CameraAssist", "start restore origin frame", objArray1);
                this.d.m(new i(this.M));
             }
             this.s2(p0);
          }
       }else {
          this.s2(p0);
       }
       this.d.m(new t(0));
       AssistantModeController to = this.o;
       if (to != null) {
          to.setTag(null);
       }
       this.Q.v().a(0);
       this.v2();
       this.Q.J(a.I.d());
       return;
    }
    public final void m2(boolean p0){
       AssistantModeController uAssistantMo = AssistantModeController.class;
       if (PatchProxy.isSupport(uAssistantMo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAssistantMo, "28")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("CameraAssist", "close AssistTip and cancel closeAssistantTipObserver", objArray);
       AssistantModeController ts = this.s;
       if (ts != null) {
          ts.b();
       }
       this.E = false;
       return;
    }
    public final void n2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AssistantModeController.class, "38")) {
          return;
       }
       if (!this.Q.D()) {
          return;
       }
       List list = this.Q.k();
       if (list == null || list.isEmpty()) {
          j oj = this.Q.g();
          d td = this.d;
          a.o(td, "mCallerContext");
          String str = AssistantUtils.d.m(td);
          if (this.Q.u()) {
             objArray = this.Q.t();
          }
          oj.w0(new e(str, 0, 0, objArray));
          this.Q.O(0);
       }
       return;
    }
    public void nb(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AssistantModeController.class, "23")) {
          return;
       }
       a.p(p0, "camera");
       super.nb(p0);
       this.Q.d().d().c(this.h);
       return;
    }
    public final a o2(){
       return this.Q;
    }
    public boolean onBackPressed(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AssistantModeController uAssistantMo = AssistantModeController.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uAssistantMo, "40");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       d obj1 = PatchProxy.apply(objArray, this, uAssistantMo, "41");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          Object obj2 = this.d.d(new b(false));
          a.o(obj2, "mCallerContext.getData\(OptionCloseData\(false\)\)");
          if (obj2.a == null && PostExperimentUtils.V()) {
             if (this.E != null) {
                this.g2();
             }
             if (this.Q.y()) {
                l ol = new l(new ArrayList(), 0, false, false, 14, null);
                this.Q.r().w0(obj1);
                if (this.Q.D()) {
                   this.k2(false);
                   obj1 = this.d;
                   a.o(obj1, "mCallerContext");
                   BaseFragment uBaseFragmen = obj1.f();
                   a.o(uBaseFragmen, "mCallerContext.fragment");
                   this.Q.h().e(false, uBaseFragmen);
                   b = true;
                }
             }
          }
       label_0090 :
          b = false;
       }
       if (b) {
          return true;
       }else {
          return false;
       }
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, AssistantModeController.class, "25")) {
          return;
       }
       AssistantModeController tJ = this.J;
       Objects.requireNonNull(tJ);
       int i = 0;
       if (!PatchProxy.applyVoid(null, tJ, d.class, "5")) {
          tJ.a = null;
          Iterator iterator = tJ.b.iterator();
          while (iterator.hasNext()) {
             iterator.next().onCancel();
          }
          tJ.b.clear();
          tJ.d.clear();
          if (tJ.c != null) {
             r.c().g(tJ.g);
             k1.m(tJ.f);
             tJ.c = i;
          }
       }
       super.onDestroyView();
       Object[] objArray = new Object[i];
       a.D().w("CameraAssist", "onDestroyView", objArray);
       tJ = this.B;
       if (tJ != null) {
          a.m(tJ);
          AssistantModeController tC = this.C;
          a.m(tC);
          Objects.requireNonNull(tJ);
          if (!PatchProxy.applyVoidOneRefs(tC, tJ, PostBubbleManager.class, "8")) {
             tJ.i.remove(tC);
          }
       }
       this.Q.d().f(null);
       this.Q.v().a(i);
       if (this.Q.y()) {
          this.l2(true);
       }
       this.Q.d().d().c(null);
       tJ = this.t;
       if (tJ != null) {
          i = tJ.isSelected();
       }
       this.u = i;
       return;
    }
    public void onScroll(MotionEvent p0,MotionEvent p1,float p2,float p3){
       e.g(this, p0, p1, p2, p3);
    }
    public boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, AssistantModeController.class, "5");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       if (p1 != null && !p1.getAction()) {
          this.r = true;
       }
       return false;
    }
    public final void p2(){
       this.q = true;
    }
    public void q1(){
       if (PatchProxy.applyVoid(null, this, AssistantModeController.class, "8")) {
          return;
       }
       a0.g(this);
       this.t2(false);
       return;
    }
    public void r0(int p0,Asset$b p1,b p2){
       u.b(this, p0, p1, p2);
    }
    public final boolean r2(){
       Object obj = PatchProxy.apply(null, this, AssistantModeController.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.Q.g().u0().E().isEmpty();
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, AssistantModeController.class, "3")) {
          return;
       }
       if (PostExperimentUtils.W() && !this.Q.D()) {
          d te = this.e;
          if (te == null) {
             return;
          }else if(!PermissionUtils.a(te, "android.permission.CAMERA")){
             return;
          }else {
             boolean b = true;
             if (this.E != null) {
                this.z = b;
             }
             if (this.h2(b)) {
                this.d.m(new e());
                View view = this.e.findViewById(R.id.bottom_sheet);
                if (view != null) {
                   AlbumSlideUpBehavior uAlbumSlideU = AlbumSlideUpBehavior.j(view);
                   if (uAlbumSlideU != null) {
                      uAlbumSlideU.g(4, false);
                   }
                }
                l ol = new l(new ArrayList(), 0, false, false, 14, null);
                this.Q.r().w0(v8);
                if (this.E != null) {
                   this.g2();
                }
                c uoc = this.Q.h();
                d td = this.d;
                a.o(td, "mCallerContext");
                BaseFragment uBaseFragmen = td.f();
                a.o(uBaseFragmen, "mCallerContext.fragment");
                Objects.requireNonNull(uoc);
                if (!PatchProxy.applyVoidOneRefs(uBaseFragmen, uoc, c.class, "14")) {
                   a.p(uBaseFragmen, "page");
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "LONG_PRESS_ENTER_AI_RECORD";
                   u1.M("", uBaseFragmen, 4, uElementPack, null, null);
                }
                this.u2();
                ka.a(this.e, 50);
                AssistantUtils d = AssistantUtils.d;
                if (!d.d()) {
                   d.o(2);
                }
             }
          }
       }
       return;
    }
    public final void s2(boolean p0){
       AssistantModeController uAssistantMo = AssistantModeController.class;
       if (PatchProxy.isSupport(uAssistantMo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAssistantMo, "18")) {
          return;
       }
       this.A = false;
       if (p0) {
          this.A = true;
       }else {
          RxBus.f.b(new f(this.x, this.e));
          this.x = null;
       }
       return;
    }
    public final void t2(boolean p0){
       int i1;
       AssistantModeController uAssistantMo = AssistantModeController.class;
       if (PatchProxy.isSupport(uAssistantMo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAssistantMo, "11")) {
          return;
       }
       int i = 1;
       if (p0) {
          i1 = g.m(this.e) ^ i;
       }
       Object[] objArray = new Object[0];
       a.D().w("CameraAssist", "show btn "+i1, objArray);
       i1 = (i1)? 0: 8;
       View[] viewArray = new View[i];
       viewArray[0] = this.t;
       n.Z(i1, viewArray);
       return;
    }
    public boolean u0(float p0){
       return e.e(this, p0);
    }
    public final void u2(){
       if (PatchProxy.applyVoid(null, this, AssistantModeController.class, "31")) {
          return;
       }
       if (!AssistantModeController.i2(this, false, 1, null)) {
          return;
       }
       this.k2(1);
       return;
    }
    public void v0(){
       e.h(this);
    }
    public final void v2(){
       AssistantModeController uAssistantMo;
       if (PatchProxy.applyVoid(null, this, AssistantModeController.class, "10")) {
          return;
       }
       if (!this.f2()) {
          a1$a j = a1.j;
          if (this.d.d(j.a()).c() && (!this.d.d(j.a()).b() && !this.Q.D())) {
             uAssistantMo = 1;
          label_0045 :
             j = (!this.Q.x() && (!this.Q.B() && (this.Q.G() || this.Q.E())))? 1: 0;
             if (uAssistantMo) {
                this.G = true;
                uAssistantMo = this.t;
                if (uAssistantMo != null) {
                   uAssistantMo.setEnabled(false);
                }
             }else if(this.G != null){
                this.G = false;
                uAssistantMo = this.t;
                if (uAssistantMo != null) {
                   uAssistantMo.setEnabled(true);
                }
             }else if(j){
                this.H = true;
                uAssistantMo = this.t;
                if (uAssistantMo != null) {
                   uAssistantMo.setSelected(false);
                }
                uAssistantMo = this.t;
                if (uAssistantMo != null) {
                   uAssistantMo.setEnabled(false);
                }
             }else if(this.H != null){
                this.H = false;
                uAssistantMo = this.t;
                if (uAssistantMo != null) {
                   uAssistantMo.setEnabled(true);
                }
             }
             return;
          }
       }
       uAssistantMo = null;
       goto label_0045 ;
    }
    public void w(){
       boolean b2;
       AssistantUtils uAssistantUt1;
       Object[] objArray1;
       boolean b = this;
       AssistantModeController uAssistantMo = AssistantModeController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, b, uAssistantMo, "21")) {
          return;
       }
       if (!b.Q.C()) {
          return;
       }
       d e = b.e;
       String str = "CameraAssist";
       if (e != null) {
          Intent intent = e.getIntent();
          if (intent != null) {
             String str1 = "autoStartAssistant";
             if (j0.a(intent, str1, false)) {
                intent.removeExtra(str1);
                boolean b1 = this.r2();
                if (b1 && !b.Q.D()) {
                   this.u2();
                }else if(!b1){
                   Object[] objArray3 = new Object[false];
                   p3.D().w(str, "auto assistant, but model is not download", objArray3);
                }
             }
          }
       }
       AssistantUtils uAssistantUt = AssistantUtils.class;
       if (!PatchProxy.applyVoid(objArray, b, uAssistantMo, "22") && (AssistantModeController.i2(b, false, 1, objArray) && b.O != null)) {
          AssistantUtils d1 = AssistantUtils.d;
          Objects.requireNonNull(d1);
          Object[] obj = PatchProxy.apply(objArray, d1, uAssistantUt, "18");
          if (obj != PatchProxyResult.class) {
             b2 = obj.booleanValue();
             uAssistantUt1 = uAssistantUt;
          }else if(!d1.f() - -1){
             Object[] objArray2 = new Object[false];
             a.D().w("CameraAssistant", "unlimited autoOpenCameraAssistantLimit", objArray2);
             uAssistantUt1 = uAssistantUt;
          }else {
             long l1 = a.c();
             uAssistantUt1 = uAssistantUt;
             objArray1 = new Object[false];
             a.D().w("CameraAssistant", "canAutoAssistant, limit: "+d1.f()+", "+"currentCount: "+l1, objArray1);
             if (l1 - d1.f() >= 0) {
                b2 = false;
             }
          }
          b2 = true;
          if (b2) {
             objArray1 = new Object[false];
             a.D().w(str, "startTimer", objArray1);
             b.O = false;
             objArray1 = null;
             if (!PatchProxy.applyVoid(objArray1, b, uAssistantMo, "1")) {
                obj = new Object[false];
                a.D().w(str, "showAssistTipRunnable run", obj);
                if (AssistantModeController.i2(b, false, 1, objArray1)) {
                   if (this.r2()) {
                      if (!PatchProxy.applyVoid(objArray1, d1, uAssistantUt1, "19")) {
                         long l = a.c() + 1;
                         obj = new Object[false];
                         a.D().w("CameraAssistant", "increase AutoOpenAssistantCount: "+l, obj);
                         SharedPreferences$Editor uEditor = a.a.edit();
                         uEditor.putLong(b.d("user")+"auto_open_assistant_count", l);
                         g.a(uEditor);
                      }
                      b uob = new b(RecordBubbleItem.ASSISTANT_SIDE_BAR_GUIDE);
                      b uob1 = uob.n(b.t);
                      uob1.s(R.layout.arg_RES_7f0d03f9);
                      uob1.q((d1.b() + (long)5000));
                      uob1 = uob1.z(new f0(b));
                      uob1.x(1);
                      uob1.r(1);
                      uob1.v(new g0(b, uob));
                      uob1.u(new h0(b, uob));
                      d d2 = b.d;
                      a.o(d2, "mCallerContext");
                      w ow1 = d2.b();
                      a.o(ow1, "mCallerContext.controllerManager");
                      c uoc = ow1.V7();
                      if (uoc != null) {
                         uoc.n(uob);
                      }
                   }else if(PatchProxy.applyVoid(null, b, uAssistantMo, "29")){
                      ResourceDownloadProgressHelper.d().a(new a("record", "inner_resource"), ResourceDownloadProgressHelper$DownloadID.ASSISTANT_ID.name(), b.Q.g().u0().E(), v.a);
                   }
                }
             }
          }
       }
    label_01dc :
       if (PostExperimentUtils.W() && (AssistantModeController.i2(b, false, 1, null) && !AssistantUtils.d.d())) {
          d d = b.d;
          a.o(d, "mCallerContext");
          w ow = d.b();
          a.o(ow, "mCallerContext.controllerManager");
          ow.V7().n(b.I);
       }
    label_0206 :
       return;
    }
}
