package com.unionpay.m;
import com.unionpay.u;
import com.unionpay.UPPayWapActivity;
import java.lang.Object;
import java.lang.String;
import com.unionpay.v;
import java.lang.Boolean;

public final class m implements u	// class@000fff
{
    public final UPPayWapActivity a;

    public void m(UPPayWapActivity p0){
       this.a = p0;
       super();
    }
    public final void a(String p0,v p1){
       UPPayWapActivity.a(this.a, Boolean.parseBoolean(p0));
       if (p1 != null) {
          p1.a(UPPayWapActivity.a("0", "success", null));
       }
       return;
    }
}
