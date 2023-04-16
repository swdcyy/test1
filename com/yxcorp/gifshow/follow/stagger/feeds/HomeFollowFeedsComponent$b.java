package com.yxcorp.gifshow.follow.stagger.feeds.HomeFollowFeedsComponent$b;
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

public final class HomeFollowFeedsComponent$b implements g	// class@001185
{
    public final HomeFollowFeedsComponent b;

    public void HomeFollowFeedsComponent$b(HomeFollowFeedsComponent p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeFollowFeedsComponent$b.class, "1")) {
       }else {
          p0 = this.b.l;
          a.o(p0, "mPageList");
          p0 = p0.getItems();
          if (!s0.F(p0)) {
             p0 = null;
          }
          if (p0 != null) {
             this.b.H().b.a(true);
          }
       }
       return;
    }
}
