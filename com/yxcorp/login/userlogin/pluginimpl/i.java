package com.yxcorp.login.userlogin.pluginimpl.i;
import ljd.b;
import java.lang.Object;
import brd.t;
import retrofit2.a;
import h1d.e;
import erd.o;

public final class i implements b	// class@001b9b
{
    public static final i a;

    static {
       i.a = new i();
    }
    public void i(){
       super();
    }
    public final t a(t p0,a p1){
       return p0.retryWhen(new e());
    }
}
