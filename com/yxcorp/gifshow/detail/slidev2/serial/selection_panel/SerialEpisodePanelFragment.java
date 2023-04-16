package com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialEpisodePanelFragment;
import com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialPanelBaseFragment;
import vsd.n;
import kotlin.jvm.internal.PropertyReference1Impl;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.PropertyReference1;
import vsd.p;
import nsd.m0;
import com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialEpisodePanelFragment$a;
import nsd.u;
import androidx.fragment.app.Fragment;
import rsd.e;
import com.yxcorp.gifshow.music.utils.kottor.KotterKnifeKt;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import u8a.b;
import msd.a;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.o;
import com.kwai.robust.PatchProxyResult;
import y8a.c;
import com.yxcorp.gifshow.tube.StandardSerialInfo;
import uw9.o;
import q87.c;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.List;
import ilc.a;
import fm5.a;
import u8a.e;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.ViewStub;
import zl5.j;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import w8a.f;
import g9c.d;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import com.yxcorp.gifshow.detail.slideplay.NestedParentRelativeLayout;
import com.google.android.material.tabs.TabLayout;
import com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.widget.NestedScrollChildRelativeLayout;
import android.os.Bundle;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import w8a.b;
import w8a.d;
import rkd.b;
import w8a.c;
import im8.c;
import y8c.t;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialEpisodePanelFragment$f;
import java.lang.Runnable;
import android.widget.HorizontalScrollView;
import kotlin.Pair;
import zl5.h;
import java.util.Map;
import com.yxcorp.gifshow.tube.SerialInfo;
import com.kwai.framework.model.user.QCurrentUser;
import wkd.b;
import rl5.b;
import brd.t;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialEpisodePanelFragment$g;
import com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialEpisodePanelFragment$h;
import erd.g;
import crd.b;
import crd.a;
import com.google.android.material.tabs.TabLayout$f;
import android.graphics.Typeface;
import android.content.Context;
import qrd.l1;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialEpisodePanelFragment$b;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import ekd.c;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.util.Objects;
import androidx.recyclerview.widget.LinearLayoutManager;
import u8a.o;
import android.view.View$OnClickListener;
import u8a.m;
import q8a.a;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;
import u8a.k;
import i2b.a;
import u8a.n;
import com.google.android.material.tabs.TabLayout$c;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialEpisodePanelFragment$c;
import com.yxcorp.gifshow.detail.slideplay.NestedParentRelativeLayout$b;
import com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialEpisodePanelFragment$d;
import com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialEpisodePanelFragment$e;
import com.yxcorp.gifshow.detail.slideplay.NestedParentRelativeLayout$c;
import cda.k;
import u8a.l;
import qvb.a;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.RectF;
import android.graphics.drawable.shapes.Shape;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.drawable.Drawable;
import android.app.Application;
import o56.a;
import zf6.j;
import android.text.TextUtils$TruncateAt;
import zl5.a;
import az6.a;

public final class SerialEpisodePanelFragment extends SerialPanelBaseFragment	// class@0019f4
{
    public boolean A1;
    public final e U0;
    public final e V0;
    public final e W0;
    public final e X0;
    public final e Y0;
    public final e Z;
    public final e Z0;
    public final e a1;
    public final e b1;
    public final e c1;
    public final e d1;
    public final e e1;
    public final e f1;
    public final e g1;
    public String h1;
    public PhotoDetailParam i1;
    public c j1;
    public View k1;
    public final e l1;
    public final e m1;
    public final e n1;
    public final e o1;
    public final e p1;
    public final e q1;
    public LinearLayoutManager r1;
    public String s1;
    public PresenterV2 t1;
    public f u1;
    public Pair v1;
    public a w1;
    public QPhoto x1;
    public StandardSerialInfo y1;
    public int z1;
    public static final n[] B1;
    public static final SerialEpisodePanelFragment$a C1;

