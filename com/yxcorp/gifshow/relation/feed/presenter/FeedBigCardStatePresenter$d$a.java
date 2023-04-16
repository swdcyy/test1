package com.yxcorp.gifshow.relation.feed.presenter.FeedBigCardStatePresenter$d$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.feed.presenter.FeedBigCardStatePresenter$d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.relation.feed.presenter.FeedBigCardStatePresenter;
import com.kwai.library.widget.popup.common.c;
import fac.c;
import com.kwai.framework.model.user.RecoUser;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import a7c.h;
import com.yxcorp.gifshow.relation.feed.model.PymkRecoBigCardFeed;
import hcc.i;
import gac.b;
import e17.i;

public class FeedBigCardStatePresenter$d$a implements View$OnClickListener	// class@00189b
{
    public final FeedBigCardStatePresenter$d b;

    public void FeedBigCardStatePresenter$d$a(FeedBigCardStatePresenter$d p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeedBigCardStatePresenter$d$a.class, "1")) {
          return;
       }
       this.b.d.s.q(3);
       FeedBigCardStatePresenter$d d = this.b.d;
       i.d(d.T, d.z, d.y, d.q, d.A.f());
       d = this.b.d;
       FeedBigCardStatePresenter t = d.T;
       if (t.mUser != null) {
          d.v.v2(t);
          this.b.d.W8(true);
          i.a(R.style.arg_RES_7f11066a, 0x7f1039c8);
       }
       return;
    }
}
