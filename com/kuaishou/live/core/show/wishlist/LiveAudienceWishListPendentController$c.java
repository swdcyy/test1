package com.kuaishou.live.core.show.wishlist.LiveAudienceWishListPendentController$c;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.wishlist.LiveAudienceWishListPendentController;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCWishListOpened;
import nn2.v1;

public final class LiveAudienceWishListPendentController$c implements View$OnClickListener	// class@0012c4
{
    public final LiveAudienceWishListPendentController b;

    public void LiveAudienceWishListPendentController$c(LiveAudienceWishListPendentController p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceWishListPendentController$c.class, "1")) {
          return;
       }
       LiveStreamMessages$SCWishListOpened sCWishListOp = this.b.p();
       if (sCWishListOp != null) {
          this.b.c(sCWishListOp, 1);
       }
       return;
    }
}
