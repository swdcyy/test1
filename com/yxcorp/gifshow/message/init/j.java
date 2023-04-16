package com.yxcorp.gifshow.message.init.j;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.StringBuilder;
import java.lang.String;
import hdb.o;

public final class j implements g	// class@001d5b
{
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
    }
    public final void accept(Object p0){
       o.e("login anonymous error: "+p0.getMessage());
    }
}