    static {
       n[] onArray = new n[20];
       onArray[0] = m0.r(new PropertyReference1Impl(SerialEpisodePanelFragment.class, "mNestedParentRelativeLayout", "getMNestedParentRelativeLayout\(\)Lcom/yxcorp/gifshow/detail/slideplay/NestedParentRelativeLayout;", 0));
       onArray[1] = m0.r(new PropertyReference1Impl(SerialEpisodePanelFragment.class, "mTitleView", "getMTitleView\(\)Landroid/widget/TextView;", 0));
       onArray[2] = m0.r(new PropertyReference1Impl(SerialEpisodePanelFragment.class, "mCloseBtn", "getMCloseBtn\(\)Landroid/view/View;", 0));
       onArray[3] = m0.r(new PropertyReference1Impl(SerialEpisodePanelFragment.class, "mBottomContainer", "getMBottomContainer\(\)Landroid/view/ViewGroup;", 0));
       onArray[4] = m0.r(new PropertyReference1Impl(SerialEpisodePanelFragment.class, "mCollectBtnLayout", "getMCollectBtnLayout\(\)Landroid/view/ViewGroup;", 0));
       onArray[5] = m0.r(new PropertyReference1Impl(SerialEpisodePanelFragment.class, "mCollectBtn", "getMCollectBtn\(\)Landroid/widget/TextView;", 0));
       onArray[6] = m0.r(new PropertyReference1Impl(SerialEpisodePanelFragment.class, "mCollectIv", "getMCollectIv\(\)Landroid/widget/ImageView;", 0));
       onArray[7] = m0.r(new PropertyReference1Impl(SerialEpisodePanelFragment.class, "mTabPanel", "getMTabPanel\(\)Lcom/yxcorp/gifshow/detail/slidev2/serial/selection_panel/widget/NestedScrollChildRelativeLayout;", 0));
       onArray[8] = m0.r(new PropertyReference1Impl(SerialEpisodePanelFragment.class, "mTabLayout", "getMTabLayout\(\)Lcom/google/android/material/tabs/TabLayout;", 0));
       onArray[9] = m0.r(new PropertyReference1Impl(SerialEpisodePanelFragment.class, "mTitleContainer", "getMTitleContainer\(\)Lcom/yxcorp/gifshow/detail/slidev2/serial/selection_panel/widget/NestedScrollChildRelativeLayout;", 0));
       onArray[10] = m0.r(new PropertyReference1Impl(SerialEpisodePanelFragment.class, "mShareBtnLayout", "getMShareBtnLayout\(\)Landroid/view/ViewGroup;", 0));
       onArray[11] = m0.r(new PropertyReference1Impl(SerialEpisodePanelFragment.class, "mFollowLayout", "getMFollowLayout\(\)Landroid/view/View;", 0));
       onArray[12] = m0.r(new PropertyReference1Impl(SerialEpisodePanelFragment.class, "mFollowBtn", "getMFollowBtn\(\)Landroid/widget/TextView;", 0));
       onArray[13] = m0.r(new PropertyReference1Impl(SerialEpisodePanelFragment.class, "mFollowIcon", "getMFollowIcon\(\)Landroid/widget/ImageView;", 0));
       onArray[14] = m0.r(new PropertyReference1Impl(SerialEpisodePanelFragment.class, "mBottomContainerOptViewStub", "getMBottomContainerOptViewStub\(\)Landroid/view/ViewStub;", 0));
       onArray[15] = m0.r(new PropertyReference1Impl(SerialEpisodePanelFragment.class, "mBottomContainerOld", "getMBottomContainerOld\(\)Landroid/view/ViewGroup;", 0));
       onArray[16] = m0.r(new PropertyReference1Impl(SerialEpisodePanelFragment.class, "mBottomContainerNew", "getMBottomContainerNew\(\)Landroid/view/ViewGroup;", 0));
       onArray[17] = m0.r(new PropertyReference1Impl(SerialEpisodePanelFragment.class, "mCollectBtnLayoutNew", "getMCollectBtnLayoutNew\(\)Landroid/view/ViewGroup;", 0));
       onArray[18] = m0.r(new PropertyReference1Impl(SerialEpisodePanelFragment.class, "mCollectBtnNew", "getMCollectBtnNew\(\)Landroid/widget/TextView;", 0));
       onArray[19] = m0.r(new PropertyReference1Impl(SerialEpisodePanelFragment.class, "mCollectIvNew", "getMCollectIvNew\(\)Landroid/widget/ImageView;", 0));
       SerialEpisodePanelFragment.B1 = onArray;
       SerialEpisodePanelFragment.C1 = new SerialEpisodePanelFragment$a(null);
    }
    public void SerialEpisodePanelFragment(){
       super();
       this.Z = KotterKnifeKt.b(this, 0x7f0a094a);
       this.U0 = KotterKnifeKt.b(this, 0x7f0a42cc);
       this.V0 = KotterKnifeKt.b(this, 0x7f0a1509);
       this.W0 = KotterKnifeKt.b(this, 0x7f0a4421);
       this.X0 = KotterKnifeKt.b(this, 0x7f0a42a8);
       this.Y0 = KotterKnifeKt.b(this, 0x7f0a42a7);
       this.Z0 = KotterKnifeKt.b(this, 0x7f0a42ab);
       this.a1 = KotterKnifeKt.b(this, 0x7f0a3686);
       this.b1 = KotterKnifeKt.b(this, 0x7f0a3c8b);
       this.c1 = KotterKnifeKt.b(this, 0x7f0a446f);
       this.d1 = KotterKnifeKt.b(this, 0x7f0a4272);
       this.e1 = KotterKnifeKt.b(this, 0x7f0a0f4d);
       this.f1 = KotterKnifeKt.b(this, 0x7f0a4185);
       this.g1 = KotterKnifeKt.b(this, 0x7f0a4187);
       this.h1 = "FOLLOW";
       this.l1 = KotterKnifeKt.b(this, 0x7f0a4424);
       this.m1 = KotterKnifeKt.b(this, 0x7f0a4423);
       this.n1 = KotterKnifeKt.b(this, 0x7f0a4422);
       this.o1 = KotterKnifeKt.b(this, 0x7f0a42a9);
       this.p1 = KotterKnifeKt.b(this, 0x7f0a42aa);
       this.q1 = KotterKnifeKt.b(this, 0x7f0a42ac);
       this.z1 = -1;
    }
    public void Ig(FragmentActivity p0,String p1,int p2,QPhoto p3,int p4,b p5,boolean p6,a p7){
       if (PatchProxy.isSupport(SerialEpisodePanelFragment.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,Integer.valueOf(p4),p5,Boolean.valueOf(p6),p7};
          if (PatchProxy.applyVoid(objArray, this, SerialEpisodePanelFragment.class, "61")) {
             return;
          }
       }
       a.p(p0, "activity");
       a.p(p5, "similarPhotoPanelCallback");
       super.Ig(p0, p1, p2, p3, p4, p5, p6, p7);
       RxBus.f.b(new o(1));
       return;
    }
    public boolean Oh(int p0){
       if (PatchProxy.isSupport(SerialEpisodePanelFragment.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, SerialEpisodePanelFragment.class, "39");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = c.a.e(this.y1);
       boolean b = (p0 >= 0 && i >= p0)? true: false;
       return b;
    }
    public void Qh(){
       int i1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SerialEpisodePanelFragment.class, "47")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       o.C().s("SerialPanelBaseFragment", "SerialEpisodePanelFragment ---------scrollSelectedItemToCenter: ", objArray1);
       i oi = this.q();
       if (oi != null) {
          List items = oi.getItems();
          if (items != null) {
             a uoa = this.Hh();
             if (uoa != null) {
                objArray = uoa.w0();
             }
             i1 = items.indexOf(objArray);
          label_0036 :
             a uoa1 = this.Hh();
             if (uoa1 != null) {
                QPhoto qPhoto = uoa1.w0();
                if (qPhoto != null) {
                   StandardSerialInfo standardSeri = a.t(qPhoto);
                   int episodeNumbe = (standardSeri != null)? standardSeri.getEpisodeNumber(): 0;
                   this.M = episodeNumbe;
                   SerialPanelBaseFragment tN = this.N;
                   if (tN != null) {
                      int i2 = this.Kh();
                      int i3 = this.Kh();
                      if (PatchProxy.isSupport(SerialEpisodePanelFragment.class)) {
                         Object obj = PatchProxy.applyOneRefs(Integer.valueOf(i3), this, SerialEpisodePanelFragment.class, "39");
                         if (obj != PatchProxyResult.class) {
                            i = obj.booleanValue();
                         }else {
                         label_007b :
                            int i4 = c.a.e(this.y1);
                            if (i3 >= 0 && i4 >= i3) {
                               i = true;
                            }
                         }
                      }else {
                         goto label_007b ;
                      }
                      e uoe = e.class;
                      if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i2), Boolean.valueOf(i), tN, uoe, "2")) {
                         uoe = tN.w;
                         tN.w = i2;
                         if (i && i2 != uoe) {
                            tN.k0();
                         }
                      }
                   }
                }
             }
          label_00ad :
             c.a.j(i1, this.t, a1.d(R.dimen.arg_RES_7f070e66));
             return;
          }
       }
       i1 = -1;
       goto label_0036 ;
    }
    public void Uh(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SerialEpisodePanelFragment.class, "43")) {
          return;
       }
       a.p(p0, "photo");
       SerialEpisodePanelFragment ty1 = this.y1;
       this.x1 = p0;
       StandardSerialInfo standardSeri = a.t(p0);
       this.y1 = standardSeri;
       int episodeNumbe = (standardSeri != null)? standardSeri.getEpisodeNumber(): 0;
       this.z1 = episodeNumbe;
       this.Rh(c.a.a(this.y1));
       a uoa = this.Hh();
       if (uoa != null) {
          uoa.F0(this.x1);
       }
       this.hi(ty1);
       return;
    }
    public final ViewGroup Vh(){
       Object obj = PatchProxy.apply(null, this, SerialEpisodePanelFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n1.a(this, SerialEpisodePanelFragment.B1[16]);
    }
    public final ViewGroup Wh(){
       Object obj = PatchProxy.apply(null, this, SerialEpisodePanelFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m1.a(this, SerialEpisodePanelFragment.B1[15]);
    }
    public final ViewStub Xh(){
       Object obj = PatchProxy.apply(null, this, SerialEpisodePanelFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.l1.a(this, SerialEpisodePanelFragment.B1[14]);
    }
    public final ViewGroup Yh(){
       Object obj = PatchProxy.apply(null, this, SerialEpisodePanelFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.o1.a(this, SerialEpisodePanelFragment.B1[17]);
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(SerialEpisodePanelFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, SerialEpisodePanelFragment.class, "41")) {
          return;
       }
       super.Z1(p0, p1);
       if (this.Ih() != null) {
          if (TextUtils.x(c.a.f(this.y1))) {
             return;
          }else {
             SerialEpisodePanelFragment tu1 = this.u1;
             if (tu1 != null && !PatchProxy.applyVoid(null, tu1, f.class, "2")) {
                d uod = tu1.f.ia();
                if (uod != null) {
                   f a = tu1.a;
                   if (a != null && uod.U0(a)) {
                      uod.m1(tu1.a);
                   }
                }
             }
          }
       }
       return;
    }
    public final TextView Zh(){
       Object obj = PatchProxy.apply(null, this, SerialEpisodePanelFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p1.a(this, SerialEpisodePanelFragment.B1[18]);
    }
    public final ImageView ai(){
       Object obj = PatchProxy.apply(null, this, SerialEpisodePanelFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q1.a(this, SerialEpisodePanelFragment.B1[19]);
    }
    public final NestedParentRelativeLayout bi(){
       Object obj = PatchProxy.apply(null, this, SerialEpisodePanelFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Z.a(this, SerialEpisodePanelFragment.B1[0]);
    }
    public final TabLayout ci(){
       Object obj = PatchProxy.apply(null, this, SerialEpisodePanelFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b1.a(this, SerialEpisodePanelFragment.B1[8]);
    }
    public final NestedScrollChildRelativeLayout di(){
       Object obj = PatchProxy.apply(null, this, SerialEpisodePanelFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a1.a(this, SerialEpisodePanelFragment.B1[7]);
    }
    public final TextView ei(){
       Object obj = PatchProxy.apply(null, this, SerialEpisodePanelFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.U0.a(this, SerialEpisodePanelFragment.B1[1]);
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SerialEpisodePanelFragment.class, "24")) {
          return;
       }
       a.p(p0, "view");
       super.fh(p0, p1);
       String str = "26";
       PresenterV2 presenterV2 = PatchProxy.applyWithListener(null, this, SerialEpisodePanelFragment.class, str);
       if (presenterV2 != PatchProxyResult.class) {
       }else {
          presenterV2 = new PresenterV2();
          presenterV2.U7(new b());
          presenterV2.U7(new d());
          if (b.g()) {
             presenterV2.U7(new c());
          }
          PatchProxy.onMethodExit(SerialEpisodePanelFragment.class, str);
       }
       this.t1 = presenterV2;
       a.m(presenterV2);
       presenterV2.f(p0);
       SerialEpisodePanelFragment tt1 = this.t1;
       a.m(tt1);
       Object[] objArray = new Object[]{c.a("FRAGMENT", this),c.a("SERIAL_TIPS_HELPER", this.sh()),this};
       tt1.i(objArray);
       return;
    }
    public final void fi(){
       if (PatchProxy.applyVoid(null, this, SerialEpisodePanelFragment.class, "38")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().s("SerialPanelBaseFragment", " ---------scrollSelectedTab: mCurEpisodeNum "+' '+this.z1+' ', objArray);
       if (this.z1 > null) {
          this.ci().postDelayed(new SerialEpisodePanelFragment$f(this), 100);
       }
       return;
    }
    public Pair getCursor(){
       Object[] objArray1;
       Pair pair;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       i obj = PatchProxy.apply(objArray, this, SerialEpisodePanelFragment.class, "62");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.wg();
       if (!obj instanceof h) {
          objArray1 = objArray;
       }
       if (objArray1 != null) {
          pair = PatchProxy.apply(objArray, objArray1, j.class, "4");
          if (pair != patchProxyRe) {
          }else {
             pair = new Pair(objArray1.p, objArray1.q);
          }
          if (pair != null) {
          label_003a :
             return pair;
          }
       }
       pair = super.getCursor();
       goto label_003a ;
    }
    public int getLayoutResId(){
       return 0x7f0d14b9;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SerialEpisodePanelFragment.class, "67");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(SerialEpisodePanelFragment.class, null);
       return objectsByTag;
    }
    public final void gi(SerialInfo p0,boolean p1,View p2){
       if (PatchProxy.isSupport(SerialEpisodePanelFragment.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, SerialEpisodePanelFragment.class, "36")) {
          return;
       }
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       if (!mE.isLogined()) {
          return;
       }
       SerialEpisodePanelFragment tw1 = this.w1;
       if (tw1 != null) {
          b uob = b.a(-1256759027);
          SerialInfo mSerialId = p0.mSerialId;
          SerialInfo mType = p0.mType;
          int i = (p1)? 2: 1;
          tw1.c(uob.h(mSerialId, mType, i).map(new e()).subscribeOn(d.b).observeOn(d.a).subscribe(new SerialEpisodePanelFragment$g(this, p0, p2), SerialEpisodePanelFragment$h.b));
       }
       return;
    }
    public final void hi(StandardSerialInfo p0){
       SerialInfo mSerialId1;
       if (PatchProxy.applyVoidOneRefs(p0, this, SerialEpisodePanelFragment.class, "37")) {
          return;
       }
       Pair pair = null;
       if (p0 != null) {
          p0 = p0.mSerialInfo;
          SerialInfo mSerialId = (p0 != null)? p0.mSerialId: pair;
          SerialEpisodePanelFragment ty1 = this.y1;
          if (ty1 != null) {
             StandardSerialInfo mSerialInfo = ty1.mSerialInfo;
             if (mSerialInfo != null) {
                mSerialId1 = mSerialInfo.mSerialId;
             label_0022 :
                if (!TextUtils.n(mSerialId, mSerialId1)) {
                label_0028 :
                   this.v1 = pair;
                   if (this.getView() != null) {
                      ViewGroup viewGroup = this.Wh();
                      if (viewGroup != null && !viewGroup.getVisibility()) {
                         viewGroup = PatchProxy.apply(pair, this, SerialEpisodePanelFragment.class, "5");
                         if (viewGroup == PatchProxyResult.class) {
                            viewGroup = this.X0.a(this, SerialEpisodePanelFragment.B1[4]);
                         }
                         if (viewGroup != null) {
                            viewGroup.setVisibility(8);
                         }
                      }
                   }
                }
             }
          }
          mSerialId1 = pair;
          goto label_0022 ;
       }else {
          goto label_0028 ;
       }
    label_005d :
       return;
    }
    public final void ii(String p0,boolean p1){
       ViewGroup viewGroup;
       TextView textView;
       ImageView imageView;
       if (PatchProxy.isSupport(SerialEpisodePanelFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, SerialEpisodePanelFragment.class, "44")) {
          return;
       }
       if (!PatchProxy.isSupport(SerialEpisodePanelFragment.class) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, SerialEpisodePanelFragment.class, "46")) {
          SerialEpisodePanelFragment tv1 = this.v1;
          int i = 0;
          if (tv1 != null && TextUtils.n(tv1.getFirst(), p0)) {
             tv1 = this.v1;
             if (tv1 != null && tv1.getSecond().booleanValue() == p1) {
                viewGroup = null;
             label_0054 :
                if (viewGroup) {
                   viewGroup = this.Vh();
                   if (viewGroup != null && !viewGroup.getVisibility()) {
                      viewGroup = this.Yh();
                      if (viewGroup != null) {
                         viewGroup.setVisibility(i);
                      }
                   }
                }
                if (p0 == null) {
                   p0 = "";
                }
                this.v1 = new Pair(p0, Boolean.valueOf(p1));
                if (p1) {
                   textView = this.Zh();
                   if (textView != null) {
                      textView.setText(a1.p(R.string.arg_RES_7f1014be));
                   }
                   imageView = this.ai();
                   if (imageView != null) {
                      imageView.setImageResource(R.drawable.arg_RES_7f081f5f);
                   }
                }else {
                   textView = this.Zh();
                   if (textView != null) {
                      textView.setText(a1.p(R.string.arg_RES_7f1008a1));
                   }
                   imageView = this.ai();
                   if (imageView != null) {
                      imageView.setImageResource(R.drawable.arg_RES_7f081f5d);
                   }
                }
             }
          }
          viewGroup = 1;
          goto label_0054 ;
       }
    label_00b6 :
       return;
    }
    public final void ji(TabLayout$f p0,boolean p1){
       TextView textView1;
       if (PatchProxy.isSupport(SerialEpisodePanelFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, SerialEpisodePanelFragment.class, "23")) {
          return;
       }
       View view = p0.a();
       int i = 0x7f0a42cc;
       if (view != null) {
          view = view.findViewById(i);
          if (view != null) {
             view.setSelected(p1);
          }
       }
       View view1 = p0.a();
       TextView textView = null;
       view1 = (view1 != null)? view1.findViewById(i): textView;
       if (view1 instanceof TextView) {
          textView = view1;
       }
       if (p1) {
          if (textView != null) {
             textView.setTypeface(Typeface.DEFAULT_BOLD);
          }
       }else if(textView != null){
          textView.setTypeface(Typeface.DEFAULT);
       }
       if (textView != null) {
          textView.invalidate();
       }
       return;
    }
    public boolean n5(){
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SerialEpisodePanelFragment.class, "21")) {
          return;
       }
       super.onCreate(p0);
       int i = 0;
       if (!PatchProxy.applyVoid(null, this, SerialEpisodePanelFragment.class, "25")) {
          Context context = this.getContext();
          if (context != null) {
             a.o(context, "it");
             f uof = new f(context, this);
             boolean b = true;
             if (this.Mh() <= b) {
                b = false;
             }
             uof.d = b;
             this.u1 = uof;
          }
       }
       SerialEpisodePanelFragment ty1 = this.y1;
       if (ty1 != null) {
          i = ty1.getEpisodeNumber();
       }
       this.z1 = i;
       return;
    }
    public Animator onCreateAnimator(int p0,boolean p1,int p2){
       Animator obj;
       if (PatchProxy.isSupport(SerialEpisodePanelFragment.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Integer.valueOf(p2), this, SerialEpisodePanelFragment.class, "48");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = null;
       if (!p2) {
          return obj;
       }else if(p1){
          Animator uAnimator = AnimatorInflater.loadAnimator(this.getContext(), p2);
          if (uAnimator != null) {
             uAnimator.addListener(new SerialEpisodePanelFragment$b(this, this));
          }
          obj = uAnimator;
       }
       return obj;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, SerialEpisodePanelFragment.class, "65")) {
          return;
       }
       super.onDestroy();
       SerialEpisodePanelFragment tt1 = this.t1;
       if (tt1 != null) {
          tt1.destroy();
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, SerialEpisodePanelFragment.class, "64")) {
          return;
       }
       super.onDestroyView();
       SerialEpisodePanelFragment tw1 = this.w1;
       if (tw1 != null) {
          tw1.dispose();
       }
       this.Lh().h();
       return;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(SerialEpisodePanelFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SerialEpisodePanelFragment.class, "60")) {
          return;
       }
       super.onHiddenChanged(p0);
       boolean b = false;
       if (p0) {
          this.Lh().f();
          RxBus.f.b(new o(b));
       }else {
          Object[] objArray = new Object[b];
          o.C().s("SerialPanelBaseFragment", "SerialEpisodePanelFragment ---------onHiddenChanged: show panel", objArray);
          this.fi();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       a uoa;
       int i3;
       c a;
       View view;
       View view2;
       e0 uoe0;
       Object[] objArray;
       SerialInfo mPanelTitle;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SerialEpisodePanelFragment.class, "22")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       c.c(p0, "serialEpisode");
       this.w1 = new a();
       RecyclerFragment tt = this.t;
       a.o(tt, "mRecyclerView");
       RecyclerView$LayoutManager layoutManage = tt.getLayoutManager();
       Objects.requireNonNull(layoutManage, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
       this.r1 = layoutManage;
       if (!PatchProxy.applyVoid(null, this, SerialEpisodePanelFragment.class, "31")) {
          TextView textView = this.ei();
          if (textView != null) {
             SerialEpisodePanelFragment ty1 = this.y1;
             if (ty1 != null) {
                StandardSerialInfo mSerialInfo = ty1.mSerialInfo;
                if (mSerialInfo != null) {
                   mPanelTitle = mSerialInfo.mPanelTitle;
                   if (mPanelTitle != null) {
                   label_0056 :
                      textView.setText(mPanelTitle);
                   }
                }
             }
             mPanelTitle = "";
             goto label_0056 ;
          }
          textView = this.ei();
          if (textView != null) {
             textView.postInvalidate();
          }
          view2 = PatchProxy.apply(null, this, SerialEpisodePanelFragment.class, "3");
          if (view2 == patchProxyRe) {
             view2 = this.V0.a(this, SerialEpisodePanelFragment.B1[2]);
          }
          if (view2 != null) {
             view2.setOnClickListener(new o(this));
          }
       }
       if (!PatchProxy.applyVoid(null, this, SerialEpisodePanelFragment.class, "34")) {
          this.v1 = null;
          ViewGroup viewGroup = this.Wh();
          if (viewGroup != null) {
             viewGroup.setVisibility(8);
          }
          viewGroup = this.Vh();
          if (viewGroup != null) {
             viewGroup.setVisibility(8);
          }
          if (!PatchProxy.applyVoid(null, this, SerialEpisodePanelFragment.class, "49") && this.getView() != null) {
             ViewStub viewStub = this.Xh();
             if (viewStub != null) {
                viewStub.setLayoutResource(R.layout.arg_RES_7f0d14b7);
             }
             viewStub = this.Xh();
             view2 = (viewStub != null)? viewStub.inflate(): null;
             this.k1 = view2;
             view2 = (view2 != null)? view2.findViewById(R.id.follow_divider): null;
             if (view2 != null) {
                view2.setVisibility(8);
             }
             view2 = PatchProxy.apply(null, this, SerialEpisodePanelFragment.class, "12");
             if (view2 == patchProxyRe) {
                view2 = this.e1.a(this, SerialEpisodePanelFragment.B1[11]);
             }
             if (view2 != null) {
                view2.setVisibility(8);
             }
             if (!PatchProxy.applyVoid(null, this, SerialEpisodePanelFragment.class, "50")) {
                viewGroup = PatchProxy.apply(null, this, SerialEpisodePanelFragment.class, "11");
                if (viewGroup == patchProxyRe) {
                   viewGroup = this.d1.a(this, SerialEpisodePanelFragment.B1[10]);
                }
                if (viewGroup != null) {
                   viewGroup.setOnClickListener(new m(this));
                }
                uoa = a.a;
                a uoa1 = this.Hh();
                if (uoa1 != null) {
                   uoe0 = uoa1.s0();
                   if (uoe0 != null) {
                   label_0141 :
                      Objects.requireNonNull(uoa);
                      if (!PatchProxy.applyVoidOneRefs(uoe0, uoa, a.class, "10")) {
                         a.p(uoe0, "page");
                         ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                         uElementPack.action2 = "PHOTO_RECOMMEND_COLLECTION_BUTTON";
                         i3 oi3 = i3.f();
                         oi3.d("recommend_type", "RELATED_COLLECTION");
                         uElementPack.params = oi3.e();
                         u1.B0(new ShowMetaData().setType(6).setElementPackage(uElementPack).setLogPage(uoe0));
                      }
                   }
                }
                uoe0 = this;
                goto label_0141 ;
             }
             viewGroup = this.Yh();
             if (!PatchProxy.applyVoidOneRefs(viewGroup, this, SerialEpisodePanelFragment.class, "35")) {
                this.v1 = null;
                if (viewGroup != null) {
                   viewGroup.setOnClickListener(new k(this));
                }
                this.hi(null);
             }
          }
       }
    label_01a1 :
       if (!PatchProxy.applyVoid(null, this, SerialEpisodePanelFragment.class, "27")) {
          int i1 = c.a.b(this.y1);
          for (int i = 0; i < i1; i++) {
             int i2 = i * 30;
             i3 = i2 + 30;
             a = c.a;
             if (i3 > a.e(this.y1)) {
                i3 = a.e(this.y1);
             }
             i2 = i2 + 1;
             String str = (i2 == i3)? String.valueOf(i2): i2+'-'+i3;
             TabLayout tabLayout = this.ci();
             TabLayout$f uof = PatchProxy.applyOneRefs(str, this, SerialEpisodePanelFragment.class, "30");
             if (uof != patchProxyRe) {
             }else {
                uof = this.ci().w();
                a.o(uof, "mTabLayout.newTab\(\)");
                uof.n(str);
                view = a.a(this.getContext(), R.layout.arg_RES_7f0d14b5);
                View view1 = view.findViewById(R.id.tv_title);
                if (!view1 instanceof TextView) {
                   view1 = null;
                }
                if (view1 != null) {
                   view1.setText(str);
                }
                uof.k(view);
             }
             tabLayout.b(uof);
          }
          this.ci().a(new n(this));
       }
       this.fi();
       if (c.a.e(this.y1) <= 30) {
          this.di().setVisibility(8);
       }
       uoa = this.Hh();
       QPhoto qPhoto = (uoa != null)? uoa.w0(): null;
       this.x1 = qPhoto;
       NestedParentRelativeLayout nestedParent = this.bi();
       if (nestedParent != null) {
          nestedParent.setUseTransitionToOffset(true);
       }
       nestedParent = this.bi();
       if (nestedParent != null) {
          nestedParent.setNestedScrollIntercepter(new SerialEpisodePanelFragment$c(this));
          nestedParent.setOnClickListener(new SerialEpisodePanelFragment$d(this));
          nestedParent.setOnDragListener(new SerialEpisodePanelFragment$e(this));
       }
       this.hi(this.y1);
       this.Lh().b(p0);
       if (!PatchProxy.applyVoid(null, this, SerialEpisodePanelFragment.class, "32")) {
          SerialEpisodePanelFragment tw1 = this.w1;
          if (tw1 != null) {
             tw1.c(RxBus.f.f(k.class).observeOn(d.a).subscribe(new l(this)));
          }
       }
       return;
    }
    public List r8(){
       List items;
       i obj = PatchProxy.apply(null, this, SerialEpisodePanelFragment.class, "63");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.wg();
       if (obj != null) {
          items = obj.getItems();
          if (items != null) {
          label_0023 :
             return items;
          }
       }
       items = super.r8();
       goto label_0023 ;
    }
    public void v2(boolean p0,boolean p1){
       j oj;
       float f;
       if (PatchProxy.isSupport(SerialEpisodePanelFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, SerialEpisodePanelFragment.class, "42")) {
          return;
       }
       super.v2(p0, p1);
       t ot = this.sh();
       if (ot != null) {
          ot.j();
       }
       if (p0) {
          oj = this.Ih();
          Objects.requireNonNull(oj, "null cannot be cast to non-null type com.kwai.feature.api.corona.network.SerialPanelPageList");
          j oj1 = this.Ih();
          Objects.requireNonNull(oj1, "null cannot be cast to non-null type com.kwai.feature.api.corona.network.SerialPanelPageList");
          this.ii(oj.u, Boolean.valueOf(oj1.t).booleanValue());
       }
       oj = this.Ih();
       if (oj != null) {
          c a = c.a;
          if (TextUtils.x(a.f(this.y1))) {
             return;
          }else {
             int i = 0;
             if (oj instanceof h && (oj.P0() || oj.r0())) {
                Object[] objArray = new Object[i];
                o.C().s("SerialPanelBaseFragment", " ---------onFinishLoading: isLoadingNext "+oj.P0()+"  hasPrePage "+oj.r0()+" copyText "+a.f(this.y1), objArray);
                return;
             }else {
                SerialEpisodePanelFragment tu1 = this.u1;
                if (tu1 != null) {
                   String str = a.f(this.y1);
                   f uof = f.class;
                   if (!PatchProxy.applyVoidOneRefs(str, tu1, uof, "1")) {
                      a.p(str, "copyText");
                      d uod = tu1.f.ia();
                      if (uod != null) {
                         f a1 = tu1.a;
                         if (a1 == null || !uod.U0(a1)) {
                            PatchProxyResult patchProxyRe = PatchProxyResult.class;
                            f uof1 = PatchProxy.applyOneRefs(str, tu1, uof, "3");
                            if (uof1 != patchProxyRe) {
                            }else {
                               uof1 = tu1.a;
                               if (uof1 == null) {
                                  FrameLayout uFrameLayout = new FrameLayout(tu1.e);
                                  uFrameLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -2));
                                  tu1.a = uFrameLayout;
                                  uFrameLayout = new FrameLayout(tu1.e);
                                  Object[] objArray1 = null;
                                  ShapeDrawable shapeDrawabl = PatchProxy.apply(objArray1, tu1, uof, "4");
                                  if (shapeDrawabl != patchProxyRe) {
                                  }else {
                                     f = (float)a1.d(0x7f07031b);
                                     float[] uofloatArray = new float[]{f,f,f,f,f,f,f,f};
                                     RoundRectShape roundRectSha = new RoundRectShape(uofloatArray, objArray1, objArray1);
                                     ShapeDrawable shapeDrawabl1 = new ShapeDrawable(roundRectSha);
                                     Paint paint = shapeDrawabl1.getPaint();
                                     a.o(paint, "paint");
                                     paint.setColor(a1.a(R.color.arg_RES_7f06173f));
                                     paint = shapeDrawabl1.getPaint();
                                     a.o(paint, "paint");
                                     paint.setStyle(Paint$Style.FILL);
                                     shapeDrawabl = shapeDrawabl1;
                                  }
                                  uFrameLayout.setBackground(shapeDrawabl);
                                  ViewGroup$MarginLayoutParams marginLayout = new ViewGroup$MarginLayoutParams(-1, -2);
                                  marginLayout.leftMargin = a1.d(0x7f0702ab);
                                  marginLayout.rightMargin = a1.d(0x7f0702ab);
                                  marginLayout.topMargin = i;
                                  marginLayout.bottomMargin = a1.d(0x7f07034b);
                                  uFrameLayout.setLayoutParams(marginLayout);
                                  uFrameLayout.setPadding(a1.d(R.dimen.arg_RES_7f070271), a1.d(R.dimen.arg_RES_7f07034b), a1.d(R.dimen.arg_RES_7f070271), a1.d(R.dimen.arg_RES_7f07025d));
                                  tu1.c = uFrameLayout;
                                  TextView textView = new TextView(tu1.e);
                                  textView.setLayoutParams(new ViewGroup$LayoutParams(-1, -2));
                                  textView.setTextSize(12.00f);
                                  textView.setLineSpacing((float)a1.d(R.dimen.arg_RES_7f0702e3), 0x3f800000);
                                  textView.setTextColor(j.b(a.b(), R.color.arg_RES_7f06168c));
                                  textView.setMaxLines(2);
                                  textView.setEllipsize(TextUtils$TruncateAt.valueOf("END"));
                                  textView.setText(str);
                                  tu1.b = textView;
                                  f a2 = tu1.a;
                                  a.m(a2);
                                  uof = tu1.c;
                                  String str1 = "mTubeCopyRightBg";
                                  if (uof == null) {
                                     a.S(str1);
                                  }
                                  a2.addView(uof);
                                  a2 = tu1.c;
                                  if (a2 == null) {
                                     a.S(str1);
                                  }
                                  a.m(a2);
                                  uof = tu1.b;
                                  if (uof == null) {
                                     a.S("mTubeCopyRight");
                                  }
                                  a2.addView(uof);
                                  uof1 = tu1.a;
                                  Objects.requireNonNull(uof1, "null cannot be cast to non-null type android.widget.FrameLayout");
                               }
                            }
                            uod.P0(uof1);
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public i yh(){
       boolean b;
       int i;
       int i1;
       a uoa;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, SerialEpisodePanelFragment.class, "40");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.Hh();
       QPhoto qPhoto = (obj != null)? obj.w0(): objArray;
       Object obj1 = PatchProxy.applyOneRefs(qPhoto, objArray, a.class, "33");
       SerialEpisodePanelFragment serialEpisod = null;
       String str = 1;
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(a.y(qPhoto)){
          SerialInfo serialInfo = a.i(qPhoto);
          if (serialInfo != null && serialInfo.isSerialCluster == str) {
             b = true;
          }
       }
       b = false;
       if (b) {
          obj = this.Hh();
          if (obj != null) {
             objArray = obj.w0();
          }
          a.m(objArray);
          i = this.Gh();
          i1 = this.Mh();
          serialEpisod = this.s1;
          if (serialEpisod == null) {
             a.S("mSerialContext");
          }
          uoa = new a(objArray, i, i1, serialEpisod);
       }else {
          obj = this.Hh();
          if (obj != null) {
             objArray = obj.w0();
          }
          a.m(objArray);
          i = this.Gh();
          i1 = this.Mh();
          SerialEpisodePanelFragment ti1 = this.i1;
          if (ti1 != null && ti1.mSource == 258) {
             serialEpisod = true;
          }
          uoa = new h(objArray, i, i1, serialEpisod);
       }
       this.O = uoa;
       j oj = this.Ih();
       a.m(oj);
       return oj;
    }
}
