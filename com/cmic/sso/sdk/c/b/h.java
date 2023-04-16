package com.cmic.sso.sdk.c.b.h;
import com.cmic.sso.sdk.c.b.a;
import java.lang.String;
import java.lang.StringBuilder;
import org.json.JSONObject;
import java.lang.Object;
import org.json.JSONException;

public class h extends a	// class@000f4c
{
    public String x;
    public String y;

    public void h(){
       super();
       this.x = "";
       this.y = "";
    }
    public String a(String p0){
       return this.b+this.c+this.d+this.e+this.f+this.g+this.h+this.i+this.j+this.m+this.n+p0+this.o+this.q+this.r+this.s+this.t+this.u+this.v+this.x+this.y+this.w;
    }
    public void a_(String p0){
       this.v = this.v(p0);
    }
    public JSONObject b(){
       JSONObject jSONObject;
       try{
          jSONObject = new JSONObject();
          jSONObject.put("ver", this.a);
          jSONObject.put("sdkver", this.b);
          jSONObject.put("appid", this.c);
          jSONObject.put("imsi", this.d);
          jSONObject.put("operatortype", this.e);
          jSONObject.put("networktype", this.f);
          jSONObject.put("mobilebrand", this.g);
          jSONObject.put("mobilemodel", this.h);
          jSONObject.put("mobilesystem", this.i);
          jSONObject.put("clienttype", this.j);
          jSONObject.put("interfacever", this.k);
          jSONObject.put("expandparams", this.l);
          jSONObject.put("msgid", this.m);
          jSONObject.put("timestamp", this.n);
          jSONObject.put("subimsi", this.o);
          jSONObject.put("sign", this.p);
          jSONObject.put("apppackage", this.q);
          jSONObject.put("appsign", this.r);
          jSONObject.put("ipv4_list", this.s);
          jSONObject.put("ipv6_list", this.t);
          jSONObject.put("sdkType", this.u);
          jSONObject.put("tempPDR", this.v);
          jSONObject.put("scrip", this.x);
          jSONObject.put("userCapaid", this.y);
          jSONObject.put("funcType", this.w);
       }catch(org.json.JSONException e1){
          e1.printStackTrace();
       }
       return jSONObject;
    }
    public String toString(){
       return this.a+"&"+this.b+"&"+this.c+"&"+this.d+"&"+this.e+"&"+this.f+"&"+this.g+"&"+this.h+"&"+this.i+"&"+this.j+"&"+this.k+"&"+this.l+"&"+this.m+"&"+this.n+"&"+this.o+"&"+this.p+"&"+this.q+"&"+this.r+"&&"+this.s+"&"+this.t+"&"+this.u+"&"+this.v+"&"+this.x+"&"+this.y+"&"+this.w;
    }
    public void x(String p0){
       this.x = this.v(p0);
    }
    public void y(String p0){
       this.y = this.v(p0);
    }
}
