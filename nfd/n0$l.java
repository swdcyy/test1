package nfd.n0$l;
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
import java.lang.Boolean;
import ekd.j;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.content.res.ColorStateList;
import e2.d;

public class n0$l extends n0$c	// class@001ddf
{

    public void n0$l(View p0,ImageView p1,TextView p2,m0 p3){
       super(p0, p1, p2, p3);
       this.b(R.drawable.arg_RES_7f081e9e);
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, n0$l.class, "1")) {
          return;
       }
       n0$c tf = this.f;
       if (tf == null) {
          return;
       }
       m0 c = tf.c;
       if (c != null) {
          if (c == true) {
             n0.e(this.a, this.a(), true);
             n0.d(this.c, a1.p(R.string.arg_RES_7f103cfa), j.d(this.c, R.color.arg_RES_7f0607cf), true);
             this.g(true, false);
          }
       }else {
          n0.e(this.a, this.e(), true);
          n0.d(this.c, a1.p(R.string.arg_RES_7f103cf9), j.d(this.c, R.color.arg_RES_7f0620d1), false);
          this.g(true, true);
       }
       return;
    }
    public void g(boolean p0,boolean p1){
       n0$l ol = n0$l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, ol, "2")) {
          return;
       }
       if (this.b == null) {
          return;
       }
       int i = 0;
       if (!j.h(this.e)) {
          n0$c tb = this.b;
          if (tb instanceof KwaiImageView) {
             tb.U(this.e);
             tb = this.b;
             if (!p0) {
                i = 8;
             }
             tb.setVisibility(i);
          }else {
          label_0041 :
             tb = this.d;
             if (tb > null) {
                n0.c(this.b, tb);
                tb = this.b;
                if (!p0) {
                   i = 8;
                }
                tb.setVisibility(i);
             }else {
                this.b.setVisibility(8);
             }
          }
       }else {
          goto label_0041 ;
       }
       if (p1) {
          d.c(this.b, ColorStateList.valueOf(a1.a(this.f(R.color.arg_RES_7f0620d1))));
       }
       return;
    }
}
