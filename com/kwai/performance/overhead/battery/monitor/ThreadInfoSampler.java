package com.kwai.performance.overhead.battery.monitor.ThreadInfoSampler;
import java.util.HashMap;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitorConfig;
import com.kwai.performance.overhead.battery.jni.NativeHandler;
import java.util.ArrayList;
import java.util.List;
import com.kwai.performance.overhead.battery.monitor.d;
import java.util.Comparator;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.lang.Object;
import java.lang.Integer;
import bg7.a;
import java.lang.System;
import ag7.h;
import java.util.Objects;
import android.os.Process;
import java.io.File;
import java.lang.StringBuilder;
import java.lang.String;
import java.io.RandomAccessFile;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Regex;
import java.util.Collection;
import ag7.j;
import java.lang.Long;
import qrd.l1;
import java.io.Closeable;
import java.lang.Throwable;
import isd.b;
import kotlin.TypeCastException;
import ag7.k;
import java.lang.Thread;
import java.lang.ThreadGroup;
import android.util.Pair;
import android.util.SparseIntArray;
import android.util.Log;
import yf7.i;
import ag7.b;

public class ThreadInfoSampler extends HashMap	// class@001132
{
    public final Map mCachedThreadMap;
    public final List mCostedExitThreadList;
    public final boolean mEnableMatchMulti;
    public boolean mKeepExitThread;
    public int mLastActiveThreadCount;
    public int mLastThreadCount;
    public long mLastToken;
    public final boolean mUseThreadDumpToBind;
    public static final int b;

