package i19.c$b;
import d6a.a;
import i19.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.k1;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.y0;
import i19.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AutoConversionInfo;
import java.lang.Math;
import java.lang.Runnable;

public final class c$b extends a	// class@002606
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public void B0(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "2")) {
          return;
       }
       k1.n("AdUnionAutoProcessPresenter");
       return;
    }
    public void k1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c$b.class, "1")) {
          return;
       }
       c$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, c.class, "3")) {
          c p = tb.p;
          if (p == null) {
             a.S("mPhoto");
          }
          PhotoAdvertisement photoAdverti = k.B(p);
          if (photoAdverti != null) {
             photoAdverti = photoAdverti.mAutoConversionInfo;
             if (photoAdverti != null && !y0.o(tb.getActivity())) {
                k1.s(new d(photoAdverti, tb), "AdUnionAutoProcessPresenter", Math.max(photoAdverti.mAutoConversionDelayTimeMS, 0));
             }
          }
       }
    label_004c :
       return;
    }
}
