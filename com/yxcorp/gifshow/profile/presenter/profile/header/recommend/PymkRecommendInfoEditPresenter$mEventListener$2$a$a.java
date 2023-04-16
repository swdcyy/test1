package com.yxcorp.gifshow.profile.presenter.profile.header.recommend.PymkRecommendInfoEditPresenter$mEventListener$2$a$a;
import java.lang.Runnable;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.q;

public final class PymkRecommendInfoEditPresenter$mEventListener$2$a$a implements Runnable	// class@001522
{
    public final Map b;

    public void PymkRecommendInfoEditPresenter$mEventListener$2$a$a(Map p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, PymkRecommendInfoEditPresenter$mEventListener$2$a$a.class, "1")) {
          return;
       }
       PymkRecommendInfoEditPresenter$mEventListener$2$a$a tb = this.b;
       if (tb != null) {
          RxBus.f.b(new q(tb));
       }
       return;
    }
}
