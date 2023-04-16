package com.vivo.push.d.u;
import com.vivo.push.d.z;
import com.vivo.push.o;
import android.content.Context;
import com.vivo.push.l;
import android.content.Intent;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map$Entry;
import java.lang.String;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.d.w;
import java.lang.Runnable;
import com.vivo.push.m;
import com.vivo.push.b.p;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.util.p;
import com.vivo.push.util.q;
import com.vivo.push.util.NotifyAdapterUtil;
import com.vivo.push.b.x;
import java.util.HashMap;
import com.vivo.push.util.z;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.vivo.push.e;
import java.lang.StringBuilder;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.content.pm.ActivityInfo;
import java.lang.Throwable;
import android.net.Uri;
import java.lang.Thread;
import com.vivo.push.d.v;

public final class u extends z	// class@001075
{

    public void u(o p0){
       super(p0);
    }
    public static Context a(u p0){
       return p0.a;
    }
    public static Intent a(Intent p0,Map p1){
       return u.b(p0, p1);
    }
    public static Intent b(Intent p0,Map p1){
       if (p1 != null && p1.entrySet() != null) {
          Iterator iterator = p1.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             if (uEntry != null && uEntry.getKey() != null) {
                p0.putExtra(uEntry.getKey(), uEntry.getValue());
             }
          }
       }
       return p0;
    }
    public final void a(UPSNotificationMessage p0){
       m.c(new w(this, p0));
    }
    public final void a(o p0){
       Intent intent;
       InsideNotificationItem insideNotifi = p0.f();
       String str = "OnNotificationClickTask";
       if (insideNotifi == null) {
          p.d(str, "current notification item is null");
          return;
       }else {
          UPSNotificationMessage uPSNotificat = q.a(insideNotifi);
          boolean b = (this.a.getPackageName()).equals(p0.d());
          if (b) {
             NotifyAdapterUtil.cancelNotify(this.a);
          }
          if (b) {
             x ox = new x(1030);
             HashMap hashMap = new HashMap();
             hashMap.put("type", "2");
             hashMap.put("messageID", String.valueOf(p0.e()));
             hashMap.put("platform", this.a.getPackageName());
             l ta = this.a;
             String str1 = z.b(ta, ta.getPackageName());
             if (!TextUtils.isEmpty(str1)) {
                hashMap.put("remoteAppId", str1);
             }
             ox.a(hashMap);
             e.a().a(ox);
             p.d(str, "notification is clicked by skip type["+uPSNotificat.getSkipType()+"]");
             int skipType = uPSNotificat.getSkipType();
             String str2 = 1;
             if (skipType != str2) {
                if (skipType != 2) {
                   if (skipType != 3) {
                      if (skipType != 4) {
                         p.a(str, "illegitmacy skip type error : "+uPSNotificat.getSkipType());
                         return;
                      }else {
                         str1 = uPSNotificat.getSkipContent();
                         try{
                            intent = Intent.parseUri(str1, str2);
                            String package = intent.getPackage();
                            if (!TextUtils.isEmpty(package) && !(this.a.getPackageName()).equals(package)) {
                               p.a(str, "open activity error : local pkgName is "+this.a.getPackageName()+"; but remote pkgName is "+intent.getPackage());
                               return;
                            }else {
                               String str3 = null;
                               CharSequence uCharSequenc = (intent.getComponent() == null)? str3: intent.getComponent().getPackageName();
                               if (!TextUtils.isEmpty(uCharSequenc) && !(this.a.getPackageName()).equals(uCharSequenc)) {
                                  p.a(str, "open activity component error : local pkgName is "+this.a.getPackageName()+"; but remote pkgName is "+intent.getPackage());
                                  return;
                               }else {
                                  intent.setSelector(str3);
                                  intent.setPackage(this.a.getPackageName());
                                  intent.addFlags(0x14000000);
                                  u.b(intent, uPSNotificat.getParams());
                                  ActivityInfo uActivityInf = intent.resolveActivityInfo(this.a.getPackageManager(), 0x10000);
                                  if (uActivityInf != null && uActivityInf.exported == null) {
                                     p.a(str, "activity is not exported : "+uActivityInf.toString());
                                     return;
                                  }else {
                                     this.a.startActivity(intent);
                                  }
                               }
                            }
                         }catch(java.lang.Exception e2){
                            p.a(str, ("open activity error : ").concat(String.valueOf(str1)), e2);
                         }
                         this.a(uPSNotificat);
                         return;
                      }
                   }else {
                      this.a(uPSNotificat);
                      return;
                   }
                }else {
                   str1 = uPSNotificat.getSkipContent();
                   if (!str1.startsWith("http://") && !str1.startsWith("https://")) {
                      str2 = null;
                   }
                   if (str2 != null) {
                      intent = new Intent("android.intent.action.VIEW", Uri.parse(str1));
                      intent.setFlags(0x10000000);
                      u.b(intent, uPSNotificat.getParams());
                      this.a.startActivity(intent);
                   }else {
                      p.a(str, "url not legal");
                   }
                   this.a(uPSNotificat);
                   return;
                }
             }else {
                new Thread(new v(this, this.a, uPSNotificat.getParams())).start();
                this.a(uPSNotificat);
                return;
             }
          }else {
             p.a(str, "notify is "+uPSNotificat+" ; isMatch is "+b);
             return;
          }
       }
    }
}
