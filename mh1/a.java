package mh1.a;
import java.lang.Runnable;
import mh1.b$a;
import java.lang.Object;
import mh1.b;
import jh1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.view.ViewGroup;

public final class a implements Runnable	// class@003174
{
    public final b$a b;

    public void a(b$a p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       b a = tb.a.A;
       if (a != null) {
          a uoa = PatchProxy.apply(null, a, a.class, "1");
          if (uoa != PatchProxyResult.class) {
          }else {
             uoa = a.a;
             if (uoa == null) {
                uoa = a.b();
                a.a = uoa;
             }
          }
          if (uoa != null) {
             tb.a.z.setVisibility(0);
             tb.a.z.removeAllViews();
             tb.a.z.addView(uoa, 0);
          }
       }
       return;
    }
}
