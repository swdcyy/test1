package com.kuaishou.merchant.marketing.shop.newfancoupon.dialog.NewFanCouponFaceUpDialog;
import com.kuaishou.merchant.marketing.shop.newfancoupon.dialog.NewFanCouponBaseDialog;
import com.kuaishou.merchant.marketing.shop.newfancoupon.dialog.NewFanCouponBaseDialog$b;
import erd.a;
import com.kuaishou.merchant.popupController.api.models.DialogConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.marketing.shop.newfancoupon.model.NewFanCouponModel;
import j94.b;
import java.io.Serializable;
import androidx.fragment.app.KwaiDialogFragment;
import android.widget.TextView;

public class NewFanCouponFaceUpDialog extends NewFanCouponBaseDialog	// class@001bf1
{

    public void NewFanCouponFaceUpDialog(NewFanCouponBaseDialog$b p0,a p1){
       super(p0, p1);
    }
    public DialogConfig getConfig(){
       DialogConfig obj = PatchProxy.apply(null, this, NewFanCouponFaceUpDialog.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new DialogConfig();
       obj.mDialogName = "NewFanCouponFaceUpDialog";
       return obj;
    }
    public void th(){
       if (PatchProxy.applyVoid(null, this, NewFanCouponFaceUpDialog.class, "3")) {
          return;
       }
       b.a(2, this.C.couponTemplateId);
       super.th();
       return;
    }
    public NewFanCouponModel uh(){
       Object obj = PatchProxy.apply(null, this, NewFanCouponFaceUpDialog.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Zg("KEY_NEW_FAN_COUPON_PENDANT");
    }
    public void vh(NewFanCouponModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewFanCouponFaceUpDialog.class, "2")) {
          return;
       }
       this.z.setVisibility(8);
       return;
    }
}
