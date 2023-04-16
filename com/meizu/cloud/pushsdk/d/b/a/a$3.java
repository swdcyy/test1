package com.meizu.cloud.pushsdk.d.b.a.a$3;
import java.util.concurrent.Callable;
import com.meizu.cloud.pushsdk.d.b.a.a;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;
import com.meizu.cloud.pushsdk.d.d.d;

public class a$3 implements Callable	// class@001508
{
    public final Long a;
    public final a b;

    public void a$3(a p0,Long p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public Boolean a(){
       return Boolean.valueOf(a.c(this.b).a(this.a.longValue()));
    }
    public Object call(){
       return this.a();
    }
}
