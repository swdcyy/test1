package com.yxcorp.gifshow.ad.union.AdUnionHalfFollowFragment$c$a;
import erd.g;
import com.yxcorp.gifshow.ad.union.AdUnionHalfFollowFragment$c;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import vq4.d;
import com.yxcorp.gifshow.ad.union.AdUnionHalfFollowFragment;
import com.yxcorp.gifshow.commercial.common.model.AdUnionFollowInfo;
import f59.j;

public final class AdUnionHalfFollowFragment$c$a implements g	// class@00185e
{
    public final AdUnionHalfFollowFragment$c b;

    public void AdUnionHalfFollowFragment$c$a(AdUnionHalfFollowFragment$c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, AdUnionHalfFollowFragment$c$a.class, "1")) {
       }else {
          a.p(p0, "clientAdLog");
          p0 = p0.F;
          AdUnionHalfFollowFragment$c$a tb = this.b;
          p0.C = tb.d;
          p0.X2 = tb.e;
          if (tb.f != null) {
             int i = (j.c(AdUnionHalfFollowFragment.ch(tb.b)))? 2: 1;
             p0.p1 = i;
          }
          PatchProxy.onMethodExit(AdUnionHalfFollowFragment$c$a.class, "1");
       }
       return;
    }
}
