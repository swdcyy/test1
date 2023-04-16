package com.kuaishou.live.core.show.wishlist.LiveAudienceWishListPendentController$a;
import aq5.b;
import com.kuaishou.live.core.show.wishlist.LiveAudienceWishListPendentController;
import java.lang.Object;
import aq5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.live.core.show.wishlist.LiveAudienceWishListPendentController$a$a;
import java.lang.Runnable;
import ekd.k1;

public final class LiveAudienceWishListPendentController$a implements b	// class@0012c2
{
    public final LiveAudienceWishListPendentController b;

    public void LiveAudienceWishListPendentController$a(LiveAudienceWishListPendentController p0){
       this.b = p0;
       super();
    }
    public final void e6(a p0,boolean p1){
       LiveAudienceWishListPendentController$a uoa = LiveAudienceWishListPendentController$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       k1.r(new LiveAudienceWishListPendentController$a$a(this), 1000);
       return;
    }
}
