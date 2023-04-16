package e8a.g1;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.m;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.String;
import com.yxcorp.utility.Log;
import rkd.b;
import com.yxcorp.gifshow.entity.QPhoto;
import k2b.j2;

public final class g1 implements g	// class@0020a9
{
    public final m b;

    public void g1(m p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g1 tb = this.b;
       Objects.requireNonNull(tb);
       Log.b("PadLandScapeLogPresenter", "active="+p0);
       tb.u = p0.booleanValue();
       if (tb.s != null && b.e()) {
          if (tb.u != null) {
             tb.r.c(tb.s);
             tb.r.e(tb.s.getPhotoId());
          }else {
             tb.r.d(tb.s);
          }
       }
       return;
    }
}
