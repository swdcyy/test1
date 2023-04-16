package com.yxcorp.gifshow.pymk.d;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.pymk.net.RecommendUserResponseV2;
import com.yxcorp.gifshow.pymk.f;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.lang.Boolean;

public final class d implements o	// class@0016b1
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final Object apply(Object p0){
       return Boolean.valueOf((q.f(p0.getItems()) ^ 0x01));
    }
}
