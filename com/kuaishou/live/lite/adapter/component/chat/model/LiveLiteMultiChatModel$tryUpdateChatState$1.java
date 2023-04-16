package com.kuaishou.live.lite.adapter.component.chat.model.LiveLiteMultiChatModel$tryUpdateChatState$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.chat.model.ChatInfo;
import java.lang.Object;
import a73.c;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveLiteMultiChatModel$tryUpdateChatState$1 extends Lambda implements l	// class@001d7d
{
    public final ChatInfo $chatInfo;

    public void LiveLiteMultiChatModel$tryUpdateChatState$1(ChatInfo p0){
       this.$chatInfo = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiChatModel$tryUpdateChatState$1.class, "1")) {
          return;
       }
       a.p(p0, "observer");
       p0.g(this.$chatInfo);
       return;
    }
}
