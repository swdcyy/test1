package am8.c;
import am8.a;
import java.lang.String;
import java.lang.Runnable;
import am8.b;
import java.lang.IllegalArgumentException;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import gm8.a;
import com.smile.gifmaker.thread.task.ElasticTask;
import java.lang.Exception;
import java.lang.Throwable;
import android.util.Log;
import dm8.c;
import java.lang.Object;
import java.util.Objects;
import android.os.Message;
import android.os.Handler;

public class c extends a	// class@0000f5
{

    public void c(String p0,int p1){
       super(p0, p1);
    }
    public static void c(Runnable p0,String p1,int p2,long p3){
       if (p0 == null) {
          if (!b.b) {
             return;
          }else {
             throw new IllegalArgumentException("can\'t post a null task");
          }
       }else if(!TextUtils.isEmpty(p1) || !b.b){
          int i = 3;
          if (p2 && (p2 != 1 && (p2 != 2 && p2 != i))) {
             if (!b.b) {
                p2 = 3;
             }else {
                throw new IllegalArgumentException("illegal priority "+p2);
             }
          }
          a uoa = a.b();
          if (TextUtils.isEmpty(p1)) {
             p1 = "default";
          }
          p1 = "ela_"+p1;
          if (p1.length() > 256) {
             p1 = p1.substring(0, 255);
          }
          ElasticTask uElasticTask = uoa.a(p0, p1, p2);
          if (b.f) {
             uElasticTask.e = Log.getStackTraceString(new Exception("Elastic-Caller-Stacktrace"));
          }
          c uoc = c.d();
          Objects.requireNonNull(uoc);
          Message message = Message.obtain();
          message.what = 1;
          message.obj = uElasticTask;
          uoc.b.sendMessageDelayed(message, p3);
          return;
       }else {
          throw new IllegalArgumentException("can\'t accept an empty task name ");
       }
    }
    public static void d(Runnable p0,String p1,int p2){
       c.c(p0, p1, p2, 0);
    }
    public void a(Runnable p0,String p1){
       this.b(p0, p1, this.b);
    }
    public void b(Runnable p0,String p1,int p2){
       c.d(p0, p1, p2);
    }
    public void execute(Runnable p0){
       this.b(p0, this.c, this.b);
    }
}
