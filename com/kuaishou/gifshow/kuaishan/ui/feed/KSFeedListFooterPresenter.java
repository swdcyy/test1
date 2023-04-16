package com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFooterPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.os.Handler;
import android.os.Looper;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFooterPresenter$mObserver$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qvb.q;
import qvb.j;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams;
import ekd.m1;
import lnc.a1;
import java.lang.CharSequence;
import qvb.i;

public final class KSFeedListFooterPresenter extends PresenterV2	// class@001acb
{
    public i p;
    public TextView q;
    public KwaiLoadingView r;
    public final Handler s;
    public final p t;
    public final String u;

    public void KSFeedListFooterPresenter(String p0){
       a.p(p0, "groupId");
       super();
       this.u = p0;
       this.s = new Handler(Looper.getMainLooper());
       this.t = s.c(new KSFeedListFooterPresenter$mObserver$2(this));
    }
    public static final KwaiLoadingView P8(KSFeedListFooterPresenter p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("mLoadingView");
       }
       return p0;
    }
    public static final TextView R8(KSFeedListFooterPresenter p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mTipsView");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, KSFeedListFooterPresenter.class, "4")) {
          return;
       }
       KSFeedListFooterPresenter tp = this.p;
       if (tp != null) {
          tp.h(this.S8());
       }
       tp = this.r;
       if (tp == null) {
          a.S("mLoadingView");
       }
       tp.setVisibility(8);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, KSFeedListFooterPresenter.class, "5")) {
          return;
       }
       KSFeedListFooterPresenter tp = this.p;
       if (tp != null) {
          tp.f(this.S8());
       }
       return;
    }
    public final q S8(){
       Object obj = PatchProxy.apply(null, this, KSFeedListFooterPresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t.getValue();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSFeedListFooterPresenter.class, "3")) {
          return;
       }
       a.p(p0, "rootView");
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       ViewGroup$LayoutParams layoutParams1 = null;
       if (!layoutParams instanceof StaggeredGridLayoutManager$LayoutParams) {
          layoutParams = layoutParams1;
       }
       if (layoutParams != null) {
          if (layoutParams.b() ^ 1) {
             layoutParams1 = layoutParams;
          }
          if (layoutParams1 != null) {
             layoutParams1.c(1);
          }
       }
       View view = m1.f(p0, R.id.ks_feed_no_more_tips);
       a.o(view, "ViewBindUtils.bindWidget¡­.id.ks_feed_no_more_tips\)");
       this.q = view;
       if (a.g(this.u, "1") || a.g(this.u, "999")) {
          KSFeedListFooterPresenter tq = this.q;
          if (tq == null) {
             a.S("mTipsView");
          }
          tq.setText(a1.p(R.string.arg_RES_7f101bc7));
       }
       p0 = m1.f(p0, R.id.ks_feed_no_more_loading);
       a.o(p0, "ViewBindUtils.bindWidget¡­.ks_feed_no_more_loading\)");
       this.r = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, KSFeedListFooterPresenter.class, "1")) {
          return;
       }
       this.p = this.r8("DETAIL_PAGE_LIST");
       return;
    }
}
