package com.yxcorp.gifshow.relation.feed.presenter.FeedBigCardStatePresenter$d$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.feed.presenter.FeedBigCardStatePresenter$d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.relation.feed.presenter.FeedBigCardStatePresenter;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.relation.feed.model.PymkRecoBigCardFeed;
import com.yxcorp.gifshow.relation.feed.model.PymkBigCardUserMeta;
import com.yxcorp.gifshow.relation.feed.model.PymkExtParam;
import wkd.b;
import rfc.a;
import brd.t;
import pac.o;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import android.widget.TextView;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import hcc.i;
import fac.c;
import com.kwai.framework.model.user.RecoUser;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import a7c.h;

public class FeedBigCardStatePresenter$d$b implements View$OnClickListener	// class@00189c
{
    public final FeedBigCardStatePresenter$d b;

    public void FeedBigCardStatePresenter$d$b(FeedBigCardStatePresenter$d p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       FeedBigCardStatePresenter$d d;
       if (PatchProxy.applyVoidOneRefs(p0, this, FeedBigCardStatePresenter$d$b.class, "1")) {
          return;
       }
       this.b.d.s.q(3);
       PymkRecoBigCardFeed mRecommendUs = this.b.d.q.mRecommendUserMeta;
       if (mRecommendUs != null) {
          PymkBigCardUserMeta mPymkExtPara = mRecommendUs.mPymkExtParam;
          if (mPymkExtPara != null) {
             PymkRecoBigCardFeed mRecommendUs1 = this.b.d.q.mRecommendUserMeta;
             b.a(0x4a533fa).e(mRecommendUs1.mType, mRecommendUs1.mContentType, mPymkExtPara.pageType).subscribe(new o(this));
             d = this.b.d;
             if (!d.p.H(d.V)) {
                d = this.b.d;
                i.f(d.K, d.t, d.Q);
             }
          }
       }
       d = this.b.d;
       i.c(d.T, d.z, d.y, d.q, d.A.f());
       return;
    }
}
