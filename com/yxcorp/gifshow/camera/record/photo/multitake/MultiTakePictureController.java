package com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import hg9.n;
import jg9.v;
import com.yxcorp.gifshow.util.r0$e;
import com.yxcorp.gifshow.camera.record.photo.multitake.BaseMultiTakePictureController;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$b;
import nsd.u;
import lnc.a1;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.photo.h;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ed9.f;
import java.util.ArrayList;
import jg9.f;
import java.util.LinkedList;
import com.yxcorp.gifshow.camera.record.base.d;
import jg9.a1;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$a;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$photoScoreTaskBuilder$2;
import msd.a;
import qrd.p;
import qrd.s;
import msd.l;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import java.util.concurrent.CopyOnWriteArrayList;
import jg9.t0;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictrueItem;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.View;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import jg9.z0;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import android.view.ViewPropertyAnimator;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$t;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$waitTakePictureFinished$2;
import java.lang.Void;
import com.yxcorp.utility.AsyncTask;
import java.lang.Integer;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$d;
import ce9.l;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import com.kwai.feature.post.api.componet.prettify.makeup.model.a;
import w0c.r;
import w0c.r$a;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import lnc.r7;
import com.yxcorp.gifshow.camerasdk.q;
import pi9.p;
import com.kwai.video.westeros.v2.faceless.FaceMagicController;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import zb9.p0;
import zb9.p0$a;
import java.util.List;
import java.util.Collections;
import oc9.w;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import lnc.m8;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.util.r0;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$i;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import android.app.Activity;
import jg9.e;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$j;
import erd.g;
import crd.b;
import kd9.l0;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$k;
import ig9.a;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$l;
import ed9.a;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$m;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$n;
import eoc.f;
import zb9.j;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$o;
import jg9.b1;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$p;
import android.view.animation.Animation;
import android.content.Context;
import android.view.animation.AnimationUtils;
import w46.b;
import jg9.s;
import jg9.t;
import java.lang.Runnable;
import ekd.k1;
import hg9.l;
import gh9.d;
import com.yxcorp.gifshow.camera.bubble.b;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$q;
import com.yxcorp.gifshow.bubble.b$c;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$r;
import com.yxcorp.gifshow.camera.bubble.b$c;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiPicturePreviewHelper;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment;
import gd9.a;
import lnc.b9;
import jg9.p0;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import jg9.q0;
import jg9.r0;
import lnc.ja;
import e17.i;
import android.animation.Animator;
import com.yxcorp.utility.n;
import android.animation.AnimatorSet;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.Interpolator;
import c2.a;
import android.animation.TimeInterpolator;
import android.animation.AnimatorSet$Builder;
import android.view.animation.LinearInterpolator;
import o79.i;
import jg9.n;
import android.animation.Animator$AnimatorListener;
import jg9.m;
import jg9.o;
import jg9.k;
import jg9.l;
import java.io.File;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.PermissionUtils;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$f;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$g;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$h;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import qrd.l1;
import jg9.u;
import oa0.a;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$s;

public final class MultiTakePictureController extends BaseMultiTakePictureController implements n, v, r0$e	// class@000ef0
{
    public TextView A;
    public View B;
    public s C;
    public View D;
    public b E;
    public final f F;
    public final ArrayList G;
    public m8 H;
    public ProgressFragment I;
    public final f J;
    public final LinkedList K;
    public TextView L;
    public TextView M;
    public final p N;
    public final h O;
    public ViewGroup t;
    public RecyclerView u;
    public boolean v;
    public boolean w;
    public t0 x;
    public ViewStubInflater2 y;
    public View z;
    public static final int P;
    public static final long Q;
    public static final int R;
    public static final int S;
    public static int T;
    public static final String U;
    public static final MultiTakePictureController$b V;

