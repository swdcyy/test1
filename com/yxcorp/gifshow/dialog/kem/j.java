package com.yxcorp.gifshow.dialog.kem.j;
import java.lang.Runnable;
import x9a.a;
import java.lang.Object;
import java.util.Objects;
import x9a.f0;
import ekd.k1;

public final class j implements Runnable	// class@001ac1
{
    public final a b;

    public void j(a p0){
       this.b = p0;
    }
    public final void run(){
       j tb = this.b;
       Objects.requireNonNull(tb);
       k1.o(new f0(tb));
    }
}
