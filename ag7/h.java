package ag7.h;
import java.io.File;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import kotlin.jvm.internal.a;
import java.util.Collection;
import java.lang.Number;
import java.lang.StringBuilder;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.io.FilesKt__FileReadWriteKt;
import yf7.h;
import android.util.SparseLongArray;
import java.lang.CharSequence;
import kotlin.text.Regex;
import java.lang.Integer;
import java.lang.Long;
import android.os.SystemClock;
import zsd.d;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.Reader;
import wsd.m;
import kotlin.io.TextStreamsKt;
import java.util.Iterator;
import java.io.Closeable;
import java.lang.Throwable;
import isd.b;
import kotlin.TypeCastException;
import qrd.l1;
import java.lang.Boolean;
import kotlin.text.StringsKt__StringsKt;
import java.util.Locale;
import kotlin.text.StringsKt___StringsKt;

public final class h	// class@0000c7
{
    public static final File a;
    public static final h b;

    static {
       h.b = new h();
       h.a = new File("/proc/self/fd");
    }
    public void h(){
       super();
    }
    public final void a(ArrayList p0,ArrayList p1,boolean p2){
       int i2;
       Object obj = p0;
       Object obj1 = p1;
       a.q(obj, "policyArray");
       a.q(obj1, "outFreqResult");
       int i = 0;
       String str = "/sys/devices/system/cpu/cpu";
       String str1 = "policyArray[policyIndex]";
       Charset uCharset = null;
       if (p2) {
          ArrayList uArrayList = new ArrayList(p0.size());
          int i1 = p0.size();
          for (i2 = 0; i2 < i1; i2 = i2 + 1) {
             Object obj2 = obj.get(i2);
             a.h(obj2, str1);
             uArrayList.add(FilesKt__FileReadWriteKt.x(new File(str+obj2.intValue()+"/cpufreq/stats/time_in_state"), uCharset, 1, uCharset));
          }
          int i3 = uArrayList.size();
          for (int i4 = 0; i4 < i3; i4 = i4 + 1) {
             SparseLongArray sparseLongAr = new SparseLongArray(uArrayList.get(i4).size());
             Object obj3 = uArrayList.get(i4);
             a.h(obj3, "freqArray[index]");
             int i5 = obj3.size();
             int i6 = 0;
             while (i6 < i5) {
                List list = new Regex("\\s+").split(uArrayList.get(i4).get(i6), i);
                if (list.size() == 2) {
                   sparseLongAr.put(Integer.parseInt(list.get(i)), Long.parseLong(list.get(1)));
                }
                i6 = i6 + 1;
             }
             obj1.add(sparseLongAr);
          }
       }else {
          long l = SystemClock.elapsedRealtime();
          i2 = p0.size();
          int i7 = 0;
          while (i7 < i2) {
             Object obj4 = obj.get(i7);
             a.h(obj4, str1);
             SparseLongArray sparseLongAr1 = new SparseLongArray(1);
             List list1 = FilesKt__FileReadWriteKt.x(new File(str+obj4.intValue()+"/cpufreq/scaling_cur_freq"), uCharset, 1, uCharset);
             int i8 = list1.isEmpty() ^ 1;
             if (i8) {
                sparseLongAr1.put(Integer.parseInt(list1.get(0)), l);
             }else {
                obj4 = null;
             }
             obj1.add(sparseLongAr1);
             i7 = i7 + 1;
             StringBuilder str2 = null;
          }
       }
       return;
    }
    public final long b(int p0,int p1){
       long l;
       m om = 8192;
       InputStreamReader inputStreamR = new InputStreamReader(new FileInputStream(new File("/proc/self/stat")), d.a);
       if (inputStreamR instanceof BufferedReader) {
       }else {
          inputStreamR = new BufferedReader(inputStreamR, om);
       }
       Throwable throwable = null;
       Iterator iterator = TextStreamsKt.h(inputStreamR).iterator();
       while (true) {
          if (iterator.hasNext()) {
             String[] stringArray = new String[0];
             Object[] objArray = new Regex("\\s+").split(iterator.next(), 0).toArray(stringArray);
             if (objArray != null) {
                int i = 16;
                if (objArray.length > i) {
                   l = (((Long.parseLong(objArray[13]) + Long.parseLong(objArray[14])) + Long.parseLong(objArray[15])) + Long.parseLong(objArray[i])) * (long)p1;
                   b.a(inputStreamR, throwable);
                   break ;
                }
             }else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
             }
          }else {
             b.a(inputStreamR, throwable);
             l = -1;
             break ;
          }
       }
       return l;
    }
    public final void c(ArrayList p0,String p1,int p2,boolean p3){
       boolean i2;
       boolean b;
       h oh = this;
       Object obj = p0;
       Object obj1 = p1;
       int i = p2;
       a.q(obj, "outCpuStateList");
       a.q(obj1, "isolationFile");
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          obj.add(Boolean.TRUE);
       }
       if (p3) {
          List list = FilesKt__FileReadWriteKt.x(new File("/proc/self/status"), null, 1, null);
          String[] stringArray = new String[]{"\t"};
          list = StringsKt__StringsKt.H4(list.get((list.size() - 6)), stringArray, false, 0, 6, null);
          if (list.size() == 2 && (list.get(0)).equals("Cpus_allowed:")) {
             String str = list.get(1);
             Locale rOOT = Locale.ROOT;
             a.h(rOOT, "Locale.ROOT");
             if (str != null) {
                str = str.toUpperCase(rOOT);
                a.h(str, "\(this as java.lang.String\).toUpperCase\(locale\)");
                str = Integer.toBinaryString(Integer.parseInt(str, 16));
                a.h(str, "Integer.toBinaryString\(I¡­r.parseInt\(cpuState, 16\)\)");
                if (str != null) {
                   str = StringsKt___StringsKt.b8(str).toString();
                   if (str != null) {
                      char[] uocharArray = str.toCharArray();
                      a.h(uocharArray, "\(this as java.lang.String\).toCharArray\(\)");
                      int len = uocharArray.length;
                      for (i2 = 0; i2 < len; i2 = i2 + 1) {
                         b = (uocharArray[i2] == '1')? true: false;
                         obj.set(i2, Boolean.valueOf(b));
                      }
                      for (int len1 = uocharArray.length; len1 < i; len1 = len1 + 1) {
                         obj.set(len1, Boolean.FALSE);
                      }
                   }else {
                      throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                   }
                }else {
                   throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
             }else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
             }
          }
       }
       if (obj1.equals("/sys/devices/system/cpu/core_ctl_isolated")) {
          oh.e(obj1, obj);
       }else if(obj1.equals("/sys/devices/system/cpu/sched_isolated")){
          oh.e(obj1, obj);
       }else if(obj1.equals("/sys/devices/system/cpu/cpu0/isolate")){
          i = p0.size();
          for (int i3 = 0; i3 < i; i3 = i3 + 1) {
             i2 = 8192;
             InputStreamReader inputStreamR = new InputStreamReader(new FileInputStream(new File("/sys/devices/system/cpu/cpu"+i3+"/isolate")), d.a);
             if (inputStreamR instanceof BufferedReader) {
             }else {
                inputStreamR = new BufferedReader(inputStreamR, i2);
             }
             Iterator iterator = TextStreamsKt.h(inputStreamR).iterator();
             while (true) {
                if (iterator.hasNext()) {
                   String str1 = iterator.next();
                   if (str1 != null) {
                      char[] uocharArray1 = str1.toCharArray();
                      a.h(uocharArray1, "\(this as java.lang.String\).toCharArray\(\)");
                      if (uocharArray1.length == 1 && uocharArray1[0] == '1') {
                         obj.set(i3, Boolean.FALSE);
                      }
                   }else {
                      throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                   }
                }else {
                   b.a(inputStreamR, null);
                }
             }
          }
       }
       oh.e("/sys/devices/system/cpu/offline", obj);
       return;
    }
    public final long d(int p0,int p1){
       return (SystemClock.elapsedRealtime() * (long)p0);
    }
    public final void e(String p0,ArrayList p1){
       String str;
       m om = 8192;
       InputStreamReader inputStreamR = new InputStreamReader(new FileInputStream(new File(p0)), d.a);
       if (inputStreamR instanceof BufferedReader) {
       }else {
          inputStreamR = new BufferedReader(inputStreamR, om);
       }
       TypeCastException typeCastExce = null;
       Iterator iterator = TextStreamsKt.h(inputStreamR).iterator();
       while (true) {
          if (iterator.hasNext()) {
             String[] stringArray = new String[]{","};
             stringArray = new String[0];
             Object[] objArray = StringsKt__StringsKt.H4(iterator.next(), stringArray, false, 0, 6, null).toArray(stringArray);
             if (objArray != null) {
                int i = 1;
                int i1 = (!objArray.length)? 1: 0;
                i1 = i1 ^ i;
                if (i1) {
                   i1 = objArray.length;
                   int i2 = 0;
                   while (true) {
                      if (i2 < i1) {
                         if ((objArray[i2]).length() == i) {
                            p1.set(Integer.parseInt(objArray[i2]), Boolean.FALSE);
                         }else if((objArray[i2]).length() == 3){
                            object oobject = objArray[i2];
                            str = "null cannot be cast to non-null type java.lang.String";
                            if (oobject != null) {
                               String str1 = oobject.substring(0, i);
                               a.h(str1, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
                               int i3 = Integer.parseInt(str1);
                               object oobject1 = objArray[i2];
                               if (oobject1 != null) {
                                  str = oobject1.substring(2);
                                  a.h(str, "\(this as java.lang.String\).substring\(startIndex\)");
                                  int i4 = Integer.parseInt(str);
                                  for (; i3 <= i4; i3 = i3 + 1) {
                                     p1.set(i3, Boolean.FALSE);
                                  }
                               }else {
                                  break ;
                               }
                            }else {
                               throw new TypeCastException(str);
                            }
                         }
                         i2 = i2 + 1;
                      }else {
                         continue ;
                      }
                   }
                   throw new TypeCastException(str);
                }
             }else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
             }
          }else {
             b.a(inputStreamR, typeCastExce);
             return;
          }
       }
    }
}
