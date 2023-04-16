package com.kuaishou.live.lite.adapter.component.merchat.LiteChatForbiddenMerchantController$watchChatEnd$listener$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import e83.b;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveStreamAuthorChatMessages$SCAuthorChatEnd;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import cc3.a;

public final class LiteChatForbiddenMerchantController$watchChatEnd$listener$1 extends Lambda implements l	// class@001df2
{
    public final b this$0;

    public void LiteChatForbiddenMerchantController$watchChatEnd$listener$1(b p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LiveStreamAuthorChatMessages$SCAuthorChatEnd p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiteChatForbiddenMerchantController$watchChatEnd$listener$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       this.this$0.k.c();
       return;
    }
}
