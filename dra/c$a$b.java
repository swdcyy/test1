package dra.c$a$b;
import erd.g;
import brd.v;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.lang.Boolean;
import brd.g;

public final class c$a$b implements g	// class@002503
{
    public final v b;

    public void c$a$b(v p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a$b.class, "1")) {
       }else {
          ExceptionHandler.handleException(a.b(), p0);
          this.b.onNext(Boolean.FALSE);
          this.b.onComplete();
       }
       return;
    }
}
