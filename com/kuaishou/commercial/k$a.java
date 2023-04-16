package com.kuaishou.commercial.k$a;
import rw.d;
import com.kuaishou.commercial.k;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import u35.b;
import java.lang.reflect.Type;
import r35.b;
import java.util.concurrent.ExecutorService;
import t45.c;
import cw.p;
import java.util.Objects;
import r35.f;
import java.util.ArrayList;
import o35.b;
import mn.b$a;
import mn.b;
import java.util.Iterator;
import u35.b$a;
import java.lang.CharSequence;
import android.text.TextUtils;
import r35.a;
import java.lang.Runnable;
import on.b;
import java.util.Map;
import java.lang.StringBuilder;
import java.lang.Integer;

public class k$a extends d	// class@0014ef
{
    public final k c;

    public void k$a(k p0,String p1){
       this.c = p0;
       super(p1);
    }
    public void run(){
       String str1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k$a.class, "1")) {
          return;
       }
       b value = a.t().getValue("adClientLogMorpheusCollector", b.class, objArray);
       if (value == null || value.platform != 1) {
          value = objArray;
       }
       b uob = b.d();
       ExecutorService uExecutorSer = c.f("MorpheusCollector");
       p op = new p(this);
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoidThreeRefs(value, uExecutorSer, op, uob, b.class, "3")) {
          b uob1 = b.class;
          if (!PatchProxy.applyVoidTwoRefs(value, uExecutorSer, uob, uob1, "2")) {
             f.a().a = uExecutorSer;
             if (!PatchProxy.applyVoidOneRefs(value, uob, uob1, "4")) {
                if (value != null) {
                   b localLog = value.localLog;
                   if (localLog != null && !localLog.isEmpty()) {
                      if (value.equals(uob.e)) {
                         Object[] objArray3 = new Object[0];
                         b.g().i("neoCollector", "batchLoadDsl dslConfig load repeat. return", objArray3);
                      }else {
                         uob.e = value;
                         localLog = new b$a().a();
                         localLog.f("__registers__", new ArrayList());
                         Iterator iterator = value.localLog.iterator();
                         while (iterator.hasNext()) {
                            b$a uoa = iterator.next();
                            if (TextUtils.isEmpty(uoa.script)) {
                               Object[] objArray4 = new Object[0];
                               b.g().i("neoCollector", "batchLoadDsl script is empty. continue", objArray4);
                            }else {
                               Object[] objArray5 = new Object[0];
                               b.g().i("neoCollector", "batchLoadDsl loadAsync script", objArray5);
                               uoa = uoa.script;
                               if (PatchProxy.applyVoidTwoRefs(uoa, localLog, uob, uob1, "6")) {
                                  continue ;
                               }else {
                                  f.a().b(new a(uob, uoa, localLog));
                               }
                            }
                         }
                      }
                   }
                }
                _monitor_enter(uob1);
                Object[] objArray2 = new Object[0];
                b.g().i("neoCollector", "batchLoadDsl reset env. return", objArray2);
                if (!PatchProxy.applyVoid(objArray, uob, uob1, "8")) {
                   b.d();
                   b.e();
                }
                uob.d.clear();
                uob.f(0);
                uob.e = objArray;
                _monitor_exit(uob1);
             }
          }
          uob.g = op;
          uob = b.g();
          StringBuilder str = "Collector init, dslConfig\'s size is ";
          if (value != null) {
             value = value.localLog;
             if (value != null) {
                str1 = Integer.valueOf(value.size());
             label_0134 :
                str = str+str1+";executorService is ";
                str1 = (uExecutorSer == null)? "null": uExecutorSer.toString();
                Object[] objArray1 = new Object[0];
                uob.i("neoCollector", str+str1+";dslConfigLoader is "+op.toString(), objArray1);
             }
          }
          str1 = "null";
          goto label_0134 ;
       }
       return;
    }
}
