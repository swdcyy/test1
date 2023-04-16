package com.yxcorp.gifshow.relation.feed.model.GrootPymkCardDetailSlidePlayFragment;
import nac.a;
import im8.g;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.ReplaySubject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f7c.d;
import a7c.h;
import com.yxcorp.gifshow.pymk.f;
import gac.b;
import java.util.Objects;
import java.lang.Integer;
import com.yxcorp.gifshow.pymk.log.h;
import g7c.a;
import com.yxcorp.gifshow.pymk.log.PymkLogSender;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import com.kwai.robust.PatchProxyResult;
import oac.d;
import java.util.Map;
import java.util.HashMap;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.relation.feed.model.PymkRecoBigCardFeed;
import tl8.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.relation.feed.model.PymkBigCardUserMeta;
import com.yxcorp.gifshow.relation.feed.model.PymkExtParam;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import hcc.j;
import hcc.j$a;
import a7c.h$a;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import ok.x;
import oac.a;
import oac.b;
import oac.c;
import dw6.b;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import hx6.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import le5.f;
import android.content.Context;
import android.content.res.Resources;
import cw9.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import y8c.g;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import qvb.i;
import androidx.recyclerview.widget.RecyclerView$l;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import fac.c;
import com.yxcorp.gifshow.relation.explore.view.StackLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import bac.h;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.m$e;
import pac.p;
import com.yxcorp.gifshow.relation.feed.presenter.FeedBigCardStatePresenter;
import com.yxcorp.gifshow.relation.feed.presenter.f;
import com.yxcorp.gifshow.relation.explore.presenter.p;
import com.yxcorp.gifshow.relation.explore.presenter.FeedPymkVideoPlayPresenter;
import com.yxcorp.gifshow.relation.feed.presenter.a;
import fac.b;
import java.util.List;
import qvb.a;
import bac.f0;
import im8.c;
import bac.i;
import com.yxcorp.gifshow.relation.explore.presenter.n;

public class GrootPymkCardDetailSlidePlayFragment extends DetailSlidePlayFragment implements a, g	// class@001890
{
    public b F;
    public PymkRecoBigCardFeed G;
    public PublishSubject H;
    public PublishSubject I;
    public PublishSubject J;
    public PublishSubject K;
    public PublishSubject L;
    public h M;
    public PresenterV2 N;
    public NasaBizParam O;
    public c P;
    public ReplaySubject Q;
    public boolean R;
    public int S;
    public boolean T;
    public g U;
    public static final int V;

