package n90.g$k;
import erd.g;
import n90.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kuaishou.gifshow.kuaishan.utils.e;
import androidx.lifecycle.MutableLiveData;

public final class g$k implements g	// class@0026de
{
    public final g b;
    public final boolean c;

    public void g$k(g p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g$k.class, "1")) {
       }else {
          e.v(p0, "downloadTemplate failed due to: "+p0.getMessage());
          if (this.b.d == null) {
             this.b.f().setValue(p0);
          }
          PatchProxy.onMethodExit(g$k.class, "1");
       }
       return;
    }
}
