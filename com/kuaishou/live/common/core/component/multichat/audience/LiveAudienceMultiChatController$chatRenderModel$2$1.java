package com.kuaishou.live.common.core.component.multichat.audience.LiveAudienceMultiChatController$chatRenderModel$2$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multichat.audience.LiveAudienceMultiChatController$chatRenderModel$2;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.multichat.audience.LiveAudienceMultiChatController;
import com.kuaishou.live.common.core.component.multichat.audience.core.LiveAudienceMultiChatCoreModel;
import java.util.Objects;
import kp1.a;
import com.kuaishou.live.common.core.component.multichat.core.statemachine.MultiChatState;

public final class LiveAudienceMultiChatController$chatRenderModel$2$1 extends Lambda implements a	// class@0014b9
{
    public final LiveAudienceMultiChatController$chatRenderModel$2 this$0;

    public void LiveAudienceMultiChatController$chatRenderModel$2$1(LiveAudienceMultiChatController$chatRenderModel$2 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveAudienceMultiChatCoreModel obj = PatchProxy.apply(objArray, this, LiveAudienceMultiChatController$chatRenderModel$2$1.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = LiveAudienceMultiChatController.V2(this.this$0.this$0);
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, LiveAudienceMultiChatCoreModel.class, "9");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(obj.D().u() == MultiChatState.CHATTING){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}
