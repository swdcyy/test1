package com.kwai.component.perflog.monitor.JunkMonitor$b;
import android.view.Window$OnFrameMetricsAvailableListener;
import com.kwai.component.perflog.monitor.JunkMonitor;
import java.lang.Object;
import android.view.Window;
import android.view.FrameMetrics;
import fd5.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.SystemClock;
import java.util.Objects;
import java.lang.Long;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.component.perflog.monitor.StageItem;
import qrd.p;
import java.lang.Boolean;
import gh5.a;
import java.lang.Iterable;
import com.kwai.component.taskdispatcher.logger.data.DispatchInfo;
import com.kwai.component.perflog.monitor.DetailStage;
import com.kwai.component.perflog.monitor.JunkData;

public final class JunkMonitor$b implements Window$OnFrameMetricsAvailableListener	// class@000a09
{
    public long b;
    public final JunkMonitor c;

    public void JunkMonitor$b(JunkMonitor p0){
       this.c = p0;
       super();
    }
    public void onFrameMetricsAvailable(Window p0,FrameMetrics p1,int p2){
       ArrayList uArrayList;
       List list;
       Object[] objArray;
       ArrayList uArrayList1;
       JunkMonitor$b c1;
       Iterator iterator1;
       long l6;
       JunkMonitor$b uob = this;
       Object[] obj = p1;
       a uoa = a.class;
       if (PatchProxy.isSupport(JunkMonitor$b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, JunkMonitor$b.class, "1")) {
          return;
       }
       a.p(obj, "frameMetrics");
       float f = (float)((double)obj.getMetric(8) * 0x3eb0c6f7a0b5ed8d);
       if (f - 0x42a80000 >= 0) {
          long l = SystemClock.elapsedRealtime();
          if ((l - uob.b) - (long)10 < 0) {
             return;
          }else {
             uob.b = l;
             JunkMonitor l1 = uob.c.l;
             long l2 = (long)f;
             Objects.requireNonNull(l1);
             if (PatchProxy.isSupport(uoa)) {
                uArrayList = PatchProxy.applyTwoRefs(Long.valueOf(l), Long.valueOf(l2), l1, uoa, "6");
                if (uArrayList != PatchProxyResult.class) {
                }
             }
             uArrayList = new ArrayList();
             long l3 = l - l2;
             Iterator iterator = l1.a.entrySet().iterator();
             while (iterator.hasNext()) {
                StageItem value1 = iterator.next().getValue();
                l6 = value1.getStartTime() + value1.getDuration();
                if (l3 - l6 < 0) {
                   uArrayList.add(value1);
                }
             }
             JunkMonitor$b c = uob.c;
             Objects.requireNonNull(c);
             obj = null;
             String str = "2";
             Boolean uBoolean = PatchProxy.apply(obj, c, JunkMonitor.class, str);
             if (uBoolean == PatchProxyResult.class) {
                uBoolean = c.h.getValue();
             }
             l3 = 0;
             if (uBoolean.booleanValue()) {
                a b = a.b;
                Objects.requireNonNull(b);
                a uoa1 = a.class;
                if (PatchProxy.isSupport(uoa1)) {
                   list = PatchProxy.applyTwoRefs(Long.valueOf(l), Long.valueOf(l2), b, uoa1, str);
                   if (list != PatchProxyResult.class) {
                   }else {
                   label_00e6 :
                      l6 = l - l2;
                      if (l6 - l3 <= 0) {
                         list = a.a;
                      }else {
                         list = new ArrayList();
                         iterator1 = a.a.iterator();
                         while (iterator1.hasNext()) {
                            DispatchInfo uDispatchInf = iterator1.next();
                            long l7 = uDispatchInf.getElapsedRealtime() + uDispatchInf.getDuration();
                            if (l6 - l7 <= 0) {
                               list.add(uDispatchInf);
                            }
                         }
                      }
                   }
                }else {
                   goto label_00e6 ;
                }
                objArray = list;
             }else {
                objArray = obj;
             }
             iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                l3 = l3 + iterator.next().getDuration();
             }
             DetailStage uDetailStage = new DetailStage(l3, uArrayList);
             JunkMonitor l4 = uob.c.l;
             Objects.requireNonNull(l4);
             if (PatchProxy.isSupport(uoa)) {
                uArrayList1 = PatchProxy.applyTwoRefs(Long.valueOf(l), Long.valueOf(l2), l4, uoa, "7");
                if (uArrayList1 != PatchProxyResult.class) {
                }
             }
             uArrayList1 = new ArrayList();
             long l5 = l - l2;
             iterator1 = l4.b.entrySet().iterator();
             while (iterator1.hasNext()) {
                StageItem value = iterator1.next().getValue();
                l3 = value.getStartTime() + value.getDuration();
                if (l5 - l3 < 0) {
                   uArrayList1.add(value.getName());
                }
             }
             Object obj1 = uArrayList1;
             JunkData junkData = new JunkData(l, l2, obj1, uDetailStage, objArray);
             uob.c.a.add(uArrayList);
             if (f - (float)120 >= 0) {
                c1 = uob.c;
                c1.e = c1.e + 1;
                c1.c = c1.c + l2;
             }else {
                c1 = uob.c;
                c1.d = c1.d + 1;
                c1.b = c1.b + l2;
             }
          }
       }
       return;
    }
}
