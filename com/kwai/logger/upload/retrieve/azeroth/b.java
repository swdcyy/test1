package com.kwai.logger.upload.retrieve.azeroth.b;
import com.kwai.logger.upload.retrieve.azeroth.h;
import java.lang.Object;
import com.kwai.logger.upload.retrieve.azeroth.ObiwanConfig$Task;
import java.lang.StringBuilder;
import java.lang.String;
import t87.f;
import android.content.Context;
import a97.g;
import t87.d;
import com.kwai.logger.upload.retrieve.azeroth.f;
import com.kwai.logger.upload.retrieve.azeroth.c;
import t87.c;
import com.kwai.logger.upload.internal.s;

public final class b implements h	// class@000d34
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final void a(ObiwanConfig$Task p0){
       d.a("ObiwanUploader", "AzerothRetriever:upload taks:"+p0.taskId+",current proc:"+g.a(f.d));
       f uof = f.b();
       _monitor_enter(uof);
       uof.e = true;
       _monitor_exit(uof);
       s.g(p0.taskId, p0.extraInfo, "SHORT_LOG_RETRIEVE", new c());
    }
}
