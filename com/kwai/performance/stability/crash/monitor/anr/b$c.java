package com.kwai.performance.stability.crash.monitor.anr.b$c;
import java.lang.Thread;
import com.kwai.performance.stability.crash.monitor.anr.b;
import java.lang.String;
import java.lang.Runnable;
import com.kwai.performance.stability.crash.monitor.util.AnrWithJvmtiHelper;
import java.lang.Boolean;
import java.lang.Object;
import com.kwai.performance.stability.crash.monitor.message.AnrExtraDump;
import java.lang.Throwable;

public class b$c extends Thread	// class@0011b3
{
    public final Runnable b;
    public final b c;

    public void b$c(b p0,String p1,Runnable p2){
       this.c = p0;
       this.b = p2;
       super(p1);
    }
    public void run(){
       this.c.l.addExtraInfo("isJvmtiAgentInit", Boolean.valueOf(AnrWithJvmtiHelper.d()));
       this.b.run();
       return;
    }
}
