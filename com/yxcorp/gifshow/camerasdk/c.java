package com.yxcorp.gifshow.camerasdk.c;
import java.lang.Runnable;
import com.yxcorp.gifshow.camerasdk.j$p;
import java.lang.Object;
import qi9.i;
import ekd.k1;

public final class c implements Runnable	// class@001008
{
    public final j$p b;

    public void c(j$p p0){
       this.b = p0;
    }
    public final void run(){
       k1.o(new i(this.b));
    }
}
