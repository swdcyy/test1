package com.yxcorp.gifshow.video_cover.presenter.VideoCoverAutoPlayCardPresenter$mMaxPlayDuration$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import oxc.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.lang.Long;

public final class VideoCoverAutoPlayCardPresenter$mMaxPlayDuration$2 extends Lambda implements a	// class@0016a3
{
    public final a this$0;

    public void VideoCoverAutoPlayCardPresenter$mMaxPlayDuration$2(a p0){
       this.this$0 = p0;
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, VideoCoverAutoPlayCardPresenter$mMaxPlayDuration$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return ((long)r1.T0(a.S8(this.this$0).mEntity) * 1000);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
