package com.yxcorp.gifshow.relation.explore.presenter.q;
import erd.g;
import com.yxcorp.gifshow.relation.explore.presenter.FeedPymkVideoPlayPresenter;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;

public class q implements g	// class@00185e
{
    public final FeedPymkVideoPlayPresenter b;

    public void q(FeedPymkVideoPlayPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
       }else {
          this.b.q.onNext(Integer.valueOf(101));
       }
       return;
    }
}
