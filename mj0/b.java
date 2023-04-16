package mj0.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.c;
import jk0.b;
import jk0.c;
import com.kuaishou.krn.nativecrash.MockNativeCrash;
import java.lang.Thread;
import java.lang.InterruptedException;
import com.kuaishou.krn.exception.KrnException;
import java.lang.OutOfMemoryError;

public class b	// class@003189
{

    public void b(){
       super();
    }
    public static void a(){
       if (PatchProxy.applyVoid(null, null, b.class, "2")) {
          return;
       }
       if (c.b().j()) {
          return;
       }
       if (c.a().m0()) {
          throw new OutOfMemoryError("mock krn OOM error");
       }
       if (c.a().v()) {
          MockNativeCrash.stringFromJNI();
       }
       if (!c.a().i()) {
          if (c.a().t0()) {
             long l = 0x7530;
             try{
                Thread.sleep(l);
             }catch(java.lang.InterruptedException e0){
                e0.printStackTrace();
             }
          }
       }else {
          throw new KrnException("mock krn java crash");
       }
    }
}
