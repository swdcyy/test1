package com.kuaishou.weapon.ks.bn;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.System;
import android.content.Context;
import org.json.JSONObject;
import com.kuaishou.weapon.ks.bs;

public class bn	// class@0011ea
{
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;

    public void bn(String p0,String p1){
       super();
       this.i = System.currentTimeMillis()+"";
       this.c = p0;
       this.g = p1;
    }
    public String a(){
       return this.h;
    }
    public JSONObject a(Context p0){
       this.a(bs.e(p0));
       this.b(bs.a());
       this.c(bs.b(p0));
       this.d(bs.c(p0));
       this.e(bs.d(p0));
       this.f("5.9.2");
       this.g("");
       this.h(bs.a);
       return this.b();
    }
    public void a(String p0){
       this.a = p0;
    }
    public final JSONObject b(){
       JSONObject jSONObject = new JSONObject();
       jSONObject.put("1", this.a);
       jSONObject.put("2", this.b);
       jSONObject.put("3", this.c);
       jSONObject.put("4", this.d);
       jSONObject.put("5", this.e);
       jSONObject.put("6", this.f);
       jSONObject.put("7", this.g);
       jSONObject.put("8", this.h);
       jSONObject.put("9", this.i);
       jSONObject.put("11", this.j);
       jSONObject.put("12", this.l);
       jSONObject.put("13", "com.kuaishou.weapon");
       return jSONObject;
    }
    public void b(String p0){
       this.b = p0;
    }
    public void c(String p0){
       this.d = p0;
    }
    public void d(String p0){
       this.e = p0;
    }
    public void e(String p0){
       this.f = p0;
    }
    public void f(String p0){
       this.h = p0;
    }
    public void g(String p0){
       this.j = p0;
    }
    public void h(String p0){
       this.l = p0;
    }
}
