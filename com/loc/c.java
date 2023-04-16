package com.loc.c;
import java.lang.Object;
import com.amap.api.location.DPoint;
import com.loc.fq;
import java.lang.String;
import java.util.List;
import android.os.Bundle;
import org.json.JSONObject;
import org.json.JSONArray;
import com.amap.api.fence.GeoFence;
import com.amap.api.fence.PoiItem;
import java.lang.Double;
import java.util.ArrayList;
import java.lang.StringBuilder;
import java.util.Collection;
import com.amap.api.fence.DistrictItem;
import com.loc.a;
import java.lang.Math;

public final class c	// class@0013b1
{
    public static long a;

    public void c(){
       super();
    }
    public static double a(DPoint p0,DPoint p1,DPoint p2){
       double latitude;
       double d = p2.getLongitude() - p1.getLongitude();
       double d1 = p2.getLatitude() - p1.getLatitude();
       double d2 = (((p0.getLongitude() - p1.getLongitude()) * d) + ((p0.getLatitude() - p1.getLatitude()) * d1)) / ((d * d) + (d1 * d1));
       DPoint uDPoint = (!p1.getLongitude() - p2.getLongitude() && !p1.getLatitude() - p2.getLatitude())? 1: null;
       if (d2 < 0 || uDPoint) {
          d2 = p1.getLongitude();
          latitude = p1.getLatitude();
       }else if(d2 - 0x3ff0000000000000 > 0){
          d2 = p2.getLongitude();
          latitude = p2.getLatitude();
       }else {
          latitude = p1.getLatitude() + (d2 * d1);
          d2 = p1.getLongitude() + (d * d2);
       }
       return (double)fq.a(new DPoint(p0.getLatitude(), p0.getLongitude()), new DPoint(latitude, d2));
    }
    public static int a(String p0,List p1,Bundle p2){
       int i3;
       List list = p1;
       Bundle uBundle = p2;
       JSONObject jSONObject = new JSONObject(p0);
       int i = 0;
       int i1 = jSONObject.optInt("infocode", i);
       if (jSONObject.optInt("status", i) == 1) {
          JSONArray jSONArray = jSONObject.optJSONArray("pois");
          if (jSONArray != null) {
             int i2 = 0;
             while (i2 < jSONArray.length()) {
                GeoFence geoFence = new GeoFence();
                PoiItem poiItem = new PoiItem();
                JSONObject jSONObject1 = jSONArray.getJSONObject(i2);
                poiItem.setPoiId(jSONObject1.optString("id"));
                poiItem.setPoiName(jSONObject1.optString("name"));
                poiItem.setPoiType(jSONObject1.optString("type"));
                poiItem.setTypeCode(jSONObject1.optString("typecode"));
                poiItem.setAddress(jSONObject1.optString("address"));
                String str = jSONObject1.optString("location");
                if (str != null) {
                   String[] stringArray = str.split(",");
                   poiItem.setLongitude(Double.parseDouble(stringArray[i]));
                   poiItem.setLatitude(Double.parseDouble(stringArray[1]));
                   ArrayList uArrayList = new ArrayList();
                   ArrayList uArrayList1 = new ArrayList();
                   i3 = i1;
                   DPoint uDPoint = new DPoint(poiItem.getLatitude(), poiItem.getLongitude());
                   uArrayList1.add(uDPoint);
                   uArrayList.add(uArrayList1);
                   geoFence.setPointList(uArrayList);
                   geoFence.setCenter(uDPoint);
                }else {
                   i3 = i1;
                }
                poiItem.setTel(jSONObject1.optString("tel"));
                poiItem.setProvince(jSONObject1.optString("pname"));
                poiItem.setCity(jSONObject1.optString("cityname"));
                poiItem.setAdname(jSONObject1.optString("adname"));
                geoFence.setPoiItem(poiItem);
                geoFence.setFenceId(c.a());
                if (uBundle) {
                   geoFence.setCustomId(uBundle.getString("customId"));
                   geoFence.setPendingIntentAction(uBundle.getString("pendingIntentAction"));
                   geoFence.setType(2);
                   geoFence.setRadius(uBundle.getFloat("fenceRadius"));
                   geoFence.setExpiration(uBundle.getLong("expiration"));
                   geoFence.setActivatesAction(uBundle.getInt("activatesAction", 1));
                }
                if (list) {
                   list.add(geoFence);
                }
                i2 = i2 + 1;
                i1 = i3;
                i = 0;
             }
          }
       }
       i1 = i1;
       return i1;
    }
    public static synchronized long a(){
       _monitor_enter(c.class);
       long l = fq.b();
       long a = c.a;
       c.a = (l - a > 0)? l: a + 1;
       _monitor_exit(c.class);
       return c.a;
    }
    public static int b(String p0,List p1,Bundle p2){
       return c.a(p0, p1, p2);
    }
    public final List a(List p0,float p1){
       if (p0 == null) {
          return null;
       }
       if (p0.size() <= 2) {
          return p0;
       }
       int i = 0;
       ArrayList uArrayList = new ArrayList();
       DPoint uDPoint = p0.get(0);
       DPoint uDPoint1 = p0.get((p0.size() - 1));
       int i1 = 1;
       int i2 = 0;
       int i3 = p0.size() - 1;
       while (i1 < i3) {
          double d = c.a(p0.get(i1), uDPoint, uDPoint1);
          if (d - i > 0) {
             i2 = i1;
             i = d;
          }
          i1 = i1 + 1;
       }
       if (i - (double)p1 < 0) {
          uArrayList.add(uDPoint);
          uArrayList.add(uDPoint1);
          return uArrayList;
       }else {
          uArrayList.addAll(this.a(p0.subList(0, (i2 + 1)), p1));
          uArrayList.remove((uArrayList.size() - 1));
          uArrayList.addAll(this.a(p0.subList(i2, p0.size()), p1));
          return uArrayList;
       }
    }
    public final int c(String p0,List p1,Bundle p2){
       String[] stringArray;
       ArrayList uArrayList2;
       String str7;
       int i6;
       String str8;
       String str9;
       float f2;
       String str11;
       long l;
       int i9;
       Bundle uBundle = p2;
       JSONObject jSONObject = new JSONObject(p0);
       int i = 0;
       int i1 = jSONObject.optInt("infocode", i);
       String str = uBundle.getString("customId");
       String str1 = uBundle.getString("pendingIntentAction");
       float floatx = uBundle.getFloat("fenceRadius");
       long longx = uBundle.getLong("expiration");
       int i2 = 1;
       int intx = uBundle.getInt("activatesAction", i2);
       if (jSONObject.optInt("status", i) == i2) {
          JSONArray jSONArray = jSONObject.optJSONArray("districts");
          if (jSONArray != null) {
             int i3 = 0;
             while (i3 < jSONArray.length()) {
                ArrayList uArrayList = new ArrayList();
                ArrayList uArrayList1 = new ArrayList();
                GeoFence geoFence = new GeoFence();
                JSONObject jSONObject1 = jSONArray.getJSONObject(i3);
                String str2 = jSONObject1.optString("citycode");
                String str3 = jSONObject1.optString("adcode");
                String str4 = jSONObject1.optString("name");
                JSONArray jSONArray1 = jSONArray;
                String str5 = jSONObject1.getString("center");
                int i4 = i1;
                DPoint uDPoint = new DPoint();
                int i5 = i3;
                String str6 = ",";
                if (str5 != null) {
                   stringArray = str5.split(str6);
                   uArrayList2 = uArrayList;
                   str7 = str4;
                   uDPoint.setLatitude(Double.parseDouble(stringArray[1]));
                   uDPoint.setLongitude(Double.parseDouble(stringArray[0]));
                   geoFence.setCenter(uDPoint);
                }else {
                   uArrayList2 = uArrayList;
                   str7 = str4;
                }
                geoFence.setCustomId(str);
                geoFence.setPendingIntentAction(str1);
                geoFence.setType(3);
                geoFence.setRadius(floatx);
                geoFence.setExpiration(longx);
                geoFence.setActivatesAction(intx);
                geoFence.setFenceId(c.a());
                str5 = jSONObject1.optString("polyline");
                if (str5 != null) {
                   stringArray = str5.split("\\|");
                   int len = stringArray.length;
                   i6 = intx;
                   float f = Float.MAX_VALUE;
                   float f1 = Float.MIN_VALUE;
                   for (int i7 = 0; i7 < len; len = i9) {
                      str8 = str;
                      String[] stringArray1 = stringArray;
                      DistrictItem uDistrictIte = new DistrictItem();
                      str9 = str1;
                      ArrayList uArrayList3 = new ArrayList();
                      uDistrictIte.setCitycode(str2);
                      uDistrictIte.setAdcode(str3);
                      String str10 = str3;
                      str3 = str7;
                      uDistrictIte.setDistrictName(str3);
                      String[] stringArray2 = (stringArray[i7]).split(";");
                      f2 = floatx;
                      int i8 = 0;
                      while (i8 < stringArray2.length) {
                         String[] stringArray3 = (stringArray2[i8]).split(str6);
                         str11 = str6;
                         String[] stringArray4 = stringArray2;
                         i = 1;
                         if (stringArray3.length > i) {
                            l = longx;
                            i9 = len;
                            str6 = str2;
                            uArrayList3.add(new DPoint(Double.parseDouble(stringArray3[i]), Double.parseDouble(stringArray3[0])));
                         }else {
                            l = longx;
                            i9 = len;
                            str6 = str2;
                            int i10 = 0;
                         }
                         i8 = i8 + 1;
                         str2 = str6;
                         str6 = str11;
                         stringArray2 = stringArray4;
                         longx = l;
                         len = i9;
                      }
                      str11 = str6;
                      l = longx;
                      i9 = len;
                      str6 = str2;
                      float f3 = 100.00f;
                      if ((float)uArrayList3.size() - f3 > 0) {
                         uArrayList3 = this.a(uArrayList3, f3);
                      }else {
                         i = this;
                      }
                      uArrayList1.add(uArrayList3);
                      uDistrictIte.setPolyline(uArrayList3);
                      ArrayList uArrayList4 = uArrayList2;
                      uArrayList4.add(uDistrictIte);
                      f1 = Math.max(f1, a.b(uDPoint, uArrayList3));
                      f = Math.min(f, a.a(uDPoint, uArrayList3));
                      i7 = i7 + 1;
                      str2 = str6;
                      uArrayList2 = uArrayList4;
                      str = str8;
                      stringArray = stringArray1;
                      str1 = str9;
                      str3 = str10;
                      floatx = f2;
                      str6 = str11;
                      longx = l;
                   }
                   str8 = str;
                   str9 = str1;
                   f2 = floatx;
                   l = longx;
                   geoFence.setMaxDis2Center(f1);
                   geoFence.setMinDis2Center(f);
                   geoFence.setDistrictItemList(uArrayList2);
                   geoFence.setPointList(uArrayList1);
                   p1.add(geoFence);
                }else {
                   i6 = intx;
                   str8 = str;
                   str9 = str1;
                   f2 = floatx;
                   l = longx;
                   intx = p1;
                }
                i3 = i5 + 1;
                jSONArray = jSONArray1;
                i1 = i4;
                intx = i6;
                str = str8;
                str1 = str9;
                floatx = f2;
                longx = l;
                str4 = 1;
             }
          }
       }
       i1 = i1;
       return i1;
    }
}
