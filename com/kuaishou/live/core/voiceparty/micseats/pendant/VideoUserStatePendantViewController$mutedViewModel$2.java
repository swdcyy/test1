package com.kuaishou.live.core.voiceparty.micseats.pendant.VideoUserStatePendantViewController$mutedViewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.pendant.VideoUserStatePendantViewController;
import brd.t;
import com.kuaishou.live.core.voiceparty.micseats.pendant.UserMutedPendantViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ts2.f;
import androidx.lifecycle.LiveData;

public final class VideoUserStatePendantViewController$mutedViewModel$2 extends Lambda implements a	// class@001768
{
    public final t $userMutedInfoObservable;
    public final VideoUserStatePendantViewController this$0;

    public void VideoUserStatePendantViewController$mutedViewModel$2(VideoUserStatePendantViewController p0,t p1){
       this.this$0 = p0;
       this.$userMutedInfoObservable = p1;
       super(0);
    }
    public final UserMutedPendantViewModel invoke(){
       Object obj = PatchProxy.apply(null, this, VideoUserStatePendantViewController$mutedViewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoUserStatePendantViewController$mutedViewModel$2 tthis$0 = this.this$0;
       return new UserMutedPendantViewModel(tthis$0.m, this.$userMutedInfoObservable, tthis$0.o);
    }
    public Object invoke(){
       return this.invoke();
    }
}
