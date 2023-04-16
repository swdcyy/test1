package com.kuaishou.gifshow.kuaishan.logic.a0;
import erd.o;
import java.lang.Object;
import com.kuaishou.gifshow.kuaishan.logic.i0$b;
import h90.a;
import h90.e;
import java.util.Objects;
import com.kuaishou.gifshow.kuaishan.logic.i0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import x80.l;
import io.reactivex.g;
import t45.d;
import brd.z;
import x80.r0;
import erd.g;

public final class a0 implements o	// class@0019fb
{
    public static final a0 b;

    static {
       a0.b = new a0();
    }
    public void a0(){
       super();
    }
    public final Object apply(Object p0){
       a a = p0.b().a;
       e q = p0.c.q;
       Objects.requireNonNull(q);
       t ot = PatchProxy.applyTwoRefs(a, q, null, i0.class, "11");
       if (ot != PatchProxyResult.class) {
       }else {
          Object[] objArray = new Object[0];
          e.D().w("KSPrepareMediaAPI", "faceBlend: path="+a+" resourceDir="+q, objArray);
          ot = t.create(new l(a, q)).subscribeOn(d.c);
       }
       return ot.observeOn(d.a).doOnNext(new r0(p0));
    }
}
