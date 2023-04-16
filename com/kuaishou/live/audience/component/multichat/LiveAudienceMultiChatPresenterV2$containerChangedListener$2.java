package com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2$containerChangedListener$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2;
import android.view.View$OnLayoutChangeListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2$containerChangedListener$2$a;

public final class LiveAudienceMultiChatPresenterV2$containerChangedListener$2 extends Lambda implements a	// class@000b9e
{
    public final LiveAudienceMultiChatPresenterV2 this$0;

    public void LiveAudienceMultiChatPresenterV2$containerChangedListener$2(LiveAudienceMultiChatPresenterV2 p0){
       this.this$0 = p0;
       super(0);
    }
    public final View$OnLayoutChangeListener invoke(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPresenterV2$containerChangedListener$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveAudienceMultiChatPresenterV2$containerChangedListener$2$a(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
