package com.kuaishou.live.audience.component.chat.single.BaseLiveAudienceSingleChatPresenter$d;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.chat.single.BaseLiveAudienceSingleChatPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ea1.b;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.basic.optimizeui.ViewElement;
import android.view.View;
import ea1.b$a;

public final class BaseLiveAudienceSingleChatPresenter$d implements Runnable	// class@000a87
{
    public final BaseLiveAudienceSingleChatPresenter b;

    public void BaseLiveAudienceSingleChatPresenter$d(BaseLiveAudienceSingleChatPresenter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, BaseLiveAudienceSingleChatPresenter$d.class, "1")) {
          return;
       }
       b$a a = b.a;
       BaseLiveAudienceSingleChatPresenter j = this.b.J;
       if (j == null) {
          a.S("chatSmallScreenContainer");
       }
       a.a(j, ViewElement.CHAT_SMALL_SCREEN);
       return;
    }
}
