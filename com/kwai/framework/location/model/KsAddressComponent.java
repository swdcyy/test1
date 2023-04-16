package com.kwai.framework.location.model.KsAddressComponent;
import java.lang.String;
import java.util.List;
import com.kwai.framework.location.model.KsStreetNumber;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class KsAddressComponent	// class@00164b
{
    public String adcode;
    public String building;
    public List businessAreas;
    public String city;
    public String citycode;
    public String country;
    public String countryCode;
    public String district;
    public String neighborhood;
    public String province;
    public KsStreetNumber streetNumber;
    public String towncode;
    public String township;

    public void KsAddressComponent(){
       super(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }
    public void KsAddressComponent(String p0,String p1,String p2,String p3,String p4,List p5,String p6,String p7,String p8,String p9,KsStreetNumber p10,String p11,String p12){
       super();
       this.neighborhood = p0;
       this.building = p1;
       this.province = p2;
       this.countryCode = p3;
       this.country = p4;
       this.businessAreas = p5;
       this.city = p6;
       this.citycode = p7;
       this.district = p8;
       this.adcode = p9;
       this.streetNumber = p10;
       this.township = p11;
       this.towncode = p12;
    }
    public void KsAddressComponent(String p0,String p1,String p2,String p3,String p4,List p5,String p6,String p7,String p8,String p9,KsStreetNumber p10,String p11,String p12,int p13,u p14){
       int i = p13;
       int i1 = 0;
       int i2 = (i & 0x01)? i1: p0;
       int i3 = (i & 0x02)? i1: p1;
       int i4 = (i & 0x04)? i1: p2;
       int i5 = (i & 0x08)? i1: p3;
       int i6 = (i & 0x10)? i1: p4;
       int i7 = (i & 0x20)? i1: p5;
       int i8 = (i & 0x40)? i1: p6;
       int i9 = (i & 0x0080)? i1: p7;
       int i10 = (i & 0x0100)? i1: p8;
       int i11 = (i & 0x0200)? i1: p9;
       int i12 = (i & 0x0400)? i1: p10;
       int i13 = (i & 0x0800)? i1: p11;
       if (!(i & 0x1000)) {
          i1 = p12;
       }
       super(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i1);
       return;
    }
    public static KsAddressComponent copy$default(KsAddressComponent p0,String p1,String p2,String p3,String p4,String p5,List p6,String p7,String p8,String p9,String p10,KsStreetNumber p11,String p12,String p13,int p14,Object p15){
       KsAddressComponent ksAddressCom = p0;
       int i = p14;
       KsAddressComponent neighborhood = (i & 0x01)? ksAddressCom.neighborhood: p1;
       KsAddressComponent building = (i & 0x02)? ksAddressCom.building: p2;
       KsAddressComponent province = (i & 0x04)? ksAddressCom.province: p3;
       KsAddressComponent countryCode = (i & 0x08)? ksAddressCom.countryCode: p4;
       KsAddressComponent country = (i & 0x10)? ksAddressCom.country: p5;
       KsAddressComponent businessArea = (i & 0x20)? ksAddressCom.businessAreas: p6;
       KsAddressComponent city = (i & 0x40)? ksAddressCom.city: p7;
       KsAddressComponent citycode = (i & 0x0080)? ksAddressCom.citycode: p8;
       KsAddressComponent district = (i & 0x0100)? ksAddressCom.district: p9;
       KsAddressComponent adcode = (i & 0x0200)? ksAddressCom.adcode: p10;
       KsAddressComponent streetNumber = (i & 0x0400)? ksAddressCom.streetNumber: p11;
       KsAddressComponent township = (i & 0x0800)? ksAddressCom.township: p12;
       KsAddressComponent towncode = (i & 0x1000)? ksAddressCom.towncode: p13;
       return p0.copy(neighborhood, building, province, countryCode, country, businessArea, city, citycode, district, adcode, streetNumber, township, towncode);
    }
    public final String component1(){
       return this.neighborhood;
    }
    public final String component10(){
       return this.adcode;
    }
    public final KsStreetNumber component11(){
       return this.streetNumber;
    }
    public final String component12(){
       return this.township;
    }
    public final String component13(){
       return this.towncode;
    }
    public final String component2(){
       return this.building;
    }
    public final String component3(){
       return this.province;
    }
    public final String component4(){
       return this.countryCode;
    }
    public final String component5(){
       return this.country;
    }
    public final List component6(){
       return this.businessAreas;
    }
    public final String component7(){
       return this.city;
    }
    public final String component8(){
       return this.citycode;
    }
    public final String component9(){
       return this.district;
    }
    public final KsAddressComponent copy(String p0,String p1,String p2,String p3,String p4,List p5,String p6,String p7,String p8,String p9,KsStreetNumber p10,String p11,String p12){
       Object obj;
       KsAddressComponent ksAddressCom = KsAddressComponent.class;
       if (PatchProxy.isSupport(ksAddressCom)) {
          Object[] objArray = new Object[13];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          objArray[10] = p10;
          objArray[11] = p11;
          objArray[12] = p12;
          obj = PatchProxy.apply(objArray, this, ksAddressCom, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       KsAddressComponent ksAddressCom1 = new KsAddressComponent(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsAddressComponent.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KsAddressComponent && (a.g(this.neighborhood, p0.neighborhood) && (a.g(this.building, p0.building) && (a.g(this.province, p0.province) && (a.g(this.countryCode, p0.countryCode) && (a.g(this.country, p0.country) && (a.g(this.businessAreas, p0.businessAreas) && (a.g(this.city, p0.city) && (a.g(this.citycode, p0.citycode) && (a.g(this.district, p0.district) && (a.g(this.adcode, p0.adcode) && (a.g(this.streetNumber, p0.streetNumber) && (a.g(this.township, p0.township) && a.g(this.towncode, p0.towncode))))))))))))))) {
          return true;
       }
       return false;
    }
    public final String getAdcode(){
       return this.adcode;
    }
    public final String getBuilding(){
       return this.building;
    }
    public final List getBusinessAreas(){
       return this.businessAreas;
    }
    public final String getCity(){
       return this.city;
    }
    public final String getCitycode(){
       return this.citycode;
    }
    public final String getCountry(){
       return this.country;
    }
    public final String getCountryCode(){
       return this.countryCode;
    }
    public final String getDistrict(){
       return this.district;
    }
    public final String getNeighborhood(){
       return this.neighborhood;
    }
    public final String getProvince(){
       return this.province;
    }
    public final KsStreetNumber getStreetNumber(){
       return this.streetNumber;
    }
    public final String getTowncode(){
       return this.towncode;
    }
    public final String getTownship(){
       return this.township;
    }
    public int hashCode(){
       KsAddressComponent obj = PatchProxy.apply(null, this, KsAddressComponent.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.neighborhood;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       KsAddressComponent tbuilding = this.building;
       int i2 = (tbuilding != null)? tbuilding.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuilding = this.province;
       i2 = (tbuilding != null)? tbuilding.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuilding = this.countryCode;
       i2 = (tbuilding != null)? tbuilding.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuilding = this.country;
       i2 = (tbuilding != null)? tbuilding.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuilding = this.businessAreas;
       i2 = (tbuilding != null)? tbuilding.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuilding = this.city;
       i2 = (tbuilding != null)? tbuilding.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuilding = this.citycode;
       i2 = (tbuilding != null)? tbuilding.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuilding = this.district;
       i2 = (tbuilding != null)? tbuilding.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuilding = this.adcode;
       i2 = (tbuilding != null)? tbuilding.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuilding = this.streetNumber;
       i2 = (tbuilding != null)? tbuilding.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuilding = this.township;
       i2 = (tbuilding != null)? tbuilding.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbuilding = this.towncode;
       if (tbuilding != null) {
          i = tbuilding.hashCode();
       }
       return (i1 + i);
    }
    public final void setAdcode(String p0){
       this.adcode = p0;
    }
    public final void setBuilding(String p0){
       this.building = p0;
    }
    public final void setBusinessAreas(List p0){
       this.businessAreas = p0;
    }
    public final void setCity(String p0){
       this.city = p0;
    }
    public final void setCitycode(String p0){
       this.citycode = p0;
    }
    public final void setCountry(String p0){
       this.country = p0;
    }
    public final void setCountryCode(String p0){
       this.countryCode = p0;
    }
    public final void setDistrict(String p0){
       this.district = p0;
    }
    public final void setNeighborhood(String p0){
       this.neighborhood = p0;
    }
    public final void setProvince(String p0){
       this.province = p0;
    }
    public final void setStreetNumber(KsStreetNumber p0){
       this.streetNumber = p0;
    }
    public final void setTowncode(String p0){
       this.towncode = p0;
    }
    public final void setTownship(String p0){
       this.township = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KsAddressComponent.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KsAddressComponent\(neighborhood="+this.neighborhood+", building="+this.building+", province="+this.province+", countryCode="+this.countryCode+", country="+this.country+", businessAreas="+this.businessAreas+", city="+this.city+", citycode="+this.citycode+", district="+this.district+", adcode="+this.adcode+", streetNumber="+this.streetNumber+", township="+this.township+", towncode="+this.towncode+"\)";
    }
}
