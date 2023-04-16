package com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootHorizontalDetailVMFragment;
import im8.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayHorizontalPhotosVMFragment;
import qp7.t0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import android.view.View;
import android.app.Activity;
import com.yxcorp.utility.n;
import com.kwai.slide.play.detail.base.PageType;
import androidx.fragment.app.Fragment;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import w6a.a;
import w6a.n;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import jh5.a;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import java.util.List;
import com.kwai.slide.play.detail.base.BasePage;
import java.util.Objects;
import com.yxcorp.gifshow.action.RealActionBizType;
import v6a.o0;
import v6a.f8;
import y8c.a;
import brd.y;
import w85.b;
import com.kwai.component.detail.launcher.api.model.detail.DetailParamCreator;
import w85.a;
import u85.a;
import u85.b;
import com.yxcorp.gifshow.comment.CommentPageListConfig;
import com.yxcorp.gifshow.entity.QPhoto;
import m9a.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import y6a.c;
import c7a.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import of5.p;
import android.widget.RelativeLayout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.kwai.library.slide.base.exp.SlidePerformanceExp;
import com.kuaishou.ax2c.AX2C;
import android.content.Context;
import d6a.r;
import i2b.a;
import x1a.a$a;
import com.yxcorp.gifshow.nasa.NasaCollectionSlideParam;
import c7a.a;
import h6a.c1;
import java.util.Map;
import java.util.HashMap;
import java.lang.Number;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import tkd.b;
import tkd.d;
import xpb.a;
import androidx.fragment.app.FragmentActivity;
import java.lang.StringBuilder;
import hv5.a;
import mv5.b;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kwai.framework.model.commonfeedslide.CommonFeedSlideParams;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import f3b.o;
import android.os.Bundle;
import m9a.s;
import android.content.Intent;
import vm5.f;
import dw6.b;
import hx6.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import le5.f;
import o56.f;
import on5.b;
import lo5.a;
import ko5.c;
import com.kwai.kcube.TabIdentifier;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import com.smile.gifmaker.mvps.presenter.MainThreadScatterPresenterGroup;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.a;
import g7a.w0;
import h7a.a;
import wh5.c;
import z85.a;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeUtil;
import d5a.c;
import v6a.z7;
import v6a.m0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.b;
import msd.l;

public final class NasaGrootHorizontalDetailVMFragment extends SlidePlayHorizontalPhotosVMFragment implements g	// class@001728
{
    public NasaBizParam U;
    public a V;
    public a W;
    public boolean X;
    public boolean Y;
    public static final int Z;

