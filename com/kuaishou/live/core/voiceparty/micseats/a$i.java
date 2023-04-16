package com.kuaishou.live.core.voiceparty.micseats.a$i;
import erd.g;
import com.kuaishou.live.core.voiceparty.micseats.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class a$i implements g	// class@00156b
{
    public final a b;

    public void a$i(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$i.class, "1")) {
       }else {
          b.I(LiveVoicePartyLogTag.TEAM_PK_AUDIENCE, "requestToJoinPk failed", p0);
          ExceptionHandler.handleException(a.b(), p0);
          this.b.p();
       }
       return;
    }
}
