package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.MerchantRecommendUserListPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.MerchantRecommendUserListPresenter$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.MerchantRecommendUserFeed;
import tl8.d;
import java.util.Objects;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.MerchantRecommendUserManager;
import java.util.ArrayList;
import com.kuaishou.android.model.mix.MerchantRecommendUserMeta;
import com.kuaishou.android.model.mix.MerchantRecommendUserMeta$ViewObj;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.framework.model.user.User;
import java.util.Collection;
import io.reactivex.subjects.PublishSubject;
import m6a.v;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.MerchantRecommendUserListPresenter$2;
import android.content.Context;
import k17.b;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$n;
import m6a.p;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.List;
import g9c.a;
import java.lang.Boolean;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class MerchantRecommendUserListPresenter extends PresenterV2	// class@001788
{
    public final b p;
    public b q;
    public RecyclerView r;
    public MerchantRecommendUserManager s;
    public PhotoDetailParam t;
    public PublishSubject u;
    public BaseFragment v;
    public boolean w;
    public final a x;

    public void MerchantRecommendUserListPresenter(){
       super();
       this.p = new b();
       this.x = new MerchantRecommendUserListPresenter$a(this);
    }
    public void E8(){
       MerchantRecommendUserMeta$ViewObj mUsers;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, MerchantRecommendUserListPresenter.class, "3")) {
          return;
       }
       if (this.s == null) {
          PatchProxy.onMethodExit(MerchantRecommendUserListPresenter.class, "3");
          return;
       }else {
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.v.getParentFragment());
          if (slidePlayVie != null) {
             slidePlayVie.P(this.v, this.x);
          }
          MerchantRecommendUserFeed merchantReco = this.t.mPhoto.getEntity().a(MerchantRecommendUserFeed.class);
          MerchantRecommendUserListPresenter ts = this.s;
          Objects.requireNonNull(ts);
          MerchantRecommendUserManager merchantReco1 = MerchantRecommendUserManager.class;
          if (!PatchProxy.applyVoidOneRefsWithListener(merchantReco, ts, merchantReco1, "2")) {
             ts.c = merchantReco;
             ts.a.clear();
             ts.b.clear();
             if (merchantReco != null) {
                MerchantRecommendUserFeed mRecommendUs = merchantReco.mRecommendUserMeta;
                if (mRecommendUs != null) {
                   MerchantRecommendUserMeta mView = mRecommendUs.mView;
                   if (mView != null) {
                      mUsers = mView.mUsers;
                   label_0063 :
                      if (mUsers != null) {
                         MerchantRecommendUserManager a = ts.a;
                         ArrayList uArrayList = new ArrayList();
                         Iterator iterator = mUsers.iterator();
                         while (iterator.hasNext()) {
                            Object obj = iterator.next();
                            int i = obj.mIsReplaced ^ 1;
                            if (i) {
                               uArrayList.add(obj);
                            }
                         }
                         a.addAll(uArrayList);
                         MerchantRecommendUserManager.c(ts, false, false, 1, objArray);
                      }
                      PatchProxy.onMethodExit(merchantReco1, "2");
                   }
                }
             }
             mUsers = objArray;
             goto label_0063 ;
          }
          this.X7(this.s.a().subscribe(new v(this), e.b));
          if (merchantReco == null) {
             PatchProxy.onMethodExit(MerchantRecommendUserListPresenter.class, "3");
             return;
          }else {
             MerchantRecommendUserListPresenter$2 u2 = new MerchantRecommendUserListPresenter$2(this, this.getContext(), 1, false);
             this.q = new b(1, a1.e(16.00f));
             MerchantRecommendUserListPresenter tr = this.r;
             if (tr != null) {
                tr.setLayoutManager(u2);
                this.r.addItemDecoration(this.q);
                p op = new p();
                op.x(300);
                this.r.setItemAnimator(op);
             }
             MerchantRecommendUserListPresenter tp = this.p;
             if (tp != null) {
                tp.w = this.v;
                tr = this.r;
                if (tr != null) {
                   tr.setAdapter(tp);
                }
                this.p.W0(this.s.b());
                this.p.k0();
             }
             tp = this.u;
             if (tp != null) {
                tp.onNext(Boolean.TRUE);
             }
             PatchProxy.onMethodExit(MerchantRecommendUserListPresenter.class, "3");
             return;
          }
       }
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, MerchantRecommendUserListPresenter.class, "5")) {
          return;
       }
       this.r.removeItemDecoration(this.q);
       PatchProxy.onMethodExit(MerchantRecommendUserListPresenter.class, "5");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, MerchantRecommendUserListPresenter.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a34da);
       PatchProxy.onMethodExit(MerchantRecommendUserListPresenter.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, MerchantRecommendUserListPresenter.class, "1")) {
          return;
       }
       this.s = this.q8(MerchantRecommendUserManager.class);
       this.t = this.q8(PhotoDetailParam.class);
       this.u = this.r8("FOLLOW_STATUS_CHANGE");
       this.v = this.q8(BaseFragment.class);
       PatchProxy.onMethodExit(MerchantRecommendUserListPresenter.class, "1");
       return;
    }
}
