package com.yxcorp.gifshow.map.map.bottomFeed.model.RnFeedParamsModel;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class RnFeedParamsModel	// class@001c81
{
    public final String filterBoxes;
    public final String latitude;
    public final String leftTopLat;
    public final String leftTopLon;
    public final String longitude;
    public final String photoIds;
    public final String rightBottomLat;
    public final String rightBottomLon;
    public final String roamingCityId;
    public final String userIds;

    public void RnFeedParamsModel(String p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,String p8,String p9){
       a.p(p0, "leftTopLat");
       a.p(p1, "leftTopLon");
       a.p(p2, "rightBottomLat");
       a.p(p3, "rightBottomLon");
       a.p(p4, "filterBoxes");
       a.p(p5, "userIds");
       a.p(p6, "photoIds");
       a.p(p7, "roamingCityId");
       a.p(p8, "latitude");
       a.p(p9, "longitude");
       super();
       this.leftTopLat = p0;
       this.leftTopLon = p1;
       this.rightBottomLat = p2;
       this.rightBottomLon = p3;
       this.filterBoxes = p4;
       this.userIds = p5;
       this.photoIds = p6;
       this.roamingCityId = p7;
       this.latitude = p8;
       this.longitude = p9;
    }
    public static RnFeedParamsModel copy$default(RnFeedParamsModel p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,String p8,String p9,String p10,int p11,Object p12){
       RnFeedParamsModel rnFeedParams = p0;
       int i = p11;
       RnFeedParamsModel leftTopLat = (i & 0x01)? rnFeedParams.leftTopLat: p1;
       RnFeedParamsModel leftTopLon = (i & 0x02)? rnFeedParams.leftTopLon: p2;
       RnFeedParamsModel rightBottomL = (i & 0x04)? rnFeedParams.rightBottomLat: p3;
       RnFeedParamsModel rightBottomL1 = (i & 0x08)? rnFeedParams.rightBottomLon: p4;
       RnFeedParamsModel filterBoxes = (i & 0x10)? rnFeedParams.filterBoxes: p5;
       RnFeedParamsModel userIds = (i & 0x20)? rnFeedParams.userIds: p6;
       RnFeedParamsModel photoIds = (i & 0x40)? rnFeedParams.photoIds: p7;
       RnFeedParamsModel roamingCityI = (i & 0x0080)? rnFeedParams.roamingCityId: p8;
       RnFeedParamsModel latitude = (i & 0x0100)? rnFeedParams.latitude: p9;
       RnFeedParamsModel longitude = (i & 0x0200)? rnFeedParams.longitude: p10;
       return p0.copy(leftTopLat, leftTopLon, rightBottomL, rightBottomL1, filterBoxes, userIds, photoIds, roamingCityI, latitude, longitude);
    }
    public final String component1(){
       return this.leftTopLat;
    }
    public final String component10(){
       return this.longitude;
    }
    public final String component2(){
       return this.leftTopLon;
    }
    public final String component3(){
       return this.rightBottomLat;
    }
    public final String component4(){
       return this.rightBottomLon;
    }
    public final String component5(){
       return this.filterBoxes;
    }
    public final String component6(){
       return this.userIds;
    }
    public final String component7(){
       return this.photoIds;
    }
    public final String component8(){
       return this.roamingCityId;
    }
    public final String component9(){
       return this.latitude;
    }
    public final RnFeedParamsModel copy(String p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,String p8,String p9){
       Object[] objArray;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       object oobject5 = p5;
       object oobject6 = p6;
       object oobject7 = p7;
       object oobject8 = p8;
       object oobject9 = p9;
       RnFeedParamsModel rnFeedParams = RnFeedParamsModel.class;
       if (PatchProxy.isSupport(rnFeedParams)) {
          objArray = new Object[10];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = oobject2;
          objArray[3] = oobject3;
          objArray[4] = oobject4;
          objArray[5] = oobject5;
          objArray[6] = oobject6;
          objArray[7] = oobject7;
          objArray[8] = oobject8;
          objArray[9] = oobject9;
          Object obj = PatchProxy.apply(objArray, this, rnFeedParams, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p0, "leftTopLat");
       a.p(oobject1, "leftTopLon");
       a.p(oobject2, "rightBottomLat");
       a.p(oobject3, "rightBottomLon");
       a.p(oobject4, "filterBoxes");
       a.p(oobject5, "userIds");
       a.p(oobject6, "photoIds");
       a.p(oobject7, "roamingCityId");
       a.p(oobject8, "latitude");
       a.p(oobject9, "longitude");
       rnFeedParams = new RnFeedParamsModel(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
       return objArray;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RnFeedParamsModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof RnFeedParamsModel && (a.g(this.leftTopLat, p0.leftTopLat) && (a.g(this.leftTopLon, p0.leftTopLon) && (a.g(this.rightBottomLat, p0.rightBottomLat) && (a.g(this.rightBottomLon, p0.rightBottomLon) && (a.g(this.filterBoxes, p0.filterBoxes) && (a.g(this.userIds, p0.userIds) && (a.g(this.photoIds, p0.photoIds) && (a.g(this.roamingCityId, p0.roamingCityId) && (a.g(this.latitude, p0.latitude) && a.g(this.longitude, p0.longitude)))))))))))) {
          return true;
       }
       return false;
    }
    public final String getFilterBoxes(){
       return this.filterBoxes;
    }
    public final String getLatitude(){
       return this.latitude;
    }
    public final String getLeftTopLat(){
       return this.leftTopLat;
    }
    public final String getLeftTopLon(){
       return this.leftTopLon;
    }
    public final String getLongitude(){
       return this.longitude;
    }
    public final String getPhotoIds(){
       return this.photoIds;
    }
    public final String getRightBottomLat(){
       return this.rightBottomLat;
    }
    public final String getRightBottomLon(){
       return this.rightBottomLon;
    }
    public final String getRoamingCityId(){
       return this.roamingCityId;
    }
    public final String getUserIds(){
       return this.userIds;
    }
    public int hashCode(){
       RnFeedParamsModel obj = PatchProxy.apply(null, this, RnFeedParamsModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.leftTopLat;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       RnFeedParamsModel tleftTopLon = this.leftTopLon;
       int i2 = (tleftTopLon != null)? tleftTopLon.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tleftTopLon = this.rightBottomLat;
       i2 = (tleftTopLon != null)? tleftTopLon.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tleftTopLon = this.rightBottomLon;
       i2 = (tleftTopLon != null)? tleftTopLon.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tleftTopLon = this.filterBoxes;
       i2 = (tleftTopLon != null)? tleftTopLon.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tleftTopLon = this.userIds;
       i2 = (tleftTopLon != null)? tleftTopLon.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tleftTopLon = this.photoIds;
       i2 = (tleftTopLon != null)? tleftTopLon.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tleftTopLon = this.roamingCityId;
       i2 = (tleftTopLon != null)? tleftTopLon.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tleftTopLon = this.latitude;
       i2 = (tleftTopLon != null)? tleftTopLon.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tleftTopLon = this.longitude;
       if (tleftTopLon != null) {
          i = tleftTopLon.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RnFeedParamsModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RnFeedParamsModel\(leftTopLat="+this.leftTopLat+", leftTopLon="+this.leftTopLon+", rightBottomLat="+this.rightBottomLat+", rightBottomLon="+this.rightBottomLon+", filterBoxes="+this.filterBoxes+", userIds="+this.userIds+", photoIds="+this.photoIds+", roamingCityId="+this.roamingCityId+", latitude="+this.latitude+", longitude="+this.longitude+"\)";
    }
}
