package com.kuaishou.live.core.show.wishlist.LiveAudienceWishListPendentController$a$a;
import java.lang.Runnable;
import com.kuaishou.live.core.show.wishlist.LiveAudienceWishListPendentController$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import nn2.v1;
import com.kuaishou.live.core.show.wishlist.LiveAudienceWishListPendentController$a$a$a;

public final class LiveAudienceWishListPendentController$a$a implements Runnable	// class@0012c1
{
    public final LiveAudienceWishListPendentController$a b;

    public void LiveAudienceWishListPendentController$a$a(LiveAudienceWishListPendentController$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceWishListPendentController$a$a.class, "1")) {
          return;
       }
       ViewGroup viewGroup = this.b.b.n();
       if (viewGroup != null) {
          viewGroup.post(new LiveAudienceWishListPendentController$a$a$a(this));
       }
       return;
    }
}
