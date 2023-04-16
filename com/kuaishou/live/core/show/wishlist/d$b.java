package com.kuaishou.live.core.show.wishlist.d$b;
import erd.g;
import com.kuaishou.live.core.show.wishlist.d;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse$LiveWishListInfo;

public class d$b implements g	// class@0012d2
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       d$b tb = this.b;
       p0 = p0.mLiveWishListInfo;
       boolean b = (p0 != null && p0.mEnableDisplayWishSponsors != null)? true: false;
       tb.F = b;
       return;
    }
}
