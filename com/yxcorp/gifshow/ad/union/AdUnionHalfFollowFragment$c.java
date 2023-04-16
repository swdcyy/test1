package com.yxcorp.gifshow.ad.union.AdUnionHalfFollowFragment$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.union.AdUnionHalfFollowFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mxb.j0;
import mxb.i0;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import mxb.j;
import com.yxcorp.gifshow.ad.union.AdUnionHalfFollowFragment$c$a;
import erd.g;

public final class AdUnionHalfFollowFragment$c implements Runnable	// class@00185f
{
    public final AdUnionHalfFollowFragment b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;

    public void AdUnionHalfFollowFragment$c(AdUnionHalfFollowFragment p0,int p1,int p2,int p3,boolean p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, AdUnionHalfFollowFragment$c.class, "1")) {
          return;
       }
       j0 oj0 = i0.a();
       AdUnionHalfFollowFragment j = this.b.j;
       a.m(j);
       oj0.p(this.c, oj0.g(j.getEntity())).d(new AdUnionHalfFollowFragment$c$a(this)).a();
       return;
    }
}
