package com.kuaishou.live.audience.component.multichat.playview.LiveAudienceMultiChatPlayerViewTransformer$playerViewWrapper$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.audience.component.multichat.playview.LiveAudienceMultiChatPlayerViewTransformer;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ekd.m1;

public final class LiveAudienceMultiChatPlayerViewTransformer$playerViewWrapper$2 extends Lambda implements a	// class@000ba8
{
    public final LiveAudienceMultiChatPlayerViewTransformer this$0;

    public void LiveAudienceMultiChatPlayerViewTransformer$playerViewWrapper$2(LiveAudienceMultiChatPlayerViewTransformer p0){
       this.this$0 = p0;
       super(0);
    }
    public final View invoke(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPlayerViewTransformer$playerViewWrapper$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return m1.f(this.this$0.w, 0x7f0a30e6);
    }
    public Object invoke(){
       return this.invoke();
    }
}
