package com.kuaishou.live.audience.component.gift.customgift.LiveAudienceCustomGiftPresenter$infoManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.audience.component.gift.customgift.LiveAudienceCustomGiftPresenter;
import java.lang.Object;
import yy0.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import c12.f;
import kotlin.jvm.internal.a;
import p91.m;

public final class LiveAudienceCustomGiftPresenter$infoManager$2 extends Lambda implements a	// class@000ade
{
    public final LiveAudienceCustomGiftPresenter this$0;

    public void LiveAudienceCustomGiftPresenter$infoManager$2(LiveAudienceCustomGiftPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final b invoke(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceCustomGiftPresenter$infoManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       f y = this.this$0.y;
       a.o(y, "mBasicContext");
       String liveStreamId = y.getLiveStreamId();
       a.o(liveStreamId, "mBasicContext.liveStreamId");
       return new b(liveStreamId);
    }
}
