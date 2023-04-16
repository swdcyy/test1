package nfd.n0$m;
import nfd.n0$g;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import nfd.m0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nfd.n0$c;
import nfd.n0;
import lnc.a1;
import zf6.j;
import java.lang.CharSequence;

public class n0$m extends n0$g	// class@001de0
{

    public void n0$m(View p0,ImageView p1,TextView p2,m0 p3){
       super(p0, p1, p2, p3);
    }
    public static boolean h(int p0){
       boolean b = (p0)? true: false;
       return b;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, n0$m.class, "1")) {
          return;
       }
       n0$c tf = this.f;
       if (tf == null) {
          return;
       }
       m0 c = tf.c;
       int i = 0x7f0620d1;
       String str = "";
       if (c != null) {
          if (c != true) {
             if (c == 2) {
                if (n0$m.h(tf.f)) {
                   n0.f(this.a, this.f.f, false);
                }else {
                   n0.e(this.a, this.e(), false);
                }
                n0.d(this.c, a1.p(R.string.arg_RES_7f100216), j.d(this.c, this.f(R.color.arg_RES_7f061e59)), true);
                this.g(false, true);
             }
          }else {
             n0.e(this.a, this.a(), true);
             n0$c tf1 = this.f;
             if (tf1 == null || tf1.e == null) {
                i = 0x7f061fbb;
             }
             tf = this.c;
             n0.d(tf, str, j.d(tf, i), true);
             this.g(false, false);
          }
       }else if(n0$m.h(tf.f)){
          n0.f(this.a, this.f.f, true);
       }else {
          n0.e(this.a, this.e(), true);
       }
       tf = this.c;
       n0.d(tf, str, j.d(tf, this.f(i)), false);
       this.g(true, true);
       return;
    }
}
