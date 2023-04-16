package gra.b$a$c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class b$a$c implements g	// class@002ba3
{
    public static final b$a$c b;

    static {
       b$a$c.b = new b$a$c();
    }
    public void b$a$c(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a$c.class, "1")) {
       }else {
          ExceptionHandler.handleException(a.b(), p0);
       }
       return;
    }
}
