package com.kuaishou.gifshow.kuaishan.logic.l1;
import erd.o;
import java.lang.Object;
import java.lang.Boolean;
import com.kuaishou.gifshow.kuaishan.logic.m1;
import java.lang.Integer;
import brd.t;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;

public final class l1 implements o	// class@001a5b
{
    public static final l1 b;

    static {
       l1.b = new l1();
    }
    public void l1(){
       super();
    }
    public final Object apply(Object p0){
       p0 = (p0.booleanValue())? t.just(Integer.valueOf(100)): t.error(new RuntimeException("check failed"));
       return p0;
    }
}
