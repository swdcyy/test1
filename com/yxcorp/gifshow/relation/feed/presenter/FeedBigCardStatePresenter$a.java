package com.yxcorp.gifshow.relation.feed.presenter.FeedBigCardStatePresenter$a;
import d6a.a;
import com.yxcorp.gifshow.relation.feed.presenter.FeedBigCardStatePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.relation.explore.view.BaseCardView;

public class FeedBigCardStatePresenter$a extends a	// class@001898
{
    public final FeedBigCardStatePresenter b;

    public void FeedBigCardStatePresenter$a(FeedBigCardStatePresenter p0){
       this.b = p0;
       super();
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, FeedBigCardStatePresenter$a.class, "1")) {
          return;
       }
       FeedBigCardStatePresenter n = this.b.N;
       if (n != null) {
          n.d();
          FeedBigCardStatePresenter$a tb = this.b;
          if (tb.O != null) {
             tb.S8();
             this.b.O = false;
          }
       }
       return;
    }
}
