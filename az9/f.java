package az9.f;
import erd.g;
import az9.i0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import mxb.h0;
import vca.i;
import com.yxcorp.gifshow.activity.GifshowActivity;
import b06.b;

public final class f implements g	// class@000325
{
    public final i0 b;

    public void f(i0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, i0.class, "23")) {
       }else {
          tb.o0();
          if (tb.u.isAd() && h0.f(k.B(tb.u))) {
             p0 = "ad";
          }else if(i.d(tb.u)){
             p0 = "pay_course";
          }else {
             p0 = "photo";
          }
          b.a(tb.v, tb.u, true, "", p0);
       }
       return;
    }
}
