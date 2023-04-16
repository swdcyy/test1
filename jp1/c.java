package jp1.c;
import com.kwai.video.waynelive.listeners.LivePlayerRenderListener;
import com.kuaishou.live.common.core.component.multichat.audience.core.LiveAudienceMultiChatCoreModel;
import java.lang.Object;
import jw7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import lp1.d;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;

public final class c implements LivePlayerRenderListener	// class@002bec
{
    public final LiveAudienceMultiChatCoreModel b;

    public void c(LiveAudienceMultiChatCoreModel p0){
       this.b = p0;
       super();
    }
    public void onAudioRenderingStart(){
       a.a(this);
    }
    public void onLivePlayViewShow(){
       a.b(this);
    }
    public void onRenderingStartAfterResume(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       a.c(this);
       b.c0(LiveCommonLogTag.NEW_MULTI_CHAT, "LiveStage onRenderingStartAfterResume playView visible", "commonLogParam", this.b.l());
       this.b.s.l(0);
       this.b.u.removeRenderListener(this);
       return;
    }
    public void onSwitchToAudioStreamFromVideoStream(){
       a.d(this);
    }
    public void onSwitchToVideoStreamFromAudioStream(){
       a.e(this);
    }
    public void onVideoRenderingStart(){
       a.f(this);
    }
}
