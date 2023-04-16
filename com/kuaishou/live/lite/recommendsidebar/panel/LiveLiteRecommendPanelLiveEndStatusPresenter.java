package com.kuaishou.live.lite.recommendsidebar.panel.LiveLiteRecommendPanelLiveEndStatusPresenter;
import a51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yc3.p;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.recommendsidebar.panel.j;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarCoreModel;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.Objects;
import com.kuaishou.live.lite.recommendsidebar.panel.m;
import xc3.e;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.live.lite.recommendsidebar.panel.LiveLiteRecommendPanelLiveEndStatusPresenter$onBind$1;
import msd.a;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import qvb.q;
import qvb.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.lite.recommendsidebar.panel.LiveLiteRecommendPanelFragment;

public final class LiveLiteRecommendPanelLiveEndStatusPresenter extends c	// class@000af4
{
    public j v;
    public LiveLiteRecommendPanelFragment w;
    public p x;

    public void LiveLiteRecommendPanelLiveEndStatusPresenter(){
       super();
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteRecommendPanelLiveEndStatusPresenter.class, "2")) {
          return;
       }
       super.E8();
       LiveLiteRecommendPanelLiveEndStatusPresenter tv = this.v;
       String str = "context";
       if (tv == null) {
          a.S(str);
       }
       MutableLiveData mutableLiveD = tv.h.c();
       LiveLiteRecommendPanelLiveEndStatusPresenter tw = this.w;
       if (tw == null) {
          a.S("fragment");
       }
       i oi = tw.q();
       Objects.requireNonNull(oi, "null cannot be cast to non-null type com.kuaishou.live.lite.recommendsidebar.panel.LiveLiteRecommendPanelPageList");
       LiveLiteRecommendPanelLiveEndStatusPresenter tv1 = this.v;
       if (tv1 == null) {
          a.S(str);
       }
       e uoe = tv1.h.a();
       if (uoe != null) {
          objArray = uoe.a();
       }
       this.x = new p(mutableLiveD, oi, objArray, new LiveLiteRecommendPanelLiveEndStatusPresenter$onBind$1(this));
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteRecommendPanelLiveEndStatusPresenter.class, "3")) {
          return;
       }
       super.J8();
       LiveLiteRecommendPanelLiveEndStatusPresenter tx = this.x;
       if (tx == null) {
          a.S("liveEndStatusModel");
       }
       Objects.requireNonNull(tx);
       if (!PatchProxy.applyVoid(objArray, tx, p.class, "1")) {
          tx.g.removeObserver(tx.e);
          tx.h.f(tx.f);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteRecommendPanelLiveEndStatusPresenter.class, "1")) {
          return;
       }
       Object obj = this.q8(j.class);
       a.o(obj, "inject\(LiveLiteRecommendPanelContext::class.java\)");
       this.v = obj;
       obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(PageAccessIds.FRAGMENT\)");
       this.w = obj;
       return;
    }
}
