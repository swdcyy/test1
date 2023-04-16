package com.kwai.android.dispatcher.SystemPushStateReporter$reportSystemPushStateInAPI$1$1;
import com.android.kwai.foundation.network.IRpcService$Callback;
import java.lang.Object;
import n7.b;
import java.lang.Exception;
import qrd.l1;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Date;
import com.kwai.android.common.config.PushPreference;

public final class SystemPushStateReporter$reportSystemPushStateInAPI$1$1 implements IRpcService$Callback	// class@0009b8
{

    public void SystemPushStateReporter$reportSystemPushStateInAPI$1$1(){
       super();
    }
    public void onComplete(boolean p0){
       b.a(this, p0);
    }
    public void onFailure(Exception p0,Object p1){
       b.b(this, p0, p1);
    }
    public void onSuccess(Object p0){
       this.onSuccess(p0);
    }
    public void onSuccess(l1 p0){
       a.p(p0, "data");
       PushPreference.setLastReportDate(new Date());
    }
}
