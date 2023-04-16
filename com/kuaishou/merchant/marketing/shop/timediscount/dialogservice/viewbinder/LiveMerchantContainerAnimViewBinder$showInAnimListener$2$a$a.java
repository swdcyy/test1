package com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.LiveMerchantContainerAnimViewBinder$showInAnimListener$2$a$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.LiveMerchantContainerAnimViewBinder$showInAnimListener$2$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.LiveMerchantContainerAnimViewBinder$showInAnimListener$2;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.LiveMerchantContainerAnimViewBinder;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;

public final class LiveMerchantContainerAnimViewBinder$showInAnimListener$2$a$a extends m	// class@001c25
{
    public final LiveMerchantContainerAnimViewBinder$showInAnimListener$2$a c;

    public void LiveMerchantContainerAnimViewBinder$showInAnimListener$2$a$a(LiveMerchantContainerAnimViewBinder$showInAnimListener$2$a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantContainerAnimViewBinder$showInAnimListener$2$a$a.class, "1")) {
          return;
       }
       Dialog dialog = this.c.a.this$0.w.getDialog();
       if (dialog != null && dialog.isShowing() == true) {
          this.c.a.this$0.c9();
       }
       return;
    }
}
