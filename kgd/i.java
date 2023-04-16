package kgd.i;
import erd.g;
import kgd.d;
import android.content.Context;
import java.lang.Object;
import kotlin.Result;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import android.widget.TextView;
import com.yxcorp.plugin.setting.helper.j;

public final class i implements g	// class@001797
{
    public final d b;
    public final Context c;
    public final boolean d;

    public void i(d p0,Context p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
       }else {
          p0 = Result.exceptionOrNull-impl(p0.unbox-impl());
          if (p0 != null) {
             ExceptionHandler.handleException(this.c, p0);
          }else {
             j.d(d.P8(this.b), this.b.R8());
             this.b.S8(this.d);
          }
       }
       return;
    }
}
