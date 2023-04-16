package ec1.e;
import oq5.c;
import ec1.i;
import java.lang.Object;
import android.content.res.Configuration;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ec1.g;
import java.lang.Runnable;
import android.os.Handler;

public final class e implements c	// class@0020d5
{
    public final i b;

    public void e(i p0){
       this.b = p0;
    }
    public final void onConfigurationChanged(Configuration p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, i.class, "8")) {
       }else {
          i c = tb.C;
          boolean b = (p0.orientation == 2)? true: false;
          tb.C = b;
          if (b) {
             if (tb.x != null) {
                tb.S8();
             }
          }else if(c != null){
             tb.z.post(new g(tb));
          }
       }
       return;
    }
}
