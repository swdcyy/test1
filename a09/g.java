package a09.g;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.ViewGroup;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import tw.j;
import android.view.View;
import com.yxcorp.gifshow.ad.detail.presenter.ad.privacy.view.AdPrivacyTextView;
import i2b.a;

public final class g	// class@000012
{
    public static final g a;

    static {
       g.a = new g();
    }
    public void g(){
       super();
    }
    public final void a(QPhoto p0,ViewGroup p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "1")) {
          return;
       }
       a.p(p0, "photo");
       if (p1 != null && j.c(p0)) {
          AdPrivacyTextView uAdPrivacyTe = p1.findViewById(R.id.play_end_app_info);
          if (uAdPrivacyTe == null) {
             uAdPrivacyTe = a.k(p1, R.layout.arg_RES_7f0d006f, false);
             p1.addView(uAdPrivacyTe);
          }
          a.m(uAdPrivacyTe);
          uAdPrivacyTe.r(p0);
       }
       return;
    }
}
