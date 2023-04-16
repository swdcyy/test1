package com.kuaishou.live.core.voiceparty.micseats.pendant.VideoUserStatePendantViewController$followViewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.pendant.VideoUserStatePendantViewController;
import com.kuaishou.live.core.voiceparty.micseats.pendant.UserFollowPendantViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ts2.f;
import androidx.lifecycle.LiveData;

public final class VideoUserStatePendantViewController$followViewModel$2 extends Lambda implements a	// class@001767
{
    public final VideoUserStatePendantViewController this$0;

    public void VideoUserStatePendantViewController$followViewModel$2(VideoUserStatePendantViewController p0){
       this.this$0 = p0;
       super(0);
    }
    public final UserFollowPendantViewModel invoke(){
       Object obj = PatchProxy.apply(null, this, VideoUserStatePendantViewController$followViewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoUserStatePendantViewController$followViewModel$2 tthis$0 = this.this$0;
       return new UserFollowPendantViewModel(tthis$0.m, tthis$0.o);
    }
    public Object invoke(){
       return this.invoke();
    }
}
