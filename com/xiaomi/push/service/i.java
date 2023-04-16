package com.xiaomi.push.service.i;
import com.xiaomi.push.service.u$a;
import java.lang.String;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.l0;
import com.xiaomi.push.service.u;
import android.content.Context;
import ws8.a0;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.xiaomi.push.ig;
import com.xiaomi.push.hr;
import ys8.u;
import java.util.HashMap;
import java.util.Map;
import android.app.Service;
import com.xiaomi.push.hh;
import com.xiaomi.push.is;
import com.xiaomi.push.id;
import com.xiaomi.push.service.g;
import com.xiaomi.push.i;

public final class i extends u$a	// class@001177
{
    public final XMPushService d;
    public final l0 e;

    public void i(String p0,long p1,XMPushService p2,l0 p3){
       this.d = p2;
       this.e = p3;
       super(p0, p1);
    }
    public void a(u p0){
       a0 uoa0 = a0.c(this.d);
       String str = "MSAID";
       String str1 = "msaid";
       String str2 = p0.d(str, str1);
       String str3 = uoa0.a();
       if (!TextUtils.isEmpty(str3) && !TextUtils.equals(str2, str3)) {
          p0.g(str, str1, str3);
          ig oig = new ig();
          oig.b(this.e.d);
          oig.c(hr.g.a);
          oig.a(u.a());
          oig.a(new HashMap());
          uoa0.d(oig.a());
          i td = this.d;
          td.a(td.getPackageName(), i.d(g.b(this.d.getPackageName(), this.e.d, oig, hh.i)), true);
       }
       return;
    }
}
