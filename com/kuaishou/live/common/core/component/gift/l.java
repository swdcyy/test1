package com.kuaishou.live.common.core.component.gift.l;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.gift.LiveGiftSelectDialogFragment;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.live.merchant.gift.LiveGiftSelectDialogType;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$WishListConfig;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.live.common.core.component.gift.LiveGiftNumberNewSelectDialog;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.LiveGiftNumberNewSelectDialog$a;
import ug1.o0;
import com.kuaishou.live.common.core.component.gift.LiveGiftNumberNewSelectDialog$d;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;

public final class l implements View$OnClickListener	// class@00131f
{
    public final LiveGiftSelectDialogFragment b;

    public void l(LiveGiftSelectDialogFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       LiveCommonConfigResponse$WishListConfig mWishGiftMax;
       LiveGiftNumberNewSelectDialog liveGiftNumb1;
       l tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, LiveGiftSelectDialogFragment.class, "13")) {
       }else {
          LiveGiftNumberNewSelectDialog liveGiftNumb = 1;
          if (tb.Q == LiveGiftSelectDialogType.WISH_LIST) {
             mWishGiftMax = tb.A.mWishGiftMaxCount;
          }else {
             LiveGiftSelectDialogFragment p = tb.P;
             mWishGiftMax = (p == null)? 1: p.mMaxBatchCount;
          }
          if (mWishGiftMax > liveGiftNumb) {
             if (PatchProxy.isSupport(LiveGiftNumberNewSelectDialog.class)) {
                liveGiftNumb1 = PatchProxy.applyOneRefs(Integer.valueOf(mWishGiftMax), null, LiveGiftNumberNewSelectDialog.class, "1");
                if (liveGiftNumb1 != PatchProxyResult.class) {
                label_0049 :
                   liveGiftNumb1.yh(tb.H);
                   liveGiftNumb1.zh(new o0(tb));
                   liveGiftNumb1.show(tb.getChildFragmentManager(), "number");
                }
             }
             liveGiftNumb1 = LiveGiftNumberNewSelectDialog.xh(mWishGiftMax, null);
             goto label_0049 ;
          }
       }
       return;
    }
}
