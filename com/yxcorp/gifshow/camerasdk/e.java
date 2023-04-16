package com.yxcorp.gifshow.camerasdk.e;
import java.lang.Runnable;
import com.yxcorp.gifshow.camerasdk.j;
import java.lang.Object;
import java.util.Objects;
import qi9.l;
import ekd.k1;

public final class e implements Runnable	// class@001015
{
    public final j b;

    public void e(j p0){
       this.b = p0;
    }
    public final void run(){
       e tb = this.b;
       Objects.requireNonNull(tb);
       k1.o(new l(tb));
    }
}
