package com.loc.ez;
import java.lang.Object;
import java.util.Hashtable;
import java.lang.CharSequence;
import java.lang.String;
import com.amap.api.location.AMapLocationClientOption$GeoLanguage;
import android.text.TextUtils;
import com.loc.eo;
import com.loc.fq;
import java.lang.StringBuilder;
import java.lang.Math;
import android.content.Context;
import com.loc.fi;
import com.loc.et;
import com.loc.ex;
import com.loc.es;
import java.util.ArrayList;
import com.amap.api.location.AMapLocation;
import com.loc.ez$a;
import android.location.Location;
import java.lang.Throwable;
import com.loc.fj;
import java.util.Set;
import java.util.Iterator;
import org.json.JSONObject;
import com.loc.ey;
import com.loc.p;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;
import com.amap.api.location.AMapLocationClientOption;
import java.lang.Long;

public final class ez	// class@001422
{
    public Hashtable a;
    public boolean b;
    public long c;
    public String d;
    public es e;
    public boolean f;
    public boolean g;
    public String h;
    public long i;
    public boolean j;
    public String k;
    public String l;
    public String m;
    public long n;

    public void ez(){
       super();
       this.a = new Hashtable();
       this.i = 0;
       this.j = false;
       this.k = ("2.0.201501131131").replace(".", "");
       this.l = null;
       this.b = true;
       this.c = 0;
       this.d = null;
       this.e = null;
       this.m = null;
       this.n = 0;
       this.f = true;
       this.g = true;
       this.h = String.valueOf(AMapLocationClientOption$GeoLanguage.DEFAULT);
    }
    public static void a(String p0,Hashtable p1){
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       p1.clear();
       String[] stringArray = p0.split("#");
       int len = stringArray.length;
       int i = 0;
       while (i < len) {
          object oobject = stringArray[i];
          if (!TextUtils.isEmpty(oobject) && !oobject.contains("|")) {
             p1.put(oobject, "");
          }
          i = i + 1;
       }
       return;
    }
    public static boolean a(String p0,eo p1){
       if (TextUtils.isEmpty(p0) || !fq.a(p1)) {
          return false;
       }
       if (p0.startsWith("#")) {
          return false;
       }
       return p0.contains("network");
    }
    public static boolean a(String p0,StringBuilder p1){
       object oobject;
       boolean b = false;
       if (TextUtils.isEmpty(p0) || (!TextUtils.isEmpty(p1) && (!p0.contains(",access") || p1.indexOf(",access") == -1))) {
          return b;
       }
       String[] stringArray = p0.split(",access");
       stringArray = ((stringArray[b]).contains("#"))? (stringArray[b]).substring(((stringArray[b]).lastIndexOf("#") + 1)): stringArray[b];
       if (TextUtils.isEmpty(stringArray)) {
          return b;
       }else {
          return (p1).contains(stringArray+",access");
       }
    }
    public static double[] a(double[] p0,double[] p1){
       int i = p0;
       double[] uodoubleArra = new double[3];
       double d = 0;
       int i1 = 0;
       double d1 = d;
       double d2 = d1;
       int i2 = 0;
       int i3 = 0;
       int i4 = 0;
       while (i2 < i.length) {
          double d3 = i[i2] * i[i2];
          d1 = d1 + d3;
          d3 = p1[i2] * p1[i2];
          d2 = d2 + d3;
          d3 = i[i2] * p1[i2];
          d = d + d3;
          if (!p1[i2] - 0x3ff0000000000000) {
             i4 = i4 + 1;
             if (!i[i2] - 0x3ff0000000000000) {
                i3 = i3 + 1;
             }
          }
          i2 = i2 + 1;
       }
       uodoubleArra[i1] = d / (Math.sqrt(d1) * Math.sqrt(d2));
       d = (double)i3;
       uodoubleArra[1] = (d * 0x3ff0000000000000) / (double)i4;
       uodoubleArra[2] = d;
       while (i1 < 2) {
          if (uodoubleArra[i1] - 0x3ff0000000000000 > 0) {
             uodoubleArra[i1] = 0x3ff0000000000000;
          }
          i1 = i1 + 1;
       }
       return uodoubleArra;
    }
    public final eo a(Context p0,String p1,StringBuilder p2,boolean p3,boolean p4){
       if (TextUtils.isEmpty(p1)) {
          return null;
       }
       if (!fi.e()) {
          return null;
       }
       p1 = p1+"&"+this.f+"&"+this.g+"&"+this.h;
       if (!p1.contains("gps") && (!fi.e() || p2 == null)) {
          return null;
       }
       if (this.b()) {
          this.c();
          return null;
       }else if(p3 && this.j == null){
          this.c();
          this.a(p0, this.a(p1, p2, p0), p4);
       }
    label_0062 :
       if (this.a.isEmpty()) {
          return null;
       }else {
          return this.a(p1, p2, p4);
       }
    }
    public final eo a(et p0,boolean p1,eo p2,ex p3,StringBuilder p4,String p5,Context p6,boolean p7){
       String str1;
       int i;
       int i1;
       boolean b;
       ez uoez1;
       long l;
       ez uoez = this;
       eo uoeo = p2;
       String str = p5;
       if (!this.a(uoeo, p7)) {
          return null;
       }
       es uoes = p0.e();
       if (uoes != null || uoez.e != null) {
          ez e = uoez.e;
          if (e == null || !e.equals(uoes)) {
             str1 = 1;
          label_0027 :
             if (uoeo != null) {
                i = p3.e().size();
                i = (p2.getAccuracy() - 0x43958000 > 0 && i > 5)? 1: 0;
                i1 = i;
             }else {
                i1 = 0;
             }
             i = 3000;
             if (uoeo != null) {
                ez d = uoez.d;
                if (d != null && (!i1 && !str1)) {
                   b = fq.a(d, p4);
                   boolean b1 = (uoez.c && (fq.b() - uoez.c) - i < 0)? true: false;
                   if (b || (b1 && fq.a(p2))) {
                      uoeo.e("mem");
                      uoeo.setLocationType(2);
                      return uoeo;
                   }else if(!b){
                      uoez.c = fq.b();
                   }else {
                      uoez.c = 0;
                   }
                   ez m = uoez.m;
                   if (m != null && !str.equals(m)) {
                      if ((fq.a() - uoez.n) - i < 0) {
                         uoez1 = uoez.m;
                      label_00c1 :
                         uoeo = (!i1 && !p1)? this.a(p6, uoez1, p4, false, false): null;
                         int i2 = (!p1 && !fq.a(uoeo))? 1: 0;
                         if (i2 || i1) {
                            return null;
                         }else if(p1){
                            return null;
                         }else {
                            uoez.c = 0;
                            uoeo.setLocationType(4);
                            return uoeo;
                         }
                      }else {
                         l = fq.a();
                      }
                   }else if(uoez.m == null){
                      l = fq.a();
                   }else {
                      uoez.n = fq.a();
                   label_00c0 :
                      uoez1 = str;
                      goto label_00c1 ;
                   }
                   uoez.n = l;
                   uoez.m = str;
                   goto label_00c0 ;
                }
             }
             b = false;
             goto label_0084 ;
          }
       }
       str1 = null;
       goto label_0027 ;
    }
    public final eo a(String p0,StringBuilder p1,boolean p2){
       ez$a uoa;
       if (p0.contains("cgiwifi") || p0.contains("wifi")) {
          uoa = this.a(p1, p0);
       }else if(p0.contains("cgi") && (this.a.containsKey(p0) && this.a.get(p0).size() > 0)){
          uoa = this.a.get(p0).get(0);
       }else {
          uoa = null;
       }
       if (uoa != null && fq.a(uoa.a())) {
          eo uoeo = uoa.a();
          uoeo.e("mem");
          uoeo.h(uoa.b());
          if (p2 || fi.a(uoeo.getTime())) {
             if (fq.a(uoeo)) {
                this.c = 0;
             }
             uoeo.setLocationType(4);
             return uoeo;
          }else {
             ez ta = this.a;
             if (ta != null && ta.containsKey(p0)) {
                this.a.get(p0).remove(uoa);
             }
          }
       }
       return null;
    }
    public final ez$a a(StringBuilder p0,String p1){
       ez$a uoa2;
       String str;
       double[] obj1;
       ez uoez = this;
       ArrayList obj = p1;
       ez$a uoa = null;
       if (uoez.a.isEmpty() || TextUtils.isEmpty(p0)) {
          return uoa;
       }
       if (!uoez.a.containsKey(obj)) {
          return uoa;
       }
       Hashtable hashtable = new Hashtable();
       Hashtable hashtable1 = new Hashtable();
       Hashtable hashtable2 = new Hashtable();
       obj = uoez.a.get(obj);
       int i = 1;
       int i1 = obj.size() - i;
       while (true) {
          if (i1 >= 0) {
             ez$a uoa1 = obj.get(i1);
             if (!TextUtils.isEmpty(uoa1.b())) {
                int i2 = 0;
                if (ez.a(uoa1.b(), p0)) {
                   if (fq.a(uoa1.b(), p0)) {
                   label_0068 :
                      uoa2 = uoa1;
                   label_0132 :
                      uoa = uoa2;
                      break ;
                   }else {
                      str = 1;
                   }
                }else {
                   str = null;
                }
                ez.a(uoa1.b(), hashtable);
                ez.a(p0, hashtable1);
                hashtable2.clear();
                Iterator iterator = hashtable.keySet().iterator();
                String str1 = "";
                while (iterator.hasNext()) {
                   hashtable2.put(iterator.next(), str1);
                }
                iterator = hashtable1.keySet().iterator();
                while (iterator.hasNext()) {
                   hashtable2.put(iterator.next(), str1);
                }
                Set set = hashtable2.keySet();
                double[] uodoubleArra = new double[set.size()];
                double[] uodoubleArra1 = new double[set.size()];
                Iterator iterator1 = set.iterator();
                int i3 = 0;
                while (iterator1 != null && iterator1.hasNext()) {
                   obj1 = iterator1.next();
                   long l = 0x3ff0000000000000;
                   long l1 = (hashtable.containsKey(obj1))? l: 0;
                   uodoubleArra[i3] = l1;
                   if (!hashtable1.containsKey(obj1)) {
                      l = 0;
                   }
                   uodoubleArra1[i3] = l;
                   i3 = i3 + 1;
                   obj1 = null;
                }
                set.clear();
                obj1 = ez.a(uodoubleArra, uodoubleArra1);
                if (obj1[i2] - 0x3fe99999a0000000 >= 0) {
                   goto label_0068 ;
                }else {
                   uoa2 = uoa1;
                   double d = 0x3fe3c6a7ef9db22d;
                   if (obj1[i] - Math.min(fi.g(), d) >= 0 || (str && obj1[i2] - Math.min(fi.g(), d) >= 0)) {
                      goto label_0132 ;
                   }
                }
             }else {
                int i4 = p0;
             }
             i1 = i1 - 1;
             i = 1;
          }else {
             uoa = null;
             break ;
          }
       }
       hashtable.clear();
       hashtable1.clear();
       hashtable2.clear();
       return uoa;
    }
    public final String a(String p0,StringBuilder p1,Context p2){
       object oobject;
       String str = "&";
       if (p2 == null) {
          return null;
       }
       JSONObject jSONObject = new JSONObject();
       this.l = fq.l(p2);
       if (p0.contains(str)) {
          p0 = p0.substring(0, p0.indexOf(str));
       }
       String str1 = p0.substring((p0.lastIndexOf("#") + 1));
       if (str1.equals("cgi")) {
          jSONObject.put("cgi", p0.substring(0, (p0.length() - 12)));
       }else if(!TextUtils.isEmpty(p1) && p1.indexOf(",access") != -1){
          jSONObject.put("cgi", p0.substring(0, (p0.length() - (str1.length() + 9))));
          String[] stringArray = (p1).split(",access");
          stringArray = ((stringArray[0]).contains("#"))? (stringArray[0]).substring(((stringArray[0]).lastIndexOf("#") + 1)): stringArray[0];
          jSONObject.put("mmac", stringArray);
       }
       try{
          return p.b(ey.a((jSONObject.toString()).getBytes("UTF-8"), this.l));
       }catch(java.io.UnsupportedEncodingException e0){
          return v4;
       }
    }
    public final void a(){
       this.c = 0;
       this.d = null;
    }
    public final void a(Context p0){
       if (this.j != null) {
          return;
       }
       this.c();
       this.a(p0, null, false);
       this.j = true;
       return;
    }
    public final void a(Context p0,String p1,boolean p2){
       JSONObject jSONObject;
       JSONObject jSONObject1;
       SQLiteDatabase sQLiteDataba1;
       ez uoez = this;
       Context uContext = p0;
       String str = p1;
       String str1 = "hist";
       if (!fi.e()) {
          return;
       }
       if (!uContext) {
          return;
       }
       int i = 0;
       SQLiteDatabase sQLiteDataba = uContext.openOrCreateDatabase("hmdb", i, null);
       if (!fq.a(sQLiteDataba, str1)) {
          if (sQLiteDataba != null && sQLiteDataba.isOpen()) {
             sQLiteDataba.close();
          }
          return;
       }else {
          StringBuilder str2 = "";
          String str3 = "\'";
          String str4 = " and feature = \'";
          StringBuilder str5 = "time >";
          if (!p2) {
             str2 = str2+str5+(fq.a() - fi.d());
             if (str) {
                str2 = str2+str4;
                str = str+str3;
             label_0064 :
                str2 = str2+str;
             }
          }else {
             str2 = str2+str5+(fq.a() - 0xa4cb800);
             if (str != null) {
                str2 = str2+str4;
                str = str+str3;
                goto label_0064 ;
             }
          }
          String[] stringArray = new String[]{"feature"," nb","loc"};
          Cursor uCursor = sQLiteDataba.query(str1+uoez.k, stringArray, str2, null, null, null, "time ASC", null);
          str5 = "";
          if (uoez.l == null) {
             uoez.l = fq.l(p0);
          }
          if (uCursor != null && uCursor.moveToFirst()) {
             while (true) {
                str1 = "new";
                String str6 = ",access";
                StringBuilder str7 = "type";
                int i1 = 1;
                if ((uCursor.getString(i)).startsWith("{")) {
                   jSONObject = new JSONObject(uCursor.getString(i));
                   str5.delete(i, str5.length());
                   if (!TextUtils.isEmpty(uCursor.getString(i1))) {
                      str6 = uCursor.getString(i1);
                   }else if(fq.a(jSONObject, "mmac")){
                      str5 = str5+"#"+jSONObject.getString("mmac");
                   }else {
                   label_0119 :
                      jSONObject1 = new JSONObject(uCursor.getString(2));
                      if (fq.a(jSONObject1, str7)) {
                         jSONObject1.put(str7, str1);
                      label_01a4 :
                         eo uoeo = new eo("");
                         uoeo.b(jSONObject1);
                         str6 = "network#";
                         String str8 = "cgi";
                         if (fq.a(jSONObject, "mmac") && fq.a(jSONObject, str8)) {
                            str1 = jSONObject.getString(str8)+"#"+str6;
                            str = ((jSONObject.getString(str8)).contains("#"))? str1+"cgiwifi": str1+"wifi";
                            str = str;
                         }else if(fq.a(jSONObject, str8)){
                            str1 = jSONObject.getString(str8)+"#"+str6;
                            if ((jSONObject.getString(str8)).contains("#")) {
                               str = str1+str8;
                            }
                         }
                         str7 = str2;
                         sQLiteDataba1 = sQLiteDataba;
                      label_025b :
                         if (!uCursor.moveToNext()) {
                            str5.delete(0, str5.length());
                            str7.delete(0, str7.length());
                         }else {
                            str2 = str7;
                            sQLiteDataba = sQLiteDataba1;
                            i = 0;
                         }
                         str7 = str2;
                         sQLiteDataba1 = sQLiteDataba;
                         this.a(str, str5, uoeo, p0, 0);
                         goto label_025b ;
                      }else {
                         goto label_01a4 ;
                      }
                   }
                   str5 = str5+str6;
                   goto label_0119 ;
                }else {
                   JSONObject jSONObject2 = new JSONObject(new String(ey.b(p.b(uCursor.getString(i)), uoez.l), "UTF-8"));
                   str5.delete(0, str5.length());
                   int i2 = 1;
                   if (!TextUtils.isEmpty(uCursor.getString(i2))) {
                      str6 = new String(ey.b(p.b(uCursor.getString(i2)), uoez.l), "UTF-8");
                   }else if(fq.a(jSONObject2, "mmac")){
                      str5 = str5+"#"+jSONObject2.getString("mmac");
                   }else {
                   label_0181 :
                      jSONObject1 = new JSONObject(new String(ey.b(p.b(uCursor.getString(2)), uoez.l), "UTF-8"));
                      if (fq.a(jSONObject1, str7)) {
                         jSONObject1.put(str7, str1);
                      }
                      jSONObject = jSONObject2;
                      goto label_01a4 ;
                   }
                   str5 = str5+str6;
                   goto label_0181 ;
                }
             }
          }else {
             sQLiteDataba1 = sQLiteDataba;
          }
          if (uCursor != null) {
             uCursor.close();
          }
          if (sQLiteDataba1.isOpen()) {
             sQLiteDataba1.close();
          }
          return;
       }
    }
    public final void a(AMapLocationClientOption p0){
       this.g = p0.isNeedAddress();
       this.f = p0.isOffset();
       this.b = p0.isLocationCacheEnable();
       this.h = String.valueOf(p0.getGeoLanguage());
    }
    public final void a(es p0){
       this.e = p0;
    }
    public final void a(String p0){
       this.d = p0;
    }
    public final void a(String p0,AMapLocation p1,StringBuilder p2,Context p3){
       String str = "UTF-8";
       if (p3 == null) {
          return;
       }
       if (this.l == null) {
          this.l = fq.l(p3);
       }
       SQLiteDatabase sQLiteDataba = p3.openOrCreateDatabase("hmdb", 0, null);
       StringBuilder str1 = "CREATE TABLE IF NOT EXISTS hist"+this.k+" \(feature VARCHAR PRIMARY KEY, nb VARCHAR, loc VARCHAR, time VARCHAR\);";
       sQLiteDataba.execSQL(str1);
       str1.delete(0, str1.length());
       str1 = str1+"REPLACE INTO "+"hist"+this.k+" VALUES \(?, ?, ?, ?\)";
       Object[] objArray = new Object[]{this.a(p0, p2, p3),ey.a((p2).getBytes(str), this.l),ey.a((p1.toStr()).getBytes(str), this.l),Long.valueOf(p1.getTime())};
       int i = 1;
       for (; i < 3; i++) {
          objArray[i] = p.b(objArray[i]);
       }
       sQLiteDataba.execSQL(str1, objArray);
       str1.delete(0, str1.length());
       str1.delete(0, str1.length());
       if (sQLiteDataba.isOpen()) {
          sQLiteDataba.close();
       }
       return;
    }
    public final void a(String p0,StringBuilder p1,eo p2,Context p3,boolean p4){
       eo this;
       ez uoez = this;
       StringBuilder str = p1;
       eo uoeo = p2;
       String str1 = "cgiwifi";
       String str2 = "offpct";
       String str3 = "&";
       if (!fq.a(p2)) {
          return;
       }
       String str4 = p0+str3+p2.isOffset()+str3+p2.i()+str3+p2.j();
       if (!ez.a(str4, uoeo)) {
          return;
       }
       if ((p2.e()).equals("mem") || (!(p2.e()).equals("file") && !(p2.e()).equals("wifioff"))) {
          if (("-3").equals(p2.d())) {
             return;
          }else if(this.b()){
             this.c();
          }
          JSONObject jSONObject = p2.f();
          if (fq.a(jSONObject, str2)) {
             jSONObject.remove(str2);
             uoeo.a(jSONObject);
          }
          str3 = ",";
          String str5 = "cgi";
          if (str4.contains("wifi")) {
             if (TextUtils.isEmpty(p1)) {
                return;
             }else if(p2.getAccuracy() - 0x43960000 >= 0){
                String[] stringArray = (p1).split("#");
                int len = stringArray.length;
                int i = 0;
                int i1 = 0;
                while (i < len) {
                   if ((stringArray[i]).contains(str3)) {
                      i1 = i1 + 1;
                   }
                   i = i + 1;
                }
                if (i1 >= 8) {
                   return;
                }
             }else if(p2.getAccuracy() - 0x40400000 <= 0){
                return;
             }
             if (str4.contains(str1) && !TextUtils.isEmpty(p2.g())) {
                str2 = str4.replace(str1, str5);
                eo uoeo1 = p2.h();
                if (fq.a(uoeo1)) {
                   this.a(str2, "", uoeo1, p3, true);
                }
             }
          }else if(str4.contains(str5)){
             if (str != null && str.indexOf(str3) != -1) {
                return;
             }else if(("4").equals(p2.d())){
                return;
             }
          }
          this = this.a(str4, str, false);
          if (fq.a(this) && (this.toStr()).equals(uoeo.toStr(3))) {
             return;
          }else {
             uoez.i = fq.b();
             ez$a uoa = new ez$a();
             uoa.a(uoeo);
             str2 = (TextUtils.isEmpty(p1))? null: p1;
             uoa.a(str2);
             if (uoez.a.containsKey(str4)) {
                uoez.a.get(str4).add(uoa);
             }else {
                ArrayList uArrayList = new ArrayList();
                uArrayList.add(uoa);
                uoez.a.put(str4, uArrayList);
             }
             if (p4) {
                this.a(str4, uoeo, str, p3);
                return;
             }
          }
       }
    label_018c :
       return;
    }
    public final boolean a(eo p0,boolean p1){
       if (!this.a(p1)) {
          return false;
       }
       if (p0 != null && (!fi.a(p0.getTime()) && !p1)) {
          return false;
       }
       return true;
    }
    public final boolean a(boolean p0){
       if (!fi.e() && !p0) {
          return false;
       }
       if (this.b == null && (fi.f() || p0)) {
          return true;
       }
       return false;
    }
    public final void b(Context p0){
       this.c();
       this.c(p0);
       this.j = false;
       this.d = null;
       this.n = 0;
    }
    public final boolean b(){
       ez ti = this.i;
       long l = fq.b() - ti;
       boolean b = false;
       if (!ti) {
       }else if(this.a.size() > 360 || l - 0xa4cb800 > 0){
          b = true;
       }
       return b;
    }
    public final void c(){
       this.i = 0;
       if (!this.a.isEmpty()) {
          this.a.clear();
       }
       this.j = false;
       return;
    }
    public final void c(Context p0){
       String str = "hist";
       if (p0 == null) {
          return;
       }
       int i = 0;
       SQLiteDatabase sQLiteDataba = p0.openOrCreateDatabase("hmdb", i, null);
       if (!fq.a(sQLiteDataba, str)) {
          if (sQLiteDataba != null && sQLiteDataba.isOpen()) {
             sQLiteDataba.close();
          }
          return;
       }else {
          String[] stringArray = new String[]{String.valueOf((fq.a() - 0xa4cb800))};
          sQLiteDataba.delete(str+this.k, "time<?", stringArray);
          if (sQLiteDataba != null && sQLiteDataba.isOpen()) {
             sQLiteDataba.close();
          }
          return;
       }
    }
}
