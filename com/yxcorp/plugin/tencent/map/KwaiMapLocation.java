package com.yxcorp.plugin.tencent.map.KwaiMapLocation;
import java.io.Serializable;
import hyb.d;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import sid.g;
import java.util.ArrayList;
import java.lang.Object;
import sid.e;
import java.lang.Iterable;
import java.text.DecimalFormat;
import java.lang.StringBuilder;
import org.json.JSONObject;
import hyb.b;
import hyb.c;
import org.json.JSONArray;
import java.io.IOException;
import java.lang.Throwable;

public class KwaiMapLocation extends d implements Serializable	// class@000946
{
    public static final long serialVersionUID = 0x66ba8a3125d0c05c;

    public void KwaiMapLocation(double p0,double p1){
       super(p0, p1);
    }
    public void KwaiMapLocation(double p0,double p1,String p2){
       super(p0, p1, p2);
    }
    public static String a(String p0){
       if (TextUtils.isEmpty(p0)) {
          p0 = "NULL";
       }
       return p0;
    }
    public static KwaiMapLocation from(g p0){
       if (TextUtils.isEmpty(p0.getAddress()) || TextUtils.isEmpty(p0.getProvince())) {
          return new KwaiMapLocation(p0.getLatitude(), p0.getLongitude());
       }
       String province = p0.getProvince();
       String city = p0.getCity();
       String str = "NULL";
       if (!TextUtils.isEmpty(city)) {
          String str1 = "北京";
          if (!province.contains(str1) || !city.contains(str1)) {
             str1 = "上海";
             if (!province.contains(str1) || !city.contains(str1)) {
                str1 = "天津";
                if (!province.contains(str1) || !city.contains(str1)) {
                   str1 = "重庆";
                   if (!province.contains(str1) || (!city.contains(str1) && !city.equalsIgnoreCase("unknown"))) {
                   label_006a :
                      ArrayList uArrayList = new ArrayList(6);
                      uArrayList.add("中国");
                      uArrayList.add(province);
                      uArrayList.add(city);
                      uArrayList.add(KwaiMapLocation.a(p0.getDistrict()));
                      if (!TextUtils.isEmpty(p0.getStreet())) {
                         uArrayList.add(p0.getStreet());
                      }
                      if (!TextUtils.isEmpty(p0.getStreetNo())) {
                         uArrayList.add(p0.getStreetNo());
                      }
                      KwaiMapLocation kwaiMapLocat = new KwaiMapLocation(p0.getLatitude(), p0.getLongitude(), TextUtils.join("|", uArrayList));
                      v4.mCity = city;
                      v4.mCounty = KwaiMapLocation.a(p0.getDistrict());
                      v4.mCountry = "中国";
                      v4.mProvince = province;
                      v4.mStreet = p0.getStreet();
                      return v4;
                   }
                }
             }
          }
       }
       city = str;
       goto label_006a ;
    }
    public String getLatitudeString(){
       try{
          return d.sCoordinateFormat.format(this.getLatitude());
       }catch(java.lang.Exception e0){
          return "0";
       }
    }
    public String getLongitudeString(){
       try{
          return d.sCoordinateFormat.format(this.getLongitude());
       }catch(java.lang.Exception e0){
          return "0";
       }
    }
    public boolean isSameLocation(KwaiMapLocation p0){
       boolean b = (p0 != null && (!this.getLatitude() - p0.getLatitude() && !this.getLongitude() - p0.getLongitude()))? true: false;
       return b;
    }
    public String toString(){
       return "KwaiMapLocation{mAddress=\'"+this.mAddress+'''+", mLatitude="+this.mLatitude+", mLongitude="+this.mLongitude+", mCountry=\'"+this.mCountry+'''+", mProvince=\'"+this.mProvince+'''+", mCity=\'"+this.mCity+'''+", mCounty=\'"+this.mCounty+'''+", mStreet=\'"+this.mStreet+'''+'}';
    }
    public void updateAddress(){
       String str1;
       d uod = this;
       if (!TextUtils.isEmpty(uod.mAddress)) {
          return;
       }
       Object[] objArray = new Object[]{this.getLatitudeString(),this.getLongitudeString()};
       int i = 0;
       String str = String.format("http://maps.googleapis.com/maps/api/geocode/json?latlng=%s,%s&sensor=true&language=zh_cn", objArray);
       int i1 = 10;
       try{
          ArrayList uArrayList = new ArrayList(i1);
          JSONObject jSONObject = new JSONObject(c.a().c(str));
          str = jSONObject.optString("status");
          if (!("OK").equalsIgnoreCase(str)) {
             throw new IOException("Address API returns "+str);
          }
          JSONArray jSONArray = jSONObject.getJSONArray("results");
          if (jSONArray.length() <= 0) {
             throw new IOException("Address API returns empty");
          }
          jSONArray = jSONArray.getJSONObject(i).getJSONArray("address_components");
          jSONObject = 12;
          String[] stringArray = new String[]{"country","political","route","premise","subpremise","natural_feature","airport","park","point_of_interest","street_address","street_number","intersection"};
          int i2 = jSONArray.length() - 1;
          while (i2 >= 0) {
             JSONObject jSONObject1 = jSONArray.getJSONObject(i2);
             if (jSONObject1 != null) {
                JSONArray jSONArray1 = jSONObject1.getJSONArray("types");
                int i3 = 0;
                while (true) {
                   if (i3 < jSONArray1.length()) {
                      String str2 = jSONArray1.getString(i3);
                      int i4 = 0;
                      while (true) {
                         if (i4 < jSONObject) {
                            if ((stringArray[i4]).equals(str2)) {
                               str1 = 1;
                            }else {
                               i4 = i4 + 1;
                            }
                         }else {
                            i3 = i3 + 1;
                         }
                      }
                   }
                }
                if (str1) {
                   uArrayList.add(KwaiMapLocation.a(jSONObject1.getString("long_name")));
                }
                i2 = i2 - 1;
             }
             str1 = null;
             goto label_00ab ;
          }
          if (uArrayList.isEmpty()) {
          label_00de :
             throw new IOException("Address API returns empty");
          }
          while (uArrayList.size() < 4) {
             uArrayList.add("NULL");
          }
          _monitor_enter(this);
          uod.mAddress = TextUtils.join("|", uArrayList);
          _monitor_exit(this);
          return;
       }catch(org.json.JSONException e0){
          throw new IOException(e0);
       }
    }
}
