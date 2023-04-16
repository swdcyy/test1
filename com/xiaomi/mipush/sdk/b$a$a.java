package com.xiaomi.mipush.sdk.b$a$a;
import com.xiaomi.mipush.sdk.b$a;
import java.lang.Object;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.ArrayList;
import com.xiaomi.mipush.sdk.d;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;
import com.xiaomi.push.hl;
import com.xiaomi.mipush.sdk.c;
import android.content.Context;
import java.lang.String;
import vs8.f0;
import java.util.List;
import java.util.Arrays;
import ys8.g0;
import java.util.Iterator;
import com.xiaomi.push.ig;
import java.lang.StringBuilder;
import rs8.c;
import vs8.x;
import com.xiaomi.push.hh;
import com.xiaomi.push.is;
import com.xiaomi.push.hu;

public class b$a$a	// class@0010ea
{
    public ScheduledThreadPoolExecutor a;
    public final ArrayList b;
    public ScheduledFuture c;
    public final Runnable d;
    public final b$a e;

    public void b$a$a(b$a p0){
       this.e = p0;
       super();
       this.a = new ScheduledThreadPoolExecutor(1);
       this.b = new ArrayList();
       this.d = new d(this);
    }
    public static ScheduledFuture a(b$a$a p0){
       return p0.c;
    }
    public static ScheduledFuture b(b$a$a p0,ScheduledFuture p1){
       p0.c = null;
       return null;
    }
    public static void d(b$a$a p0){
       p0.c();
    }
    public static void g(b$a$a p0){
       p0.f();
    }
    public final void c(){
       if (this.c == null) {
          this.c = this.a.scheduleAtFixedRate(this.d, 1000, 1000, TimeUnit.MILLISECONDS);
       }
       return;
    }
    public void e(hl p0){
       this.a.execute(new c(this, p0));
    }
    public final void f(){
       hl ohl = this.b.remove(0);
       hl[] ohlArray = new hl[]{ohl};
       Iterator iterator = g0.c(Arrays.asList(ohlArray), b$a.a(this.e).getPackageName(), f0.d(b$a.a(this.e)).c(), 0x7800).iterator();
       while (iterator.hasNext()) {
          c.t("MiTinyDataClient Send item by PushServiceClient.sendMessage\(XmActionNotification\)."+ohl.d());
          x.l(b$a.a(this.e)).x(iterator.next(), hh.i, 1, null);
       }
       return;
    }
}
