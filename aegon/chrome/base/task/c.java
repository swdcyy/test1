package aegon.chrome.base.task.c;
import java.util.concurrent.ThreadPoolExecutor;
import java.lang.Runtime;
import java.lang.Math;
import aegon.chrome.base.task.c$a;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.lang.Runnable;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import aegon.chrome.base.task.b$b;
import android.os.AsyncTask;
import java.lang.String;
import java.lang.reflect.Field;
import h0.a;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.Integer;
import java.util.concurrent.RejectedExecutionException;
import java.lang.StringBuilder;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public class c extends ThreadPoolExecutor	// class@000179
{
    public static final int b;
    public static final int c;
    public static final int d;
    public static final ThreadFactory e;
    public static final BlockingQueue f;

    static {
       int i = Runtime.getRuntime().availableProcessors();
       c.b = i;
       c.c = Math.max(2, Math.min((i - 1), 4));
       c.d = (i * 2) + 1;
       c.e = new c$a();
       c.f = new ArrayBlockingQueue(128);
    }
    public void c(){
       super(c.c, c.d, 30, TimeUnit.SECONDS, c.f, c.e);
       this.allowCoreThreadTimeOut(true);
    }
    public void execute(Runnable p0){
       int i1;
       Class uClass;
       String str2;
       try{
          super.execute(p0);
          return;
       }catch(java.util.concurrent.RejectedExecutionException e11){
          HashMap hashMap = new HashMap();
          Runnable[] runnableArra = new Runnable[0];
          Runnable[] runnableArra1 = this.getQueue().toArray(runnableArra);
          int len = runnableArra1.length;
          int i = 0;
       label_0019 :
          if (i < len) {
             object oobject = runnableArra1[i];
             Class class = oobject.getClass();
             try{
                i1 = 1;
                if (class == b$b.class) {
                   uClass = oobject.m();
                label_002c :
                   class = uClass;
                }else if(class.getEnclosingClass() == AsyncTask.class){
                   Field declaredFiel = class.getDeclaredField("this$0");
                   declaredFiel.setAccessible(i1);
                   uClass = declaredFiel.get(oobject).getClass();
                   goto label_002c ;
                }
             }catch(java.lang.NoSuchFieldException e5){
                if (a.b) {
                   throw new RuntimeException(e5);
                }
             }catch(java.lang.IllegalAccessException e5){
                if (a.b) {
                   throw new RuntimeException(e5);
                }
             }
             String name = class.getName();
             int i2 = (hashMap.containsKey(name))? hashMap.get(name).intValue(): 0;
             i2 = i2 + i1;
             hashMap.put(name, Integer.valueOf(i2));
             i = i + 1;
             goto label_0019 ;
          }else {
             StringBuilder str = "Prominent classes in AsyncTask: ";
             StringBuilder str1 = "";
             Iterator iterator = hashMap.entrySet().iterator();
          label_0099 :
             if (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                if (uEntry.getValue().intValue() > ' ') {
                   str1 = str1+uEntry.getKey()+' ';
                   goto label_0099 ;
                }else {
                   goto label_0099 ;
                }
             }else if(!str1.length()){
                str2 = "NO CLASSES FOUND";
             }else {
                str2 = str1;
             }
             throw new RejectedExecutionException(str+str2, e11);
          }
       }
    }
}
