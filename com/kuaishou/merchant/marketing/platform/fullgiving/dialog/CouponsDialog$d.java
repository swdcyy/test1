package com.kuaishou.merchant.marketing.platform.fullgiving.dialog.CouponsDialog$d;
import android.view.View$OnClickListener;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.CouponsDialog;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.marketing.platform.fullgiving.model.CouponDialogInfo;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.CouponsDialog$b;

public final class CouponsDialog$d implements View$OnClickListener	// class@001b0b
{
    public final CouponsDialog b;

    public void CouponsDialog$d(CouponsDialog p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       String jumpUrl;
       if (PatchProxy.applyVoidOneRefs(p0, this, CouponsDialog$d.class, "1")) {
          return;
       }
       CouponsDialog$d tb = this.b;
       CouponsDialog e = tb.E;
       if (e != null) {
          CouponsDialog f = tb.F;
          if (f != null) {
             jumpUrl = f.getJumpUrl();
             if (jumpUrl != null) {
             label_001e :
                e.a(jumpUrl);
             }
          }
          jumpUrl = "";
          goto label_001e ;
       }
       return;
    }
}
