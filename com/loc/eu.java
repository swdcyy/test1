package com.loc.eu;
import java.lang.Object;
import java.lang.String;
import org.json.JSONObject;
import java.lang.Throwable;
import com.loc.fj;
import java.lang.Class;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.util.Objects;

public final class eu	// class@00141b
{
    public int a;
    public double b;
    public double c;
    public long d;
    public int e;
    public int f;
    public int g;
    public int h;

    public void eu(){
       super();
       this.a = 0;
       this.b = 0;
       this.c = 0;
       this.d = 0;
       this.e = 0;
       this.f = 0;
       this.g = 63;
       this.h = 0;
    }
    public final String a(){
       JSONObject jSONObject = new JSONObject();
       jSONObject.put("time", this.d);
       jSONObject.put("lon", this.c);
       jSONObject.put("lat", this.b);
       jSONObject.put("radius", this.e);
       jSONObject.put("locationType", this.a);
       jSONObject.put("reType", this.g);
       jSONObject.put("reSubType", this.h);
       if (jSONObject == null) {
          return "";
       }
       return jSONObject.toString();
    }
    public final void a(JSONObject p0){
       this.b = p0.optDouble("lat", this.b);
       this.c = p0.optDouble("lon", this.c);
       this.a = p0.optInt("locationType", this.a);
       this.g = p0.optInt("reType", this.g);
       this.h = p0.optInt("reSubType", this.h);
       this.e = p0.optInt("radius", this.e);
       this.d = p0.optLong("time", this.d);
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || (eu.class == p0.getClass() && (this.a == p0.a && (!Double.compare(p0.b, this.b) && (!Double.compare(p0.c, this.c) && (!this.d - p0.d && (this.e == p0.e && (this.f == p0.f && (this.g == p0.g && this.h == p0.h))))))))) {
          return true;
       }
       return false;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{Integer.valueOf(this.a),Double.valueOf(this.b),Double.valueOf(this.c),Long.valueOf(this.d),Integer.valueOf(this.e),Integer.valueOf(this.f),Integer.valueOf(this.g),Integer.valueOf(this.h)};
       return Objects.hash(objArray);
    }
}
