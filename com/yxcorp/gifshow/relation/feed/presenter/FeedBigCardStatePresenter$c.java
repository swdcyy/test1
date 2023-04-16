package com.yxcorp.gifshow.relation.feed.presenter.FeedBigCardStatePresenter$c;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.relation.feed.presenter.FeedBigCardStatePresenter;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.widget.SwipeLayout;
import hcc.i;
import java.lang.Integer;
import fac.c;
import com.kwai.framework.model.user.RecoUser;
import com.kwai.framework.model.user.User;
import o07.o;

public class FeedBigCardStatePresenter$c implements PopupInterface$h	// class@00189a
{
    public final FeedBigCardStatePresenter b;

    public void FeedBigCardStatePresenter$c(FeedBigCardStatePresenter p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeedBigCardStatePresenter$c.class, "1")) {
          return;
       }
       FeedBigCardStatePresenter$c tb = this.b;
       i.b(false, tb.z, tb.p, tb.r);
       return;
    }
    public void H(c p0,int p1){
       FeedBigCardStatePresenter$c uoc = FeedBigCardStatePresenter$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "2")) {
          return;
       }
       if (p1 != 3) {
          FeedBigCardStatePresenter$c tb = this.b;
          if (tb.T != null) {
             i.a("CLOSE_POPUP", tb.A.f(), this.b.T.mUser);
          }
       }
       FeedBigCardStatePresenter$c tb1 = this.b;
       i.b(true, tb1.z, tb1.p, tb1.r);
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
