package com.yxcorp.gifshow.relation.feed.presenter.a$d$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.feed.presenter.a$d;
import com.kwai.framework.model.user.RecoUser;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.relation.feed.presenter.a;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.relation.feed.model.PymkRecoBigCardFeed;
import com.yxcorp.gifshow.relation.feed.model.PymkBigCardUserMeta;
import com.yxcorp.gifshow.relation.feed.model.PymkExtParam;
import wkd.b;
import rfc.a;
import brd.t;
import pac.b;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import android.widget.TextView;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import hcc.i;
import fac.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import a7c.h;

public class a$d$b implements View$OnClickListener	// class@0018a3
{
    public final RecoUser b;
    public final a$d c;

    public void a$d$b(a$d p0,RecoUser p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d$b.class, "1")) {
          return;
       }
       this.c.d.A.q(3);
       PymkRecoBigCardFeed mRecommendUs = this.c.d.t.mRecommendUserMeta;
       if (mRecommendUs != null) {
          PymkBigCardUserMeta mPymkExtPara = mRecommendUs.mPymkExtParam;
          if (mPymkExtPara != null) {
             PymkRecoBigCardFeed mRecommendUs1 = this.c.d.t.mRecommendUserMeta;
             b.a(0x4a533fa).e(mRecommendUs1.mType, mRecommendUs1.mContentType, mPymkExtPara.pageType).subscribe(new b(this));
             a$d d = this.c.d;
             if (!d.u.H(d.v)) {
                d = this.c.d;
                i.f(d.x, d.y, d.z);
             }
             a$d d1 = this.c.d;
             i.c(this.b, d1.s, d1.r, d1.t, d1.D.f());
          }
       }
       return;
    }
}
