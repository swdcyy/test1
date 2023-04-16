package com.kwai.android.common.ext.ContextExtKt;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.android.common.utils.ProcessUtil;
import msd.a;
import android.os.Looper;
import java.lang.Thread;
import android.os.Handler;
import com.kwai.android.common.ext.ContextExtKt$runOnUiThread$1;
import java.lang.Runnable;

public final class ContextExtKt	// class@00098e
{

    public static final String getProcessName(Context p0){
       a.p(p0, "$this$getProcessName");
       String currentProce = ProcessUtil.getCurrentProcessName(p0);
       if (currentProce != null) {
       }else {
          currentProce = "unknown";
       }
       return currentProce;
    }
    public static final boolean isChildProcess(Context p0,String p1){
       a.p(p0, "$this$isChildProcess");
       a.p(p1, "childProcessFullName");
       return a.g(p1, ProcessUtil.getCurrentProcessName(p0));
    }
    public static final boolean isMainProcess(Context p0){
       a.p(p0, "$this$isMainProcess");
       return a.g(p0.getPackageName(), ProcessUtil.getCurrentProcessName(p0));
    }
    public static final void runOnUiThread(a p0){
       a.p(p0, "action");
       Looper mainLooper = Looper.getMainLooper();
       a.o(mainLooper, "Looper.getMainLooper\(\)");
       if (a.g(mainLooper.getThread(), Thread.currentThread())) {
          p0.invoke();
       }else {
          new Handler(Looper.getMainLooper()).post(new ContextExtKt$runOnUiThread$1(p0));
       }
       return;
    }
}
