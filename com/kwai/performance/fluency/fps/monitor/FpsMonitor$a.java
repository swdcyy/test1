package com.kwai.performance.fluency.fps.monitor.FpsMonitor$a;
import android.view.Window$OnFrameMetricsAvailableListener;
import android.view.Window;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;
import android.view.FrameMetrics;
import pe7.f;
import com.kwai.performance.fluency.fps.monitor.FpsMonitor;
import java.util.concurrent.ConcurrentHashMap;
import se7.a;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import qe7.a;
import msd.p;
import java.lang.Boolean;

public final class FpsMonitor$a implements Window$OnFrameMetricsAvailableListener	// class@001063
{
    public final int b;
    public final WeakReference c;

    public void FpsMonitor$a(Window p0,int p1){
       a.p(p0, "window");
       super();
       this.b = p1;
       this.c = new WeakReference(p0);
    }
    public void onFrameMetricsAvailable(Window p0,FrameMetrics p1,int p2){
       Window window;
       Window window1;
       a.p(p0, "window");
       a.p(p1, "frameMetrics");
       window = this.c.get();
       List list = null;
       String str = (window == null)? list: f.a(window, this.b);
       if (str == null) {
          return;
       }else {
          a uoa = FpsMonitor.mWindowFrameDetectorMap.get(str);
          if (uoa != null) {
             list = uoa.f();
          }
          if (list == null) {
             return;
          }else {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                String str1 = iterator.next();
                List list1 = FpsMonitor.mSectionFrameMetricListeners.get(str1);
                if (list1 != null) {
                   Iterator iterator1 = list1.iterator();
                   while (iterator1.hasNext()) {
                      iterator1.next().onFrameMetricsAvailable(p0, p1, p2);
                   }
                }
                a uoa1 = FpsMonitor.mCallbacksMap.get(str1);
                if (uoa1 == null) {
                   continue ;
                }else {
                   a c = uoa1.c;
                   if (c == null) {
                      continue ;
                   }else {
                      Object obj = FpsMonitor.mFpsEventMap.get(str1);
                      a.m(obj);
                      a.o(obj, "mFpsEventMap[scene]!!");
                      if (c.invoke(FpsMonitor.mLastFpsEventMap.get(str1), obj).booleanValue()) {
                         window1 = this.c.get();
                         if (window1 == null) {
                            continue ;
                         }
                      }
                   }
                }
                FpsMonitor iNSTANCE = FpsMonitor.INSTANCE;
                iNSTANCE.stopSectionInternal(str1, window1, false);
                iNSTANCE.startSectionInternal(str1, window1, uoa1, this.b);
             }
             return;
          }
       }
    }
}
