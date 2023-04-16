package com.yxcorp.gifshow.ad.response.CouponsBoxResponseData;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.response.CouponsBoxResponseData$a;
import nsd.u;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;

public final class CouponsBoxResponseData implements Serializable	// class@0017d5
{
    public final Integer couponResult;
    public final String successMessage;
    public static final CouponsBoxResponseData$a Companion;
    public static final long serialVersionUID;

    static {
       CouponsBoxResponseData.Companion = new CouponsBoxResponseData$a(null);
    }
    public void CouponsBoxResponseData(String p0,Integer p1){
       super();
       this.successMessage = p0;
       this.couponResult = p1;
    }
}
