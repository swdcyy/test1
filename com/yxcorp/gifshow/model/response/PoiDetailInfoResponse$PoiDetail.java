package com.yxcorp.gifshow.model.response.PoiDetailInfoResponse$PoiDetail;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Integer;
import ok.k;

public class PoiDetailInfoResponse$PoiDetail implements Serializable	// class@001f51
{
    public PoiDetailInfoResponse$AdReportInfo mAdReportInfo;
    public String mAddress;
    public String mBusinessHour;
    public int mCategory;
    public String mCity;
    public List mCommodity;
    public double mDistance;
    public String[] mHeadImages;
    public int mHeat;
    public int mId;
    public double mLatitude;
    public double mLongitude;
    public String mPhone;
    public String mPrice;
    public String mPrimaryCategory;
    public double mRate;
    public List mRecommendPois;
    public String mShowCategoryName;
    public String mTitle;
    public static final long serialVersionUID = 0xdcd121ef7060ebc6;

    public void PoiDetailInfoResponse$PoiDetail(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PoiDetailInfoResponse$PoiDetail.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof PoiDetailInfoResponse$PoiDetail) {
          return super.equals(p0);
       }
       boolean b = (this.mId == p0.mId)? true: false;
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, PoiDetailInfoResponse$PoiDetail.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{Integer.valueOf(this.mId)};
       return k.b(obj);
    }
}
