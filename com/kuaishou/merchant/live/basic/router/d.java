package com.kuaishou.merchant.live.basic.router.d;
import ok.h;
import com.kuaishou.merchant.live.basic.router.e;
import java.io.File;
import com.kuaishou.merchant.router.base.RouterRequest;
import java.lang.Object;
import java.lang.Void;
import brd.a0;
import ks3.h;
import t45.d;
import brd.z;
import c24.v;
import c24.u;
import erd.g;
import crd.b;

public final class d implements h	// class@0018c3
{
    public final e b;
    public final File c;
    public final RouterRequest d;

    public void d(e p0,File p1,RouterRequest p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       d td = this.d;
       return this.b.a.g(320, 320).G(d.a).R(new v(this.c, td), new u(td));
    }
}
