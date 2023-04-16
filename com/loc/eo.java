package com.loc.eo;
import com.amap.api.location.AMapLocation;
import java.lang.String;
import com.amap.api.location.AMapLocationClientOption$GeoLanguage;
import java.lang.Object;
import org.json.JSONObject;
import com.loc.fj;
import com.loc.fq;
import java.lang.Throwable;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.location.Location;

public final class eo extends AMapLocation	// class@001410
{
    public String d;
    public boolean e;
    public String f;
    public String g;
    public String h;
    public int i;
    public String j;
    public int k;
    public String l;
    public JSONObject m;
    public String n;
    public String o;
    public String p;

    public void eo(String p0){
       super(p0);
       this.d = "";
       this.g = null;
       this.h = "";
       this.j = "";
       this.k = 0;
       this.l = "new";
       this.m = null;
       this.n = "";
       this.e = true;
       this.f = String.valueOf(AMapLocationClientOption$GeoLanguage.DEFAULT);
       this.o = "";
       this.p = null;
    }
    public final String a(){
       return this.g;
    }
    public final void a(int p0){
       this.k = p0;
    }
    public final void a(String p0){
       this.g = p0;
    }
    public final void a(JSONObject p0){
       this.m = p0;
    }
    public final void a(boolean p0){
       this.e = p0;
    }
    public final String b(){
       return this.h;
    }
    public final void b(String p0){
       this.h = p0;
    }
    public final void b(JSONObject p0){
       String str = "floor";
       String str1 = "pid";
       String str2 = "poiid";
       fj.a(this, p0);
       this.e(p0.optString("type", this.l));
       this.d(p0.optString("retype", this.j));
       this.j(p0.optString("cens", this.o));
       this.g(p0.optString("desc", this.d));
       this.c(p0.optString("coord", String.valueOf(this.i)));
       this.i(p0.optString("mcell", this.n));
       this.a(p0.optBoolean("isReversegeo", this.e));
       this.f(p0.optString("geoLanguage", this.f));
       if (fq.a(p0, str2)) {
          this.setBuildingId(p0.optString(str2));
       }
       if (fq.a(p0, str1)) {
          this.setBuildingId(p0.optString(str1));
       }
       if (fq.a(p0, str)) {
          this.setFloor(p0.optString(str));
       }
       if (fq.a(p0, "flr")) {
          this.setFloor(p0.optString("flr"));
       }
       return;
    }
    public final int c(){
       return this.i;
    }
    public final void c(String p0){
       int i;
       if (!TextUtils.isEmpty(p0)) {
          if (p0.equals("0")) {
             i = 0;
          }else if(p0.equals("1")){
             i = 1;
          }else {
          label_001a :
             i = -1;
          }
       }else {
          goto label_001a ;
       }
       this.i = i;
       i = (this.i == null)? "WGS84": "GCJ02";
       super.setCoordType(i);
       return;
    }
    public final String d(){
       return this.j;
    }
    public final void d(String p0){
       this.j = p0;
    }
    public final String e(){
       return this.l;
    }
    public final void e(String p0){
       this.l = p0;
    }
    public final JSONObject f(){
       return this.m;
    }
    public final void f(String p0){
       this.f = p0;
    }
    public final String g(){
       return this.n;
    }
    public final void g(String p0){
       this.d = p0;
    }
    public final eo h(){
       String str = this.g();
       if (TextUtils.isEmpty(str)) {
          return null;
       }
       String[] stringArray = str.split(",");
       if (stringArray.length != 3) {
          return null;
       }
       eo uoeo = new eo("");
       uoeo.setProvider(this.getProvider());
       uoeo.setLongitude(fq.c(stringArray[0]));
       uoeo.setLatitude(fq.c(stringArray[1]));
       uoeo.setAccuracy(fq.d(stringArray[2]));
       uoeo.setCityCode(this.getCityCode());
       uoeo.setAdCode(this.getAdCode());
       uoeo.setCountry(this.getCountry());
       uoeo.setProvince(this.getProvince());
       uoeo.setCity(this.getCity());
       uoeo.setTime(this.getTime());
       uoeo.e(this.e());
       uoeo.c(String.valueOf(this.c()));
       if (!fq.a(uoeo)) {
          return null;
       }
       return uoeo;
    }
    public final void h(String p0){
       this.p = p0;
    }
    public final void i(String p0){
       this.n = p0;
    }
    public final boolean i(){
       return this.e;
    }
    public final String j(){
       return this.f;
    }
    public final void j(String p0){
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       String[] stringArray = p0.split("\\*");
       int len = stringArray.length;
       int i = 0;
       while (i < len) {
          object oobject = stringArray[i];
          if (!TextUtils.isEmpty(oobject)) {
             stringArray = oobject.split(",");
             this.setLongitude(fq.c(stringArray[0]));
             this.setLatitude(fq.c(stringArray[1]));
             this.setAccuracy((float)fq.e(stringArray[2]));
             break ;
          }else {
             i = i + 1;
          }
       }
       this.o = p0;
       return;
    }
    public final String k(){
       return this.p;
    }
    public final int l(){
       return this.k;
    }
    public final JSONObject toJson(int p0){
       String str = "offpct";
       JSONObject jSONObject = super.toJson(p0);
       if (p0 != 1) {
          if (p0 != 2 && p0 != 3) {
          label_006e :
             return jSONObject;
          }
       }else {
          jSONObject.put("retype", this.j);
          jSONObject.put("cens", this.o);
          jSONObject.put("coord", this.i);
          jSONObject.put("mcell", this.n);
          jSONObject.put("desc", this.d);
          jSONObject.put("address", this.getAddress());
          if (this.m != null && fq.a(jSONObject, str)) {
             jSONObject.put(str, this.m.getString(str));
          }
       }
       jSONObject.put("type", this.l);
       jSONObject.put("isReversegeo", this.e);
       jSONObject.put("geoLanguage", this.f);
       goto label_006e ;
    }
    public final String toStr(){
       return this.toStr(1);
    }
    public final String toStr(int p0){
       JSONObject jSONObject = this.toJson(p0);
       jSONObject.put("nb", this.p);
       if (jSONObject == null) {
          return null;
       }
       return jSONObject.toString();
    }
}
