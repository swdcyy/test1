package com.yxcorp.gifshow.relation.feed.presenter.FeedBigCardStatePresenter$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.relation.feed.presenter.FeedBigCardStatePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class FeedBigCardStatePresenter$1 implements LifecycleObserver	// class@001897
{
    public final FeedBigCardStatePresenter b;

    public void FeedBigCardStatePresenter$1(FeedBigCardStatePresenter p0){
       this.b = p0;
       super();
    }
    public final void onResume(){
       if (PatchProxy.applyVoid(null, this, FeedBigCardStatePresenter$1.class, "1")) {
          return;
       }
       this.b.c9();
       return;
    }
}
