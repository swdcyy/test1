package com.kuaishou.merchant.live.cart.onsale.audience.LiveAudienceShopWrapperFragment$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kuaishou.merchant.live.cart.onsale.audience.LiveAudienceShopWrapperFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import lnc.l1;
import lnc.a1;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import android.view.ViewTreeObserver;

public class LiveAudienceShopWrapperFragment$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@00191c
{
    public final View b;
    public final LiveAudienceShopWrapperFragment c;

    public void LiveAudienceShopWrapperFragment$a(LiveAudienceShopWrapperFragment p0,View p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceShopWrapperFragment$a.class, "1")) {
          return;
       }
       LiveAudienceShopWrapperFragment$a tc = this.c;
       View view = m1.f(this.b, R.id.audience_shop_root_view);
       int i = (l1.a())? 0: a1.d(R.dimen.arg_RES_7f070310);
       tc.Lh(view, i, (this.c.V ^ 0x01));
       tc = this.c;
       tc.Bh(tc.getDialog());
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       return;
    }
}
