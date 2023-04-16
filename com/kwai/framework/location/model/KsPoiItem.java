package com.kwai.framework.location.model.KsPoiItem;
import com.kwai.framework.location.model.KsLocation;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class KsPoiItem	// class@001650
{
    public String adcode;
    public String address;
    public String businessArea;
    public String city;
    public String citycode;
    public String direction;
    public int distance;
    public String district;
    public String email;
    public String gridcode;
    public boolean hasIndoorMap;
    public KsLocation location;
    public String name;
    public String parkingType;
    public String pcode;
    public String postcode;
    public String province;
    public String shopID;
    public String tel;
    public String type;
    public String typecode;
    public String uid;
    public String website;

    public void KsPoiItem(){
       super(null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, 0x7fffff, null);
    }
    public void KsPoiItem(KsLocation p0,String p1,String p2,String p3,String p4,boolean p5,String p6,String p7,String p8,String p9,String p10,String p11,String p12,String p13,String p14,String p15,String p16,int p17,String p18,String p19,String p20,String p21,String p22){
       int i = this;
       super();
       i.location = p0;
       i.district = p1;
       i.province = p2;
       i.typecode = p3;
       i.tel = p4;
       i.hasIndoorMap = p5;
       i.businessArea = p6;
       i.parkingType = p7;
       i.city = p8;
       i.adcode = p9;
       i.name = p10;
       i.type = p11;
       i.shopID = p12;
       i.gridcode = p13;
       i.uid = p14;
       i.website = p15;
       i.pcode = p16;
       i.distance = p17;
       i.email = p18;
       i.direction = p19;
       i.citycode = p20;
       i.postcode = p21;
       i.address = p22;
    }
    public void KsPoiItem(KsLocation p0,String p1,String p2,String p3,String p4,boolean p5,String p6,String p7,String p8,String p9,String p10,String p11,String p12,String p13,String p14,String p15,String p16,int p17,String p18,String p19,String p20,String p21,String p22,int p23,u p24){
       int i = p23;
       int i1 = (i & 0x01)? 0: p0;
       int i2 = (i & 0x02)? 0: p1;
       int i3 = (i & 0x04)? 0: p2;
       int i4 = (i & 0x08)? 0: p3;
       int i5 = (i & 0x10)? 0: p4;
       int i6 = (i & 0x20)? 0: p5;
       int i7 = (i & 0x40)? 0: p6;
       int i8 = (i & 0x0080)? 0: p7;
       int i9 = (i & 0x0100)? 0: p8;
       int i10 = (i & 0x0200)? 0: p9;
       int i11 = (i & 0x0400)? 0: p10;
       int i12 = (i & 0x0800)? 0: p11;
       int i13 = (i & 0x1000)? 0: p12;
       int i14 = (i & 0x2000)? 0: p13;
       int i15 = (i & 0x4000)? 0: p14;
       int i16 = (i & 0x8000)? 0: p15;
       int i17 = (i & 0x10000)? 0: p16;
       int i18 = (i & 0x20000)? 0: p17;
       int i19 = (i & 0x40000)? 0: p18;
       int i20 = (i & 0x80000)? 0: p19;
       int i21 = (i & 0x100000)? 0: p20;
       int i22 = (i & 0x200000)? 0: p21;
       i = (i & 0x400000)? 0: p22;
       super(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i);
       return;
    }
    public static KsPoiItem copy$default(KsPoiItem p0,KsLocation p1,String p2,String p3,String p4,String p5,boolean p6,String p7,String p8,String p9,String p10,String p11,String p12,String p13,String p14,String p15,String p16,String p17,int p18,String p19,String p20,String p21,String p22,String p23,int p24,Object p25){
       int i1;
       KsPoiItem ksPoiItem = p0;
       int i = p24;
       KsPoiItem location = (i & 0x01)? ksPoiItem.location: p1;
       KsPoiItem district = (i & 0x02)? ksPoiItem.district: p2;
       KsPoiItem province = (i & 0x04)? ksPoiItem.province: p3;
       KsPoiItem typecode = (i & 0x08)? ksPoiItem.typecode: p4;
       KsPoiItem tel = (i & 0x10)? ksPoiItem.tel: p5;
       KsPoiItem hasIndoorMap = (i & 0x20)? ksPoiItem.hasIndoorMap: p6;
       KsPoiItem businessArea = (i & 0x40)? ksPoiItem.businessArea: p7;
       KsPoiItem parkingType = (i & 0x0080)? ksPoiItem.parkingType: p8;
       KsPoiItem city = (i & 0x0100)? ksPoiItem.city: p9;
       KsPoiItem adcode = (i & 0x0200)? ksPoiItem.adcode: p10;
       KsPoiItem name = (i & 0x0400)? ksPoiItem.name: p11;
       KsPoiItem type = (i & 0x0800)? ksPoiItem.type: p12;
       KsPoiItem shopID = (i & 0x1000)? ksPoiItem.shopID: p13;
       KsPoiItem gridcode = (i & 0x2000)? ksPoiItem.gridcode: p14;
       KsPoiItem ksPoiItem1 = gridcode;
       gridcode = (i & 0x4000)? ksPoiItem.uid: p15;
       KsPoiItem ksPoiItem2 = gridcode;
       gridcode = (i & 0x8000)? ksPoiItem.website: p16;
       KsPoiItem ksPoiItem3 = gridcode;
       gridcode = (i & 0x10000)? ksPoiItem.pcode: p17;
       KsPoiItem ksPoiItem4 = gridcode;
       gridcode = (i & 0x20000)? ksPoiItem.distance: p18;
       KsPoiItem ksPoiItem5 = gridcode;
       gridcode = (i & 0x40000)? ksPoiItem.email: p19;
       KsPoiItem ksPoiItem6 = gridcode;
       gridcode = (i & 0x80000)? ksPoiItem.direction: p20;
       KsPoiItem ksPoiItem7 = gridcode;
       gridcode = (i & 0x100000)? ksPoiItem.citycode: p21;
       KsPoiItem ksPoiItem8 = gridcode;
       gridcode = (i & 0x200000)? ksPoiItem.postcode: p22;
       KsPoiItem address = (i & 0x400000)? ksPoiItem.address: p23;
       return p0.copy(location, district, province, typecode, tel, hasIndoorMap, businessArea, parkingType, city, adcode, name, type, shopID, ksPoiItem1, ksPoiItem2, ksPoiItem3, ksPoiItem4, ksPoiItem5, ksPoiItem6, ksPoiItem7, ksPoiItem8, gridcode, address);
    }
    public final KsLocation component1(){
       return this.location;
    }
    public final String component10(){
       return this.adcode;
    }
    public final String component11(){
       return this.name;
    }
    public final String component12(){
       return this.type;
    }
    public final String component13(){
       return this.shopID;
    }
    public final String component14(){
       return this.gridcode;
    }
    public final String component15(){
       return this.uid;
    }
    public final String component16(){
       return this.website;
    }
    public final String component17(){
       return this.pcode;
    }
    public final int component18(){
       return this.distance;
    }
    public final String component19(){
       return this.email;
    }
    public final String component2(){
       return this.district;
    }
    public final String component20(){
       return this.direction;
    }
    public final String component21(){
       return this.citycode;
    }
    public final String component22(){
       return this.postcode;
    }
    public final String component23(){
       return this.address;
    }
    public final String component3(){
       return this.province;
    }
    public final String component4(){
       return this.typecode;
    }
    public final String component5(){
       return this.tel;
    }
    public final boolean component6(){
       return this.hasIndoorMap;
    }
    public final String component7(){
       return this.businessArea;
    }
    public final String component8(){
       return this.parkingType;
    }
    public final String component9(){
       return this.city;
    }
    public final KsPoiItem copy(KsLocation p0,String p1,String p2,String p3,String p4,boolean p5,String p6,String p7,String p8,String p9,String p10,String p11,String p12,String p13,String p14,String p15,String p16,int p17,String p18,String p19,String p20,String p21,String p22){
       Object obj;
       KsPoiItem ksPoiItem = KsPoiItem.class;
       if (PatchProxy.isSupport(ksPoiItem)) {
          Object[] objArray = new Object[23];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = Boolean.valueOf(p5);
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          objArray[10] = p10;
          objArray[11] = p11;
          objArray[12] = p12;
          objArray[13] = p13;
          objArray[14] = p14;
          objArray[15] = p15;
          objArray[16] = p16;
          objArray[17] = Integer.valueOf(p17);
          objArray[18] = p18;
          objArray[19] = p19;
          objArray[20] = p20;
          objArray[21] = p21;
          objArray[22] = p22;
          obj = PatchProxy.apply(objArray, this, ksPoiItem, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       KsPoiItem ksPoiItem1 = new KsPoiItem(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsPoiItem.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KsPoiItem && (a.g(this.location, p0.location) && (a.g(this.district, p0.district) && (a.g(this.province, p0.province) && (a.g(this.typecode, p0.typecode) && (a.g(this.tel, p0.tel) && (this.hasIndoorMap == p0.hasIndoorMap && (a.g(this.businessArea, p0.businessArea) && (a.g(this.parkingType, p0.parkingType) && (a.g(this.city, p0.city) && (a.g(this.adcode, p0.adcode) && (a.g(this.name, p0.name) && (a.g(this.type, p0.type) && (a.g(this.shopID, p0.shopID) && (a.g(this.gridcode, p0.gridcode) && (a.g(this.uid, p0.uid) && (a.g(this.website, p0.website) && (a.g(this.pcode, p0.pcode) && (this.distance == p0.distance && (a.g(this.email, p0.email) && (a.g(this.direction, p0.direction) && (a.g(this.citycode, p0.citycode) && (a.g(this.postcode, p0.postcode) && a.g@00b0cd(this.address@003d38, p0.address@003d38))))))))))))))))))))))))) {
          return true;
       }
       return false;
    }
    public final String getAdcode(){
       return this.adcode;
    }
    public final String getAddress(){
       return this.address;
    }
    public final String getBusinessArea(){
       return this.businessArea;
    }
    public final String getCity(){
       return this.city;
    }
    public final String getCitycode(){
       return this.citycode;
    }
    public final String getDirection(){
       return this.direction;
    }
    public final int getDistance(){
       return this.distance;
    }
    public final String getDistrict(){
       return this.district;
    }
    public final String getEmail(){
       return this.email;
    }
    public final String getGridcode(){
       return this.gridcode;
    }
    public final boolean getHasIndoorMap(){
       return this.hasIndoorMap;
    }
    public final KsLocation getLocation(){
       return this.location;
    }
    public final String getName(){
       return this.name;
    }
    public final String getParkingType(){
       return this.parkingType;
    }
    public final String getPcode(){
       return this.pcode;
    }
    public final String getPostcode(){
       return this.postcode;
    }
    public final String getProvince(){
       return this.province;
    }
    public final String getShopID(){
       return this.shopID;
    }
    public final String getTel(){
       return this.tel;
    }
    public final String getType(){
       return this.type;
    }
    public final String getTypecode(){
       return this.typecode;
    }
    public final String getUid(){
       return this.uid;
    }
    public final String getWebsite(){
       return this.website;
    }
    public int hashCode(){
       KsPoiItem obj = PatchProxy.apply(null, this, KsPoiItem.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.location;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       KsPoiItem tdistrict = this.district;
       int i2 = (tdistrict != null)? tdistrict.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdistrict = this.province;
       i2 = (tdistrict != null)? tdistrict.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdistrict = this.typecode;
       i2 = (tdistrict != null)? tdistrict.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdistrict = this.tel;
       i2 = (tdistrict != null)? tdistrict.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdistrict = this.hasIndoorMap;
       if (tdistrict != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tdistrict = this.businessArea;
       i2 = (tdistrict != null)? tdistrict.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdistrict = this.parkingType;
       i2 = (tdistrict != null)? tdistrict.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdistrict = this.city;
       i2 = (tdistrict != null)? tdistrict.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdistrict = this.adcode;
       i2 = (tdistrict != null)? tdistrict.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdistrict = this.name;
       i2 = (tdistrict != null)? tdistrict.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdistrict = this.type;
       i2 = (tdistrict != null)? tdistrict.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdistrict = this.shopID;
       i2 = (tdistrict != null)? tdistrict.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdistrict = this.gridcode;
       i2 = (tdistrict != null)? tdistrict.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdistrict = this.uid;
       i2 = (tdistrict != null)? tdistrict.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdistrict = this.website;
       i2 = (tdistrict != null)? tdistrict.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdistrict = this.pcode;
       i2 = (tdistrict != null)? tdistrict.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.distance) * 31;
       tdistrict = this.email;
       i2 = (tdistrict != null)? tdistrict.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdistrict = this.direction;
       i2 = (tdistrict != null)? tdistrict.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdistrict = this.citycode;
       i2 = (tdistrict != null)? tdistrict.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdistrict = this.postcode;
       i2 = (tdistrict != null)? tdistrict.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdistrict = this.address;
       if (tdistrict != null) {
          i = tdistrict.hashCode();
       }
       return (i1 + i);
    }
    public final void setAdcode(String p0){
       this.adcode = p0;
    }
    public final void setAddress(String p0){
       this.address = p0;
    }
    public final void setBusinessArea(String p0){
       this.businessArea = p0;
    }
    public final void setCity(String p0){
       this.city = p0;
    }
    public final void setCitycode(String p0){
       this.citycode = p0;
    }
    public final void setDirection(String p0){
       this.direction = p0;
    }
    public final void setDistance(int p0){
       this.distance = p0;
    }
    public final void setDistrict(String p0){
       this.district = p0;
    }
    public final void setEmail(String p0){
       this.email = p0;
    }
    public final void setGridcode(String p0){
       this.gridcode = p0;
    }
    public final void setHasIndoorMap(boolean p0){
       this.hasIndoorMap = p0;
    }
    public final void setLocation(KsLocation p0){
       this.location = p0;
    }
    public final void setName(String p0){
       this.name = p0;
    }
    public final void setParkingType(String p0){
       this.parkingType = p0;
    }
    public final void setPcode(String p0){
       this.pcode = p0;
    }
    public final void setPostcode(String p0){
       this.postcode = p0;
    }
    public final void setProvince(String p0){
       this.province = p0;
    }
    public final void setShopID(String p0){
       this.shopID = p0;
    }
    public final void setTel(String p0){
       this.tel = p0;
    }
    public final void setType(String p0){
       this.type = p0;
    }
    public final void setTypecode(String p0){
       this.typecode = p0;
    }
    public final void setUid(String p0){
       this.uid = p0;
    }
    public final void setWebsite(String p0){
       this.website = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KsPoiItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KsPoiItem\(location="+this.location+", district="+this.district+", province="+this.province+", typecode="+this.typecode+", tel="+this.tel+", hasIndoorMap="+this.hasIndoorMap+", businessArea="+this.businessArea+", parkingType="+this.parkingType+", city="+this.city+", adcode="+this.adcode+", name="+this.name+", type="+this.type+", shopID="+this.shopID+", gridcode="+this.gridcode+", uid="+this.uid+", website="+this.website+", pcode="+this.pcode+", distance="+this.distance+", email="+this.email+", direction="+this.direction+", citycode="+this.citycode+", postcode="+this.postcode+", address="+this.address+"\)";
    }
}
