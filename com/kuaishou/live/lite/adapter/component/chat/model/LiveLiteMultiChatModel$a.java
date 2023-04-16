package com.kuaishou.live.lite.adapter.component.chat.model.LiveLiteMultiChatModel$a;
import lf3.g;
import com.kuaishou.live.lite.adapter.component.chat.model.LiveLiteMultiChatModel;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatClosed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatBizIdentity;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import lf3.f;

public final class LiveLiteMultiChatModel$a implements g	// class@001d76
{
    public final LiveLiteMultiChatModel b;

    public void LiveLiteMultiChatModel$a(LiveLiteMultiChatModel p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiChatModel$a.class, "1")) {
       }else {
          SCInteractiveChatClosed bizIdentity = p0.bizIdentity;
          if (1 != bizIdentity.bizType) {
             b.Z(LiveLiteLogTag.LITE_MULTI_CHAT, "receive close signal, but type is "+p0.bizIdentity.bizType);
          }else {
             this.b.b(bizIdentity.chatId);
             p0.d = null;
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
