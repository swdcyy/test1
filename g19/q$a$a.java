package g19.q$a$a;
import erd.g;
import g19.q$a;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import g19.q;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import g19.p;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;

public final class q$a$a implements g	// class@0023d4
{
    public final q$a b;

    public void q$a$a(q$a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q$a$a.class, "1")) {
       }else {
          q$a a = this.b.a;
          Objects.requireNonNull(a);
          q obj = PatchProxy.apply(null, a, q.class, "4");
          int i = 9999;
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
             obj = a.s;
             String str = "mSlidePlayViewModel";
             if (obj == null) {
                a.S(str);
             }
             q p = a.p;
             if (p == null) {
                a.S("mPhoto");
             }
             int i1 = obj.R0(p);
             Objects.requireNonNull(p.c);
             if (i1 == p.a) {
                i = 0;
             }else {
                q s = a.s;
                if (s == null) {
                   a.S(str);
                }
                List list = s.e0();
                if (!q.f(list)) {
                   int i2 = i1 - 1;
                   while (i2 >= 0) {
                      QPhoto qPhoto = list.get(i2);
                      if (qPhoto != null && qPhoto.isAd()) {
                         PhotoAdvertisement photoAdverti = k.B(qPhoto);
                         photoAdverti = (photoAdverti != null)? photoAdverti.mAdTypeForGap: null;
                         if (photoAdverti != null) {
                            i = i1 - i2;
                            i = i - 1;
                         }
                      }
                   label_0083 :
                      i2 = i2 - 1;
                   }
                }
             }
          }
          p0.t0 = i;
       }
       return;
    }
}
