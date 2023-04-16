package com.unionpay.i;
import com.unionpay.u;
import com.unionpay.UPPayWapActivity;
import java.lang.Object;
import java.lang.String;
import com.unionpay.v;
import android.content.Context;
import com.unionpay.UPPayAssistEx;

public final class i implements u	// class@000ffb
{
    public final UPPayWapActivity a;

    public void i(UPPayWapActivity p0){
       this.a = p0;
       super();
    }
    public final void a(String p0,v p1){
       p0 = UPPayAssistEx.a(this.a, true);
       if (p1 != null) {
          p1.a(UPPayWapActivity.a("0", "success", p0));
       }
       return;
    }
}
