package com.kuaishou.android.security.base.perf.c;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuffer;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Locale;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.h;
import com.kuaishou.android.security.internal.common.KSecurityContext;
import com.kuaishou.android.security.KSecurity;
import java.lang.Long;
import java.lang.Integer;
import java.lang.System;

public class c	// class@000ef9
{
    public static ConcurrentHashMap a;
    public static ConcurrentHashMap b;

    static {
       c.a = new ConcurrentHashMap();
       c.b = new ConcurrentHashMap();
    }
    public void c(){
       super();
    }
    public static String a(){
       Iterator iterator;
       Map$Entry uEntry;
       Object[] objArray;
       String prepareSoSta;
       String kgSessionId;
       StringBuffer obj = PatchProxy.apply(null, null, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       String str = "{%s:%s}";
       if (c.a.size()) {
          obj = obj+"***errorbt***";
          iterator = new TreeMap(c.a).entrySet().iterator();
          while (iterator.hasNext()) {
             uEntry = iterator.next();
             objArray = new Object[]{uEntry.getKey(),uEntry.getValue()};
             obj = obj+String.format(Locale.getDefault(), str, objArray);
          }
       }
       if (c.b.size()) {
          obj = obj+"****commonbt****";
          iterator = new TreeMap(c.b).entrySet().iterator();
          while (iterator.hasNext()) {
             uEntry = iterator.next();
             objArray = new Object[]{uEntry.getKey(),uEntry.getValue()};
             obj = obj+String.format(Locale.getDefault(), str, objArray);
          }
       }
       str = "unknown";
       if (b.i().j() != null) {
          str = b.i().h().getLoadSoStatus();
          prepareSoSta = b.i().h().getPrepareSoStatus();
          kgSessionId = b.i().h().getKgSessionId();
       }else {
          prepareSoSta = str;
          kgSessionId = prepareSoSta;
       }
       Object[] objArray1 = new Object[]{str,prepareSoSta};
       obj = obj+String.format(">>>>>sostatus[%s] preparestate[%s]<<<<<<<<<<<<", objArray1);
       Object[] objArray2 = new Object[]{Long.valueOf(KSecurity.getInitTime()),kgSessionId};
       obj.insert(0, String.format("initbegintime[%d]%s->", objArray2));
       return obj;
    }
    public static void a(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, uoc, "1")) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(p0)};
       c.a.put(Long.valueOf(System.currentTimeMillis()), String.format(Locale.getDefault(), "%d", objArray));
       return;
    }
    public static void a(int p0,long p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), null, uoc, "3")) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(p0)};
       c.b.put(Long.valueOf(p1), String.format(Locale.getDefault(), "%d", objArray));
       return;
    }
    public static void b(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, uoc, "2")) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(p0)};
       c.b.put(Long.valueOf(System.currentTimeMillis()), String.format(Locale.getDefault(), "%d", objArray));
       return;
    }
}
