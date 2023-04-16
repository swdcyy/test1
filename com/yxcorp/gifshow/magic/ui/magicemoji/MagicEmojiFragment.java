package com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter$c;
import hka.a;
import hka.n;
import uyb.c$b;
import ml8.d;
import im8.g;
import com.kwai.feature.post.api.fragment.FlyWheelTabHostFragment;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment$Source;
import io.reactivex.subjects.PublishSubject;
import mrd.a;
import java.util.ArrayList;
import l5b.d;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment$a;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment$e;
import hka.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig;
import m4b.m0;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import android.content.Context;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import s5b.b;
import java.lang.StringBuilder;
import q87.c;
import java.util.List;
import java.util.Collection;
import com.kwai.feature.post.api.widget.SmoothSlidingTabStrip;
import com.yxcorp.gifshow.model.MagicEmoji;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import q5b.f;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.magic.ui.magicemoji.StandardMagicFaceFragment;
import f5b.i;
import com.yxcorp.gifshow.magic.ui.widget.SmoothPagerSlidingTabStrip$c;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchFragment;
import f5b.c;
import w36.b;
import java.util.Objects;
import w36.b$a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import ekd.q;
import com.yxcorp.gifshow.model.response.MagicEmojiResponse;
import a5b.f;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment$f;
import java.lang.Enum;
import w3b.r;
import androidx.fragment.app.e;
import android.graphics.drawable.Drawable;
import android.view.View;
import q5b.g;
import w3b.b;
import ekd.k1;
import com.yxcorp.gifshow.magic.ui.magicemoji.c;
import androidx.viewpager.widget.ViewPager$i;
import c4b.f;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import w3b.l;
import java.util.Map;
import b4b.i;
import xf6.g;
import u4b.e;
import java.lang.Boolean;
import e5b.c;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import android.view.ViewGroup;
import java.util.Iterator;
import m4b.i;
import java.lang.Runnable;
import m4b.j;
import w3b.p;
import m4b.o;
import android.view.View$OnClickListener;
import android.util.Pair;
import kuaishou.perf.page.impl.d;
import com.yxcorp.gifshow.magic.ui.magicemoji.a;
import t45.c;
import java.lang.Integer;
import m5b.c;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment$b;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment$c;
import brd.t;
import f4b.k;
import t45.d;
import brd.z;
import erd.g;
import crd.b;
import ekd.m1;
import com.yxcorp.gifshow.magic.ui.widget.SmoothPagerSlidingTabStrip;
import m4b.f;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import o4b.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.widget.FrameLayout;
import i2b.a;
import android.view.ViewParent;
import m4b.l0;
import java.util.HashMap;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceFragment;
import androidx.viewpager.widget.ViewPager;
import com.kwai.library.widget.viewpager.tabstrip.a;
import com.kwai.video.westeros.models.EffectDescription;
import j4b.c;
import j8c.b;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment$d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import r5b.e;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import android.view.LayoutInflater;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import android.content.res.Resources;
import i4b.g;
import m4b.h;
import e4b.a;
import e4b.c;
import c4b.b;
import c4b.c;
import oxa.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.video.westeros.models.EffectHint;
import android.util.SparseArray;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import m4b.g;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import j4b.k;
import m4b.t;
import com.trello.rxlifecycle3.android.FragmentEvent;
import com.trello.rxlifecycle3.components.support.RxFragment;
import eoc.f;
import j4b.l;
import m4b.s;
import j4b.a;
import m4b.q;
import lnc.a1;
import m4b.k;
import o56.c;
import o56.a;
import xf6.l;
import e4b.b;
import m4b.l;
import java.util.concurrent.Callable;
import pm6.k;
import m4b.r;
import m4b.p;
import android.view.ViewGroup$LayoutParams;
import cw9.c;
import android.app.Application;
import java.lang.Number;
import android.graphics.Point;
import com.yxcorp.utility.n;
import java.lang.Math;
import java.util.Collections;

public class MagicEmojiFragment extends FlyWheelTabHostFragment implements MagicFaceAdapter$c, a, n, c$b, d, g	// class@001ba9
{
    public View E;
    public View F;
    public View G;
    public MagicEmojiFragment$Source H;
    public BaseFragment I;
    public MagicEmojiPageConfig J;
    public EffectDescription K;
    public PublishSubject L;
    public PublishSubject M;
    public MagicFaceAdapter$c N;
    public a O;
    public a P;
    public a Q;
    public PublishSubject R;
    public PublishSubject S;
    public PublishSubject T;
    public c$a U;
    public h U0;
    public PublishSubject V;
    public m V0;
    public PublishSubject W;
    public b W0;
    public View X;
    public View X0;
    public KwaiPlayerFailedStateView Y;
    public PresenterV2 Y0;
    public MagicEmojiResponse Z;
    public boolean Z0;
    public List a1;
    public SmoothPagerSlidingTabStrip b1;
    public MagicEmojiResponse c1;
    public d d1;
    public int e1;
    public boolean f1;
    public long g1;
    public c h1;
    public ViewPager$i i1;
    public boolean j1;
    public ViewTreeObserver$OnPreDrawListener k1;
    public final d l1;
    public static final int m1;

