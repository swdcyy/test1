package com.yxcorp.gifshow.longinus.LonginusJobService;
import android.app.job.JobService;
import android.app.job.JobParameters;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.longinus.LonginusJobService$a;
import java.lang.Runnable;
import f97.d;

public final class LonginusJobService extends JobService	// class@001b6e
{

    public void LonginusJobService(){
       super();
    }
    public boolean onStartJob(JobParameters p0){
       p0 = PatchProxy.applyOneRefs(p0, this, LonginusJobService.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       d.b(new LonginusJobService$a(this));
       return false;
    }
    public boolean onStopJob(JobParameters p0){
       return false;
    }
}
