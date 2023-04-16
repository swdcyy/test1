package ag7.b;
import java.lang.Object;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo$b;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo$c;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo$Companion;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.StringBuilder;
import yf7.h;
import java.util.Collection;
import usd.k;
import kotlin.collections.CollectionsKt__CollectionsKt;
import usd.i;
import java.lang.Number;
import android.util.SparseLongArray;
import java.lang.Math;
import java.util.Objects;
import java.lang.Throwable;
import android.util.Log;
import yf7.i;
import yf7.d;
import yf7.d$a;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Double;
import nsd.r0;
import java.util.Locale;
import java.util.Arrays;
import java.lang.Float;
import org.json.JSONObject;
import android.os.Process;
import ag7.h;
import android.os.SystemClock;
import java.lang.System;
import ag7.l;
import android.util.Pair;
import com.kwai.performance.monitor.base.d;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitor;
import android.app.Application;
import com.kwai.performance.overhead.battery.monitor.BatteryStatusMonitor;
import android.content.Context;
import android.os.BatteryManager;
import kotlin.TypeCastException;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo$d;
import java.io.File;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.io.FilesKt__FileReadWriteKt;
import java.util.Iterator;
import java.lang.Iterable;

public final class b	// class@0000c1
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public static final float a(BatteryInfo$b p0,BatteryInfo$b p1,BatteryInfo$c p2){
       long l1;
       Integer integer2;
       Object obj = p0;
       BatteryInfo$b uob = p1;
       float f = p2;
       String str = "currentCpuData";
       a.q(obj, str);
       a.q(f, "outSampleData");
       if (!uob) {
          f.h = 0;
       }else {
          BatteryInfo$Companion t = BatteryInfo.T;
          long l = (obj.d - uob.d) * (long)t.j();
          a.q(obj, str);
          a.q(uob, "preCpuData");
          ArrayList uArrayList = t.d();
          String str1 = null;
          Integer integer = (uArrayList != null)? Integer.valueOf(uArrayList.size()): str1;
          int i = 1;
          if (integer == null || integer.intValue() < i) {
             h.g("BatteryMonitor", "computeTimeDiff\(\) | cpuPolicyNum is abnormal: "+integer+'!');
             l1 = -1;
          }else {
             ArrayList uArrayList1 = t.a();
             Integer integer1 = (uArrayList1 != null)? Integer.valueOf(uArrayList1.size()): str1;
             if (a.g(integer1, integer) ^ i) {
                String str2 = "computeTimeDiff\(\) | capacity array size ";
                ArrayList uArrayList2 = t.a();
                if (uArrayList2 != null) {
                   str1 = Integer.valueOf(uArrayList2.size());
                }
                h.g("BatteryMonitor", str2+str1+" not equals "+integer);
                l1 = -2;
             }else {
                String str3 = "computeTimeDiff\(\) | cur freq array size ";
                if (obj.e.size() != integer.intValue()) {
                   h.g("BatteryMonitor", str3+obj.e.size()+" not equals "+integer);
                   l1 = -3;
                }else if(obj.f.size() != t.j()){
                   h.g("BatteryMonitor", str3+obj.f.size()+" not equals "+t.j());
                   l1 = -4;
                }else if(uob.e.size() != integer.intValue()){
                   h.g("BatteryMonitor", "computeTimeDiff\(\) | pre freq array size "+uob.e.size()+" not equals "+integer);
                   l1 = -5;
                }else if(uob.f.size() != t.j()){
                   h.g("BatteryMonitor", str3+uob.f.size()+" not equals "+t.j());
                   l1 = -6;
                }else {
                   uArrayList = t.d();
                   if (uArrayList != null) {
                      str1 = CollectionsKt__CollectionsKt.F(uArrayList);
                   }
                   if (str1 == null) {
                      a.L();
                   }
                   int i1 = str1.l();
                   int i2 = str1.m();
                   if (i1 <= i2) {
                      long l2 = 0;
                      BatteryInfo$Companion t1 = BatteryInfo.T;
                      ArrayList uArrayList3 = t1.d();
                      while (uArrayList3 == null) {
                         a.L();
                         break ;
                         i1 = i1 + 1;
                         i = 1;
                      }
                      Object obj1 = uArrayList3.get(i1);
                      a.h(obj1, "BatteryInfo.CPU_POLICY!![policyIndex]");
                      int i3 = obj1.intValue();
                      ArrayList uArrayList4 = t1.d();
                      if (uArrayList4 == null) {
                         a.L();
                      }
                      int i4 = uArrayList4.size() - i;
                      if (i1 != i4) {
                         ArrayList uArrayList5 = t1.d();
                         if (uArrayList5 == null) {
                            a.L();
                         }
                         i4 = i1 + 1;
                         integer2 = uArrayList5.get(i4);
                      }else {
                         integer2 = Integer.valueOf(t1.j());
                      }
                      a.h(integer2, "if \(policyIndex != Batte¡­nfo.MAX_CPU_CORES\n      }");
                      int i5 = integer2.intValue() - i3;
                      if (obj.e.size() <= i1 || uob.e.size() <= i1) {
                         h.g("BatteryMonitor", "computeTimeDiff\(\) | freq array size less than policy array size!");
                         l1 = -7;
                      }else {
                         obj1 = obj.e.get(i1);
                         a.h(obj1, "currentCpuData.cpuFreqTime[policyIndex]");
                         Object obj2 = uob.e.get(i1);
                         a.h(obj2, "preCpuData.cpuFreqTime[policyIndex]");
                         if (obj1.size() != obj2.size()) {
                            h.g("BatteryMonitor", "computeTimeDiff\(\) | freq array size is not equals! "+"array size: "+obj1.size()+", currentArray size: "+obj2.size());
                            l1 = -8;
                         }else {
                            int i7 = obj1.size();
                            long l3 = 0;
                            for (int i6 = 0; i6 < i7; i6 = i6 + 1) {
                               long l4 = obj1.valueAt(i6) - obj2.valueAt(i6);
                               l3 = l3 + l4;
                            }
                            BatteryInfo$Companion t2 = BatteryInfo.T;
                            if (t2.e()) {
                               l3 = l3 * (long)i5;
                               i5 = t2.i();
                            }
                            l3 = l3 * (long)i5;
                            l2 = l2 + l3;
                            if (i1 != i2) {
                               goto label_024d ;
                            }else {
                               l1 = l2;
                            }
                         }
                      }
                   }else {
                      l1 = 0;
                   }
                }
             }
          }
          v3 = l1;
          if (integer >= 0) {
             l1 = l - l1;
          }
          f.l = l1;
          if (integer >= 0) {
             Objects.requireNonNull(BatteryInfo.T);
             if (Math.abs(l1) - (long)BatteryInfo.O < 0) {
                f.h = b.b(p0, p1, p2);
             }
          }
          if (integer >= 0) {
             f.i = b.b(p0, p1, p2);
          }
          f.k = true;
       }
       return f.h;
    }
    public static final float b(BatteryInfo$b p0,BatteryInfo$b p1,BatteryInfo$c p2){
       long l4;
       int i4;
       Integer integer;
       long l5;
       long l6;
       double d1;
       int i5;
       long l9;
       double d2;
       ArrayList uArrayList3;
       Double uDouble;
       double d3;
       float f2;
       BatteryInfo$b uob = p0;
       BatteryInfo$b uob1 = p1;
       BatteryInfo$c uoc = p2;
       BatteryInfo$b c = uob.c;
       Long longx = Long.valueOf(uob1.c);
       if (longx == null) {
          a.L();
       }
       long l = c - longx.longValue();
       uoc.f = l;
       BatteryInfo$Companion t = BatteryInfo.T;
       float f = (float)(uob.g + uob1.g) / (float)(t.j() * 2);
       uoc.n = f;
       long l1 = uob.d - uob1.d;
       uoc.m = l1;
       long l2 = uob.a - uob1.a;
       uoc.b = l2;
       long l3 = uob.b - uob1.b;
       uoc.d = l3;
       BatteryInfo$c q = uoc.q;
       ArrayList uArrayList = t.d();
       k ok = (uArrayList != null)? CollectionsKt__CollectionsKt.F(uArrayList): null;
       if (ok == null) {
          a.L();
       }
       int i = ok.l();
       int i1 = ok.m();
       if (i <= i1) {
          float f1 = 0;
          BatteryInfo$Companion t1 = BatteryInfo.T;
          ArrayList uArrayList1 = t1.d();
          while (uArrayList1 == null) {
             a.L();
             break ;
             i = i + 1;
             uob = p0;
             uob1 = p1;
             l3 = l4;
             l2 = l5;
             l1 = l6;
             l = l9;
          }
          Object obj = uArrayList1.get(i);
          l4 = l3;
          a.h(obj, "BatteryInfo.CPU_POLICY!![policyIndex]");
          int i2 = obj.intValue();
          ArrayList uArrayList2 = t1.d();
          if (uArrayList2 == null) {
             a.L();
          }
          int i3 = uArrayList2.size() - 1;
          if (i < i3) {
             uArrayList2 = t1.d();
             if (uArrayList2 == null) {
                a.L();
             }
             i4 = i + 1;
             integer = uArrayList2.get(i4);
          }else {
             integer = Integer.valueOf(t1.j());
          }
          a.h(integer, "if \(policyIndex < Batter¡­nfo.MAX_CPU_CORES\n      }");
          i3 = integer.intValue();
          i4 = i3 - i2;
          l5 = l2;
          double d = (double)i4;
          while (i2 < i3) {
             if (!uob.f.get(i2).booleanValue() && !uob1.f.get(i2).booleanValue()) {
                l6 = l1;
                d1 = (double)1;
             }else {
                l6 = l1;
                if (!uob.f.get(i2).booleanValue() || !uob1.f.get(i2).booleanValue()) {
                   d1 = 0x3fe0000000000000;
                }
             }
             d = d - d1;
          label_00fb :
             i2 = i2 + 1;
             l1 = l6;
          }
          l6 = l1;
          String obj1 = uob.e.get(i);
          a.h(obj1, "currentCpuData.cpuFreqTime[policyIndex]");
          Object obj2 = uob1.e.get(i);
          a.h(obj2, "preCpuData!!.cpuFreqTime[policyIndex]");
          i2 = obj1.size();
          long l7 = 0;
          i3 = 0;
          i4 = 0;
          while (i3 < i2) {
             long l8 = obj1.valueAt(i3) - obj2.valueAt(i3);
             if (BatteryInfo.T.e()) {
                i5 = obj1.keyAt(i3);
             }else {
                i5 = obj1.keyAt(i3) + obj2.keyAt(i3);
                i5 = i5 / 2;
             }
             l9 = l;
             Object obj3 = obj2;
             l = (long)i5 * l8;
             if (l > 0 && obj1.keyAt(i3) > i4) {
                i4 = obj1.keyAt(i3);
             }
             l7 = l7 + l;
             i3 = i3 + 1;
             obj2 = obj3;
             l = l9;
          }
          l9 = l;
          BatteryInfo$Companion t2 = BatteryInfo.T;
          obj1 = "BatteryInfo.CPU_CAPACITY?.get\(policyIndex\)!!";
          if (t2.e()) {
             l7 = l7 * (long)t2.i();
             d2 = (double)l7;
             uArrayList3 = t2.a();
             uDouble = (uArrayList3 != null)? uArrayList3.get(i): null;
             if (uDouble == null) {
                a.L();
             }
             a.h(uDouble, obj1);
             d3 = uDouble.doubleValue();
          }else {
             d2 = (double)l7;
             uArrayList3 = t2.a();
             uDouble = (uArrayList3 != null)? uArrayList3.get(i): null;
             if (uDouble == null) {
                a.L();
             }
             a.h(uDouble, obj1);
             d3 = uDouble.doubleValue();
          }
          d2 = d2 * d3;
          d2 = d2 * d;
          f1 = f1 + (float)(long)d2;
          q.add(Integer.valueOf(i4));
          if (i != i1) {
             goto label_01c4 ;
          }else {
             f2 = f1;
          }
       }else {
          l9 = l;
          l6 = l1;
          l5 = l2;
          l4 = l3;
          f2 = 0;
       }
       uoc.o = f2;
       float f3 = 0;
       BatteryInfo$Companion t3 = BatteryInfo.T;
       if (t3.c() - (double)0 > 0 && (l9 > 0 && l6 > 0)) {
          l2 = l5;
          f3 = (double)((float)l2 / ((float)l9 * f)) * ((double)f2 / (t3.c() * (double)l6));
       }else {
          l2 = l5;
       }
       Locale eNGLISH = Locale.ENGLISH;
       a.h(eNGLISH, "Locale.ENGLISH");
       Object[] objArray = new Object[]{Double.valueOf((f3 * (double)100))};
       String str = String.format(eNGLISH, "%.2f", Arrays.copyOf(objArray, 1));
       a.h(str, "java.lang.String.format\(locale, format, *args\)");
       f2 = Float.parseFloat(str);
       uoc.j = (!l2)? 0: (((float)l4 * 0x3f800000) / (float)l2) * f2;
       return f2;
    }
    public static final String c(String p0,Object p1){
       a.q(p0, "key");
       a.q(p1, "value");
       JSONObject jSONObject = new JSONObject();
       jSONObject.put(p0, p1);
       p0 = jSONObject.toString();
       a.h(p0, "json.toString\(\)");
       return p0;
    }
    public static final BatteryInfo$b d(boolean p0,BatteryInfo$b p1){
       int i3;
       BatteryInfo$b uob1;
       BatteryInfo$b uob = new BatteryInfo$b();
       int i = Process.myPid();
       h b = h.b;
       BatteryInfo$Companion t = BatteryInfo.T;
       uob.a = b.b(i, t.i());
       int i1 = t.j();
       uob.c = b.d(i1, t.i());
       int i2 = 0;
       if (!p0) {
          i3 = 0;
          while (p1 != null) {
             a.q(p1, "$this$isCpuMillsValid");
             uob1 = (uob.a - p1.a >= 0)? 1: null;
             if (!uob1 && i3 < 2) {
                i3++;
                h.g("BatteryMonitor", "totalCpuMills is invalid, retry times "+i3);
                h b1 = h.b;
                BatteryInfo$Companion t1 = BatteryInfo.T;
                uob.a = b1.b(i, t1.i());
                int i4 = t1.j();
                uob.c = b1.d(i4, t1.i());
             }
          }
       }
       uob.d = SystemClock.elapsedRealtime();
       BatteryInfo$Companion t2 = BatteryInfo.T;
       ArrayList uArrayList = t2.d();
       if (uArrayList != null) {
          h.b.a(uArrayList, uob.e, t2.e());
       }
       String str = t2.h();
       if (str != null) {
          h b2 = h.b;
          uob1 = uob.f;
          i3 = t2.j();
          Objects.requireNonNull(b2);
          a.q(uob1, "outCpuStateList");
          a.q(str, "isolationFile");
          b2.c(uob1, str, i3, true);
          int i5 = uob1.size();
          while (i2 < i5) {
             if (!uob1.get(i2).booleanValue()) {
                i3--;
             }
             i2 = i2 + 1;
          }
          uob.g = i3;
       }
       uob.b = SystemClock.currentThreadTimeMillis();
       return uob;
    }
    public static final BatteryInfo$c e(){
       long l;
       BatteryInfo$c uoc = new BatteryInfo$c();
       uoc.v = System.currentTimeMillis();
       Pair pair = l.a.a(Process.myUid());
       Pair first = pair.first;
       a.h(first, "networkTrafficData.first");
       uoc.r = first.longValue();
       pair = pair.second;
       a.h(pair, "networkTrafficData.second");
       uoc.t = pair.longValue();
       Application uApplication = BatteryMonitor.getConfigCommon().a();
       a.q(uApplication, "context");
       Long systemServic = uApplication.getSystemService("batterymanager");
       if (systemServic == null) {
          throw new TypeCastException("null cannot be cast to non-null type android.os.BatteryManager");
       }
       long longProperty = systemServic.getLongProperty(3);
       if (longProperty - Long.MIN_VALUE || longProperty - Long.MAX_VALUE) {
          longProperty = systemServic.getLongProperty(2);
       }
       if (longProperty - Long.MIN_VALUE && longProperty - Long.MAX_VALUE) {
          double d = (double)longProperty / 0x408f400000000000;
          l = (long)d;
          if (!l) {
             systemServic = (d - (double)0 > 0)? 1: -1;
             l = systemServic;
          }
          systemServic = Long.valueOf(l);
       }else {
          systemServic = null;
       }
       uoc.w = systemServic;
       return uoc;
    }
    public static final BatteryInfo$d f(){
       BatteryInfo$d uod = new BatteryInfo$d();
       uod.a = SystemClock.elapsedRealtime();
       BatteryInfo$Companion t = BatteryInfo.T;
       String str = t.h();
       boolean b = false;
       if (str != null) {
          h.b.c(uod.b, str, t.j(), b);
       }
       BatteryInfo$d c = uod.c;
       int i = t.j();
       int i1 = t.b();
       Objects.requireNonNull(h.b);
       ArrayList uArrayList = new ArrayList();
       for (int i2 = 0; i2 < i; i2 = i2 + 1) {
          int i3 = i1 + 1;
          ArrayList uArrayList1 = new ArrayList(i3);
          for (i3 = 0; i3 < i1; i3 = i3 + 1) {
             uArrayList1.addAll(FilesKt__FileReadWriteKt.x(new File("/sys/devices/system/cpu//cpu"+i2+"//cpuidle/state"+i3+"/time"), null, 1, null));
          }
          uArrayList.add(uArrayList1);
       }
       ArrayList uArrayList2 = new ArrayList();
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          long l = 0;
          Iterator iterator1 = iterator.next().iterator();
          while (iterator1.hasNext()) {
             long l1 = Long.parseLong(iterator1.next()) / (long)1000;
             l = l + l1;
          }
          uArrayList2.add(Long.valueOf(l));
       }
       c.addAll(uArrayList2);
       return uod;
    }
}
