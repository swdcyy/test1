package com.yxcorp.gifshow.follow.stagger.header.a$f;
import erd.r;
import com.yxcorp.gifshow.follow.stagger.header.a;
import java.lang.Object;
import com.yxcorp.gifshow.follow.common.data.FeedsLiveResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class a$f implements r	// class@0011b1
{
    public final a b;

    public void a$f(a p0){
       this.b = p0;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, a$f.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = this.b.Z8();
       }
       return b;
    }
}
