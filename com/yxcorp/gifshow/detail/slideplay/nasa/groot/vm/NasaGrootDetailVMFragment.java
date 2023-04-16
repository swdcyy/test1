package com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootDetailVMFragment;
import h6a.a;
import im8.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayPhotoDetailVMFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import v6a.o0;
import v6a.z7;
import v6a.m0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.a;
import msd.l;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import android.view.View;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.activity.GifshowActivity;
import qp7.t0;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import com.kwai.slide.play.detail.base.PageType;
import w6a.a;
import w6a.n;
import jh5.a;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import java.util.List;
import com.kwai.slide.play.detail.base.BasePage;
import java.util.Objects;
import com.yxcorp.gifshow.action.RealActionBizType;
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
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import of5.p;
import android.widget.RelativeLayout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import d6a.r;
import tkd.b;
import tkd.d;
import gp5.c;
import com.kwai.library.slide.base.exp.SlidePerformanceExp;
import com.kuaishou.ax2c.AX2C;
import android.content.Context;
import i2b.a;
import ix6.c;
import java.lang.Boolean;
import o56.f;
import android.content.Intent;
import on5.b;
import lo5.a;
import ko5.c;
import com.kwai.kcube.TabIdentifier;
import hn5.n;
import hn5.m;
import x1a.a$a;
import com.yxcorp.gifshow.nasa.NasaCollectionSlideParam;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import c7a.a;
import c7a.d;
import h6a.d0;
import java.util.Map;
import java.util.HashMap;
import java.lang.Number;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import uh5.e;
import xpb.a;
import com.kwai.framework.model.user.UserStatus;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.QCurrentUser;
import hv5.a;
import mv5.b;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kwai.framework.model.commonfeedslide.CommonFeedSlideParams;
import m0a.a;
import android.os.Bundle;
import m9a.s;
import vm5.f;
import dw6.b;
import hx6.a;
import le5.f;
import io.reactivex.subjects.PublishSubject;
import com.smile.gifmaker.mvps.presenter.MainThreadScatterPresenterGroup;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.a;
import g7a.w0;
import f7a.e;
import kotlin.jvm.internal.a;
import f7a.c;
import h7a.a;
import wh5.c;
import z85.a;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeUtil;
import d5a.c;

public class NasaGrootDetailVMFragment extends SlidePlayPhotoDetailVMFragment implements a, g	// class@001727
{
    public a U0;
    public a V0;
    public boolean W0;
    public boolean X0;
    public NasaBizParam Z;
    public static final int Y0;

