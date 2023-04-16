package cl9.l;
import erd.g;
import cl9.y;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import com.yxcorp.gifshow.comment.utils.e;
import java.lang.StringBuilder;
import android.view.View;
import android.widget.TextView;
import com.yxcorp.gifshow.comment.utils.d;

public final class l implements g	// class@000646
{
    public final y b;

    public void l(y p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l tb = this.b;
       if (!tb.q.isAllowComment()) {
          i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f10078c));
       }else {
          String str = tb.F.k();
          p0 = str+p0.replaceAll(" ", "");
          if (p0.length() > 255) {
             i.a(R.style.arg_RES_7f11066a, 0x7f1040dc);
             tb.F.A(str);
          }else {
             tb.F.A(p0);
          }
          p0 = tb.E;
          if (p0 != null) {
             p0.setVisibility(0);
          }
          d.m(tb.A);
       }
       return;
    }
}
