package com.kwai.poi.base.model.PoiServiceConfigModel;
import java.io.Serializable;
import com.kwai.poi.base.model.PoiServiceConfigModel$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PoiServiceConfigModel implements Serializable	// class@0013ae
{
    public final boolean cityLimit;
    public final int nearbySearchRadius;
    public final int requestPageNum;
    public final int sortRule;
    public final String whiteCategoryType;
    public static final PoiServiceConfigModel$a Companion;
    public static final long serialVersionUID;

    static {
       PoiServiceConfigModel.Companion = new PoiServiceConfigModel$a(null);
    }
    public void PoiServiceConfigModel(){
       super(0, 0, null, 0, false, 31, null);
    }
    public void PoiServiceConfigModel(int p0,int p1,String p2,int p3,boolean p4){
       a.p(p2, "whiteCategoryType");
       super();
       this.sortRule = p0;
       this.requestPageNum = p1;
       this.whiteCategoryType = p2;
       this.nearbySearchRadius = p3;
       this.cityLimit = p4;
    }
    public void PoiServiceConfigModel(int p0,int p1,String p2,int p3,boolean p4,int p5,u p6){
       if (p5 & 0x01) {
          p0 = 0;
       }
       int i = (p5 & 0x02)? 20: p1;
       if (p5 & 0x04) {
          p2 = "";
       }
       String str = p2;
       int i1 = (p5 & 0x08)? 5000: p3;
       int i2 = (p5 & 0x10)? 1: p4;
       super(p0, i, str, i1, i2);
       return;
    }
    public static PoiServiceConfigModel copy$default(PoiServiceConfigModel p0,int p1,int p2,String p3,int p4,boolean p5,int p6,Object p7){
       PoiServiceConfigModel sortRule;
       PoiServiceConfigModel requestPageN;
       PoiServiceConfigModel whiteCategor;
       PoiServiceConfigModel nearbySearch;
       PoiServiceConfigModel cityLimit;
       if (p6 & 0x01) {
          sortRule = p0.sortRule;
       }
       if (p6 & 0x02) {
          requestPageN = p0.requestPageNum;
       }
       p7 = requestPageN;
       if (p6 & 0x04) {
          whiteCategor = p0.whiteCategoryType;
       }
       PoiServiceConfigModel poiServiceCo = whiteCategor;
       if (p6 & 0x08) {
          nearbySearch = p0.nearbySearchRadius;
       }
       PoiServiceConfigModel poiServiceCo1 = nearbySearch;
       if (p6 & 0x10) {
          cityLimit = p0.cityLimit;
       }
       return p0.copy(sortRule, p7, poiServiceCo, poiServiceCo1, cityLimit);
    }
    public final int component1(){
       return this.sortRule;
    }
    public final int component2(){
       return this.requestPageNum;
    }
    public final String component3(){
       return this.whiteCategoryType;
    }
    public final int component4(){
       return this.nearbySearchRadius;
    }
    public final boolean component5(){
       return this.cityLimit;
    }
    public final PoiServiceConfigModel copy(int p0,int p1,String p2,int p3,boolean p4){
       Object obj;
       if (PatchProxy.isSupport(PoiServiceConfigModel.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),p2,Integer.valueOf(p3),Boolean.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, PoiServiceConfigModel.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p2, "whiteCategoryType");
       PoiServiceConfigModel poiServiceCo = new PoiServiceConfigModel(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PoiServiceConfigModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PoiServiceConfigModel && (this.sortRule == p0.sortRule && (this.requestPageNum == p0.requestPageNum && (a.g(this.whiteCategoryType, p0.whiteCategoryType) && (this.nearbySearchRadius == p0.nearbySearchRadius && this.cityLimit == p0.cityLimit)))))) {
          return true;
       }
       return false;
    }
    public final boolean getCityLimit(){
       return this.cityLimit;
    }
    public final int getNearbySearchRadius(){
       return this.nearbySearchRadius;
    }
    public final int getRequestPageNum(){
       return this.requestPageNum;
    }
    public final int getSortRule(){
       return this.sortRule;
    }
    public final String getWhiteCategoryType(){
       return this.whiteCategoryType;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, PoiServiceConfigModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = ((this.sortRule * 31) + this.requestPageNum) * 31;
       PoiServiceConfigModel twhiteCatego = this.whiteCategoryType;
       int i1 = (twhiteCatego != null)? twhiteCatego.hashCode(): 0;
       i = (((i + i1) * 31) + this.nearbySearchRadius) * 31;
       twhiteCatego = this.cityLimit;
       if (twhiteCatego != null) {
          i1 = 1;
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PoiServiceConfigModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PoiServiceConfigModel\(sortRule="+this.sortRule+", requestPageNum="+this.requestPageNum+", whiteCategoryType="+this.whiteCategoryType+", nearbySearchRadius="+this.nearbySearchRadius+", cityLimit="+this.cityLimit+"\)";
    }
}