    public void NasaGrootDetailVMFragment(){
       super();
       this.W0 = false;
       this.X0 = false;
    }
    public void Ah(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaGrootDetailVMFragment.class, "7")) {
          return;
       }
       super.Ah();
       this.F.b1(a.a(this.getActivity(), this, this.K, this.Z, this.N, this.O), new a(this));
       PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "7");
       return;
    }
    public void Bh(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaGrootDetailVMFragment.class, "3")) {
          return;
       }
       SlidePlayPhotoDetailVMFragment tF = this.F;
       FragmentActivity activity = (this.getActivity() != null)? this.getActivity(): n.d(this.j);
       tF.V = activity;
       this.F.W = this;
       PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "3");
       return;
    }
    public t0 Ch(){
       Object[] objArray = null;
       SlidePageConfig slidePageCon = PatchProxy.applyWithListener(objArray, this, NasaGrootDetailVMFragment.class, "8");
       if (slidePageCon != PatchProxyResult.class) {
       }else {
          a uoa = n.a(this, n.d(this.j), PageType.VIDEO, this.Z, this.K);
          this.V0 = uoa;
          slidePageCon = uoa.c();
          this.F.e(this.V0.e(this.sh()));
          this.sh();
          Objects.requireNonNull(this.V0);
          this.F.i(objArray);
          this.F.c(this.V0.d(this.sh()));
          PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "8");
       }
       return slidePageCon;
    }
    public void Dh(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaGrootDetailVMFragment.class, "6")) {
          return;
       }
       super.Dh();
       SlidePlayPhotoDetailVMFragment tN = this.N;
       tN.L2 = RealActionBizType.FEATURED;
       tN.o2 = new f8(this.K, this, this.N.C1);
       PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "6");
       return;
    }
    public void Eh(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaGrootDetailVMFragment.class, "20")) {
          return;
       }
       if (this.U0 == null) {
          this.U0 = DetailParamCreator.a(true, this.K, this.Z).b();
       }
       a.a.a(this.U0);
       PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "20");
       return;
    }
    public BasePage Fh(){
       SlidePage slidePage = PatchProxy.applyWithListener(null, this, NasaGrootDetailVMFragment.class, "2");
       if (slidePage != PatchProxyResult.class) {
       }else {
          slidePage = new SlidePage(PageType.VIDEO, this.sh());
          PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "2");
       }
       return slidePage;
    }
    public CommentPageListConfig Ih(){
       Object obj = PatchProxy.applyWithListener(null, this, NasaGrootDetailVMFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "18");
       return d.b(this.L);
    }
    public PresenterV2 Jh(){
       c obj = PatchProxy.applyWithListener(null, this, NasaGrootDetailVMFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new c(this, this.Yh());
       if (this.Z.getNasaSlideParam().isHomeFeatureStyle()) {
          obj.U7(new p());
       }
       PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "19");
       return obj;
    }
    public RelativeLayout Kh(View p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, NasaGrootDetailVMFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "9");
       return p0.findViewById(0x7f0a3a43);
    }
    public View Nh(LayoutInflater p0,ViewGroup p1){
       Object obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, NasaGrootDetailVMFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = r.b();
       View view = d.a(-87665878).ag(i);
       if (view == null || !this.Z.getNasaSlideParam().isHomeFeatureStyle()) {
          view = (SlidePerformanceExp.g())? new AX2C(p0.getContext()).inflateSync(i, p1, false): a.g(p0, i, p1, false);
       }
    label_0047 :
       c.e(view);
       PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "10");
       return view;
    }
    public boolean Qh(){
       Object obj = PatchProxy.applyWithListener(null, this, NasaGrootDetailVMFragment.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.getActivity() != null && (f.b(this.getActivity()) && this.getActivity().getIntent() != null)) {
          if (b.f.equals(c.b(this.getActivity()).f(this.getActivity().getIntent())) && (this.Z.getNasaSlideParam().isHomeFeatureStyle() && m.a().Ys())) {
             b = true;
          }
       label_0062 :
          PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "23");
          return b;
       }else {
          PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "23");
          return b;
       }
    }
    public void Vh(a$a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaGrootDetailVMFragment.class, "15")) {
          return;
       }
       if (this.Z.getNasaSlideParam().mNasaCollectionSlideParam != null && this.Z.getNasaSlideParam().mNasaCollectionSlideParam.isHealthyType()) {
          p0.d(this.Z.getNasaSlideParam().mNasaCollectionSlideParam.mFrom);
       }
       PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "15");
       return;
    }
    public final void Xh(StringBuilder p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, this, NasaGrootDetailVMFragment.class, "14")) {
          return;
       }
       if (!TextUtils.x(p1) && !TextUtils.x(p2)) {
          p0 = p0+"&"+p1+"="+p2;
       }
       PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "14");
       return;
    }
    public final b Yh(){
       a uoa;
       SlidePlayPhotoDetailVMFragment obj = PatchProxy.applyWithListener(null, this, NasaGrootDetailVMFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.K;
       if (obj != null) {
          PhotoDetailParam mPhoto = obj.mPhoto;
          if (mPhoto != null) {
             uoa = new a(mPhoto);
          label_0023 :
             PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "21");
             return uoa;
          }
       }
       uoa = new d();
       goto label_0023 ;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, NasaGrootDetailVMFragment.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "24");
          return new d0();
       }else {
          PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "24");
          return null;
       }
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefsWithListener(p0, this, NasaGrootDetailVMFragment.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(NasaGrootDetailVMFragment.class, new d0());
       }else {
          obj.put(NasaGrootDetailVMFragment.class, null);
       }
       PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "25");
       return obj;
    }
    public int getPage(){
       NasaGrootDetailVMFragment obj = PatchProxy.applyWithListener(null, this, NasaGrootDetailVMFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (VisitorModeManager.f()) {
          PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "11");
          return i;
       }else {
          obj = this.Z;
          if (obj == null || obj.getNasaSlideParam() == null) {
             PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "11");
             return i;
          }else if(this.Z.getNasaSlideParam().mIsMusicRadio != null){
             PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "11");
             return i;
          }else if(!e.f()){
             if (this.Z.getNasaSlideParam().enableDecSearchPage()) {
                PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "11");
                return 7;
             }else if(this.Z.getNasaSlideParam().isDetailPage() || this.Z.getNasaSlideParam().isChannelPage()){
                PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "11");
                return i;
             }else if(this.Z.getNasaSlideParam().isFromNearby()){
                PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "11");
                return 7;
             }else if(this.Z.getNasaSlideParam().isFollowNasaDetail()){
                PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "11");
                return 7;
             }else if(this.Z.getNasaSlideParam().isFromTube()){
                PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "11");
                return 319;
             }else if(this.Z.getNasaSlideParam().isTrendingPage()){
                PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "11");
                return i;
             }else {
                PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "11");
                return 0x7d42;
             }
          }else if(this.Z.getNasaSlideParam().isFromNewsEntrance() || this.Z.getNasaSlideParam().isTrendingPage()){
             PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "11");
             return i;
          }else {
             PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "11");
             return 7;
          }
       }
    }
    public String getPageParams(){
       SlidePlayPhotoDetailVMFragment tL;
       StringBuilder obj = PatchProxy.applyWithListener(null, this, NasaGrootDetailVMFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getPageParams();
       int i = 0x513becbe;
       if (d.a(i).uQ(this.getActivity())) {
          this.Xh(obj, "tab_id", d.a(i).Q2());
       }
       NasaGrootDetailVMFragment tZ = this.Z;
       if (tZ == null || tZ.getNasaSlideParam() == null) {
          PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "13");
          return obj;
       }else if(this.Z.getNasaSlideParam().mIsUserStatusNasaDetail != null){
          tL = this.L;
          if (tL != null) {
             if (tL.getUserStatus() != null && !TextUtils.x(this.L.getUserStatus().mId)) {
                this.Xh(obj, "mood_id", this.L.getUserStatus().mId);
             }
             if (this.L.getUser() != null && QCurrentUser.me().isLogined()) {
                this.Xh(obj, "visited_user_id", QCurrentUser.me().getId());
             }
          }
       }else if(("FEATURED_PAGE").equals(this.o())){
          this.Xh(obj, "is_page_loading", "FALSE");
       }
       if (this.Z.getNasaSlideParam().mIsFollowSlideNasaDetail != null) {
          obj = obj+d.a(0x6c2883df).wL();
       }
       if (this.Z.getNasaSlideParam().isFriendPage()) {
          obj = obj+d.a(0x3ee97dc2).v40();
          tL = this.L;
          if (tL != null) {
             QPhoto mEntity = tL.mEntity;
             if (mEntity != null && r1.x2(mEntity)) {
                i = 2;
             }else {
             label_00ef :
                tL = this.L;
                i = (tL != null && (tL.mEntity != null && tL.isPrefetch()))? 1: 0;
             }
          }else {
             goto label_00ef ;
          }
          this.Xh(obj, "photo_load_type", String.valueOf(i));
       }
       PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "13");
       return obj;
    }
    public String o(){
       NasaGrootDetailVMFragment obj = PatchProxy.applyWithListener(null, this, NasaGrootDetailVMFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (VisitorModeManager.f()) {
          PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "12");
          return "SINGLE_FEED_VISITOR_MODE_PAGE";
       }else {
          obj = this.Z;
          if (obj == null || obj.getNasaSlideParam() == null) {
             PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "12");
             return super.o();
          }else if(this.Z.getNasaSlideParam().mIsMusicRadio != null && (this.getActivity() != null && d.a(0x513becbe).uQ(this.getActivity()))){
             PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "12");
             return "MUSIC_DETAIL";
          }else if(this.Z.getNasaSlideParam().isNebulaFindPage()){
             PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "12");
             return super.o();
          }else if(this.Z.getNasaSlideParam().mIsFollowSlideNasaDetail != null){
             PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "12");
             return "FOLLOW";
          }else if(this.Z.getNasaSlideParam().mIsFriendsNasaDetail != null){
             PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "12");
             return "FRIENDS";
          }else if(this.Z.getNasaSlideParam().isFromIMMessage()){
             PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "12");
             return "MESSAGE_SLIDE";
          }else if(this.Z.getNasaSlideParam().isFromNewsEntrance() || this.Z.getNasaSlideParam().mIsNewsSlideNasaDetail != null){
             PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "12");
             return "NEWS_SLIDE";
          }else if(this.Z.getNasaSlideParam().isTrendingPage()){
             PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "12");
             return "POPULAR_PAGE";
          }else {
             String str = "DETAIL";
             if (this.Z.getNasaSlideParam().enableDecSearchPage()) {
                PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "12");
                return str;
             }else if(this.Z.getNasaSlideParam().mHomeCommonFeedSlideParams != null){
                if (!TextUtils.x(this.Z.getNasaSlideParam().mHomeCommonFeedSlideParams.mPage2)) {
                   PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "12");
                   return this.Z.getNasaSlideParam().mHomeCommonFeedSlideParams.mPage2;
                }else {
                   PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "12");
                   return str;
                }
             }else if(this.Z.getNasaSlideParam().isFollowNasaDetail()){
                PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "12");
                return str;
             }else if(this.Z.getNasaSlideParam().isCommonFeedSlidePage()){
                if (this.getActivity() != null && this.getActivity().getIntent() != null) {
                   CommonFeedSlideParams uCommonFeedS = a.b(this.getActivity().getIntent());
                   if (uCommonFeedS != null) {
                      uCommonFeedS = uCommonFeedS.mPage2;
                      if (uCommonFeedS != null) {
                         PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "12");
                         return uCommonFeedS;
                      }
                   }
                }
                PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "12");
                return str;
             }else if(this.Z.getNasaSlideParam().isFromNearby()){
                PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "12");
                return str;
             }else if(this.Z.getNasaSlideParam().mIsUserStatusNasaDetail != null){
                PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "12");
                return "MOOD_STATUS_DETAIL";
             }else if(this.Z.getNasaSlideParam().mNasaCollectionSlideParam != null && this.Z.getNasaSlideParam().mNasaCollectionSlideParam.isHealthyType()){
                PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "12");
                return "HEALTH_FEATURED_DETAIL";
             }else if(this.Z.getNasaSlideParam().isDetailPage()){
                PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "12");
                return "FEATURED_DETAIL";
             }else if(this.Z.getNasaSlideParam().isChannelPage()){
                PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "12");
                return "COLLECTION_LIST_PAGE";
             }else if(this.Z.getNasaSlideParam().isFromTube()){
                PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "12");
                return "TUBE_DETAIL";
             }else {
                PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "12");
                return super.o();
             }
          }
       }
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaGrootDetailVMFragment.class, "4")) {
          return;
       }
       s.a(this.getActivity(), this.K);
       super.onActivityCreated(p0);
       PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "4");
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaGrootDetailVMFragment.class, "5")) {
          return;
       }
       super.onCreate(p0);
       this.W0 = f.h(this.getActivity().getIntent());
       this.Z = a.a(this.ch());
       this.M = this.Qh();
       PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "5");
       return;
    }
    public void uh(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaGrootDetailVMFragment.class, "22")) {
          return;
       }
       if (!f.v()) {
          PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "22");
          return;
       }else if(this.getActivity() != null && (f.b(this.getActivity()) && this.getActivity().getIntent() != null)){
          boolean b = (b.f.equals(c.b(this.getActivity()).f(this.getActivity().getIntent())) && this.Z.getNasaSlideParam().isHomeFeatureStyle())? true: false;
          if (b) {
             this.N.S3.onNext(Boolean.TRUE);
          }
          this.F.c.u0(b);
       }
    label_0073 :
       PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "22");
       return;
    }
    public void yh(MainThreadScatterPresenterGroup p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaGrootDetailVMFragment.class, "16")) {
          return;
       }
       a.a(p0, this, this.Yh(), this.K, this.Z, this.U0);
       w0.a(this.K, this.Z, p0);
       if (!PatchProxy.applyVoidOneRefs(p0, null, e.class, "1")) {
          a.p(p0, "presenterGroup");
          p0.a(new c());
       }
       a.a(this.K, this.Z, p0);
       PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "16");
       return;
    }
    public void zh(MainThreadScatterPresenterGroup p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaGrootDetailVMFragment.class, "17")) {
          return;
       }
       if (!c.b() && (this.U0.i().b() || LandscapeUtil.b())) {
          p0.a(new c());
       }
       PatchProxy.onMethodExit(NasaGrootDetailVMFragment.class, "17");
       return;
    }
}
