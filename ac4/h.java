package ac4.h;
import java.lang.Runnable;
import p55.a;
import com.kuaishou.merchant.bridgecenter.params.MerchantRouterParams;
import android.app.Activity;
import java.lang.String;
import com.kuaishou.merchant.router.RouterConfig;
import us3.f;
import us3.g;
import java.lang.Object;
import wi0.e;
import com.kuaishou.krn.model.LaunchModel;
import android.os.Bundle;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.router.b;

public final class h implements Runnable	// class@00007a
{
    public final a b;
    public final MerchantRouterParams c;
    public final Activity d;
    public final String e;
    public final RouterConfig f;
    public final f g;
    public final g h;

    public void h(a p0,MerchantRouterParams p1,Activity p2,String p3,RouterConfig p4,f p5,g p6){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
    }
    public final void run(){
       String str;
       h tb = this.b;
       h tc = this.c;
       h td = this.d;
       h te = this.e;
       h tf = this.f;
       h tg = this.g;
       h th = this.h;
       if (tb instanceof e) {
          LaunchModel launchModel = tb.getLaunchModel();
          if (launchModel != null) {
             str = launchModel.g().getString("routerToken");
          label_0027 :
             if (TextUtils.x(str)) {
                str = tc.routerToken;
             }
             b.r(str, td, te, tf, tg, th);
             return;
          }
       }
       str = "";
       goto label_0027 ;
    }
}
