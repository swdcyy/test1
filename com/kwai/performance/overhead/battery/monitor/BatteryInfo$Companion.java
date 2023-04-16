package com.kwai.performance.overhead.battery.monitor.BatteryInfo$Companion;
import java.lang.Object;
import nsd.u;
import java.util.ArrayList;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo;
import java.lang.String;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitorConfig;
import kotlin.jvm.internal.a;
import ag7.c;
import java.util.Objects;
import android.content.SharedPreferences;
import android.os.Build;
import java.lang.CharSequence;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import java.util.Collection;
import java.lang.Integer;
import kotlin.TypeCastException;
import java.lang.NumberFormatException;
import java.lang.Double;
import java.lang.Runtime;
import ag7.h;
import android.system.OsConstants;
import android.system.Os;
import java.io.File;
import java.lang.StringBuilder;
import zsd.d;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.io.BufferedReader;
import java.io.Reader;
import wsd.m;
import kotlin.io.TextStreamsKt;
import java.util.Iterator;
import kotlin.text.Regex;
import qrd.l1;
import java.io.Closeable;
import java.lang.Throwable;
import isd.b;
import yf7.h;
import kotlin.io.FilesKt__FileReadWriteKt;
import java.lang.Number;
import java.lang.Long;
import ag7.g;
import java.io.FilenameFilter;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo$Companion$init$1;
import msd.a;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;
import yf7.i;
import ag7.b;
import yf7.d;
import yf7.d$a;

public final class BatteryInfo$Companion	// class@001117
{

