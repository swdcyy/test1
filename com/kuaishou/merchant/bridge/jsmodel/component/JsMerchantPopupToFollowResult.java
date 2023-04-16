package com.kuaishou.merchant.bridge.jsmodel.component.JsMerchantPopupToFollowResult;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.merchant.bridge.jsmodel.component.JsMerchantPopupToFollowResult$Data;

public class JsMerchantPopupToFollowResult implements Serializable	// class@001617
{
    public JsMerchantPopupToFollowResult$Data mData;
    public final int mResult;

    public void JsMerchantPopupToFollowResult(int p0,int p1){
       super();
       this.mResult = p0;
       this.mData = new JsMerchantPopupToFollowResult$Data(this, p1);
    }
}