    public void GrootPymkCardDetailSlidePlayFragment(){
       super();
       this.I = PublishSubject.g();
       this.J = PublishSubject.g();
       this.K = PublishSubject.g();
       this.L = PublishSubject.g();
       this.Q = ReplaySubject.g();
       this.S = 0;
    }
    public void H2(){
       if (PatchProxy.applyVoid(null, this, GrootPymkCardDetailSlidePlayFragment.class, "16")) {
          return;
       }
       this.mh();
       return;
    }
    public void N2(){
       if (PatchProxy.applyVoid(null, this, GrootPymkCardDetailSlidePlayFragment.class, "17")) {
          return;
       }
       this.ph();
       return;
    }
    public void Q0(){
       if (PatchProxy.applyVoid(null, this, GrootPymkCardDetailSlidePlayFragment.class, "15")) {
          return;
       }
       this.R = false;
       this.oh();
       if (this.F != null) {
          d uod = this.M.u();
          GrootPymkCardDetailSlidePlayFragment tF = this.F;
          f r = tF.r;
          String str = tF.m2();
          int i = this.xh();
          Objects.requireNonNull(uod);
          if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(r), str, Integer.valueOf(i), uod, d.class, "18")) {
             uod = uod.d;
             Objects.requireNonNull(uod);
             if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(r), str, Integer.valueOf(i), uod, h.class, "29")) {
                PymkLogSender.reportPolicy(15, r, str, uod.h);
             }
          }
       }
       return;
    }
    public void Q1(){
       if (PatchProxy.applyVoid(null, this, GrootPymkCardDetailSlidePlayFragment.class, "13")) {
          return;
       }
       this.R = true;
       this.nh();
       if (this.F != null) {
          d uod = this.M.u();
          GrootPymkCardDetailSlidePlayFragment tF = this.F;
          f r = tF.r;
          String str = tF.m2();
          int i = this.xh();
          Objects.requireNonNull(uod);
          if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(r), str, Integer.valueOf(i), uod, d.class, "17")) {
             uod = uod.d;
             Objects.requireNonNull(uod);
             if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(r), str, Integer.valueOf(i), uod, h.class, "28")) {
                PymkLogSender.reportPolicy(14, r, str, uod.h);
             }
          }
       }
       return;
    }
    public boolean V(){
       return this.R;
    }
    public boolean Xg(){
       return false;
    }
    public SlidePlayLogger d1(){
       return null;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrootPymkCardDetailSlidePlayFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("injector")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, GrootPymkCardDetailSlidePlayFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("injector")) {
          obj.put(GrootPymkCardDetailSlidePlayFragment.class, new d());
       }else {
          obj.put(GrootPymkCardDetailSlidePlayFragment.class, null);
       }
       return obj;
    }
    public String getUrl(){
       return "ks://photo";
    }
    public void nh(){
       if (PatchProxy.applyVoid(null, this, GrootPymkCardDetailSlidePlayFragment.class, "14")) {
          return;
       }
       super.nh();
       this.zh();
       return;
    }
    public String o(){
       DetailSlidePlayFragment obj = PatchProxy.apply(null, this, GrootPymkCardDetailSlidePlayFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (VisitorModeManager.f()) {
          return "SINGLE_FEED_VISITOR_MODE_PAGE";
       }
       obj = this.x;
       if (obj != null) {
          PhotoDetailParam mPhoto = obj.mPhoto;
          if (mPhoto != null) {
             PymkRecoBigCardFeed pymkRecoBigC = mPhoto.getEntity().a(PymkRecoBigCardFeed.class);
             if (!TextUtils.x(pymkRecoBigC.mCustomPageLogName)) {
                return pymkRecoBigC.mCustomPageLogName;
             }else if((pymkRecoBigC.mRecommendUserMeta.mPymkExtParam.pageType).equals("follower")){
                return "FOLLOW";
             }else if((pymkRecoBigC.mRecommendUserMeta.mPymkExtParam.pageType).equals("friendTab")){
                return "FRIENDS";
             }else if((pymkRecoBigC.mRecommendUserMeta.mPymkExtParam.pageType).equals("selection")){
                return "FEATURED_PAGE";
             }else if((pymkRecoBigC.mRecommendUserMeta.mPymkExtParam.pageType).equals("hot") || this.O.getNasaSlideParam().isNebulaFindPage()){
                return "THANOS_FIND";
             }
          }
       }
       return super.o();
    }
    public void onActivityCreated(Bundle p0){
       GrootPymkCardDetailSlidePlayFragment tG1;
       PymkRecoBigCardFeed mRecommendUs;
       PymkBigCardUserMeta mPymkExtPara;
       PymkExtParam mPrsid;
       if (PatchProxy.applyVoidOneRefs(p0, this, GrootPymkCardDetailSlidePlayFragment.class, "8")) {
          return;
       }
       super.onActivityCreated(p0);
       PhotoDetailParam photoDetailP = this.rh();
       if (photoDetailP == null || (photoDetailP.mPhoto != null && this.getActivity() != null)) {
          PymkRecoBigCardFeed pymkRecoBigC = this.x.mPhoto.getEntity().a(PymkRecoBigCardFeed.class);
          this.G = pymkRecoBigC;
          this.S = j.c.e(pymkRecoBigC);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, GrootPymkCardDetailSlidePlayFragment.class, "10")) {
             this.H = PublishSubject.g();
          }
          GrootPymkCardDetailSlidePlayFragment tG = this.G;
          PymkExtParam pymkExtParam = null;
          if (tG != null) {
             pymkRecoBigC = tG.mPymkPageList;
             if (pymkRecoBigC != null) {
             label_006b :
                this.F = pymkRecoBigC;
                pymkRecoBigC.r2(1);
                tG = this.F;
                tG1 = this.G;
                if (tG1 != null) {
                   mRecommendUs = tG1.mRecommendUserMeta;
                   if (mRecommendUs != null) {
                      mPymkExtPara = mRecommendUs.mPymkExtParam;
                      if (mPymkExtPara != null) {
                         mPrsid = mPymkExtPara.mPrsid;
                      label_0084 :
                         Objects.requireNonNull(tG);
                         if (!PatchProxy.applyVoidOneRefs(mPrsid, tG, b.class, "9")) {
                            tG.G = TextUtils.k(mPrsid);
                         }
                         h oh = PatchProxy.apply(objArray, this, GrootPymkCardDetailSlidePlayFragment.class, "19");
                         if (oh != PatchProxyResult.class) {
                         }else {
                            tG = this.G;
                            if (tG != null) {
                               pymkRecoBigC = tG.mRecommendUserMeta;
                               if (pymkRecoBigC != null) {
                                  PymkBigCardUserMeta mPymkExtPara1 = pymkRecoBigC.mPymkExtParam;
                                  if (mPymkExtPara1 != null) {
                                     pymkExtParam = mPymkExtPara1.followStack;
                                  }
                               }
                            }
                            h$a uoa = new h$a(objArray, this.F, this.m()).l(objArray);
                            uoa.a(new a(this));
                            uoa.f(new b(this));
                            uoa.m(new c(this));
                            uoa.i(pymkExtParam);
                            oh = uoa.b();
                         }
                         this.M = oh;
                         this.qh();
                         this.zh();
                      }
                   }
                }
                mPrsid = "";
                goto label_0084 ;
             }
          }
          tG1 = this.G;
          if (tG1 != null) {
             mRecommendUs = tG1.mRecommendUserMeta;
             if (mRecommendUs != null) {
                mPymkExtPara = mRecommendUs.mPymkExtParam;
                if (mPymkExtPara != null) {
                   mPrsid = mPymkExtPara.recoPortal;
                label_0068 :
                   b uob = new b(mPrsid);
                   goto label_006b ;
                }
             }
          }
          int i = 0;
          goto label_0068 ;
       }
    label_00eb :
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrootPymkCardDetailSlidePlayFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.O = a.a(this.ch());
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, GrootPymkCardDetailSlidePlayFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       super.onCreateView(p0, p1, p2);
       this.j = a.c(p0, 0x7f0d0431, p1, false);
       if (f.b() && (this.O.getNasaSlideParam().isHomePage() || (!this.O.getNasaSlideParam().isTrendingPage() && (!this.O.getNasaSlideParam().isFollowNasaDetail() && !PatchProxy.applyVoid(null, this, GrootPymkCardDetailSlidePlayFragment.class, "12"))))) {
          this.j.setPadding(false, false, false, c.b(this.getContext().getResources(), R.dimen.arg_RES_7f070bf1));
       }
    label_006a :
       return this.j;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, GrootPymkCardDetailSlidePlayFragment.class, "9")) {
          return;
       }
       super.onDestroyView();
       GrootPymkCardDetailSlidePlayFragment tN = this.N;
       if (tN != null) {
          tN.destroy();
          this.N = null;
       }
       if (this.H != null) {
          this.H = null;
       }
       tN = this.U;
       if (tN != null) {
          tN.Z0();
       }
       this.T = false;
       return;
    }
    public void onMultiWindowModeChanged(boolean p0){
       if (PatchProxy.isSupport(GrootPymkCardDetailSlidePlayFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GrootPymkCardDetailSlidePlayFragment.class, "7")) {
          return;
       }
       super.onMultiWindowModeChanged(p0);
       this.L.onNext(Boolean.valueOf(p0));
       return;
    }
    public final int xh(){
       GrootPymkCardDetailSlidePlayFragment tG = this.G;
       if (tG != null) {
          PymkRecoBigCardFeed mRecommendUs = tG.mRecommendUserMeta;
          if (mRecommendUs != null) {
             return mRecommendUs.mType;
          }
       }
       return 0;
    }
    public final void yh(RecyclerView p0,ArrayList p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GrootPymkCardDetailSlidePlayFragment.class, "5")) {
          return;
       }
       this.U.q1(this.F);
       p0.setItemAnimator(null);
       p0.setVisibility(0);
       RelativeLayout$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.height = this.P.b();
       p0.setLayoutParams(layoutParams);
       StackLayoutManager.d = StackLayoutManager.d * this.P.e();
       p0.setHasFixedSize(true);
       p0.setLayoutManager(new StackLayoutManager());
       p0.setAdapter(this.U);
       h oh = new h(p0, this.U);
       new m(oh).f(p0);
       p1.add(oh);
       return;
    }
    public final void zh(){
       b uob;
       GrootPymkCardDetailSlidePlayFragment tM;
       if (PatchProxy.applyVoid(null, this, GrootPymkCardDetailSlidePlayFragment.class, "11")) {
          return;
       }
       if (this.T == null) {
          j$a c = j.c;
          if (c.i(this.G, this, this.O)) {
             this.P = c.c(this, this.G, this.O);
             View view = this.requireView();
             if (!PatchProxy.applyVoidOneRefs(view, this, GrootPymkCardDetailSlidePlayFragment.class, "2")) {
                PresenterV2 presenterV2 = new PresenterV2();
                this.N = presenterV2;
                presenterV2.U7(new p());
                ArrayList uArrayList = new ArrayList();
                GrootPymkCardDetailSlidePlayFragment tS = this.S;
                if (tS == null) {
                   this.N.U7(new FeedBigCardStatePresenter());
                   this.N.U7(new f());
                }else {
                   String str = "ADAPTER";
                   int i = 0x7f0a336c;
                   if (tS == true) {
                      if (!PatchProxy.applyVoidTwoRefs(view, uArrayList, this, GrootPymkCardDetailSlidePlayFragment.class, "3")) {
                         this.N.U7(new p());
                         this.N.U7(new FeedPymkVideoPlayPresenter());
                         this.N.U7(new a());
                         RecyclerView recyclerView = view.findViewById(i);
                         uob = new b();
                         uob.a = this;
                         uob.b = this.M.s().r;
                         uob.e = this.H;
                         tM = this.M;
                         uob.j = tM;
                         uob.i = tM.u();
                         tM = this.F;
                         List items = (tM != null)? tM.getItems(): new ArrayList();
                         f0 uof0 = new f0(this, items, this.P, this.I, this.J, uob);
                         this.U = v12;
                         uArrayList.add(v12);
                         uArrayList.add(new c("PYMK_ACCESS_IDScard_play", this.J));
                         uArrayList.add(recyclerView);
                         this.yh(recyclerView, uArrayList);
                         uArrayList.add(new c(str, this.U));
                      }
                   }else if(tS != 2 || PatchProxy.applyVoidTwoRefs(view, uArrayList, this, GrootPymkCardDetailSlidePlayFragment.class, "4")){
                      uob = new b();
                      uob.a = this;
                      uob.b = this.M.s().r;
                      uob.e = this.H;
                      tM = this.M;
                      uob.j = tM;
                      uob.i = tM.u();
                      i oi = new i(this, this.F.getItems(), this.P, this.I, this.K, uob);
                      this.U = v12;
                      this.yh(view.findViewById(i), uArrayList);
                      this.N.U7(new n());
                      this.N.U7(new a());
                      this.N.U7(new f());
                      uArrayList.add(new c(str, this.U));
                   }
                }
                this.N.f(view);
                uArrayList.add(new c("FRAGMENT", this));
                uArrayList.add(new c("ON_MULTI_WINDOW_MODE_CHANGED_EVENT", this.L));
                uArrayList.add(new c("PAGE_LIST", this.F));
                uArrayList.add(new c("PYMK_ACCESS_IDSPYMK_PARAMS", this.M));
                uArrayList.add(new c("PYMK_ACCESS_IDScurrentUser", this.H));
                uArrayList.add(new c("PYMK_ACCESS_IDScard_size", this.P));
                uArrayList.add(new c("PYMK_ACCESS_IDScard_size_change", this.Q));
                uArrayList.add(new c("PYMK_ACCESS_IDSbigcard_btn", this.I));
                uArrayList.add(new c("relation_btn_click", this.K));
                uArrayList.add(new c("PYMK_ACCESS_IDSportal", Integer.valueOf(this.M.s().l2())));
                uArrayList.add(new c("PYMK_ACCESS_IDSITEM_CLICK_LISTENER", this.M.u()));
                uArrayList.add(this.x);
                uArrayList.add(new c("KEY_DETAIL_SOURCE", this.O));
                this.N.i(uArrayList.toArray());
             }
             this.T = true;
          }
       }
       return;
    }
}
