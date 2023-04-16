package com.yxcorp.gifshow.postwork.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.postwork.e;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import com.yxcorp.gifshow.postwork.e$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Collection;
import java.util.Iterator;
import gq.a;
import q87.c;
import java.lang.StringBuilder;
import crd.b;
import lnc.u1;
import eda.l;
import f0c.e;
import erd.g;
import eoc.f;
import eda.n;
import com.yxcorp.gifshow.postwork.c;
import java.util.concurrent.TimeUnit;
import pr3.a;
import brd.z;
import brd.t;
import f0c.g;
import com.yxcorp.gifshow.postwork.d;
import java.lang.RuntimeException;

public final class b implements Runnable	// class@0010c3
{
    public final e b;
    public final String c;
    public final String d;
    public final long e;

    public void b(e p0,String p1,String p2,long p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       Object[] objArray;
       boolean b1;
       Object[] objArray1;
       b uob = this;
       b b = uob.b;
       b c = uob.c;
       b d = uob.d;
       b e = uob.e;
       Objects.requireNonNull(b);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       String str = " eventKey=";
       if (TextUtils.x(c) || TextUtils.x(d)) {
          objArray = new Object[0];
          a.D().A("PostStuckDetector", "logEvent args wrong sessionId="+c+str+d, objArray);
       }else {
          e$b uob1 = b.a.get(c);
          if (uob1 == null && (!d.startsWith("start_") && (!d.equals("add_encode_task") && (d.equals("retry_task") || d.equals("add_upload_task"))))) {
             uob1 = PatchProxy.applyOneRefs(c, b, uoe, "9");
             if (uob1 != patchProxyRe) {
             }else {
                uob1 = new e$b(c);
                if (!b.a.containsKey(c)) {
                   e$b obj = PatchProxy.apply(null, b, uoe, "7");
                   if (obj != patchProxyRe) {
                      b1 = obj.booleanValue();
                   }else if(b.a.isEmpty()){
                      Iterator iterator = b.a.values().iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            obj = iterator.next();
                            if (obj.b.containsKey("create_export_task") && (!obj.b.containsKey("end_encode_task") && (!obj.b.containsKey("end_encode_task_fail") && !obj.b.containsKey("end_encode_task_cancel")))) {
                               b1 = true;
                               break ;
                            }else {
                               e$b uob2 = null;
                            }
                         }
                      }
                   }
                   b1 = false;
                   if (b1) {
                      objArray1 = new Object[0];
                      a.D().w("PostStuckDetector", "addNewTask: already has one task is encoding", objArray1);
                      uob1.k = true;
                   }
                   b.a.put(c, uob1);
                   objArray1 = new Object[0];
                   a.D().w("PostStuckDetector", "addNewTask "+uob1+" task num="+b.a.size(), objArray1);
                   if (!PatchProxy.applyVoid(null, b, uoe, "12")) {
                      e b2 = b.b;
                      if (b2 == null || b2.isDisposed()) {
                         Object[] objArray2 = new Object[0];
                         a.D().w("PostStuckDetector", "startHeartBeat: ", objArray2);
                         u1.a(b);
                         if (b.d == null) {
                            b.d = f.a(l.class, new e(b));
                         }
                         if (b.e == null) {
                            b.e = f.a(n.class, new c(b));
                         }
                         b.b = t.interval(0x2710, TimeUnit.MILLISECONDS, a.b).subscribe(new g(b), d.b);
                      }
                   }
                }else {
                   throw new RuntimeException("already has a task for id"+c);
                }
             }
             if (d.equals("retry_task")) {
                uob1.h = true;
             }
             uob1.a(d, e);
          }else {
             int i = 1;
             Object obj1 = PatchProxy.applyOneRefs(d, b, uoe, "13");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else if(!d.endsWith("_fail") && (d.endsWith("_cancel") || d.equals("end_publish_task"))){
                i = 0;
             }
          label_01ab :
             b1 = i;
             if (b1) {
                Object[] objArray3 = new Object[0];
                a.D().w("PostStuckDetector", "logEvent: isStopDetectingEvent eventKey="+d+" sessionId="+c, objArray3);
                if (!PatchProxy.applyVoidOneRefs(c, b, uoe, "10")) {
                   e$b uob3 = b.a.remove(c);
                   if (uob3 != null) {
                      Object[] objArray4 = new Object[0];
                      a.D().w("PostStuckDetector", "removeTask "+uob3+" task num="+b.a.size(), objArray4);
                      if (b.a.isEmpty()) {
                         b.h();
                      }
                   }
                }
             }else if(uob1 == null){
                objArray = new Object[0];
                a.D().A("PostStuckDetector", "logEvent: no task is detecting for sessionId="+c+str+d, objArray);
             }else {
                uob1.a(d, e);
             }
          }
       }
       return;
    }
}
