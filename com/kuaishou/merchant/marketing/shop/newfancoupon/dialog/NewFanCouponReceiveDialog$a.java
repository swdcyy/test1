package com.kuaishou.merchant.marketing.shop.newfancoupon.dialog.NewFanCouponReceiveDialog$a;
import android.os.CountDownTimer;
import com.kuaishou.merchant.marketing.shop.newfancoupon.dialog.NewFanCouponReceiveDialog;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.Long;
import com.kuaishou.merchant.marketing.shop.newfancoupon.dialog.NewFanCouponBaseDialog;
import java.lang.CharSequence;
import android.widget.TextView;

public class NewFanCouponReceiveDialog$a extends CountDownTimer	// class@001bf2
{
    public final NewFanCouponReceiveDialog a;

    public void NewFanCouponReceiveDialog$a(NewFanCouponReceiveDialog p0,long p1,long p2){
       this.a = p0;
       super(p1, p2);
    }
    public void onFinish(){
       if (PatchProxy.applyVoid(null, this, NewFanCouponReceiveDialog$a.class, "2")) {
          return;
       }
       this.a.dismiss();
       return;
    }
    public void onTick(long p0){
       if (PatchProxy.isSupport(NewFanCouponReceiveDialog$a.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, NewFanCouponReceiveDialog$a.class, "1")) {
          return;
       }
       NewFanCouponReceiveDialog$a ta = this.a;
       ta.z.setText(ta.wh(p0));
       return;
    }
}
