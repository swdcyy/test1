package com.kwai.performance.fluency.page.monitor.checker.FullyDrawTagChecker$b;
import android.os.Handler;
import com.kwai.performance.fluency.page.monitor.checker.FullyDrawTagChecker;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import gf7.a;
import hf7.a;
import com.kwai.performance.fluency.page.monitor.checker.FullyDrawTagChecker$b$a;
import java.lang.Runnable;
import hf7.a$a;

public final class FullyDrawTagChecker$b extends Handler	// class@0010b8
{
    public final FullyDrawTagChecker a;

    public void FullyDrawTagChecker$b(FullyDrawTagChecker p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       a.p(p0, "msg");
       if (a.g(p0.obj, FullyDrawTagChecker.e)) {
          FullyDrawTagChecker b = this.a.b;
          if (b != null && (b == null || b.g() != true)) {
             a.c(a.d, new FullyDrawTagChecker$b$a(this), null, 2, null);
          }
       }
       return;
    }
}
