package com.kwai.performance.stability.leak.monitor.WatermarkMonitor;
import com.kwai.performance.monitor.base.loop.LoopMonitor;
import zg7.a;
import com.kwai.performance.monitor.base.loop.LoopMonitor$b;
import com.yxcorp.utility.AbiUtil;
import android.os.Debug;
import yf7.x;
import yf7.u;
import java.lang.Object;
import com.kwai.performance.monitor.base.Monitor;
import com.kwai.performance.stability.leak.monitor.WatermarkMonitorConfig;
import com.kwai.performance.monitor.base.loop.LoopMonitor$b$a;
import java.lang.String;
import java.lang.CharSequence;
import yf7.h;
import kotlin.Result;
import com.google.gson.c;
import com.google.gson.JsonElement;
import kotlin.jvm.internal.a;
import com.google.gson.JsonObject;
import java.lang.Boolean;
import java.util.concurrent.TimeUnit;
import msd.a;
import java.lang.Number;
import java.lang.Long;
import msd.l;
import qrd.l1;
import java.lang.Throwable;
import qrd.j0;
import com.kwai.performance.monitor.base.loop.LoopMonitor$b$b;
import kotlin.Pair;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.List;
import java.lang.StringBuilder;
import java.lang.Iterable;
import zg7.d;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Collection;
import trd.y;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.TypeCastException;
import android.os.Handler;
import com.kwai.performance.stability.leak.monitor.WatermarkMonitor$a;
import java.lang.Runnable;
import com.kwai.performance.stability.leak.monitor.WatermarkMonitor$b;
import com.kwai.performance.monitor.base.d;
import yf7.t;
import android.app.Application;
import yf7.k;
import android.content.Context;
import ekd.e0;
import com.kwai.performance.stability.leak.monitor.WatermarkMonitor$c;
import com.kwai.performance.stability.leak.monitor.WatermarkMonitor$d;

public final class WatermarkMonitor extends LoopMonitor	// class@001234
{
    public static final WatermarkMonitor INSTANCE;
    public static final long KB_PER_GB;
    public static final String LOG_TAG;
    public static a mAllocationOwnerDispatcher;
    public static boolean mIsStart;
    public static long mNativePtr;

