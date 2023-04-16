package g76.a;
import i97.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public class a implements a	// class@0016bd
{

    public void a(){
       super();
    }
    public void a(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       ExceptionHandler.handleCaughtException(p0);
       return;
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       ExceptionHandler.handleCaughtException(p0);
       return;
    }
}
