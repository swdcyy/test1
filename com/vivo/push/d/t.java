package com.vivo.push.d.t;
import com.vivo.push.d.r$a;
import com.vivo.push.d.s;
import java.lang.Object;
import com.vivo.push.e;
import java.lang.String;
import com.vivo.push.util.p;
import java.util.HashMap;
import com.vivo.push.b.v;
import com.vivo.push.d.r;
import android.content.Context;
import com.vivo.push.util.z;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.vivo.push.util.e;

public final class t implements r$a	// class@001074
{
    public final s a;

    public void t(s p0){
       this.a = p0;
       super();
    }
    public final void a(){
       long l = e.a().l();
       if (l - 1400 < 0 && l - 1340) {
          p.b("OnNotificationArrivedTask", ("引擎版本太低，不支持正向展示功能，pushEngineSDKVersion：").concat(String.valueOf(l)));
          return;
       }else {
          HashMap hashMap = new HashMap();
          hashMap.put("srt", "1");
          hashMap.put("message_id", String.valueOf(this.a.b.f()));
          String str = z.b(r.l(this.a.c), r.m(this.a.c).getPackageName());
          if (!TextUtils.isEmpty(str)) {
             hashMap.put("app_id", str);
          }
          hashMap.put("type", "1");
          hashMap.put("dtp", "1");
          e.a(6, hashMap);
          return;
       }
    }
    public final void b(){
       HashMap hashMap = new HashMap();
       hashMap.put("messageID", String.valueOf(this.a.b.f()));
       String str = z.b(r.n(this.a.c), r.o(this.a.c).getPackageName());
       if (!TextUtils.isEmpty(str)) {
          hashMap.put("remoteAppId", str);
       }
       e.a(2122, hashMap);
       return;
    }
}
