package com.vivo.push.d.af;
import com.vivo.push.d.z;
import com.vivo.push.o;
import com.vivo.push.b.u;
import com.vivo.push.e;
import com.vivo.push.l;
import android.content.Context;
import java.security.PublicKey;
import com.vivo.push.util.z;
import java.lang.String;
import com.vivo.push.b.v;
import com.vivo.push.util.p;
import com.vivo.push.b.x;
import java.util.HashMap;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.vivo.push.util.NotifyAdapterUtil;
import java.lang.StringBuilder;
import com.vivo.push.util.e;

public final class af extends z	// class@00105d
{

    public void af(o p0){
       super(p0);
    }
    public final void a(o p0){
       String str = "OnUndoMsgTask";
       if (e.a().g() && !this.a(z.c(this.a), p0.e(), p0.i())) {
          p.d(str, " vertify msg is error ");
          x ox = new x(1021);
          HashMap hashMap = new HashMap();
          hashMap.put("messageID", String.valueOf(p0.f()));
          l ta = this.a;
          String str1 = z.b(ta, ta.getPackageName());
          if (!TextUtils.isEmpty(str1)) {
             hashMap.put("remoteAppId", str1);
          }
          ox.a(hashMap);
          e.a().a(ox);
          return;
       }else {
          boolean b = NotifyAdapterUtil.repealNotifyById(this.a, p0.d());
          p.d(str, "undo message "+p0.d()+", "+b);
          if (b) {
             p.b(this.a, "回收client通知成功, 上报埋点 1031, messageId = "+p0.d());
             e.a(this.a, p0.d(), 1031);
             return;
          }else {
             p.d(str, "undo message fail，messageId = "+p0.d());
             p.c(this.a, "回收client通知失败，messageId = "+p0.d());
             return;
          }
       }
    }
}
