package com.yxcorp.gifshow.longinus.LonginusJobService$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.longinus.LonginusJobService;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.longinus.LonginusWorkManager;
import android.content.Context;
import android.app.job.JobService;
import kotlin.jvm.internal.a;

public final class LonginusJobService$a implements Runnable	// class@001b6d
{
    public final LonginusJobService b;

    public void LonginusJobService$a(LonginusJobService p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LonginusJobService$a.class, "1")) {
          return;
       }
       Context applicationC = this.b.getApplicationContext();
       a.o(applicationC, "this.applicationContext");
       LonginusWorkManager.a.a(applicationC);
       return;
    }
}
