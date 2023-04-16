package com.kwai.video.wayne.player.main.WaynePlayer$mPlayerInstanceHandler$1;
import com.kwai.video.wayne.player.OnPlayerInstanceHandler;
import com.kwai.video.wayne.player.main.WaynePlayer;
import java.lang.Object;
import com.kwai.video.wayne.player.main._0_AbstractPlayerHolder;
import com.kwai.video.wayne.player.InstancePriority;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.util.DebugLog;
import android.os.Handler;
import com.kwai.video.wayne.player.main.WaynePlayer$mPlayerInstanceHandler$1$onPriorityChanged$1;
import java.lang.Runnable;
import com.kwai.video.wayne.player.main.PlayerState;
import com.kwai.video.wayne.player.main._1_AbstractMediaPlayerApiDelegate;
import com.kwai.video.wayne.player.builder.PlayerCommonBuildData;
import com.kwai.video.wayne.player.builder.WayneBuildData;

public final class WaynePlayer$mPlayerInstanceHandler$1 implements OnPlayerInstanceHandler	// class@000da1
{
    public final WaynePlayer this$0;

    public void WaynePlayer$mPlayerInstanceHandler$1(WaynePlayer p0){
       this.this$0 = p0;
       super();
    }
    public boolean hasInstance(){
       WaynePlayer$mPlayerInstanceHandler$1 tthis$0 = this.this$0;
       boolean b = (tthis$0.mKwaiMediaPlayer != null || tthis$0.mPendingCreatePlayer != null)? true: false;
       return b;
    }
    public void onPriorityChanged(InstancePriority p0,InstancePriority p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WaynePlayer$mPlayerInstanceHandler$1.class, "3")) {
          return;
       }
       a.p(p1, "new");
       DebugLog.i(this.this$0.getLogTag(), "player priority changed, old="+p0+", new="+p1);
       this.this$0.getHandler().post(new WaynePlayer$mPlayerInstanceHandler$1$onPriorityChanged$1(this, p0, p1));
       return;
    }
    public void onRelease(){
       if (PatchProxy.applyVoid(null, this, WaynePlayer$mPlayerInstanceHandler$1.class, "1")) {
          return;
       }
       DebugLog.i(this.this$0.getLogTag(), "release kernel player because too many kernel player");
       WaynePlayer$mPlayerInstanceHandler$1 tthis$0 = this.this$0;
       boolean b = false;
       if (tthis$0.mPendingCreatePlayer != null) {
          tthis$0.mPendingCreatePlayer = b;
          return;
       }else if(tthis$0.getState() == PlayerState.Playing){
          b = true;
       }
       tthis$0.mStartedWhenRelease = b;
       tthis$0 = this.this$0;
       tthis$0.mPositionWhenRelease = tthis$0.getCurrentPosition();
       this.this$0.resetPlayer(6);
       return;
    }
    public void onRestore(){
       if (PatchProxy.applyVoid(null, this, WaynePlayer$mPlayerInstanceHandler$1.class, "2")) {
          return;
       }
       DebugLog.i(this.this$0.getLogTag(), "restore kernel player");
       WaynePlayer$mPlayerInstanceHandler$1 tthis$0 = this.this$0;
       if (tthis$0.mStartedWhenRelease != null) {
          tthis$0.mBuildData.setStartPlayType(2);
          this.this$0.mStartedWhenRelease = false;
       }
       tthis$0 = this.this$0;
       tthis$0.mBuildData.setStartPosition(tthis$0.mPositionWhenRelease);
       this.this$0.createPlayer(3);
       this.this$0.prepareAsync();
       return;
    }
}
