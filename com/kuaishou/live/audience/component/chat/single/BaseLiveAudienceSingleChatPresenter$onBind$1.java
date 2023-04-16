package com.kuaishou.live.audience.component.chat.single.BaseLiveAudienceSingleChatPresenter$onBind$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.audience.component.chat.single.BaseLiveAudienceSingleChatPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import t02.a0;
import com.kuaishou.android.live.model.QLivePlayConfig;

public final class BaseLiveAudienceSingleChatPresenter$onBind$1 extends Lambda implements a	// class@000a8b
{
    public final BaseLiveAudienceSingleChatPresenter this$0;

    public void BaseLiveAudienceSingleChatPresenter$onBind$1(BaseLiveAudienceSingleChatPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, BaseLiveAudienceSingleChatPresenter$onBind$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return BaseLiveAudienceSingleChatPresenter.P8(this.this$0).e.mIsFromLiveMate;
    }
}
