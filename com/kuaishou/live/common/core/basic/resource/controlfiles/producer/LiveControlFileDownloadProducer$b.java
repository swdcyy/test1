package com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileDownloadProducer$b;
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

public final class LiveControlFileDownloadProducer$b extends a implements CoroutineExceptionHandler	// class@000ec6
{

    public void LiveControlFileDownloadProducer$b(CoroutineContext$b p0){
       super(p0);
    }
    public void handleException(CoroutineContext p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveControlFileDownloadProducer$b.class, "1")) {
          return;
       }
       b.B(LiveLogTag.LIVE_RESOURCE, "got an unexpected exception when download e = "+p1);
       return;
    }
}
