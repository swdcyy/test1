package com.yxcorp.gifshow.follow.stagger.header.a$i;
import erd.r;
import com.yxcorp.gifshow.follow.stagger.header.a;
import java.lang.Object;
import wca.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import xl8.b;
import com.yxcorp.gifshow.follow.common.data.FeedsLiveResponse;
import java.util.Collection;
import ekd.q;

public final class a$i implements r	// class@0011b4
{
    public final a b;

    public void a$i(a p0){
       this.b = p0;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, a$i.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          if (this.b.y.a() != null) {
             p0 = this.b.y.a();
             a.m(p0);
             if (p0.mQPhotos != null) {
                p0 = this.b.y.a();
                a.m(p0);
                if (!q.f(p0.mQPhotos)) {
                   b = true;
                }
             }
          }
          b = false;
       }
       return b;
    }
}
