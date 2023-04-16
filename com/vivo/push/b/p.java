package com.vivo.push.b.p;
import com.vivo.push.o;
import java.lang.String;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.a;
import com.vivo.push.util.q;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.vivo.push.model.UPSNotificationMessage;

public final class p extends o	// class@00103f
{
    public String a;
    public String b;
    public byte[] c;
    public long d;
    public InsideNotificationItem e;

    public void p(){
       super(5);
    }
    public void p(String p0,long p1,InsideNotificationItem p2){
       super(5);
       this.a = p0;
       this.d = p1;
       this.e = p2;
    }
    public final void c(a p0){
       p0.a("package_name", this.a);
       p0.a("notify_id", this.d);
       p0.a("notification_v1", q.b(this.e));
       p0.a("open_pkg_name", this.b);
       p0.a("open_pkg_name_encode", this.c);
    }
    public final String d(){
       return this.a;
    }
    public final void d(a p0){
       this.a = p0.a("package_name");
       this.d = p0.b("notify_id", -1);
       this.b = p0.a("open_pkg_name");
       this.c = p0.b("open_pkg_name_encode");
       String str = p0.a("notification_v1");
       if (!TextUtils.isEmpty(str)) {
          this.e = q.a(str);
       }
       p te = this.e;
       if (te != null) {
          te.setMsgId(this.d);
       }
       return;
    }
    public final long e(){
       return this.d;
    }
    public final InsideNotificationItem f(){
       return this.e;
    }
    public final String toString(){
       return "OnNotificationClickCommand";
    }
}
