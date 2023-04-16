package com.kuaishou.live.core.show.wishlist.LiveAudienceWishListPendentController$mLiveWishListEntryAnimateController$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.show.wishlist.LiveWishListEntryAnimateController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAudienceWishListPendentController$mLiveWishListEntryAnimateController$2 extends Lambda implements a	// class@0012c8
{
    public final boolean $isNewStylePendantEnabled;

    public void LiveAudienceWishListPendentController$mLiveWishListEntryAnimateController$2(boolean p0){
       this.$isNewStylePendantEnabled = p0;
       super(0);
    }
    public final LiveWishListEntryAnimateController invoke(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceWishListPendentController$mLiveWishListEntryAnimateController$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveWishListEntryAnimateController(this.$isNewStylePendantEnabled);
    }
    public Object invoke(){
       return this.invoke();
    }
}