    public void NasaGrootHorizontalDetailVMFragment(){
       super();
       this.X = false;
       this.Y = false;
    }
    public t0 Ah(){
       Object[] objArray = null;
       SlidePageConfig slidePageCon = PatchProxy.applyWithListener(objArray, this, NasaGrootHorizontalDetailVMFragment.class, "5");
       if (slidePageCon != PatchProxyResult.class) {
       }else {
          a uoa = n.a(this, n.d(this.j), PageType.ATLAS, this.U, this.I);
          this.W = uoa;
          slidePageCon = uoa.c();
          this.F.e(this.W.e(this.sh()));
          this.sh();
          Objects.requireNonNull(this.W);
          this.F.i(objArray);
          this.F.c(this.W.d(this.sh()));
          PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "5");
       }
       return slidePageCon;
    }
    public void Bh(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaGrootHorizontalDetailVMFragment.class, "15")) {
          return;
       }
       super.Bh();
       SlidePlayHorizontalPhotosVMFragment tJ = this.J;
       tJ.L2 = RealActionBizType.FEATURED;
       tJ.o2 = new f8(this.I, this, this.J.C1);
       PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "15");
       return;
    }
    public void Ch(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaGrootHorizontalDetailVMFragment.class, "17")) {
          return;
       }
       if (this.V == null) {
          this.V = DetailParamCreator.a(true, this.x, this.U).b();
       }
       a.a.a(this.V);
       PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "17");
       return;
    }
    public BasePage Dh(){
       SlidePage slidePage = PatchProxy.applyWithListener(null, this, NasaGrootHorizontalDetailVMFragment.class, "1");
       if (slidePage != PatchProxyResult.class) {
       }else {
          slidePage = new SlidePage(PageType.ATLAS, this.sh());
          PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "1");
       }
       return slidePage;
    }
    public CommentPageListConfig Eh(){
       Object obj = PatchProxy.applyWithListener(null, this, NasaGrootHorizontalDetailVMFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "14");
       return d.b(this.M);
    }
    public PresenterV2 Fh(){
       c obj = PatchProxy.applyWithListener(null, this, NasaGrootHorizontalDetailVMFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new c(this, this.Oh());
       if (this.U.getNasaSlideParam().isHomeFeatureStyle()) {
          obj.U7(new p());
       }
       PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "16");
       return obj;
    }
    public RelativeLayout Gh(View p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, NasaGrootHorizontalDetailVMFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "6");
       return p0.findViewById(0x7f0a3a43);
    }
    public View Ih(LayoutInflater p0,ViewGroup p1){
       Object obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, NasaGrootHorizontalDetailVMFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (SlidePerformanceExp.g()) {
          PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "7");
          return new AX2C(p0.getContext()).inflateSync(r.c(), p1, false);
       }else {
          PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "7");
          return a.g(p0, r.c(), p1, false);
       }
    }
    public void Mh(a$a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaGrootHorizontalDetailVMFragment.class, "10")) {
          return;
       }
       if (this.U.getNasaSlideParam().mNasaCollectionSlideParam != null && this.U.getNasaSlideParam().mNasaCollectionSlideParam.isHealthyType()) {
          p0.d(this.U.getNasaSlideParam().mNasaCollectionSlideParam.mFrom);
       }
       PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "10");
       return;
    }
    public final b Oh(){
       Object obj = PatchProxy.applyWithListener(null, this, NasaGrootHorizontalDetailVMFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "18");
       return new a(this.x.mPhoto);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, NasaGrootHorizontalDetailVMFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "20");
          return new c1();
       }else {
          PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "20");
          return null;
       }
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefsWithListener(p0, this, NasaGrootHorizontalDetailVMFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(NasaGrootHorizontalDetailVMFragment.class, new c1());
       }else {
          obj.put(NasaGrootHorizontalDetailVMFragment.class, null);
       }
       PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "21");
       return obj;
    }
    public int getPage(){
       NasaGrootHorizontalDetailVMFragment obj = PatchProxy.applyWithListener(null, this, NasaGrootHorizontalDetailVMFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (VisitorModeManager.f()) {
          PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "8");
          return i;
       }else {
          obj = this.U;
          if (obj == null || obj.getNasaSlideParam() == null) {
             PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "8");
             return i;
          }else if(this.U.getNasaSlideParam().mIsMusicRadio != null){
             PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "8");
             return i;
          }else if(this.U.getNasaSlideParam().enableDecSearchPage()){
             PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "8");
             return 7;
          }else if(this.U.getNasaSlideParam().isDetailPage()){
             PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "8");
             return i;
          }else if(this.U.getNasaSlideParam().isFromNearby()){
             PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "8");
             return 7;
          }else if(this.U.getNasaSlideParam().isFollowNasaDetail()){
             PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "8");
             return 7;
          }else if(this.U.getNasaSlideParam().isTrendingPage()){
             PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "8");
             return i;
          }else {
             PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "8");
             return 0x7d42;
          }
       }
    }
    public String getPageParams(){
       String str2;
       int i1;
       String obj = PatchProxy.applyWithListener(null, this, NasaGrootHorizontalDetailVMFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0x513becbe;
       String str = "";
       obj = (d.a(i).uQ(this.getActivity()))? "&tab_id="+d.a(i).Q2(): str;
       String str1 = (this.U.getNasaSlideParam().mIsFollowSlideNasaDetail != null)? d.a(0x6c2883df).wL(): str;
       if (this.U.getNasaSlideParam().isFriendPage()) {
          str2 = d.a(0x3ee97dc2).v40();
          SlidePlayHorizontalPhotosVMFragment tM = this.M;
          if (tM != null) {
             QPhoto mEntity = tM.mEntity;
             if (mEntity != null && r1.x2(mEntity)) {
                i1 = 2;
             }else {
             label_0084 :
                tM = this.M;
                i1 = (tM != null && (tM.mEntity != null && tM.isPrefetch()))? 1: 0;
             }
          }else {
             goto label_0084 ;
          }
          str2 = str2+"&photo_load_type="+i1;
       }else {
          str2 = str;
       }
       StringBuilder str3 = super.getPageParams()+str1+str2;
       if (("FEATURED_PAGE").equals(this.o())) {
          str = "&is_page_loading=FALSE";
       }
       PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "9");
       return str3+str+obj;
    }
    public String o(){
       NasaGrootHorizontalDetailVMFragment obj = PatchProxy.applyWithListener(null, this, NasaGrootHorizontalDetailVMFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (VisitorModeManager.f()) {
          PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "11");
          return "SINGLE_FEED_VISITOR_MODE_PAGE";
       }else {
          obj = this.U;
          if (obj == null || obj.getNasaSlideParam() == null) {
             PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "11");
             return super.o();
          }else if(this.U.getNasaSlideParam().mIsMusicRadio != null && (this.getActivity() != null && d.a(0x513becbe).uQ(this.getActivity()))){
             PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "11");
             return "MUSIC_DETAIL";
          }else if(this.U.getNasaSlideParam().mHomeCommonFeedSlideParams != null){
             if (!TextUtils.x(this.U.getNasaSlideParam().mHomeCommonFeedSlideParams.mPage2)) {
                PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "11");
                return this.U.getNasaSlideParam().mHomeCommonFeedSlideParams.mPage2;
             }else {
                PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "11");
                return "DETAIL";
             }
          }else {
             int i = 7;
             if (this.U.getNasaSlideParam().isFromNearby()) {
                PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "11");
                return o.i(i);
             }else if(this.U.getNasaSlideParam().mIsFriendsNasaDetail != null){
                PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "11");
                return "FRIENDS";
             }else if(this.U.getNasaSlideParam().isFromIMMessage()){
                PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "11");
                return "MESSAGE_SLIDE";
             }else if(this.U.getNasaSlideParam().isFromNewsEntrance() || this.U.getNasaSlideParam().mIsNewsSlideNasaDetail != null){
                PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "11");
                return "NEWS_SLIDE";
             }else if(this.U.getNasaSlideParam().isTrendingPage()){
                PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "11");
                return "POPULAR_PAGE";
             }else if(this.U.getNasaSlideParam().isFollowNasaDetail()){
                PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "11");
                return o.i(i);
             }else if(this.U.getNasaSlideParam().enableDecSearchPage()){
                PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "11");
                return o.i(i);
             }else if(this.U.getNasaSlideParam().mNasaCollectionSlideParam != null && this.U.getNasaSlideParam().mNasaCollectionSlideParam.isHealthyType()){
                PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "11");
                return "HEALTH_FEATURED_DETAIL";
             }else if(this.U.getNasaSlideParam().isDetailPage()){
                PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "11");
                return "FEATURED_DETAIL";
             }else {
                PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "11");
                return super.o();
             }
          }
       }
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaGrootHorizontalDetailVMFragment.class, "2")) {
          return;
       }
       s.a(this.getActivity(), this.I);
       super.onActivityCreated(p0);
       PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "2");
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaGrootHorizontalDetailVMFragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       this.X = f.h(this.getActivity().getIntent());
       this.U = a.a(this.ch());
       p0.V = this.getActivity();
       p0.W = this;
       PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "3");
       return;
    }
    public void uh(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaGrootHorizontalDetailVMFragment.class, "19")) {
          return;
       }
       if (!f.v()) {
          PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "19");
          return;
       }else if(this.getActivity() != null && (f.b(this.getActivity()) && this.getActivity().getIntent() != null)){
          boolean b = (b.f.equals(c.b(this.getActivity()).f(this.getActivity().getIntent())) && this.U.getNasaSlideParam().isHomeFeatureStyle())? true: false;
          if (b) {
             this.J.S3.onNext(Boolean.TRUE);
          }
          this.F.c.u0(b);
       }
    label_0073 :
       PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "19");
       return;
    }
    public void xh(MainThreadScatterPresenterGroup p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaGrootHorizontalDetailVMFragment.class, "12")) {
          return;
       }
       a.a(p0, this, this.Oh(), this.I, this.U, this.V);
       w0.a(this.I, this.U, p0);
       a.a(this.x, this.U, p0);
       PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "12");
       return;
    }
    public void yh(MainThreadScatterPresenterGroup p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaGrootHorizontalDetailVMFragment.class, "13")) {
          return;
       }
       if (!c.b() && (this.V.i().b() || LandscapeUtil.b())) {
          p0.a(new c());
       }
       PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "13");
       return;
    }
    public void zh(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaGrootHorizontalDetailVMFragment.class, "4")) {
          return;
       }
       super.zh();
       this.F.b1(a.a(this.getActivity(), this, this.x, this.U, this.J, this.K), new b(this));
       PatchProxy.onMethodExit(NasaGrootHorizontalDetailVMFragment.class, "4");
       return;
    }
}
