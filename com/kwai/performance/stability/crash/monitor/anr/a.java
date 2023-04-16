package com.kwai.performance.stability.crash.monitor.anr.a;
import com.kwai.performance.stability.crash.monitor.anr.c$a;
import com.kwai.performance.stability.crash.monitor.anr.b;
import java.lang.Object;
import com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue$PackedRecord;
import mg7.c;
import java.lang.Runnable;

public final class a implements c$a	// class@000df7
{
    public final b a;

    public void a(b p0){
       this.a = p0;
    }
    public final void a(LogRecordQueue$PackedRecord p0){
       a ta = this.a;
       ta.t(new c(ta, p0));
    }
}
