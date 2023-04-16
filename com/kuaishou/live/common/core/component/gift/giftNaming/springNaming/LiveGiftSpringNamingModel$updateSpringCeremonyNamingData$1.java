package com.kuaishou.live.common.core.component.gift.giftNaming.springNaming.LiveGiftSpringNamingModel$updateSpringCeremonyNamingData$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.gift.giftNaming.springNaming.LiveGiftSpringNamingModel;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveGiftTitleInfo;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import xp5.g;
import kotlin.jvm.internal.a;

public final class LiveGiftSpringNamingModel$updateSpringCeremonyNamingData$1 extends Lambda implements l	// class@0012c5
{
    public final LiveGiftSpringNamingModel this$0;

    public void LiveGiftSpringNamingModel$updateSpringCeremonyNamingData$1(LiveGiftSpringNamingModel p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(LiveGiftTitleInfo p0){
       String str;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGiftSpringNamingModel$updateSpringCeremonyNamingData$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p0 = p0.namingUser;
       if (p0 != null) {
          str = String.valueOf(p0.userId);
          if (str != null) {
          label_0022 :
             return a.g(String.valueOf(this.this$0.j.d()), str);
          }
       }
       str = "";
       goto label_0022 ;
    }
}
