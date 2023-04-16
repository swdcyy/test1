package com.yxcorp.gifshow.share.operation.KsFansTopOtherFactory$a;
import uo7.c0;
import com.yxcorp.gifshow.share.operation.KsFansTopOtherFactory;
import uo7.k;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.share.operation.KsFansTopOtherFactory$a$a;
import erd.g;
import kotlin.jvm.internal.a;

public final class KsFansTopOtherFactory$a extends c0	// class@001bfb
{
    public final KsFansTopOtherFactory c;
    public final k d;

    public void KsFansTopOtherFactory$a(KsFansTopOtherFactory p0,k p1,k p2){
       this.c = p0;
       this.d = p1;
       super(p2);
    }
    public t s(){
       t obj = PatchProxy.apply(null, this, KsFansTopOtherFactory$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = t.just(this.getConfiguration()).doOnNext(new KsFansTopOtherFactory$a$a(this));
       a.o(obj, "Observable.just\(configur¡­FansTopOtherClick\(\)\n    }");
       return obj;
    }
}
