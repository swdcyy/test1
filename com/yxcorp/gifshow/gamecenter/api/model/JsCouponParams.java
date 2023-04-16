package com.yxcorp.gifshow.gamecenter.api.model.JsCouponParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class JsCouponParams implements Serializable	// class@0012a4
{
    public String callback;
    public String couponId;
    public static final long serialVersionUID = 0x864e91400c30db89;

    public void JsCouponParams(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsCouponParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsCouponParams{couponId=\'"+this.couponId+'''+", callback=\'"+this.callback+'''+'}';
    }
}
