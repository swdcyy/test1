package ar.c;
import android.content.Context;
import tq.f;
import com.kuaishou.android.vader.persistent.LogRecordDatabase;
import er.m;
import tq.d;
import java.lang.Object;
import java.util.HashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import xq.d;
import java.lang.String;
import java.util.concurrent.ThreadPoolExecutor$DiscardPolicy;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.RejectedExecutionHandler;
import java.lang.StringBuilder;
import android.content.SharedPreferences;
import cr.h$a;
import cr.h;
import java.util.Map;
import cr.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import br.b;
import java.lang.System;
import java.lang.Exception;
import tq.h;
import com.kuaishou.android.vader.persistent.a;
import fr.a;
import com.kuaishou.android.vader.Channel;
import ar.b;
import java.lang.Integer;
import java.util.Set;
import java.lang.Number;
import java.lang.Enum;
import com.kuaishou.android.vader.stat.ValueOrException;
import java.lang.NullPointerException;
import android.database.sqlite.SQLiteException;
import java.util.HashSet;
import java.util.Iterator;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.io.IOException;
import xq.b;
import ar.c$a;
import java.lang.Runnable;

public class c	// class@000283
{
    public final String a;
    public final String b;
    public final String c;
    public int d;
    public final Map e;
    public final Map f;
    public final SharedPreferences g;
    public final LogRecordDatabase h;
    public final h i;
    public int j;
    public int k;
    public int l;
    public final d m;
    public final Map n;
    public final g o;
    public final m p;
    public final ThreadPoolExecutor q;

