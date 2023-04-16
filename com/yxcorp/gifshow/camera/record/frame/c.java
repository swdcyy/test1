package com.yxcorp.gifshow.camera.record.frame.c;
import com.kwai.camerasdk.render.VideoViewListener;
import in6.b;
import oh9.v;
import oc9.e0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.kwai.gifshow.post.api.core.model.CameraFramePageType;
import com.kwai.robust.PatchProxyResult;
import kd9.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.frame.c$e;
import com.yxcorp.gifshow.camera.record.frame.c$d;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.frame.c$c;
import java.lang.Enum;
import com.yxcorp.gifshow.camera.record.frame.n;
import oc9.t;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camera.record.frame.l;
import com.yxcorp.gifshow.camera.record.frame.a;
import kd9.a;
import kd9.u0;
import kd9.s;
import kd9.i;
import com.yxcorp.gifshow.camera.record.base.b$a;
import kd9.c;
import android.app.Activity;
import com.yxcorp.gifshow.media.model.CameraPageConfig;
import java.lang.Number;
import ld9.b;
import android.content.res.Configuration;
import com.yxcorp.utility.n;
import android.content.Context;
import java.lang.Math;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Integer;
import android.view.View;
import com.yxcorp.gifshow.camera.record.frame.c$b;
import android.view.View$OnLayoutChangeListener;
import kd9.f;
import java.lang.Runnable;
import com.kwai.library.widget.popup.common.f;
import android.content.Intent;
import ekd.j0;
import com.kwai.feature.post.api.util.g;
import android.os.Build$VERSION;
import oe6.e;
import com.kwai.gifshow.post.api.core.model.TakePictureType;
import java.util.List;
import java.util.Iterator;
import kd9.n0;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import ld9.a;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import in6.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import maa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.Collection;
import ekd.q;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.Asset$ShootInfo;
import com.yxcorp.gifshow.camerasdk.q;
import wd9.a;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import hi9.d;
import java.util.Objects;
import android.graphics.Rect;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import u36.b;
import u36.b$a;
import ca9.a;
import ca9.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Float;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.yxcorp.gifshow.camera.record.widget.CameraView;
import m65.f;
import com.kwai.camerasdk.models.DisplayLayout;
import sm6.b;
import com.kwai.library.widget.imageview.ForegroundImageView;
import android.view.ViewParent;
import android.view.ViewGroup;
import kd9.l0;
import android.graphics.Point;
import gg9.p;
import kd9.j;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView$a;
import fd9.a;
import kd9.n;
import erd.g;
import crd.b;
import eoc.f;
import ce9.l;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import q5b.l;
import com.yxcorp.gifshow.camera.record.frame.c$a;
import androidx.fragment.app.Fragment;
import com.kwai.camerasdk.videoCapture.CameraController;
import ekd.k1;
import zg9.b;
import kd9.h;
import oc9.w;
import com.yxcorp.gifshow.media.model.CameraConfig;
import tkd.b;
import tkd.d;
import t5b.a;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.io.File;
import ixc.c;
import kd9.e;
import com.kuaishou.edit.draft.Asset$b;
import oh9.u;
import qi9.c;
import j4b.n;
import kd9.p;
import kd9.t;
import kd9.o;
import com.kwai.gifshow.post.api.feature.ktv.KtvMode;
import com.yxcorp.gifshow.camera.record.frame.b;
import lm6.c;
import kd9.m;
import kd9.u;
import kd9.k;
import zb9.i;
import kd9.l;
import hd9.n;

