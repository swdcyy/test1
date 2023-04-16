package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideUnFollowPresenter$c;
import erd.g;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideUnFollowPresenter;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import wca.n;
import io.reactivex.subjects.PublishSubject;
import java.util.List;

public final class FollowSlideUnFollowPresenter$c implements g	// class@001137
{
    public final FollowSlideUnFollowPresenter b;

    public void FollowSlideUnFollowPresenter$c(FollowSlideUnFollowPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowSlideUnFollowPresenter$c.class, "1")) {
       }else {
          p0 = this.b.q.iterator();
          while (p0.hasNext()) {
             this.b.p.onNext(p0.next());
          }
          this.b.q.clear();
       }
       return;
    }
}
