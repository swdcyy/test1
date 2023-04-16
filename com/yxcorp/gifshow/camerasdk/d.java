package com.yxcorp.gifshow.camerasdk.d;
import java.lang.Runnable;
import com.yxcorp.gifshow.camerasdk.j;
import java.lang.Object;
import java.util.Objects;
import qi9.k;
import ekd.k1;

public final class d implements Runnable	// class@001014
{
    public final j b;

    public void d(j p0){
       this.b = p0;
    }
    public final void run(){
       d tb = this.b;
       Objects.requireNonNull(tb);
       k1.o(new k(tb));
    }
}
