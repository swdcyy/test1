package com.kwai.performance.stability.app.exit.monitor.AppExitMonitor;
import com.kwai.performance.monitor.base.Monitor;
import com.kwai.performance.stability.app.exit.monitor.AppExitMonitor$a;
import nsd.u;
import com.google.gson.Gson;
import java.util.Set;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import kotlin.jvm.internal.a;
import jg7.b;
import android.content.SharedPreferences;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Collection;
import android.content.SharedPreferences$Editor;
import oe6.g;
import msd.l;
import java.util.List;
import android.os.Build$VERSION;
import com.kwai.performance.monitor.base.d;
import jg7.a;
import yf7.r;
import com.kwai.performance.stability.app.exit.monitor.AppExitMonitor$onApplicationPostCreate$1;
import msd.a;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;
import android.app.Application;
import yf7.k;
import com.kwai.performance.stability.app.exit.monitor.AppExitMonitor$onApplicationPostCreate$2;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.ActivityManager;
import com.kwai.performance.stability.app.exit.monitor.ApplicationExitInfoMirror;
import java.lang.StringBuilder;
import yf7.h;
import yf7.i;
import java.lang.Exception;
import yf7.d;
import yf7.d$a;
import java.util.ArrayList;
import com.kwai.performance.stability.app.exit.monitor.AppExitMonitor$b;
import java.util.Comparator;
import trd.x;
import java.util.Iterator;
import android.app.ApplicationExitInfo;
import java.util.HashSet;

public final class AppExitMonitor extends Monitor	// class@001183
{
    public final Gson mGson;
    public static final AppExitMonitor$a Companion;

    static {
       AppExitMonitor.Companion = new AppExitMonitor$a(null);
    }
    public void AppExitMonitor(){
       super();
       this.mGson = new Gson();
    }
    public static final void addAppExitTimeStampInSafeMode(Set p0){
       SharedPreferences a;
       Objects.requireNonNull(AppExitMonitor.Companion);
       a.q(p0, "items");
       Objects.requireNonNull(b.b);
       a.q(p0, "items");
       a = b.a;
       if (a == null) {
          a.S("mPreferences");
       }
       Set stringSet = a.getStringSet("timestamps", null);
       p0 = CollectionsKt___CollectionsKt.K5(p0);
       if (stringSet != null) {
          p0.addAll(CollectionsKt___CollectionsKt.K5(stringSet));
       }
       a = b.a;
       if (a == null) {
          a.S("mPreferences");
       }
       g.a(a.edit().putStringSet("timestamps", p0));
       return;
    }
    public static final List getAppExitInfoInSafeMode(l p0,boolean p1){
       return AppExitMonitor.Companion.a(p0, p1);
    }
    public void onApplicationPostCreate(){
       super.onApplicationPostCreate();
       if (Build$VERSION.SDK_INT < 30) {
          return;
       }
       b.b.b(this.getCommonConfig().f());
       if (this.getMonitorConfig().b != null && r.b()) {
          Monitor_ThreadKt.b(0, new AppExitMonitor$onApplicationPostCreate$1(this), 1, null);
       }
       if (this.getMonitorConfig().a != null) {
          k.b().registerActivityLifecycleCallbacks(new AppExitMonitor$onApplicationPostCreate$2(this));
       }
       return;
    }
    public final void setProcessState(boolean p0,String p1){
       if (Build$VERSION.SDK_INT < 30) {
          return;
       }
       try{
          ActivityManager systemServic = k.b().getSystemService("activity");
          if (systemServic != null) {
             systemServic.setProcessStateSummary(ApplicationExitInfoMirror.encodeProcessState(p0, p1));
             h.d("AppExitMonitor", "isLaunchFinished = "+p0+"  currentPage = "+p1);
          }else {
             return;
          }
       }catch(java.lang.Exception e8){
          d$a.c(i.a, "upload_app_exit_info_error", e8.toString(), false, 4, null);
          h.b("AppExitMonitor", e8.toString());
       }
       return;
    }
    public final void uploadAppExitInfo(){
       List list;
       if (Build$VERSION.SDK_INT < 30) {
          return;
       }
       int i = 0;
       try{
          ActivityManager systemServic = k.b().getSystemService("activity");
          if (systemServic != null) {
             List historicalPr = systemServic.getHistoricalProcessExitReasons(null, i, i);
             a.h(historicalPr, "activityManager.getHisto¡­ssExitReasons\(null, 0, 0\)");
             Set set = b.b.a();
             if (set != null) {
                list = CollectionsKt___CollectionsKt.J5(set);
                if (list != null) {
                label_0036 :
                   if (list.size() > 1) {
                      x.p0(list, new AppExitMonitor$b());
                   }
                   ArrayList uArrayList = new ArrayList();
                   uArrayList.addAll(list);
                   Iterator iterator = historicalPr.iterator();
                   while (iterator.hasNext()) {
                      ApplicationExitInfoMirror uApplication = new ApplicationExitInfoMirror(iterator.next());
                      String str = String.valueOf(uApplication.getTimestamp());
                      if (list.contains(str)) {
                         continue ;
                      }
                      String str1 = this.mGson.q(uApplication);
                      a.h(str1, "mGson.toJson\(mirror\)");
                      i.a.f(str1, 15);
                      h.d("AppExitMonitor", "upload app exit info: \n "+this.mGson.q(uApplication));
                      uArrayList.add(i, str);
                   }
                   b.b.c(new HashSet(CollectionsKt___CollectionsKt.u5(uArrayList, 16)));
                }
             }
             list = new ArrayList();
             goto label_0036 ;
          }else {
             return;
          }
       }catch(java.lang.Exception e2){
          i.a.e("upload_app_exit_info_error", e2.toString(), i);
          h.b("AppExitMonitor", e2.toString());
       }
       return;
    }
}
