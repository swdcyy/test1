package m6a.n;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.b$a;
import java.lang.Object;
import wca.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import y8c.d;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.MerchantRecommendUserManager;
import java.lang.Integer;

public final class n implements g	// class@002f56
{
    public final b$a b;

    public void n(b$a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefsWithListener(p0, tb, b$a.class, "8")) {
       }else if(p0 == null){
          PatchProxy.onMethodExit(b$a.class, "8");
       }else {
          b$a p = tb.p;
          if (p != null && ((p.mId).equals(p0.b) && p0.c != null)) {
             p0 = tb.t;
             if (p0 != null) {
                int i = tb.q.get();
                if (!PatchProxy.isSupport2(MerchantRecommendUserManager.class, "4") || !PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(i), p0, MerchantRecommendUserManager.class, "4")) {
                   MerchantRecommendUserManager.c(p0, i, false, 2, null);
                   PatchProxy.onMethodExit(MerchantRecommendUserManager.class, "4");
                }
             }
          }
          PatchProxy.onMethodExit(b$a.class, "8");
       }
       return;
    }
}
