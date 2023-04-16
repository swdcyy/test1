package com.vivo.push.d.p;
import com.vivo.push.d.z;
import com.vivo.push.o;
import android.content.Context;
import com.vivo.push.l;
import com.vivo.push.b.o;
import com.vivo.push.b.h;
import com.vivo.push.b.v;
import java.lang.String;
import com.vivo.push.e;
import com.vivo.push.cache.ClientConfigManagerImpl;
import java.lang.StringBuilder;
import java.lang.Object;
import com.vivo.push.util.p;
import com.vivo.push.b.x;
import java.util.HashMap;
import com.vivo.push.util.z;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.security.PublicKey;
import com.vivo.push.model.UnvarnishedMessage;
import com.vivo.push.d.q;
import java.lang.Runnable;
import com.vivo.push.m;

public final class p extends z	// class@00106f
{

    public void p(o p0){
       super(p0);
    }
    public static Context a(p p0){
       return p0.a;
    }
    public final void a(o p0){
       x ox;
       HashMap hashMap;
       l ta;
       String str3;
       v ov = p0;
       e.a().a(new h(String.valueOf(ov.f())));
       String str = "remoteAppId";
       String str1 = "messageID";
       String str2 = "OnMessageTask";
       if (!ClientConfigManagerImpl.getInstance(this.a).isEnablePush()) {
          p.d(str2, "command  "+p0+" is ignore by disable push ");
          ox = new x(1020);
          hashMap = new HashMap();
          hashMap.put(str1, String.valueOf(ov.f()));
          ta = this.a;
          str3 = z.b(ta, ta.getPackageName());
          if (!TextUtils.isEmpty(str3)) {
             hashMap.put(str, str3);
          }
          ox.a(hashMap);
          e.a().a(ox);
          return;
       }else if(e.a().g() && !this.a(z.c(this.a), ov.d(), ov.i())){
          ox = new x(1021);
          hashMap = new HashMap();
          hashMap.put(str1, String.valueOf(ov.f()));
          ta = this.a;
          str3 = z.b(ta, ta.getPackageName());
          if (!TextUtils.isEmpty(str3)) {
             hashMap.put(str, str3);
          }
          ox.a(hashMap);
          e.a().a(ox);
          return;
       }else {
          UnvarnishedMessage unvarnishedM = ov.e();
          if (unvarnishedM != null) {
             p.d(str2, "tragetType is "+unvarnishedM.getTargetType()+" ; target is "+unvarnishedM.getTragetContent());
             m.b(new q(this, unvarnishedM));
             return;
          }else {
             p.a(str2, " message is null");
             return;
          }
       }
    }
}
