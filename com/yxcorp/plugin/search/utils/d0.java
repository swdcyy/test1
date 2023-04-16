package com.yxcorp.plugin.search.utils.d0;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.StringBuilder;
import java.lang.String;
import uy5.b;

public final class d0 implements g	// class@000792
{
    public static final d0 b;

    static {
       d0.b = new d0();
    }
    public void d0(){
       super();
    }
    public final void accept(Object p0){
       b.c("SearchReduceHelper", "getFeedBackData error"+p0.getMessage());
    }
}
