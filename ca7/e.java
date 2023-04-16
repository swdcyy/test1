package ca7.e;
import java.io.Closeable;

public final class e	// class@000517
{

    public static void a(Closeable p0){
       if (p0 == null) {
          return;
       }
       try{
          p0.close();
          return;
       }catch(java.io.IOException e0){
       }
    }
}
