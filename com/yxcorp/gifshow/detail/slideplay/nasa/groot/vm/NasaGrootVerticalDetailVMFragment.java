package com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootVerticalDetailVMFragment;
import im8.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayVerticalPhotosVMFragment;
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
import h6a.y1;
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
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.s;
import brd.t;
import t45.d;
import brd.z;
import h6a.k1;
import erd.g;
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
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.c;
import msd.l;

public final class NasaGrootVerticalDetailVMFragment extends SlidePlayVerticalPhotosVMFragment implements g	// class@001729
{
    public b U0;
    public NasaBizParam V;
    public a W;
    public a X;
    public boolean Y;
    public boolean Z;
    public static final int V0;

    public void NasaGrootVerticalDetailVMFragment(){
       super();
       this.Y = false;
       this.Z = false;
    }
    public t0 Ah(){
       Object[] objArray = null;
       SlidePageConfig slidePageCon = PatchProxy.applyWithListener(objArray, this, NasaGrootVerticalDetailVMFragment.class, "8");
       if (slidePageCon != PatchProxyResult.class) {
       }else {
          a uoa = n.a(this, n.d(this.j), PageType.LONG_PIC, this.V, this.K);
          this.X = uoa;
          slidePageCon = uoa.c();
          this.F.e(this.X.e(this.sh()));
          this.sh();
          Objects.requireNonNull(this.X);
          this.F.i(objArray);
          this.F.c(this.X.d(this.sh()));
          PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "8");
       }
       return slidePageCon;
    }
    public void Bh(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaGrootVerticalDetailVMFragment.class, "18")) {
          return;
       }
       super.Bh();
       this.L.L2 = RealActionBizType.FEATURED;
       PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "18");
       return;
    }
    public void Ch(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaGrootVerticalDetailVMFragment.class, "20")) {
          return;
       }
       if (this.W == null) {
          this.W = DetailParamCreator.a(true, this.K, this.V).b();
       }
       a.a.a(this.W);
       PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "20");
       return;
    }
    public BasePage Dh(){
       SlidePage slidePage = PatchProxy.applyWithListener(null, this, NasaGrootVerticalDetailVMFragment.class, "1");
       if (slidePage != PatchProxyResult.class) {
       }else {
          slidePage = new SlidePage(PageType.LONG_PIC, this.sh());
          PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "1");
       }
       return slidePage;
    }
    public CommentPageListConfig Eh(){
       Object obj = PatchProxy.applyWithListener(null, this, NasaGrootVerticalDetailVMFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "17");
       return d.b(this.O);
    }
    public PresenterV2 Fh(){
       c obj = PatchProxy.applyWithListener(null, this, NasaGrootVerticalDetailVMFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new c(this, this.Ph());
       if (this.V.getNasaSlideParam().isHomeFeatureStyle()) {
          obj.U7(new p());
       }
       PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "19");
       return obj;
    }
    public RelativeLayout Gh(View p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, NasaGrootVerticalDetailVMFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "9");
       return p0.findViewById(0x7f0a3a43);
    }
    public View Jh(LayoutInflater p0,ViewGroup p1){
       Object obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, NasaGrootVerticalDetailVMFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (SlidePerformanceExp.g()) {
          PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "10");
          return new AX2C(p0.getContext()).inflateSync(r.d(), p1, false);
       }else {
          PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "10");
          return a.g(p0, r.d(), p1, false);
       }
    }
    public void Nh(a$a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaGrootVerticalDetailVMFragment.class, "14")) {
          return;
       }
       if (this.V.getNasaSlideParam().mNasaCollectionSlideParam != null && this.V.getNasaSlideParam().mNasaCollectionSlideParam.isHealthyType()) {
          p0.d(this.V.getNasaSlideParam().mNasaCollectionSlideParam.mFrom);
       }
       PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "14");
       return;
    }
    public final b Ph(){
       Object obj = PatchProxy.applyWithListener(null, this, NasaGrootVerticalDetailVMFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "21");
       return new a(this.K.mPhoto);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, NasaGrootVerticalDetailVMFragment.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "23");
          return new y1();
       }else {
          PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "23");
          return null;
       }
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefsWithListener(p0, this, NasaGrootVerticalDetailVMFragment.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(NasaGrootVerticalDetailVMFragment.class, new y1());
       }else {
          obj.put(NasaGrootVerticalDetailVMFragment.class, null);
       }
       PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "24");
       return obj;
    }
    public int getPage(){
       NasaGrootVerticalDetailVMFragment obj = PatchProxy.applyWithListener(null, this, NasaGrootVerticalDetailVMFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (VisitorModeManager.f()) {
          PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "11");
          return i;
       }else {
          obj = this.V;
          if (obj == null || obj.getNasaSlideParam() == null) {
             PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "11");
             return i;
          }else if(this.V.getNasaSlideParam().mIsMusicRadio != null){
             PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "11");
             return i;
          }else if(this.V.getNasaSlideParam().enableDecSearchPage()){
             PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "11");
             return 7;
          }else if(this.V.getNasaSlideParam().isDetailPage()){
             PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "11");
             return i;
          }else if(this.V.getNasaSlideParam().isFromNearby()){
             PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "11");
             return 7;
          }else if(this.V.getNasaSlideParam().isFollowNasaDetail()){
             PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "11");
             return 7;
          }else if(this.V.getNasaSlideParam().isTrendingPage()){
             PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "11");
             return i;
          }else {
             PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "11");
             return 0x7d42;
          }
       }
    }
    public String getPageParams(){
       String str2;
       int i1;
       String obj = PatchProxy.applyWithListener(null, this, NasaGrootVerticalDetailVMFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0x513becbe;
       String str = "";
       obj = (d.a(i).uQ(this.getActivity()))? "&tab_id="+d.a(i).Q2(): str;
       String str1 = (this.V.getNasaSlideParam().mIsFollowSlideNasaDetail != null)? d.a(0x6c2883df).wL(): str;
       if (this.V.getNasaSlideParam().isFriendPage()) {
          str2 = d.a(0x3ee97dc2).v40();
          SlidePlayVerticalPhotosVMFragment tO = this.O;
          if (tO != null) {
             QPhoto mEntity = tO.mEntity;
             if (mEntity != null && r1.x2(mEntity)) {
                i1 = 2;
             }else {
             label_0084 :
                tO = this.O;
                i1 = (tO != null && (tO.mEntity != null && tO.isPrefetch()))? 1: 0;
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
       PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "13");
       return str3+str+obj;
    }
    public String o(){
       NasaGrootVerticalDetailVMFragment obj = PatchProxy.applyWithListener(null, this, NasaGrootVerticalDetailVMFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (VisitorModeManager.f()) {
          PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "12");
          return "SINGLE_FEED_VISITOR_MODE_PAGE";
       }else {
          obj = this.V;
          if (obj == null || obj.getNasaSlideParam() == null) {
             PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "12");
             return super.o();
          }else if(this.V.getNasaSlideParam().mIsMusicRadio != null && (this.getActivity() != null && d.a(0x513becbe).uQ(this.getActivity()))){
             PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "12");
             return "MUSIC_DETAIL";
          }else if(this.V.getNasaSlideParam().mHomeCommonFeedSlideParams != null){
             if (!TextUtils.x(this.V.getNasaSlideParam().mHomeCommonFeedSlideParams.mPage2)) {
                PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "12");
                return this.V.getNasaSlideParam().mHomeCommonFeedSlideParams.mPage2;
             }else {
                PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "12");
                return "DETAIL";
             }
          }else {
             int i = 7;
             if (this.V.getNasaSlideParam().isFromNearby()) {
                PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "12");
                return o.i(i);
             }else if(this.V.getNasaSlideParam().mIsFriendsNasaDetail != null){
                PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "12");
                return "FRIENDS";
             }else if(this.V.getNasaSlideParam().isFromIMMessage()){
                PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "12");
                return "MESSAGE_SLIDE";
             }else if(this.V.getNasaSlideParam().isFromNewsEntrance() || this.V.getNasaSlideParam().mIsNewsSlideNasaDetail != null){
                PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "12");
                return "NEWS_SLIDE";
             }else if(this.V.getNasaSlideParam().isFollowNasaDetail()){
                PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "12");
                return o.i(i);
             }else if(this.V.getNasaSlideParam().isTrendingPage()){
                PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "12");
                return "POPULAR_PAGE";
             }else if(this.V.getNasaSlideParam().enableDecSearchPage()){
                PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "12");
                return o.i(i);
             }else if(this.V.getNasaSlideParam().mNasaCollectionSlideParam != null && this.V.getNasaSlideParam().mNasaCollectionSlideParam.isHealthyType()){
                PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "12");
                return "HEALTH_FEATURED_DETAIL";
             }else if(this.V.getNasaSlideParam().isDetailPage()){
                PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "12");
                return "FEATURED_DETAIL";
             }else {
                PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "12");
                return super.o();
             }
          }
       }
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaGrootVerticalDetailVMFragment.class, "2")) {
          return;
       }
       s.a(this.getActivity(), this.K);
       super.onActivityCreated(p0);
       PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "2");
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaGrootVerticalDetailVMFragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       this.Y = f.h(this.getActivity().getIntent());
       this.V = a.a(this.ch());
       p0.V = this.getActivity();
       p0.W = this;
       PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "3");
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaGrootVerticalDetailVMFragment.class, "6")) {
          return;
       }
       super.onDestroyView();
       b9.a(this.U0);
       PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "6");
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, NasaGrootVerticalDetailVMFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.U0 = RxBus.f.f(s.class).observeOn(d.a).subscribe(new k1(this));
       PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "4");
       return;
    }
    public void uh(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaGrootVerticalDetailVMFragment.class, "22")) {
          return;
       }
       if (!f.v()) {
          PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "22");
          return;
       }else if(this.getActivity() != null && (f.b(this.getActivity()) && this.getActivity().getIntent() != null)){
          boolean b = (b.f.equals(c.b(this.getActivity()).f(this.getActivity().getIntent())) && this.V.getNasaSlideParam().isHomeFeatureStyle())? true: false;
          if (b) {
             this.L.S3.onNext(Boolean.TRUE);
          }
          this.F.c.u0(b);
       }
    label_0073 :
       PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "22");
       return;
    }
    public void xh(MainThreadScatterPresenterGroup p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaGrootVerticalDetailVMFragment.class, "15")) {
          return;
       }
       a.a(p0, this, this.Ph(), this.K, this.V, this.W);
       w0.a(this.K, this.V, p0);
       a.a(this.K, this.V, p0);
       PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "15");
       return;
    }
    public void yh(MainThreadScatterPresenterGroup p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaGrootVerticalDetailVMFragment.class, "16")) {
          return;
       }
       if (!c.b() && (this.W.i().b() || LandscapeUtil.b())) {
          p0.a(new c());
       }
       PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "16");
       return;
    }
    public void zh(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaGrootVerticalDetailVMFragment.class, "7")) {
          return;
       }
       super.zh();
       this.F.b1(a.a(this.getActivity(), this, this.K, this.V, this.L, this.M), new c(this));
       PatchProxy.onMethodExit(NasaGrootVerticalDetailVMFragment.class, "7");
       return;
    }
}
