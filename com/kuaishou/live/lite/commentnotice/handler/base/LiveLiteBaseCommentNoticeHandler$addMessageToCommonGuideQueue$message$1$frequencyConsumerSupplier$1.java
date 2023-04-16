package com.kuaishou.live.lite.commentnotice.handler.base.LiveLiteBaseCommentNoticeHandler$addMessageToCommonGuideQueue$message$1$frequencyConsumerSupplier$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.commentnotice.handler.base.LiveLiteBaseCommentNoticeHandler$addMessageToCommonGuideQueue$message$1;
import java.lang.Object;
import com.kuaishou.live.basic.model.LiveMessageFrequencyConfig$FrequencyConfig;
import v91.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ia3.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Iterable;
import v91.a;
import kotlin.jvm.internal.a;

public final class LiveLiteBaseCommentNoticeHandler$addMessageToCommonGuideQueue$message$1$frequencyConsumerSupplier$1 extends Lambda implements p	// class@00085a
{
    public final LiveLiteBaseCommentNoticeHandler$addMessageToCommonGuideQueue$message$1 this$0;

    public void LiveLiteBaseCommentNoticeHandler$addMessageToCommonGuideQueue$message$1$frequencyConsumerSupplier$1(LiveLiteBaseCommentNoticeHandler$addMessageToCommonGuideQueue$message$1 p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final b invoke(LiveMessageFrequencyConfig$FrequencyConfig p0,LiveMessageFrequencyConfig$FrequencyConfig p1){
       LiveLiteBaseCommentNoticeHandler$addMessageToCommonGuideQueue$message$1$frequencyConsumerSupplier$1 tthis$0;
       b[] obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveLiteBaseCommentNoticeHandler$addMessageToCommonGuideQueue$message$1$frequencyConsumerSupplier$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b[]{this.this$0.c.d(p0),tthis$0.c.e(p1, tthis$0.d)};
       tthis$0 = this.this$0;
       b uob = a.a(CollectionsKt__CollectionsKt.L(obj));
       a.o(uob, "ILiveFrequencyConsumer.c¡­            \)\n          \)");
       return uob;
    }
}
