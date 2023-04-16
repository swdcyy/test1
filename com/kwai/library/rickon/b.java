package com.kwai.library.rickon.b;
import erd.a;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import ry6.b;
import java.lang.Runnable;
import t45.c;

public final class b implements a	// class@0008e0
{
    public final String b;
    public final AtomicReference c;

    public void b(String p0,AtomicReference p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       c.a(new b(this.b, this.c));
    }
}
