package com.unionpay.l;
import com.unionpay.u;
import com.unionpay.UPPayWapActivity;
import java.lang.Object;
import java.lang.String;
import com.unionpay.v;
import android.content.Context;
import com.unionpay.utils.UPUtils;

public final class l implements u	// class@000ffe
{
    public final UPPayWapActivity a;

    public void l(UPPayWapActivity p0){
       this.a = p0;
       super();
    }
    public final void a(String p0,v p1){
       UPUtils.b(this.a, p0);
       if (p1 != null) {
          p1.a(UPPayWapActivity.a("0", "success", null));
       }
       return;
    }
}
