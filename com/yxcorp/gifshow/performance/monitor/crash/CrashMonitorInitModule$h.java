package com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule$h;
import java.lang.Runnable;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import d86.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import d86.d;
import lnc.c9;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import o56.c;
import o56.a;
import android.app.Application;
import java.io.File;
import qkd.b;
import e66.c;
import java.lang.Throwable;
import q87.c;
import mwb.a;
import android.content.Context;
import android.content.SharedPreferences;
import vid.b;
import android.content.SharedPreferences$Editor;
import oe6.g;
import s66.a;

public final class CrashMonitorInitModule$h implements Runnable	// class@0012ab
{
    public final Ref$ObjectRef b;

    public void CrashMonitorInitModule$h(Ref$ObjectRef p0){
       this.b = p0;
       super();
    }
    public final void run(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CrashMonitorInitModule$h.class, "1")) {
          return;
       }
       CrashMonitorInitModule$h tb = this.b;
       d uod = PatchProxy.apply(objArray, objArray, uoc, "3");
       if (uod != PatchProxyResult.class) {
       }else if(c9.b()){
          String str = c9.a();
          if (!TextUtils.x(str)) {
             File uFile = new File(str+"."+a.a().a().getPackageName()+".tid");
             if (uFile.exists() && uFile.isFile()) {
                try{
                   uod = c.e(b.g0(uFile, "utf-8"));
                }catch(java.lang.Exception e3){
                   c.C().z("KMonkeyHelper", "read KSAutomatorTaskData from SDCard failed, e = ", e3);
                }
             }
          }
       }
       tb.element = uod;
       if (this.b.element != null) {
          int i = 0;
          Object[] objArray1 = new Object[i];
          a.C().w("CrashMonitorInitModule", "read KSAutomatorTaskData from SDCard, KSAutomatorTaskID = "+this.b.element.a+", KSAutomatorTaskExtra = "+this.b.element.b, objArray1);
          Ref$ObjectRef element = this.b.element;
          if (!PatchProxy.applyVoidOneRefs(element, objArray, uoc, "6")) {
             g.a(b.c(a.b(), "ks_monkey_test", i).edit().putString("KSAutomatorTaskID", element.a).putString("KSAutomatorTaskExtra", element.b));
          }
          a.d("KSAutomatorTaskID", this.b.element.a);
          a.d("KSAutomatorTaskExtra", this.b.element.b);
       }
       return;
    }
}
