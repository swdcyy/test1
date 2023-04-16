package com.kwai.performance.stability.oom.monitor.analysis.AnalysisReceiver;
import android.os.ResultReceiver;
import com.kwai.performance.stability.oom.monitor.analysis.AnalysisReceiver$a;
import nsd.u;
import android.os.Handler;
import com.kwai.performance.stability.oom.monitor.analysis.AnalysisReceiver$b;
import android.os.Bundle;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class AnalysisReceiver extends ResultReceiver	// class@001258
{
    public AnalysisReceiver$b b;
    public static final AnalysisReceiver$a c;

    static {
       AnalysisReceiver.c = new AnalysisReceiver$a(null);
    }
    public void AnalysisReceiver(){
       super(null);
    }
    public final void a(AnalysisReceiver$b p0){
       this.b = p0;
    }
    public void onReceiveResult(int p0,Bundle p1){
       super.onReceiveResult(p0, p1);
       AnalysisReceiver tb = this.b;
       if (tb != null) {
          if (p0 == 1001) {
             a.m(tb);
             tb.onSuccess();
          }else {
             a.m(tb);
             tb.onError();
          }
       }
       return;
    }
}