    static {
       MultiTakePictureController.V = new MultiTakePictureController$b(null);
       MultiTakePictureController.P = a1.d(0x7f070f4c);
       MultiTakePictureController.Q = 500;
       MultiTakePictureController.R = a1.d(0x7f070f47);
       MultiTakePictureController.S = a1.e(3.00f);
       MultiTakePictureController.T = 31;
       MultiTakePictureController.U = "MultiTakePictureController";
    }
    public void MultiTakePictureController(CameraPageType p0,b p1,h p2){
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       a.p(p2, "pictureCapture");
       super(p0, p1);
       this.O = p2;
       f uof = new f(CameraPageType.VIDEO);
       this.F = uof;
       this.G = new ArrayList();
       this.J = new f(p1, uof);
       this.K = new LinkedList();
       this.d.n(a1.class, new MultiTakePictureController$a(this));
       this.N = s.c(MultiTakePictureController$photoScoreTaskBuilder$2.INSTANCE);
    }
    public static void t2(MultiTakePictureController p0,boolean p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = false;
       }
       p0.s2(p1);
       return;
    }
    public static void w2(MultiTakePictureController p0,int p1,l p2,int p3,Object p4){
       if (p3 & 0x01) {
          p1 = 0x7f102f5c;
       }
       p0.v2(p1, null);
       return;
    }
    public static void z2(MultiTakePictureController p0,int p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = 5;
       }
       p0.y2(p1);
       return;
    }
    public final void A2(){
       MultiTakePictureController tA;
       if (PatchProxy.applyVoid(null, this, MultiTakePictureController.class, "24")) {
          return;
       }
       if (this.x == null) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w(MultiTakePictureController.U, "updateNextBtnTv", objArray);
       MultiTakePictureController tx = this.x;
       a.m(tx);
       CopyOnWriteArrayList uCopyOnWrite = tx.K0();
       if (!uCopyOnWrite instanceof Collection || !uCopyOnWrite.isEmpty()) {
          Iterator iterator = uCopyOnWrite.iterator();
          int i2 = 0;
          while (iterator.hasNext()) {
             boolean b = (iterator.next().b() > -1)? true: false;
             if (b) {
                i2 = i2 + 1;
                if (i2 < 0) {
                   CollectionsKt__CollectionsKt.V();
                }
             }
          }
          i = i2;
       }
       int i1 = 0x7f10393d;
       if (i > 0) {
          tA = this.A;
          if (tA != null) {
             tA.setText(a1.p(i1)+'('+i+')');
          }
          tx = this.B;
          if (tx != null) {
             tx.setAlpha(0x3f800000);
          }
       }else {
          tA = this.A;
          if (tA != null) {
             tA.setText(a1.p(i1));
          }
          tx = this.B;
          if (tx != null) {
             tx.setAlpha(0x3f000000);
          }
       }
       return;
    }
    public final void B2(){
       z0 a;
       if (PatchProxy.applyVoid(null, this, MultiTakePictureController.class, "49")) {
          return;
       }
       MultiTakePictureController tx = this.x;
       if (tx != null) {
          MultiTakePictureController tM = this.M;
          if (tM != null) {
             if (tM.getVisibility() != 8) {
                return;
             }else if(tx.K0().size() >= 6){
                Object[] objArray = new Object[0];
                a.D().w(MultiTakePictureController.U, "show recommend button", objArray);
                a = z0.a;
                d te = this.e;
                a.o(te, "mActivity");
                Objects.requireNonNull(a);
                if (!PatchProxy.applyVoidOneRefs(te, a, z0.class, "9")) {
                   a.p(te, "page");
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "AI_CHECK_PICTURE";
                   u1.D0("", te, 6, uElementPack, null, null);
                }
                tM.setVisibility(0);
                tM.animate().alpha(0x3f800000).setDuration(150).start();
             }
          }
       }
       return;
    }
    public final void C2(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MultiTakePictureController.class, "48")) {
          return;
       }
       MultiTakePictureController tx = this.x;
       if (tx != null) {
          MultiTakePictureController tL = this.L;
          if (tL != null) {
             Object obj = PatchProxy.apply(objArray, tx, t0.class, "11");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                t0 e = tx.e;
                if (!e instanceof Collection || !e.isEmpty()) {
                   Iterator iterator = e.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         if (!iterator.next().f()) {
                            b = false;
                            break ;
                         }
                      }
                   }
                }
                b = true;
             }
             tL.setSelected(b);
          }
       }
       return;
    }
    public final void D2(l p0,a p1,a p2){
       Object[] this;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, MultiTakePictureController.class, "28")) {
          return;
       }
       if (this.C != null) {
          return;
       }
       this = new Object[0];
       a.D().s(MultiTakePictureController.U, "waitTakePictureFinished", this);
       MultiTakePictureController$t ot = new MultiTakePictureController$t(this, p1, p2, p0, this.O, new MultiTakePictureController$waitTakePictureFinished$2(this));
       this.C = v0;
       a.m(v0);
       Void[] voidArray = new Void[0];
       v0.c(voidArray);
       return;
    }
    public void G0(){
       if (PatchProxy.applyVoid(null, this, MultiTakePictureController.class, "35")) {
          return;
       }
       this.C2();
       this.B2();
       this.A2();
       return;
    }
    public void M(){
       if (PatchProxy.applyVoid(null, this, MultiTakePictureController.class, "36")) {
          return;
       }
       this.u2();
       return;
    }
    public void W0(boolean p0){
       this.w = p0;
    }
    public void Y(int p0){
       l a;
       boolean effectDetect;
       MultiTakePictureController multiTakePic = MultiTakePictureController.class;
       if (PatchProxy.isSupport(multiTakePic) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, multiTakePic, "32")) {
          return;
       }
       this.C2();
       this.B2();
       this.A2();
       MultiTakePictureController$d uod = PatchProxy.apply(null, this, multiTakePic, "29");
       int i = 0;
       if (uod != PatchProxyResult.class) {
       }else {
          Object obj = this.d.d(l.i);
          a.o(obj, "mCallerContext.getData\(MagicData.sDefaultValue\)");
          a = obj.a;
          Object obj1 = this.d.c(BeautifyConfig.class);
          l g = obj.g;
          Object obj2 = this.d.c(a.class);
          obj = this.d.d(r.d.a());
          a.o(obj, "mCallerContext.getData\(R¡­BodySlimmingData.default\)");
          Object obj3 = obj;
          Object obj4 = this.d.c(FilterConfig.class);
          String str = r7.a.a(this.h);
          if (a != null) {
             if (!p.c()) {
                d th = this.h;
                a.o(th, "mCameraHelper");
                FaceMagicController uFaceMagicCo = th.o();
                effectDetect = (uFaceMagicCo != null)? uFaceMagicCo.getEffectDetectResult(): false;
                if (!effectDetect) {
                label_009f :
                   effectDetect = false;
                label_00a0 :
                   MultiTakePictureController$d uod1 = new MultiTakePictureController$d(a, g, obj1, obj2, obj3, obj4, Boolean.valueOf(effectDetect), str);
                }
             }
             effectDetect = true;
             goto label_00a0 ;
          }else {
             goto label_009f ;
          }
       }
       this.G.add(uod);
       if (!p.c()) {
          Object[] objArray = new Object[i];
          a.D().w("MagicEffectTime", "ÅÄÕÕ getMagicEffectDetectResult "+uod.d(), objArray);
       }
       return;
    }
    public boolean c1(){
       l obj = PatchProxy.apply(null, this, MultiTakePictureController.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (super.c1() && !this.d.d(p0.j.a()).c()) {
          obj = this.d.d(l.i).a;
          if (obj == null || obj.isVoteMagic() != b) {
          label_0045 :
             return b;
          }
       }
       b = false;
       goto label_0045 ;
    }
    public void d5(int p0){
       MultiTakePictureController multiTakePic = MultiTakePictureController.class;
       if (PatchProxy.isSupport(multiTakePic) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, multiTakePic, "31")) {
          return;
       }
       super.d5(p0);
       if (p0 != 5 && this.v != null) {
          this.s2(false);
          if (!p0) {
             this.y2(p0);
          }
       }
       return;
    }
    public void g1(int p0,int p1){
       MultiTakePictureController multiTakePic = MultiTakePictureController.class;
       if (PatchProxy.isSupport(multiTakePic) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, multiTakePic, "33")) {
          return;
       }
       Collections.swap(this.G, p0, p1);
       return;
    }
    public boolean g2(){
       l obj = PatchProxy.apply(null, this, MultiTakePictureController.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (super.g2() && !this.d.d(p0.j.a()).c()) {
          obj = this.d.d(l.i).a;
          if (obj == null || obj.isVoteMagic() != b) {
          label_0045 :
             return b;
          }
       }
       b = false;
       goto label_0045 ;
    }
    public boolean h2(){
       int i;
       MultiTakePictureController obj = PatchProxy.apply(null, this, MultiTakePictureController.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.v != null) {
          obj = this.x;
          if (obj != null) {
             CopyOnWriteArrayList uCopyOnWrite = obj.K0();
             if (uCopyOnWrite != null) {
                i = uCopyOnWrite.size();
             label_0029 :
                if (i >= MultiTakePictureController.T) {
                   b = true;
                }
             }
          }
          i = 0;
          goto label_0029 ;
       }
       return b;
    }
    public String i2(){
       Object obj = PatchProxy.apply(null, this, MultiTakePictureController.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a1.p(0x7f1036f5);
    }
    public void k(View p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiTakePictureController.class, str)) {
          return;
       }
       String str1 = "view";
       a.p(p0, str1);
       super.k(p0);
       MultiTakePictureController tJ = this.J;
       d te = this.e;
       a.o(te, "mActivity");
       Objects.requireNonNull(tJ);
       if (!PatchProxy.applyVoidTwoRefs(te, p0, tJ, f.class, str)) {
          a.p(te, "activity");
          a.p(p0, str1);
          tJ.j = te;
          tJ.l = p0;
          tJ.h = p0.findViewById(0x7f0a0086);
          AnimCameraView uAnimCameraV = tJ.o.b().z7();
          a.o(uAnimCameraV, "callerContext.getControl¡­ger\(\).getAnimCameraView\(\)");
          tJ.i = uAnimCameraV;
          tJ.g = p0.findViewById(0x7f0a3d49);
          tJ.k = p0.findViewById(0x7f0a0616);
       }
       d te1 = this.e;
       a.o(te1, "mActivity");
       m8 om8 = new m8(te1);
       this.H = om8;
       a.m(om8);
       om8.o(this);
       MultiTakePictureController tH = this.H;
       if (tH != null) {
          tH.v = new MultiTakePictureController$i(this);
       }
       ViewGroup viewGroup = null;
       this.t = viewGroup;
       this.u = viewGroup;
       ViewStubInflater2 viewStubInfl = new ViewStubInflater2(0x7f0a2c52, 0x7f0a2c4c);
       this.y = viewStubInfl;
       viewStubInfl.d(p0);
       te1 = this.e;
       if (te1 != null) {
          viewGroup = te1.findViewById(R.id.camera_time_tab_scroll_container);
       }
       this.z = viewGroup;
       this.D = p0.findViewById(0x7f0a01d0);
       this.Y1(this.d.l(e.class, new MultiTakePictureController$j(this)));
       this.Y1(this.d.l(l0.class, new MultiTakePictureController$k(this)));
       this.Y1(this.d.l(a.class, new MultiTakePictureController$l(this)));
       this.Y1(this.d.l(a.class, new MultiTakePictureController$m(this)));
       this.Y1(f.a(PanelShowEvent.class, new MultiTakePictureController$n(this)));
       this.Y1(this.d.l(j.class, new MultiTakePictureController$o(this)));
       this.Y1(this.d.l(b1.class, new MultiTakePictureController$p(this)));
       return;
    }
    public Animation k2(){
       Animation obj = PatchProxy.apply(null, this, MultiTakePictureController.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = AnimationUtils.loadAnimation(this.e, R.anim.arg_RES_7f0100d3);
       a.o(obj, "AnimationUtils.loadAnima¡­ake_picture_flash_effect\)");
       return obj;
    }
    public void l1(int p0,boolean p1){
       if (PatchProxy.isSupport(MultiTakePictureController.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, MultiTakePictureController.class, "34")) {
          return;
       }
       this.C2();
       this.B2();
       this.A2();
       return;
    }
    public String m2(){
       String obj = PatchProxy.apply(null, this, MultiTakePictureController.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a1.p(R.string.arg_RES_7f100406);
       a.o(obj, "CommonUtil.string\(R.stri¡­photo_multi_capture_tips\)");
       return obj;
    }
    public void n0(int p0){
       MultiTakePictureController multiTakePic = MultiTakePictureController.class;
       if (PatchProxy.isSupport(multiTakePic) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, multiTakePic, "16")) {
          return;
       }
       if (this.v == null) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().t(MultiTakePictureController.U, "onCaptureFailed", objArray);
       MultiTakePictureController tC = this.C;
       if (tC != null && !PatchProxy.applyVoid(null, tC, s.class, "4")) {
          k1.r(new t(tC), 0);
       }
       return;
    }
    public boolean n2(){
       return this.w;
    }
    public void o2(){
       if (PatchProxy.applyVoid(null, this, MultiTakePictureController.class, "9")) {
          return;
       }
       View view = this.l2().b(false);
       if (view != null) {
          d a = this.d.d(d.c).a;
          b uob = new b(RecordBubbleItem.MULTI_TAKE);
          BubbleInterface$Position bOTTOM = (a != null)? BubbleInterface$Position.BOTTOM: BubbleInterface$Position.TOP;
          uob.y(bOTTOM);
          int i = (a != null)? 0x7f0d0143: 0x7f0d0146;
          uob.s(i);
          b uob1 = uob.n(view).A(R.string.arg_RES_7f1048b7);
          uob1.q((long)3000);
          uob1 = uob1.z(new MultiTakePictureController$q(this));
          uob1.v(new MultiTakePictureController$r(this));
          a.o(uob1, "RecordBubble\(RecordBubbl¡­ue\)\n          }\n        }");
          a = this.d;
          a.o(a, "mCallerContext");
          w ow = a.b();
          a.o(ow, "mCallerContext.controllerManager");
          ow.V7().n(uob1);
       }
       return;
    }
    public boolean onBackPressed(){
       boolean b1;
       MultiTakePictureController obj = PatchProxy.apply(null, this, MultiTakePictureController.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.x;
       boolean b = false;
       if (obj != null) {
          MultiPicturePreviewHelper multiPicture = obj.L0();
          if (multiPicture != null) {
             b1 = multiPicture.onBackPressed();
          label_0025 :
             if (b1) {
                b = true;
             }
             return b;
          }
       }
       b1 = false;
       goto label_0025 ;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, MultiTakePictureController.class, "4")) {
          return;
       }
       super.onDestroyView();
       MultiTakePictureController tH = this.H;
       if (tH != null) {
          tH.i();
       }
       tH = this.x;
       if (tH != null) {
          MultiPicturePreviewHelper multiPicture = tH.L0();
          if (multiPicture != null && !PatchProxy.applyVoid(null, multiPicture, MultiPicturePreviewHelper.class, "11")) {
             int i = 0;
             Object[] objArray = new Object[i];
             a.D().w("MultiPicturePreviewHelper", "onDestroyView", objArray);
             Fragment uFragment = multiPicture.h.getChildFragmentManager().findFragmentByTag("MultiPict_PREVIEW_FRAGMENT");
             if (uFragment != null) {
                Object[] objArray1 = new Object[i];
                a.D().w("MultiPicturePreviewHelper", "finishMeNoAnimator", objArray1);
                if (!uFragment instanceof MediaPreviewFragment) {
                   uFragment = null;
                }
                if (uFragment != null && !PatchProxy.applyVoid(null, uFragment, MediaPreviewFragment.class, "23")) {
                   uFragment.C = true;
                   uFragment.fh();
                }
             }
          }
       }
       this.s2(true);
       this.u2();
       tH = this.J;
       tH.l = null;
       tH.j = null;
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, MultiTakePictureController.class, "3")) {
          return;
       }
       super.onPause();
       MultiTakePictureController tH = this.H;
       if (tH != null) {
          tH.j();
       }
       return;
    }
    public void onResume(){
       MultiTakePictureController multiTakePic = MultiTakePictureController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, multiTakePic, "2")) {
          return;
       }
       super.onResume();
       MultiTakePictureController tH = this.H;
       if (tH != null) {
          tH.k();
       }
       a.e(2);
       if (this.v == null) {
          return;
       }else if(PatchProxy.applyVoid(objArray, this, multiTakePic, "19")){
          b9.a(this.E);
          if (this.x != null) {
             Object[] objArray1 = new Object[0];
             a.D().w(MultiTakePictureController.U, "syncPicture", objArray1);
             multiTakePic = this.x;
             a.m(multiTakePic);
             this.E = t.fromCallable(new p0(multiTakePic.K0())).subscribeOn(d.c).observeOn(d.a).subscribe(new q0(this), r0.b);
          }
       }
       if (this.w != null) {
          multiTakePic = this.x;
          if (multiTakePic != null) {
             MultiPicturePreviewHelper multiPicture = multiTakePic.L0();
             if (multiPicture != null) {
                View view = multiPicture.c();
                if (view != null) {
                   view.bringToFront();
                }
             }
          }
       }
       return;
    }
    public void p2(boolean p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(MultiTakePictureController.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), this, MultiTakePictureController.class, "11")) {
          return;
       }
       super.p2(p0, p1, p2);
       if (p1) {
          ja.a();
       }
       return;
    }
    public void r2(){
       if (PatchProxy.applyVoid(null, this, MultiTakePictureController.class, "7")) {
          return;
       }
       i.a(R.style.arg_RES_7f11066a, 0x7f100405);
       return;
    }
    public final void s2(boolean p0){
       float f;
       View view1;
       float[] uofloatArray3;
       boolean b = this;
       MultiTakePictureController multiTakePic = MultiTakePictureController.class;
       if (PatchProxy.isSupport(multiTakePic) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), b, multiTakePic, "22")) {
          return;
       }
       if (b.v == null) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w(MultiTakePictureController.U, "hideMultiTakePicturePanel", objArray);
       b.v = false;
       b9.a(b.E);
       if (!PatchProxy.applyVoid(null, b, multiTakePic, "23")) {
          Iterator iterator = b.K.iterator();
          while (iterator.hasNext()) {
             b9.a(iterator.next());
          }
          b.K.clear();
       }
       multiTakePic = b.J;
       Objects.requireNonNull(multiTakePic);
       f uof = f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), multiTakePic, uof, "5")) {
          uof = multiTakePic.e;
          if (uof != null) {
             uof.clearAnimation();
          }
          uof = multiTakePic.c;
          if (uof != null && uof.isRunning()) {
             uof.cancel();
          }
          f = 0;
          int i = 0x7f0a063d;
          if (p0) {
             f j = multiTakePic.j;
             if (j != null) {
                View view = j.findViewById(i);
                if (view != null) {
                   view.setTranslationY(f);
                   n.Y(view, 0, 0);
                }
             }
             j = multiTakePic.i;
             if (j == null) {
                a.S("cameraView");
             }
             j.setTranslationY(f);
          }
          AnimatorSet uAnimatorSet = new AnimatorSet();
          f e = multiTakePic.e;
          a.m(e);
          float[] uofloatArray = new float[]{f,multiTakePic.b};
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(e, View.TRANSLATION_Y, uofloatArray);
          long l = 250;
          ObjectAnimator objectAnimat1 = objectAnimat.setDuration(l);
          a.o(objectAnimat1, "panelMoveAnimator.setDuration\(250L\)");
          objectAnimat1.setInterpolator(a.b(0.32f, 0x3f70a3d7, 0x3f19999a, 0x3f800000));
          a.o(objectAnimat, "panelMoveAnimator");
          objectAnimat.setStartDelay(150);
          AnimatorSet$Builder uBuilder = uAnimatorSet.play(objectAnimat);
          f e1 = multiTakePic.e;
          a.m(e1);
          float[] uofloatArray1 = new float[]{f};
          ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(e1, View.ALPHA, uofloatArray1);
          ObjectAnimator objectAnimat3 = objectAnimat2.setDuration(150);
          a.o(objectAnimat3, "panelAlphaAnimator.setDuration\(150L\)");
          objectAnimat3.setInterpolator(new LinearInterpolator());
          a.o(objectAnimat2, "panelAlphaAnimator");
          objectAnimat2.setStartDelay(150);
          uBuilder.with(objectAnimat2);
          f h = multiTakePic.h;
          String str = "animator";
          String str1 = "animator.setDuration\(250L\)";
          int i1 = -1;
          if (h != null && multiTakePic.a(h, ((int)multiTakePic.b * -1))) {
             h.setTranslationY(((float)i1 * multiTakePic.b));
             h.requestLayout();
             float[] uofloatArray2 = new float[]{f};
             objectAnimat2 = ObjectAnimator.ofFloat(h, View.TRANSLATION_Y, uofloatArray2);
             ObjectAnimator objectAnimat4 = objectAnimat2.setDuration(l);
             a.o(objectAnimat4, str1);
             objectAnimat4.setInterpolator(a.b(0.25f, 0.10f, 0.25f, 0x3f800000));
             a.o(objectAnimat2, str);
             objectAnimat2.setStartDelay(150);
             uBuilder.with(objectAnimat2);
          }
          h = multiTakePic.j;
          if (h != null) {
             view1 = h.findViewById(R.id.camera_scroll_snapshot_tab_container);
             if (view1 != null) {
                f uof1 = (n.z(multiTakePic.j) >= i.d(0x43af0000))? 1: null;
                if (uof1) {
                   int i2 = -1;
                   if (multiTakePic.a(view1, ((int)multiTakePic.b * -1))) {
                      view1.setTranslationY(((float)i2 * multiTakePic.b));
                      uofloatArray = new float[]{f};
                      objectAnimat2 = ObjectAnimator.ofFloat(view1, View.TRANSLATION_Y, uofloatArray);
                      ObjectAnimator objectAnimat5 = objectAnimat2.setDuration(250);
                      a.o(objectAnimat5, str1);
                      objectAnimat5.setInterpolator(a.b(0.25f, 0.10f, 0.25f, 0x3f800000));
                      a.o(objectAnimat2, str);
                      objectAnimat2.setStartDelay(150);
                      uBuilder.with(objectAnimat2);
                   }
                }else if(view1.isShown()){
                   objectAnimat3 = ObjectAnimator.ofFloat(view1, View.ALPHA, new float[2]{0,0x3f800000});
                   objectAnimat1 = objectAnimat3.setDuration(50);
                   a.o(objectAnimat1, "snapTabAnimator.setDuration\(50L\)");
                   objectAnimat1.setInterpolator(new LinearInterpolator());
                   objectAnimat3.addListener(new n(view1));
                   uBuilder.with(objectAnimat3);
                }
             }
          }
          h = multiTakePic.g;
          if (h != null) {
             a.m(h);
             int i3 = -1;
             if (multiTakePic.a(h, ((int)multiTakePic.b * -1))) {
                h = multiTakePic.g;
                if (h != null) {
                   h.setTranslationY(((float)i3 * multiTakePic.b));
                }
                h = multiTakePic.g;
                if (h != null) {
                   h.requestLayout();
                }
                h = multiTakePic.g;
                a.m(h);
                uofloatArray3 = new float[]{f};
                objectAnimat2 = ObjectAnimator.ofFloat(h, View.TRANSLATION_Y, uofloatArray3);
                objectAnimat3 = objectAnimat2.setDuration(250);
                a.o(objectAnimat3, "takePictureBtnAnimator.setDuration\(250L\)");
                objectAnimat3.setInterpolator(a.b(0.25f, 0.10f, 0.25f, 0x3f800000));
                a.o(objectAnimat2, "takePictureBtnAnimator");
                objectAnimat2.setStartDelay(150);
                uBuilder.with(objectAnimat2);
             }
          }
          h = multiTakePic.j;
          a.m(h);
          view1 = h.findViewById(R.id.camera_tab_scroll_container);
          if (view1 != null) {
             if (multiTakePic.p.a()) {
                view1.setTranslationY(f);
             }else {
                view1.setAlpha(0x3f800000);
                view1.setVisibility(0);
                uofloatArray3 = new float[]{f};
                objectAnimat2 = ObjectAnimator.ofFloat(view1, View.TRANSLATION_Y, uofloatArray3);
                ObjectAnimator objectAnimat6 = objectAnimat2.setDuration(250);
                a.o(objectAnimat6, "bottomTabMoveAnimator.setDuration\(250L\)");
                objectAnimat6.setInterpolator(a.b(0.32f, 0x3f70a3d7, 0x3f19999a, 0x3f800000));
                a.o(objectAnimat2, "bottomTabMoveAnimator");
                objectAnimat2.setStartDelay(250);
                uBuilder.with(objectAnimat2);
             }
          }
          uAnimatorSet.addListener(new m(multiTakePic));
          multiTakePic.c = uAnimatorSet;
          uAnimatorSet.addListener(new o(multiTakePic));
          h = multiTakePic.c;
          if (h != null) {
             h.start();
          }
          h = multiTakePic.c;
          if (h != null) {
             h.addListener(new k());
          }
          h = multiTakePic.c;
          if (h != null) {
             h.addListener(new l());
          }
          h = multiTakePic.l;
          view1 = (h != null)? h.findViewById(R.id.side_bar_right_shader): null;
          multiTakePic.d(view1, 0);
       }
       multiTakePic = b.C;
       if (multiTakePic != null) {
          multiTakePic.a(0);
       }
       b.C = null;
       b.G.clear();
       return;
    }
    public void t0(File p0,Bitmap p1,int p2){
       if (PatchProxy.isSupport(MultiTakePictureController.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, MultiTakePictureController.class, "14")) {
          return;
       }
       if (!this.c1() || (p1 != null && p0 != null)) {
          if (!PermissionUtils.a(this.e, "android.permission.WRITE_EXTERNAL_STORAGE")) {
             return;
          }else {
             a uoa = a.D();
             String u = MultiTakePictureController.U;
             StringBuilder str = "onCaptureBitmapSuccess: ";
             String absolutePath = p0.getAbsolutePath();
             if (absolutePath == null) {
                absolutePath = "ErrorFile";
             }
             Object[] objArray = new Object[0];
             uoa.s(u, str+absolutePath, objArray);
             String absolutePath1 = p0.getAbsolutePath();
             if (!p1.getWidth()) {
                return;
             }else {
                this.K.add(t.fromCallable(new MultiTakePictureController$f(p1)).subscribeOn(d.c).observeOn(d.a).subscribe(new MultiTakePictureController$g(this, p1, absolutePath1, p2), MultiTakePictureController$h.b));
             }
          }
       }
       return;
    }
    public final void u2(){
       if (PatchProxy.applyVoid(null, this, MultiTakePictureController.class, "41")) {
          return;
       }
       MultiTakePictureController tI = this.I;
       if (tI != null) {
          a.m(tI);
          if (tI.isAdded()) {
             tI = this.I;
             a.m(tI);
             tI.dismissAllowingStateLoss();
          }
       }
       this.I = null;
       return;
    }
    public final void v2(int p0,l p1){
       MultiTakePictureController multiTakePic = MultiTakePictureController.class;
       if (PatchProxy.isSupport(multiTakePic) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, multiTakePic, "40")) {
          return;
       }
       d td = this.d;
       a.o(td, "mCallerContext");
       BaseFragment uBaseFragmen = td.f();
       a.o(uBaseFragmen, "mCallerContext.fragment");
       if (!uBaseFragmen.isResumed()) {
          return;
       }
       if (this.I != null) {
          this.u2();
          this.I = null;
       }
       ProgressFragment progressFrag = new ProgressFragment();
       this.I = progressFrag;
       if (p1 != null) {
          a.m(progressFrag);
          l1 ol1 = p1.invoke(progressFrag);
       }
       MultiTakePictureController tI = this.I;
       a.m(tI);
       tI.Ih(p0);
       MultiTakePictureController tI1 = this.I;
       a.m(tI1);
       d td1 = this.d;
       a.o(td1, "mCallerContext");
       BaseFragment uBaseFragmen1 = td1.f();
       a.o(uBaseFragmen1, "mCallerContext.fragment");
       tI1.show(uBaseFragmen1.getChildFragmentManager(), "MultiTakePictureWait");
       return;
    }
    public void x0(File p0,Bitmap p1,int p2){
       if (PatchProxy.isSupport(MultiTakePictureController.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, MultiTakePictureController.class, "15")) {
          return;
       }
       a.p(p0, "pictureFile");
       if (this.v == null) {
          return;
       }
       a uoa = a.D();
       String u = MultiTakePictureController.U;
       StringBuilder str = "onCaptureSuccess: ";
       String absolutePath = p0.getAbsolutePath();
       if (absolutePath == null) {
          absolutePath = "ErrorFile";
       }
       Object[] objArray = new Object[0];
       uoa.s(u, str+absolutePath, objArray);
       MultiTakePictureController tC = this.C;
       if (tC != null && !PatchProxy.applyVoid(null, tC, s.class, "5")) {
          k1.r(new u(tC), 0);
       }
       return;
    }
    public void y1(int p0){
       MultiTakePictureController multiTakePic = MultiTakePictureController.class;
       if (PatchProxy.isSupport(multiTakePic) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, multiTakePic, "30")) {
          return;
       }
       this.C2();
       this.B2();
       this.A2();
       if (this.G.size() > 0) {
          this.G.remove(p0);
       }
       return;
    }
    public final void y2(int p0){
       MultiTakePictureController multiTakePic = MultiTakePictureController.class;
       if (PatchProxy.isSupport(multiTakePic) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, multiTakePic, "18")) {
          return;
       }
       if (a.a.getBoolean("first_show_new_multi_album_tips", true)) {
          multiTakePic = this.D;
          if (multiTakePic != null) {
             multiTakePic.postDelayed(new MultiTakePictureController$s(this, p0), MultiTakePictureController.Q);
          }
       }
       return;
    }
}
