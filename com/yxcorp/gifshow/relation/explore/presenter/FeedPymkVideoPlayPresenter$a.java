package com.yxcorp.gifshow.relation.explore.presenter.FeedPymkVideoPlayPresenter$a;
import d6a.a;
import com.yxcorp.gifshow.relation.explore.presenter.FeedPymkVideoPlayPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;

public class FeedPymkVideoPlayPresenter$a extends a	// class@00181d
{
    public final FeedPymkVideoPlayPresenter b;

    public void FeedPymkVideoPlayPresenter$a(FeedPymkVideoPlayPresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, FeedPymkVideoPlayPresenter$a.class, "2")) {
          return;
       }
       this.b.P8();
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, FeedPymkVideoPlayPresenter$a.class, "1")) {
          return;
       }
       this.b.q.onNext(Integer.valueOf(102));
       return;
    }
}
