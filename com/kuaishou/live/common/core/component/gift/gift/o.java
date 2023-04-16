package com.kuaishou.live.common.core.component.gift.gift.o;
import brd.x;
import java.lang.String;
import java.lang.Object;
import brd.t;
import brd.w;
import ik1.e0;
import erd.g;

public final class o implements x	// class@0012b0
{
    public final String b;

    public void o(String p0){
       this.b = p0;
    }
    public final w apply(t p0){
       return p0.doOnError(new e0(this.b));
    }
}
