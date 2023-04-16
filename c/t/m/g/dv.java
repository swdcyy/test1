package c.t.m.g.dv;
import android.os.Parcelable;
import com.tencent.map.geolocation.TencentLocation;
import c.t.m.g.dv$1;
import java.lang.Object;
import android.os.Bundle;
import android.os.SystemClock;
import java.lang.System;
import java.lang.String;
import org.json.JSONObject;
import c.t.m.g.dr;
import c.t.m.g.dq;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import c.t.m.g.ed;
import java.lang.StringBuilder;
import c.t.m.g.dp;
import java.lang.Throwable;
import c.t.m.g.dt;
import android.location.Location;
import com.tencent.map.geolocation.util.SoUtils;
import org.json.JSONException;
import java.lang.Math;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import com.tencent.map.geolocation.TencentPoi;
import android.os.Parcel;

public class dv implements Parcelable, TencentLocation	// class@000c58
{
    public dr b;
    public dq c;
    public int d;
    public int e;
    public String f;
    public dp g;
    public final Bundle h;
    public String i;
    public Location j;
    public final long k;
    public long l;
    public long m;
    public int n;
    public static final Parcelable$Creator CREATOR;
    public static final dv a;

    static {
       dv.CREATOR = new dv$1();
       dv.a = new dv(-1);
    }
    public void dv(int p0){
       super();
       this.h = new Bundle(9);
       this.i = "network";
       this.d = p0;
       this.k = SystemClock.elapsedRealtime();
       this.l = System.currentTimeMillis();
    }
    public void dv(int p0,dv$1 p1){
       super(p0);
    }
    public void dv(String p0){
       String str = "icontrol";
       String str1 = "TxLocation";
       super();
       this.h = new Bundle(9);
       this.i = "network";
       this.k = SystemClock.elapsedRealtime();
       this.l = System.currentTimeMillis();
       try{
          JSONObject jSONObject = new JSONObject(p0);
          this.b = new dr(jSONObject.getJSONObject("location"));
          this.c = new dq(jSONObject.getJSONObject("indoorinfo"));
          this.f = jSONObject.optString("bearing");
          int i = 0;
          this.e = jSONObject.optInt("fackgps", i);
          long l = jSONObject.optLong("timestamp", System.currentTimeMillis());
          this.m = l;
          try{
             this.l = l;
             p0 = jSONObject.optString(str);
             if (!TextUtils.isEmpty(p0)) {
                this.h.putInt(str, Integer.valueOf(p0.split(",")[i]).intValue());
                if (ed.a) {
                   ed.b(str1, "TxLocation control:"+p0);
                }
             }
          }catch(java.lang.Exception e0){
             if (ed.a) {
                ed.b(str1, "parse icontrol failed");
             }
          }
          JSONObject jSONObject1 = jSONObject.optJSONObject("details");
          if (jSONObject1 != null) {
             try{
                this.g = new dp(jSONObject1);
             }catch(org.json.JSONException e7){
                if (ed.a) {
                   ed.a(str1, "details object not found", e7);
                }
                throw e7;
             }
          }else {
             jSONObject1 = jSONObject.optJSONObject("addrdesp");
             if (jSONObject1 != null) {
                str = "detail";
                if (jSONObject1.has(str)) {
                   this.g = new dp(jSONObject1.optJSONObject(str));
                }
             }
          }
          dv tg = this.g;
          if (tg != null) {
             dp c = tg.c;
             if (c != null) {
                this.h.putAll(c.n);
             }
          }
          return;
       }catch(org.json.JSONException e7){
          throw e7;
       }
    }
    public void dv(String p0,dv$1 p1){
       super(p0);
    }
    public static long a(dv p0,long p1){
       p0.l = p1;
       return p1;
    }
    public static dp a(dv p0,dp p1){
       p0.g = p1;
       return p1;
    }
    public static dr a(dv p0,dr p1){
       p0.b = p1;
       return p1;
    }
    public static dv a(dv p0,int p1){
       p0.n = p1;
       return p0;
    }
    public static dv a(dv p0,Location p1){
       return p0.b(p1);
    }
    public static dv a(dv p0,dv p1){
       if (p0 != null && p1 != null) {
          dv b = p1.b;
          if (b != null) {
             dv b1 = p0.b;
             if (b1 == null) {
                b1 = new dr();
             }
             b1.e = b.e;
             b1.f = b.f;
             p0.b = b1;
          }
          p0.g = dp.a(p1.g);
       }
       return p0;
    }
    public static dv a(dv p0,boolean p1){
       try{
          if (p0 != null) {
             dv f = p0.f;
             if (f != null && !p1) {
                String[] stringArray = null;
                int i = -70;
                if (f != null) {
                   String str = ",";
                   if (f.split(str).length > 1) {
                      stringArray = Integer.parseInt(f.split(str)[1]);
                   }
                }
                f = p0.b;
                if (f != null) {
                   if (ed.a) {
                      ed.a("hh", "fun_r");
                   }
                   f.d = (float)SoUtils.fun_r((double)f.d, stringArray, i);
                }
             }
          }
       label_003a :
          return p0;
       }catch(java.lang.UnsatisfiedLinkError e0){
       }
    }
    public static String a(dv p0,String p1){
       p0.i = p1;
       return p1;
    }
    public static void a(dv p0){
       if (p0 != dv.a) {
          return;
       }
       throw new JSONException("location failed");
    }
    public static long b(dv p0,long p1){
       p0.m = p1;
       return p1;
    }
    public static Bundle b(dv p0){
       return p0.h;
    }
    public static dv b(dv p0,int p1){
       return p0.a(p1);
    }
    public static dv b(dv p0,String p1){
       return p0.a(p1);
    }
    public static dv c(dv p0){
       return dv.d(p0);
    }
    public static dv d(dv p0){
       dv uodv = new dv(-1);
       if (p0 == null) {
          uodv.b = new dr();
       }else {
          uodv.b = dr.a(p0.b);
          uodv.d = p0.d;
          uodv.f = p0.f;
          uodv.g = dp.a(p0.g);
          if (p0.h.size() > 0) {
             uodv.h.putAll(p0.h);
          }
       }
       return uodv;
    }
    public final dv a(int p0){
       this.d = p0;
       return this;
    }
    public dv a(long p0){
       this.l = p0;
       return this;
    }
    public final dv a(String p0){
       this.i = p0;
       return this;
    }
    public String a(){
       dv tg = this.g;
       dt d = (tg != null)? tg.c.d: null;
       return d;
    }
    public void a(double p0,double p1){
       this.b.a = (double)Math.round((p0 * 1000000.00f)) / 1000000.00f;
       p0.b = (double)Math.round((p1 * 1000000.00f)) / 1000000.00f;
    }
    public void a(Location p0){
       if (p0 != null && this.b != null) {
          dv tb = this.b;
          tb.a = (double)Math.round((p0.getLatitude() * 1000000.00f)) / 1000000.00f;
          tb.b = (double)Math.round((p0.getLongitude() * 1000000.00f)) / 1000000.00f;
          tb.c = p0.getAltitude();
          this.b.d = p0.getAccuracy();
       }
       return;
    }
    public long b(){
       return this.m;
    }
    public final dv b(Location p0){
       this.j = p0;
       return this;
    }
    public int describeContents(){
       return 0;
    }
    public float getAccuracy(){
       dv tb = this.b;
       dr d = (tb != null)? tb.d: 0;
       return d;
    }
    public String getAddress(){
       dv td = this.d;
       if (td == 5) {
          return this.h.getString("addrdesp.name");
       }
       dt uodt = null;
       if (td == 3) {
          td = this.g;
          if (td != null) {
             uodt = td.c.m;
          }
          return uodt;
       }else {
          td = this.b;
          if (td != null) {
             uodt = td.f;
          }
          return uodt;
       }
    }
    public double getAltitude(){
       dv tb = this.b;
       dr c = (tb != null)? tb.c: 0;
       return c;
    }
    public Integer getAreaStat(){
       dv tg = this.g;
       Integer integer = (tg != null)? Integer.valueOf(tg.a): null;
       return integer;
    }
    public float getBearing(){
       dv tj = this.j;
       float f = (tj == null)? 0: tj.getBearing();
       return f;
    }
    public String getCity(){
       dv tg = this.g;
       dt g = (tg != null)? tg.c.g: null;
       return g;
    }
    public String getCityCode(){
       dv tg = this.g;
       dt d = (tg != null)? tg.c.d: null;
       return d;
    }
    public String getCityPhoneCode(){
       dv tg = this.g;
       dt e = (tg != null)? tg.c.e: null;
       return e;
    }
    public int getCoordinateType(){
       return this.n;
    }
    public double getDirection(){
       dv th = this.h;
       if (th != null) {
          return th.getDouble("direction");
       }
       return Double.NaN;
    }
    public String getDistrict(){
       dv tg = this.g;
       dt h = (tg != null)? tg.c.h: null;
       return h;
    }
    public long getElapsedRealtime(){
       return this.k;
    }
    public Bundle getExtra(){
       return this.h;
    }
    public int getGPSRssi(){
       dv tj = this.j;
       if (tj == null) {
          return 0;
       }
       Bundle extras = tj.getExtras();
       if (extras == null) {
          return 0;
       }
       return extras.getInt("rssi", 0);
    }
    public String getIndoorBuildingFloor(){
       dv tc = this.c;
       dq b = (tc != null)? tc.b: "1000";
       return b;
    }
    public String getIndoorBuildingId(){
       dv tc = this.c;
       dq a = (tc != null)? tc.a: null;
       return a;
    }
    public int getIndoorLocationType(){
       dv tc = this.c;
       dq c = (tc != null)? tc.c: -1;
       return c;
    }
    public double getLatitude(){
       dv tb = this.b;
       dr a = (tb != null)? tb.a: 0;
       return a;
    }
    public double getLongitude(){
       dv tb = this.b;
       dr b = (tb != null)? tb.b: 0;
       return b;
    }
    public String getName(){
       dv td = this.d;
       if (td == 5) {
          return this.h.getString("addrdesp.name");
       }
       dt uodt = null;
       if (td == 3) {
          td = this.g;
          if (td != null) {
             uodt = td.c.c;
          }
          return uodt;
       }else {
          td = this.b;
          if (td != null) {
             uodt = td.e;
          }
          return uodt;
       }
    }
    public String getNation(){
       dv tg = this.g;
       dt b = (tg != null)? tg.c.b: null;
       return b;
    }
    public List getPoiList(){
       ArrayList uArrayList = (this.g != null)? new ArrayList(this.g.b): Collections.emptyList();
       return uArrayList;
    }
    public String getProvider(){
       return this.i;
    }
    public String getProvince(){
       dv tg = this.g;
       dt f = (tg != null)? tg.c.f: null;
       return f;
    }
    public float getSpeed(){
       dv tj = this.j;
       float f = (tj == null)? 0: tj.getSpeed();
       return f;
    }
    public String getStreet(){
       dv tg = this.g;
       dt k = (tg != null)? tg.c.k: null;
       return k;
    }
    public String getStreetNo(){
       dv tg = this.g;
       dt l = (tg != null)? tg.c.l: null;
       return l;
    }
    public long getTime(){
       return this.l;
    }
    public String getTown(){
       dv tg = this.g;
       dt i = (tg != null)? tg.c.i: null;
       return i;
    }
    public String getVillage(){
       dv tg = this.g;
       dt j = (tg != null)? tg.c.j: null;
       return j;
    }
    public int isMockGps(){
       return this.e;
    }
    public String toString(){
       String str = ",";
       StringBuilder str1 = "TencentLocation{"+"level="+this.d+str+"name="+this.getName()+str+"address="+this.getAddress()+str+"provider="+this.getProvider()+str+"latitude="+this.getLatitude()+str+"longitude="+this.getLongitude()+str+"altitude="+this.getAltitude()+str+"accuracy="+this.getAccuracy()+str+"cityCode="+this.getCityCode()+str+"areaStat="+this.getAreaStat()+str+"nation="+this.getNation()+str+"province="+this.getProvince()+str+"city="+this.getCity()+str+"district="+this.getDistrict()+str+"street="+this.getStreet()+str+"streetNo="+this.getStreetNo()+str+"town="+this.getTown()+str+"village="+this.getVillage()+str+"bearing="+this.getBearing()+str+"time="+this.getTime()+str+"poilist=[";
       Iterator iterator = this.getPoiList().iterator();
       while (iterator.hasNext()) {
          str1 = str1+iterator.next()+str;
       }
       return str1+"]"+"}";
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeInt(this.d);
       p0.writeString(this.getProvider());
       p0.writeDouble(this.getLatitude());
       p0.writeDouble(this.getLongitude());
       p0.writeDouble((double)this.getAccuracy());
       p0.writeDouble(this.getAltitude());
       p0.writeString(this.getAddress());
       p0.writeString(this.getNation());
       p0.writeString(this.getProvince());
       p0.writeString(this.getCity());
       p0.writeString(this.getDistrict());
       p0.writeString(this.getStreet());
       p0.writeString(this.getStreetNo());
       p0.writeString(this.a());
       p0.writeString(this.getName());
       p0.writeLong(this.l);
       p0.writeLong(this.m);
       p0.writeBundle(this.h);
    }
}