    public void BatteryInfo$Companion(){
       super();
    }
    public void BatteryInfo$Companion(u p0){
       super();
    }
    public final ArrayList a(){
       return BatteryInfo.K;
    }
    public final int b(){
       return BatteryInfo.P;
    }
    public final double c(){
       return BatteryInfo.L;
    }
    public final ArrayList d(){
       return BatteryInfo.J;
    }
    public final boolean e(){
       return BatteryInfo.Q;
    }
    public final int f(){
       return BatteryInfo.N;
    }
    public final boolean g(){
       return BatteryInfo.S;
    }
    public final String h(){
       return BatteryInfo.M;
    }
    public final int i(){
       return BatteryInfo.I;
    }
    public final int j(){
       return BatteryInfo.H;
    }
    public final int k(){
       return BatteryInfo.G;
    }
    public final void l(BatteryMonitorConfig p0){
       SharedPreferences a;
       int i2;
       int i3;
       int i4;
       int i5;
       ArrayList uArrayList2;
       int i7;
       double d;
       ArrayList uArrayList3;
       double d1;
       String str10;
       String str11;
       int i8;
       int b2;
       object obj1;
       StringBuilder obj2;
       int i11;
       ArrayList uArrayList4;
       Object[] objArray1;
       int len;
       ArrayList uArrayList5;
       BatteryInfo$Companion uCompanion = this;
       Object obj = p0;
       a.q(obj, "monitorConfig");
       c b = c.b;
       Objects.requireNonNull(b);
       a = c.a;
       String str = "mPreferences";
       if (a == null) {
          a.S(str);
       }
       int i = 0;
       String str1 = "";
       StringBuilder str2 = 1;
       if (2 == a.getInt("monitorVersion", i)) {
          String fINGERPRINT = Build.FINGERPRINT;
          SharedPreferences a1 = c.a;
          if (a1 == null) {
             a.S(str);
          }
          if (fINGERPRINT.equals(a1.getString("sysFingerprint", str1))) {
             a = null;
          label_003d :
             if (!a && !b.b()) {
                BatteryInfo.R = i;
                return;
             }else {
                String str3 = "cpuPolicy";
                int i1 = 3;
                String str4 = "null cannot be cast to non-null type kotlin.Array<T>";
                String str5 = "reason";
                if (!a) {
                   Objects.requireNonNull(b);
                   a = c.a;
                   if (a == null) {
                      a.S(str);
                   }
                   if (a.getBoolean("cpuMonitorEnableNew", i)) {
                      Objects.requireNonNull(b);
                      a = c.a;
                      if (a == null) {
                         a.S(str);
                      }
                      uCompanion.t(a.getInt("cpuCores", i));
                      Objects.requireNonNull(b);
                      a = c.a;
                      if (a == null) {
                         a.S(str);
                      }
                      uCompanion.s(a.getInt("cpuJiffiesToMs", 10));
                      Objects.requireNonNull(b);
                      SharedPreferences a2 = c.a;
                      if (a2 == null) {
                         a.S(str);
                      }
                      String str12 = a2.getString(str3, "0");
                      fINGERPRINT = "null cannot be cast to non-null type kotlin.CharSequence";
                      str1 = ",";
                      str3 = "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)";
                      if (str12 == null || str12.length() < i1) {
                         uArrayList4 = null;
                      }else {
                         str12 = str12.substring(str2, (str12.length() - str2));
                         a.h(str12, str3);
                         String[] stringArray3 = new String[]{str1};
                         String[] stringArray4 = new String[i];
                         objArray1 = StringsKt__StringsKt.H4(str12, stringArray3, false, 0, 6, null).toArray(stringArray4);
                         if (objArray1 != null) {
                            len = objArray1.length;
                            try{
                               uArrayList5 = new ArrayList(len);
                               len = objArray1.length;
                               i3 = 0;
                               while (true) {
                                  if (i3 < len) {
                                     object oobject = objArray1[i3];
                                     if (oobject != null) {
                                        uArrayList5.add(Integer.valueOf(Integer.parseInt(StringsKt__StringsKt.o5(oobject).toString())));
                                        i3 = i3 + 1;
                                     }else {
                                        throw new TypeCastException(fINGERPRINT);
                                     }
                                  }else {
                                     b = null;
                                  }
                               }
                            }catch(java.lang.NumberFormatException e0){
                               e0.printStackTrace();
                               b = 1;
                            }
                            if (b) {
                               uArrayList5 = 0;
                            }
                            uArrayList4 = uArrayList5;
                         }else {
                            throw new TypeCastException(str4);
                         }
                      }
                      uCompanion.p(uArrayList4);
                      Objects.requireNonNull(c.b);
                      a2 = c.a;
                      if (a2 == null) {
                         a.S(str);
                      }
                      str12 = a2.getString("cpuCapacity", "1");
                      if (str12 != null && str12.length() >= i1) {
                         str12 = str12.substring(str2, (str12.length() - str2));
                         a.h(str12, str3);
                         String[] stringArray1 = new String[]{str1};
                         String[] stringArray2 = new String[i];
                         objArray1 = StringsKt__StringsKt.H4(str12, stringArray1, false, 0, 6, null).toArray(stringArray2);
                         if (objArray1 != null) {
                            len = objArray1.length;
                            try{
                               uArrayList3 = new ArrayList(len);
                               len = objArray1.length;
                               i11 = 0;
                               while (true) {
                                  if (i11 < len) {
                                     obj1 = objArray1[i11];
                                     if (obj1 != null) {
                                        uArrayList3.add(Double.valueOf(Double.parseDouble(StringsKt__StringsKt.o5(obj1).toString())));
                                        i11 = i11 + 1;
                                     }else {
                                        throw new TypeCastException(fINGERPRINT);
                                     }
                                  }else {
                                     b = null;
                                  }
                               }
                            }catch(java.lang.NumberFormatException e0){
                               e0.printStackTrace();
                               b = 1;
                            }
                            if (!b) {
                            label_0195 :
                               uCompanion.m(uArrayList3);
                               b = c.b;
                               Objects.requireNonNull(b);
                               a = c.a;
                               if (a == null) {
                                  a.S(str);
                               }
                               uCompanion.o((double)a.getLong("cpuFreqMax", -1));
                               Objects.requireNonNull(b);
                               a = c.a;
                               if (a == null) {
                                  a.S(str);
                               }
                               uCompanion.r(a.getString("cpuIsolationFile", " "));
                               BatteryInfo.R = b.b();
                               Objects.requireNonNull(b);
                               a = c.a;
                               if (a == null) {
                                  a.S(str);
                               }
                               uCompanion.q(a.getBoolean("cpuTimeFileExist", i));
                               Objects.requireNonNull(b);
                               a2 = c.a;
                               if (a2 == null) {
                                  a.S(str);
                               }
                               uCompanion.n(a2.getInt("cpuIdleInfo", -1));
                               str11 = str5;
                               str1 = null;
                            label_05a7 :
                               if (!BatteryInfo.R) {
                                  d$a.b(i.a, "battery_monitor_disable", b.c(str11, "CPU_MONITOR_NOT_SUPPORT"), false, 4, null);
                                  return;
                               }else {
                                  fINGERPRINT = str11;
                                  if (this.d() != null && (this.a() == null || this.h() == null)) {
                                     if (this.a() == null) {
                                        d$a.b(i.a, "battery_monitor_disable", b.c(fINGERPRINT, "CPU_POLICY_NULL"), false, 4, null);
                                     }
                                     if (this.a() == null) {
                                        d$a.b(i.a, "battery_monitor_disable", b.c(fINGERPRINT, "CPU_CAPACITY_NULL"), false, 4, null);
                                     }
                                     if (this.h() == null) {
                                        d$a.b(i.a, "battery_monitor_disable", b.c(fINGERPRINT, "ISOLATION_FILE_NULL"), false, 4, null);
                                     }
                                     c.b.d(false);
                                     BatteryInfo.R = false;
                                     return;
                                  }else {
                                     uArrayList2 = this.d();
                                     Integer integer = (uArrayList2 != null)? Integer.valueOf(uArrayList2.size()): str1;
                                     if (integer == null) {
                                        a.L();
                                     }
                                     BatteryInfo.N = integer.intValue();
                                     b2 = this.f();
                                     i2 = 1;
                                     if (b2 != i2) {
                                        if (b2 != 2) {
                                           if (b2 == 3) {
                                              uCompanion.u(obj.timeDiffThreshold[2]);
                                           }
                                        }else {
                                           uCompanion.u(obj.timeDiffThreshold[i2]);
                                        }
                                     }else {
                                        uCompanion.u(obj.timeDiffThreshold[0]);
                                     }
                                     BatteryInfo.G = obj.sampleListSize;
                                     BatteryInfo.S = true;
                                     return;
                                  }
                               }
                            }
                         }else {
                            throw new TypeCastException(str4);
                         }
                      }
                      uArrayList3 = null;
                      goto label_0195 ;
                   }
                }
                uCompanion.t(Runtime.getRuntime().availableProcessors());
                if (this.j() >= 8) {
                   long l = (long)1000;
                   h b1 = h.b;
                   Objects.requireNonNull(b1);
                   long l1 = Os.sysconf(OsConstants._SC_CLK_TCK);
                   String str6 = str4;
                   if (l1 - null <= 0) {
                      l1 = 100;
                   }
                   uCompanion.s((int)(l / l1));
                   i2 = this.j();
                   Objects.requireNonNull(b1);
                   ArrayList uArrayList = new ArrayList();
                   TypeCastException typeCastExce = 1;
                   i3 = 0;
                   while (true) {
                      String str7 = 8192;
                      String str8 = "/sys/devices/system/cpu/cpu";
                      if (i3 < i2 && typeCastExce) {
                         InputStreamReader inputStreamR = new InputStreamReader(new FileInputStream(new File(str8+i3+"/cpufreq/related_cpus")), d.a);
                         if (inputStreamR instanceof BufferedReader) {
                         }else {
                            inputStreamR = new BufferedReader(inputStreamR, str7);
                         }
                         Iterator iterator = TextStreamsKt.h(inputStreamR).iterator();
                         while (true) {
                            if (iterator.hasNext()) {
                               i4 = 0;
                               String[] stringArray = new String[i4];
                               Object[] objArray = new Regex("\\s+").split(iterator.next(), i4).toArray(stringArray);
                               if (objArray != null) {
                                  i5 = (!objArray.length)? 1: 0;
                                  i4 = i5 ^ 0x01;
                                  if (i4) {
                                     uArrayList.add(Integer.valueOf(i3));
                                     i3 = i3 + objArray.length;
                                  }
                                  Regex regex = null;
                               }else {
                                  throw new TypeCastException(str6);
                               }
                            }else {
                               b.a(inputStreamR, null);
                               String str9 = null;
                            }
                         }
                      }else {
                         uCompanion.p(uArrayList);
                         b1 = h.b;
                         ArrayList uArrayList1 = this.d();
                         if (uArrayList1 == null) {
                            a.L();
                         }
                         Objects.requireNonNull(b1);
                         a.q(uArrayList1, str3);
                         uArrayList2 = new ArrayList(uArrayList1.size());
                         int i6 = uArrayList1.size();
                         for (i = 0; i < i6; i6 = i3) {
                            i7 = i + 1;
                            i3 = i6;
                            str4 = str1;
                            d = (double)i7 * 0x3ff0000000000000;
                            if (i == 2) {
                               d = d - 0x3fe0000000000000;
                            }
                            uArrayList2.add(Double.valueOf(d));
                            i = i7;
                            str1 = str4;
                         }
                         str4 = str1;
                         if (new File("/sys/devices/system/cpu/cpu0/cpu_capacity").exists()) {
                            i6 = uArrayList1.size();
                            int i10 = 0;
                            while (i10 < i6) {
                               i11 = 1;
                               List list = FilesKt__FileReadWriteKt.x(new File(str8+uArrayList1.get(i10)+"/cpu_capacity"), null, i11, null);
                               int i12 = list.isEmpty() ^ i11;
                               if (i12) {
                                  uArrayList2.set(i10, Double.valueOf(Double.parseDouble(list.get(0))));
                               }
                               i10 = i10 + 1;
                            }
                         }
                         uCompanion.m(uArrayList2);
                         b1 = h.b;
                         i2 = this.j();
                         uArrayList = this.d();
                         if (uArrayList == null) {
                            a.L();
                         }
                         uArrayList3 = this.a();
                         if (uArrayList3 == null) {
                            a.L();
                         }
                         Objects.requireNonNull(b1);
                         a.q(uArrayList, "policyArray");
                         a.q(uArrayList3, "outCapacityArray");
                         if (uArrayList.size() != uArrayList3.size()) {
                            d1 = 0xbff0000000000000;
                            str10 = str4;
                            str11 = str5;
                            i8 = -1;
                         }else {
                            b2 = uArrayList.size();
                            double d2 = 0;
                            i = 0;
                            while (i < b2) {
                               obj1 = uArrayList.get(i);
                               a.h(obj1, "policyArray[policyIndex]");
                               i7 = obj1.intValue();
                               int i9 = b2;
                               InputStreamReader inputStreamR1 = new InputStreamReader(new FileInputStream(new File(str8+i7+"/cpufreq/cpuinfo_max_freq")), d.a);
                               if (inputStreamR1 instanceof BufferedReader) {
                                  i4 = 8192;
                               }else {
                                  inputStreamR1 = new BufferedReader(inputStreamR1, 8192);
                               }
                               Iterator iterator1 = TextStreamsKt.h(inputStreamR1).iterator();
                               while (iterator1.hasNext()) {
                                  str10 = str4;
                                  str11 = str5;
                                  long l2 = Long.parseLong(iterator1.next());
                                  if (l2 > 0) {
                                     i4 = uArrayList.size() - 1;
                                     if (i < i4) {
                                        i4 = i + 1;
                                        i4 = uArrayList.get(i4).intValue() - i7;
                                     }else {
                                        i4 = i2 - i7;
                                     }
                                     obj2 = uArrayList3.get(i);
                                     a.h(obj2, "outCapacityArray[policyIndex]");
                                     d1 = (double)i4 * obj2.doubleValue();
                                     d2 = d2 + d1;
                                     d1 = uArrayList3.get(i).doubleValue() / (double)l2;
                                     uArrayList3.set(i, Double.valueOf(d1));
                                     i2 = i2;
                                     str5 = str11;
                                     str4 = str10;
                                     uArrayList = uArrayList;
                                     iterator1 = iterator1;
                                     i4 = 8192;
                                  }else {
                                     str5 = str11;
                                     str4 = str10;
                                     continue ;
                                  }
                               }
                               b.a(inputStreamR1, null);
                               i = i + 1;
                               i2 = i2;
                               b2 = i9;
                               str5 = str5;
                               str4 = str4;
                               uArrayList = uArrayList;
                               obj2 = 8192;
                            }
                            str10 = str4;
                            str11 = str5;
                            i8 = -1;
                            d1 = d2;
                         }
                         uCompanion.o(d1);
                         b1 = h.b;
                         Objects.requireNonNull(b1);
                         str = "/sys/devices/system/cpu/core_ctl_isolated";
                         if (!new File(str).exists()) {
                            str = "/sys/devices/system/cpu/sched_isolated";
                            if (!new File(str).exists()) {
                               str = "/sys/devices/system/cpu/cpu0/isolate";
                               if (!new File(str).exists()) {
                                  str1 = str10;
                               label_0510 :
                                  uCompanion.r(str1);
                                  Objects.requireNonNull(b1);
                                  File uFile = new File("/sys/devices/system/cpu/cpu7/cpufreq/stats/time_in_state");
                                  if (uFile.exists()) {
                                     i5 = (!FilesKt__FileReadWriteKt.v(uFile).length)? 1: 0;
                                     if (i5 ^ 0x01) {
                                        b2 = true;
                                     label_054c :
                                        uCompanion.q(b2);
                                        b1 = h.b;
                                        Objects.requireNonNull(b1);
                                        File uFile1 = new File("/sys/devices/system/cpu/cpu0/cpuidle");
                                        if (uFile1.exists()) {
                                           File[] uFileArray = uFile1.listFiles(g.b);
                                           if (uFileArray != null) {
                                              i7 = uFileArray.length;
                                           label_056d :
                                              uCompanion.n(i7);
                                              if (!this.e()) {
                                                 Objects.requireNonNull(b1);
                                                 uFile1 = new File("/sys/devices/system/cpu/cpu7/cpufreq/scaling_cur_freq");
                                                 b2 = (new File("/sys/devices/system/cpu/cpufreq/policy0").exists() && uFile1.exists())? 1: 0;
                                                 if (!b2) {
                                                    b2 = false;
                                                 label_059c :
                                                    BatteryInfo.R = b2;
                                                    str1 = null;
                                                    Monitor_ThreadKt.b(0, BatteryInfo$Companion$init$1.INSTANCE, 1, str1);
                                                    goto label_05a7 ;
                                                 }
                                              }
                                              b2 = true;
                                              goto label_059c ;
                                           }
                                        }
                                        i7 = -1;
                                        goto label_056d ;
                                     }
                                  }
                               label_054b :
                                  b2 = false;
                                  goto label_054c ;
                               }
                            }
                         }
                         str1 = str;
                         goto label_0510 ;
                      }
                   }
                }else {
                   d$a.b(i.a, "battery_monitor_disable", b.c(str5, "MAX_CPU_CORE_"+this.j()), false, 4, null);
                   b.e(false);
                   return;
                }
             }
          }
       }
       a = 1;
       goto label_003d ;
    }
    public final void m(ArrayList p0){
       BatteryInfo.K = p0;
    }
    public final void n(int p0){
       BatteryInfo.P = p0;
    }
    public final void o(double p0){
       BatteryInfo.L = p0;
    }
    public final void p(ArrayList p0){
       BatteryInfo.J = p0;
    }
    public final void q(boolean p0){
       BatteryInfo.Q = p0;
    }
    public final void r(String p0){
       BatteryInfo.M = p0;
    }
    public final void s(int p0){
       BatteryInfo.I = p0;
    }
    public final void t(int p0){
       BatteryInfo.H = p0;
    }
    public final void u(int p0){
       BatteryInfo.O = p0;
    }
}
