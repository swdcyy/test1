package com.smilehacker.workmanager.ext.ConstraintWorker;
import androidx.work.CoroutineWorker;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ptd.c;
import kotlinx.coroutines.sync.MutexKt;
import asd.c;
import com.smilehacker.workmanager.ext.ConstraintWorker$doWork$1;
import csd.b;
import java.util.Map;
import qrd.j0;
import java.lang.IllegalStateException;
import dn8.b;
import java.util.Objects;
import qrd.l1;
import ptd.c$a;

public abstract class ConstraintWorker extends CoroutineWorker	// class@000c7c
{
    public final c d;

    public void ConstraintWorker(Context p0,WorkerParameters p1){
       a.p(p0, "appContext");
       a.p(p1, "params");
       super(p0, p1);
       this.d = MutexKt.f(true);
    }
    public final Object a(c p0){
       ConstraintWorker$doWork$1 uodoWork$1;
       WeakHashMap b;
       if (p0 instanceof ConstraintWorker$doWork$1) {
          uodoWork$1 = p0;
          ConstraintWorker$doWork$1 label = uodoWork$1.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uodoWork$1.label = label - i;
          label_0018 :
             ConstraintWorker$doWork$1 result = uodoWork$1.result;
             Object obj = b.h();
             ConstraintWorker$doWork$1 label1 = uodoWork$1.label;
             ConstraintWorker$doWork$1 uodoWork$11 = 3;
             ConstraintWorker$doWork$1 uodoWork$12 = 2;
             if (label1 != null) {
                if (label1 != 1) {
                   if (label1 != uodoWork$12) {
                      if (label1 != uodoWork$11) {
                         if (label1 == 4) {
                            j0.n(result);
                         label_00dd :
                            return result;
                         }else {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                         }
                      }else {
                         label1 = uodoWork$1.L$2;
                         uodoWork$11 = uodoWork$1.L$1;
                         uodoWork$12 = uodoWork$1.L$0;
                         j0.n(result);
                      label_00cb :
                         label1.f(null);
                         uodoWork$1.L$0 = uodoWork$12;
                         uodoWork$1.L$1 = uodoWork$11;
                         uodoWork$1.label = 4;
                         result = uodoWork$12.g(uodoWork$1);
                         if (result == obj) {
                            return obj;
                         }else {
                            goto label_00dd ;
                         }
                      }
                   }else {
                      label1 = uodoWork$1.L$1;
                      uodoWork$12 = uodoWork$1.L$0;
                      j0.n(result);
                   label_00b8 :
                      ConstraintWorker d = uodoWork$12.d;
                      uodoWork$1.L$0 = uodoWork$12;
                      uodoWork$1.L$1 = label1;
                      uodoWork$1.L$2 = d;
                      uodoWork$1.label = uodoWork$11;
                      if (d.e(null, uodoWork$1) == obj) {
                         return obj;
                      }else {
                         uodoWork$11 = label1;
                         ConstraintWorker uConstraintW = d;
                         goto label_00cb ;
                      }
                   }
                }else {
                   j0.n(result);
                }
             }else {
                j0.n(result);
                Map map = this.h();
                b c = b.c;
                if (c.b(map)) {
                   uodoWork$1.L$0 = this;
                   uodoWork$1.L$1 = map;
                   uodoWork$1.label = 1;
                   result = this.g(uodoWork$1);
                   if (result == obj) {
                      return obj;
                   }
                }else {
                   Objects.requireNonNull(c);
                   a.p(this, "worker");
                   a.p(map, "constraints");
                   b = b.b;
                   _monitor_enter(b);
                   b.put(this, map);
                   _monitor_exit(b);
                   if (!this.d.a()) {
                      uodoWork$1.L$0 = this;
                      uodoWork$1.L$1 = map;
                      uodoWork$1.label = uodoWork$12;
                      if (c$a.a(this.d, null, uodoWork$1, 1, null) == obj) {
                         return obj;
                      }
                   }
                   ConstraintWorker uConstraintW1 = this;
                   goto label_00b8 ;
                }
             }
             return result;
          }
       }
       uodoWork$1 = new ConstraintWorker$doWork$1(this, p0);
       goto label_0018 ;
    }
    public abstract Object g(c p0);
    public abstract Map h();
}
