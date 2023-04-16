package com.meizu.cloud.pushsdk.d.e.a.a;
import com.meizu.cloud.pushsdk.d.e.a;
import com.meizu.cloud.pushsdk.d.e.a$a;
import com.meizu.cloud.pushsdk.d.b.a.b;
import com.meizu.cloud.pushsdk.d.c.b;
import com.meizu.cloud.pushsdk.d.e.a.a$2;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.String;
import com.meizu.cloud.pushsdk.d.f.c;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import com.meizu.cloud.pushsdk.d.e.a.a$1;
import com.meizu.cloud.pushsdk.d.e.b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;

public class a extends a	// class@001520
{
    public static final String n = "a";
    public static ScheduledExecutorService o;

    public void a(a$a p0){
       super(p0);
       b.a(this.k);
       this.c();
    }
    public static void a(a p0,b p1,boolean p2){
       super.a(p1, p2);
    }
    public void a(b p0,boolean p1){
       b.a(new a$2(this, p0, p1));
    }
    public void c(){
       if (a.o == null && this.i != null) {
          Object[] objArray = new Object[0];
          c.b(a.n, "Session checking has been resumed.", objArray);
          ScheduledExecutorService scheduledExe = Executors.newSingleThreadScheduledExecutor();
          a.o = scheduledExe;
          a tj = this.j;
          scheduledExe.scheduleAtFixedRate(new a$1(this, this.d), tj, tj, this.l);
       }
       return;
    }
}
