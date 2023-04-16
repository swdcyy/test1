package e8a.f1;
import hka.b;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.m;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.StringBuilder;
import java.lang.String;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.entity.QPhoto;
import k2b.j2;

public final class f1 implements b	// class@0020a4
{
    public final m a;

    public void f1(m p0){
       this.a = p0;
    }
    public final void onConfigurationChanged(Configuration p0){
       f1 ta = this.a;
       if (ta.s != null && ta.u != null) {
          boolean b = (p0.orientation == 2)? true: false;
          Log.b("PadLandScapeLogPresenter", "isLand="+b);
          if (b) {
             ta.r.a(ta.s, "GRAVITY_SENSOR");
             ta.r.e(ta.s.getPhotoId());
          }else {
             ta.r.b(ta.s, "GRAVITY_SENSOR");
          }
       }
       return;
    }
}
