package com.yxcorp.gifshow.message.init.IMInitModule$a;
import android.app.Application$ActivityLifecycleCallbacks;
import com.yxcorp.gifshow.message.init.IMInitModule;
import java.lang.Object;
import android.app.Activity;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.yxcorp.gifshow.w;
import hdb.o;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Runnable;
import android.os.Handler;
import android.app.Application;

public class IMInitModule$a implements Application$ActivityLifecycleCallbacks	// class@001d48
{
    public final IMInitModule b;

    public void IMInitModule$a(IMInitModule p0){
       this.b = p0;
       super();
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       Object[] objArray1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IMInitModule$a.class, "1")) {
          return;
       }
       if (IMInitModule.v) {
          return;
       }
       int launchSource = b.a(-1343064608).getLaunchSource();
       Object[] objArray = new Object[0];
       o.D().s("AJian", "onActivityCreated launchSource:"+launchSource, objArray);
       this.b.l0();
       if (4 == launchSource) {
          IMInitModule$a tb = this.b;
          tb.s.removeCallbacks(tb.r);
          tb = this.b;
          tb.s.postDelayed(tb.r, 4000);
          objArray1 = new Object[0];
          o.D().s("AJian", "onActivityCreated: Init in 4000", objArray1);
       }else if(6 == launchSource){
          Object[] objArray2 = new Object[0];
          o.D().s("AJian", "从push启动，删除消息队列postDelayed消息，立即初始化imsdk", objArray2);
          IMInitModule$a tb1 = this.b;
          tb1.s.removeCallbacks(tb1.r);
          this.b.n0(p0.getApplication());
       }else {
          objArray1 = new Object[0];
          o.D().s("AJian", "非push启动，等待postDelayed消息", objArray1);
       }
       return;
    }
    public void onActivityDestroyed(Activity p0){
    }
    public void onActivityPaused(Activity p0){
    }
    public void onActivityResumed(Activity p0){
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
    }
    public void onActivityStarted(Activity p0){
    }
    public void onActivityStopped(Activity p0){
    }
}
