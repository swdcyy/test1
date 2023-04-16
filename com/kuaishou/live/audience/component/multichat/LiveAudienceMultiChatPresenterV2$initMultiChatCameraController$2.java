package com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2$initMultiChatCameraController$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2;
import xp5.i;
import dp1.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import h02.b;
import op1.c;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import java.util.Map;
import dp1.b;

public final class LiveAudienceMultiChatPresenterV2$initMultiChatCameraController$2 extends Lambda implements a	// class@000ba1
{
    public final i $logService;
    public final LiveAudienceMultiChatPresenterV2 this$0;

    public void LiveAudienceMultiChatPresenterV2$initMultiChatCameraController$2(LiveAudienceMultiChatPresenterV2 p0,i p1){
       this.this$0 = p0;
       this.$logService = p1;
       super(0);
    }
    public final d invoke(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPresenterV2$initMultiChatCameraController$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       String id = qCurrentUser.getId();
       a.o(id, "QCurrentUser.me\(\).id");
       return d.a(-204054297).Qo(new c(this.$logService, this.this$0.k9(id)));
    }
    public Object invoke(){
       return this.invoke();
    }
}
