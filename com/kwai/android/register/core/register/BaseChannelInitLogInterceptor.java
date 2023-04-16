package com.kwai.android.register.core.register.BaseChannelInitLogInterceptor;
import com.kwai.android.register.core.register.BaseChannelInterceptor;
import com.kwai.android.register.core.register.RegisterChain;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import com.kwai.android.common.intercept.Chain;
import com.kwai.android.common.exceptions.RegisterFailureException;
import p45.c;
import com.kwai.android.pushlog.PushLogger;
import com.kwai.android.common.bean.Channel;
import android.os.SystemClock;
import java.lang.StringBuilder;
import com.kwai.android.common.utils.PushLogcat;

public abstract class BaseChannelInitLogInterceptor extends BaseChannelInterceptor	// class@0009f3
{

    public void BaseChannelInitLogInterceptor(){
       super();
    }
    public final void logNotification(RegisterChain p0,long p1){
       String str2;
       PushLogcat iNSTANCE;
       StringBuilder str3;
       Throwable exception;
       a.p(p0, "chain");
       long l = -1;
       String str = null;
       if (p0.getException() == null || p0.getException() instanceof RegisterFailureException) {
          if (!p1 - str) {
             PushLogger.b().g(p0.getChannel(), l);
          }else {
             PushLogger.b().g(p0.getChannel(), (SystemClock.elapsedRealtime() - p1));
          }
       }else if(!p1 - str){
          PushLogger.b().f(p0.getChannel(), l, p0.getException());
       }else {
          PushLogger.b().f(p0.getChannel(), (SystemClock.elapsedRealtime() - p1), p0.getException());
       }
       String str1 = null;
       if (!p1 - str) {
          str2 = "Register Process cost:-1ms isAbortChain:"+p0.isAbort();
          if (p0.getException() != null && !p0.getException() instanceof RegisterFailureException) {
             iNSTANCE = PushLogcat.INSTANCE;
             str3 = str2+" error:";
             exception = p0.getException();
             if (exception != null) {
                str1 = exception.getMessage();
             }
             iNSTANCE.e("KwaiPushSDK", str3+str1, p0.getException());
          }else {
             PushLogcat.INSTANCE.i("KwaiPushSDK", str2);
          }
       }else {
          str2 = "Register Process cost:"+(SystemClock.elapsedRealtime() - p1)+"ms isAbortChain:"+p0.isAbort();
          if (p0.getException() != null && !p0.getException() instanceof RegisterFailureException) {
             iNSTANCE = PushLogcat.INSTANCE;
             str3 = str2+"  error:";
             exception = p0.getException();
             if (exception != null) {
                str1 = exception.getMessage();
             }
             iNSTANCE.e("KwaiPushSDK", str3+str1, p0.getException());
          }else {
             PushLogcat.INSTANCE.i("KwaiPushSDK", str2);
          }
       }
       return;
    }
}
