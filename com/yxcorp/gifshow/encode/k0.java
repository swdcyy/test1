package com.yxcorp.gifshow.encode.k0;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.encode.EncodeRequest$a;
import com.yxcorp.gifshow.activity.preview.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.yxcorp.gifshow.activity.preview.b;
import io.reactivex.g;

public final class k0 implements o	// class@000d2b
{
    public static final k0 b;

    static {
       k0.b = new k0();
    }
    public void k0(){
       super();
    }
    public final Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, null, f.class, "17");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = t.create(new b(p0));
       }
       return ot;
    }
}
