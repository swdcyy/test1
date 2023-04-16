package com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileStatisticProducer$LiveControlFileStatisticConsumer$a;
import kotlinx.coroutines.CoroutineExceptionHandler;
import asd.a;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveControlFileStatisticProducer$LiveControlFileStatisticConsumer$a extends a implements CoroutineExceptionHandler	// class@000ed3
{

    public void LiveControlFileStatisticProducer$LiveControlFileStatisticConsumer$a(CoroutineContext$b p0){
       super(p0);
    }
    public void handleException(CoroutineContext p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveControlFileStatisticProducer$LiveControlFileStatisticConsumer$a.class, "1")) {
          return;
       }
       b.B(LiveLogTag.LIVE_RESOURCE, "got an unexpected exception when statistic result e = "+p1);
       return;
    }
}
