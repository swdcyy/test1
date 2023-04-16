package com.yxcorp.login.bind.presenter.h;
import ok.h;
import com.yxcorp.login.bind.presenter.i;
import java.lang.Object;
import java.lang.Void;
import e1d.h;
import erd.g;
import crd.b;
import brd.t;

public final class h implements h	// class@001a74
{
    public final i b;

    public void h(i p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       h tb = this.b;
       return tb.r.subscribe(new h(tb));
    }
}
