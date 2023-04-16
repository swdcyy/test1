package com.kuaishou.merchant.transaction.live.dynamic.page.MerchantUnpaidRnContainerActivity$a;
import java.lang.Runnable;
import com.kuaishou.merchant.transaction.live.dynamic.page.MerchantUnpaidRnContainerActivity;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import jj4.f;
import android.app.Activity;
import com.kuaishou.merchant.router.RouterConfig;
import us3.f;
import com.kuaishou.merchant.router.b;

public class MerchantUnpaidRnContainerActivity$a implements Runnable	// class@0007b4
{
    public final String b;
    public final MerchantUnpaidRnContainerActivity c;

    public void MerchantUnpaidRnContainerActivity$a(MerchantUnpaidRnContainerActivity p0,String p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, MerchantUnpaidRnContainerActivity$a.class, "1")) {
          return;
       }
       MerchantUnpaidRnContainerActivity$a tc = this.c;
       MerchantUnpaidRnContainerActivity$a tb = this.b;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(tb, tc, MerchantUnpaidRnContainerActivity.class, "6")) {
          if (!TextUtils.x(tb)) {
             b.m(tc, TextUtils.c(tb, "closeWithCallback", String.valueOf(true)), null, new f(tc));
          }else {
             tc.finish();
          }
       }
       return;
    }
}
