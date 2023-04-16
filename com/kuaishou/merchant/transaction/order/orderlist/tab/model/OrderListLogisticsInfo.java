package com.kuaishou.merchant.transaction.order.orderlist.tab.model.OrderListLogisticsInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Number;
import z1.d;

public class OrderListLogisticsInfo implements Serializable	// class@0008d4
{
    public String mActiveIconUrl;
    public String mCompanyName;
    public String mLogisticsContext;
    public String mLogisticsJumpUrl;
    public String mLogisticsStateDesc;
    public static final long serialVersionUID = 0x801166df03a9994d;

    public void OrderListLogisticsInfo(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OrderListLogisticsInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (!TextUtils.equals(this.mLogisticsStateDesc, p0.mLogisticsStateDesc) || (!TextUtils.equals(this.mActiveIconUrl, p0.mActiveIconUrl) || (!TextUtils.equals(this.mCompanyName, p0.mCompanyName) || (!TextUtils.equals(this.mLogisticsContext, p0.mLogisticsContext) || !TextUtils.equals(this.mLogisticsJumpUrl, p0.mLogisticsJumpUrl))))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, OrderListLogisticsInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.mLogisticsStateDesc,this.mActiveIconUrl,this.mCompanyName,this.mLogisticsContext,this.mLogisticsJumpUrl};
       return d.b(obj);
    }
}
