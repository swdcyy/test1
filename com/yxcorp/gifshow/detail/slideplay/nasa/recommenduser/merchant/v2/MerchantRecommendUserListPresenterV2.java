package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.MerchantRecommendUserListPresenterV2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.e;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.MerchantRecommendUserListPresenterV2$a;
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
import o6a.l;
import com.kuaishou.android.model.mix.MerchantRecommendUserMeta;
import com.kuaishou.android.model.mix.MerchantRecommendUserMeta$ViewObj;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.android.model.mix.MerchantRecommendUserMeta$UserGroup;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.MutableLiveData;
import o6a.j;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.MerchantRecommendUserListPresenterV2$2;
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
import io.reactivex.subjects.PublishSubject;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class MerchantRecommendUserListPresenterV2 extends PresenterV2	// class@001798
{
    public final e p;
    public b q;
    public RecyclerView r;
    public TextView s;
    public l t;
    public PhotoDetailParam u;
    public PublishSubject v;
    public BaseFragment w;
    public boolean x;
    public final a y;

    public void MerchantRecommendUserListPresenterV2(){
       super();
       this.p = new e();
       this.y = new MerchantRecommendUserListPresenterV2$a(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, MerchantRecommendUserListPresenterV2.class, "3")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.w.getParentFragment());
       if (slidePlayVie != null) {
          slidePlayVie.P(this.w, this.y);
       }
       MerchantRecommendUserFeed merchantReco = this.u.mPhoto.getEntity().a(MerchantRecommendUserFeed.class);
       MerchantRecommendUserListPresenterV2 tt = this.t;
       boolean b = false;
       if (tt != null) {
          Objects.requireNonNull(tt);
          l ol = l.class;
          if (!PatchProxy.applyVoidOneRefsWithListener(merchantReco, tt, ol, "1")) {
             tt.a = merchantReco;
             if (merchantReco != null) {
                MerchantRecommendUserFeed mRecommendUs = merchantReco.mRecommendUserMeta;
                if (mRecommendUs != null) {
                   MerchantRecommendUserMeta mView = mRecommendUs.mView;
                   if (mView != null) {
                      objArray = mView.mNewUsers;
                   }
                }
             }
             tt.b = objArray;
             tt.d = b;
             if (objArray != null) {
                Iterator iterator = objArray.iterator();
                int i = 0;
                while (iterator.hasNext()) {
                   Object obj = iterator.next();
                   int i1 = i + 1;
                   if (i < 0) {
                      CollectionsKt__CollectionsKt.W();
                   }
                   if (obj.hasShowed != null) {
                      tt.d = i;
                   }
                   i = i1;
                }
             }
             tt.f(tt.d, b);
             PatchProxy.onMethodExit(ol, "1");
          }
          Activity activity = this.getActivity();
          if (activity instanceof GifshowActivity) {
             this.t.b().observe(activity, new j(this));
          }
       }
       if (merchantReco == null) {
          PatchProxy.onMethodExit(MerchantRecommendUserListPresenterV2.class, "3");
          return;
       }else {
          MerchantRecommendUserListPresenterV2$2 u2 = new MerchantRecommendUserListPresenterV2$2(this, this.getContext(), 1, b);
          this.q = new b(1, a1.e(16.00f));
          MerchantRecommendUserListPresenterV2 tr = this.r;
          if (tr != null) {
             tr.setLayoutManager(u2);
             this.r.addItemDecoration(this.q);
             p op = new p();
             op.x(300);
             this.r.setItemAnimator(op);
          }
          MerchantRecommendUserListPresenterV2 tp = this.p;
          if (tp != null) {
             tp.w = this.w;
             tr = this.r;
             if (tr != null) {
                tr.setAdapter(tp);
             }
             this.p.W0(this.t.c());
             this.p.k0();
          }
          tp = this.v;
          if (tp != null) {
             tp.onNext(Boolean.TRUE);
          }
          PatchProxy.onMethodExit(MerchantRecommendUserListPresenterV2.class, "3");
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, MerchantRecommendUserListPresenterV2.class, "6")) {
          return;
       }
       this.r.removeItemDecoration(this.q);
       PatchProxy.onMethodExit(MerchantRecommendUserListPresenterV2.class, "6");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, MerchantRecommendUserListPresenterV2.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a34da);
       this.s = m1.f(p0, 0x7f0a42cc);
       PatchProxy.onMethodExit(MerchantRecommendUserListPresenterV2.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, MerchantRecommendUserListPresenterV2.class, "1")) {
          return;
       }
       this.t = this.q8(l.class);
       this.u = this.q8(PhotoDetailParam.class);
       this.v = this.r8("FOLLOW_STATUS_CHANGE");
       this.w = this.q8(BaseFragment.class);
       PatchProxy.onMethodExit(MerchantRecommendUserListPresenterV2.class, "1");
       return;
    }
}
