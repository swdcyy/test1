package com.yxcorp.login.bind.presenter.g0;
import ok.h;
import com.yxcorp.login.bind.presenter.h0;
import java.lang.Object;
import java.lang.Void;
import e1d.w0;
import erd.g;
import crd.b;
import brd.t;

public final class g0 implements h	// class@001a71
{
    public final h0 b;

    public void g0(h0 p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       g0 tb = this.b;
       return tb.p.subscribe(new w0(tb));
    }
}
