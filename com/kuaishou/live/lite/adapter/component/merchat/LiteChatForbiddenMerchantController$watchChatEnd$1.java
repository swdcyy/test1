package com.kuaishou.live.lite.adapter.component.merchat.LiteChatForbiddenMerchantController$watchChatEnd$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import hf3.a;
import msd.l;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e83.a;
import lf3.g;

public final class LiteChatForbiddenMerchantController$watchChatEnd$1 extends Lambda implements a	// class@001df1
{
    public final l $listener;
    public final a $liveLongConnection;

    public void LiteChatForbiddenMerchantController$watchChatEnd$1(a p0,l p1){
       this.$liveLongConnection = p0;
       this.$listener = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiteChatForbiddenMerchantController$watchChatEnd$1.class, "1")) {
          return;
       }
       LiteChatForbiddenMerchantController$watchChatEnd$1 t$liveLongCo = this.$liveLongConnection;
       LiteChatForbiddenMerchantController$watchChatEnd$1 t$listener = this.$listener;
       if (t$listener != null) {
          t$listener = new a(t$listener);
       }
       t$liveLongCo.o(482, t$listener);
       return;
    }
}
