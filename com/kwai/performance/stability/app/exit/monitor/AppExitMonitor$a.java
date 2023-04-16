package com.kwai.performance.stability.app.exit.monitor.AppExitMonitor$a;
import java.lang.Object;
import nsd.u;
import msd.l;
import java.util.List;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.Build$VERSION;
import java.util.ArrayList;
import jg7.b;
import android.app.Application;
import yf7.k;
import android.app.ActivityManager;
import java.util.Set;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Iterator;
import android.app.ApplicationExitInfo;
import com.kwai.performance.stability.app.exit.monitor.ApplicationExitInfoMirror;
import java.lang.Exception;

public final class AppExitMonitor$a	// class@00117e
{

    public void AppExitMonitor$a(){
       super();
    }
    public void AppExitMonitor$a(u p0){
       super();
    }
    public final List a(l p0,boolean p1){
       List list;
       a.q(p0, "sharedPreferencesInvoker");
       if (Build$VERSION.SDK_INT < 30) {
          return new ArrayList();
       }
       b b = b.b;
       b.b(p0);
       try{
          ArrayList uArrayList = new ArrayList();
          ActivityManager systemServic = k.b().getSystemService("activity");
          if (systemServic == null) {
             return new ArrayList();
          }
          List historicalPr = systemServic.getHistoricalProcessExitReasons(null, 0, 0);
          a.h(historicalPr, "activityManager.getHisto¡­ssExitReasons\(null, 0, 0\)");
          Set set = b.a();
          if (set != null) {
             list = CollectionsKt___CollectionsKt.J5(set);
             if (list != null) {
             label_0046 :
                Iterator iterator = historicalPr.iterator();
                while (iterator.hasNext()) {
                   ApplicationExitInfoMirror uApplication = new ApplicationExitInfoMirror(iterator.next());
                   if (!list.contains(String.valueOf(uApplication.getTimestamp()))) {
                      int i = a.g(uApplication.getProcessName(), uApplication.getPackageName()) ^ 0x01;
                      if (!i && (uApplication.getImportance() != 100 || (p1 && uApplication.getReason() == 10))) {
                         continue ;
                      }
                   }
                   uArrayList.add(uApplication);
                }
                return uArrayList;
             }
          }
          list = new ArrayList();
          goto label_0046 ;
       }catch(java.lang.Exception e7){
          e7.printStackTrace();
          return new ArrayList();
       }
    }
}
