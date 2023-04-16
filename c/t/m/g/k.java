package c.t.m.g.k;
import c.t.m.g.k$1;
import c.t.m.g.c;
import android.location.Location;
import java.util.List;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.Locale;
import java.lang.Object;
import java.lang.Double;
import java.lang.Float;
import java.util.Collection;
import c.t.m.g.by;
import c.t.m.g.d;
import c.t.m.g.bw;
import java.util.Comparator;
import java.util.Arrays;
import android.os.SystemClock;
import android.net.wifi.ScanResult;
import c.t.m.g.n;
import org.json.JSONObject;
import java.text.SimpleDateFormat;
import c.t.m.g.bh;
import java.util.Date;
import c.t.m.g.j;
import c.t.m.g.m;
import java.lang.CharSequence;
import java.lang.Throwable;
import c.t.m.g.bt;

public class k	// class@000c9b
{
    public static String a = "209";
    public static String b = "fc_sdk";
    public static final Comparator c;

    static {
       k.c = new k$1();
    }
    public static String a(c p0,Location p1,List p2,List p3,boolean p4){
       int i3;
       StringBuilder str10;
       StringBuilder str11;
       List list = p3;
       String str = "_";
       String str1 = "%.6f";
       StringBuilder str2 = "[| _]";
       StringBuilder str3 = ",";
       int i = 0;
       int i1 = (p2 != null)? p2.size(): 0;
       int i2 = (list)? p3.size(): 0;
       if (p0 != null && (p1 == null || (!i1 && !i2))) {
          return "";
       }else {
          String str4 = "";
          StringBuilder str5 = "";
          StringBuilder str6 = "";
          Locale eNGLISH = Locale.ENGLISH;
          Object[] objArray = new Object[]{Double.valueOf(p1.getLatitude())};
          objArray = new Object[]{Double.valueOf(p1.getLongitude())};
          Object[] objArray1 = new Object[]{Float.valueOf(p1.getSpeed())};
          StringBuilder str7 = i+str3+String.format(eNGLISH, str1, objArray)+str3+String.format(eNGLISH, str1, objArray)+str3+(int)p1.getAltitude()+str3+(int)p1.getAccuracy()+str3+(int)p1.getBearing()+str3+String.format(eNGLISH, "%.1f", objArray1)+str3+p1.getTime();
          if (!by.a(p3)) {
             for (i3 = 0; i3 < p3.size(); i3 = i3 + 1) {
                d uod = list.get(i3);
                String str8 = (!i3)? "": ";";
                str4 = str4+str8+uod.a+str3+uod.b+str3+uod.c+str3+uod.e+str3+uod.d+str3;
                int i4 = (!i3)? bw.a(p4): -1;
                str4 = str4+i4+str3+uod.f;
             }
          }
          String str9 = ":";
          str1 = "&";
          if (p2 != null && p2.size() > 0) {
             Object[] objArray2 = p2.toArray();
             Arrays.sort(objArray2, k.c);
             long l = SystemClock.elapsedRealtime() / 1000;
             int i5 = 0;
             while (i5 < objArray2.length) {
                object oobject = objArray2[i5];
                str10 = (!i5)? "": str1;
                str10 = str4;
                str11 = str5+str10+((oobject.BSSID).replaceAll(str9, "")).toLowerCase()+str1+oobject.level;
                ScanResult timestamp = oobject.timestamp;
                if (timestamp > 0) {
                   long l1 = timestamp / 1000;
                   l1 = l1 / 1000;
                   l1 = l - l1;
                   i = (int)l1;
                }else {
                   i = -1;
                }
                str4 = (!i5)? "": str1;
                str6 = str6+str4+i;
                i5 = i5 + 1;
                str4 = str10;
                str5 = str11;
                long l2 = 1000;
             }
          }
          str10 = str4;
          str11 = str5;
          str3 = "";
          String str12 = n.a();
          if (str12 != null && str12.length() > 5) {
             JSONObject jSONObject = new JSONObject(str12);
             str3 = str3+((jSONObject.optString("mac")).replaceAll(str9, "")).toLowerCase()+str1+jSONObject.optString("ssid")+str1+jSONObject.optString("rssi");
             i3 = 0;
             if (str3.length() < 5) {
                str3.setLength(i3);
             }
          }
          str1 = (p0.c()).replaceAll(str2, "")+str+p0.b();
          str = (p0.e()).replaceAll(str2, "")+str+(p0.f()).replaceAll(str2, "");
          str2 = "["+bh.a("yyyy-MM-dd HH:mm:ss").format(new Date())+"]:"+p0.a()+"|"+k.a+"|"+p0.d()+"|";
          str12 = (j.d)? m.a(): "";
          str2 = str2+str12+"|";
          str12 = (j.d)? m.c(): "";
          str2 = str2+str12+"|"+""+"|"+""+"|"+""+"|"+""+"|"+""+"|"+""+"|"+str7+"|"+""+"|"+str10+"|"+str11+"|"+""+"|"+""+"|"+""+"|"+""+"|"+""+"|"+""+"|"+""+"|"+""+"|"+""+"|"+""+"|"+""+"|"+""+"|"+""+"|"+""+"|"+""+"|"+k.b+"|"+""+"|"+""+"|"+""+"|"+str3+"|"+""+"|";
          str9 = (j.d)? ((m.d()).replaceAll(str9, "")).toLowerCase(): "";
          return str2+str9+"|"+str1+"|"+""+"|"+""+"|"+str+"|"+""+"|"+""+"|"+""+"|"+""+"|"+""+"|"+""+"|"+""+"|"+""+"|"+""+"|"+""+"|"+""+"|"+str6+"|"+"";
       }
    }
    public static void a(String p0){
       k.b = p0;
    }
    public static void b(String p0){
       k.a = p0;
    }
}
