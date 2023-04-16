package com.xiaomi.mipush.sdk.c;
import java.lang.Runnable;
import com.xiaomi.mipush.sdk.b$a$a;
import com.xiaomi.push.hl;
import java.lang.Object;
import java.util.ArrayList;

public class c implements Runnable	// class@0010ed
{
    public final hl b;
    public final b$a$a c;

    public void c(b$a$a p0,hl p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       this.c.b.add(this.b);
       b$a$a.d(this.c);
    }
}
