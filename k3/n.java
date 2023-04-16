package k3.n;
import java.lang.String;
import k3.h;
import java.lang.Object;
import k3.n$a;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.ListenableWorker;
import java.lang.Class;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.lang.reflect.Constructor;
import java.lang.IllegalStateException;

public abstract class n	// class@002481
{
    public static final String a;

    static {
       n.a = h.f("WorkerFactory");
    }
    public void n(){
       super();
    }
    public static n c(){
       return new n$a();
    }
    public abstract ListenableWorker a(Context p0,String p1,WorkerParameters p2);
    public final ListenableWorker b(Context p0,String p1,WorkerParameters p2){
       ListenableWorker listenableWo = this.a(p0, p1, p2);
       if (listenableWo == null) {
          Class uClass = Class.forName(p1).asSubclass(ListenableWorker.class);
          if (uClass != null) {
             Class[] uClassArray = new Class[]{Context.class,WorkerParameters.class};
             Object[] objArray = new Object[]{p0,p2};
             listenableWo = uClass.getDeclaredConstructor(uClassArray).newInstance(objArray);
          }
       }
       if (listenableWo == null || !listenableWo.isUsed()) {
          return listenableWo;
       }else {
          Object[] objArray1 = new Object[]{this.getClass().getName(),p1};
          throw new IllegalStateException(String.format("WorkerFactory \(%s\) returned an instance of a ListenableWorker \(%s\) which has already been invoked. createWorker\(\) must always return a new instance of a ListenableWorker.", objArray1));
       }
    }
}
