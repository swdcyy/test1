package com.frog.engine.network.perflogger.KsFrogPerfReportManager$a;
import java.lang.Runnable;
import com.frog.engine.network.perflogger.KsFrogPerfReportManager;
import com.frog.engine.FrogCommonListener;
import com.frog.engine.jsobject.FrogLoggerObject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;

public class KsFrogPerfReportManager$a implements Runnable	// class@001550
{
    public final FrogCommonListener a;
    public final FrogLoggerObject b;

    public void KsFrogPerfReportManager$a(KsFrogPerfReportManager p0,FrogCommonListener p1,FrogLoggerObject p2){
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, KsFrogPerfReportManager$a.class, "1")) {
          return;
       }
       this.a.onReportPerformanceWithKey(this.b.getEvent(), this.b.getValues());
       return;
    }
}
