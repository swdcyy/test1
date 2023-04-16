package a97.a;
import java.io.Closeable;
import java.io.Flushable;

public class a	// class@00007e
{

    public static void a(Closeable p0){
       try{
          if (p0 != null) {
             if (p0 instanceof Flushable) {
                try{
                   p0.flush();
                }catch(java.lang.Exception e0){
                }
             }
             p0.close();
          }
       }catch(java.lang.Exception e0){
       }
    }
}
