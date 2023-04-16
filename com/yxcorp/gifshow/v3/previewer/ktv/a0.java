package com.yxcorp.gifshow.v3.previewer.ktv.a0;
import ok.h;
import com.yxcorp.gifshow.v3.previewer.ktv.b0;
import java.lang.Object;
import java.lang.Void;
import mwc.n0;
import com.kuaishou.live.common.core.basic.tools.h;
import erd.g;
import crd.b;
import brd.t;

public final class a0 implements h	// class@0015b2
{
    public final b0 b;

    public void a0(b0 p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       a0 tb = this.b;
       n0 on0 = new n0(tb);
       return tb.q.subscribe(on0, h.b);
    }
}
