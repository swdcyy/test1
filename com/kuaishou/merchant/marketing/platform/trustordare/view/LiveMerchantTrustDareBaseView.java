package com.kuaishou.merchant.marketing.platform.trustordare.view.LiveMerchantTrustDareBaseView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import t84.a;

public class LiveMerchantTrustDareBaseView extends ConstraintLayout	// class@001b6f
{
    public a B;
    public HashMap C;

    public void LiveMerchantTrustDareBaseView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LiveMerchantTrustDareBaseView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LiveMerchantTrustDareBaseView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void LiveMerchantTrustDareBaseView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final a getMClickClickListener(){
       return this.B;
    }
    public final void setMClickClickListener(a p0){
       this.B = p0;
    }
    public final void setViewClickListener(a p0){
       this.B = p0;
    }
}
