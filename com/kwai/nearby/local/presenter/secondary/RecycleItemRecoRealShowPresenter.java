package com.kwai.nearby.local.presenter.secondary.RecycleItemRecoRealShowPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import com.kwai.nearby.local.presenter.secondary.RecycleItemRecoRealShowPresenter$1;
import com.kwai.nearby.local.presenter.secondary.RecycleItemRecoRealShowPresenter$a;
import com.kwai.nearby.local.presenter.secondary.RecycleItemRecoRealShowPresenter$b;
import com.kwai.nearby.local.presenter.secondary.RecycleItemRecoRealShowPresenter$c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import qc7.c;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import ed7.a;
import erd.g;
import crd.b;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import qvb.q;
import qvb.j;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.Math;
import g9c.d;
import g9c.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import kp.r1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.postwork.PostStatus;
import vc7.k0;
import com.yxcorp.gifshow.events.realaction.RealAction;
import com.yxcorp.gifshow.events.realaction.RealAction$ExtParams;
import com.yxcorp.gifshow.action.model.RealActionFeed;
import com.yxcorp.gifshow.action.c;
import java.util.List;
import y8c.g;
import yv8.c;

public class RecycleItemRecoRealShowPresenter extends PresenterV2	// class@000fce
{
    public RecyclerFragment p;
    public g q;
    public c r;
    public k0 s;
    public String t;
    public int u;
    public final LifecycleObserver v;
    public final RecyclerView$r w;
    public RecyclerView x;
    public final q y;
    public final ViewTreeObserver$OnGlobalLayoutListener z;

    public void RecycleItemRecoRealShowPresenter(String p0){
       super();
       this.u = -1;
       this.v = new RecycleItemRecoRealShowPresenter$1(this);
       this.w = new RecycleItemRecoRealShowPresenter$a(this);
       this.y = new RecycleItemRecoRealShowPresenter$b(this);
       this.z = new RecycleItemRecoRealShowPresenter$c(this);
       this.t = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, RecycleItemRecoRealShowPresenter.class, "2")) {
          return;
       }
       this.X7(RxBus.f.g(c.class, RxBus$ThreadMode.MAIN).subscribe(new a(this)));
       this.p.q().h(this.y);
       this.p.h0().addOnScrollListener(this.w);
       this.p.getLifecycle().addObserver(this.v);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, RecycleItemRecoRealShowPresenter.class, "3")) {
          return;
       }
       this.p.q().f(this.y);
       this.p.h0().removeOnScrollListener(this.w);
       this.p.getLifecycle().removeObserver(this.v);
       RecycleItemRecoRealShowPresenter tx = this.x;
       if (tx != null && tx.getViewTreeObserver().isAlive()) {
          this.x.getViewTreeObserver().removeGlobalOnLayoutListener(this.z);
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, RecycleItemRecoRealShowPresenter.class, "5")) {
          return;
       }
       this.S8();
       return;
    }
    public void R8(){
       int i1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RecycleItemRecoRealShowPresenter.class, "4")) {
          return;
       }
       RecycleItemRecoRealShowPresenter tp = this.p;
       if (tp == null) {
          return;
       }
       RecyclerView$LayoutManager layoutManage = tp.h0().getLayoutManager();
       int i = -1;
       if (layoutManage instanceof GridLayoutManager) {
          i = layoutManage.c();
       }else if(layoutManage instanceof LinearLayoutManager){
          i = layoutManage.c();
       }else if(layoutManage instanceof StaggeredGridLayoutManager){
          int[] ointArray = layoutManage.findLastVisibleItemPositions(objArray);
          i1 = ointArray.length;
          for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
             i = Math.max(ointArray[i2], i);
          }
       }
       i1 = Math.max(i, this.u);
       this.u = i1;
       this.u = Math.min((i1 - this.p.ia().b1()), (this.q.getItemCount() - 1));
       return;
    }
    public void S8(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, RecycleItemRecoRealShowPresenter.class, "7")) {
          return;
       }
       this.R8();
       if (!PatchProxy.applyVoid(null, this, RecycleItemRecoRealShowPresenter.class, "8") && this.u >= null) {
          int i = 0;
          while (i <= this.u) {
             QPhoto qPhoto = this.q.O0(i);
             if (!PatchProxy.applyVoidOneRefs(qPhoto, this, RecycleItemRecoRealShowPresenter.class, "9") && (r1.w0(qPhoto.getEntity()) != null && !qPhoto.isRecShowed())) {
                QPhoto mEntity = qPhoto.mEntity;
                Object obj = PatchProxy.applyOneRefs(mEntity, null, RecycleItemRecoRealShowPresenter.class, "10");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else {
                   PhotoMeta photoMeta = r1.u1(mEntity);
                   if (photoMeta != null) {
                      photoMeta = photoMeta.mPostWorkStatus;
                      if (photoMeta != null && photoMeta != PostStatus.UPLOAD_COMPLETE) {
                         b = false;
                      }
                   }
                   b = true;
                }
                if (b) {
                   qPhoto.setRecShowed(true);
                   if (!qPhoto.isVideoType() && (qPhoto.isImageType() || qPhoto.isLiveStream())) {
                      RecycleItemRecoRealShowPresenter ts = this.s;
                      if (ts != null) {
                         qPhoto = qPhoto.mEntity;
                         if (!PatchProxy.applyVoidOneRefs(qPhoto, ts, k0.class, "1")) {
                            ts.a.add(c.g(new RealAction("Nearby", true, qPhoto, RealAction$ExtParams.newInstance())));
                         }
                      }else {
                         c.f(this.t, true, qPhoto.mEntity, this.t, RealAction$ExtParams.newInstance());
                      }
                   }
                }
             }
          label_00b6 :
             i = i + 1;
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, RecycleItemRecoRealShowPresenter.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.r8("ADAPTER");
       this.r = this.r8("REAL_ACTION_BIZ_TYPE");
       this.s = this.t8("HOME_LOCAL_REAL_ACTION_SHOW_REPO");
       return;
    }
}