    public void c(Context p0,f p1,LogRecordDatabase p2,m p3,d p4){
       int i = this;
       super();
       String str = "SequenceId";
       i.a = str;
       i.b = "SeqId";
       i.c = "CustomKeys";
       i.d = 1;
       HashMap hashMap = new HashMap();
       i.e = hashMap;
       i.f = new HashMap();
       HashMap hashMap1 = new HashMap();
       i.n = hashMap1;
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(1), new d("seqIdGenerator"), new ThreadPoolExecutor$DiscardPolicy());
       i.q = v14;
       String str1 = ((m.a).equals(p3.c()))? "": p3.c()+"_";
       i.g = p1.a(p0, str1+str, 0);
       i.p = p3;
       i.h = p2;
       i.m = p4;
       h$a uoa = h.a();
       this.i(uoa);
       this.g(uoa);
       this.h(uoa);
       hashMap1.putAll(hashMap);
       i.i = uoa.h(0).d(0).g(0).a();
       i.o = this.a();
       return;
    }
    public final g a(){
       Object obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = -1;
       int i1 = 0;
       try{
          c th = this.h;
          if (th == null) {
             return g.a(i, i1, i1, i1);
          }
          long l = th.E().m();
          long l1 = 0;
          if (l - l1) {
             l1 = TimeUnit.MILLISECONDS.toHours((System.currentTimeMillis() - l));
          }
          return g.a(this.h.E().b(), this.h.E().n(), this.h.E().j(), (int)l1);
       }catch(java.lang.Exception e2){
          this.m.a(e2);
          c tp = this.p;
          if (tp != null && tp.e().c()) {
             this.m.logCustomEvent("V2_VADER_DB_ERROR", a.b(String.valueOf(4), a.i(e2), e2.getMessage(), ""));
          }
          return g.a(i, i1, i1, i1);
       }
    }
    public synchronized b b(Channel p0,String p1){
       int i1;
       c obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       this.d = obj + 1;
       int i = this.e.get(p0).intValue();
       this.e.put(p0, Integer.valueOf((i + 1)));
       if (this.f.keySet().contains(p1)) {
          i1 = this.f.get(p1).intValue();
          this.f.put(p1, Integer.valueOf((i1 + 1)));
       }else {
          this.f.put(p1, Integer.valueOf(2));
          i1 = 1;
       }
       this.k();
       b uob = b.c(obj, i, i1, System.currentTimeMillis());
       this.j = this.j + 1;
       "Next sequenceId: "+uob;
       return uob;
    }
    public int c(Channel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.n.get(p0).intValue() - 1);
    }
    public g d(){
       return this.o;
    }
    public synchronized h e(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.k().h(this.j).d(this.k).g(this.l).a();
    }
    public g f(){
       Object obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a();
    }
    public final void g(h$a p0){
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, c.class, "7")) {
          return;
       }
       HashMap hashMap = new HashMap();
       HashMap hashMap1 = new HashMap();
       Channel[] uChannelArra = Channel.values();
       int len = uChannelArra.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = uChannelArra[i];
          int i1 = 1;
          int intx = obj.g.getInt(oobject.name(), i1);
          ValueOrException valueOrExcep = ValueOrException.d(Integer.valueOf(intx));
          try{
             hashMap.put(oobject, valueOrExcep);
             c h = obj.h;
             if (h != null) {
                int i2 = h.E().g(oobject) + i1;
                hashMap1.put(oobject, ValueOrException.d(Integer.valueOf(i2)));
                i1 = i2;
             }else {
                hashMap1.put(oobject, ValueOrException.c(new NullPointerException("database == null")));
                obj.m.a(new NullPointerException("database == null"));
             }
             if (i1 > intx) {
                obj.m.b("channel_seqId_mismatch", "channel: "+oobject.name()+" nextSeqId : "+intx+" nextDbSeqId: "+i1);
                intx = i1;
             }
             obj.e.put(oobject, Integer.valueOf(intx));
          }catch(android.database.sqlite.SQLiteException e0){
             obj.m.a(e0);
             c p = obj.p;
             if (p != null && p.e().c()) {
                obj.m.logCustomEvent("V2_VADER_DB_ERROR", a.b(String.valueOf(4), a.i(e0), e0.getMessage(), String.valueOf(oobject.getValue())));
             }
             hashMap1.put(oobject, ValueOrException.c(e0));
             i1 = 1;
             goto label_00a9 ;
          }
       }
       obj1.c(hashMap);
       obj1.b(hashMap1);
       return;
    }
    public final void h(h$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "8")) {
          return;
       }
       HashMap hashMap = new HashMap();
       HashMap hashMap1 = new HashMap();
       Set stringSet = this.g.getStringSet("CustomKeys", new HashSet());
       if (stringSet != null) {
          Iterator iterator = stringSet.iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             int i = 1;
             int intx = this.g.getInt(str, i);
             ValueOrException valueOrExcep = ValueOrException.d(Integer.valueOf(intx));
             try{
                hashMap.put(str, valueOrExcep);
                c th = this.h;
                if (th != null) {
                   int i1 = th.E().f(str) + i;
                   hashMap1.put(str, ValueOrException.d(Integer.valueOf(i1)));
                   i = i1;
                }else {
                   hashMap1.put(str, ValueOrException.c(new NullPointerException("database == null")));
                }
                if (i > intx) {
                   this.m.b("custom_seqId_mismatch", "custom_type: "+str+" nextSeqId : "+intx+" nextDbSeqId: "+i);
                   intx = i;
                }
                this.f.put(str, Integer.valueOf(intx));
             }catch(android.database.sqlite.SQLiteException e6){
                this.m.a(e6);
                c tp = this.p;
                if (tp != null && tp.e().c()) {
                   this.m.logCustomEvent("V2_VADER_DB_ERROR", a.b(String.valueOf(4), a.i(e6), e6.getMessage(), ""));
                }
                hashMap1.put(str, ValueOrException.c(e6));
                goto label_00a4 ;
             }
          }
       }
       p0.f(hashMap);
       p0.e(hashMap1);
       return;
    }
    public final void i(h$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "6")) {
          return;
       }
       int i = 1;
       int intx = this.g.getInt("SeqId", i);
       this.d = intx;
       ValueOrException valueOrExcep = ValueOrException.d(Integer.valueOf(intx));
       try{
          p0.j(valueOrExcep);
          c th = this.h;
          if (th != null) {
             intx = th.E().c() + i;
             p0.i(ValueOrException.d(Integer.valueOf(intx)));
             i = intx;
          }else {
             p0.i(ValueOrException.c(new Exception("database == null")));
          }
          if (i > this.d) {
             this.m.b("seqId_mismatch", "nextSeqId : "+this.d+" nextDbSeqId: "+i);
             this.d = i;
          }
          return;
       }catch(android.database.sqlite.SQLiteException e0){
          this.m.a(e0);
          c tp = this.p;
          if (tp != null && tp.e().c()) {
             this.m.logCustomEvent("V2_VADER_DB_ERROR", a.b(String.valueOf(4), a.i(e0), e0.getMessage(), ""));
          }
          p0.i(ValueOrException.c(e0));
          goto label_007f ;
       }
    }
    public synchronized void j(){
       if (PatchProxy.applyVoid(null, this, c.class, "10")) {
          return;
       }
       SharedPreferences$Editor uEditor = this.g.edit();
       Channel rEAL_TIME = Channel.REAL_TIME;
       String str = rEAL_TIME.name();
       SharedPreferences$Editor uEditor1 = uEditor.putInt("SeqId", this.d).putInt(str, this.e.get(rEAL_TIME).intValue());
       rEAL_TIME = Channel.HIGH_FREQ;
       str = rEAL_TIME.name();
       uEditor1 = uEditor1.putInt(str, this.e.get(rEAL_TIME).intValue());
       rEAL_TIME = Channel.NORMAL;
       str = rEAL_TIME.name();
       uEditor1.putInt(str, this.e.get(rEAL_TIME).intValue());
       uEditor.putStringSet("CustomKeys", this.f.keySet());
       Iterator iterator = this.f.keySet().iterator();
       while (iterator.hasNext()) {
          String str1 = iterator.next();
          uEditor.putInt(str1, this.f.get(str1).intValue());
       }
       this.k = this.k + 1;
       if (!g.b(uEditor)) {
          this.l = this.l + 1;
          this.m.a(new IOException("SharedPreference commit failed."));
       }
       return;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, c.class, "9")) {
          return;
       }
       this.q.execute(new b(this.m, new c$a(this)));
       return;
    }
}
