package ag7.f;
import java.lang.Runnable;
import com.kwai.performance.overhead.battery.monitor.b;
import com.kwai.performance.overhead.battery.monitor.model.CpuException;
import java.lang.Object;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.String;
import yf7.h;
import com.kwai.performance.monitor.base.d;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitor;
import android.app.Application;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import android.os.Process;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import ag7.h;
import java.io.File;
import com.kwai.performance.overhead.battery.monitor.ThreadInfoSampler;
import java.util.List;
import java.util.Iterator;
import com.kwai.performance.overhead.battery.monitor.model.CpuException$ThreadCostInfo;
import com.kwai.performance.overhead.battery.monitor.model.StackTree;
import java.lang.Long;
import java.lang.Integer;
import yf7.i;
import com.google.gson.Gson;
import org.json.JSONObject;
import java.lang.Throwable;
import android.util.Log;
import java.lang.Thread;
import java.lang.Math;
import ag7.b;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitorConfig;
import com.kwai.performance.overhead.battery.monitor.model.HistoryCpuInfo;

public final class f implements Runnable	// class@0000c5
{
    public final b b;
    public final CpuException c;

    public void f(b p0,CpuException p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       boolean len;
       int i;
       String str2;
       f tb = this.b;
       f tc = this.c;
       Objects.requireNonNull(tb);
       h.d("BatteryMonitor.Exception", "stopStackSampling\(\) | window = "+tc.isWindowFull+", avg = "+tc.cpuUsageAvg+", windowAvg = "+tc.windowCpuUsageAvg);
       h.d("BatteryMonitor.Exception", "onCpuExceptionToReport\(\) | Thread = "+tb.s.size()+", Stack = "+tb.t.size()+", Info = "+tb.u.size());
       CpuException.fill(tc, tb.s, tb.t, tb.u);
       tc.config = tb.e;
       tc.pid = Process.myPid();
       tc.processName = SystemUtil.r(BatteryMonitor.getConfigCommon().a());
       tc.holderThreadCount = tb.u.size();
       Objects.requireNonNull(h.b);
       File a = h.a;
       Objects.requireNonNull(a);
       if (a.exists() && a.isDirectory()) {
          File[] uFileArray = a.listFiles();
          if (uFileArray != null) {
             len = uFileArray.length;
          label_00b1 :
             tc.fillBase(len, tb.u.getLastThreadCount());
             h.g("BatteryMonitor.Exception", "onCpuExceptionToReport | ThreadCount = "+tc.details.size());
             Iterator iterator = tc.details.iterator();
             while (iterator.hasNext()) {
                CpuException$ThreadCostInfo threadCostIn = iterator.next();
                String str = "\(";
                StringBuilder str1 = "Thread: "+threadCostIn.name+str+threadCostIn.tid+"/";
                CpuException$ThreadCostInfo tree = threadCostIn.tree;
                long l = (tree != null)? tree.threadId.longValue(): -1;
                str1 = str1+l+"\), Cost = "+threadCostIn.cpuTime+str+threadCostIn.utm+"/"+threadCostIn.stm+"\), Sampling = ";
                threadCostIn = threadCostIn.tree;
                i = (threadCostIn != null)? threadCostIn.samplingCount.intValue(): -1;
                h.g("BatteryMonitor.Exception", str1+i);
             }
             len = false;
             try{
                i.a.c("battery_monitor_cpu_exception", tb.b.q(tc), len);
             }catch(java.lang.StackOverflowError e4){
                try{
                   JSONObject jSONObject = new JSONObject();
                   str2 = e4+"\n"+Log.getStackTraceString(e4);
                   jSONObject.put("exception", str2);
                   jSONObject.put("threadCount", Thread.getAllStackTraces().size());
                   Iterator iterator1 = tc.details.iterator();
                   int i1 = 0;
                label_0195 :
                   if (iterator1.hasNext()) {
                      CpuException$ThreadCostInfo tree1 = iterator1.next().tree;
                      if (tree1 == null) {
                         goto label_0195 ;
                      }else {
                         i1 = Math.max(tree1.depth.intValue(), i1);
                         goto label_0195 ;
                      }
                   }else {
                      jSONObject.put("maxDepth", i1);
                      h.g("BatteryMonitor.Exception", "prepareDataAndReport\(\) | error by "+str2);
                      i.a.c("battery_monitor_exception", jSONObject.toString(), len);
                   }
                }catch(org.json.JSONException e8){
                   str2 = str2+"\n"+e8+"\n"+Log.getStackTraceString(e8);
                   h.g("BatteryMonitor.Exception", "prepareDataAndReport\(\) | error by "+str2);
                   i.a.c("battery_monitor_exception", b.c("exception", str2), len);
                }
             }
             tb.e();
             if (tb.e.isHoldHistoryRecords()) {
                HistoryCpuInfo.get().update(tc);
             }
             return;
          }
       }
       len = -3;
       goto label_00b1 ;
    }
}
