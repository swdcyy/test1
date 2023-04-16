package com.kwai.framework.download.e;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.framework.download.DownloadManagerInitModule;
import com.yxcorp.download.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mu8.q;

public final class e implements Runnable	// class@001539
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void run(){
       g og = g.c();
       _monitor_enter(og);
       if (PatchProxy.applyVoid(null, og, g.class, "5")) {
          _monitor_exit(og);
       }else if(og.b.c()){
          q oq = q.b(og.b.a());
          oq.a = oq.a & 0xfe;
          og.a(oq);
       }
       _monitor_exit(og);
       return;
    }
}
