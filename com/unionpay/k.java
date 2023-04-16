package com.unionpay.k;
import com.unionpay.u;
import com.unionpay.UPPayWapActivity;
import java.lang.Object;
import java.lang.String;
import com.unionpay.v;
import android.content.Context;
import com.unionpay.utils.UPUtils;

public final class k implements u	// class@000ffd
{
    public final UPPayWapActivity a;

    public void k(UPPayWapActivity p0){
       this.a = p0;
       super();
    }
    public final void a(String p0,v p1){
       p0 = UPUtils.a(this.a, p0);
       if (p1 != null) {
          p1.a(UPPayWapActivity.a("0", "success", p0));
       }
       return;
    }
}
