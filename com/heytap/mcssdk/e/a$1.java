package com.heytap.mcssdk.e.a$1;
import java.lang.Runnable;
import com.heytap.mcssdk.e.a;
import com.heytap.mcssdk.c.b;
import java.lang.Object;
import com.heytap.mcssdk.PushService;

public class a$1 implements Runnable	// class@000536
{
    public final b a;
    public final a b;

    public void a$1(a p0,b p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       a.a(this.b, this.a, PushService.getInstance());
    }
}
