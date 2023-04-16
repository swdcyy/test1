package com.yxcorp.gifshow.autoplay.presenter.VideoAutoPlayCardPresenter$mPlayInterceptor$2$a;
import s99.d;
import com.yxcorp.gifshow.autoplay.presenter.VideoAutoPlayCardPresenter$mPlayInterceptor$2;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import x99.z0;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import io.reactivex.subjects.PublishSubject;

public final class VideoAutoPlayCardPresenter$mPlayInterceptor$2$a implements d	// class@001c22
{
    public final VideoAutoPlayCardPresenter$mPlayInterceptor$2 a;

    public void VideoAutoPlayCardPresenter$mPlayInterceptor$2$a(VideoAutoPlayCardPresenter$mPlayInterceptor$2 p0){
       this.a = p0;
       super();
    }
    public boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoAutoPlayCardPresenter$mPlayInterceptor$2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "type");
       if (r1.D3(z0.R8(this.a.this$0).mEntity)) {
          return false;
       }
       z0 u = this.a.this$0.u;
       if (u != null) {
          u.onNext("disable");
       }
       return true;
    }
}
