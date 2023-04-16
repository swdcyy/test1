package com.yxcorp.gifshow.share.operation.KsFansTopFactory$a;
import uo7.c0;
import com.yxcorp.gifshow.share.operation.KsFansTopFactory;
import uo7.k;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.share.operation.KsFansTopFactory$a$a;
import erd.g;

public final class KsFansTopFactory$a extends c0	// class@001bf7
{
    public final KsFansTopFactory c;
    public final k d;

    public void KsFansTopFactory$a(KsFansTopFactory p0,k p1,k p2){
       this.c = p0;
       this.d = p1;
       super(p2);
    }
    public t s(){
       Object obj = PatchProxy.apply(null, this, KsFansTopFactory$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.just(this.d).doOnNext(new KsFansTopFactory$a$a(this));
    }
}
