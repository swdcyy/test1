package com.yxcorp.gifshow.video_cover.presenter.VideoCoverAutoPlayCardPresenter$mPlayInterceptor$2$a;
import s99.d;
import com.yxcorp.gifshow.video_cover.presenter.VideoCoverAutoPlayCardPresenter$mPlayInterceptor$2;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import oxc.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import io.reactivex.subjects.PublishSubject;

public final class VideoCoverAutoPlayCardPresenter$mPlayInterceptor$2$a implements d	// class@0016a6
{
    public final VideoCoverAutoPlayCardPresenter$mPlayInterceptor$2 a;

    public void VideoCoverAutoPlayCardPresenter$mPlayInterceptor$2$a(VideoCoverAutoPlayCardPresenter$mPlayInterceptor$2 p0){
       this.a = p0;
       super();
    }
    public boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoCoverAutoPlayCardPresenter$mPlayInterceptor$2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "type");
       if (!r1.D3(a.S8(this.a.this$0).mEntity) || (TextUtils.n("focus_dispatch", p0) && this.a.this$0.G != null)) {
          return false;
       }
       a v = this.a.this$0.v;
       if (v != null) {
          v.onNext("disable");
       }
       return true;
    }
}
