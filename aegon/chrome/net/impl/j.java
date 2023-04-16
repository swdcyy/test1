package aegon.chrome.net.impl.j;
import java.lang.Runnable;
import aegon.chrome.net.impl.j$a;
import java.lang.Object;

public class j	// class@0000ce
{

    public static void a(Runnable p0){
       try{
          p0.run();
       }catch(java.lang.UnsatisfiedLinkError e0){
          try{
             e0.run();
          }catch(java.lang.UnsatisfiedLinkError e0){
             e0.run();
          }
       }
       return;
    }
    public static Object b(j$a p0){
       try{
          p0 = p0.get();
          return p0;
       }catch(java.lang.UnsatisfiedLinkError e0){
          try{
             p0 = e0.get();
             return p0;
          }catch(java.lang.UnsatisfiedLinkError e0){
             return e0.get();
          }
       }
    }
}
