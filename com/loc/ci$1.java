package com.loc.ci$1;
import java.lang.Runnable;
import com.loc.ci;
import java.lang.Object;

public final class ci$1 implements Runnable	// class@0013ba
{
    public final Runnable a;
    public final ci b;

    public void ci$1(ci p0,Runnable p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final void run(){
       this.a.run();
    }
}
