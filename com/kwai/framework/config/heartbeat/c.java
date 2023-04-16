package com.kwai.framework.config.heartbeat.c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import e66.c;
import java.lang.String;
import q87.c;

public final class c implements g	// class@001502
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void accept(Object p0){
       c.C().v("Heartbeat", "Heartbeat triggered keyconfig failed.", p0);
    }
}
