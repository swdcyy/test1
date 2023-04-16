package iy8.a;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.award.presenter.webView.AwardVideoH5CountDownPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import fy8.a;
import e17.i;
import ekd.y0;
import nsd.r0;
import lnc.a1;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.util.Arrays;
import java.lang.CharSequence;
import android.widget.TextView;

public final class a implements Runnable	// class@002736
{
    public final AwardVideoH5CountDownPresenter b;

    public void a(AwardVideoH5CountDownPresenter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       AwardVideoH5CountDownPresenter t;
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       a tb = this.b;
       if (tb.u != null) {
          return;
       }
       boolean b = true;
       if (tb.s <= null) {
          RxBus.f.b(new a(b));
          this.b.R8(b);
          i.a(R.style.arg_RES_7f110668, 0x7f100343);
          t = this.b.t;
          if (t != null) {
             t.e();
          }
          this.b.P8();
          return;
       }else {
          t = tb.q;
          if (t != null) {
             String str = a1.p(R.string.arg_RES_7f1016c7);
             a.o(str, "CommonUtil.string\(R.string.inspire_ad_count_down\)");
             Object[] objArray = new Object[b];
             objArray[0] = Integer.valueOf(this.b.s);
             str = String.format(str, Arrays.copyOf(objArray, b));
             a.o(str, "java.lang.String.format\(format, *args\)");
             t.setText(str);
          }
          tb = this.b;
          tb.s = tb.s - 1;
          return;
       }
    }
}
