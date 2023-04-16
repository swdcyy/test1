package com.kuaishou.live.audience.component.chat.multi.BaseLiveAudienceMultiChatPresenter$c;
import oq5.c;
import com.kuaishou.live.audience.component.chat.multi.BaseLiveAudienceMultiChatPresenter;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import ox0.o;

public final class BaseLiveAudienceMultiChatPresenter$c implements c	// class@000a7b
{
    public final BaseLiveAudienceMultiChatPresenter b;

    public void BaseLiveAudienceMultiChatPresenter$c(BaseLiveAudienceMultiChatPresenter p0){
       this.b = p0;
       super();
    }
    public final void onConfigurationChanged(Configuration p0){
       BaseLiveAudienceMultiChatPresenter a;
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseLiveAudienceMultiChatPresenter$c.class, "1")) {
          return;
       }
       BaseLiveAudienceMultiChatPresenter$c tb = this.b;
       a.m(p0);
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, BaseLiveAudienceMultiChatPresenter.class, "14")) {
          a.p(p0, "newConfig");
          a = tb.A;
          if (a == null) {
             a.S("liveAudienceChatPlayViewLogic");
          }
          a.g();
       }
       return;
    }
}
