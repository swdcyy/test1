package com.kwai.middleware.skywalker.ext.ContextExtKt$observeBroadcasts$1$receiver$1;
import android.content.BroadcastReceiver;
import brd.v;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import brd.g;

public final class ContextExtKt$observeBroadcasts$1$receiver$1 extends BroadcastReceiver	// class@000f5e
{
    public final v a;

    public void ContextExtKt$observeBroadcasts$1$receiver$1(v p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       a.q(p0, "context");
       a.q(p1, "intent");
       this.a.onNext(p1);
    }
}
