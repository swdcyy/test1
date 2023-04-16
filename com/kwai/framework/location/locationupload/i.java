package com.kwai.framework.location.locationupload.i;
import erd.g;
import com.kwai.framework.location.locationupload.k;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.kwai.framework.location.k;
import ekd.e0;
import android.content.Context;
import wkd.b;
import r96.c;
import java.lang.String;
import brd.t;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import r96.p;
import r96.o;
import crd.b;

public final class i implements g	// class@001645
{
    public final k b;
    public final int c;

    public void i(k p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       tb.i = b.a(0x7e473ecc).a(this.c, k.f(), k.e(e0.b), tb.c, tb.b, tb.f).subscribeOn(d.c).map(new e()).subscribe(new p(tb), new o(tb));
    }
}
