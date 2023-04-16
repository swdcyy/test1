package com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.model.DetailPendantFullDeliveryModel;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.model.BaseDetailPendantItemModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.o5;
import java.lang.Boolean;
import wkd.b;
import com.kwai.framework.network.sntp.a;
import java.lang.Long;
import java.lang.System;

public final class DetailPendantFullDeliveryModel extends BaseDetailPendantItemModel	// class@000747
{
    public final String buttonName;
    public final String buttonType;
    public final long currentServerTime;
    public final long expireTime;

    public void DetailPendantFullDeliveryModel(){
       super();
       this.buttonType = "";
       this.buttonName = "";
    }
    public final int getButtonIntType(){
       Object obj = PatchProxy.apply(null, this, DetailPendantFullDeliveryModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return o5.b(this.buttonType, 0);
    }
    public final String getButtonName(){
       return this.buttonName;
    }
    public final String getButtonType(){
       return this.buttonType;
    }
    public final long getCurrentServerTime(){
       return this.currentServerTime;
    }
    public final long getExpireTime(){
       return this.expireTime;
    }
    public boolean isValid(){
       long l;
       Long obj = PatchProxy.apply(null, this, DetailPendantFullDeliveryModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.getButtonIntType() != b) {
          return super.isValid();
       }
       obj = b.a(0x3b1f7b44).a();
       if (obj != null) {
          l = obj.longValue();
       }else {
          l = this.currentServerTime;
          if (l <= 0) {
             l = System.currentTimeMillis();
          }
       }
       if ((this.expireTime - l) <= 0 || !super.isValid()) {
          b = false;
       }
       return b;
    }
}
