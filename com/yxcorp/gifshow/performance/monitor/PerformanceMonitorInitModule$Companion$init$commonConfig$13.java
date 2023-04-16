package com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$Companion$init$commonConfig$13;
import msd.l;
import kotlin.jvm.internal.Lambda;
import android.app.Application;
import java.lang.String;
import java.io.File;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import o56.a;
import android.content.Context;
import j80.f;
import wkd.b;
import j80.c;
import java.lang.StringBuilder;

public final class PerformanceMonitorInitModule$Companion$init$commonConfig$13 extends Lambda implements l	// class@001283
{
    public final Application $application;

    public void PerformanceMonitorInitModule$Companion$init$commonConfig$13(Application p0){
       this.$application = p0;
       super(1);
    }
    public final File invoke(String p0){
       File uFile1;
       File obj = PatchProxy.applyOneRefs(p0, this, PerformanceMonitorInitModule$Companion$init$commonConfig$13.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       int i = p0.hashCode();
       if (i != 0x1ae8d) {
          if (i == 0x584fd04f) {
             String str = "exception";
             if (p0.equals(str)) {
                uFile1 = new File(f.b(a.b()), str);
                uFile1.mkdirs();
             label_0087 :
                return uFile1;
             }
          }
       }else if(p0.equals("oom")){
          uFile1 = new File(b.a(-1504323719).n(), "performance");
          uFile1.mkdirs();
          goto label_0087 ;
       }
       obj = this.$application.getExternalFilesDir("");
       if (obj == null) {
          obj = this.$application.getFilesDir();
       }
       File uFile = new File(obj, "performance/"+p0);
       uFile.mkdirs();
       uFile1 = uFile;
       goto label_0087 ;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
