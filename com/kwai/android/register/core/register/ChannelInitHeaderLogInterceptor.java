package com.kwai.android.register.core.register.ChannelInitHeaderLogInterceptor;
import com.kwai.android.register.core.register.BaseChannelInitLogInterceptor;
import com.kwai.android.common.intercept.Chain;
import com.kwai.android.register.core.register.RegisterChain;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import java.util.Map;
import java.lang.Boolean;
import java.lang.Long;
import p45.c;
import com.kwai.android.pushlog.PushLogger;
import com.kwai.android.common.bean.Channel;
import android.os.SystemClock;

public final class ChannelInitHeaderLogInterceptor extends BaseChannelInitLogInterceptor	// class@0009f6
{
    public final long initTimeStamp;

    public void ChannelInitHeaderLogInterceptor(long p0){
       super();
       this.initTimeStamp = p0;
    }
    public void intercept(Chain p0){
       this.intercept(p0);
    }
    public void intercept(RegisterChain p0){
       a.p(p0, "chain");
       p0.proceed();
       if (p0.getException() != null) {
          this.logNotification(p0, this.initTimeStamp);
       }else {
          p0.getInternalParam$lib_register_release().put("isAbort", Boolean.valueOf(p0.isAbort()));
          if (!p0.isAbort()) {
             this.logNotification(p0, this.initTimeStamp);
          }else {
             p0.getInternalParam$lib_register_release().put("initTimeStamp", Long.valueOf(this.initTimeStamp));
             PushLogger.b().e(p0.getChannel(), (SystemClock.elapsedRealtime() - this.initTimeStamp));
          }
       }
       return;
    }
}
