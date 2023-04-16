package com.kuaishou.commercial.h;
import java.lang.Runnable;
import com.kuaishou.commercial.k;
import java.lang.Object;
import java.util.Objects;
import cw.o;
import t45.c;

public final class h implements Runnable	// class@0014bf
{
    public final k b;

    public void h(k p0){
       this.b = p0;
    }
    public final void run(){
       h tb = this.b;
       Objects.requireNonNull(tb);
       c.a(new o(tb));
    }
}
