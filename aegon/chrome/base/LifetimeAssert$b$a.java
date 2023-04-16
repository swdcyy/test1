package aegon.chrome.base.LifetimeAssert$b$a;
import java.lang.Thread;
import java.lang.String;
import aegon.chrome.base.LifetimeAssert$b;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.Object;
import java.util.Set;
import java.lang.Class;
import aegon.chrome.base.LifetimeAssert;
import aegon.chrome.base.LifetimeAssert$a;
import aegon.chrome.base.LifetimeAssert$LifetimeAssertException;
import java.lang.Throwable;
import java.lang.RuntimeException;

public class LifetimeAssert$b$a extends Thread	// class@000146
{

    public void LifetimeAssert$b$a(String p0){
       super(p0);
       this.setDaemon(true);
       this.start();
    }
    public void run(){
       String str;
       LifetimeAssert$a c;
       try{
          LifetimeAssert$b uob = LifetimeAssert$b.d.remove();
          while (!LifetimeAssert$b.e.remove(uob)) {
             continue ;
             c.a(uob, str);
          }
          if (uob.a == null) {
             Object[] objArray = new Object[]{uob.b.getName()};
             str = String.format("Object of type %s was GC\'ed without cleanup. Refer to \"Caused by\" for where object was created.", objArray);
             c = LifetimeAssert.c;
             if (c == null) {
                throw new LifetimeAssert$LifetimeAssertException(str, uob.c);
             }
          }else {
             LifetimeAssert$a c1 = LifetimeAssert.c;
             if (c1 != null) {
                c1.a(uob, null);
                goto label_0000 ;
             }else {
                goto label_0000 ;
             }
          }
       }catch(java.lang.InterruptedException e0){
          throw new RuntimeException(e0);
       }
    }
}
