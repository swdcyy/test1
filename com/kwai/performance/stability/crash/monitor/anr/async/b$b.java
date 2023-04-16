package com.kwai.performance.stability.crash.monitor.anr.async.b$b;
import java.lang.Thread;
import com.kwai.performance.stability.crash.monitor.anr.async.b;
import java.lang.String;
import java.io.File;
import android.util.Printer;
import java.lang.StringBuffer;
import android.os.Looper;
import android.os.Handler;
import com.kwai.performance.stability.crash.monitor.anr.config.AsyncScheduleConfig;
import java.lang.Object;
import com.kwai.performance.stability.crash.monitor.util.e;

public class b$b extends Thread	// class@0011a7
{
    public final File b;
    public final Printer c;
    public final StringBuffer d;
    public final b e;

    public void b$b(b p0,String p1,File p2,Printer p3,StringBuffer p4){
       this.e = p0;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super(p1);
    }
    public void run(){
       File uFile = new File(this.b, "async_sched_queue");
       this.e.d.getLooper().dump(this.c, "\nAsyncHandler ");
       StringBuffer str = this.d+"\n";
       b f = this.e.f;
       if (f != null) {
          f.getLooper().dump(this.c, "\nCheckHandler ");
       }else {
          str = this.d+"CheckHandler is null";
       }
       str = this.d;
       if (this.e.b.tempReportForDebug != null) {
          e.v("AsyncSchedule.Queue", str);
       }
       e.B(uFile, str, false);
       return;
    }
}
