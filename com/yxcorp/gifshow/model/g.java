package com.yxcorp.gifshow.model.g;
import erd.o;
import java.lang.String;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.m;
import elb.s;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;

public final class g implements o	// class@001ef0
{
    public final String b;
    public final QMedia c;

    public void g(String p0,QMedia p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       g tb = this.b;
       g tc = this.c;
       p0 = PatchProxy.applyTwoRefs(tb, tc, null, h.class, "4");
       if (p0 != PatchProxyResult.class) {
       }else {
          p0 = m.r(new s(tc, tb)).B(d.c);
       }
       return p0;
    }
}
