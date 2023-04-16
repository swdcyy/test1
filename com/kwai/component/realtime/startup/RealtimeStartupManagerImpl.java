package com.kwai.component.realtime.startup.RealtimeStartupManagerImpl;
import gg5.c;
import com.kwai.component.realtime.startup.RealtimeStartupManagerImpl$a;
import nsd.u;
import java.lang.Object;
import gg5.b;
import java.util.LinkedList;
import com.kwai.component.realtime.startup.RealtimeStartupManagerImpl$mRealtimeTabOptConfig$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.component.realtime.startup.RealtimeStartupManagerImpl$mPreference$2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import hg5.a;
import kotlin.jvm.internal.a;
import jg5.c;
import com.kwai.component.realtime.startup.RealtimeStartupManagerImpl$b;
import lnc.c2;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.util.List;
import java.lang.Boolean;
import wh5.c;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import crd.b;
import brd.t;
import com.yxcorp.utility.Log;
import android.os.Trace;
import java.lang.StringBuilder;
import java.util.Collection;
import java.util.LinkedHashMap;
import com.kwai.component.realtime.startup.RealtimeStartupManagerImpl$createRequest$2;
import msd.l;
import java.util.Objects;
import gg5.h;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import gg5.i;
import erd.o;
import erd.g;
import io.reactivex.internal.functions.Functions;
import gg5.j;
import android.content.SharedPreferences;
import java.lang.Throwable;
import o56.c;
import o56.a;
import java.util.Map;
import java.lang.IllegalArgumentException;

public class RealtimeStartupManagerImpl implements c	// class@000b11
{
    public a a;
    public b b;
    public boolean c;
    public final LinkedList d;
    public final p e;
    public final p f;
    public static final RealtimeStartupManagerImpl$a g;

    static {
       RealtimeStartupManagerImpl.g = new RealtimeStartupManagerImpl$a(null);
    }
    public void RealtimeStartupManagerImpl(){
       super();
       this.a = new b();
       this.d = new LinkedList();
       this.e = s.c(RealtimeStartupManagerImpl$mRealtimeTabOptConfig$2.INSTANCE);
       this.f = s.c(RealtimeStartupManagerImpl$mPreference$2.INSTANCE);
    }
    public long a(){
       Object obj = PatchProxy.apply(null, this, RealtimeStartupManagerImpl.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.a.a();
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RealtimeStartupManagerImpl.class, "9")) {
          return;
       }
       a.p(p0, "config");
       this.a = p0;
       return;
    }
    public c c(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RealtimeStartupManagerImpl.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d(p0, RealtimeStartupManagerImpl$b.a);
    }
    public c d(Class p0,c2 p1){
       c uoc;
       Iterator obj = PatchProxy.applyTwoRefs(p0, p1, this, RealtimeStartupManagerImpl.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return null;
          }
          uoc = obj.next();
          if (a.g(uoc.getClass(), p0) && (p1 == null || p1.accept(uoc))) {
             break ;
          }
       }
       return uoc;
    }
    public void e(RequestTiming p0,List p1,boolean p2){
       b uob;
       RealtimeStartupManagerImpl obj;
       z c;
       if (PatchProxy.isSupport(RealtimeStartupManagerImpl.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, RealtimeStartupManagerImpl.class, "11")) {
          return;
       }
       a.p(p0, "requestTiming");
       a.p(p1, "tasks");
       if (this.c != null || (!c.b() && !VisitorModeManager.f())) {
          if (PatchProxy.isSupport(RealtimeStartupManagerImpl.class)) {
             uob = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, RealtimeStartupManagerImpl.class, "12");
             if (uob != PatchProxyResult.class) {
             }else {
             label_0053 :
                boolean b = true;
                this.c = b;
                if (PatchProxy.isSupport(RealtimeStartupManagerImpl.class)) {
                   obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, RealtimeStartupManagerImpl.class, "13");
                   if (obj != PatchProxyResult.class) {
                   }else {
                   label_0072 :
                      String str = "realtime_startup";
                      if (p1.isEmpty()) {
                         Log.n(str, "没有需要请求的业务");
                      }else {
                         Trace.beginSection("realtimeTab_param");
                         obj = this.d;
                         obj.clear();
                         Iterator iterator = p1.iterator();
                         while (iterator.hasNext()) {
                            c uoc = iterator.next();
                            uoc.b();
                            if (uoc.a()) {
                               obj.add(uoc);
                            }else {
                               Log.n(str, "不允许请求 "+uoc.getClass().getSimpleName());
                            }
                         }
                         if (!obj.isEmpty()) {
                            LinkedList linkedList = new LinkedList(this.d);
                            super();
                            this.k(linkedList, RealtimeStartupManagerImpl$createRequest$2.INSTANCE);
                            iterator = linkedList.iterator();
                            while (iterator.hasNext()) {
                               Objects.requireNonNull(iterator.next());
                            }
                            Trace.endSection();
                            h str1 = new h(this, linkedList, this, p0, p2);
                            t ot = t.fromCallable(iterator);
                            iterator = PatchProxy.apply(null, this, RealtimeStartupManagerImpl.class, "8");
                            if (iterator != PatchProxyResult.class) {
                               b = iterator.booleanValue();
                            }else if(this.i() & 0x02){
                               b = false;
                            }
                            c = (b)? d.c: d.b;
                            obj = ot.subscribeOn(c).flatMap(i.b);
                         }
                      }
                      obj = null;
                   }
                }else {
                   goto label_0072 ;
                }
                if (obj != null) {
                   uob = obj.subscribe(Functions.d(), j.b);
                }else {
                   uob = null;
                }
             }
          }else {
             goto label_0053 ;
          }
          this.b = uob;
       }
    label_013c :
       return;
    }
    public final String f(){
       Object obj = PatchProxy.apply(null, this, RealtimeStartupManagerImpl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h().getString("key_imei", null);
    }
    public final String g(){
       Object obj = PatchProxy.apply(null, this, RealtimeStartupManagerImpl.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h().getString("key_muid", null);
    }
    public final SharedPreferences h(){
       Object obj = PatchProxy.apply(null, this, RealtimeStartupManagerImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
    public final int i(){
       Object obj = PatchProxy.apply(null, this, RealtimeStartupManagerImpl.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.e.getValue();
       }
       return obj.intValue();
    }
    public final boolean j(){
       Object obj = PatchProxy.apply(null, this, RealtimeStartupManagerImpl.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 1;
       if (!(this.i() & i)) {
          i = false;
       }
       return i;
    }
    public final void k(Iterable p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RealtimeStartupManagerImpl.class, "24")) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          p1.invoke(iterator.next());
       }
       return;
    }
    public final void l(c p0,LinkedHashMap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RealtimeStartupManagerImpl.class, "14")) {
          return;
       }
       Log.g("realtime_startup", "开始解析参数 "+p0.getClass().getSimpleName());
       Map map = p0.p();
       if (map != null) {
          p1.put(p0, map);
       }else {
          p0.h(false);
       }
       Log.g("realtime_startup", "结束解析参数 "+p0.getClass().getSimpleName());
       return;
    }
    public void reset(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RealtimeStartupManagerImpl.class, "25")) {
          return;
       }
       this.c = false;
       RealtimeStartupManagerImpl tb = this.b;
       if (tb != null) {
          tb.dispose();
       }
       this.b = objArray;
       Iterator iterator = this.d.iterator();
       while (iterator.hasNext()) {
          iterator.next().q();
       }
       this.d.clear();
       return;
    }
}