public class c extends e0 implements VideoViewListener, b, v	// class@000dde
{
    public int A;
    public int B;
    public int[] C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public CameraFramePageType I;
    public TakePictureType J;
    public int K;
    public Runnable L;
    public int M;
    public int N;
    public final c$e O;
    public View q;
    public View r;
    public boolean s;
    public n t;
    public l u;
    public a v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    public void c(CameraPageType p0,b p1,CameraFramePageType p2){
       int b;
       d tc;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       super(p0, p1);
       int i = 0;
       this.K = i;
       this.L = new d(this);
       Object[] objArray = null;
       c$d uod = PatchProxy.apply(objArray, this, uoc, "57");
       if (uod != patchProxyRe) {
       }else {
          uod = new c$d(this);
       }
       this.O = uod;
       this.I = p2;
       Object obj = PatchProxy.apply(objArray, this, uoc, "36");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          b = c$c.a[this.I.ordinal()];
          b = (b != 1 && (b != 2 && (b != 4 && (b != 5 && (b != 7 && b != 8)))))? false: true;
       }
       if (b) {
          n on = new n(p0, p1, uod);
          this.t = on;
          this.L0(on);
       }
       if (this.I != CameraFramePageType.LIVE_ENTRY) {
          tc = this.c;
          if (tc != CameraPageType.TIE_TIE && tc != CameraPageType.WHATS_UP) {
             i = 1;
          }
       }
       if (i) {
          l ol = new l(p0, p1, uod);
          this.u = ol;
          this.L0(ol);
       }
       a uoa = new a(p0, p1, uod);
       this.v = uoa;
       this.L0(uoa);
       tc = this.c;
       if (tc != CameraPageType.TIE_TIE && tc != CameraPageType.WHATS_UP) {
          this.L0(new a(p0, p1, p2));
          this.L0(new u0(p0, p1, p2));
       }
       this.d.n(s.class, new i(this));
       this.d.n(b.class, new c(this));
       this.d.n(v.class, new c(this));
       return;
    }
    public static int p2(Activity p0,CameraPageConfig p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.a(p1, b.e(p0, CameraPageType.VIDEO))[1];
    }
    public static int r2(Activity p0,CameraPageConfig p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.a(p1, b.e(p0, CameraPageType.VIDEO))[0];
    }
    public boolean A2(Configuration p0){
       d obj = PatchProxy.applyOneRefs(p0, this, c.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.e;
       d te = this.e;
       int i = n.P(te, (float)n.j(te));
       boolean b = true;
       if (Math.abs((n.P(obj, (float)n.k(obj)) - p0.screenWidthDp)) <= b && Math.abs((i - p0.screenHeightDp)) <= b) {
          b = false;
       }
       return b;
    }
    public void B2(){
       if (PatchProxy.applyVoid(null, this, c.class, "29")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("FrameBaseController", "onCameraViewRatioChangeEnd, mIsResolutionRatioChanging:"+this.x, objArray);
       if (this.x == null) {
          this.m2();
       }
       return;
    }
    public void C2(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("FrameBaseController", "onChangeFrameMode...mode: "+p0, objArray);
       if (!p0) {
          return;
       }
       if (this.q == null) {
          return;
       }
       this.w2(p0);
       this.q.requestLayout();
       this.q.addOnLayoutChangeListener(new c$b(this, p0));
       return;
    }
    public void D2(){
       if (PatchProxy.applyVoid(null, this, c.class, "42")) {
          return;
       }
       f.F(n.f(this.e), new f(this));
       return;
    }
    public void E2(){
       int i1;
       if (PatchProxy.applyVoid(null, this, c.class, "14")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "FrameBaseController";
       a.D().s(str, "resetFrameMode", objArray);
       if (this.w != null) {
          return;
       }
       this.z = i;
       if (this.g2()) {
          i1 = this.v2(this.e);
       }else if(this.I == CameraFramePageType.LIVE_ENTRY){
          i1 = 5;
       }else {
          i1 = j0.b(this.e.getIntent(), "frame_mode", this.v2(this.e));
       }
       int i2 = 1;
       if (g.m(this.e)) {
          objArray = new Object[i];
          a.D().w(str, "It is in MultiWindowMode, force use MODE_9_16", objArray);
          i1 = true;
       }
       if (Build$VERSION.SDK_INT >= 26 && j0.a(this.e.getIntent(), "show_half_album_view", i)) {
          if (this.g2()) {
             d tc = this.c;
             if (tc != CameraPageType.WHATS_UP && tc != CameraPageType.TIE_TIE) {
                e.x0(i2);
             }
          }
       }else {
          i2 = i1;
       }
       this.i2(i2);
       return;
    }
    public void F2(boolean p0){
       this.F = p0;
    }
    public void H2(TakePictureType p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "47")) {
          return;
       }
       this.J = p0;
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoc, "56")) {
          Iterator iterator = this.getChildren().iterator();
          while (iterator.hasNext()) {
             t ot = iterator.next();
             if (ot instanceof n0) {
                ot.v1(p0);
             }
          }
       }
       return;
    }
    public final void I2(){
       if (PatchProxy.applyVoid(null, this, c.class, "58")) {
          return;
       }
       if (this.I == CameraFramePageType.KTV && !this.z2()) {
          this.e.getIntent().putExtra("frame_mode", 1);
       }
       if (this.I == CameraFramePageType.LIVE_ENTRY || this.c == CameraPageType.LIVE_COVER) {
          this.e.getIntent().putExtra("frame_mode", 1);
       }
       if (this.I == CameraFramePageType.SAME_FRAME) {
          this.e.getIntent().putExtra("frame_mode", 1);
       }
       return;
    }
    public void L3(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "28")) {
          return;
       }
       super.L3(p0);
       if (p0 == null) {
          Object[] objArray = new Object[0];
          a.D().s("FrameBaseController", "onBuildFinish RecordInfo is null", objArray);
          return;
       }else {
          p0.e.Y0(a.a(this.z, this.O.o1()));
          return;
       }
    }
    public int O0(){
       return a.c(this);
    }
    public int R(){
       Object obj = PatchProxy.apply(null, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = c$c.a[this.I.ordinal()];
       if (i != 1 && (i != 2 && i != 3)) {
          return 0;
       }
       return 0x7f0d0178;
    }
    public int T(){
       return a.a(this);
    }
    public void W(c p0){
       int i2;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "23")) {
          return;
       }
       int i = c$c.a[this.I.ordinal()];
       int i1 = 1;
       if (i == i1 || (i == 2 || (i == 3 || i == 4))) {
          this.u.m2((i1 ^ this.a2()));
          d obj = PatchProxy.applyOneRefs(p0, this, uoc, "24");
          if (obj != PatchProxyResult.class) {
             i2 = obj.intValue();
          }else {
             a uoa = p0.o0();
             obj = null;
             if (uoa != null) {
                List list = uoa.z();
                if (!q.f(list)) {
                   Asset uAsset = list.get(obj);
                   if (uAsset != null && uAsset.hasShootInfo()) {
                      i2 = uAsset.getShootInfo().getResolutionValue();
                      if (i2 != 5) {
                         if (i2 == 6) {
                            i2 = 5;
                         }
                      }
                   }
                }
             }
             i2 = 0;
          }
          obj = this.h;
          if (obj != null && obj.M()) {
             this.i2(i2);
          }else {
             this.K = i2;
          }
       }
       return;
    }
    public int Y0(){
       return 6;
    }
    public int a1(){
       return a.b(this);
    }
    public final boolean g2(){
       a obj = PatchProxy.apply(null, this, c.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       switch (c$c.a[this.I.ordinal()]){
           case 2:
             obj = this.d.d(a.i);
             if (obj.b == null || obj.d == null) {
                b = true;
             }
             return b;
             break;
           case 4:
           case 6:
           case 7:
           case 8:
           case 5:
             if (this.c == CameraPageType.PHOTO) {
                c tJ = this.J;
                if (tJ == TakePictureType.SHOOT_IMAGE || tJ == TakePictureType.SHARE) {
                   b = true;
                }
             }
             break;
           default:
          label_0023 :
             return true;
       }
       return b;
    }
    public final void h2(int p0){
       int i4;
       d c;
       int i5;
       int i6;
       int i7;
       ViewGroup$LayoutParams layoutParams1;
       Object[] objArray2;
       c uoc1;
       int i9;
       SharedPreferences$Editor uEditor;
       int i = this;
       int i1 = p0;
       b uob = b.class;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), i, uoc, "43")) {
          return;
       }
       int i2 = 0;
       Object[] objArray = new Object[i2];
       String str = "FrameBaseController";
       a.D().w(str, "adjustCameraViewWhenRatioChanged", objArray);
       AnimCameraView uAnimCameraV = this.n2();
       if (uAnimCameraV == null) {
          return;
       }
       float f = g.d(i1, i.e, i.O.o1());
       Object[] objArray1 = new Object[i2];
       a.D().w(str, "adjustCameraViewWhenRatioChanged...ratio: "+f, objArray1);
       if (!f) {
          return;
       }
       boolean i3 = 2;
       objArray1 = null;
       float f1 = 0x3f000000;
       if (i.v.o2()) {
          i4 = n.k(i.e);
          c = i.c;
          if (c == CameraPageType.TIE_TIE || c == CameraPageType.WHATS_UP) {
             i4 = i4 - (d.b() * 2);
          }
          i4 = Math.min(n.j(i.e), (int)(((float)i4 / f) + f1));
          i5 = (int)(((float)i4 * f) + f1);
          i6 = i4;
          i7 = i5;
       }else {
          CameraPageType lIVE_AVATAR = CameraPageType.LIVE_AVATAR;
          if (i.c == lIVE_AVATAR) {
             c v = i.v;
             Objects.requireNonNull(v);
             Rect rect = PatchProxy.apply(objArray1, v, a.class, "12");
             if (rect != PatchProxyResult.class) {
             }else if(v.c == lIVE_AVATAR){
                v.n.getLayoutParams();
                d e = v.e;
                rect = b.r(b.class, b$a.b).HU(e, e.findViewById(R.id.camera_flash_bar_root));
                objArray2 = new Object[i2];
                a.D().s("CameraViewFrameController", "cameraViewRest w:"+rect.width()+" h:"+rect.height(), objArray2);
             }else {
                rect = new Rect();
             }
             i6 = Math.min(n.j(i.e), (int)(((float)n.k(i.e) / f) + f1));
             i5 = rect.width();
             i4 = rect.height();
             i7 = (int)(((float)i6 * f) + f1);
          }else {
             i4 = Math.min(n.j(i.e), (int)(((float)n.k(i.e) / f) + f1));
             i7 = (int)(((float)i4 * f) + f1);
             i6 = uAnimCameraV.getWidth();
             int i11 = i6;
             i6 = i4;
             i4 = (int)(((float)i6 / f) + f1);
             i5 = i11;
          }
       }
       i3 = (i1 != i3 && i1 != 3)? true: false;
       i.v.r2(i3);
       ViewGroup$LayoutParams layoutParams = uAnimCameraV.getLayoutParams();
       ViewGroup$LayoutParams height = layoutParams.height;
       if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
          d c1 = i.c;
          if (c1 != CameraPageType.TIE_TIE && c1 != CameraPageType.WHATS_UP) {
             if (g.m(i.e)) {
                layoutParams1 = height;
                objArray2 = new Object[0];
                a.D().w(str, "activity is in MultiWindowMode, force set CameraView marginTop to 0!", objArray2);
                i2 = 0;
             }else {
                layoutParams1 = height;
                i2 = i.v.l2(i1, i5, i4);
             }
             ViewGroup$LayoutParams layoutParams2 = layoutParams;
             ViewGroup$MarginLayoutParams topMargin = layoutParams2.topMargin;
             uoc1 = uoc;
             if (layoutParams.width == i5 && (layoutParams.height == i4 && i2 == topMargin)) {
                Object[] objArray3 = new Object[0];
                a.D().w(str, "AnimCameraView width, height and marginTop is not changed!", objArray3);
                if (i3) {
                   i.v.g2(i4, topMargin);
                }
                this.B2();
                return;
             }else {
                int i8 = topMargin - i2;
                layoutParams2.topMargin = i2;
                if (i3) {
                   i.v.g2(i4, i2);
                }
                if (i.F != null) {
                   b.j(i1, i2);
                   if (i1 == 5) {
                      if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), null, uob, "4")) {
                         uEditor = a.a.edit();
                         uEditor.putFloat("camera_view_all_screen_frame_ratio", f);
                         g.a(uEditor);
                      }
                   }else if(i1 == 1 && (!i.O.o1() || (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(f), null, uob, "5")))){
                      uEditor = a.a.edit();
                      uEditor.putFloat("camera_view_9_16_frame_ratio", f);
                      g.a(uEditor);
                   }
                }
                i9 = i8;
             label_0227 :
                layoutParams.height = i4;
                layoutParams.width = i5;
                uAnimCameraV.setLayoutParams(layoutParams);
                if (i1 == 5 && (uAnimCameraV.getCameraView() != null && uAnimCameraV.getCameraView().getSurfaceView() != null)) {
                   DisplayLayout fIX_WIDTH_HE = DisplayLayout.FIX_WIDTH_HEIGHT;
                   if (uAnimCameraV.getCameraView().getSurfaceView().getDisplayLayout() != fIX_WIDTH_HE) {
                      uAnimCameraV.getCameraView().getSurfaceView().setDisplayLayout(fIX_WIDTH_HE);
                   }
                }
                if (!i.O.o1()) {
                   int i10 = b.f(i1, i7, i6, i.e, false);
                   if (!PatchProxy.isSupport(uoc1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(i10), i, uoc1, "51")) {
                      i.N = i10;
                      Iterator iterator = this.getChildren().iterator();
                      while (iterator.hasNext()) {
                         t ot = iterator.next();
                         if (ot instanceof n0) {
                            ot.Rf(i1, i10);
                         }
                      }
                   }
                }
                ForegroundImageView blurPreviewI = uAnimCameraV.getBlurPreviewImage();
                if (blurPreviewI != null && (i.w != null && this.y2())) {
                   if (uAnimCameraV.getParent() instanceof ViewGroup) {
                      uAnimCameraV.getParent().setClipChildren(false);
                   }
                   i.v.h2(blurPreviewI, layoutParams1, i9, i4, 0);
                }else if(uAnimCameraV.getParent() instanceof ViewGroup){
                   uAnimCameraV.getParent().setClipChildren(true);
                }
                return;
             }
          }
       }
       uoc1 = uoc;
       layoutParams1 = height;
       i9 = 0;
       goto label_0227 ;
    }
    public void i2(int p0){
       int b;
       int[] ointArray1;
       int i5;
       int i6;
       int i7;
       c c;
       Object[] obj;
       boolean b1;
       c r;
       d c1;
       Point x;
       int i = this;
       int i1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), i, uoc, "17")) {
          return;
       }
       if (i.h == null) {
          return;
       }
       int i2 = 4;
       int i3 = 1;
       if (!i1 || (b.i(i.e) && i1 == i2)) {
          i1 = 1;
       }
       b = (i.O.o1() && !b.i(i.e))? true: false;
       i1 = b.h(b, i.O.s1(), i1);
       if (i.w == null && (i.z != i1 || g.m(i.e))) {
          Object[] objArray = new Object[0];
          a.D().w("FrameBaseController", "changeFrameMode...mode: "+i1, objArray);
          i.d.m(new l0(i3, i1));
          int[] ointArray = b.a(this.o2(), i1);
          i.A = ointArray[0];
          i.B = ointArray[i3];
          d e = i.e;
          CameraPageConfig uCameraPageC = this.o2();
          c i4 = i.I;
          if (PatchProxy.isSupport(uoc)) {
             i3 = 5;
             ointArray1 = PatchProxy.applyFourRefs(e, uCameraPageC, Integer.valueOf(i1), i4, 0, c.class, "22");
             if (ointArray1 != patchProxyRe) {
                b = 1;
                i5 = 2;
             label_011c :
                i.C = ointArray1;
                i6 = this.u2();
                i7 = this.s2();
                int i8 = this.t2();
                c = i.C;
                int i9 = c[0];
                int i10 = c[b];
                if (PatchProxy.isSupport(uoc)) {
                   Object[] objArray1 = new Object[i3];
                   objArray1[0] = Integer.valueOf(i6);
                   objArray1[b] = Integer.valueOf(i7);
                   objArray1[i5] = Integer.valueOf(i8);
                   objArray1[3] = Integer.valueOf(i9);
                   objArray1[i2] = Integer.valueOf(i10);
                   obj = PatchProxy.apply(objArray1, i, uoc, "37");
                   if (obj != patchProxyRe) {
                      b1 = obj.booleanValue();
                   }else {
                   label_0166 :
                      c1 = i.h;
                      if (c1 != null && (!c1.M() || !i.h.O(this.u2(), this.s2(), this.t2()))) {
                         c1 = (i9 != i.D || i10 != i.E)? 1: 0;
                         if (!c1) {
                            b1 = false;
                         }
                      }
                      b1 = true;
                   }
                }else {
                   goto label_0166 ;
                }
                if (b1) {
                   i.w = true;
                   if (i1 != e.k() && (i.c != CameraPageType.WHATS_UP && i.d.d(p.c).b != null)) {
                      r = i.r;
                      if (r != null) {
                         r.setEnabled(0);
                      }
                      obj = new Object[0];
                      a.D().w("FrameBaseController", "show frame anim", obj);
                      i.y = true;
                      AnimCameraView uAnimCameraV = this.n2();
                      if (uAnimCameraV != null) {
                         uAnimCameraV.a(i.h, new j(i, uAnimCameraV, i1));
                      }
                   }else {
                      i.x = false;
                      i.k2(i1);
                   }
                }else {
                   i.C2(i1);
                }
                i.H = i.z;
                i.z = i1;
                e.b0(i1);
                if (this.g2()) {
                   c1 = i.c;
                   if (c1 != CameraPageType.WHATS_UP && c1 != CameraPageType.TIE_TIE) {
                      e.x0(i1);
                   }
                }
                i.e.getIntent().putExtra("frame_mode", i1);
                r = i.u;
                if (r != null) {
                   Objects.requireNonNull(r);
                   if (!PatchProxy.isSupport(l.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), r, l.class, "24")) {
                      r.p2(r.z.p1());
                   }
                }
             }
          }else {
             i3 = 5;
          }
          i7 = n.j(e);
          if (i1 != i2) {
             if (i1 == i3 && i4 != CameraFramePageType.SAME_FRAME) {
                i6 = b.h(i3, e, i7);
                x = n.s(e).x;
             }else {
                b = 0;
                i6 = 0;
             }
          }else {
             uCameraPageC = uCameraPageC.mPreviewHeight;
             x = (int)((float)uCameraPageC * g.b(e));
          }
          Object[] objArray2 = new Object[0];
          a.D().w("FrameBaseController", "calculateCropSize...mode: "+i1+" , cropWidth: "+b+" , cropHeight: "+i6, objArray2);
          i5 = 2;
          ointArray1 = new int[i5];
          ointArray1[0] = b;
          b = 1;
          ointArray1[b] = i6;
          goto label_011c ;
       }
    label_022f :
       return;
    }
    public void k(View p0){
       l a;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "2")) {
          return;
       }
       this.I2();
       super.k(p0);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().s("FrameBaseController", "onViewCreated", objArray);
       this.Y1(f.a(a.class, new n(this)));
       this.q = p0.findViewById(0x7f0a31ef);
       this.r = this.e.findViewById(0x7f0a063e);
       this.s = i;
       this.y = i;
       this.A = i;
       this.B = i;
       this.D = i;
       this.E = i;
       this.H = i;
       if (!PatchProxy.applyVoid(null, this, uoc, "16")) {
          a = this.d.d(l.i).a;
          if (a != null) {
             if (!l.a(a)) {
                this.e.getIntent().putExtra("frame_mode", 1);
             }else if(!l.b(j0.b(this.e.getIntent(), "frame_mode", b.e(this.e, this.c)), a)){
                Object[] objArray1 = new Object[i];
                a.D().s("FrameBaseController", "magicFace not null, frameMode is not support magicFace, set last mode", objArray1);
                this.e.getIntent().putExtra("frame_mode", this.z);
             }
          }
       }
       this.M = g.f(this.e);
       this.E2();
       p0.addOnLayoutChangeListener(new c$a(this, p0));
       return;
    }
    public void k2(int p0){
       a uoa;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "18")) {
          return;
       }
       this.C2(p0);
       if (!PatchProxy.applyVoid(null, this, uoc, "19")) {
          String str = "FrameBaseController";
          if (this.f.isResumed()) {
             d th = this.h;
             if (th != null && (th.M() && this.h.O(this.u2(), this.s2(), this.t2()))) {
                Object[] objArray = new Object[0];
                a.D().w(str, "changeCaptureResolution", objArray);
                this.h.updateResolutionCaptureConfig(this.u2(), this.s2(), this.t2());
                uoa = 1;
             label_006b :
                if (this.h != null && !uoa) {
                   objArray = new Object[0];
                   a.D().w(str, "change crop size.", objArray);
                   c tC = this.C;
                   this.l2(tC[0], tC[1]);
                }
             }
          }
          uoa = null;
          goto label_006b ;
       }
    label_0085 :
       k1.m(this.L);
       k1.r(this.L, 5000);
       return;
    }
    public final void l2(int p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc, "20")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("FrameBaseController", "doUpdateCropSize.", objArray);
       this.h.h1(p0, p1);
       this.D = p0;
       this.E = p1;
       return;
    }
    public final void m2(){
       if (PatchProxy.applyVoid(null, this, c.class, "26")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("FrameBaseController", "endFrameSwitch", objArray);
       k1.m(this.L);
       if (this.w != null) {
          this.d.m(new l0(3, this.z));
          c tH = this.H;
          if (tH != this.z && tH != null) {
             this.d.m(new b());
          }
          this.w = i;
          tH = this.r;
          if (tH != null) {
             tH.setEnabled(true);
          }
       }
       AnimCameraView uAnimCameraV = this.n2();
       if (uAnimCameraV != null) {
          d tc = this.c;
          if (tc != CameraPageType.TIE_TIE && tc != CameraPageType.WHATS_UP) {
             uAnimCameraV.postDelayed(new h(uAnimCameraV), 33);
          }
       }
       return;
    }
    public final AnimCameraView n2(){
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, c.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v;
       if (obj != null) {
          objArray = obj.i2();
       }
       return objArray;
    }
    public final CameraPageConfig o2(){
       c obj = PatchProxy.apply(null, this, c.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.I;
       if (obj != CameraFramePageType.PHOTO && (obj == CameraFramePageType.LIVE_AVATAR || obj == CameraFramePageType.LIVE_COVER)) {
          return this.d.b().Ve().getPhotoPageConfig();
       }
       return this.d.b().Ve().getRecordPageConfig();
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, c.class, "8")) {
          return;
       }
       super.onDestroyView();
       Object[] objArray = new Object[0];
       a.D().s("FrameBaseController", "onDestroyView", objArray);
       this.m2();
       k1.m(this.L);
       return;
    }
    public void onPreviewSizeChange(int p0,int p1,int p2,int p3){
       l a;
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, c.class, "25")) {
          return;
       }
       p1 = 0;
       Object[] objArray = new Object[p1];
       a.D().w("FrameBaseController", "onPreviewSizeChange old size : "+p0+"x"+p1+" new size : "+p2+"x"+p3, objArray);
       if (this.h == null) {
          return;
       }
       c tC = this.C;
       this.l2(tC[p1], tC[1]);
       tC = this.C;
       if (tC[p1] && (tC[1] && (double)Math.abs(((((float)tC[p1] * 0x3f800000) / (float)tC[1]) - (((float)p2 * 0x3f800000) / (float)p3))) - 0x3f847ae147ae147b > 0)) {
          return;
       }
       a = this.d.d(l.i).a;
       if (a != null) {
          Object[] objArray1 = new Object[p1];
          a.D().s("FrameBaseController", "changeFrameMode done, magicFace not null, set MagicFace", objArray1);
          this.h.F0(a, d.a(0x3bf0d115).K00(a).getAbsolutePath());
       }
       tC = this.v;
       if (tC != null && !tC.p2()) {
          this.m2();
       }
       this.x = p1;
       tC = c$c.a[this.I.ordinal()];
       if (tC != 1 && (tC != 2 && (tC != 3 && (tC == 4 && this.K != null)))) {
          k1.o(new e(this));
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       super.onResume();
       if (this.w == null) {
          this.C2(this.z);
       }
       return;
    }
    public void r0(int p0,Asset$b p1,b p2){
       u.b(this, p0, p1, p2);
    }
    public int s2(){
       d obj = PatchProxy.apply(null, this, c.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.I == CameraFramePageType.LIVE_COVER && this.c == CameraPageType.LIVE_COVER) {
          obj = this.h;
          if (obj != null && obj.n() != null) {
             return this.h.n().h();
          }
       }
       if (this.I == CameraFramePageType.LIVE_ENTRY) {
          return 1280;
       }else {
          return this.B;
       }
    }
    public int t2(){
       Object obj = PatchProxy.apply(null, this, c.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Math.max(this.u2(), this.s2());
    }
    public int u2(){
       d obj = PatchProxy.apply(null, this, c.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.I == CameraFramePageType.LIVE_COVER && this.c == CameraPageType.LIVE_COVER) {
          obj = this.h;
          if (obj != null && obj.n() != null) {
             return this.h.n().j();
          }
       }
       if (this.I == CameraFramePageType.LIVE_ENTRY) {
          return 720;
       }else {
          return this.A;
       }
    }
    public final int v2(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.I == CameraFramePageType.PHOTO && (this.c == CameraPageType.PHOTO && this.J == TakePictureType.SEND_IMAGE)) {
          int i = (b.i(p0))? 1: 4;
          return i;
       }else if(!this.g2()){
          return b.e(p0, this.c);
       }else {
          return b.f(p0, this.c);
       }
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       super.w1(p0);
       this.d.l(n.class, new p(this));
       this.d.l(t.class, new o(this));
       this.d.l(KtvMode.class, new b(this));
       this.d.l(c.class, new m(this));
       this.d.l(u.class, new k(this));
       this.d.l(i.class, new l(this));
       e.b0(this.v2(this.e));
       return;
    }
    public void w2(int p0){
       c obj;
       int i;
       Iterator iterator;
       t ot;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "5")) {
          return;
       }
       String str = null;
       int b = (this.O.o1() && !b.i(this.e))? true: false;
       b = b.h(b, this.O.s1(), p0);
       if (b != p0) {
          this.i2(b);
       }
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(b), this, uoc, "7")) {
          d tc = this.c;
          if (tc == CameraPageType.TIE_TIE || (tc != CameraPageType.WHATS_UP && this.s == null)) {
             Object[] objArray = new Object[str];
             a.D().w("FrameBaseController", "handleViews", objArray);
             if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(b), this, uoc, "54")) {
                iterator = this.getChildren().iterator();
                while (iterator.hasNext()) {
                   ot = iterator.next();
                   if (ot instanceof n0) {
                      ot.mb(b);
                   }
                }
             }
             if (PatchProxy.isSupport(uoc)) {
                obj = PatchProxy.applyOneRefs(Integer.valueOf(b), this, uoc, "6");
                if (obj != PatchProxyResult.class) {
                   str = obj.booleanValue();
                }else {
                label_00b7 :
                   float f = g.d(b, this.e, this.O.o1());
                   if (f) {
                      AnimCameraView uAnimCameraV = this.n2();
                      if (uAnimCameraV != null) {
                         if (this.v.o2()) {
                            i = Math.min(n.j(this.e), (int)(((float)n.k(this.e) / f) + 0x3f000000));
                            f = (int)(((float)i * f) + 0x3f000000);
                         }else {
                            i = uAnimCameraV.getWidth();
                            int i1 = i;
                            i = (int)(((float)i / f) + 0x3f000000);
                            f = i1;
                         }
                         if (this.v != null) {
                            if (!this.O.o1()) {
                               str = this.v.l2(b, f, i);
                            }
                            if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(b), Integer.valueOf(str), this, uoc, "52")) {
                               this.N = str;
                               iterator = this.getChildren().iterator();
                               while (iterator.hasNext()) {
                                  ot = iterator.next();
                                  if (ot instanceof n0) {
                                     ot.N6(b, str);
                                  }
                               }
                            }
                         }
                         str = true;
                      }
                   }
                }
             }else {
                goto label_00b7 ;
             }
             if (str) {
                obj = this.v;
                if (obj != null) {
                   obj.n2();
                }
                obj = this.t;
                if (obj != null) {
                   obj.h2();
                }
                this.s = true;
             }
          }
       }
    label_015f :
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(b), this, uoc, "27")) {
          if (this.y == null) {
             this.h2(b);
          }
          this.d.m(new l0(2, this.z));
       }
       return;
    }
    public final boolean y2(){
       d obj = PatchProxy.apply(null, this, c.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.I == CameraFramePageType.FOLLOW_SHOOT) {
          if (Build$VERSION.SDK_INT <= 26 || this.d.d(n.j).d != null) {
             b = false;
          }
          return b;
       }else if(Build$VERSION.SDK_INT > 26){
          obj = this.c;
          if (obj != CameraPageType.TIE_TIE && obj != CameraPageType.WHATS_UP) {
          label_0043 :
             return b;
          }
       }
       b = false;
       goto label_0043 ;
    }
    public boolean z2(){
       d obj = PatchProxy.apply(null, this, c.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = c$c.a[this.I.ordinal()];
       boolean b = true;
       if (i != 2) {
          if (i != 4) {
             if (i != 5) {
                if (i != 6 && i != 7) {
                   if (!g.m(this.e)) {
                      obj = this.c;
                      if (obj != CameraPageType.TIE_TIE && obj != CameraPageType.WHATS_UP) {
                      label_0043 :
                         return b;
                      }
                   }
                   b = false;
                   goto label_0043 ;
                }
             }else if(!g.m(this.e) && this.c == CameraPageType.PHOTO){
                c tJ = this.J;
                if (tJ != TakePictureType.SHOOT_IMAGE && (tJ == TakePictureType.SHARE || tJ == TakePictureType.SEND_IMAGE)) {
                label_0062 :
                   return b;
                }
             }
             b = false;
             goto label_0062 ;
          }
          return false;
       }else {
          a uoa = this.d.d(a.i);
          if (g.m(this.e) || (uoa.b != null && uoa.d != null)) {
             b = false;
          }
          return b;
       }
    }
}
