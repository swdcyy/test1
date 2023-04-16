package c.t.m.g.ej;
import java.lang.Math;
import java.lang.Double;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.Float;
import c.t.m.g.df;
import java.lang.Enum;
import java.util.ArrayList;
import java.util.List;
import c.t.m.g.dy;
import java.util.Iterator;
import android.telephony.NeighboringCellInfo;
import c.t.m.g.eb;
import java.lang.Iterable;
import c.t.m.g.dg;
import android.location.Location;
import c.t.m.g.dj;
import android.os.SystemClock;
import android.net.wifi.ScanResult;
import java.lang.CharSequence;
import c.t.m.g.ek;
import c.t.m.g.ed;
import com.tencent.map.geolocation.util.SoUtils;
import java.lang.Throwable;
import android.text.TextUtils;
import org.json.JSONObject;
import org.json.JSONArray;
import c.t.m.g.cd;
import java.lang.Integer;
import java.lang.System;
import c.t.m.g.bf;
import c.t.m.g.bj;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.OutputStream;

public class ej	// class@000c6c
{
    public static String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567";
    public static final byte[] b;

    static {
       byte[] uobyteArray = new byte[0];
       ej.b = uobyteArray;
    }
    public static double a(double p0){
       return ((p0 * 0x400921fb54442d18) / 180.00f);
    }
    public static double a(double p0,double p1,double p2,double p3){
       p0 = ej.a(p0);
       p2 = ej.a(p2);
       return (((double)Math.round((((Math.asin(Math.sqrt((Math.pow(Math.sin(((p0 - p2) / 2.00f)), 2.00f) + ((Math.cos(p0) * Math.cos(p2)) * Math.pow(Math.sin(((ej.a(p1) - ej.a(p3)) / 2.00f)), 2.00f))))) * 2.00f) * 6378.14f) * 10000.00f)) / 10000.00f) * 0x408f400000000000);
    }
    public static double a(double p0,int p1){
       double d = 0;
       try{
          if (Double.isNaN(p0)) {
             return d;
          }
          return BigDecimal.valueOf(p0).setScale(p1, RoundingMode.HALF_DOWN).doubleValue();
       }catch(java.lang.Exception e0){
          return e0;
       }
    }
    public static int a(char p0){
       int i = (p0 >= 'A' && p0 <= 'Z')? p0 - 65: 256;
       if (p0 >= 'a' && p0 <= 'z') {
          i = (p0 - 97) + 64;
       }
       if (p0 >= '0' && p0 <= '9') {
          i = (p0 + 128) - 48;
       }
       return i;
    }
    public static String a(int p0,int p1,int p2,int p3,int p4,int p5,int p6){
       StringBuilder str = "{"+"\"mcc\":"+p0+",\"mnc\":"+p1+",\"lac\":"+p2+",\"cellid\":"+p3+",\"rss\":"+p4;
       p0 = Integer.MAX_VALUE;
       if (p5 != p0 && p6 != p0) {
          Object[] objArray = new Object[]{Float.valueOf(((float)p5 / 14400.00f))};
          Object[] objArray1 = new Object[]{Float.valueOf(((float)p6 / 14400.00f))};
          str = str+",\"stationLat\":"+String.format("%.6f", objArray)+",\"stationLng\":"+String.format("%.6f", objArray1);
       }
       return str+"}";
    }
    public static String a(int p0,int p1,int p2,long p3,int p4,int p5,int p6,boolean p7,int p8){
       StringBuilder str = "{"+"\"mcc\":"+p0+",\"mnc\":"+p1+",\"lac\":"+p2+",\"cellid\":"+p3+",\"rss\":"+p4+",\"seed\":"+p7+",\"networktype\":"+p8;
       p0 = Integer.MAX_VALUE;
       if (p5 != p0 && p6 != p0) {
          Object[] objArray = new Object[]{Float.valueOf(((float)p5 / 14400.00f))};
          Object[] objArray1 = new Object[]{Float.valueOf(((float)p6 / 14400.00f))};
          str = str+",\"stationLat\":"+String.format("%.6f", objArray)+",\"stationLng\":"+String.format("%.6f", objArray1);
       }
       return str+"}";
    }
    public static String a(df p0,boolean p1){
       df uodf = p0;
       if (!uodf) {
          return "[]";
       }
       df b = uodf.b;
       df c = uodf.c;
       int i = uodf.a.ordinal();
       ArrayList uArrayList = new ArrayList();
       List list = p0.c();
       if (dy.a(i, b, c, uodf.d, uodf.f)) {
          uArrayList.add(ej.a(b, c, uodf.d, uodf.f, uodf.e, uodf.g, uodf.h, p1, i));
       }else {
          ej.a("illeagal main cell! ", b, c, i, uodf.d, uodf.f);
       }
       try{
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             int lac = obj.getLac();
             int cid = obj.getCid();
             long l = (long)cid;
             long l1 = l;
             if (dy.a(i, b, c, lac, l)) {
                int i1 = obj.getRssi() * 2;
                int i2 = i1 - 113;
                uArrayList.add(ej.a(b, c, lac, cid, i2, Integer.MAX_VALUE, Integer.MAX_VALUE));
             }else {
                ej.a("illeagal neighboringCell! ", b, c, i, lac, l1);
             }
          }
          return "["+eb.a(",").a(uArrayList)+"]";
       }catch(java.lang.Exception e0){
       }
    }
    public static String a(dg p0){
       if (p0 == null) {
          return "{}";
       }
       dg a = p0.a;
       return "{"+"\"latitude\":"+ej.a(a.getLatitude(), 6)+",\"longitude\":"+ej.a(a.getLongitude(), 6)+",\"additional\":"+"\""+ej.a(a.getAltitude(), 1)+","+ej.a((double)a.getAccuracy(), 1)+","+ej.a((double)a.getBearing(), 1)+","+ej.a((double)a.getSpeed(), 1)+","+p0.b+"\""+",\"source\":"+p0.f.ordinal()+"}";
    }
    public static String a(dj p0,boolean p1){
       int i1;
       String str = (p0 == null)? null: p0.c();
       if (str == null) {
          return "[]";
       }else {
          StringBuilder str1 = "[";
          if (str.size() <= 0) {
             return str1+"]";
          }else {
             int i = 0;
             long l = SystemClock.elapsedRealtime() / 1000;
             Iterator iterator = str.iterator();
             while (iterator.hasNext()) {
                ScanResult scanResult = iterator.next();
                if (!ej.a(scanResult, str.size())) {
                   continue ;
                }else {
                   String str2 = ",";
                   if (i > 0) {
                      str1 = str1+str2;
                   }
                   str1 = str1+"{\"mac\":\""+(scanResult.BSSID).replace(":", "")+"\","+"\"rssi\":"+scanResult.level;
                   if (p1) {
                      ScanResult timestamp = scanResult.timestamp;
                      if (timestamp - null > 0) {
                         long l1 = timestamp / 1000;
                         l1 = l1 / 1000;
                         l1 = l - l1;
                         i1 = (int)l1;
                      }else {
                         i1 = -1;
                      }
                      str1 = str1+str2+"\"ts\":";
                      if (i1 >= 1000) {
                         i1 = 1000;
                      }
                      str1 = str1+i1;
                   }
                   str1 = str1+"}";
                   i = i + 1;
                }
             }
             return str1+"]";
          }
       }
    }
    public static void a(String p0,int p1,int p2,int p3,int p4,long p5){
    }
    public static boolean a(int p0){
       boolean b = (!p0)? true: false;
       return b;
    }
    public static boolean a(Location p0,double[] p1){
       int i = (int)(p0.getLatitude() * 1000000.00f);
       int i1 = (int)(p0.getLongitude() * 1000000.00f);
       String str = ek.a("tencent_loc_lib");
       int i2 = 0;
       int i4 = 0;
       for (int i3 = 0; i3 < str.length(); i3 = i3 + 1) {
          i4 = i4 + ej.a(str.charAt(i3));
       }
       double[] uodoubleArra = new double[2];
       if (ed.a) {
          ed.a("SosoLocUtils", "defelect gps:"+i+","+i1+","+i4);
       }
       try{
          if (ed.a) {
             ed.a("hh", "LocalGPSAid fun_b");
          label_0064 :
             SoUtils.fun_b((i ^ i4), (i1 ^ i4), uodoubleArra);
          }else {
             goto label_0064 ;
          }
       }catch(java.lang.UnsatisfiedLinkError e8){
          if (ed.a) {
             ed.a("SosoLocUtils", "deflect", e8);
          }
       }
       p1[i2] = uodoubleArra[i2];
       p1[1] = uodoubleArra[1];
       if (ed.a) {
          ed.b("SosoLocUtils", "defelect:"+p1[i2]+","+p1[1]+",pos:"+uodoubleArra[i2]+","+uodoubleArra[1]);
       }
       return 1;
    }
    public static boolean a(ScanResult p0,int p1){
       return true;
    }
    public static boolean a(String p0){
       boolean b = false;
       if (TextUtils.isEmpty(p0)) {
          return b;
       }
       JSONObject jSONObject = new JSONObject(p0);
       boolean b1 = p0.contains("latitude");
       JSONArray jSONArray = jSONObject.optJSONArray("cells");
       int i = (jSONArray == null)? 0: jSONArray.length();
       JSONArray jSONArray1 = jSONObject.optJSONArray("wifis");
       int i1 = (jSONArray1 == null)? 0: jSONArray1.length();
       cd uocd = cd.c();
       StringBuilder str = "req gwc:";
       String str1 = (b1)? "1": "0";
       uocd.a("LOC", str+str1+","+i1+","+i);
       if (!b1 && (i > 0 || i1 > 0)) {
          b = true;
       }
       return b;
    }
    public static byte[] a(byte[] p0){
       p0 = ek.a(p0);
       p0 = (p0 == null)? new byte[0]: ej.c(p0);
       byte[] uobyteArray = new byte[(p0.length + 4)];
       int len = p0.length;
       uobyteArray[0] = Integer.valueOf((len >> 8)).byteValue();
       uobyteArray[1] = Integer.valueOf((len >> 24)).byteValue();
       uobyteArray[2] = Integer.valueOf((len >> 16)).byteValue();
       uobyteArray[3] = Integer.valueOf(len).byteValue();
       System.arraycopy(p0, 0, uobyteArray, 4, len);
       return uobyteArray;
    }
    public static byte[] a(byte[] p0,String p1){
       if (p0 == null || !p0.length) {
          return ej.b;
       }
       p0 = bj.a(bf.a(p0), p1);
       if (p0 == null || !p0.length) {
          if (ed.a) {
             ed.b("SosoLocUtils", "encrypt failed");
          }
          return ej.b;
       }else {
          byte[] uobyteArray = new byte[(p0.length + 2)];
          System.arraycopy(ej.b(p0.length), 0, uobyteArray, 0, 2);
          System.arraycopy(p0, 0, uobyteArray, 2, p0.length);
          return uobyteArray;
       }
    }
    public static byte[] b(int p0){
       byte[] uobyteArray = new byte[2];
       for (int i = 0; i < 2; i = i + 1) {
          int i1 = p0 & 0x00ff;
          uobyteArray[i] = Integer.valueOf(i1).byteValue();
          p0 = p0 >> 8;
       }
       return uobyteArray;
    }
    public static byte[] b(byte[] p0){
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream(p0.length);
       GZIPOutputStream gZIPOutputSt = new GZIPOutputStream(uByteArrayOu);
       gZIPOutputSt.write(p0);
       gZIPOutputSt.close();
       uByteArrayOu.close();
       return uByteArrayOu.toByteArray();
    }
    public static byte[] c(byte[] p0){
       int len = p0.length;
       byte[] uobyteArray = new byte[len];
       System.arraycopy(p0, 0, uobyteArray, 0, len);
       int i = (len % 5) + 7;
       int i1 = 0;
       int i2 = i << 1;
       i2 = i2 + i1;
       while (i2 < len) {
          byte b = Integer.valueOf(i1).byteValue();
          for (int i3 = 0; i3 < i; i3 = i3 + 1) {
             int i4 = i1 + i3;
             byte b1 = uobyteArray[i4];
             int i5 = i1 + i;
             i5 = i5 + i3;
             int i6 = uobyteArray[i5] ^ b;
             uobyteArray[i4] = (byte)i6;
             i4 = b1 ^ b;
             uobyteArray[i5] = (byte)i4;
          }
          i1 = i2;
       }
       return uobyteArray;
    }
}
