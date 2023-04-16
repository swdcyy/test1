package com.yxcorp.gifshow.ad.detail.comment.presenter.fake.FakeCommentContentPresenter$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.ad.detail.comment.presenter.fake.c;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class FakeCommentContentPresenter$1 implements LifecycleObserver	// class@001547
{
    public final Runnable b;
    public final c c;

    public void FakeCommentContentPresenter$1(c p0,Runnable p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onActivityResumed(){
       if (PatchProxy.applyVoid(null, this, FakeCommentContentPresenter$1.class, "1")) {
          return;
       }
       this.b.run();
       return;
    }
}
