package com.yxcorp.gifshow.detail.PhotoDetailActivity;
import ge5.b;
import jga.e;
import id5.u;
import zs5.a;
import lnc.r3;
import im8.g;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayActivity;
import com.yxcorp.gifshow.util.t0;
import uw9.l0;
import java.util.HashSet;
import uw9.d;
import java.util.ArrayList;
import uw9.c0;
import com.yxcorp.gifshow.detail.PhotoDetailActivity$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Intent;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import android.content.res.Resources;
import android.app.Activity;
import cw9.c;
import l1.a;
import android.os.Bundle;
import android.util.Pair;
import android.app.ActivityOptions;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.detail.playmodule.QPhotoMediaPlayerCacheManager;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.feed.detail.router.DetailLogParam;
import java.util.Locale;
import java.lang.Float;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.yxcorp.gifshow.activity.x;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.n0;
import android.net.Uri;
import ekd.w0;
import az6.a;
import com.kwai.framework.model.channel.HotChannel;
import android.os.Parcelable;
import org.parceler.b;
import android.os.SystemClock;
import uh5.e;
import wkd.b;
import ip.b;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import com.kwai.framework.player.gotham.impl.KwaiSessionKeyGenerator;
import java.lang.Boolean;
import vca.i;
import e1a.p;
import java.lang.Long;
import java.lang.Number;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import rkd.b;
import tkd.b;
import tkd.d;
import ym5.a;
import com.yxcorp.gifshow.detail.PhotoDetailActivityTablet;
import vm5.f;
import android.net.Uri$Builder;
import ekd.j0;
import c0a.b;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import java.lang.StringBuilder;
import e17.i;
import lnc.b5;
import com.yxcorp.gifshow.util.MultiWindowLayoutUtil;
import ekd.i;
import rf5.n;
import id5.p;
import com.yxcorp.gifshow.detail.nonslide.b;
import uw9.v3;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import yy6.c;
import java.lang.System;
import d9a.b;
import android.content.res.Configuration;
import uw9.g0;
import java.lang.Runnable;
import t45.c;
import com.kuaishou.android.model.feed.SearchParams;
import com.yxcorp.gifshow.plugin.impl.search.util.c;
import com.kuaishou.android.model.feed.SearchParams$a;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import hka.f;
import lnc.q3;
import com.google.gson.JsonObject;
import com.kwai.framework.exceptionhandler.ExceptionClues;
import com.google.gson.JsonElement;
import jga.c;
import wca.b;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import os5.e;
import com.yxcorp.gifshow.detail.fragments.NormalDetailContainerFragment;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager;
import androidx.fragment.app.Fragment;
import com.kwai.component.photo.detail.core.container.DetailBaseContainerFragment;
import com.kwai.feature.api.live.plugin.dva.LoadPolicy;
import brd.a0;
import t45.d;
import brd.z;
import uw9.d0;
import uw9.e0;
import erd.g;
import crd.b;
import java.util.List;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.yxcorp.gifshow.detail.fragments.NasaMilanoSlidePlayContainerFragment;
import ld5.a;
import re5.a;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import java.lang.IllegalStateException;
import je5.c;
import com.yxcorp.gifshow.detail.b;
import ok.h;
import java.net.URLDecoder;
import java.io.UnsupportedEncodingException;
import ekd.x0;
import ge5.d;
import android.view.KeyEvent;
import android.view.MotionEvent;
import java.util.Set;
import java.util.Iterator;
import tyc.k3;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import fp5.a;
import uw9.k0;
import java.util.Map;
import java.util.HashMap;
import android.view.ContextThemeWrapper;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import uw9.o;
import q87.c;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import android.view.Window;
import e1a.c;
import android.transition.Transition;
import os5.o;
import dd5.m;
import dd5.p;
import dd5.b;
import hka.a;
import lnc.u1;
import com.yxcorp.gifshow.util.rx.RxBus;
import e06.b;
import brd.t;
import uw9.f0;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import rd5.c;
import com.yxcorp.gifshow.util.c;
import b5a.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import im8.c;
import uw9.h0;
import com.yxcorp.gifshow.util.t0$a;
import vw5.a;
import com.kuaishou.android.model.feed.PhotoType;
import kp.w1;
import lnc.b9;
import oe6.e;
import sf3.g;
import com.yxcorp.gifshow.detail.slideplay.b;
import nl9.u;
import java.util.Collection;
import ekd.q;
import com.kwai.framework.network.monitor.NetworkTypeMonitor$d;
import com.kwai.logger.KwaiLog;
import com.yxcorp.gifshow.detail.util.RegisterSysHomeButtonClickReceiverThread;
import m9a.b0;
import java.util.Objects;
import k2b.h3;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle$State;
import rd5.a;
import rd5.a$a;
import oe6.b;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.sdk.switchconfig.a;
import com.kwai.framework.activitycontext.ActivityContext;
import java.lang.ref.WeakReference;
import lnc.j4;
import eda.e;
import qe5.a;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import java.lang.IllegalArgumentException;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public class PhotoDetailActivity extends SlidePlayActivity implements b, e, u, a, r3, g	// class@001340
{
    public int C;
    public PhotoDetailParam D;
    public DetailBaseContainerFragment E;
    public SwipeLayout F;
    public FrameLayout G;
    public FrameLayout H;
    public t0 I;
    public final l0 J;
    public boolean K;
    public boolean L;
    public Set M;
    public RegisterSysHomeButtonClickReceiverThread N;
    public h O;
    public b P;
    public boolean Q;
    public String R;
    public List S;
    public boolean T;
    public boolean U;
    public final a V;
    public final t0$a W;
    public static boolean X = false;
    public static int Y;
    public static boolean Z = false;

    public void PhotoDetailActivity(){
       super();
       this.C = -1;
       this.I = new t0();
       this.J = new l0();
       this.L = false;
       this.M = new HashSet();
       this.P = new d();
       this.Q = false;
       this.S = new ArrayList();
       this.T = false;
       this.V = new c0(this);
       this.W = new PhotoDetailActivity$a(this);
    }
    public static void J3(GifshowActivity p0,int p1,Intent p2,View p3,int p4,int p5){
       if (PatchProxy.isSupport2(PhotoDetailActivity.class, "4")) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, null, PhotoDetailActivity.class, "4")) {
             return;
          }
       }
       if (p3 != null) {
          int i = (int)((((float)p3.getWidth() * 0x3f800000) / (float)n.y(a.B)) * (float)c.b(p0.getResources(), 0x7f070c5e));
          p0.r3(p2, p1, a.b(p3, 0, (- i), p4, (p5 + i)).d(), p3);
       }else {
          p0.q3(p2, p1, p3);
       }
       PatchProxy.onMethodExit(PhotoDetailActivity.class, "4");
       return;
    }
    public static void K3(GifshowActivity p0,int p1,Intent p2,View p3){
       if (PatchProxy.isSupport2(PhotoDetailActivity.class, "3") && PatchProxy.applyVoidFourRefsWithListener(p0, Integer.valueOf(p1), p2, p3, null, PhotoDetailActivity.class, "3")) {
          return;
       }
       Pair[] pairArray = new Pair[0];
       p0.startActivityForResult(p2, p1, ActivityOptions.makeSceneTransitionAnimation(p0, pairArray).toBundle());
       PatchProxy.onMethodExit(PhotoDetailActivity.class, "3");
       return;
    }
    public static Intent x3(GifshowActivity p0,PhotoDetailParam p1,View p2){
       PatchProxyResult patchProxyRe1;
       Object[] objArray;
       String photoId;
       boolean b;
       long l1;
       int i3;
       Context uContext = p0;
       PhotoDetailParam photoDetailP = p1;
       View view = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Intent obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, PhotoDetailActivity.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new Intent(uContext, PhotoDetailActivity.y3(p1));
       if (!photoDetailP) {
          return obj;
       }
       boolean i = 2;
       int i1 = 0;
       int i2 = 1;
       if (view) {
          photoDetailP.setClickViewId(p2.getId());
          int[] ointArray = new int[i];
          view.getLocationOnScreen(ointArray);
          Locale uS = Locale.US;
          patchProxyRe1 = patchProxyRe;
          objArray = new Object[i2];
          float f = 0x3f800000;
          objArray[i1] = Float.valueOf((((float)(ointArray[i1] + (p2.getWidth() / i)) * f) / (float)n.y(a.B)));
          Object[] objArray1 = new Object[i2];
          objArray1[i1] = Float.valueOf((((float)(ointArray[i2] + (p2.getHeight() / i)) * f) / (float)n.u(a.B)));
          p1.getDetailLogParam().addPageUrlParam("coor_x", String.format(uS, "%.3f", objArray)).addPageUrlParam("coor_y", String.format(uS, "%.3f", objArray1));
       }else {
          patchProxyRe1 = patchProxyRe;
       }
       p1.getDetailCommonParam().setSourcePage(p0.N2().getPage());
       p1.getDetailCommonParam().setSourcePage2(p0.N2().o());
       PhotoDetailParam mPhoto = photoDetailP.mPhoto;
       Object obj1 = null;
       if (mPhoto != null) {
          photoId = mPhoto.getPhotoId();
       }else if(!TextUtils.x(photoDetailP.mPhotoId)){
          photoId = photoDetailP.mPhotoId;
       }else {
          photoId = obj1;
       }
       if (!TextUtils.x(photoId)) {
          objArray = new Object[i2];
          objArray[i1] = photoId;
          obj.setData(w0.f(n0.a("kwai://work/%s", objArray)));
       }
       mPhoto = photoDetailP.mPhoto;
       photoDetailP.putParamIntoIntent(obj);
       if (mPhoto != null && mPhoto.isLiveStream()) {
          obj.putExtra("source", photoDetailP.mSource);
          obj.putExtra("indexInAdapter", p1.getPhotoIndex());
       }
       if (p1.getDetailCommonParam().getPreExpTag() != null) {
          obj.putExtra("arg_photo_exp_tag", p1.getDetailCommonParam().getPreExpTag());
          obj.putExtra("page_path", uContext.R2(view));
       }
       if (p1.getDetailCommonParam().getHotChannel() != null) {
          obj.putExtra("photo_feed_channel", b.c(p1.getDetailCommonParam().getHotChannel()));
       }
       obj.putExtra("key_opened_timestamp", SystemClock.elapsedRealtime());
       if (mPhoto != null && (p1.getBizType() == i2 || (!p1.getBizType() && (!e.b() && (mPhoto.isVideoType() && !b.a(-570058679).c(mPhoto)))))) {
          p1.getDetailPlayConfig().setContinuePlayStrategy(mPhoto.getContinuePlayStrategy());
       }
    label_0174 :
       if (mPhoto != null && (p1.getBizType() == 4 && mPhoto.getContinuePlayStrategy() != i)) {
          p1.getDetailPlayConfig().setContinuePlayStrategy(3);
       }
    label_018b :
       if (!p1.getDetailPlayConfig().isSharePlayer() && p1.getDetailPlayConfig().getSharedPlaySessionKeyGenerator() == null) {
          PhotoDetailParam mPhoto1 = photoDetailP.mPhoto;
          Object obj2 = PatchProxy.applyOneRefs(mPhoto1, obj1, QPhotoMediaPlayerCacheManager.class, "10");
          patchProxyRe = patchProxyRe1;
          if (obj2 != patchProxyRe) {
             i = obj2.booleanValue();
          }else if(mPhoto1 != null && (!i.d(mPhoto1) && !mPhoto1.isSerialPayPhoto())){
             i = true;
          }else {
             i = false;
          }
          if (i) {
             mPhoto1 = photoDetailP.mPhoto;
             long l = p.c(mPhoto1, p1.getDetailPlayConfig().getContinuePlayStrategy());
             b = (p1.getBizType() && p1.enableSlidePlay())? true: false;
             if (PatchProxy.isSupport(QPhotoMediaPlayerCacheManager.class)) {
                l1 = l;
                if (!PatchProxy.applyVoidFourRefs(mPhoto1, Long.valueOf(l), Boolean.valueOf(b), Boolean.TRUE, 0, QPhotoMediaPlayerCacheManager.class, "2")) {
                }
             }else {
                l1 = l;
             }
          }
       }
    label_0236 :
       if (p1.getDetailCommonParam().getHotChannel() != null) {
          obj.putExtra("photo_feed_channel", b.c(p1.getDetailCommonParam().getHotChannel()));
       }
       if (mPhoto != null && !TextUtils.x(r1.k0(mPhoto.mEntity))) {
          p1.getDetailLogParam().addPageUrlParam("atlas_detail_type", r1.k0(mPhoto.mEntity));
       }
       return obj;
    }
    public static Class y3(PhotoDetailParam p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, PhotoDetailActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (b.g()) {
          b = d.a(0x4c5dd1b8).f2();
          PhotoDetailActivityTablet photoDetailA = (p0 != null && (p0.getPhoto() != null && p0.getPhoto().isLiveStream()))? 1: null;
          if (!photoDetailA || b) {
             return PhotoDetailActivityTablet.class;
          }
       }
       return PhotoDetailActivity.class;
    }
    public boolean A3(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, PhotoDetailActivity.class, "26");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (f.p(this.getIntent())) {
          Intent intent = this.getIntent();
          Uri data = this.getIntent().getData();
          Uri uri = PatchProxy.applyOneRefs(data, objArray, f.class, "17");
          if (uri != patchProxyRe) {
          }else {
             uri = data.buildUpon().authority("commonfeedslide").build();
          }
          intent.setData(uri);
       }
       this.D = PhotoDetailParam.getPhotoDetailParamFromIntent(this.getIntent(), this);
       this.F3(this.getIntent().getData());
       this.K = j0.a(this.getIntent(), "kwai_from_push", false);
       long l = -1;
       this.D.getDetailCommonParam().setOpendTimeStamp(l);
       if (QPhotoMediaPlayerCacheManager.c(this.D.mPhoto)) {
          this.D.getDetailCommonParam().setOpendTimeStamp(j0.c(this.getIntent(), "key_opened_timestamp", l));
       }
       if (this.D.getDetailCommonParam().getOpendTimeStamp() <= 0) {
          this.D.getDetailCommonParam().setOpendTimeStamp(SystemClock.elapsedRealtime());
       }
       if (this.D.getDetailCommonParam().getHotChannel() == null) {
          this.D.getDetailCommonParam().setHotChannel(b.a(j0.d(this.getIntent(), "photo_feed_channel")));
       }
       this.D.parseBizType(this.getIntent(), this.D.mPhoto);
       this.E3();
       this.P.d(this, this.D);
       return true;
    }
    public final void B3(){
       if (PatchProxy.applyVoid(null, this, PhotoDetailActivity.class, "12")) {
          return;
       }
       if (!this.D.isThanos() && b5.a(this)) {
          MultiWindowLayoutUtil.c(this, true);
       }else {
          i.h(this, 0, 0);
       }
       return;
    }
    public final void C3(){
       if (PatchProxy.applyVoid(null, this, PhotoDetailActivity.class, "13")) {
          return;
       }
       this.J.U0.b = new n();
       this.J.V1 = new b(this.D, this);
       this.J.f.g(u1.p());
       this.J.f.e(System.currentTimeMillis());
       this.J.W1 = new b();
       return;
    }
    public final boolean D3(){
       Resources obj = PatchProxy.apply(null, this, PhotoDetailActivity.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (b5.a(this)) {
          return b5.b(this);
       }
       obj = this.getResources();
       boolean b = false;
       if (obj != null && (obj.getConfiguration() != null && obj.getConfiguration().orientation != 1)) {
          b = true;
       }
    label_0036 :
       return b;
    }
    public final void E3(){
       if (PatchProxy.applyVoid(null, this, PhotoDetailActivity.class, "27")) {
          return;
       }
       if (this.D == null) {
          return;
       }
       c.a(new g0(this));
       return;
    }
    public final void F3(Uri p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailActivity.class, "30")) {
          return;
       }
       if (p0 == null || (p0.isHierarchical() && this.D.getDetailLogParam().getSearchParams() == null)) {
          String queryParamet = p0.getQueryParameter("searchType");
          String queryParamet1 = p0.getQueryParameter("searchPosition");
          String queryParamet2 = p0.getQueryParameter("searchSessionId");
          String queryParamet3 = p0.getQueryParameter("content");
          if (!TextUtils.x(queryParamet) && !TextUtils.x(queryParamet2)) {
             if (TextUtils.x(queryParamet1)) {
                queryParamet1 = "0";
             }
             SearchParams$a uoa = SearchParams.newBuilder();
             uoa.g(c.b(queryParamet));
             uoa.f(queryParamet2);
             uoa.e(Integer.valueOf(queryParamet1).intValue());
             uoa.c(queryParamet3);
             this.D.getDetailLogParam().setSearchParams(uoa.a());
          }
       }
    label_0075 :
       return;
    }
    public ViewGroup Fe(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailActivity.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.G == null) {
          this.G = this.findViewById(0x7f0a3698);
       }
       return this.G;
    }
    public void G1(f p0){
       q3.c(this, p0);
    }
    public final void G3(){
       if (PatchProxy.applyVoid(null, this, PhotoDetailActivity.class, "28")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("bizType", Integer.valueOf(this.D.getBizType()));
       PhotoDetailActivity tD = this.D;
       PhotoDetailParam mPhoto = tD.mPhoto;
       if (mPhoto != null) {
          jsonObject.c0("detailPhotoId", mPhoto.getPhotoId());
       }else if(!TextUtils.x(tD.mPhotoId)){
          jsonObject.c0("detailPhotoId", this.D.mPhotoId);
       }
       ExceptionClues.c.c("PhotoAct", jsonObject);
       return;
    }
    public c G9(){
       PhotoDetailActivity obj = PatchProxy.apply(null, this, PhotoDetailActivity.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.D;
       if (obj != null) {
          PhotoDetailParam mPhoto = obj.mPhoto;
          if (mPhoto != null) {
             return b.c(mPhoto.mEntity);
          }
       }
       return null;
    }
    public final void H3(boolean p0){
       this.L = p0;
    }
    public View H6(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailActivity.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.p0() == null) {
          return null;
       }
       return this.p0().s2();
    }
    public final void I3(){
       NasaMilanoSlidePlayContainerFragment nasaMilanoSl;
       e uoe = e.class;
       if (PatchProxy.applyVoid(null, this, PhotoDetailActivity.class, "14")) {
          return;
       }
       if (this.D.getBizType() == 1) {
          this.E = new NormalDetailContainerFragment();
       }else if(this.D.getBizType() == 10){
          if (LivePluginManager.c()) {
             this.E = LivePluginManager.b(uoe).vM();
          }else {
             this.S.add(LivePluginManager.e(uoe, LoadPolicy.DIALOG, this, "PhotoAct").G(d.a).R(new d0(this), new e0(this)));
             return;
          }
       }else if(this.D.getBizType() == 5){
          nasaMilanoSl = new NasaMilanoSlidePlayContainerFragment();
          nasaMilanoSl.C = NasaBizParam.getBizParamFromIntent(this.getIntent(), this);
          this.E = nasaMilanoSl;
       }else if(this.D.getBizType() == 11){
          nasaMilanoSl = new NasaMilanoSlidePlayContainerFragment();
          nasaMilanoSl.C = NasaBizParam.getBizParamFromIntent(this.getIntent(), this);
          this.E = nasaMilanoSl;
       }else if(this.D.getBizType() != 4 && (this.D.getBizType() == 2 || this.D.getBizType() == 19)){
          nasaMilanoSl = new NasaMilanoSlidePlayContainerFragment();
          nasaMilanoSl.C = NasaBizParam.getBizParamFromIntent(this.getIntent(), this);
          this.E = nasaMilanoSl;
       }
       PhotoDetailActivity tE = this.E;
       if (tE != null) {
          tE.oh(this.D);
          tE = this.E;
          tE.l = this.K;
          if (!tE.ih(this.getIntent(), this.D)) {
             this.finish();
             return;
          }else {
             int i = this.E.eh();
             if (i) {
                this.setTheme(i);
             }
             this.E.fh().b = this.J;
             if (this.v3()) {
                this.E.fh().t = this.y;
             }
             this.E.fh().c = Boolean.valueOf(b5.a(this));
             uoe = this.getSupportFragmentManager().beginTransaction();
             uoe.v(R.id.photo_detail_content_fragment, this.E);
             uoe.m();
             return;
          }
       }else {
          throw new IllegalStateException("不应该出现这种情况，如果出现找找原因。");
       }
    }
    public v3 J1(){
       return this.J;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, PhotoDetailActivity.class, "48")) {
          return;
       }
       this.H3(false);
       return;
    }
    public String M2(Intent p0){
       c uoc;
       Object obj1;
       Uri$Builder uBuilder;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyOneRefs(p0, this, PhotoDetailActivity.class, "38");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = super.M2(p0);
       String str = null;
       if (obj == null && p0.getData() != null) {
          Uri data = p0.getData();
          if (!data.isHierarchical()) {
             return str;
          }else {
             String str1 = "1";
             String str2 = c.a(data, str1);
             if (!TextUtils.x(str2)) {
                return str2;
             }else {
                str1 = c.b(data, str1, b.b);
                this.R = str1;
                if (!TextUtils.x(str1)) {
                   return this.R;
                }else {
                   String str3 = w0.a(data, "backUri");
                   if (!TextUtils.x(str3)) {
                      try{
                         return URLDecoder.decode(str3, "utf-8");
                      }catch(java.io.UnsupportedEncodingException e3){
                         e3.printStackTrace();
                      }
                   }
                }
             }
          }
       }
    }
    public void R(f p0){
       q3.a(this, p0);
    }
    public d Rc(){
       return this.J.U0.b;
    }
    public View Tf(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailActivity.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.H == null) {
          this.H = this.findViewById(0x7f0a3029);
       }
       return this.H;
    }
    public String W2(){
       return this.R;
    }
    public boolean Y(int p0,KeyEvent p1){
       return q3.b(this, p0, p1);
    }
    public void addSlidePlayIgnoreView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailActivity.class, "60")) {
          return;
       }
       if (this.p0() != null) {
          this.p0().A(p0);
       }
       return;
    }
    public boolean dispatchKeyEvent(KeyEvent p0){
       PhotoDetailActivity photoDetailA = PhotoDetailActivity.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, photoDetailA, "57");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, photoDetailA, "58") && (!p0.getAction() && p0.getKeyCode() == 4)) {
          u1.K0(9);
       }
    label_002e :
       if (b.d() && (p0.getKeyCode() == 62 && this.Y(p0.getKeyCode(), p0))) {
          return true;
       }else {
          return super.dispatchKeyEvent(p0);
       }
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, PhotoDetailActivity.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.M.isEmpty()) {
          obj = this.M.iterator();
          while (obj.hasNext()) {
             obj.next().onDispatchTouchEvent(p0);
          }
       }
       return super.dispatchTouchEvent(p0);
    }
    public int f(){
       PhotoDetailParam mPhoto;
       PhotoDetailActivity obj = PatchProxy.apply(null, this, PhotoDetailActivity.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.D;
       if (obj != null) {
          mPhoto = obj.mPhoto;
          if (mPhoto != null && r1.S2(mPhoto.mEntity)) {
             return 7;
          }
       }
       obj = this.D;
       if (obj != null) {
          mPhoto = obj.mPhoto;
          if (mPhoto != null && mPhoto.isChorus()) {
             return 72;
          }
       }
       obj = this.E;
       if (obj != null) {
          int i = obj.f();
          if (i) {
             return i;
          }
       }
       return 0;
    }
    public void finish(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PhotoDetailActivity.class, "22")) {
          return;
       }
       PhotoDetailActivity tE = this.E;
       if (tE != null) {
          tE.d0();
       }
       boolean booleanExtra = this.getIntent().getBooleanExtra("hasScrolled", false);
       if (!TextUtils.x(this.R) && ((this.R).contains("eventType") && (this.R).contains("utm_source"))) {
          PhotoDetailActivity tR = this.R;
          c uoc = c.class;
          if (PatchProxy.isSupport(uoc)) {
             Iterator obj = PatchProxy.applyTwoRefs(Boolean.valueOf(booleanExtra), tR, objArray, uoc, "7");
             if (obj != PatchProxyResult.class) {
                tR = obj;
             }else if(!booleanExtra){
                Uri uri = Uri.parse(tR);
                Uri$Builder uBuilder = uri.buildUpon();
                uBuilder.clearQuery();
                obj = uri.getQueryParameterNames().iterator();
                while (obj.hasNext()) {
                   String str = obj.next();
                   if (!str.equals("isInjectFeed")) {
                      uBuilder.appendQueryParameter(str, uri.getQueryParameter(str));
                   }
                }
                tR = uBuilder.build().toString();
             }
          }else {
             goto label_0056 ;
          }
          this.R = tR;
       }
    label_0092 :
       super.finish();
       if (this.T != null && this.isTaskRoot()) {
          d.a(0x31a55ac8).Jt(this);
       }
       tE = this.D;
       if (tE != null) {
          PhotoDetailParam mDetailCommo = tE.mDetailCommonParam;
          if (mDetailCommo != null && mDetailCommo.isMyFollowFriendEntrance()) {
             this.overridePendingTransition(R.anim.arg_RES_7f0100e5, 0x7f010112);
          label_00c6 :
             return;
          }
       }
       this.overridePendingTransition(false, false);
       goto label_00c6 ;
    }
    public QPhoto getCurrentPhoto(){
       PhotoDetailActivity obj = PatchProxy.apply(null, this, PhotoDetailActivity.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.E;
       if (obj != null) {
          return obj.getCurrentPhoto();
       }
       return null;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotoDetailActivity.class, "65");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, PhotoDetailActivity.class, "66");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(PhotoDetailActivity.class, new k0());
       }else {
          obj.put(PhotoDetailActivity.class, null);
       }
       return obj;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailActivity.class, "64");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SplitInstallHelper.loadResources(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PhotoDetailActivity photoDetailA = PhotoDetailActivity.class;
       Fragment obj = PatchProxy.apply(null, this, photoDetailA, "37");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.L != null) {
          obj = this.getSupportFragmentManager().findFragmentById(R.id.profile_fragment_container_for_swipe);
          if (obj != null) {
             return obj.getUrl();
          }
       }
       PhotoDetailActivity tD = this.D;
       String str = "ks://photo";
       if (tD != null) {
          PhotoDetailParam mPhoto = tD.mPhoto;
          Object[] obj1 = PatchProxy.applyOneRefs(mPhoto, this, photoDetailA, "5");
          if (obj1 != patchProxyRe) {
             str = obj1;
          }else if(mPhoto == null){
             obj1 = new Object[]{mPhoto.getUserId(),mPhoto.getPhotoId(),Integer.valueOf(mPhoto.getType()),mPhoto.getExpTag()};
             str = String.format(Locale.US, "ks://photo/%s/%s/%d/%s", obj1);
          }
       }
       return str;
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void k2(){
       if (PatchProxy.applyVoid(null, this, PhotoDetailActivity.class, "49")) {
          return;
       }
       this.H3(true);
       return;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(PhotoDetailActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, PhotoDetailActivity.class, "41")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       this.P.b(p0, p1, p2);
       return;
    }
    public void onCreate(Bundle p0){
       boolean i2;
       Object[] objArray1;
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailActivity.class, "9")) {
          return;
       }
       int i = 0;
       int i1 = 1;
       if (p0 != null) {
          i2 = PhotoDetailActivity.X ^ i1;
          String str = "isAppRecreate="+i2+"&intent="+this.getIntent().toString();
          Object[] objArray = new Object[i];
          String str1 = "PhotoDetailActivityRestore";
          o.C().w(str1, str, objArray);
          u1.R(str1, str, 14);
          if (i2) {
             i2 = true;
          label_0048 :
             if (!i2) {
                i2 = this.A3() ^ i1;
             }
             if (!i2) {
                PhotoDetailActivity tD = this.D;
                if (tD != null && tD.getBizType() == i1) {
                   NormalDetailBizParam bizParamFrom = NormalDetailBizParam.getBizParamFromIntent(this.getIntent());
                   if (bizParamFrom != null && bizParamFrom.mFromSlidePlayPhotoClick != null) {
                      this.getWindow().requestFeature(13);
                      c uoc = new c(bizParamFrom.mImageContainerHeight, bizParamFrom.mDetailImageContainerHeight, bizParamFrom.mStartImageIndex, bizParamFrom.mStartImageOffset, bizParamFrom.mFromCaptionOrCommentClick, bizParamFrom.mIsLongAtlas);
                      this.getWindow().setEnterTransition(v4);
                      this.getWindow().setAllowEnterTransitionOverlap(i1);
                   }
                }
             }
             super.onCreate(p0);
             if (i2) {
                this.finish();
                return;
             }else if(!b.g() && this.D3()){
                objArray1 = new Object[i];
                o.C().w("PhotoDetailActivity", "changeOrientationIfNeeded", objArray1);
                this.setRequestedOrientation(i1);
             }
             PhotoDetailActivity.X = i1;
             if (this.D.getBizType() == 9) {
                d.a(-1451128556).Ql(this);
                return;
             }else {
                p.a(this).k(null, this);
                p.a(this).o();
                p.a(this).b(this.z3());
                this.getWindow().addFlags(128);
                this.F2(this.V);
                u1.a(this);
                RxBus f = RxBus.f;
                this.S.add(f.f(b.class).observeOn(d.a).subscribe(new f0(this)));
                this.F = w9.a(this);
                this.C3();
                this.B3();
                this.setContentView(R.layout.arg_RES_7f0d0034);
                f.b(new c(i1, this.hashCode()));
                PhotoDetailParam mDetailCommo = this.D.mDetailCommonParam;
                if (mDetailCommo != null && mDetailCommo.mIsWindowTranslucent != null) {
                   new c(this).a();
                }
                if (this.D.enableSlidePlay()) {
                   this.I3();
                }else {
                   this.O = new h();
                   p.a(this).q("dataFlow");
                   this.O.f(this.findViewById(R.id.photo_detail_content_fragment));
                   objArray1 = new Object[]{this.D,this.J.V1,new c("DETAIL_FLOW_END_LISTENER", new h0(this))};
                   this.O.i(objArray1);
                }
                this.I.d(this.W);
                mDetailCommo = this.D.mDetailCommonParam;
                if (mDetailCommo != null && (mDetailCommo.getSourcePage() == 15 && this.D.mPhoto != null)) {
                   d.a(-680793205).Jb(w1.r(this.D.mPhoto.mEntity));
                }
             label_01c1 :
                return;
             }
          }
       }
       i2 = false;
       goto label_0048 ;
    }
    public void onDestroy(){
       PhotoDetailActivity photoDetailA = PhotoDetailActivity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, photoDetailA, "23")) {
          return;
       }
       super.onDestroy();
       RxBus.f.b(new c(false, this.hashCode()));
       u1.b(this);
       Iterator iterator = this.S.iterator();
       while (iterator.hasNext()) {
          b9.a(iterator.next());
       }
       this.S.clear();
       this.J.clear();
       PhotoDetailActivity tO = this.O;
       if (tO != null) {
          tO.destroy();
       }
       if (!e.L()) {
          e.y0(1);
       }
       g.a(false);
       if (!PatchProxy.applyVoid(objArray, this, photoDetailA, "29")) {
          ExceptionClues.c.b("PhotoAct");
       }
       this.I.d(objArray);
       if (this.isFinishing()) {
          photoDetailA = this.D;
          if (photoDetailA != null) {
             b uob = b.e(photoDetailA.mSlidePlayId);
             if (uob != null) {
                uob.d();
             }
          }
       }
       l0 v1 = this.J.V1;
       if (v1 != null) {
          v1.e();
       }
       d.a(-1694791652).n1();
       List w0 = r3.w0;
       if (!q.f(w0)) {
          w0.clear();
       }
       return;
    }
    public void onEventMainThread(NetworkTypeMonitor$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailActivity.class, "52")) {
          return;
       }
       this.z = false;
       return;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       PhotoDetailActivity photoDetailA = PhotoDetailActivity.class;
       if (PatchProxy.isSupport(photoDetailA)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, photoDetailA, "21");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.Y(p0, p1)) {
          Object[] objArray = new Object[0];
          KwaiLog.b("PhotoAct", "key intercept", objArray);
          return true;
       }else {
          return super.onKeyDown(p0, p1);
       }
    }
    public boolean onKeyUp(int p0,KeyEvent p1){
       PhotoDetailActivity photoDetailA = PhotoDetailActivity.class;
       if (PatchProxy.isSupport(photoDetailA)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, photoDetailA, "20");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.Y(p0, p1)) {
          return true;
       }else {
          return super.onKeyUp(p0, p1);
       }
    }
    public void onPause(){
       PhotoDetailActivity photoDetailA = PhotoDetailActivity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, photoDetailA, "40")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, photoDetailA, "56")) {
          photoDetailA = this.N;
          if (photoDetailA != null) {
             boolean b = PatchProxy.applyVoid(objArray, photoDetailA, RegisterSysHomeButtonClickReceiverThread.class, "3");
             if (!b) {
                b = photoDetailA.d;
                if (b == null) {
                   photoDetailA.d = true;
                   b = new b0(photoDetailA);
                   c.a(b);
                }
             }
             this.N = objArray;
          }
       }
       super.onPause();
       this.P.c();
       v3 f = this.J.f;
       Objects.requireNonNull(f);
       if (!PatchProxy.applyVoid(objArray, f, c.class, "2")) {
          f.q.a();
       }
       this.I.a();
       this.Q = true;
       g.a(false);
       return;
    }
    public void onPictureInPictureModeChanged(boolean p0){
       PhotoDetailActivity photoDetailA = PhotoDetailActivity.class;
       if (PatchProxy.isSupport(photoDetailA) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailA, "31")) {
          return;
       }
       super.onPictureInPictureModeChanged(p0);
       Object[] objArray = new Object[0];
       o.C().w("PhotoAct", "onPictureInPictureModeChanged: "+p0+", state "+this.getLifecycle().getCurrentState(), objArray);
       a.c.d(this, p0);
       if (p0) {
          this.T = true;
       }
       if (!p0 && this.getLifecycle().getCurrentState() == Lifecycle$State.CREATED) {
          this.T = false;
          this.finishAndRemoveTask();
       }
       return;
    }
    public void onResume(){
       PhotoDetailActivity photoDetailA = PhotoDetailActivity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, photoDetailA, "39")) {
          return;
       }
       super.onResume();
       if (!PatchProxy.applyVoid(objArray, this, photoDetailA, "55")) {
          RegisterSysHomeButtonClickReceiverThread registerSysH = new RegisterSysHomeButtonClickReceiverThread(this);
          this.N = registerSysH;
          if (!PatchProxy.applyVoid(objArray, registerSysH, RegisterSysHomeButtonClickReceiverThread.class, "2") && registerSysH.d == null) {
             c.a(registerSysH);
          }
       }
       String str = b.m();
       if (!TextUtils.x(str) && !PhotoDetailActivity.Z) {
          PhotoDetailActivity tD = this.D;
          if (tD != null) {
             PhotoDetailParam mPhoto = tD.mPhoto;
             if (mPhoto != null && !(mPhoto.getUserId()).equals(QCurrentUser.ME.getId())) {
                i.d(R.style.arg_RES_7f11066a, str);
                PhotoDetailActivity.Z = true;
             }
          }
       }
       v3 f = this.J.f;
       Objects.requireNonNull(f);
       if (!PatchProxy.applyVoid(objArray, f, c.class, "1")) {
          f.q.c();
       }
       this.I.c();
       this.P.a();
       this.G3();
       if (this.Q != null) {
          this.Q = false;
          g.a(true);
       }
       return;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailActivity.class, "24")) {
          return;
       }
       int i = 0;
       if (PhotoDetailActivity.Y < 0) {
          PhotoDetailActivity.Y = a.t().a("DetailActivityLowMemKillProtect", i);
       }
       if (PhotoDetailActivity.Y > 0) {
          Iterator iterator = ActivityContext.g().b().iterator();
          while (iterator.hasNext()) {
             WeakReference weakReferenc = iterator.next();
             if (weakReferenc.get() != null && weakReferenc.get().getClass().equals(this.getClass())) {
                i = i + 1;
             }
             if (i > PhotoDetailActivity.Y) {
                break ;
             }
          }
          if (i <= PhotoDetailActivity.Y) {
             j4.b(this);
          }
       }
       return;
    }
    public void onUserLeaveHint(){
       if (PatchProxy.applyVoid(null, this, PhotoDetailActivity.class, "32")) {
          return;
       }
       super.onUserLeaveHint();
       RxBus.f.b(new e(this, false));
       return;
    }
    public d p(){
       return this.J.U0.b;
    }
    public SlidePlayViewModel p0(){
       PhotoDetailActivity obj = PatchProxy.apply(null, this, PhotoDetailActivity.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.E;
       if (obj != null && obj instanceof a) {
          return obj.p0();
       }
       return null;
    }
    public void q3(Intent p0,int p1,View p2){
       if (PatchProxy.isSupport(PhotoDetailActivity.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, PhotoDetailActivity.class, "34")) {
          return;
       }
       if (p0 != null) {
          p0.addFlags(0x40000);
       }
       super.q3(p0, p1, p2);
       return;
    }
    public int r(){
       PhotoDetailActivity obj = PatchProxy.apply(null, this, PhotoDetailActivity.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.E;
       if (obj != null) {
          return obj.r();
       }
       return 0;
    }
    public void removeSlidePlayIgnoreView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailActivity.class, "61")) {
          return;
       }
       if (this.p0() != null) {
          this.p0().K(p0);
       }
       return;
    }
    public void setRequestedOrientation(int p0){
       PhotoDetailActivity photoDetailA = PhotoDetailActivity.class;
       if (PatchProxy.isSupport(photoDetailA) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, photoDetailA, "63")) {
          return;
       }
       super.setRequestedOrientation(p0);
       this.C = p0;
       return;
    }
    public void startActivity(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailActivity.class, "35")) {
          return;
       }
       super.startActivity(p0);
       this.overridePendingTransition(R.anim.arg_RES_7f010109, 0x7f0100e5);
       return;
    }
    public void startActivityForResult(Intent p0,int p1){
       PhotoDetailActivity photoDetailA = PhotoDetailActivity.class;
       if (PatchProxy.isSupport(photoDetailA) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, photoDetailA, "36")) {
          return;
       }
       if (p0 != null) {
          p0.addFlags(0x40000);
       }
       super.startActivityForResult(p0, p1);
       if (p0 != null) {
          p0.putExtra("start_exit_page_animation", R.anim.arg_RES_7f0100e5);
       }
       return;
    }
    public void startActivityForResult(Intent p0,int p1,Bundle p2){
       if (PatchProxy.isSupport(PhotoDetailActivity.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, PhotoDetailActivity.class, "33")) {
          return;
       }
       if (p0 != null) {
          p0.addFlags(0x40000);
       }
       super.startActivityForResult(p0, p1, p2);
       return;
    }
    public int u(){
       return this.C;
    }
    public SlidePlayLogger u3(){
       PhotoDetailActivity obj = PatchProxy.apply(null, this, PhotoDetailActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.E;
       if (obj == null) {
          return new PhotoDetailLogger();
       }
       SlidePlayLogger slidePlayLog = (obj.d1() != null)? this.E.d1(): new PhotoDetailLogger();
       return slidePlayLog;
    }
    public boolean v3(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.D.enableSlidePlay();
    }
    public void w3(a p0){
       PhotoDetailActivity photoDetailA = PhotoDetailActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, photoDetailA, "51")) {
          return;
       }
       if (p0 instanceof PhotoDetailParam && !PatchProxy.applyVoidOneRefs(p0, this, photoDetailA, "50")) {
          if (p0 == null) {
             ExceptionHandler.handleCaughtException(new IllegalArgumentException("detailParam is null: "+Log.f(new Throwable())));
          }
          this.D = p0;
          photoDetailA = this.E;
          if (photoDetailA != null) {
             photoDetailA.oh(p0);
          }
       }
    label_0047 :
       return;
    }
    public final Map z3(){
       HashMap obj = PatchProxy.apply(null, this, PhotoDetailActivity.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       PhotoDetailParam mPhoto = this.D.mPhoto;
       if (mPhoto != null && mPhoto.getEntity() != null) {
          obj.put("photoId", this.D.mPhoto.getPhotoId());
          obj.put("photoType", String.valueOf(this.D.mPhoto.getType()));
       }
       obj.put("bizType", String.valueOf(this.D.getBizType()));
       return obj;
    }
}
