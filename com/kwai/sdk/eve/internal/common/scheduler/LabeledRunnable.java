package com.kwai.sdk.eve.internal.common.scheduler.LabeledRunnable;
import cn7.a;
import cn7.h;
import java.lang.String;
import com.kuaishou.eve.packageinfo.model.ResourceType;
import java.lang.Runnable;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.common.scheduler.LabeledRunnable$idHash$2;
import msd.a;
import qrd.p;
import qrd.s;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import cn7.i;
import cn7.c;
import com.kwai.sdk.eve.internal.statistics.EveLogger;
import java.lang.Throwable;
import android.util.Log;
import com.kwai.sdk.switchconfig.a;
import java.lang.StringBuilder;

public final class LabeledRunnable extends h implements a	// class@001483
{
    public final p c;
    public final String d;
    public final ResourceType e;
    public final String f;
    public final Runnable g;

    public void LabeledRunnable(String p0,ResourceType p1,String p2,Runnable p3){
       a.p(p0, "label");
       a.p(p1, "resource");
       a.p(p3, "runnable");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
       this.c = s.c(new LabeledRunnable$idHash$2(this));
    }
    public void LabeledRunnable(String p0,ResourceType p1,String p2,Runnable p3,int p4,u p5){
       p1 = (p4 & 0x02)? ResourceType.CPU: null;
       if (p4 & 0x04) {
          p2 = null;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public String dc(){
       Object obj = PatchProxy.apply(null, this, LabeledRunnable.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LabeledRunnable.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LabeledRunnable && (a.g(this.m(), p0.m()) && (a.g(this.getResource(), p0.getResource()) && (a.g(this.q(), p0.q()) && a.g(this.g, p0.g)))))) {
          return true;
       }
       return false;
    }
    public ResourceType getResource(){
       return this.e;
    }
    public int hashCode(){
       String obj = PatchProxy.apply(null, this, LabeledRunnable.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.m();
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       ResourceType resource = this.getResource();
       int i2 = (resource != null)? resource.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       String str = this.q();
       i2 = (str != null)? str.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       LabeledRunnable tg = this.g;
       if (tg != null) {
          i = tg.hashCode();
       }
       return (i1 + i);
    }
    public String m(){
       return this.d;
    }
    public String q(){
       return this.f;
    }
    public void run(){
       Iterator iterator;
       if (PatchProxy.applyVoid(null, this, LabeledRunnable.class, "1")) {
          return;
       }
       try{
          if (this.a()) {
             iterator = this.H().iterator();
             while (iterator.hasNext()) {
                iterator.next().b(this);
             }
             this.g.run();
             if (this.a()) {
                iterator = this.H().iterator();
                while (iterator.hasNext()) {
                   iterator.next().a(this);
                }
             }
          }else {
             goto label_002a ;
          }
       }catch(java.lang.Exception e0){
          String stackTraceSt = Log.getStackTraceString(e0);
          a.o(stackTraceSt, "Log.getStackTraceString\(e\)");
          EveLogger.INSTANCE.logCustomEvent("EVE_LABELED_RUNNABLE_EXCEPTION", stackTraceSt);
          if (!a.t().d("eveRemoveLabeledRunnableCatch", false)) {
             if (this.a()) {
                iterator = this.H().iterator();
             label_007b :
                if (iterator.hasNext()) {
                   iterator.next().a(this);
                   goto label_007b ;
                }
             }
          }else {
             throw e0;
          }
       }
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LabeledRunnable.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LabeledRunnable\(label="+this.m()+", resource="+this.getResource()+", seqId="+this.q()+", runnable="+this.g+"\)";
    }
}
