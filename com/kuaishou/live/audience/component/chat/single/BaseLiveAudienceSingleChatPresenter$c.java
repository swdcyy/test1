package com.kuaishou.live.audience.component.chat.single.BaseLiveAudienceSingleChatPresenter$c;
import oq5.c;
import com.kuaishou.live.audience.component.chat.single.BaseLiveAudienceSingleChatPresenter;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class BaseLiveAudienceSingleChatPresenter$c implements c	// class@000a86
{
    public final BaseLiveAudienceSingleChatPresenter b;

    public void BaseLiveAudienceSingleChatPresenter$c(BaseLiveAudienceSingleChatPresenter p0){
       this.b = p0;
       super();
    }
    public final void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseLiveAudienceSingleChatPresenter$c.class, "1")) {
          return;
       }
       a.m(p0);
       this.b.W8(p0);
       return;
    }
}
