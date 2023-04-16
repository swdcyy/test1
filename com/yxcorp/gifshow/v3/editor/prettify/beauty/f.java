package com.yxcorp.gifshow.v3.editor.prettify.beauty.f;
import ok.h;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.h;
import java.lang.Object;
import java.lang.Void;
import ssc.n;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.g;
import erd.g;
import crd.b;
import brd.t;

public final class f implements h	// class@001157
{
    public final h b;

    public void f(h p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       f tb = this.b;
       n on = new n(tb);
       return tb.q.subscribe(on, g.b);
    }
}
