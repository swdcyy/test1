package com.kuaishou.live.lite.adapter.component.chat.model.LiveLiteMultiChatModel$c;
import com.kwai.video.waynelive.listeners.LivePlayerTypeChangeListener;
import com.kuaishou.live.lite.adapter.component.chat.model.LiveLiteMultiChatModel;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.chat.model.ChatInfo;

public final class LiveLiteMultiChatModel$c implements LivePlayerTypeChangeListener	// class@001d78
{
    public final LiveLiteMultiChatModel b;

    public void LiveLiteMultiChatModel$c(LiveLiteMultiChatModel p0){
       this.b = p0;
       super();
    }
    public final void onLiveTypeChange(int p0){
       LiveFlvStream$LiveChatViewPostionMessage[] liveChatView;
       LiveLiteMultiChatModel$c uoc = LiveLiteMultiChatModel$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       if (p0 != 1) {
          b.Z(LiveLiteLogTag.LITE_MULTI_CHAT, "receive stream type not overlay, but type is "+p0);
          LiveLiteMultiChatModel$c tb = this.b;
          ChatInfo uChatInfo = tb.p();
          uChatInfo = (uChatInfo != null)? uChatInfo.c: null;
          tb.b(uChatInfo);
          tb.e = null;
       }
       return;
    }
}
