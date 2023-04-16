package com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$i;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView;
import com.kuaishou.live.common.core.component.gift.GiftAnimItemView;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.gift.GiftMessage;

public class GiftAnimContainerView$i implements Runnable	// class@001121
{
    public final GiftAnimItemView b;
    public final int c;
    public final GiftAnimContainerView$l d;
    public final GiftAnimContainerView e;

    public void GiftAnimContainerView$i(GiftAnimContainerView p0,GiftAnimItemView p1,int p2,GiftAnimContainerView$l p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, GiftAnimContainerView$i.class, "1")) {
          return;
       }
       GiftAnimContainerView$i tb = this.b;
       if (tb != null) {
          GiftAnimContainerView$i tc = this.c;
          if (tb.getLastCombo() < tc) {
             this.b.s(this.d.a, tc);
          }
       }
       return;
    }
}
