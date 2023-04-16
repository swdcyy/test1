package be.d;
import com.facebook.react.modules.core.a$a;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import java.lang.Exception;

public abstract class d extends a$a	// class@000b22
{
    public final NativeModuleCallExceptionHandler c;

    public void d(NativeModuleCallExceptionHandler p0){
       super();
       this.c = p0;
    }
    public void d(ReactContext p0){
       super(p0.getExceptionHandler());
    }
    public final void a(long p0){
       try{
          this.c(p0);
       }catch(java.lang.RuntimeException e1){
          this.c.handleException(e1);
       }
       return;
    }
    public abstract void c(long p0);
}
