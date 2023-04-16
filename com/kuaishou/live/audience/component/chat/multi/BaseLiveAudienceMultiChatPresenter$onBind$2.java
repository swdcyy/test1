package com.kuaishou.live.audience.component.chat.multi.BaseLiveAudienceMultiChatPresenter$onBind$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.audience.component.chat.multi.BaseLiveAudienceMultiChatPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import t02.a0;

public final class BaseLiveAudienceMultiChatPresenter$onBind$2 extends Lambda implements a	// class@000a81
{
    public final BaseLiveAudienceMultiChatPresenter this$0;

    public void BaseLiveAudienceMultiChatPresenter$onBind$2(BaseLiveAudienceMultiChatPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, BaseLiveAudienceMultiChatPresenter$onBind$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return BaseLiveAudienceMultiChatPresenter.P8(this.this$0).l();
    }
}
