package am8.e;
import java.util.concurrent.AbstractExecutorService;
import java.lang.String;
import java.lang.Runnable;
import am8.b;
import java.lang.IllegalArgumentException;
import java.lang.CharSequence;
import android.text.TextUtils;
import gm8.a;
import com.smile.gifmaker.thread.task.ElasticTask;
import dm8.c;
import java.lang.Object;
import java.util.Objects;
import android.os.Message;
import android.os.Handler;
import java.util.concurrent.TimeUnit;
import java.lang.RuntimeException;
import java.util.List;

public class e extends AbstractExecutorService	// class@0000f7
{
    public String b;
    public int c;

    public void e(String p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void a(Runnable p0,long p1){
       if (p0 == null) {
          if (!b.b) {
             return;
          }
          throw new IllegalArgumentException("can\'t post a null task");
       }else if(!TextUtils.isEmpty(this.b) || !b.b){
          c uoc = c.d();
          Objects.requireNonNull(uoc);
          Message message = Message.obtain();
          message.what = 11;
          message.obj = a.b().a(p0, this.b, 666);
          uoc.b.sendMessageDelayed(message, p1);
          return;
       }else {
          throw new IllegalArgumentException("can\'t accept an empty task name ");
       }
    }
    public boolean awaitTermination(long p0,TimeUnit p1){
       if (!b.b) {
          return false;
       }
       throw new RuntimeException("you can\'t terminate fixed-executor!");
    }
    public void b(){
       c uoc = c.d();
       Objects.requireNonNull(uoc);
       Message message = Message.obtain();
       message.what = 13;
       message.obj = this.b;
       uoc.b.sendMessage(message);
    }
    public void execute(Runnable p0){
       this.a(p0, 0);
    }
    public boolean isShutdown(){
       return false;
    }
    public boolean isTerminated(){
       return false;
    }
    public void shutdown(){
       if (!b.b) {
          return;
       }
       throw new RuntimeException("you can\'t shutdown fixed-executor!");
    }
    public List shutdownNow(){
       if (!b.b) {
          return null;
       }
       throw new RuntimeException("you can\'t shutdown fixed-executor!");
    }
}
