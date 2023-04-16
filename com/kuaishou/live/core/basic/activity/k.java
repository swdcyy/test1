package com.kuaishou.live.core.basic.activity.k;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import m02.q0;
import msd.a;
import k51.b;

public final class k implements Runnable	// class@001842
{
    public final String b;
    public final Runnable c;

    public void k(String p0,Runnable p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       b.b(this.b, new q0(this.c));
    }
}
