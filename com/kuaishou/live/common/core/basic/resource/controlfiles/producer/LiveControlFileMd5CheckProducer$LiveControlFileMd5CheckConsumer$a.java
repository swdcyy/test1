package com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$a;
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

public final class LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$a extends a implements CoroutineExceptionHandler	// class@000ece
{

    public void LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$a(CoroutineContext$b p0){
       super(p0);
    }
    public void handleException(CoroutineContext p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$a.class, "1")) {
          return;
       }
       b.B(LiveLogTag.LIVE_RESOURCE, "got an unexpected exception when check md5 e = "+p1);
       return;
    }
}
