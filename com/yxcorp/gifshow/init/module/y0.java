package com.yxcorp.gifshow.init.module.y0;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.init.module.UpdateConfigModule;
import pxa.e;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;

public final class y0 implements g	// class@0019e4
{
    public static final y0 b;

    static {
       y0.b = new y0();
    }
    public void y0(){
       super();
    }
    public final void accept(Object p0){
       Object[] objArray = new Object[0];
       e.C().w("UpdateConfigModule", "ycnnConfig error:"+p0.getMessage(), objArray);
    }
}
