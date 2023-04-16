package com.yxcorp.gifshow.upload.b1;
import erd.o;
import com.yxcorp.gifshow.upload.g1;
import java.lang.Object;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import java.util.concurrent.atomic.AtomicInteger;
import dnc.a2;
import erd.r;
import com.yxcorp.gifshow.upload.a1;

public class b1 implements o	// class@001e61
{
    public final g1 b;

    public void b1(g1 p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, b1.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          AtomicInteger uAtomicInteg = new AtomicInteger();
          ot = p0.takeWhile(new a2(uAtomicInteg)).flatMap(new a1(this, p0, uAtomicInteg));
       }
       return ot;
    }
}
