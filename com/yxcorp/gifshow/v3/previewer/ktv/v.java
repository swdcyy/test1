package com.yxcorp.gifshow.v3.previewer.ktv.v;
import ok.h;
import com.yxcorp.gifshow.v3.previewer.ktv.z;
import java.lang.Object;
import java.lang.Void;
import mwc.l0;
import com.kuaishou.live.common.core.basic.tools.h;
import erd.g;
import crd.b;
import brd.t;

public final class v implements h	// class@0015d4
{
    public final z b;

    public void v(z p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       v tb = this.b;
       l0 ol0 = new l0(tb);
       return tb.B.subscribe(ol0, h.b);
    }
}
