package com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$3;
import com.kwai.video.waynelive.wayneplayer.CmdExecutor;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.waynelive.LivePlayerState;
import com.kwai.video.waynelive.debug.DebugLog;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl;
import com.kwai.video.player.AbstractMediaPlayer;
import java.lang.Exception;

public class WayneLivePlayer$3 implements CmdExecutor	// class@000e44
{
    public final WayneLivePlayer this$0;

    public void WayneLivePlayer$3(WayneLivePlayer p0){
       this.this$0 = p0;
       super();
    }
    public void exec(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WayneLivePlayer$3.class, "1")) {
          return;
       }
       DebugLog.i(this.this$0.getTag(), "cmd receive "+p0+" current State: "+this.this$0.getInnerState());
       if (this.this$0.getInnerState() == LivePlayerState.PLAYING && TextUtils.n(p0, "invoke_error")) {
          try{
             String[] stringArray = p1.split(",");
             int i = Integer.parseInt(stringArray[0]);
             int i1 = Integer.parseInt(stringArray[1]);
             DebugLog.i(this.this$0.getTag(), "cmd receive notifyOnerror: "+i+" extra:"+i1);
             this.this$0.mLiveMediaPlayer.notifyOnError(i, i1);
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
          }
       }
    }
}
