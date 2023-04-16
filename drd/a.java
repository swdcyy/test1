package drd.a;
import java.lang.Throwable;
import java.lang.RuntimeException;
import io.reactivex.internal.util.ExceptionHelper;
import java.lang.VirtualMachineError;
import java.lang.ThreadDeath;
import java.lang.LinkageError;

public final class a	// class@000ce6
{

    public static RuntimeException a(Throwable p0){
       throw ExceptionHelper.d(p0);
    }
    public static void b(Throwable p0){
       if (p0 instanceof VirtualMachineError) {
          throw p0;
       }
       if (p0 instanceof ThreadDeath) {
          throw p0;
       }
       if (!p0 instanceof LinkageError) {
          return;
       }
       throw p0;
    }
}
