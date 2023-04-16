package com.kuaishou.merchant.live.cart.onsale.audience.model.OrderToPayInfo;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import ekd.x0;
import com.kwai.robust.PatchProxyResult;

public class OrderToPayInfo implements Serializable, a	// class@001957
{
    public String mButtonText;
    public String mDescPattern;
    public String mEndDesc;
    public long mEndTime;
    public CDNUrl[] mImageUrls;
    public String mItemId;
    public String mJumpUrl;
    public String mOrderId;
    public String mTitle;
    public Map mTraceMap;
    public static final long serialVersionUID = 0x6e094e917001f16;

    public void OrderToPayInfo(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, OrderToPayInfo.class, "1")) {
          return;
       }
       this.mDescPattern = (!TextUtils.x(this.mDescPattern))? (this.mDescPattern).replace("${0}", "%s"): "";
       if (!TextUtils.x(this.mJumpUrl)) {
          Uri uri = x0.f(this.mJumpUrl);
          if (uri != null) {
             this.mOrderId = x0.a(uri, "orderId");
             this.mItemId = x0.a(uri, "itemId");
          }
       }
       return;
    }
    public String getDescPattern(){
       Object obj = PatchProxy.apply(null, this, OrderToPayInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextUtils.k(this.mDescPattern);
    }
}
