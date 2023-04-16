package com.kuaishou.live.audience.component.chat.multi.BaseLiveAudienceMultiChatPresenter$d;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.chat.multi.BaseLiveAudienceMultiChatPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ea1.b;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.basic.optimizeui.ViewElement;
import android.view.View;
import ea1.b$a;

public final class BaseLiveAudienceMultiChatPresenter$d implements Runnable	// class@000a7c
{
    public final BaseLiveAudienceMultiChatPresenter b;

    public void BaseLiveAudienceMultiChatPresenter$d(BaseLiveAudienceMultiChatPresenter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, BaseLiveAudienceMultiChatPresenter$d.class, "1")) {
          return;
       }
       b$a a = b.a;
       BaseLiveAudienceMultiChatPresenter i = this.b.I;
       if (i == null) {
          a.S("chatSmallScreenContainer");
       }
       a.a(i, ViewElement.CHAT_SMALL_SCREEN);
       return;
    }
}
