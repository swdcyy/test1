package com.yxcorp.gifshow.follow.stagger.feeds.HomeFollowFeedsComponent$c;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.feeds.HomeFollowFeedsComponent;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.listcomponent.module.b;
import kotlin.jvm.internal.a;
import java.util.List;
import qvb.a;
import nsd.s0;
import y0b.j;
import y0b.i;
import y0b.h;
import d1b.a;

public final class HomeFollowFeedsComponent$c implements g	// class@001187
{
    public final HomeFollowFeedsComponent b;

    public void HomeFollowFeedsComponent$c(HomeFollowFeedsComponent p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeFollowFeedsComponent$c.class, "1")) {
       }else {
          p0 = this.b.l;
          a.o(p0, "mPageList");
          p0 = p0.getItems();
          if (!s0.F(p0)) {
             p0 = null;
          }
          if (p0 != null) {
             this.b.H().b.a(false);
          }
       }
       return;
    }
}
