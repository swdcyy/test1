package com.meizu.cloud.pushsdk.d.b.a.a$2;
import java.util.concurrent.Callable;
import com.meizu.cloud.pushsdk.d.b.a.a;
import com.meizu.cloud.pushsdk.c.c.i;
import java.lang.Object;
import java.lang.Integer;

public class a$2 implements Callable	// class@001507
{
    public final i a;
    public final a b;

    public void a$2(a p0,i p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public Integer a(){
       return Integer.valueOf(a.a(this.b, this.a));
    }
    public Object call(){
       return this.a();
    }
}
