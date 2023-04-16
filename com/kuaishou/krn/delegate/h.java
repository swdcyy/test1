package com.kuaishou.krn.delegate.h;
import brd.f0;
import com.kuaishou.krn.delegate.k;
import java.lang.Runnable;
import java.lang.Object;
import brd.a0;
import brd.e0;
import java.util.Objects;
import brd.z;
import lrd.b;
import com.kuaishou.krn.delegate.g;
import erd.o;

public final class h implements f0	// class@000862
{
    public final k b;
    public final boolean c;
    public final Runnable d;

    public void h(k p0,boolean p1,Runnable p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final e0 b(a0 p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       return p0.G(b.a()).u(new g(tb, this.c, this.d));
    }
}
