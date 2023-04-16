package com.loc.fg;
import java.lang.Object;
import java.lang.StringBuilder;
import com.amap.api.location.AMapLocationClientOption;
import com.loc.eo;
import java.lang.String;
import com.amap.api.location.AMapLocation;
import com.loc.ei;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import com.loc.fq;
import android.location.Location;
import android.util.Base64;
import com.loc.fj;
import java.lang.Double;
import java.lang.Throwable;
import com.loc.fo;
import org.json.JSONObject;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONArray;
import android.content.Context;
import com.loc.bm;
import java.lang.StringBuffer;
import com.loc.l;
import java.util.Map;
import java.util.List;
import android.os.Bundle;
import com.amap.api.location.AMapLocationClientOption$GeoLanguage;

public final class fg	// class@00142b
{
    public StringBuilder a;
    public AMapLocationClientOption b;

    public void fg(){
       super();
       this.a = "";
       this.b = new AMapLocationClientOption();
    }
    public static void a(eo p0,short p1){
       if (!("-1").equals(p0.d())) {
          if (p1 == -1) {
             p1 = 0;
          }else if(!p1){
             p1 = -1;
          }
          p0.setConScenario(p1);
          return;
       }else if(p1 == 101){
          p1 = 100;
       }
       p0.setConScenario(p1);
       return;
    }
    public static String b(String p0){
       if (("[]").equals(p0)) {
          p0 = "";
       }
       return p0;
    }
    public final eo a(eo p0,byte[] p1,ei p2){
       fg a;
       byte[] uobyteArray;
       String str10;
       ByteBuffer uByteBuffer1;
       fg uofg = this;
       AMapLocation uAMapLocatio = p0;
       ei uoei = p2;
       int i = 5;
       String str = "";
       if (p1 == null) {
          uAMapLocatio.setErrorCode(i);
          uoei.f("#0504");
          StringBuilder str1 = uofg.a+"binaryResult is null#0504";
          uAMapLocatio.setLocationDetail(uofg.a);
          a = uofg.a;
          a.delete(0, a.length());
          return uAMapLocatio;
       }else {
          ByteBuffer uByteBuffer = ByteBuffer.wrap(p1);
          if (!uByteBuffer.get()) {
             uAMapLocatio.b(String.valueOf(uByteBuffer.getShort()));
             uByteBuffer.clear();
             uByteBuffer.clear();
             return uAMapLocatio;
          }else {
             double d = 1000000.00f;
             uAMapLocatio.setLongitude(fq.a(((double)uByteBuffer.getInt() / d)));
             uAMapLocatio.setLatitude(fq.a(((double)uByteBuffer.getInt() / d)));
             uAMapLocatio.setAccuracy((float)uByteBuffer.getShort());
             uAMapLocatio.c(String.valueOf(uByteBuffer.get()));
             uAMapLocatio.d(String.valueOf(uByteBuffer.get()));
             String str2 = "UTF-8";
             if (uByteBuffer.get() == 1) {
                uobyteArray = new byte[(uByteBuffer.get() & 0x00ff)];
                uByteBuffer.get(uobyteArray);
                uAMapLocatio.setCountry(new String(uobyteArray, str2));
                uobyteArray = new byte[(uByteBuffer.get() & 0x00ff)];
                uByteBuffer.get(uobyteArray);
                String str3 = new String(uobyteArray, str2);
                uAMapLocatio.setProvince(str3);
                String str4 = str3;
                uobyteArray = new byte[(uByteBuffer.get() & 0x00ff)];
                uByteBuffer.get(uobyteArray);
                str3 = new String(uobyteArray, str2);
                uAMapLocatio.setCity(str3);
                String str5 = str3;
                uobyteArray = new byte[(uByteBuffer.get() & 0x00ff)];
                uByteBuffer.get(uobyteArray);
                str3 = new String(uobyteArray, str2);
                uAMapLocatio.setDistrict(str3);
                String str6 = str3;
                uobyteArray = new byte[(uByteBuffer.get() & 0x00ff)];
                uByteBuffer.get(uobyteArray);
                str3 = new String(uobyteArray, str2);
                uAMapLocatio.setStreet(str3);
                uAMapLocatio.setRoad(str3);
                String str7 = str3;
                uobyteArray = new byte[(uByteBuffer.get() & 0x00ff)];
                uByteBuffer.get(uobyteArray);
                str3 = new String(uobyteArray, str2);
                uAMapLocatio.setNumber(str3);
                String str8 = str3;
                uobyteArray = new byte[(uByteBuffer.get() & 0x00ff)];
                uByteBuffer.get(uobyteArray);
                str3 = new String(uobyteArray, str2);
                uAMapLocatio.setPoiName(str3);
                String str9 = str3;
                uobyteArray = new byte[(uByteBuffer.get() & 0x00ff)];
                uByteBuffer.get(uobyteArray);
                uAMapLocatio.setAoiName(new String(uobyteArray, str2));
                uobyteArray = new byte[(uByteBuffer.get() & 0x00ff)];
                uByteBuffer.get(uobyteArray);
                str3 = new String(uobyteArray, str2);
                uAMapLocatio.setAdCode(str3);
                uobyteArray = new byte[(uByteBuffer.get() & 0x00ff)];
                uByteBuffer.get(uobyteArray);
                uAMapLocatio.setCityCode(new String(uobyteArray, str2));
                str10 = str2;
                uByteBuffer1 = uByteBuffer;
                this.a(p0, str4, str5, str6, str7, str8, str9, str3);
             }else {
                str10 = str2;
                uByteBuffer1 = uByteBuffer;
                i = 1;
             }
             uobyteArray = new byte[(uByteBuffer1.get() & 0x00ff)];
             ByteBuffer uByteBuffer2 = uByteBuffer1;
             uByteBuffer2.get(uobyteArray);
             if (uByteBuffer2.get() == 1) {
                uByteBuffer2.getInt();
                uByteBuffer2.getInt();
                uByteBuffer2.getShort();
             }
             if (uByteBuffer2.get() == 1) {
                uobyteArray = new byte[(uByteBuffer2.get() & 0x00ff)];
                uByteBuffer2.get(uobyteArray);
                uAMapLocatio.setBuildingId(new String(uobyteArray, str10));
                uobyteArray = new byte[(uByteBuffer2.get() & 0x00ff)];
                uByteBuffer2.get(uobyteArray);
                uAMapLocatio.setFloor(new String(uobyteArray, str10));
             }
             if (uByteBuffer2.get() == 1) {
                uByteBuffer2.get();
                uByteBuffer2.getInt();
                uByteBuffer2.get();
             }
             if (uByteBuffer2.get() == 1) {
                uAMapLocatio.setTime(uByteBuffer2.getLong());
             }
             short uobyteArray1 = uByteBuffer2.getShort();
             if (uobyteArray1 > 0) {
                byte[] uobyteArray2 = new byte[uobyteArray1];
                uByteBuffer2.get(uobyteArray2);
                if (uobyteArray1 > 0) {
                   uAMapLocatio.a(new String(Base64.decode(uobyteArray2, 0), str10));
                }
             }
             uobyteArray1 = uByteBuffer2.getShort();
             if (uobyteArray1 > 0) {
                uobyteArray = new byte[uobyteArray1];
                uByteBuffer2.get(uobyteArray);
             }
             if (Double.valueOf(fj.a).doubleValue() - 0x4014666666666666 >= 0) {
                fg.a(uAMapLocatio, uByteBuffer2.getShort());
                uAMapLocatio.a(uByteBuffer2.get());
             }
             uByteBuffer2.clear();
             if ((uofg.a).length() > 0) {
                a = uofg.a;
                a.delete(0, a.length());
             }
             return uAMapLocatio;
          }
       }
    }
    public final eo a(String p0){
       String str9;
       eo uoeo = new eo("");
       JSONObject jSONObject = new JSONObject(p0).optJSONObject("regeocode");
       JSONObject jSONObject1 = jSONObject.optJSONObject("addressComponent");
       uoeo.setCountry(fg.b(jSONObject1.optString("country")));
       String str = fg.b(jSONObject1.optString("province"));
       uoeo.setProvince(str);
       String str1 = fg.b(jSONObject1.optString("citycode"));
       uoeo.setCityCode(str1);
       String str2 = jSONObject1.optString("city");
       if (!str1.endsWith("010") && (!str1.endsWith("021") && (str1.endsWith("022") || str1.endsWith("023")))) {
          if (str != null && str.length() > 0) {
             uoeo.setCity(str);
             str2 = str;
          }
       }else {
          str2 = fg.b(str2);
          uoeo.setCity(str2);
       }
       if (TextUtils.isEmpty(str2)) {
          uoeo.setCity(str);
          str2 = str;
       }
       String str3 = fg.b(jSONObject1.optString("district"));
       uoeo.setDistrict(str3);
       String str4 = fg.b(jSONObject1.optString("adcode"));
       uoeo.setAdCode(str4);
       jSONObject1 = jSONObject1.optJSONObject("streetNumber");
       String str5 = fg.b(jSONObject1.optString("street"));
       uoeo.setStreet(str5);
       uoeo.setRoad(str5);
       String str6 = fg.b(jSONObject1.optString("number"));
       uoeo.setNumber(str6);
       JSONArray jSONArray = jSONObject.optJSONArray("pois");
       String str7 = "name";
       if (jSONArray.length() > 0) {
          String str8 = fg.b(jSONArray.getJSONObject(0).optString(str7));
          uoeo.setPoiName(str8);
          str9 = str8;
       }else {
          str9 = 0;
       }
       JSONArray jSONArray1 = jSONObject.optJSONArray("aois");
       if (jSONArray1.length() > 0) {
          uoeo.setAoiName(fg.b(jSONArray1.getJSONObject(0).optString(str7)));
       }
       this.a(uoeo, str, str2, str3, str5, str6, str9, str4);
       return uoeo;
    }
    public final eo a(String p0,Context p1,bm p2,ei p3){
       String str = "#0702";
       String str1 = "status";
       eo uoeo = new eo("");
       uoeo.setErrorCode(7);
       StringBuffer str2 = "#SHA1AndPackage#"+l.e(p1);
       String str3 = p2.b.get("gsid").get(0);
       if (!TextUtils.isEmpty(str3)) {
          str2 = str2+"#gsid#"+str3;
       }
       bm c = p2.c;
       if (!TextUtils.isEmpty(c)) {
          str2 = str2+("#csid#").concat(String.valueOf(c));
       }
       JSONObject jSONObject = new JSONObject(p0);
       if (!jSONObject.has(str1) || !jSONObject.has("info")) {
          p3.f(str);
          this.a+"json is error:"+p0+str2+str;
       }
       str = jSONObject.getString("info");
       str3 = jSONObject.getString("infocode");
       if (("0").equals(jSONObject.getString(str1))) {
          p3.f("#0701");
          p0 = this.a+"auth fail:"+str+str2+"#0701";
          fo.a(p2.d, str3, str);
       }
       uoeo.setLocationDetail(this.a);
       if ((this.a).length() > 0) {
          fg ta = this.a;
          ta.delete(0, ta.length());
       }
       return uoeo;
    }
    public final void a(AMapLocationClientOption p0){
       if (p0 == null) {
          this.b = new AMapLocationClientOption();
          return;
       }else {
          this.b = p0;
          return;
       }
    }
    public final void a(eo p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7){
       StringBuilder str = "";
       if (!TextUtils.isEmpty(p1)) {
          str = str+p1+" ";
       }
       if (!TextUtils.isEmpty(p2)) {
          this.a(p1, p2, str);
       }
       if (!TextUtils.isEmpty(p3)) {
          str = str+p3+" ";
       }
       if (!TextUtils.isEmpty(p4)) {
          str = str+p4+" ";
       }
       if (!TextUtils.isEmpty(p5)) {
          str = str+p5+" ";
       }
       if (!TextUtils.isEmpty(p6)) {
          this.a(p7, p6, str, p0);
       }
       Bundle uBundle = new Bundle();
       uBundle.putString("citycode", p0.getCityCode());
       uBundle.putString("desc", str);
       uBundle.putString("adcode", p0.getAdCode());
       p0.setExtras(uBundle);
       p0.g(str);
       uBundle = p0.getAdCode();
       uBundle = (uBundle != null && ((uBundle.trim()).length() > 0 && this.b.getGeoLanguage() != AMapLocationClientOption$GeoLanguage.EN))? (str).replace(" ", ""): str;
       p0.setAddress(uBundle);
       return;
    }
    public final void a(String p0,String p1,StringBuilder p2){
       if (this.b.getGeoLanguage() == AMapLocationClientOption$GeoLanguage.EN) {
          if (!p1.equals(p0)) {
             p2+p1+" ";
             return;
          }
       }else if(!p0.contains("市") || !p0.equals(p1)){
          p2+p1+" ";
       }
       return;
    }
    public final void a(String p0,String p1,StringBuilder p2,eo p3){
       if (!TextUtils.isEmpty(p0) && this.b.getGeoLanguage() != AMapLocationClientOption$GeoLanguage.EN) {
          p2 = p2+"靠近"+p1+" ";
          p0 = "在"+p1+"附近";
       }else {
          p2+("Near ").concat(String.valueOf(p1));
          p0 = ("Near ").concat(String.valueOf(p1));
       }
       p3.setDescription(p0);
       return;
    }
}
