package com.kwai.android.dispatcher.KwaiPush$coreInitInternal$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.kwai.android.dispatcher.KwaiPush;
import asd.c;
import java.lang.Object;
import android.app.Application;
import com.kwai.android.dispatcher.PushConfig;

public final class KwaiPush$coreInitInternal$1 extends ContinuationImpl	// class@0009ad
{
    public int label;
    public Object result;
    public final KwaiPush this$0;

    public void KwaiPush$coreInitInternal$1(KwaiPush p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.coreInitInternal(null, null, this);
    }
}
