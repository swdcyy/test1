package m6a.d;
import msd.q;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.GrootMerchantRecommendUserFragment;
import java.lang.Object;
import android.view.View;
import a2.l;
import lnc.f3;
import java.util.Objects;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import p1.b;

public final class d implements q	// class@002f4c
{
    public final GrootMerchantRecommendUserFragment b;

    public void d(GrootMerchantRecommendUserFragment p0){
       this.b = p0;
    }
    public final Object invoke(Object p0,Object p1,Object p2){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 != null) {
          tb.j.setPadding(0, 0, 0, (p2.a() + p1.f(2).d));
       }
       return null;
    }
}