    public void MagicEmojiFragment(){
       super();
       this.H = MagicEmojiFragment$Source.CAMERA_FULLSCREEN;
       this.L = PublishSubject.g();
       this.M = PublishSubject.g();
       this.O = a.g();
       this.P = a.g();
       this.Q = a.g();
       this.R = PublishSubject.g();
       this.S = PublishSubject.g();
       this.T = PublishSubject.g();
       this.V = PublishSubject.g();
       this.W = PublishSubject.g();
       this.Z0 = false;
       this.a1 = new ArrayList();
       this.d1 = new d();
       this.e1 = -1;
       this.f1 = true;
       this.j1 = false;
       this.k1 = new MagicEmojiFragment$a(this);
       this.l1 = new MagicEmojiFragment$e(this);
    }
    public static boolean Yh(MagicEmojiFragment$Source p0){
       boolean b = (p0 != MagicEmojiFragment$Source.CAMERA_FULLSCREEN && (p0 != MagicEmojiFragment$Source.CAMERAPHOTO_FULLSCREEN && (p0 != MagicEmojiFragment$Source.LIVE_COVER && (p0 == MagicEmojiFragment$Source.CAMERA_NO_MUSIC || p0 == MagicEmojiFragment$Source.STORY))))? true: false;
       return b;
    }
    public void A4(h p0){
       this.U0 = p0;
    }
    public void Ch(){
       if (PatchProxy.applyVoid(null, this, MagicEmojiFragment.class, "11")) {
          return;
       }
       MagicEmojiFragment tJ = this.J;
       if (tJ != null && tJ.mRemoveViewWhenHide != null) {
          this.v = new m0(this.getActivity(), this.getChildFragmentManager());
       }else {
          super.Ch();
       }
       Object[] objArray = new Object[0];
       b.D().w("MagicEmojiFragment", "initPagerAdapter, Adapter:"+this.v+" , FragmentManager:"+this.getChildFragmentManager(), objArray);
       return;
    }
    public String E7(){
       return "MagicEmoji";
    }
    public void Kh(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicEmojiFragment.class, "38")) {
          return;
       }
       this.a1.clear();
       this.a1.addAll(p0);
       this.e1 = -1;
       super.Kh(p0);
       this.b1.g();
       return;
    }
    public final b Qh(MagicEmoji p0,MagicEmojiPageConfig p1){
       i oi;
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, MagicEmojiFragment.class, "36");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (TextUtils.isEmpty(p0.mName)) {
          int i = (f.a())? 0x7f104a51: 0x7f103115;
          obj = this.getString(i);
       }else {
          MagicEmoji mName = p0.mName;
       }
       Bundle uBundle = new Bundle();
       uBundle.putString("arg_category", p0.mId);
       SerializableHook.putSerializable(uBundle, "arg_source", this.H);
       uBundle.putInt("magicTabType", p0.mTabType);
       uBundle.putString("magicTabName", obj);
       if (p1 != null) {
          SerializableHook.putSerializable(uBundle, "arg_magic_emoji_paga_config", p1);
          if (!TextUtils.isEmpty(p1.mPageIdentify)) {
             SerializableHook.putSerializable(uBundle, "arg_magic_emoji_identify", p1.mPageIdentify);
          }
       }
       StandardMagicFaceFragment standardMagi = StandardMagicFaceFragment.class;
       if (p0.mTabType == 6) {
          p1 = (p1 != null)? p1.mPageIdentify: null;
          oi = new i(obj, p1);
          oi.g(false);
          standardMagi = MagicSearchFragment.class;
       }else {
          c uoc = new c(obj, obj);
          b$a g = b.g;
          Objects.requireNonNull(g);
          b uob = PatchProxy.applyOneRefs(p0, g, b$a.class, "2");
          if (uob != patchProxyRe) {
          }else {
             a.p(p0, "magicEmoji");
             MagicEmoji mId = p0.mId;
             a.o(mId, "magicEmoji.mId");
             b uob1 = new b(mId, p0.mIconUrls, p0.mGifIconUrls, p0.mGifMaxShowCount, p0.mGifShowStartTime, p0.mGifShowEndTime);
          }
          uoc.r = uob;
          uoc.g(true);
          oi = uoc;
       }
       return new b(oi, standardMagi, uBundle);
    }
    public final void Rh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MagicEmojiFragment.class, "54")) {
          return;
       }
       int i = 0;
       if (q.f(this.a1)) {
          objArray = new Object[i];
          b.D().s("MagicEmojiFragment", "selectCurrentTab not need update", objArray);
          return;
       }else {
          MagicEmojiFragment td1 = this.d1;
          MagicEmojiFragment ta1 = this.a1;
          MagicEmojiFragment tJ = this.J;
          MagicEmojiFragment tZ = this.Z;
          if (tZ != null) {
             objArray = tZ.mDefaultTabId;
          }
          int i1 = td1.c(ta1, tJ, objArray);
          if (i1 != this.e1) {
             Object[] objArray1 = new Object[i];
             b.D().w("MagicEmojiTabs", "old "+this.e1+" new "+i1, objArray1);
             f d = f.d;
             d.b(true);
             this.gi(i1, this.a1);
             d.b(i);
             this.e1 = i1;
             this.b1.getViewTreeObserver().addOnPreDrawListener(this.k1);
          }
          return;
       }
    }
    public final CameraPageType Sh(){
       MagicEmojiFragment obj = PatchProxy.apply(null, this, MagicEmojiFragment.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.J;
       if (obj != null) {
          return obj.mPageType;
       }
       int i = MagicEmojiFragment$f.a[this.H.ordinal()];
       if (i == 1) {
          return CameraPageType.LIVE;
       }
       if (i == 2) {
          return CameraPageType.LIVE_COVER;
       }
       if (i == 3) {
          return CameraPageType.PHOTO;
       }
       if (i == 4) {
          return CameraPageType.IM_CHAT;
       }
       if (i != 5) {
          return CameraPageType.VIDEO;
       }
       return CameraPageType.LOCAL_CHAT;
    }
    public void Th(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MagicEmojiFragment.class, "16")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       b.D().s("MagicEmojiFragment", "hide: ...", objArray1);
       r.a = objArray;
       c fragmentMana = this.getFragmentManager();
       if (fragmentMana != null && !this.isHidden()) {
          e uoe = fragmentMana.beginTransaction();
          uoe.y(R.anim.arg_RES_7f0100b0, 0x7f0100b1);
          uoe.s(this).m();
       }
       return;
    }
    public final void Uh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MagicEmojiFragment.class, "23")) {
          return;
       }
       this.E.setBackgroundDrawable(objArray);
       MagicEmojiFragment tY = this.Y;
       if (tY != null) {
          g.a(this.E, tY);
       }
       return;
    }
    public final void Vh(MagicEmojiResponse p0){
       List obj1;
       int i;
       boolean b;
       Object[] objArray;
       MagicEmoji magicEmoji1;
       ViewPager$i oi = this;
       Object obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(obj, oi, MagicEmojiFragment.class, "35")) {
          return;
       }
       long l = k1.i();
       if (!PatchProxy.applyVoid(null, oi, MagicEmojiFragment.class, "42")) {
          c uoc = new c(oi);
          oi.i1 = uoc;
          oi.Oh(uoc);
       }
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       i oi1 = 1;
       if (obj != null) {
          f.b().f(l.d(oi.H));
          f.b().g(obj);
          f.b().i(obj.mMagicEmojis);
          b uob1 = b.d();
          Objects.requireNonNull(uob1);
          if (!PatchProxy.applyVoid(null, uob1, uob, "11")) {
             uob1.a.clear();
             uob1.b.clear();
             uob1.c = null;
          }
          uob1 = b.d();
          MagicBusinessId magicBusines = l.d(oi.H);
          Objects.requireNonNull(uob1);
          if (!PatchProxy.applyVoidTwoRefs(magicBusines, obj, uob1, uob, "2")) {
             objArray = new Object[0];
             b.D().w("MagicEmojiDataHub", "updataCurrentResponse id:"+magicBusines.name(), objArray);
             uob1.c = obj;
          }
          List list = i.a(obj, oi.J);
          if (g.J()) {
             obj1 = PatchProxy.applyOneRefs(list, null, e.class, "1");
             if (obj1 != patchProxyRe) {
                list = obj1;
             }else {
                magicEmoji1 = new MagicEmoji();
                magicEmoji1.mName = "±æµÿ≤‚ ‘";
                magicEmoji1.mId = "-1";
                magicEmoji1.mTabType = 7;
                list.add(oi1, magicEmoji1);
             }
          }
          obj1 = list;
          i = 0;
          while (i < obj1.size()) {
             MagicEmoji magicEmoji = obj1.get(i);
             String str = 3;
             if (magicEmoji.mMagicFaces == null) {
                MagicEmoji mTabType = magicEmoji.mTabType;
                if (mTabType == str || mTabType == 6) {
                label_00f5 :
                   MagicEmojiFragment j = oi.J;
                   MagicEmoji$MagicFace obj2 = PatchProxy.applyTwoRefs(magicEmoji, j, null, i.class, "5");
                   if (obj2 != patchProxyRe) {
                      b = obj2.booleanValue();
                   }else if(i.c(j) && (magicEmoji.mTabType == 4 || (magicEmoji.mTabType == 6 && (j == null || !c.a.b(j.mPageType))))){
                      if (!q.f(magicEmoji.mMagicFaces)) {
                         obj2 = magicEmoji.mMagicFaces.get(0);
                         if (!i.c(j) || obj2.mResourceType != 3) {
                         }
                      }
                   }
                label_0141 :
                   b = true;
                   if (b) {
                      objArray = new Object[0];
                      b.D().s("MagicEmojiFragment", "updateFragments: ignore this type name="+magicEmoji.mName, objArray);
                   }else {
                      f.b().a(magicEmoji);
                      if (!this.Xh()) {
                         b.d().e(magicEmoji);
                         b.d().f(obj.getBriefEmoji(magicEmoji.mId));
                      }
                      if (!oi.Zh(magicEmoji)) {
                         uArrayList.add(oi.Qh(magicEmoji, oi.J));
                      }
                   }
                }
             }else {
                goto label_00f5 ;
             }
             i = i + 1;
             oi1 = 1;
          }
       }
       if (!uArrayList.isEmpty()) {
          oi.u.setSaveEnabled(0);
          int i1 = oi.d1.c(uArrayList, oi.J, obj.mDefaultTabId);
          Object[] objArray1 = new Object[0];
          b.D().w("MagicEmojiFragment", "lastTabPosition is "+i1, objArray1);
          oi.ei(i1);
          if (this.Xh()) {
             Iterator iterator = obj1.iterator();
             while (iterator.hasNext()) {
                magicEmoji1 = iterator.next();
                b.d().e(magicEmoji1);
                b.d().f(obj.getBriefEmoji(magicEmoji1.mId));
             }
          }
          oi.Kh(uArrayList);
          if (i1 > 0) {
             oi.Gh(i1, null);
          }else if(!i1 && oi.i1 != null){
             TabHostFragment u = oi.u;
             if (u != null) {
                u.post(new i(oi, i1));
             }
          }
          if (this.Xh()) {
             oi.u.postDelayed(new j(oi, i1), 500);
          }
       }
       i = 0x7f0a3caf;
       if (MagicEmojiFragment.Yh(oi.H) && uArrayList.size() <= 1) {
          oi.E.findViewById(i).setVisibility(8);
       }
       MagicEmojiFragment j1 = oi.J;
       if (!PatchProxy.applyVoidOneRefs(j1, oi, MagicEmojiFragment.class, "43")) {
          View view = oi.E.findViewById(i);
          if (view != null) {
             view.setVisibility(0);
          }
          view = this.getView().findViewById(R.id.fl_magic_clear_container);
          if (view != null) {
             view.setVisibility(0);
          }
          view = this.getView().findViewById(R.id.magic_clear_divider);
          if (view != null) {
             view.setVisibility(0);
          }
          view = this.getView().findViewById(R.id.iv_magic_clear);
          oi.X0 = view;
          if (view != null) {
             view.setVisibility(0);
             if (j1 != null && (!TextUtils.isEmpty(j1.mPageIdentify) && p.b().c(j1.mPageIdentify) != null)) {
                oi.hi(0);
             }else {
                oi.hi(true);
             }
             oi.X0.setOnClickListener(new o(oi));
          }
       }
       oi.M.onNext(new Pair(p.e(oi.J), null));
       d.d("postMagicPanelMonitor").h("loadDataToPreview");
       d.d("postMagicPanelMonitor").c();
       oi.g1 = k1.i();
       Object[] objArray2 = new Object[0];
       b.D().w("MagicEmojiFragment", "initFragments on mainThread cost "+(oi.g1 - l), objArray2);
       c.a(new a(oi, obj));
       return;
    }
    public final void Wh(MagicEmojiPageConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicEmojiFragment.class, "58")) {
          return;
       }
       this.H = l.f(p0.mPageType, p0.mNoMusic, p0.mIsLive, p0.mIsTakePhoto);
       return;
    }
    public final boolean Xh(){
       MagicEmojiFragment tH = this.H;
       boolean b = (tH != MagicEmojiFragment$Source.CAMERA_FULLSCREEN && (tH == MagicEmojiFragment$Source.CAMERA_NO_MUSIC || tH == MagicEmojiFragment$Source.CAMERAPHOTO_FULLSCREEN))? true: false;
       return b;
    }
    public final boolean Zh(MagicEmoji p0){
       MagicEmoji obj = PatchProxy.applyOneRefs(p0, this, MagicEmojiFragment.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.mTabType;
       boolean b = false;
       if (obj != 3 && obj != 6) {
          if (obj == 4) {
             return true;
          }else if(q.f(p0.mMagicFaces) && p0.mUseLocalPageLoad != null){
             b = true;
          }
       }
       return b;
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MagicEmojiFragment.class, "28")) {
          return;
       }
       if (!this.isAdded()) {
          return;
       }
       p op = p.b();
       MagicEmojiFragment tJ = this.J;
       if (tJ != null) {
          objArray = tJ.mPageIdentify;
       }
       MagicEmojiResponse magicEmojiRe = op.d(objArray);
       this.c1 = magicEmojiRe;
       if (magicEmojiRe != null && magicEmojiRe != this.Z) {
          this.Z = magicEmojiRe;
          this.Vh(magicEmojiRe);
          if (!q.f(this.a1)) {
             this.gi(0, this.a1);
          }
          return;
       }else if(this.Z == null){
          this.di();
       }
       super.a();
       return;
    }
    public void ai(int p0){
       if (PatchProxy.isSupport(MagicEmojiFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, MagicEmojiFragment.class, "33")) {
          return;
       }
       MagicEmojiFragment th1 = this.h1;
       if (th1 != null) {
          th1.v0().onNext(Integer.valueOf(p0));
       }
       return;
    }
    public final void bi(boolean p0){
       if (PatchProxy.isSupport(MagicEmojiFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MagicEmojiFragment.class, "32")) {
          return;
       }
       MagicEmojiFragment th1 = this.h1;
       if (th1 != null) {
          th1.u0().onNext(Boolean.valueOf(p0));
       }
       return;
    }
    public void ci(MagicEmojiResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicEmojiFragment.class, "18")) {
          return;
       }
       if (!this.isAdded()) {
          return;
       }
       Object[] objArray = new Object[0];
       b.D().w("MagicEmojiFragment", "onSuccess", objArray);
       d.d("postMagicPanelMonitor").h("createToLoadData");
       d.d("postMagicPanelMonitor").g("loadDataToPreview");
       this.Z = p0;
       this.x();
       this.Vh(p0);
       return;
    }
    public final void di(){
       if (PatchProxy.applyVoid(null, this, MagicEmojiFragment.class, "17")) {
          return;
       }
       this.Uh();
       this.fc();
       this.W0 = k.b(l.d(this.H), this.J).observeOn(d.a).subscribe(new MagicEmojiFragment$b(this), new MagicEmojiFragment$c(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicEmojiFragment.class, "1")) {
          return;
       }
       this.F = m1.f(p0, 0x7f0a2a1d);
       this.G = m1.f(p0, 0x7f0a4030);
       this.E = m1.f(p0, 0x7f0a3cb7);
       this.b1 = m1.f(p0, 0x7f0a3a79);
       m1.a(p0, new f(this), R.id.magic_fragment);
       return;
    }
    public void e1(int p0){
       if (PatchProxy.isSupport(MagicEmojiFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, MagicEmojiFragment.class, "26")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.D().s("MagicEmojiFragment", "onGenderDetectionResult "+p0, objArray);
       this.V.onNext(Integer.valueOf(p0));
       return;
    }
    public void ei(int p0){
       if (PatchProxy.isSupport(MagicEmojiFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, MagicEmojiFragment.class, "44")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 7;
       uElementPack.name = "magic_emoji_fragment_show";
       PagerSlidingTabStrip$d uod = this.vh(p0);
       if (uod != null) {
          uElementPack.name = uElementPack.name+":"+uod.f();
       }
       MagicEmojiFragment tH = this.H;
       tH = (tH == MagicEmojiFragment$Source.CAMERAPHOTO_FULLSCREEN || tH == MagicEmojiFragment$Source.LIVE_COVER)? 1: 0;
       double d = (tH)? 0x3ff0000000000000: 0;
       uElementPack.value = d;
       u1.u(1, uElementPack, null);
       return;
    }
    public final void fc(){
       if (PatchProxy.applyVoid(null, this, MagicEmojiFragment.class, "20")) {
          return;
       }
       if (this.X == null) {
          this.X = a.i(new FrameLayout(this.getContext()), 0x7f0d1615);
       }
       MagicEmojiFragment tX = this.X;
       if (tX != null) {
          if (tX.getParent() instanceof ViewGroup) {
             this.X.getParent().removeView(this.X);
          }
          g.b(this.E, this.X);
       }
       return;
    }
    public final void fi(MagicEmojiPageConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicEmojiFragment.class, "59")) {
          return;
       }
       if (this.getArguments() != null) {
          SerializableHook.putSerializable(this.getArguments(), "magic_emoji_page_config", p0);
       }else {
          Object[] objArray = new Object[0];
          b.D().A("MagicEmojiFragment", "saveArguments with new Bundle", objArray);
          Bundle uBundle = new Bundle();
          SerializableHook.putSerializable(uBundle, "magic_emoji_page_config", p0);
          this.setArguments(uBundle);
       }
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d0ecb;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MagicEmojiFragment.class, "64");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new l0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, MagicEmojiFragment.class, "65");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(MagicEmojiFragment.class, new l0());
       }else {
          obj.put(MagicEmojiFragment.class, null);
       }
       return obj;
    }
    public final void gi(int p0,List p1){
       if (PatchProxy.isSupport(MagicEmojiFragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, MagicEmojiFragment.class, "52")) {
          return;
       }
       this.Jh(p0);
       this.ji(p0, p1);
       Fragment uFragment = this.rh(p0);
       if (uFragment instanceof MagicFaceFragment) {
          uFragment.qh(p0);
          uFragment.ph(p0);
       }
       int i = 1;
       while (i <= this.u.getOffscreenPageLimit()) {
          int i1 = p0 + i;
          if (i1 < this.v.j()) {
             this.ji(i1, p1);
          }
          i1 = p0 - i;
          if (i1 >= 0) {
             this.ji(i1, p1);
          }
          i = i + 1;
       }
       return;
    }
    public void hc(MagicEmoji$MagicFace p0,EffectDescription p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MagicEmojiFragment.class, "25")) {
          return;
       }
       this.O.onNext(new c(p1, p0));
       return;
    }
    public void hi(boolean p0){
       if (PatchProxy.isSupport(MagicEmojiFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MagicEmojiFragment.class, "57")) {
          return;
       }
       MagicEmojiFragment tX0 = this.X0;
       if (tX0 != null) {
          tX0.setSelected(p0);
       }
       return;
    }
    public final void ii(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MagicEmojiFragment.class, "31")) {
          return;
       }
       Fragment uFragment = this.t();
       if (uFragment instanceof MagicFaceFragment && !p.b().i(this.J.mPageIdentify)) {
          this.Rh();
          Objects.requireNonNull(uFragment);
          if (!PatchProxy.applyVoid(objArray, uFragment, MagicFaceFragment.class, "16") && uFragment.t != null) {
             MagicEmoji$MagicFace magicFace = uFragment.lh();
             Object[] objArray1 = (magicFace == null)? objArray: magicFace.mId;
             if (magicFace != null) {
                objArray = magicFace.mChildId;
             }
             if (!MagicEmoji$MagicFace.isMagicFaceEquals(MagicFaceFragment.M, objArray1, objArray)) {
                uFragment.xh(MagicFaceFragment.M);
                uFragment.xh(magicFace);
                MagicFaceFragment.M = magicFace;
             }
          }
       label_005b :
          uFragment.oh();
       }
       return;
    }
    public final void ji(int p0,List p1){
       if (PatchProxy.isSupport(MagicEmojiFragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, MagicEmojiFragment.class, "51")) {
          return;
       }
       Fragment uFragment = this.rh(p0);
       if (uFragment instanceof MagicFaceFragment) {
          uFragment.setArguments(p1.get(p0).a());
          if (!PatchProxy.applyVoid(null, uFragment, MagicFaceFragment.class, "4")) {
             uFragment.sh(uFragment.getArguments());
             uFragment.zh();
             uFragment.nh(uFragment.getView());
          }
       }
       return;
    }
    public void k6(View p0,MagicEmoji$MagicFace p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MagicEmojiFragment.class, "48")) {
          return;
       }
       SimpleMagicFace simpleMagicF = null;
       if (p1 != null) {
          simpleMagicF = p1.mName;
       }
       b.d("MagicEmojiFragment", "selectMagicFace name="+simpleMagicF);
       if (p0 != null) {
          p0.post(new MagicEmojiFragment$d(this, p1));
       }
       return;
    }
    public final void ki(int p0){
       if (PatchProxy.isSupport(MagicEmojiFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, MagicEmojiFragment.class, "39")) {
          return;
       }
       if (p0 >= 0 && p0 < this.v.j()) {
          Fragment uFragment = this.rh(p0);
          if (uFragment != null) {
             uFragment.yh(false);
          }
       }
       return;
    }
    public void onAttach(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicEmojiFragment.class, "40")) {
          return;
       }
       super.onAttach(p0);
       b uob = b.d();
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoid(null, uob, b.class, "9")) {
          Object[] objArray = new Object[0];
          b.D().w("MagicEmojiDataHub", "onAttach", objArray);
          uob.d = uob.d + 1;
       }
       return;
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, MagicEmojiFragment.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.isVisible();
    }
    public void onCreate(Bundle p0){
       String str;
       MagicEmojiPageConfig mPageIdentif;
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicEmojiFragment.class, "7")) {
          return;
       }
       super.onCreate(p0);
       d.d("postMagicPanelMonitor").h("clickToCreate");
       d.d("postMagicPanelMonitor").g("createToLoadData");
       Object[] objArray = new Object[0];
       b.D().w("MagicEmojiFragment", "onCreate", objArray);
       e.k(this);
       this.N = this;
       this.I = this;
       if (this.getArguments() != null) {
          str = "magic_emoji_page_config";
          if (this.getArguments().containsKey(str)) {
             MagicEmojiPageConfig serializable = SerializableHook.getSerializable(this.getArguments(), str);
             this.J = serializable;
             if (serializable != null) {
                this.Wh(serializable);
             }
          }
       }
       p op = p.b();
       MagicEmojiFragment tJ = this.J;
       str = (tJ == null)? null: tJ.mPageIdentify;
       MagicEmojiResponse magicEmojiRe = op.d(str);
       this.c1 = magicEmojiRe;
       if (magicEmojiRe != null) {
          this.Z = magicEmojiRe;
       }
       RxBus.f.b(new PanelShowEvent(this.Sh(), PanelShowEvent$PanelType.MAGIC, this.getActivity(), true));
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object[] obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MagicEmojiFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = super.onCreateView(p0, p1, p2);
       obj = new Object[0];
       b.D().w("MagicEmojiFragment", "onCreateView inflate cost "+k1.t(k1.i()), obj);
       this.doBindView(view);
       MagicEmojiFragment tH = this.H;
       if (tH == MagicEmojiFragment$Source.LIVE || tH == MagicEmojiFragment$Source.LOCAL_CHAT) {
          view.findViewById(R.id.touch_view).setVisibility(8);
          view.findViewById(R.id.view_pager).setBackground(this.getResources().getDrawable(R.color.arg_RES_7f061d74));
          view.findViewById(R.id.tab_title).setBackground(this.getResources().getDrawable(R.drawable.arg_RES_7f08025f));
       }
       return view;
    }
    public void onDestroy(){
       z c;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MagicEmojiFragment.class, "29")) {
          return;
       }
       super.onDestroy();
       int i = 0;
       Object[] objArray1 = new Object[i];
       b.D().w("MagicEmojiFragment", "onDestroy", objArray1);
       MagicEmojiFragment tW0 = this.W0;
       if (tW0 != null && !tW0.isDisposed()) {
          this.W0.dispose();
       }
       r.a();
       g.D();
       c.a(new h(this));
       f uof = f.b();
       MagicBusinessId magicBusines = l.d(this.H);
       Objects.requireNonNull(uof);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof1 = f.class;
       if (!PatchProxy.applyVoidOneRefs(magicBusines, uof, uof1, "16") && !uof.d().isEmpty()) {
          if (!PatchProxy.applyVoid(objArray, uof, uof1, "15") && uof.e != null) {
             List list1 = uof.d();
             f e = uof.e;
             MagicEmoji mMagicFaces = e.mMagicFaces;
             ArrayList uArrayList = PatchProxy.applyTwoRefs(mMagicFaces, list1, uof, uof1, "17");
             if (uArrayList != patchProxyRe) {
             }else {
                uArrayList = new ArrayList(list1);
                Iterator iterator = mMagicFaces.iterator();
                while (iterator.hasNext()) {
                   MagicEmoji$MagicFace magicFace1 = iterator.next();
                   if (TextUtils.isEmpty(magicFace1.mChildId) && !uArrayList.contains(magicFace1)) {
                      uArrayList.add(magicFace1);
                   }
                }
             }
             e.mMagicFaces = uArrayList;
          }
          a uoa = c.a();
          String str = PatchProxy.apply(objArray, uof, uof1, "11");
          if (str != patchProxyRe) {
          }else {
             List list = uof.d();
             if (list.isEmpty()) {
                str = "";
             }else {
                StringBuilder str1 = "";
                while (i < list.size()) {
                   MagicEmoji$MagicFace magicFace = list.get(i);
                   if (magicFace != null) {
                      str1 = str1+magicFace.mId;
                      int i1 = list.size() - 1;
                      String str2 = (i != i1)? ",": "";
                      str1 = str1+str2;
                   }
                   i = i + 1;
                }
                str = str1;
             }
          }
          c = d.c;
          t ot = uoa.g(str).subscribeOn(c).observeOn(c);
          ot.subscribe(new b(uof, magicBusines), c.b);
       }
       f.b().f(l.d(this.H));
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, MagicEmojiFragment.class, "15")) {
          return;
       }
       d.d().b();
       this.bi(false);
       this.Z0 = true;
       this.a1.clear();
       this.x();
       this.Uh();
       super.onDestroyView();
       MagicEmojiFragment tY0 = this.Y0;
       if (tY0 != null) {
          tY0.unbind();
          this.Y0.destroy();
          this.Y0 = null;
       }
       this.O.onNext(new c(null, null));
       return;
    }
    public void onDetach(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MagicEmojiFragment.class, "41")) {
          return;
       }
       super.onDetach();
       b uob = b.d();
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoid(objArray, uob, b.class, "10")) {
          Object[] objArray1 = new Object[0];
          b.D().w("MagicEmojiDataHub", "onDetach", objArray1);
          uob.d = uob.d - 1;
       }
       return;
    }
    public void onEffectHintUpdated(EffectHint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicEmojiFragment.class, "27")) {
          return;
       }
       if (p0 != null) {
          this.R.onNext(p0);
       }
       return;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(MagicEmojiFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MagicEmojiFragment.class, "30")) {
          return;
       }
       super.onHiddenChanged(p0);
       this.S.onNext(Boolean.valueOf(p0));
       int i = 0;
       Object[] objArray = new Object[i];
       b.D().s("MagicEmojiFragment", "onHiddenChanged: hidden:"+p0, objArray);
       if (p0) {
          e.j(this.J.mIsOpenByClicked, this.I);
          RxBus.f.b(new PanelShowEvent(this.Sh(), PanelShowEvent$PanelType.MAGIC, this.getActivity(), i));
          TabHostFragment tv = this.v;
          if (tv instanceof m0) {
             Objects.requireNonNull(tv);
             if (!PatchProxy.applyVoid(null, tv, m0.class, "2")) {
                Object[] objArray1 = new Object[i];
                b.D().w("MagicEmojiPageAdapter", " clearData, fragments:"+tv.h.toString(), objArray1);
                a h = tv.h;
                try{
                   h.clear();
                   tv.D(new ArrayList());
                }catch(java.lang.IllegalStateException e2){
                   PostUtils.D("MagicEmojiPageAdapter", "fragments:"+tv.h.toString(), e2);
                }
                tv.v(null, tv.getCurrentIndex(), null);
             }
             Fresco.getImagePipeline().clearMemoryCaches();
          }
       }else {
          e.k(this);
          RxBus.f.b(new PanelShowEvent(this.Sh(), PanelShowEvent$PanelType.MAGIC, this.getActivity(), 1));
          if (this.t() == null) {
             View view = this.getView();
             if (view != null) {
                view.post(new g(this));
             }
          }else {
             this.ii();
          }
       }
       this.bi((p0 ^ 1));
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, MagicEmojiFragment.class, "13")) {
          return;
       }
       super.onPause();
       Object[] objArray = new Object[0];
       b.D().w("MagicEmojiFragment", " onPause", objArray);
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, MagicEmojiFragment.class, "14")) {
          return;
       }
       super.onResume();
       Object[] objArray = new Object[0];
       b.D().w("MagicEmojiFragment", "onResume", objArray);
       if (l.d(this.H) != MagicBusinessId.VIDEO) {
          g.D();
       }
       return;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicEmojiFragment.class, "12")) {
          return;
       }
       super.onSaveInstanceState(p0);
       Object[] objArray = new Object[0];
       b.D().w("MagicEmojiFragment", "onSaveInstanceState...", objArray);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       boolean b;
       double d;
       boolean b2;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MagicEmojiFragment.class, "9")) {
          return;
       }
       super.onViewCreated(p0, p1);
       b uob = b.D();
       StringBuilder str = "onViewCreated, has bundle:";
       b = true;
       int i = 0;
       int b1 = (p1 != null)? true: false;
       Object[] objArray = new Object[i];
       String str1 = "MagicEmojiFragment";
       uob.w(str1, str+b1, objArray);
       this.h1 = ViewModelProviders.of(this.getActivity()).get(c.class);
       this.bi(b);
       FragmentEvent dESTROY_VIEW = FragmentEvent.DESTROY_VIEW;
       f.c(k.class, new t(this), this, dESTROY_VIEW);
       f.c(l.class, new s(this), this, dESTROY_VIEW);
       f.c(a.class, new q(this), this, dESTROY_VIEW);
       d.d().a(p0.getContext(), R.layout.arg_RES_7f0d0ec9, 4);
       d.d().a(p0.getContext(), R.layout.list_item_magic_emoji_mul_row, 30);
       this.b1.setViewPager(this.u);
       this.b1.setSelectedTextSize(a1.e(17.00f));
       if (this.b1 != null && MagicEmojiFragment.Yh(this.H)) {
          this.b1.setTextColor(R.color.arg_RES_7f0617f5);
          this.b1.x(i, b);
       }
       this.Z0 = i;
       k1.r(new k(this, p0), 500);
       MagicEmojiFragment tZ = this.Z;
       Object[] objArray1 = null;
       if (tZ == null) {
          if (!PatchProxy.applyVoid(objArray1, this, MagicEmojiFragment.class, "34")) {
             Object[] objArray2 = new Object[i];
             b.D().s(str1, "refreshByCache", objArray2);
             if (this.isAdded()) {
                tZ = (!a.a().c())? null: l.c("key_force_magic_panel_use_latest_data", i);
                if (tZ) {
                   this.di();
                }else if(b.b(l.d(this.H)) == null){
                   this.fc();
                }
                t.fromCallable(new l(this)).subscribeOn(k.a).observeOn(d.a).subscribe(new r(this), new p(this));
             }
          }
       }else {
          this.Vh(tZ);
       }
       if (!PatchProxy.applyVoid(objArray1, this, MagicEmojiFragment.class, "60")) {
          tZ = this.E.findViewById(R.id.view_pager);
          ViewGroup$LayoutParams layoutParams = tZ.getLayoutParams();
          if (this.E.findViewById(0x7f0a3caf).getVisibility() != 8) {
             i = c.a(tZ.getContext().getResources(), R.dimen.arg_RES_7f070a71);
          }
          ViewGroup$LayoutParams layoutParams1 = this.E.getLayoutParams();
          Application uApplication = a.a().a();
          objArray1 = PatchProxy.applyOneRefs(uApplication, objArray1, MagicEmojiFragment.class, "61");
          if (objArray1 != PatchProxyResult.class) {
             b1 = objArray1.intValue();
          }else {
             Point point = n.s(uApplication);
             point = point.y;
             d = (((float)point.x / (float)point) - 0x3f100000 >= 0)? Math.floor(((double)point * 0x3fda1cac083126e9)): Math.floor(((double)point * 0x3fd70a3d70a3d70a));
             b1 = (int)d;
          }
          layoutParams1.height = b1;
          layoutParams.height = b1 - i;
          tZ.setLayoutParams(layoutParams);
          this.E.setLayoutParams(layoutParams1);
       }
       return;
    }
    public List wh(){
       Object obj = PatchProxy.apply(null, this, MagicEmojiFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.emptyList();
    }
    public final void x(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MagicEmojiFragment.class, "21")) {
          return;
       }
       this.E.setBackgroundDrawable(objArray);
       MagicEmojiFragment tX = this.X;
       if (tX != null) {
          g.a(this.E, tX);
       }
       return;
    }
}
