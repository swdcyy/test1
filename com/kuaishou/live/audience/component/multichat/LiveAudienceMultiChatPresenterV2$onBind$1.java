package com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2$onBind$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import aq5.d;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;

public final class LiveAudienceMultiChatPresenterV2$onBind$1 extends Lambda implements a	// class@000ba3
{
    public final LiveAudienceMultiChatPresenterV2 this$0;

    public void LiveAudienceMultiChatPresenterV2$onBind$1(LiveAudienceMultiChatPresenterV2 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPresenterV2$onBind$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return LiveAudienceMultiChatPresenterV2.X8(this.this$0).r2(AudienceBizRelation.RECRUIT_EXPLAIN_PANEL);
    }
}
