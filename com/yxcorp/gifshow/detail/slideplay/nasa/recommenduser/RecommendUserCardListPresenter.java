package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.RecommendUserCardListPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.k;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.RecommendUserCardListPresenter$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.RecommendUserCardListPresenter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import uw9.v3;
import uw9.l0;
import k6a.m;
import jf5.a;
import uw9.o;
import q87.c;
import vy6.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.NasaRecommendUserFeed;
import tl8.d;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.c;
import qvb.q;
import qvb.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.RecommendUserMeta;
import com.yxcorp.gifshow.detail.view.SlideRecoTitleView;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.RecommendUserCardListPresenter$3;
import android.content.Context;
import k17.b;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$n;
import k6a.n;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.List;
import g9c.a;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.utility.SystemUtil;
import java.util.ArrayList;
import fg6.a;
import com.google.gson.Gson;
import com.kwai.framework.security.LogEncryptor;
import android.util.Base64;
import com.google.gson.JsonElement;
import java.lang.Exception;
import k2b.u1;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.detail.view.SlidePlayVideoLoadingProgressBar;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class RecommendUserCardListPresenter extends PresenterV2	// class@001753
{
    public final q A;
    public final k p;
    public b q;
    public RecyclerView r;
    public SlidePlayVideoLoadingProgressBar s;
    public SlideRecoTitleView t;
    public c u;
    public PhotoDetailParam v;
    public PublishSubject w;
    public BaseFragment x;
    public boolean y;
    public final a z;

    public void RecommendUserCardListPresenter(){
       super();
       this.p = new k();
       this.z = new RecommendUserCardListPresenter$a(this);
       this.A = new RecommendUserCardListPresenter$b(this);
    }
    public void E8(){
       String str;
       String str1;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, RecommendUserCardListPresenter.class, "3")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.x.getParentFragment());
       int i = 0;
       if (slidePlayVie != null) {
          l0 ol0 = slidePlayVie.M0();
          if (ol0 != null) {
             ol0.T = new m(this);
             Object[] objArray1 = new Object[i];
             o.C().w("GROWTH_RECOMMEND_USER", "[RecommendUserCardListPresenter] add ThanosDetailSwipeProfileInterceptor to SlidePlayViewModel.GlobalParams", objArray1);
          }
          slidePlayVie.P(this.x, this.z);
       }
       NasaRecommendUserFeed nasaRecommen = this.v.mPhoto.getEntity().a(NasaRecommendUserFeed.class);
       this.u.W1(nasaRecommen);
       this.u.h(this.A);
       if (nasaRecommen == null) {
          PatchProxy.onMethodExit(RecommendUserCardListPresenter.class, "3");
          return;
       }else {
          NasaRecommendUserFeed mRecommendUs = nasaRecommen.mRecommendUserMeta;
          if (mRecommendUs != null) {
             RecommendUserCardListPresenter tt = this.t;
             if (tt != null) {
                NasaRecommendUserFeed mRecommendUs1 = nasaRecommen.mRecommendUserMeta;
                tt.L(mRecommendUs.getPlanNum()).M(mRecommendUs1.titleStr, mRecommendUs1.subTitleStr);
             }
          }
          int i1 = 1;
          RecommendUserCardListPresenter$3 u3 = new RecommendUserCardListPresenter$3(this, this.getContext(), i1, i);
          this.q = new b(i1, a1.e(16.00f));
          RecommendUserCardListPresenter tr = this.r;
          if (tr != null) {
             tr.setLayoutManager(u3);
             this.r.addItemDecoration(this.q);
             n on = new n();
             on.x(300);
             this.r.setItemAnimator(on);
          }
          tr = this.p;
          if (tr != null) {
             tr.w = this.x;
             RecommendUserCardListPresenter tr1 = this.r;
             if (tr1 != null) {
                tr1.setAdapter(tr);
             }
             this.p.W0(this.u.getItems());
             this.p.k0();
          }
          tr = this.w;
          if (tr != null) {
             tr.onNext(Boolean.TRUE);
          }
          if (!PatchProxy.applyVoidOneRefsWithListener(nasaRecommen, this, RecommendUserCardListPresenter.class, "5")) {
             try{
                str = "";
                str1 = "6";
                JsonObject obj = PatchProxy.applyWithListener(objArray, this, RecommendUserCardListPresenter.class, str1);
                if (obj != PatchProxyResult.class) {
                   str = obj;
                }else {
                   obj = new JsonObject();
                   obj.c0("uid", QCurrentUser.ME.getId());
                   List list = SystemUtil.j(this.getContext());
                   String str2 = (list.size() > 0)? Base64.encodeToString(LogEncryptor.c.a((a.a.q(list)).getBytes()), 2): str;
                   obj.c0("did", str2);
                   obj.c0("platform", "FEATURE");
                   str = obj.toString();
                   PatchProxy.onMethodExit(RecommendUserCardListPresenter.class, str1);
                }
             }catch(java.lang.Exception e1){
                e1.printStackTrace();
                PatchProxy.onMethodExit(RecommendUserCardListPresenter.class, str1);
             }
             u1.R("KSRecoUserScenesTypeCarousel", str, 9);
             PatchProxy.onMethodExit(RecommendUserCardListPresenter.class, "5");
          }
          PatchProxy.onMethodExit(RecommendUserCardListPresenter.class, "3");
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, RecommendUserCardListPresenter.class, "8")) {
          return;
       }
       this.r.removeItemDecoration(this.q);
       this.u.h(this.A);
       this.u.Z1();
       PatchProxy.onMethodExit(RecommendUserCardListPresenter.class, "8");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, RecommendUserCardListPresenter.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a34da);
       this.s = m1.f(p0, 0x7f0a2911);
       this.t = m1.f(p0, 0x7f0a3498);
       PatchProxy.onMethodExit(RecommendUserCardListPresenter.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, RecommendUserCardListPresenter.class, "1")) {
          return;
       }
       this.u = this.q8(c.class);
       this.v = this.q8(PhotoDetailParam.class);
       this.w = this.r8("FOLLOW_STATUS_CHANGE");
       this.x = this.q8(BaseFragment.class);
       PatchProxy.onMethodExit(RecommendUserCardListPresenter.class, "1");
       return;
    }
}
