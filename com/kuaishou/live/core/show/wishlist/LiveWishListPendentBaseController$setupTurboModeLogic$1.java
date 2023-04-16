package com.kuaishou.live.core.show.wishlist.LiveWishListPendentBaseController$setupTurboModeLogic$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import nn2.v1;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;

public final class LiveWishListPendentBaseController$setupTurboModeLogic$1 extends Lambda implements l	// class@0012ce
{
    public final v1 this$0;

    public void LiveWishListPendentBaseController$setupTurboModeLogic$1(v1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       if (PatchProxy.isSupport(LiveWishListPendentBaseController$setupTurboModeLogic$1.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveWishListPendentBaseController$setupTurboModeLogic$1.class, "1")) {
          return;
       }
       if (p0) {
          LiveWishListPendentBaseController$setupTurboModeLogic$1 tthis$0 = this.this$0;
          if (tthis$0.p != null) {
             tthis$0.p = false;
             tthis$0.C();
          }
       }
       return;
    }
}
