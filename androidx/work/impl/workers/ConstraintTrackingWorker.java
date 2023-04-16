package androidx.work.impl.workers.ConstraintTrackingWorker;
import q3.c;
import androidx.work.ListenableWorker;
import java.lang.String;
import k3.h;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.lang.Object;
import w3.a;
import androidx.work.impl.WorkDatabase;
import l3.i;
import ig6.c;
import androidx.work.ListenableWorker$a;
import java.util.List;
import java.lang.Throwable;
import androidx.work.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import k3.n;
import u3.s;
import java.util.UUID;
import u3.r;
import q3.d;
import x3.a;
import java.util.Collections;
import java.lang.Iterable;
import xk.d;
import androidx.work.impl.workers.ConstraintTrackingWorker$b;
import java.util.concurrent.Executor;
import java.lang.Runnable;
import androidx.work.impl.workers.ConstraintTrackingWorker$a;

public class ConstraintTrackingWorker extends ListenableWorker implements c	// class@000aa3
{
    public WorkerParameters b;
    public final Object c;
    public boolean d;
    public a e;
    public ListenableWorker f;
    public static final String g;

    static {
       ConstraintTrackingWorker.g = h.f("ConstraintTrkngWrkr");
    }
    public void ConstraintTrackingWorker(Context p0,WorkerParameters p1){
       super(p0, p1);
       this.b = p1;
       this.c = new Object();
       this.d = false;
       this.e = a.N();
    }
    public WorkDatabase a(){
       return c.b(this.getApplicationContext()).H();
    }
    public void b(){
       this.e.J(ListenableWorker$a.a());
    }
    public void c(List p0){
       Object[] objArray = new Object[]{p0};
       Throwable[] throwableArr = new Throwable[0];
       h.c().a(ConstraintTrackingWorker.g, String.format("Constraints changed for %s", objArray), throwableArr);
       ConstraintTrackingWorker tc = this.c;
       _monitor_enter(tc);
       this.d = true;
       _monitor_exit(tc);
    }
    public void d(){
       this.e.J(ListenableWorker$a.b());
    }
    public void e(List p0){
    }
    public void f(){
       Throwable[] throwableArr;
       String str = this.getInputData().i("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
       int i = 0;
       if (TextUtils.isEmpty(str)) {
          throwableArr = new Throwable[i];
          h.c().b(ConstraintTrackingWorker.g, "No worker to delegate to.", throwableArr);
          this.b();
          return;
       }else {
          ListenableWorker listenableWo = this.getWorkerFactory().b(this.getApplicationContext(), str, this.b);
          this.f = listenableWo;
          if (listenableWo == null) {
             throwableArr = new Throwable[i];
             h.c().a(ConstraintTrackingWorker.g, "No worker to delegate to.", throwableArr);
             this.b();
             return;
          }else {
             r or = this.a().O().j(this.getId().toString());
             if (or == null) {
                this.b();
                return;
             }else {
                d uod = new d(this.getApplicationContext(), this.getTaskExecutor(), this);
                uod.d(Collections.singletonList(or));
                boolean b = uod.c(this.getId().toString());
                int i1 = 1;
                if (b) {
                   Object[] objArray = new Object[i1];
                   objArray[i] = str;
                   Throwable[] throwableArr1 = new Throwable[i];
                   h.c().a(ConstraintTrackingWorker.g, String.format("Constraints met for delegate %s", objArray), throwableArr1);
                   d uod1 = this.f.startWork();
                   uod1.u(new ConstraintTrackingWorker$b(this, uod1), this.getBackgroundExecutor());
                }else {
                   Object[] objArray1 = new Object[i1];
                   objArray1[i] = str;
                   throwableArr = new Throwable[i];
                   h.c().a(ConstraintTrackingWorker.g, String.format("Constraints not met for delegate %s. Requesting retry.", objArray1), throwableArr);
                   this.d();
                }
                return;
             }
          }
       }
    }
    public a getTaskExecutor(){
       return c.b(this.getApplicationContext()).J();
    }
    public boolean isRunInForeground(){
       ConstraintTrackingWorker tf = this.f;
       boolean b = (tf != null && tf.isRunInForeground())? true: false;
       return b;
    }
    public void onStopped(){
       super.onStopped();
       ConstraintTrackingWorker tf = this.f;
       if (tf != null) {
          tf.stop();
       }
       return;
    }
    public d startWork(){
       this.getBackgroundExecutor().execute(new ConstraintTrackingWorker$a(this));
       return this.e;
    }
}
