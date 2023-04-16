package com.vivo.push.d.s;
import java.lang.Runnable;
import com.vivo.push.d.r;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.b.q;
import java.lang.Object;
import com.vivo.push.d.z;
import android.content.Context;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.util.q;
import com.vivo.push.sdk.PushMessageCallback;
import java.lang.StringBuilder;
import java.lang.String;
import com.vivo.push.util.p;
import java.util.HashMap;
import com.vivo.push.b.v;
import com.vivo.push.util.z;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.vivo.push.util.e;
import com.vivo.push.util.k;
import com.vivo.push.d.t;
import com.vivo.push.d.r$a;
import android.net.NetworkInfo;
import com.vivo.push.util.r;
import android.net.NetworkInfo$State;
import android.os.AsyncTask;

public final class s implements Runnable	// class@001073
{
    public final InsideNotificationItem a;
    public final q b;
    public final r c;

    public void s(r p0,InsideNotificationItem p1,q p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public final void run(){
       object oobject;
       s tc = this.c;
       String str = "remoteAppId";
       String str1 = "messageID";
       String str2 = "pkg name : ";
       String str3 = "OnNotificationArrivedTask";
       if (tc.b.onNotificationMessageArrived(r.a(tc), q.a(this.a))) {
          p.b(str3, str2+r.b(this.c).getPackageName()+" 应用主动拦截通知");
          p.b(r.c(this.c), "应用主动拦截通知，导致通知无法展示，如需打开请在onNotificationMessageArrived中返回false");
          HashMap hashMap = new HashMap();
          hashMap.put(str1, String.valueOf(this.b.f()));
          str1 = z.b(r.d(this.c), r.e(this.c).getPackageName());
          if (!TextUtils.isEmpty(str1)) {
             hashMap.put(str, str1);
          }
          e.a(2120, hashMap);
          return;
       }else {
          int i = this.c.b();
          if (i > 0) {
             p.b(str3, str2+r.f(this.c).getPackageName()+" notify channel switch is "+i);
             p.b(r.g(this.c), ("允许通知开关或者推送通知渠道开关关闭，导致通知无法展示，请到设置页打开应用通知开关 ").concat(String.valueOf(i)));
             HashMap hashMap1 = new HashMap();
             hashMap1.put(str1, String.valueOf(this.b.f()));
             str1 = z.b(r.h(this.c), r.i(this.c).getPackageName());
             if (!TextUtils.isEmpty(str1)) {
                hashMap1.put(str, str1);
             }
             e.a((long)i, hashMap1);
             return;
          }else {
             s tc1 = this.c;
             k ok = new k(r.j(this.c), this.a, this.b.f(), tc1.b.isAllowNet(r.k(tc1)), new t(this));
             int b = this.a.isShowBigPicOnMobileNet();
             str1 = this.a.getPurePicUrl();
             if (TextUtils.isEmpty(str1)) {
                str1 = this.a.getCoverUrl();
             }
             if (!TextUtils.isEmpty(str1)) {
                p.c(str3, ("showCode=").concat(String.valueOf(b)));
                if (!b) {
                   p.a(r.p(this.c), "mobile net unshow");
                   NetworkInfo networkInfo = r.a(r.q(this.c));
                   if (networkInfo == null || networkInfo.getState() != NetworkInfo$State.CONNECTED) {
                      tc1 = null;
                   }else {
                      b = networkInfo.getType();
                      if (b == 1) {
                         tc1 = 2;
                      }else if(!b){
                         tc1 = 1;
                      }else {
                         tc1 = 3;
                      }
                   }
                   if (tc1 == 1) {
                      oobject = null;
                      this.a.clearCoverUrl();
                      this.a.clearPurePicUrl();
                   }
                }else {
                   p.a(r.r(this.c), "mobile net show");
                }
             }
             String[] stringArray = new String[]{this.a.getIconUrl(),oobject};
             i.execute(stringArray);
             return;
          }
       }
    }
}
