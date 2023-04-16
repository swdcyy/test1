package bt3.d;
import us3.g;
import com.kuaishou.merchant.basic.MerchantYodaWebViewActivity;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import ot3.n0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import android.app.Activity;

public final class d implements g	// class@00043d
{
    public final MerchantYodaWebViewActivity a;

    public void d(MerchantYodaWebViewActivity p0){
       this.a = p0;
    }
    public final void a(boolean p0,String p1,Throwable p2){
       d ta = this.a;
       Objects.requireNonNull(ta);
       if (p0) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, ta, MerchantYodaWebViewActivity.class, "3")) {
             ta.finish();
             Object obj = PatchProxy.apply(objArray, objArray, n0.class, "2");
             obj = (obj != PatchProxyResult.class)? obj.booleanValue(): a.t().d("shouldChangeEnterAndExitAnimation", false);
             if (obj) {
                ta.overridePendingTransition(R.anim.arg_RES_7f010109, 0x7f01010f);
             }
          }
       }else {
          ta.N3();
       }
       return;
    }
}
