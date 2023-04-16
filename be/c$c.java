package be.c$c;
import be.d;
import be.c;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.modules.core.ReactChoreographer$CallbackType;
import com.facebook.react.modules.core.a$a;
import cb.a;
import cb.c;
import java.lang.String;
import java.lang.Throwable;

public class c$c extends d	// class@000b20
{
    public boolean d;
    public final c e;

    public void c(long p0){
       if (this.d == null || this.e.n != null) {
          a.x("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
          return;
       }else {
          try{
             this.e.b(p0);
             this.e.a();
             ReactChoreographer.a().d(ReactChoreographer$CallbackType.DISPATCH_UI, this.e.l);
             return;
          }catch(java.lang.Exception e4){
             if (a.a.d(4)) {
                a.a.i(v1, "Exception thrown when executing UIFrameGuarded", e4);
             }
             this.d();
             throw e4;
          }
       }
    }
    public void d(){
       this.d = false;
    }
}
