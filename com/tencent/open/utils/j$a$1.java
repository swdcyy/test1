package com.tencent.open.utils.j$a$1;
import java.lang.Runnable;
import com.tencent.open.utils.j$a;
import java.lang.Object;

public class j$a$1 implements Runnable	// class@000f81
{
    public final Runnable a;
    public final j$a b;

    public void j$a$1(j$a p0,Runnable p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       this.a.run();
       this.b.a();
    }
}
