package com.vivo.push.d.r;
import com.vivo.push.d.z;
import com.vivo.push.o;
import android.content.Context;
import com.vivo.push.l;
import java.lang.String;
import com.vivo.push.util.p;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.b.q;
import com.vivo.push.util.t;
import com.vivo.push.b.x;
import java.util.HashMap;
import com.vivo.push.b.v;
import java.lang.Object;
import com.vivo.push.util.z;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.vivo.push.e;
import com.vivo.push.b.h;
import java.lang.StringBuilder;
import java.security.PublicKey;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.d.s;
import java.lang.Runnable;
import com.vivo.push.m;
import com.vivo.push.util.e;

public final class r extends z	// class@001072
{

    public void r(o p0){
       super(p0);
    }
    public static Context a(r p0){
       return p0.a;
    }
    public static Context b(r p0){
       return p0.a;
    }
    public static Context c(r p0){
       return p0.a;
    }
    public static Context d(r p0){
       return p0.a;
    }
    public static Context e(r p0){
       return p0.a;
    }
    public static Context f(r p0){
       return p0.a;
    }
    public static Context g(r p0){
       return p0.a;
    }
    public static Context h(r p0){
       return p0.a;
    }
    public static Context i(r p0){
       return p0.a;
    }
    public static Context j(r p0){
       return p0.a;
    }
    public static Context k(r p0){
       return p0.a;
    }
    public static Context l(r p0){
       return p0.a;
    }
    public static Context m(r p0){
       return p0.a;
    }
    public static Context n(r p0){
       return p0.a;
    }
    public static Context o(r p0){
       return p0.a;
    }
    public static Context p(r p0){
       return p0.a;
    }
    public static Context q(r p0){
       return p0.a;
    }
    public static Context r(r p0){
       return p0.a;
    }
    public final void a(o p0){
       x ox;
       HashMap hashMap;
       l ta1;
       String str3;
       String str = "OnNotificationArrivedTask";
       if (p0 == null) {
          p.a(str, "command is null");
          return;
       }else {
          q oq = ClientConfigManagerImpl.getInstance(this.a).isEnablePush();
          l ta = this.a;
          String str1 = "remoteAppId";
          String str2 = "messageID";
          if (!t.d(ta, ta.getPackageName())) {
             ox = new x(2101);
             hashMap = new HashMap();
             hashMap.put(str2, String.valueOf(p0.f()));
             ta1 = this.a;
             str3 = z.b(ta1, ta1.getPackageName());
             if (!TextUtils.isEmpty(str3)) {
                hashMap.put(str1, str3);
             }
             ox.a(hashMap);
             e.a().a(ox);
             return;
          }else {
             e.a().a(new h(String.valueOf(p0.f())));
             p.d(str, "PushMessageReceiver "+this.a.getPackageName()+" isEnablePush :"+oq);
             if (oq == null) {
                ox = new x(1020);
                hashMap = new HashMap();
                hashMap.put(str2, String.valueOf(p0.f()));
                ta1 = this.a;
                str3 = z.b(ta1, ta1.getPackageName());
                if (!TextUtils.isEmpty(str3)) {
                   hashMap.put(str1, str3);
                }
                ox.a(hashMap);
                e.a().a(ox);
                return;
             }else if(e.a().g() && !this.a(z.c(this.a), p0.e(), p0.i())){
                ox = new x(1021);
                hashMap = new HashMap();
                hashMap.put(str2, String.valueOf(p0.f()));
                ta1 = this.a;
                str3 = z.b(ta1, ta1.getPackageName());
                if (!TextUtils.isEmpty(str3)) {
                   hashMap.put(str1, str3);
                }
                ox.a(hashMap);
                e.a().a(ox);
                return;
             }else {
                InsideNotificationItem insideNotifi = p0.d();
                if (insideNotifi != null) {
                   p.d(str, "tragetType is "+insideNotifi.getTargetType()+" ; target is "+insideNotifi.getTragetContent());
                   m.c(new s(this, insideNotifi, p0));
                   return;
                }else {
                   p.a(str, "notify is null");
                   p.c(this.a, "通知内容为空，"+p0.f());
                   e.a(this.a, p0.f(), 1027);
                   return;
                }
             }
          }
       }
    }
}
