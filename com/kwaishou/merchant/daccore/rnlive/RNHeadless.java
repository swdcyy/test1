package com.kwaishou.merchant.daccore.rnlive.RNHeadless;
import com.kuaishou.merchant.bowl.krn.MerchantKrnContainerView;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;

public final class RNHeadless extends MerchantKrnContainerView	// class@001336
{
    public RNHeadless$a u;
    public String v;
    public HashMap w;

    public void RNHeadless(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void RNHeadless(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void RNHeadless(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void RNHeadless(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
}
