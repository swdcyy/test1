package nfd.n0$j;
import nfd.n0$c;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import nfd.m0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import zf6.j;
import java.lang.CharSequence;
import nfd.n0;

public class n0$j extends n0$c	// class@001ddd
{
    public m0 g;

    public void n0$j(View p0,ImageView p1,TextView p2,m0 p3){
       super(p0, p1, p2, p3);
       this.g = p3;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, n0$j.class, "1")) {
          return;
       }
       n0$j tg = this.g;
       m0 c = tg.c;
       if (c != null) {
          if (c == true) {
             int i = 0x7f0619e8;
             if (tg != null && tg.e != null) {
                i = 0x7f061be0;
             }
             n0.d(this.c, a1.p(R.string.arg_RES_7f1044fa), j.d(this.c, i), true);
             this.g(false, false);
          }
       }else {
          n0.d(this.c, a1.p(R.string.arg_RES_7f1044fe), j.d(this.c, this.f(R.color.arg_RES_7f060751)), false);
          this.g(true, false);
       }
       return;
    }
}
