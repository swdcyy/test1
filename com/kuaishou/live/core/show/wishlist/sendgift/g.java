package com.kuaishou.live.core.show.wishlist.sendgift.g;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.wishlist.sendgift.LiveWishListSendGiftConfirmDialog;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import com.kuaishou.live.core.show.wishlist.sendgift.LiveWishListSendGiftConfirmDialog$a;

public class g implements View$OnClickListener	// class@0012ff
{
    public final LiveWishListSendGiftConfirmDialog b;

    public void g(LiveWishListSendGiftConfirmDialog p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       this.b.dismissAllowingStateLoss();
       g tb = this.b;
       LiveWishListSendGiftConfirmDialog w = tb.w;
       if (w != null) {
          w.a(tb.z);
       }
       return;
    }
}
