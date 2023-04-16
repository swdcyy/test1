package d61.t;
import java.lang.Object;
import android.view.Window;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public class t	// class@001f41
{

    public void t(){
       super();
    }
    public static void a(Window p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, t.class, "1")) {
          return;
       }
       int i = 3846;
       try{
          p0.getDecorView().setSystemUiVisibility(i);
       }catch(java.lang.Exception e3){
          ExceptionHandler.handleCaughtException(e3);
       }
       return;
    }
}
