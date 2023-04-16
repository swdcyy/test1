package com.yxcorp.gifshow.commontab.pagelist.c;
import erd.g;
import com.yxcorp.gifshow.commontab.pagelist.HomeUniversalTabPageList$c;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hn5.h;
import qc5.a;
import com.yxcorp.gifshow.commontab.pagelist.HomeUniversalTabPageList;
import wkd.b;
import com.yxcorp.gifshow.action.i;
import com.yxcorp.gifshow.commontab.pagelist.b;
import yv8.c;
import yv8.a;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Integer;
import tkd.b;
import tkd.d;
import nl9.c0;
import java.util.List;
import gb5.a;

public final class c implements g	// class@0011bc
{
    public final HomeUniversalTabPageList$c b;

    public void c(HomeUniversalTabPageList$c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       HomeUniversalTabPageList$c b;
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          h.b(p0);
          h.a(p0);
          c tb = this.b;
          if (tb.c != null) {
             tb.b.W2().b();
          }
          b.a(-129117978).d(this.b.b.D, b.a);
          b = this.b.b;
          a.o(p0, "r");
          HomeUniversalTabPageList$c d = this.b.d;
          Objects.requireNonNull(b);
          HomeUniversalTabPageList homeUniversa = HomeUniversalTabPageList.class;
          if (!PatchProxy.isSupport(homeUniversa) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(d), b, homeUniversa, "5")) {
             d.a(-500494672).t60(p0.getItems(), 104, d);
          }
          Objects.requireNonNull(this.b.b);
          b.a(0x8708467).k("common", true);
          this.b.b.K = p0.mContext;
       }
       return;
    }
}
