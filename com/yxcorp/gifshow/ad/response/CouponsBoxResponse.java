package com.yxcorp.gifshow.ad.response.CouponsBoxResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.response.CouponsBoxResponse$a;
import nsd.u;
import com.yxcorp.gifshow.ad.response.CouponsBoxResponseData;
import java.lang.Object;

public final class CouponsBoxResponse implements Serializable	// class@0017d3
{
    public final CouponsBoxResponseData data;
    public static final CouponsBoxResponse$a Companion;
    public static final long serialVersionUID;

    static {
       CouponsBoxResponse.Companion = new CouponsBoxResponse$a(null);
    }
    public void CouponsBoxResponse(CouponsBoxResponseData p0){
       super();
       this.data = p0;
    }
}
