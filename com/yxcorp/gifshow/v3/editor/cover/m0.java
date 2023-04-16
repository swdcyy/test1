package com.yxcorp.gifshow.v3.editor.cover.m0;
import ok.h;
import com.yxcorp.gifshow.v3.editor.cover.q0;
import java.lang.Object;
import java.lang.Void;
import ppc.l0;
import com.yxcorp.gifshow.v3.editor.cover.i0;
import erd.g;
import crd.b;
import brd.t;

public final class m0 implements h	// class@000e80
{
    public final q0 b;

    public void m0(q0 p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       m0 tb = this.b;
       l0 ol0 = new l0(tb);
       return tb.F.subscribe(ol0, i0.b);
    }
}
