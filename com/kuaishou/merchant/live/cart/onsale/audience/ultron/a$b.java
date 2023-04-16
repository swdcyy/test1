package com.kuaishou.merchant.live.cart.onsale.audience.ultron.a$b;
import java.lang.Runnable;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.a;
import com.kuaishou.merchant.api.core.model.Commodity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopFrameModel;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopFrameModel$Toast;
import c54.c;

public final class a$b implements Runnable	// class@001981
{
    public final a b;
    public final Commodity c;

    public void a$b(a p0,Commodity p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       c.a(this.b.b, this.c.mCurrentFrame.mToast);
       return;
    }
}
