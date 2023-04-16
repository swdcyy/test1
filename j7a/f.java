package j7a.f;
import erd.g;
import j7a.i;
import java.lang.Object;
import java.lang.Integer;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import java.lang.StringBuilder;
import uc6.c;
import sd5.d;
import sd5.c;

public final class f implements g	// class@00292c
{
    public final i b;

    public void f(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       if (tb.getActivity() == null) {
       }else if(tb.z != null){
          int i = p0.intValue();
          i oi = i.class;
          if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, oi, "6")) {
             tb.P8(" current Swipe "+i);
             c uoc = tb.p.N();
             c uoc1 = c.class;
             if (!PatchProxy.isSupport(uoc1) || !PatchProxy.applyVoidTwoRefs(uoc, Integer.valueOf(i), null, uoc1, "1")) {
                if (i == 3) {
                   uoc.i(true);
                }else if(i == 1){
                   uoc.e();
                }else if(i == 4){
                   uoc.g();
                }
             }
          }
       }else {
          tb.R8(p0.intValue());
       }
       return;
    }
}
