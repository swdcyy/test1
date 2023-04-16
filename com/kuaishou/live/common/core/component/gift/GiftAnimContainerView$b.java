package com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$b;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$j;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView;
import com.kuaishou.live.common.core.component.gift.GiftAnimItemView;
import com.kuaishou.live.common.core.component.gift.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$k;

public class GiftAnimContainerView$b implements GiftAnimContainerView$j	// class@001119
{
    public final GiftAnimItemView b;
    public final d c;
    public final GiftAnimContainerView$j d;
    public final GiftAnimContainerView e;

    public void GiftAnimContainerView$b(GiftAnimContainerView p0,GiftAnimItemView p1,d p2,GiftAnimContainerView$j p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, GiftAnimContainerView$b.class, "1")) {
          return;
       }
       GiftAnimContainerView$k ok = this.e.m(this.b);
       if (ok != null && ok.d == this.c) {
          ok.d = null;
       }
       GiftAnimContainerView$b td = this.d;
       if (td != null) {
          td.a();
       }
       return;
    }
}
