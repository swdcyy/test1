package sfc.a;
import erd.g;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public class a implements g	// class@0041ac
{
    public final Context b;

    public void a(){
       super(a.a().a());
    }
    public void a(Context p0){
       super();
       this.b = p0;
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       ExceptionHandler.handleException(this.b, p0);
       return;
    }
}