    public void ThreadInfoSampler(BatteryMonitorConfig p0){
       boolean b1;
       super();
       this.mCachedThreadMap = this;
       boolean b = true;
       if (p0.isUseThreadDumpToBind()) {
          b1 = NativeHandler.b;
          b1 = (b1 != -1 && b1 != 10)? 1: 0;
          if (b1) {
             b1 = true;
          label_001e :
             this.mUseThreadDumpToBind = b1;
             if (b1 || !p0.isEnableMatchMultiThread()) {
                b = false;
             }
             this.mEnableMatchMulti = b;
             this.mCostedExitThreadList = new ArrayList();
             return;
          }
       }
       b1 = false;
       goto label_001e ;
    }
    public void clear(){
       super.clear();
       this.mCostedExitThreadList.clear();
    }
    public List getCostedExitThreadInfoList(){
       return this.mCostedExitThreadList;
    }
    public List getCostedOrderedThreadInfoList(){
       List costedThread = this.getCostedThreadInfoList();
       Collections.sort(costedThread, d.b);
       return costedThread;
    }
    public List getCostedThreadInfoList(){
       if (this.mCachedThreadMap.isEmpty()) {
          return Collections.emptyList();
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.mCachedThreadMap.keySet().iterator();
       while (iterator.hasNext()) {
          a uoa = this.mCachedThreadMap.get(iterator.next());
          if (uoa != null && uoa.g) {
             uArrayList.add(uoa);
          }
       }
       return uArrayList;
    }
    public int getLastActiveThreadCount(){
       return this.mLastActiveThreadCount;
    }
    public int getLastThreadCount(){
       return this.mLastThreadCount;
    }
    public void init(boolean p0){
       this.mKeepExitThread = p0;
    }
    public void reset(){
       Iterator iterator = this.mCachedThreadMap.keySet().iterator();
       while (iterator.hasNext()) {
          a uoa = this.mCachedThreadMap.get(iterator.next());
          if (uoa == null) {
             continue ;
          }else {
             uoa.d = 0;
             uoa.f = null;
             uoa.g = 0;
             uoa.i = 0;
             uoa.h = 0;
             uoa.j = 0;
             uoa.k = 1;
          }
       }
       this.mCostedExitThreadList.clear();
       return;
    }
    public void update(){
       ArrayList uArrayList;
       int len;
       int i1;
       String str7;
       int i5;
       a uoa;
       a f;
       ThreadGroup threadGroup;
       Pair pair;
       object oobject1;
       int i8;
       a uoa1;
       ThreadInfoSampler threadInfoSa = this;
       threadInfoSa.mLastToken = System.currentTimeMillis();
       Objects.requireNonNull(h.b);
       String str = "\(this as java.lang.String\).substring\(startIndex\)";
       String str1 = "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)";
       File[] uFileArray = new File("/proc/"+Process.myPid()+"/task").listFiles();
       int i = 0;
       if (uFileArray != null) {
          uArrayList = new ArrayList(uFileArray.length);
          len = uFileArray.length;
          i1 = 0;
          while (true) {
             if (i1 < len) {
                object oobject = uFileArray[i1];
                a.h(oobject, "threadList[index]");
                RandomAccessFile randomAccess = new RandomAccessFile(oobject.getPath()+"/stat", "r");
                String str2 = randomAccess.readLine();
                a.h(str2, "line");
                int i2 = StringsKt__StringsKt.w3(str2, "\)", 0, false, 6, null);
                String str3 = str2.substring(i, i2);
                a.h(str3, str1);
                String str4 = str3;
                String str5 = str3;
                int i3 = StringsKt__StringsKt.w3(str4, "\(", 0, 0, 6, 0);
                int i4 = i3 - 1;
                if (str5 != null) {
                   String str6 = str5.substring(i, i4);
                   a.h(str6, str1);
                   i4 = Integer.parseInt(str6);
                   i3 = i3 + 1;
                   str5 = str5.substring(i3);
                   a.h(str5, str);
                   i2 = i2 + 2;
                   str2 = str2.substring(i2);
                   a.h(str2, str);
                   String[] stringArray = new String[i];
                   Object[] objArray = new Regex("\\s+").split(str2, i).toArray(stringArray);
                   if (objArray != null) {
                      oobject = objArray[i];
                      if (i4) {
                         j oj = (str5.length() > 0)? 1: null;
                         if (oj) {
                            oj = new j();
                            oj.c = Long.parseLong(objArray[11]);
                            oj.d = Long.parseLong(objArray[12]);
                            oj.e = Long.parseLong(objArray[13]);
                            long l = Long.parseLong(objArray[14]);
                            oj.f = l;
                            oj.b = str5;
                            oj.a = i4;
                            oj.j = oobject;
                            str5 = str;
                            str7 = str1;
                            long l1 = oj.c + oj.d;
                            l1 = l1 + oj.e;
                            l1 = l1 + l;
                            oj.g = l1;
                            oj.k = Integer.parseInt(objArray[15]);
                            i5 = 36;
                            if (objArray.length >= i5) {
                               oj.l = Integer.parseInt(objArray[i5]);
                            }
                            uArrayList.add(oj);
                         label_013c :
                            b.a(randomAccess, null);
                            i1 = i1 + 1;
                            str = str5;
                            str1 = str7;
                            i = 0;
                         }
                      }
                      str5 = str;
                      str7 = str1;
                      goto label_013c ;
                   }else {
                      throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                   }
                }else {
                   throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
             }
          }
       }else {
          uArrayList = new ArrayList();
       }
       threadInfoSa.mLastThreadCount = uArrayList.size();
       Iterator iterator = uArrayList.iterator();
       int i6 = 0;
       ThreadInfoSampler threadInfoSa1 = 2;
       j oj1 = -1;
       while (iterator.hasNext()) {
          j oj2 = iterator.next();
          if (!threadInfoSa.mCachedThreadMap.containsKey(Integer.valueOf(oj2.a))) {
             threadInfoSa.mCachedThreadMap.put(Integer.valueOf(oj2.a), new a(oj2, threadInfoSa.mLastToken, threadInfoSa.mEnableMatchMulti));
          }else {
             uoa = threadInfoSa.mCachedThreadMap.get(Integer.valueOf(oj2.a));
             if (uoa == null) {
                continue ;
             }else {
                uoa.j = threadInfoSa.mLastToken;
                a l2 = uoa.l;
                if (l2 != oj1 && l2 != oj2.l) {
                   int i7 = uoa.m + 1;
                   uoa.m = i7;
                }
                uoa.l = oj2.l;
                f = uoa.f;
                if (f == null) {
                   uoa.f = oj2;
                }else {
                   long l3 = oj2.g - f.g;
                   if (uoa.g - l3) {
                      i6 = i6 + 1;
                   }
                   uoa.k = threadInfoSa1;
                   uoa.g = l3;
                   l3 = oj2.d - f.d;
                   uoa.h = l3;
                   long l4 = oj2.c - f.c;
                   uoa.i = l4;
                }
             }
          }
       }
       threadInfoSa.mLastActiveThreadCount = i6;
       if (k.a == null) {
          threadGroup = Thread.currentThread().getThreadGroup();
          k.a = threadGroup;
          if (threadGroup != null) {
             threadGroup = threadGroup.getParent();
             if (threadGroup != null) {
                k.a = threadGroup;
             }
          }
       }
       threadGroup = k.a;
       if (threadGroup == null) {
          i6 = 0;
          Thread[] threadArray = new Thread[i6];
          pair = new Pair(threadArray, Integer.valueOf(i6));
       }else {
          i8 = threadGroup.activeCount();
          Thread[] threadArray1 = new Thread[(i8 + (i8 / 2))];
          pair = new Pair(threadArray1, Integer.valueOf(k.a.enumerate(threadArray1)));
       }
       ArrayList uArrayList1 = new ArrayList();
       iterator = threadInfoSa.mCachedThreadMap.keySet().iterator();
       while (iterator.hasNext()) {
          uoa = threadInfoSa.mCachedThreadMap.get(iterator.next());
          if (uoa == null) {
             continue ;
          }else if(uoa.j - threadInfoSa.mLastToken){
             uoa.k = 3;
             if (threadInfoSa.mKeepExitThread != null && uoa.g - null) {
                threadInfoSa.mCostedExitThreadList.add(uoa);
             }
          }else if(!uoa.c() && !uoa.b()){
             uArrayList1.add(uoa);
          }
       }
       if (uArrayList1.size()) {
          if (threadInfoSa.mUseThreadDumpToBind != null) {
             i = 0;
             while (i < pair.second.intValue()) {
                oobject1 = pair.first[i];
                len = (int)oobject1.getId();
                if (!k.c.get(len, 0)) {
                   NativeHandler.a();
                   String[] stringArray1 = (NativeHandler.dumpThreadInfo(oobject1)).split("tid=");
                   i8 = (stringArray1.length == threadInfoSa1)? Integer.parseInt((stringArray1[1]).split(",")[0]): -1;
                   if (i8 != oj1) {
                      k.c.put(len, i8);
                      k.b.put(i8, len);
                   }
                }
                i = i + 1;
             }
             i8 = 0;
             while (i8 < uArrayList1.size()) {
                uoa1 = uArrayList1.get(i8);
                if (!uoa1.c()) {
                   f = uoa1.f;
                   i = 0;
                   while (i < pair.second.intValue()) {
                      oobject1 = pair.first[i];
                      int i9 = k.c.get((int)oobject1.getId(), 0);
                      if (i9 && f.a == i9) {
                         uoa1.a(oobject1);
                      }
                      i = i + 1;
                   }
                }
                i1 = 0;
                i8 = i8 + 1;
             }
             i = 0;
             while (i < uArrayList1.size()) {
                a uoa2 = uArrayList1.get(i);
                if (!uoa2.c()) {
                   i5 = uoa2.e + 1;
                   uoa2.e = i5;
                }else {
                   int i10 = 1;
                }
                i = i + 1;
             }
          }else {
             i8 = 0;
             while (i8 < uArrayList1.size()) {
                uoa1 = uArrayList1.get(i8);
                if (!uoa1.c()) {
                   f = uoa1.f;
                   i = 0;
                   while (i < pair.second.intValue()) {
                      oobject1 = pair.first[i];
                      if ((f.b).length() <= 15) {
                         if ((oobject1.getName()).equals(f.b)) {
                            uoa1.a(oobject1);
                         }
                      }else if((oobject1.getName()).startsWith(f.b)){
                         uoa1.a(oobject1);
                      }
                      i = i + 1;
                   }
                }
                len = 15;
                i8 = i8 + 1;
             }
          }
       }
       return;
    }
}
