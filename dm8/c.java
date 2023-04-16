package dm8.c;
import java.lang.Object;
import dm8.a;
import dm8.b;
import dm8.d;
import dm8.e;
import cm8.b;
import cm8.c;
import com.smile.gifmaker.thread.statistic.recorders.a;
import fm8.a;
import android.os.HandlerThread;
import java.lang.String;
import dm8.c$a;
import android.os.Looper;
import am8.b;
import android.os.Message;
import android.os.Handler;
import java.util.Objects;
import cm8.a;
import com.smile.gifmaker.thread.task.ElasticTask;
import com.smile.gifmaker.thread.executor.BaseExecutorCell;

public class c	// class@0014cd
{
    public HandlerThread a;
    public Handler b;
    public a c;
    public b d;
    public e e;
    public b f;
    public c g;
    public d h;
    public a i;
    public a j;
    public boolean k;
    public static c l;

    public void c(){
       super();
       this.c = new a();
       this.d = new b();
       this.h = new d();
       this.e = new e();
       this.f = new b();
       this.g = new c();
       this.i = new a();
       this.j = new a();
       HandlerThread handlerThrea = new HandlerThread("ElasticSchedulerThread");
       this.a = handlerThrea;
       handlerThrea.setPriority(10);
       this.a.start();
       this.b = new c$a(this, this.a.getLooper());
       this.h(b.n);
       this.i(b.o);
    }
    public static c d(){
       if (c.l == null) {
          c uoc = c.class;
          _monitor_enter(uoc);
          if (c.l == null) {
             c.l = new c();
          }
          _monitor_exit(uoc);
       }
       return c.l;
    }
    public a a(){
       return this.c;
    }
    public b b(){
       return this.d;
    }
    public b c(){
       return this.f;
    }
    public void e(){
       Message message = Message.obtain();
       message.what = 3;
       this.b.sendMessageDelayed(message, 0);
    }
    public void f(){
       Message message = Message.obtain();
       message.what = 2;
       this.b.sendMessageDelayed(message, 0);
    }
    public void g(String p0){
       Message message = Message.obtain();
       message.what = 12;
       message.obj = p0;
       this.b.sendMessageDelayed(message, 0);
    }
    public void h(long p0){
       if (b.b && b.m) {
          Message message = Message.obtain();
          message.what = 9;
          this.b.sendMessageDelayed(message, p0);
       }
       return;
    }
    public final void i(long p0){
       Message message = Message.obtain();
       message.what = 10;
       this.b.sendMessageDelayed(message, p0);
    }
    public int j(){
       ElasticTask uElasticTask;
       int i = 0;
       while (true) {
          c tf = this.f;
          Objects.requireNonNull(tf);
          int i1 = 0;
          break ;
       }
       while (true) {
          if (i1 < 4) {
             if (!tf.a[i1].e()) {
                uElasticTask = tf.a[i1].c();
             label_0022 :
                i1 = 1;
                if (uElasticTask == null) {
                label_0025 :
                   i1 = 0;
                }else {
                   c tc = this.c;
                   Objects.requireNonNull(tc);
                   int i2 = uElasticTask.c();
                   if (!i2 || i2 == i1) {
                      if (tc.a.e(uElasticTask) || (tc.b.e(uElasticTask) || tc.c.e(uElasticTask))) {
                      label_0071 :
                         tc = 1;
                      label_0074 :
                         if (tc) {
                            this.f.d(uElasticTask);
                         }else if(this.d.a.e(uElasticTask)){
                            this.f.d(uElasticTask);
                         }else {
                            goto label_0025 ;
                         }
                      }
                   }else if(i2 == 2){
                      if (tc.b.e(uElasticTask) || tc.c.e(uElasticTask)) {
                         goto label_0071 ;
                      }
                   }else if(i2 == 3 && tc.c.e(uElasticTask)){
                      goto label_0071 ;
                   }
                   tc = null;
                   goto label_0074 ;
                }
                if (i1) {
                   i = i + 1;
                }else {
                   break ;
                }
             }else {
                i1 = i1 + 1;
             }
          }else {
             uElasticTask = null;
             goto label_0022 ;
          }
       }
       return i;
    }
    public boolean k(String p0){
       a uoa = this.g.b(p0);
       ElasticTask uElasticTask = (!uoa.e())? uoa.c(): null;
       boolean b = false;
       if (uElasticTask == null) {
          return b;
       }else if(this.h.a.e(uElasticTask)){
          c tg = this.g;
          Objects.requireNonNull(tg);
          tg.b(uElasticTask.b()).f(uElasticTask);
          return true;
       }else {
          return b;
       }
    }
    public boolean l(){
       c te = this.e;
       ElasticTask uElasticTask = te.a.c();
       boolean b = false;
       if (uElasticTask == null) {
       }else if(te.b.e(uElasticTask)){
          te.a.f(uElasticTask);
          b = true;
       }
       return b;
    }
}
