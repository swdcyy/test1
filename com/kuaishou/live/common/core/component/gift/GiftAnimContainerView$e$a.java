package com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$e$a;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.GiftAnimItemView;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$k;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$l;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$j;
import com.kuaishou.live.basic.model.QLiveMessage;
import va1.a0;

public class GiftAnimContainerView$e$a implements Runnable	// class@00111c
{
    public final GiftAnimContainerView$e b;

    public void GiftAnimContainerView$e$a(GiftAnimContainerView$e p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, GiftAnimContainerView$e$a.class, "1")) {
          return;
       }
       GiftAnimContainerView$e$a tb = this.b;
       tb.e.m(tb.b).d();
       tb = this.b;
       if (tb.e.h(tb.c)) {
          tb = this.b;
          GiftAnimContainerView$e c = tb.c;
          tb.b.s(c.a, c.c);
          tb = this.b;
          tb.e.b(tb.c, tb.b, tb.d);
       }else if(!a0.g(this.b.c.a)){
          tb = this.b;
          tb.e.e(tb.b, tb.c, tb.d);
       }else {
          tb = this.b;
          GiftAnimContainerView$e c1 = tb.c;
          tb.e.d(tb.b, c1.a, c1.c, tb.d);
       }
       return;
    }
}
