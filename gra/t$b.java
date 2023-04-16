package gra.t$b;
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

public final class t$b implements g	// class@002bc5
{
    public final v b;

    public void t$b(v p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t$b.class, "1")) {
       }else {
          ExceptionHandler.handleException(a.b(), p0);
          this.b.onNext(Boolean.FALSE);
          this.b.onComplete();
       }
       return;
    }
}
