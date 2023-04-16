package com.kwai.performance.stability.crash.monitor.internal.JavaCrashHandler$onFakeException$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Throwable;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import android.content.Context;
import java.lang.Object;
import qrd.l1;
import com.kwai.performance.stability.crash.monitor.internal.JavaCrashHandler;
import com.kwai.performance.stability.crash.monitor.message.FakeException;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class JavaCrashHandler$onFakeException$1 extends Lambda implements a	// class@0011e5
{
    public final Context $context;
    public final Throwable $ex;
    public final ExceptionMessage $message;

    public void JavaCrashHandler$onFakeException$1(Throwable p0,ExceptionMessage p1,Context p2){
       this.$ex = p0;
       this.$message = p1;
       this.$context = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Throwable throwable = new FakeException("崩溃保护catch住的异常，和真实崩溃同等优先级处理").append(this.$ex);
       a.o(throwable, "FakeException\(\"崩溃保护catch住的异常，和真实崩溃同等优先级处理\"\).append\(ex\)");
       JavaCrashHandler.r.e(throwable, this.$message, this.$context, true);
    }
}
