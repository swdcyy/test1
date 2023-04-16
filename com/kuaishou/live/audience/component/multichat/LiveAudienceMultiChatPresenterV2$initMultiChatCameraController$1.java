package com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2$initMultiChatCameraController$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import nw1.b;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAudienceMultiChatPresenterV2$initMultiChatCameraController$1 extends Lambda implements a	// class@000ba0
{
    public final b $prettifyService;

    public void LiveAudienceMultiChatPresenterV2$initMultiChatCameraController$1(b p0){
       this.$prettifyService = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPresenterV2$initMultiChatCameraController$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.$prettifyService.isFrontCamera();
    }
}
