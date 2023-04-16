package a73.b;
import java.lang.Runnable;
import com.kuaishou.live.lite.adapter.component.chat.model.LiveLiteMultiChatModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.waynelive.LivePlayerController;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.chat.model.ChatInfo;

public final class b implements Runnable	// class@000079
{
    public final LiveLiteMultiChatModel b;

    public void b(LiveLiteMultiChatModel p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "1")) {
          return;
       }
       int currentLiveS = this.b.k.getCurrentLiveStreamType();
       if (currentLiveS != 1) {
          b.Z(LiveLiteLogTag.LITE_MULTI_CHAT, "when resume stream type not overlay, but type is "+currentLiveS+", try end.");
          b tb = this.b;
          ChatInfo uChatInfo = tb.p();
          if (uChatInfo != null) {
             objArray = uChatInfo.c;
          }
          tb.b(objArray);
       }
       return;
    }
}
