package com.kwai.performance.stability.crash.monitor.CrashMonitor_ExcludedExceptionKt$excludedSpecialRomException$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import java.lang.Object;
import qrd.l1;
import yf7.i;
import vg7.d;
import java.lang.String;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;

public final class CrashMonitor_ExcludedExceptionKt$excludedSpecialRomException$1$1 extends Lambda implements a	// class@001193
{
    public final ExceptionMessage $message;

    public void CrashMonitor_ExcludedExceptionKt$excludedSpecialRomException$1$1(ExceptionMessage p0){
       this.$message = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       String str = d.j.q(this.$message);
       a.o(str, "RAW_GSON.toJson\(message\)");
       i.a.b(str, 2, null);
    }
}
