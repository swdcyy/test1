package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.RecommendUserVideoListPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.m;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.RecommendUserVideoListPresenter$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.RecommendUserVideoListPresenter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import uw9.v3;
import uw9.l0;
import k6a.x;
import jf5.a;
import uw9.o;
import q87.c;
import vy6.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.NasaRecommendUserFeed;
import tl8.d;
import qvb.q;
import qvb.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.c;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.RecommendUserMeta;
import com.yxcorp.gifshow.detail.view.SlideRecoTitleView;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.RecommendUserVideoListPresenter$3;
import android.content.Context;
import k17.b;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.RecommendUserVideoListPresenter$c;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.ArrayList;
import com.kwai.framework.model.user.User;
import java.util.Iterator;
import g9c.a;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import android.app.Activity;
import android.view.View;
import com.yxcorp.gifshow.widget.SwipeLayout;
import java.lang.Integer;
import k6a.u;
import ekd.m1;
import com.yxcorp.gifshow.detail.view.SlidePlayVideoLoadingProgressBar;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class RecommendUserVideoListPresenter extends PresenterV2	// class@001758
{
    public PublishSubject A;
    public BaseFragment B;
    public boolean C;
    public final a D;
    public final q E;
    public boolean F;
    public boolean G;
    public boolean[] H;
    public int I;
    public LinearLayoutManager J;
    public SwipeLayout p;
    public RecommendUserVideoListPresenter$c q;
    public String r;
    public QPhoto s;
    public final m t;
    public b u;
    public RecyclerView v;
    public SlidePlayVideoLoadingProgressBar w;
    public SlideRecoTitleView x;
    public c y;
    public PhotoDetailParam z;

    public void RecommendUserVideoListPresenter(){
       super();
       this.t = new m();
       this.D = new RecommendUserVideoListPresenter$a(this);
       this.E = new RecommendUserVideoListPresenter$b(this);
       this.F = false;
       this.G = true;
       this.I = 0;
       this.J = null;
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, RecommendUserVideoListPresenter.class, "4")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.B.getParentFragment());
       int i = 0;
       if (slidePlayVie != null) {
          l0 ol0 = slidePlayVie.M0();
          if (ol0 != null) {
             ol0.T = new x(this);
             Object[] objArray1 = new Object[i];
             o.C().w("GROWTH_RECOMMEND_USER", "[RecommendUserVideoListPresenter] add ThanosDetailSwipeProfileInterceptor to SlidePlayViewModel.GlobalParams", objArray1);
          }
          slidePlayVie.P(this.B, this.D);
       }
       RecommendUserVideoListPresenter ts = this.s;
       if (ts != null) {
          this.r = ts.getListLoadSequenceID();
       }
       NasaRecommendUserFeed nasaRecommen = this.z.mPhoto.getEntity().a(NasaRecommendUserFeed.class);
       this.y.h(this.E);
       this.y.W1(nasaRecommen);
       if (nasaRecommen == null) {
          PatchProxy.onMethodExit(RecommendUserVideoListPresenter.class, "4");
          return;
       }else {
          nasaRecommen = nasaRecommen.mRecommendUserMeta;
          this.x.L(nasaRecommen.mRecommendUserMeta.getPlanNum()).M(nasaRecommen.titleStr, nasaRecommen.subTitleStr);
          this.u = new b(i, a1.e(20.00f));
          this.v.setLayoutManager(new RecommendUserVideoListPresenter$3(this, this.getContext(), i, i));
          this.v.addItemDecoration(this.u);
          ts = this.t;
          ts.w = this.B;
          this.v.setAdapter(ts);
          String str = "6";
          if (!PatchProxy.applyVoidWithListener(objArray, this, RecommendUserVideoListPresenter.class, str)) {
             if (this.v != null) {
                if (this.q == null) {
                   this.q = new RecommendUserVideoListPresenter$c(this);
                }
                this.v.addOnScrollListener(this.q);
             }
             PatchProxy.onMethodExit(RecommendUserVideoListPresenter.class, str);
          }
          ts = this.t;
          ArrayList uArrayList = PatchProxy.applyWithListener(objArray, this, RecommendUserVideoListPresenter.class, "7");
          if (uArrayList != PatchProxyResult.class) {
          }else {
             uArrayList = new ArrayList();
             User user = new User();
             user.mId = "empty";
             uArrayList.add(user);
             RecommendUserVideoListPresenter ty = this.y;
             if (ty != null && ty.getItems() != null) {
                Iterator iterator = this.y.getItems().iterator();
                while (iterator.hasNext()) {
                   User user1 = iterator.next();
                   user1.mLlsid = this.r;
                   uArrayList.add(user1);
                }
             }
             user = new User();
             user.mId = "empty";
             uArrayList.add(user);
             PatchProxy.onMethodExit(RecommendUserVideoListPresenter.class, "7");
          }
          ts.W0(uArrayList);
          this.t.k0();
          this.A.onNext(Boolean.TRUE);
          PatchProxy.onMethodExit(RecommendUserVideoListPresenter.class, "4");
          return;
       }
    }
    public void F8(){
       if (PatchProxy.applyVoidWithListener(null, this, RecommendUserVideoListPresenter.class, "2")) {
          return;
       }
       this.p = this.getActivity().findViewById(0x7f0a3c34);
       PatchProxy.onMethodExit(RecommendUserVideoListPresenter.class, "2");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, RecommendUserVideoListPresenter.class, "9")) {
          return;
       }
       RecommendUserVideoListPresenter tv = this.v;
       if (tv != null) {
          RecommendUserVideoListPresenter tq = this.q;
          if (tq != null) {
             tv.removeOnScrollListener(tq);
          }
          this.v.removeItemDecoration(this.u);
       }
       tv = this.y;
       if (tv != null) {
          tv.h(this.E);
          this.y.Z1();
       }
       PatchProxy.onMethodExit(RecommendUserVideoListPresenter.class, "9");
       return;
    }
    public void P8(int p0,int p1){
       if (PatchProxy.isSupport2(RecommendUserVideoListPresenter.class, "10") && PatchProxy.applyVoidTwoRefsWithListener(Integer.valueOf(p0), Integer.valueOf(p1), this, RecommendUserVideoListPresenter.class, "10")) {
          return;
       }
       RecommendUserVideoListPresenter tI = this.I;
       if (tI <= null || this.H == null) {
          PatchProxy.onMethodExit(RecommendUserVideoListPresenter.class, "10");
          return;
       }else if(p1 < 2 || p1 == (tI - 1)){
          PatchProxy.onMethodExit(RecommendUserVideoListPresenter.class, "10");
          return;
       }else if(p0 >= (tI - 1) || !p0){
          PatchProxy.onMethodExit(RecommendUserVideoListPresenter.class, "10");
          return;
       }else {
          while (true) {
             int i = p1 + 1;
             if (p0 < i) {
                tI = this.H;
                if (tI == null) {
                   break ;
                }else if(!tI[p0]){
                   String str = "11";
                   if (!PatchProxy.isSupport2(RecommendUserVideoListPresenter.class, str) || !PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, RecommendUserVideoListPresenter.class, str)) {
                      RecommendUserVideoListPresenter tt = this.t;
                      if (tt == null) {
                         PatchProxy.onMethodExit(RecommendUserVideoListPresenter.class, str);
                      }else {
                         User user = tt.r1(p0);
                         if (user != null) {
                            u.e(user, p0, 1);
                         }
                         PatchProxy.onMethodExit(RecommendUserVideoListPresenter.class, str);
                      }
                   }
                }
                this.H[p0] = 1;
                p0++;
             }else {
                PatchProxy.onMethodExit(RecommendUserVideoListPresenter.class, "10");
                return;
             }
          }
          PatchProxy.onMethodExit(RecommendUserVideoListPresenter.class, "10");
          return;
       }
    }
    public void R8(){
       if (PatchProxy.applyVoidWithListener(null, this, RecommendUserVideoListPresenter.class, "14")) {
          return;
       }
       if (this.H == null) {
          boolean[] uobooleanArr = new boolean[this.t.getItemCount()];
          this.H = uobooleanArr;
       }
       PatchProxy.onMethodExit(RecommendUserVideoListPresenter.class, "14");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, RecommendUserVideoListPresenter.class, "3")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a34da);
       this.w = m1.f(p0, 0x7f0a2911);
       this.x = m1.f(p0, 0x7f0a3498);
       PatchProxy.onMethodExit(RecommendUserVideoListPresenter.class, "3");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, RecommendUserVideoListPresenter.class, "1")) {
          return;
       }
       this.y = this.q8(c.class);
       this.z = this.q8(PhotoDetailParam.class);
       this.s = this.q8(QPhoto.class);
       this.A = this.r8("FOLLOW_STATUS_CHANGE");
       this.B = this.q8(BaseFragment.class);
       PatchProxy.onMethodExit(RecommendUserVideoListPresenter.class, "1");
       return;
    }
}
