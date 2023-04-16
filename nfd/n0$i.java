package nfd.n0$i;
import nfd.n0$c;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import nfd.m0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nfd.n0;
import lnc.a1;
import zf6.j;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;

public class n0$i extends n0$c	// class@001ddc
{
    public m0 g;

    public void n0$i(View p0,ImageView p1,TextView p2,m0 p3){
       super(p0, p1, p2, p3);
       this.g = p3;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, n0$i.class, "1")) {
          return;
       }
       m0 c = this.g.c;
       boolean b = true;
       if (c != null) {
          if (c == b) {
             n0.e(this.a, this.a(), b);
             int i = 0x7f061fbb;
             n0$i tg = this.g;
             if (tg != null && tg.e != null) {
                i = 0x7f061be0;
             }
             n0.d(this.c, a1.p(R.string.arg_RES_7f1044fa), j.d(this.c, i), b);
             this.g(b, false);
          }
       }else {
          n0.e(this.a, this.e(), b);
          n0.d(this.c, this.h(), j.d(this.c, this.f(R.color.arg_RES_7f0620d1)), false);
          this.g(false, false);
       }
       return;
    }
    public String h(){
       Object obj = PatchProxy.apply(null, this, n0$i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a1.p(0x7f1044fe);
    }
}
