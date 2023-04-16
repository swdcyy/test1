package com.yxcorp.login.userlogin.pluginimpl.h;
import ljd.b;
import java.lang.Object;
import brd.t;
import retrofit2.a;
import h1d.e;
import erd.o;

public final class h implements b	// class@001b9a
{
    public static final h a;

    static {
       h.a = new h();
    }
    public void h(){
       super();
    }
    public final t a(t p0,a p1){
       return p0.retryWhen(new e());
    }
}
