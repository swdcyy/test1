package dm8.c$a;
import android.os.Handler;
import dm8.c;
import android.os.Looper;
import android.os.Message;
import dm8.a;
import com.smile.gifmaker.thread.executor.BaseExecutorCell;
import dm8.b;
import dm8.d;
import dm8.e;
import cm8.c;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.lang.Object;
import java.lang.String;
import cm8.a;
import java.util.List;
import com.smile.gifmaker.thread.task.ElasticTask;
import com.smile.gifmaker.thread.statistic.recorders.Recordable$RecordStatus;
import java.util.Objects;
import am8.b;
import fm8.b;
import org.json.JSONObject;
import fm8.c;
import bm8.e;
import bm8.b;
import cm8.b;
import com.smile.gifmaker.thread.statistic.recorders.a;
import android.os.SystemClock;
import em8.a$a;
import em8.a;
import java.lang.Math;

public class c$a extends Handler	// class@0014cc
{
    public final c a;

    public void c$a(c p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       c f;
       c$a a;
       c f1;
       int i4;
       b uob;
       int i5;
       double d;
       a$a uoa1;
       String str;
       c uoc;
       JSONObject jSONObject;
       JSONObject jSONObject1;
       JSONObject jSONObject2;
       a uoa2;
       b uob1;
       try{
          c$a uoa = this;
          Message message = p0;
          super.handleMessage(p0);
          int i = 2;
          int i1 = 4;
          int i2 = 1;
          int i3 = 0;
          switch (message.what){
              case 1:
                message = message.obj;
                if (message instanceof ElasticTask) {
                   f = uoa.a.f;
                   Objects.requireNonNull(f);
                   f.c(message.c()).d(message);
                }
                a = uoa.a;
                if (a.k != null) {
                   return;
                }else {
                   a.j();
                   f1 = uoa.a.f;
                   Objects.requireNonNull(f1);
                   i4 = 0;
                   while (true) {
                      if (i4 < i1) {
                         if (!f1.a[i4].e()) {
                         label_04b3 :
                            if (i2) {
                               uoa.removeMessages(3);
                               uoa.a.e();
                               break ;
                            }
                         }else {
                            i4 = i4 + 1;
                         }
                      }else {
                         i2 = 0;
                         goto label_04b3 ;
                      }
                   }
                }
                break;
              case 2:
                a = uoa.a;
                if (a.k != null) {
                   return;
                }else {
                   a.j();
                }
                break;
              case 3:
                a = uoa.a;
                if (a.k != null) {
                   return;
                }else {
                   b a1 = a.d.a;
                   Objects.requireNonNull(a1);
                   uob = c.d().c();
                   Objects.requireNonNull(uob);
                   i = 0;
                   i5 = 0;
                   float f2 = 0;
                   while (i5 < i1) {
                      Iterator iterator = uob.a[i5].a.iterator();
                      while (iterator.hasNext()) {
                         long l = iterator.next().f() + 200;
                         float f3 = (float)l * b.w[i5];
                         f2 = f2 + f3;
                      }
                      i5 = i5 + 1;
                   }
                   f2 = f2 / 1000.00f;
                   i4 = a1.f() - b.x;
                   float f4 = (i4 <= 0)? 0: (float)((double)b.y * Math.pow((double)i4, (double)b.z));
                   i5 = a1.f() - a1.h();
                   float f5 = (i5 < 0)? 0: (float)(i5 * -20);
                   f2 = (f2 + f4) + f5;
                   f4 = 20.00f;
                   if (f2 - i > 0) {
                      d = Math.ceil((double)(f2 / f4));
                   }else if(f2 - i < 0){
                      d = Math.floor((double)(f2 / f4));
                   }else {
                   label_0431 :
                      i = 5;
                      if (i3 < -10) {
                         i3 = -10;
                      }else if(i3 > i){
                         i3 = 5;
                      }
                      i4 = a1.b + i3;
                      if (i4 < a1.h()) {
                         i4 = a1.h();
                      }
                      i = i4 - a1.b;
                      a1.b = i4;
                      if (b.e) {
                         uoa1 = a.a();
                         if (uoa1 != null) {
                            uoa1.logCustomEvent("kwai_elastic_dredge_concurrent", String.valueOf(i4));
                         }
                      }
                      if (i > 0) {
                         uoa.a.j();
                      }
                   }
                   i3 = (int)d;
                   goto label_0431 ;
                }
                break;
              case 4:
                message = message.obj;
                if (message instanceof ElasticTask) {
                   uoa.a.e.a.d(message);
                   a = uoa.a;
                   if (a.k != null) {
                      return;
                   }else {
                      a.l();
                   }
                }
                break;
              case 5:
                a = uoa.a;
                if (a.k != null) {
                   return;
                }else {
                   a.l();
                }
                break;
              case 6:
                Objects.requireNonNull(uoa.a.e);
                break;
              case 7:
                a = uoa.a;
                a.i.d();
                c i6 = a.i;
                Objects.requireNonNull(i6);
                i6.a = Recordable$RecordStatus.RECORDING;
                i6.b = SystemClock.elapsedRealtime();
                i6.c = 0;
                f = a.c;
                f.a.a();
                f.b.a();
                f.c.a();
                a.d.a.a();
                f = a.f;
                Objects.requireNonNull(f);
                for (; i3 < i1; i3 = i3 + 1) {
                   object oobject = f.a[i3];
                   oobject.b = 0;
                   oobject.c = 0;
                   oobject.d = Recordable$RecordStatus.RECORDING;
                }
                a.e.b.a();
                break;
              case 8:
                a = uoa.a;
                if (a.i.d() == Recordable$RecordStatus.RECORDING) {
                   f = a.i;
                   Objects.requireNonNull(f);
                   f.a = Recordable$RecordStatus.RECORD_END;
                   f.c = SystemClock.elapsedRealtime();
                   f = a.c;
                   f.a.b();
                   f.b.b();
                   f.c.b();
                   a.d.a.b();
                   f = a.f;
                   Objects.requireNonNull(f);
                   for (i5 = 0; i5 < i1; i5 = i5 + 1) {
                      object oobject1 = f.a[i5];
                      Objects.requireNonNull(oobject1);
                      oobject1.d = Recordable$RecordStatus.RECORD_END;
                   }
                   a.e.b.b();
                   if (a.i.c() - 0x7530 > 0) {
                      f1 = a.i;
                      Objects.requireNonNull(f1);
                      str = "third";
                      if (b.c && f1.a == Recordable$RecordStatus.RECORD_END) {
                         try{
                            uoc = c.d();
                            jSONObject = new JSONObject();
                            jSONObject.put("record_time", f1.c());
                            jSONObject1 = new JSONObject();
                            jSONObject2 = new JSONObject();
                            uoa2 = uoc.a();
                            jSONObject2.put("first", f1.e(uoa2.e()));
                            jSONObject2.put("second", f1.e(uoa2.d()));
                            jSONObject2.put(str, f1.e(uoa2.c()));
                            jSONObject1.put("artery", jSONObject2);
                            jSONObject2 = new JSONObject();
                            jSONObject2.put("expandable", f1.e(uoc.b().c()));
                            jSONObject1.put("dredge", jSONObject2);
                            jSONObject.put("executor", jSONObject1);
                            jSONObject1 = new JSONObject();
                            uob1 = uoc.c();
                            jSONObject1.put("immediate", f1.f(uob1.c(i3)));
                            jSONObject1.put("first", f1.f(uob1.c(i2)));
                            jSONObject1.put("second", f1.f(uob1.c(i)));
                            jSONObject1.put(str, f1.f(uob1.c(3)));
                            jSONObject.put("queue", jSONObject1);
                            if (b.b) {
                               jSONObject.toString();
                            }
                            uoa1 = a.a();
                            if (uoa1 != null) {
                               uoa1.logCustomEvent("kwai_elastic_recorder", jSONObject.toString());
                            }
                         }catch(java.lang.Exception e0){
                         }
                      }
                   }
                }
                break;
              case 9:
                if (b.a == null) {
                   uob = b.class;
                   _monitor_enter(uob);
                   if (b.a == null) {
                      b.a = new b();
                   }
                   _monitor_exit(uob);
                }
                Objects.requireNonNull(b.a);
                String str1 = "Third";
                str = "Second";
                String str2 = "First";
                uoc = c.d();
                jSONObject = new JSONObject();
                jSONObject1 = new JSONObject();
                jSONObject2 = new JSONObject();
                uoa2 = uoc.a();
                jSONObject2.put(str2, c.a(uoa2.e()));
                jSONObject2.put(str, c.a(uoa2.d()));
                jSONObject2.put(str1, c.a(uoa2.c()));
                jSONObject1.put("Artery", jSONObject2);
                jSONObject2 = new JSONObject();
                e uoe = uoc.b().c();
                JSONObject jSONObject3 = new JSONObject();
                if (uoe != null) {
                   String str3 = (uoe.k != null)? "working": "shutdown";
                   jSONObject3.put("Status", str3);
                   jSONObject3.put("WorkingThreadNum", uoe.h());
                   jSONObject3.put("MaxThreadNum", uoe.f());
                }
                jSONObject2.put("Expandable", jSONObject3);
                jSONObject1.put("Dredge", jSONObject2);
                jSONObject.put("Executor", jSONObject1);
                JSONObject jSONObject4 = new JSONObject();
                uob1 = uoc.c();
                jSONObject4.put("Immediate", c.b(uob1.c(i3)));
                jSONObject4.put(str2, c.b(uob1.c(i2)));
                jSONObject4.put(str, c.b(uob1.c(i)));
                jSONObject4.put(str1, c.b(uob1.c(3)));
                jSONObject.put("Queue", jSONObject4);
                jSONObject.toString();
                uoa.a.h(b.n);
                break;
              case 10:
                a = uoa.a;
                a.e();
                a.i(b.o);
                break;
              case 11:
                message = message.obj;
                if (message instanceof ElasticTask) {
                   f = uoa.a.g;
                   Objects.requireNonNull(f);
                   f.b(message.b()).d(message);
                   c.d().g(message.b());
                }
                break;
              case 12:
                c$a a2 = uoa.a;
                if (a2.k != null) {
                   return;
                }
                message = message.obj;
                if (message instanceof String) {
                   do {
                   } while (a2.k(message));
                }
                break;
              case 13:
                message = message.obj;
                if (message instanceof String) {
                   a uoa3 = uoa.a.g.b(message);
                   Iterator iterator1 = uoa3.a.iterator();
                   while (iterator1.hasNext()) {
                      ElasticTask uElasticTask = iterator1.next();
                      if (uoa3.d == Recordable$RecordStatus.RECORDING) {
                         long l1 = uoa3.b + uElasticTask.f();
                         uoa3.b = l1;
                         long l2 = uoa3.c + 1;
                         uoa3.c = l2;
                      }
                   }
                   uoa3.a.clear();
                }
                break;
              case 14:
                uoa.a.k = i2;
                break;
              case 15:
                a = uoa.a;
                a.k = i3;
                a.j();
                uoa.a.l();
                Iterator iterator2 = uoa.a.g.a.keySet().iterator();
                while (iterator2.hasNext()) {
                   uoa.a.k(iterator2.next());
                }
                uoa.a.e();
                break;
              case 16:
                f1 = uoa.a.c;
                f1.a.l();
                f1.b.l();
                f1.c.l();
                uoa.a.d.a.l();
                uoa.a.h.a.l();
                uoa.a.e.b.l();
                break;
              default:
          }
       }catch(java.lang.Exception e0){
       }
    label_04be :
       return;
    }
}
