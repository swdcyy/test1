package com.yxcorp.gifshow.model.HotSpotDetail;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.common.Distance;
import java.lang.StringBuilder;
import java.lang.Number;

public class HotSpotDetail implements Serializable	// class@001e23
{
    public String mAction;
    public int mAffectRadius;
    public String mCaption;
    public CDNUrl[] mCoverThumbnailUrls;
    public String mHotspotId;
    public String mIdentifier;
    public String mIntroduction;
    public Distance mLocation;
    public CDNUrl[] mOverrideCoverThumbnailUrls;
    public HotspotContentType mSourceType;
    public static final long serialVersionUID = 0x19e3daf37cb2d8e7;

    public void HotSpotDetail(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HotSpotDetail.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       return (this.getIdentifier()).equals(p0.getIdentifier());
    }
    public String getIdentifier(){
       String obj = PatchProxy.apply(null, this, HotSpotDetail.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(this.mIdentifier)) {
          obj = TextUtils.k(this.mHotspotId);
          HotSpotDetail tmLocation = this.mLocation;
          String str = "";
          String str1 = (tmLocation != null)? String.valueOf(tmLocation.mLatitude): str;
          HotSpotDetail tmLocation1 = this.mLocation;
          if (tmLocation1 != null) {
             str = String.valueOf(tmLocation1.mLongtitude);
          }
          this.mIdentifier = obj+str1+str;
       }
       return (this.mIdentifier).toLowerCase();
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, HotSpotDetail.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.getIdentifier()).hashCode();
    }
}