    static {
       WatermarkMonitor.INSTANCE = new WatermarkMonitor();
    }
    public void WatermarkMonitor(){
       super();
    }
    public static final a access$getMAllocationOwnerDispatcher$p(WatermarkMonitor p0){
       return WatermarkMonitor.mAllocationOwnerDispatcher;
    }
    public static final boolean access$getMIsStart$p(WatermarkMonitor p0){
       return WatermarkMonitor.mIsStart;
    }
    public static final long access$getMNativePtr$p(WatermarkMonitor p0){
       return WatermarkMonitor.mNativePtr;
    }
    public static final void access$setMAllocationOwnerDispatcher$p(WatermarkMonitor p0,a p1){
       WatermarkMonitor.mAllocationOwnerDispatcher = p1;
    }
    public static final void access$setMIsStart$p(WatermarkMonitor p0,boolean p1){
       WatermarkMonitor.mIsStart = p1;
    }
    public static final void access$setMNativePtr$p(WatermarkMonitor p0,long p1){
       WatermarkMonitor.mNativePtr = p1;
    }
    public static final void access$startLoop$s-1481197450(WatermarkMonitor p0,boolean p1,boolean p2,long p3){
       super.startLoop(p1, p2, p3);
    }
    public static final void access$stopLoop$s-1481197450(WatermarkMonitor p0){
       super.stopLoop();
    }
    public LoopMonitor$b call(){
       long l;
       long pss = (AbiUtil.b())? Debug.getPss(): u.b().a;
       if (AbiUtil.b()) {
          l = 0x100000;
       }else if(AbiUtil.c()){
          l = 0x400000;
       }else {
          l = 0x300000;
       }
       if (pss - ((l * (long)this.getMonitorConfig().d) / (long)100) <= 0) {
          return LoopMonitor$b$a.a;
       }else {
          String str = this.nativeCollectProcMemInfo(WatermarkMonitor.mNativePtr);
          Result$a uoa = (!str.length())? 1: null;
          if (uoa) {
             h.b("WatermarkMonitor", "procMemInfo is empty");
          }else {
             JsonElement jsonElement = new c().a(str);
             a.h(jsonElement, "JsonParser\(\).parse\(proMemInfo\)");
             JsonObject jsonObject = jsonElement.r();
             jsonObject.H("isArm64Device", Boolean.valueOf(AbiUtil.c()));
             WatermarkMonitor iNSTANCE = WatermarkMonitor.INSTANCE;
             jsonObject.a0("time", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(iNSTANCE.getMonitorConfig().g.invoke().longValue())));
             String str1 = jsonObject.toString();
             a.h(str1, "jsonObject.toString\(\)");
             iNSTANCE.getMonitorConfig().h.invoke(str1);
             Object obj = Result.constructor-impl(l1.a);
             if (Result.exceptionOrNull-impl(obj) != null) {
                h.b("WatermarkMonitor", "procMemInfo json format error");
                WatermarkMonitor.INSTANCE.getMonitorConfig().h.invoke(str);
             }
          }
          this.stopLoop();
          return LoopMonitor$b$b.a;
       }
    }
    public Object call(){
       return this.call();
    }
    public final Pair dumpAllocationOwners(){
       Pair pair;
       a mAllocationO = WatermarkMonitor.mAllocationOwnerDispatcher;
       if (mAllocationO != null) {
          ArrayList uArrayList = new ArrayList();
          ArrayList uArrayList1 = new ArrayList();
          Iterator iterator = mAllocationO.a.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             List value = uEntry.getValue();
             uArrayList.add(key);
             StringBuilder str = "owner "+key;
             h.b("AllocationOwnerDispatcher", str+" indexInfo "+value);
             ArrayList uArrayList2 = new ArrayList();
             Iterator iterator1 = value.iterator();
             while (iterator1.hasNext()) {
                d uod = iterator1.next();
                Long[] longArray = new Long[]{Long.valueOf(uod.b),Long.valueOf(uod.c)};
                y.q0(uArrayList2, CollectionsKt__CollectionsKt.L(longArray));
             }
             uArrayList1.add(CollectionsKt___CollectionsKt.H5(uArrayList2));
          }
          String[] stringArray = new String[0];
          Object[] objArray = uArrayList.toArray(stringArray);
          String str1 = "null cannot be cast to non-null type kotlin.Array<T>";
          if (objArray != null) {
             long[][] olongArray = new long[][0];
             Object[] objArray1 = uArrayList1.toArray(olongArray);
             if (objArray1 != null) {
                pair = new Pair(objArray, objArray1);
             }else {
                throw new TypeCastException(str1);
             }
          }else {
             throw new TypeCastException(str1);
          }
       }else {
          pair = null;
       }
       return pair;
    }
    public final void entryOwner(String p0){
       a.q(p0, "owner");
       if (!this.isInitialized()) {
          return;
       }
       this.getLoopHandler().post(new WatermarkMonitor$a(p0));
       return;
    }
    public final void exitOwner(String p0){
       a.q(p0, "owner");
       if (!this.isInitialized()) {
          return;
       }
       this.getLoopHandler().post(new WatermarkMonitor$b(p0));
       return;
    }
    public final long getAllocIndex$com_kwai_performance_stability_leak_monitor(){
       return this.nativeAllocIndex(WatermarkMonitor.mNativePtr);
    }
    public final String[] getFocusPages(){
       return this.getMonitorConfig().c;
    }
    public void init(d p0,WatermarkMonitorConfig p1){
       a.q(p0, "commonConfig");
       a.q(p1, "monitorConfig");
       if (!t.a("memory-monitor")) {
          return;
       }
       e0.b(k.b());
       super.init(p0, p1);
       return;
    }
    public void init(d p0,Object p1){
       this.init(p0, p1);
    }
    public native final long nativeAllocIndex(long p0);
    public native final String nativeCollectProcMemInfo(long p0);
    public native final long nativeInit(String[] p0,String[] p1,int p2);
    public native final boolean nativeStart(long p0);
    public native final void nativeStop(long p0);
    public final void startLoop(){
       if (!this.isInitialized()) {
          h.b("WatermarkMonitor", "Please initialize WatermarkMonitor before start, check init\(\)");
          return;
       }else {
          this.getLoopHandler().post(WatermarkMonitor$c.b);
          return;
       }
    }
    public void stopLoop(){
       if (!this.isInitialized()) {
          h.b("WatermarkMonitor", "Please initialize WatermarkMonitor before stop, check init\(\)");
          return;
       }else {
          this.getLoopHandler().post(WatermarkMonitor$d.b);
          return;
       }
    }
}
