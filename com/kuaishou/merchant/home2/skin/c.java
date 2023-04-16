package com.kuaishou.merchant.home2.skin.c;
import ok.h;
import e04.b;
import java.io.File;
import java.lang.Object;
import java.lang.Void;
import brd.t;
import d04.k;
import erd.o;
import t45.d;
import brd.z;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class c implements h	// class@001824
{
    public final b b;
    public final File c;

    public void c(b p0,File p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       return t.just(this.b.a).map(new k(this.c)).subscribeOn(d.c).observeOn(d.a).subscribe(Functions.d(), Functions.d());
    }
}
