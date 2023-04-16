package com.kuaishou.live.core.show.wishlist.LiveAudienceWishListPendentController$b;
import oq5.c;
import com.kuaishou.live.core.show.wishlist.LiveAudienceWishListPendentController;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveAudienceWishListPendentController$b implements c	// class@0012c3
{
    public final LiveAudienceWishListPendentController b;

    public void LiveAudienceWishListPendentController$b(LiveAudienceWishListPendentController p0){
       this.b = p0;
       super();
    }
    public final void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceWishListPendentController$b.class, "1")) {
          return;
       }
       a.p(p0, "newConfiguration");
       if (p0.orientation == 2) {
          this.b.v();
       }else {
          LiveAudienceWishListPendentController$b tb = this.b;
          if (tb.C != null) {
             tb.H();
          }
       }
       this.b.L();
       return;
    }
}
