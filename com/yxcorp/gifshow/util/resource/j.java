package com.yxcorp.gifshow.util.resource.j;
import erd.g;
import boc.b;
import com.yxcorp.gifshow.util.resource.n$c;
import t16.a;
import java.lang.Object;
import doc.a;
import com.yxcorp.gifshow.util.resource.n;
import com.yxcorp.gifshow.util.resource.h;
import java.lang.Runnable;
import java.util.concurrent.ThreadPoolExecutor;

public final class j implements g	// class@000cee
{
    public final b b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final n$c f;
    public final a g;

    public void j(b p0,boolean p1,boolean p2,boolean p3,n$c p4,a p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void accept(Object p0){
       h oh = new h(this.b, p0, this.c, this.d, this.e, this.f, this.g);
       n.d.execute(v8);
    }
}
