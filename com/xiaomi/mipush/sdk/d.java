package com.xiaomi.mipush.sdk.d;
import java.lang.Runnable;
import com.xiaomi.mipush.sdk.b$a$a;
import java.lang.Object;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;

public class d implements Runnable	// class@0010ee
{
    public final b$a$a b;

    public void d(b$a$a p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (this.b.b.size()) {
          b$a$a.g(this.b);
       }else if(b$a$a.a(this.b) != null){
          b$a$a.a(this.b).cancel(false);
          b$a$a.b(this.b, null);
       }
       return;
    }
}
