package com.yxcorp.gifshow.video_cover.presenter.VideoCoverAutoPlayCardPresenter$mPausePlayListener$2$a;
import v99.a$a;
import com.yxcorp.gifshow.video_cover.presenter.VideoCoverAutoPlayCardPresenter$mPausePlayListener$2;
import java.lang.Object;
import ba9.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import oxc.a;

public final class VideoCoverAutoPlayCardPresenter$mPausePlayListener$2$a implements a$a	// class@0016a4
{
    public final VideoCoverAutoPlayCardPresenter$mPausePlayListener$2 a;

    public void VideoCoverAutoPlayCardPresenter$mPausePlayListener$2$a(VideoCoverAutoPlayCardPresenter$mPausePlayListener$2 p0){
       this.a = p0;
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoCoverAutoPlayCardPresenter$mPausePlayListener$2$a.class, "1")) {
          return;
       }
       a.p(p0, "card");
       if (a.g(p0, a.P8(this.a.this$0))) {
          this.a.this$0.e9("page_paused");
       }
       return;
    }
}
