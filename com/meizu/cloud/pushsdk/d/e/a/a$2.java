package com.meizu.cloud.pushsdk.d.e.a.a$2;
import java.lang.Runnable;
import com.meizu.cloud.pushsdk.d.e.a.a;
import com.meizu.cloud.pushsdk.d.c.b;
import java.lang.Object;

public class a$2 implements Runnable	// class@00151f
{
    public final b a;
    public final boolean b;
    public final a c;

    public void a$2(a p0,b p1,boolean p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       a.a(this.c, this.a, this.b);
    }
}
