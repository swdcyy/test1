package com.kwai.video.waynelive.wayneplayer.PlayerStateProcessor$mOnErrorListener$1;
import com.kwai.video.waynelive.listeners.LivePlayerErrorListener;
import com.kwai.video.waynelive.wayneplayer.PlayerStateProcessor;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.waynelive.LivePlayerState;

public final class PlayerStateProcessor$mOnErrorListener$1 implements LivePlayerErrorListener	// class@000e30
{
    public final PlayerStateProcessor this$0;

    public void PlayerStateProcessor$mOnErrorListener$1(PlayerStateProcessor p0){
       this.this$0 = p0;
       super();
    }
    public final boolean onError(int p0,int p1){
       PlayerStateProcessor$mOnErrorListener$1 omOnErrorLis = PlayerStateProcessor$mOnErrorListener$1.class;
       if (PatchProxy.isSupport(omOnErrorLis)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, omOnErrorLis, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.this$0.notifyStateChanged(LivePlayerState.ERROR, false);
       return false;
    }
}
