package com.yxcorp.gifshow.autoplay.presenter.LiveAutoPlayCardPresenter$mInterceptor$2$a;
import s99.d;
import com.yxcorp.gifshow.autoplay.presenter.LiveAutoPlayCardPresenter$mInterceptor$2;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import x99.s0;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import io.reactivex.subjects.PublishSubject;
import t99.w;
import t99.w$a;
import ba9.a;

public final class LiveAutoPlayCardPresenter$mInterceptor$2$a implements d	// class@001c1d
{
    public final LiveAutoPlayCardPresenter$mInterceptor$2 a;

    public void LiveAutoPlayCardPresenter$mInterceptor$2$a(LiveAutoPlayCardPresenter$mInterceptor$2 p0){
       this.a = p0;
       super();
    }
    public boolean a(String p0){
       s0 a;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAutoPlayCardPresenter$mInterceptor$2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "type");
       if (r1.t2(s0.R8(this.a.this$0).mEntity)) {
          a = this.a.this$0.A;
          if (a != null) {
             a.onNext("disable");
          }
          return true;
       }else {
          QPhoto mEntity = s0.R8(this.a.this$0).mEntity;
          a.o(mEntity, "mPhoto.mEntity");
          if (w.a.d(mEntity)) {
             a = this.a.this$0.A;
             if (a != null) {
                a.onNext("closeLive");
             }
             return true;
          }else if((a.g(p0, "focus_dispatch") ^ true) && !s0.P8(this.a.this$0).g()){
             a = this.a.this$0.A;
             if (a != null) {
                a.onNext("noVisionFocus");
             }
             return true;
          }else {
             return false;
          }
       }
    }
}
