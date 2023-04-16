package com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$a;
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

public final class LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$a extends a implements CoroutineExceptionHandler	// class@000ed7
{

    public void LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$a(CoroutineContext$b p0){
       super(p0);
    }
    public void handleException(CoroutineContext p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$a.class, "1")) {
          return;
       }
       b.B(LiveLogTag.LIVE_RESOURCE, "got an exception when unzip e = "+p1);
       return;
    }
}
