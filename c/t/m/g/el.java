package c.t.m.g.el;
import java.io.Closeable;

public class el	// class@000c6e
{

    public static void a(Closeable p0){
       try{
          if (p0 != null) {
             p0.close();
          }
          return;
       }catch(java.io.IOException e0){
       }
    }
}
