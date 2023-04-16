package com.yxcorp.gifshow.message.init.p;
import java.util.concurrent.Callable;
import java.lang.Object;
import java.lang.String;
import hdb.o;
import tkd.b;
import tkd.d;
import pv5.c;
import java.lang.Boolean;

public final class p implements Callable	// class@001d61
{
    public static final p b;

    static {
       p.b = new p();
    }
    public void p(){
       super();
    }
    public final Object call(){
       o.e("force refresh anonymous token");
       d.a(0x6154d94e).HF();
       return Boolean.TRUE;
    }
}
