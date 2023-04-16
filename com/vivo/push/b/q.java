package com.vivo.push.b.q;
import com.vivo.push.b.v;
import com.vivo.push.a;
import com.vivo.push.model.InsideNotificationItem;
import java.lang.String;
import com.vivo.push.util.q;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.vivo.push.model.UPSNotificationMessage;

public final class q extends v	// class@001040
{
    public InsideNotificationItem a;
    public String b;

    public void q(){
       super(4);
    }
    public final void c(a p0){
       super.c(p0);
       String str = q.b(this.a);
       this.b = str;
       p0.a("notification_v1", str);
    }
    public final InsideNotificationItem d(){
       return this.a;
    }
    public final void d(a p0){
       super.d(p0);
       String str = p0.a("notification_v1");
       this.b = str;
       if (!TextUtils.isEmpty(str)) {
          InsideNotificationItem insideNotifi = q.a(this.b);
          this.a = insideNotifi;
          if (insideNotifi != null) {
             insideNotifi.setMsgId(this.f());
          }
       }
       return;
    }
    public final String e(){
       if (!TextUtils.isEmpty(this.b)) {
          return this.b;
       }
       q ta = this.a;
       if (ta == null) {
          return null;
       }
       return q.b(ta);
    }
    public final String toString(){
       return "OnNotifyArrivedCommand";
    }
}
