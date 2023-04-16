package com.yxcorp.login.bind.presenter.r0;
import ok.h;
import com.yxcorp.login.bind.presenter.s0;
import java.lang.Object;
import java.lang.Void;
import e1d.o1;
import erd.g;
import crd.b;
import brd.t;

public final class r0 implements h	// class@001a9a
{
    public final s0 b;

    public void r0(s0 p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       r0 tb = this.b;
       return tb.p.subscribe(new o1(tb));
    }
}
