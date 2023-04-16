package com.yxcorp.gifshow.v3.previewer.ktv.w;
import ok.h;
import com.yxcorp.gifshow.v3.previewer.ktv.z;
import java.lang.Object;
import java.lang.Void;
import mwc.k0;
import com.kuaishou.live.common.core.basic.tools.h;
import erd.g;
import crd.b;
import brd.t;

public final class w implements h	// class@0015d5
{
    public final z b;

    public void w(z p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       w tb = this.b;
       k0 ok0 = new k0(tb);
       return tb.D.subscribe(ok0, h.b);
    }
}
