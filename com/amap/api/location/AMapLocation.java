package com.amap.api.location.AMapLocation;
import java.lang.Cloneable;
import android.location.Location;
import com.amap.api.location.AMapLocation$1;
import com.amap.api.location.AMapLocationQualityReport;
import java.lang.String;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Throwable;
import com.loc.fj;
import java.lang.StringBuilder;
import com.loc.fq;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import org.json.JSONObject;
import java.lang.StringBuffer;
import android.os.Parcel;

public class AMapLocation extends Location implements Cloneable	// class@000ec7
{
    public int A;
    public String B;
    public int C;
    public boolean D;
    public String E;
    public boolean F;
    public String G;
    public int H;
    public int I;
    public String a;
    public String b;
    public AMapLocationQualityReport c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public boolean o;
    public int p;
    public String q;
    public String r;
    public int s;
    public double t;
    public double u;
    public double v;
    public float w;
    public float x;
    public Bundle y;
    public String z;
    public static final Parcelable$Creator CREATOR;

    static {
       AMapLocation.CREATOR = new AMapLocation$1();
    }
    public void AMapLocation(Location p0){
       super(p0);
       this.d = "";
       this.e = "";
       this.f = "";
       this.g = "";
       this.h = "";
       this.i = "";
       this.j = "";
       this.k = "";
       this.l = "";
       this.m = "";
       this.n = "";
       this.o = true;
       this.p = 0;
       this.q = "success";
       this.r = "";
       this.s = 0;
       this.t = 0;
       this.u = 0;
       this.v = 0;
       this.w = 0;
       this.x = 0;
       Bundle uBundle = null;
       this.y = uBundle;
       this.A = 0;
       this.B = "";
       this.C = -1;
       this.D = false;
       this.E = "";
       this.F = false;
       this.a = "";
       this.b = "";
       this.c = new AMapLocationQualityReport();
       this.G = "GCJ02";
       this.H = 1;
       this.t = p0.getLatitude();
       this.u = p0.getLongitude();
       this.v = p0.getAltitude();
       this.x = p0.getBearing();
       this.w = p0.getSpeed();
       this.z = p0.getProvider();
       if (p0.getExtras() == null) {
       }else {
          uBundle = new Bundle(p0.getExtras());
       }
       this.y = uBundle;
       return;
    }
    public void AMapLocation(String p0){
       super(p0);
       this.d = "";
       this.e = "";
       this.f = "";
       this.g = "";
       this.h = "";
       this.i = "";
       this.j = "";
       this.k = "";
       this.l = "";
       this.m = "";
       this.n = "";
       this.o = true;
       this.p = 0;
       this.q = "success";
       this.r = "";
       this.s = 0;
       this.t = 0;
       this.u = 0;
       this.v = 0;
       this.w = 0;
       this.x = 0;
       this.y = null;
       this.A = 0;
       this.B = "";
       this.C = -1;
       this.D = false;
       this.E = "";
       this.F = false;
       this.a = "";
       this.b = "";
       this.c = new AMapLocationQualityReport();
       this.G = "GCJ02";
       this.H = 1;
       this.z = p0;
    }
    public static double a(AMapLocation p0,double p1){
       p0.t = p1;
       return p1;
    }
    public static int a(AMapLocation p0,int p1){
       p0.p = p1;
       return p1;
    }
    public static String a(AMapLocation p0,String p1){
       p0.h = p1;
       return p1;
    }
    public static boolean a(AMapLocation p0,boolean p1){
       p0.F = p1;
       return p1;
    }
    public static double b(AMapLocation p0,double p1){
       p0.u = p1;
       return p1;
    }
    public static int b(AMapLocation p0,int p1){
       p0.s = p1;
       return p1;
    }
    public static String b(AMapLocation p0,String p1){
       p0.i = p1;
       return p1;
    }
    public static boolean b(AMapLocation p0,boolean p1){
       p0.o = p1;
       return p1;
    }
    public static int c(AMapLocation p0,int p1){
       p0.A = p1;
       return p1;
    }
    public static String c(AMapLocation p0,String p1){
       p0.B = p1;
       return p1;
    }
    public static boolean c(AMapLocation p0,boolean p1){
       p0.D = p1;
       return p1;
    }
    public static int d(AMapLocation p0,int p1){
       p0.C = p1;
       return p1;
    }
    public static String d(AMapLocation p0,String p1){
       p0.e = p1;
       return p1;
    }
    public static int e(AMapLocation p0,int p1){
       p0.H = p1;
       return p1;
    }
    public static String e(AMapLocation p0,String p1){
       p0.g = p1;
       return p1;
    }
    public static int f(AMapLocation p0,int p1){
       p0.I = p1;
       return p1;
    }
    public static String f(AMapLocation p0,String p1){
       p0.k = p1;
       return p1;
    }
    public static String g(AMapLocation p0,String p1){
       p0.f = p1;
       return p1;
    }
    public static String h(AMapLocation p0,String p1){
       p0.q = p1;
       return p1;
    }
    public static String i(AMapLocation p0,String p1){
       p0.r = p1;
       return p1;
    }
    public static String j(AMapLocation p0,String p1){
       p0.n = p1;
       return p1;
    }
    public static String k(AMapLocation p0,String p1){
       p0.j = p1;
       return p1;
    }
    public static String l(AMapLocation p0,String p1){
       p0.d = p1;
       return p1;
    }
    public static String m(AMapLocation p0,String p1){
       p0.l = p1;
       return p1;
    }
    public static String n(AMapLocation p0,String p1){
       p0.m = p1;
       return p1;
    }
    public static String o(AMapLocation p0,String p1){
       p0.E = p1;
       return p1;
    }
    public static String p(AMapLocation p0,String p1){
       p0.G = p1;
       return p1;
    }
    public AMapLocation clone(){
       super.clone();
       AMapLocation uAMapLocatio = new AMapLocation(this);
       uAMapLocatio.setLatitude(this.t);
       uAMapLocatio.setLongitude(this.u);
       uAMapLocatio.setAdCode(this.h);
       uAMapLocatio.setAddress(this.i);
       uAMapLocatio.setAoiName(this.B);
       uAMapLocatio.setBuildingId(this.a);
       uAMapLocatio.setCity(this.e);
       uAMapLocatio.setCityCode(this.g);
       uAMapLocatio.setCountry(this.k);
       uAMapLocatio.setDistrict(this.f);
       uAMapLocatio.setErrorCode(this.p);
       uAMapLocatio.setErrorInfo(this.q);
       uAMapLocatio.setFloor(this.b);
       uAMapLocatio.setFixLastLocation(this.F);
       uAMapLocatio.setOffset(this.o);
       uAMapLocatio.setLocationDetail(this.r);
       uAMapLocatio.setLocationType(this.s);
       uAMapLocatio.setMock(this.D);
       uAMapLocatio.setNumber(this.n);
       uAMapLocatio.setPoiName(this.j);
       uAMapLocatio.setProvince(this.d);
       uAMapLocatio.setRoad(this.l);
       uAMapLocatio.setSatellites(this.A);
       uAMapLocatio.setGpsAccuracyStatus(this.C);
       uAMapLocatio.setStreet(this.m);
       uAMapLocatio.setDescription(this.E);
       uAMapLocatio.setExtras(this.getExtras());
       AMapLocation tc = this.c;
       if (tc != null) {
          uAMapLocatio.setLocationQualityReport(tc.clone());
       }
       uAMapLocatio.setCoordType(this.G);
       uAMapLocatio.setTrustedLevel(this.H);
       uAMapLocatio.setConScenario(this.I);
       return uAMapLocatio;
    }
    public Object clone(){
       return this.clone();
    }
    public int describeContents(){
       return 0;
    }
    public float getAccuracy(){
       return super.getAccuracy();
    }
    public String getAdCode(){
       return this.h;
    }
    public String getAddress(){
       return this.i;
    }
    public double getAltitude(){
       return this.v;
    }
    public String getAoiName(){
       return this.B;
    }
    public float getBearing(){
       return this.x;
    }
    public String getBuildingId(){
       return this.a;
    }
    public String getCity(){
       return this.e;
    }
    public String getCityCode(){
       return this.g;
    }
    public int getConScenario(){
       return this.I;
    }
    public String getCoordType(){
       return this.G;
    }
    public String getCountry(){
       return this.k;
    }
    public String getDescription(){
       return this.E;
    }
    public String getDistrict(){
       return this.f;
    }
    public int getErrorCode(){
       return this.p;
    }
    public String getErrorInfo(){
       StringBuilder str = this.q;
       if (this.p != null) {
          str = str+" 请到http://lbs.amap.com/api/android-location-sdk/guide/utilities/errorcode/查看错误码说明"+",错误详细信息:"+this.r;
       }
       return str;
    }
    public Bundle getExtras(){
       return this.y;
    }
    public String getFloor(){
       return this.b;
    }
    public int getGpsAccuracyStatus(){
       return this.C;
    }
    public double getLatitude(){
       return this.t;
    }
    public String getLocationDetail(){
       return this.r;
    }
    public AMapLocationQualityReport getLocationQualityReport(){
       return this.c;
    }
    public int getLocationType(){
       return this.s;
    }
    public double getLongitude(){
       return this.u;
    }
    public String getPoiName(){
       return this.j;
    }
    public String getProvider(){
       return this.z;
    }
    public String getProvince(){
       return this.d;
    }
    public String getRoad(){
       return this.l;
    }
    public int getSatellites(){
       return this.A;
    }
    public float getSpeed(){
       return this.w;
    }
    public String getStreet(){
       return this.m;
    }
    public String getStreetNum(){
       return this.n;
    }
    public int getTrustedLevel(){
       return this.H;
    }
    public boolean isFixLastLocation(){
       return this.F;
    }
    public boolean isMock(){
       return this.D;
    }
    public boolean isOffset(){
       return this.o;
    }
    public void setAdCode(String p0){
       this.h = p0;
    }
    public void setAddress(String p0){
       this.i = p0;
    }
    public void setAltitude(double p0){
       super.setAltitude(p0);
       this.v = p0;
    }
    public void setAoiName(String p0){
       this.B = p0;
    }
    public void setBearing(float p0){
       super.setBearing(p0);
       while (p0 < 0) {
          p0 = p0 + 360.00f;
       }
       while (p0 - 360.00f >= 0) {
          p0 = p0 - 360.00f;
       }
       this.x = p0;
       return;
    }
    public void setBuildingId(String p0){
       this.a = p0;
    }
    public void setCity(String p0){
       this.e = p0;
    }
    public void setCityCode(String p0){
       this.g = p0;
    }
    public void setConScenario(int p0){
       this.I = p0;
    }
    public void setCoordType(String p0){
       this.G = p0;
    }
    public void setCountry(String p0){
       this.k = p0;
    }
    public void setDescription(String p0){
       this.E = p0;
    }
    public void setDistrict(String p0){
       this.f = p0;
    }
    public void setErrorCode(int p0){
       if (this.p != null) {
          return;
       }
       this.q = fq.a(p0);
       this.p = p0;
       return;
    }
    public void setErrorInfo(String p0){
       this.q = p0;
    }
    public void setExtras(Bundle p0){
       super.setExtras(p0);
       p0 = (p0 == null)? null: new Bundle(p0);
       this.y = p0;
       return;
    }
    public void setFixLastLocation(boolean p0){
       this.F = p0;
    }
    public void setFloor(String p0){
       if (!TextUtils.isEmpty(p0)) {
          p0 = p0.replace("F", "");
          Integer.parseInt(p0);
       }
       this.b = p0;
       return;
    }
    public void setGpsAccuracyStatus(int p0){
       this.C = p0;
    }
    public void setLatitude(double p0){
       this.t = p0;
    }
    public void setLocationDetail(String p0){
       this.r = p0;
    }
    public void setLocationQualityReport(AMapLocationQualityReport p0){
       if (p0 == null) {
          return;
       }
       this.c = p0;
       return;
    }
    public void setLocationType(int p0){
       this.s = p0;
    }
    public void setLongitude(double p0){
       this.u = p0;
    }
    public void setMock(boolean p0){
       this.D = p0;
    }
    public void setNumber(String p0){
       this.n = p0;
    }
    public void setOffset(boolean p0){
       this.o = p0;
    }
    public void setPoiName(String p0){
       this.j = p0;
    }
    public void setProvider(String p0){
       super.setProvider(p0);
       this.z = p0;
    }
    public void setProvince(String p0){
       this.d = p0;
    }
    public void setRoad(String p0){
       this.l = p0;
    }
    public void setSatellites(int p0){
       this.A = p0;
    }
    public void setSpeed(float p0){
       super.setSpeed(p0);
       this.w = p0;
    }
    public void setStreet(String p0){
       this.m = p0;
    }
    public void setTrustedLevel(int p0){
       this.H = p0;
    }
    public JSONObject toJson(int p0){
       JSONObject jSONObject = new JSONObject();
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 3) {
             label_00ff :
                return jSONObject;
             }else {
             label_00bb :
                jSONObject.put("provider", this.getProvider());
                jSONObject.put("lon", this.getLongitude());
                jSONObject.put("lat", this.getLatitude());
                jSONObject.put("accuracy", (double)this.getAccuracy());
                jSONObject.put("isOffset", this.o);
                jSONObject.put("isFixLastLocation", this.F);
                jSONObject.put("coordType", this.G);
                goto label_00ff ;
             }
          }
       }else {
          jSONObject.put("altitude", this.getAltitude());
          jSONObject.put("speed", (double)this.getSpeed());
          jSONObject.put("bearing", (double)this.getBearing());
          jSONObject.put("citycode", this.g);
          jSONObject.put("adcode", this.h);
          jSONObject.put("country", this.k);
          jSONObject.put("province", this.d);
          jSONObject.put("city", this.e);
          jSONObject.put("district", this.f);
          jSONObject.put("road", this.l);
          jSONObject.put("street", this.m);
          jSONObject.put("number", this.n);
          jSONObject.put("poiname", this.j);
          jSONObject.put("errorCode", this.p);
          jSONObject.put("errorInfo", this.q);
          jSONObject.put("locationType", this.s);
          jSONObject.put("locationDetail", this.r);
          jSONObject.put("aoiname", this.B);
          jSONObject.put("address", this.i);
          jSONObject.put("poiid", this.a);
          jSONObject.put("floor", this.b);
          jSONObject.put("description", this.E);
       }
       jSONObject.put("time", this.getTime());
       goto label_00bb ;
    }
    public String toStr(){
       return this.toStr(1);
    }
    public String toStr(int p0){
       JSONObject jSONObject = this.toJson(p0);
       if (jSONObject == null) {
          return null;
       }
       return jSONObject.toString();
    }
    public String toString(){
       return "latitude="+this.t+"#"+"longitude="+this.u+"#"+"province="+this.d+"#"+"coordType="+this.G+"#"+"city="+this.e+"#"+"district="+this.f+"#"+"cityCode="+this.g+"#"+"adCode="+this.h+"#"+"address="+this.i+"#"+"country="+this.k+"#"+"road="+this.l+"#"+"poiName="+this.j+"#"+"street="+this.m+"#"+"streetNum="+this.n+"#"+"aoiName="+this.B+"#"+"poiid="+this.a+"#"+"floor="+this.b+"#"+"errorCode="+this.p+"#"+"errorInfo="+this.q+"#"+"locationDetail="+this.r+"#"+"description="+this.E+"#"+"locationType="+this.s+"#"+"conScenario="+this.I;
    }
    public void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeString(this.h);
       p0.writeString(this.i);
       p0.writeString(this.B);
       p0.writeString(this.a);
       p0.writeString(this.e);
       p0.writeString(this.g);
       p0.writeString(this.k);
       p0.writeString(this.f);
       p0.writeInt(this.p);
       p0.writeString(this.q);
       p0.writeString(this.b);
       int i = 1;
       p1 = (this.F != null)? 1: 0;
       p0.writeInt(p1);
       p1 = (this.o != null)? 1: 0;
       p0.writeInt(p1);
       p0.writeDouble(this.t);
       p0.writeString(this.r);
       p0.writeInt(this.s);
       p0.writeDouble(this.u);
       if (this.D == null) {
          i = 0;
       }
       p0.writeInt(i);
       p0.writeString(this.n);
       p0.writeString(this.j);
       p0.writeString(this.d);
       p0.writeString(this.l);
       p0.writeInt(this.A);
       p0.writeInt(this.C);
       p0.writeString(this.m);
       p0.writeString(this.E);
       p0.writeString(this.G);
       p0.writeInt(this.H);
       p0.writeInt(this.I);
       return;
    }
}
