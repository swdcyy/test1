package com.loc.m$c;
import com.loc.bh;
import android.content.Context;
import com.loc.w;
import java.lang.String;
import com.loc.bl$c;
import com.loc.bl;
import com.loc.bl$a;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;
import android.net.Uri$Builder;
import java.util.Map;
import java.util.HashMap;
import java.lang.Object;
import com.loc.o;
import java.lang.StringBuilder;
import com.loc.s;
import android.os.Build$VERSION;
import android.os.Build;
import com.loc.x;

public final class m$c extends bh	// class@001450
{
    public String h;
    public Map i;
    public String j;
    public String k;
    public String l;

    public void m$c(Context p0,w p1,String p2,String p3,String p4,String p5){
       super(p0, p1);
       this.h = p2;
       this.i = null;
       this.j = p3;
       this.k = p4;
       this.l = p5;
       this.a(bl$c.b);
       this.a(bl$a.d);
    }
    public static String a(String p0,String p1){
       if (!TextUtils.isEmpty(p1)) {
          p0 = Uri.parse(p0).buildUpon().encodedAuthority(p1).build().toString();
       }
       return p0;
    }
    public final Map a(){
       if (TextUtils.isEmpty(this.l)) {
          return null;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("host", this.l);
       return hashMap;
    }
    public final byte[] a_(){
       return null;
    }
    public final String b(){
       return m$c.a("https://restsdk.amap.com/v3/iasdkauth", this.j);
    }
    public final byte[] b_(){
       String str = o.u(this.a);
       if (!TextUtils.isEmpty(str)) {
          str = s.a((str).reverse());
       }
       HashMap hashMap = new HashMap();
       String str1 = (TextUtils.isEmpty(this.h))? "": this.h;
       hashMap.put("authkey", str1);
       hashMap.put("plattype", "android");
       hashMap.put("product", this.b.a());
       hashMap.put("version", this.b.b());
       hashMap.put("output", "json");
       hashMap.put("androidversion", Build$VERSION.SDK_INT);
       hashMap.put("deviceId", str);
       hashMap.put("manufacture", Build.MANUFACTURER);
       m$c ti = this.i;
       if (ti != null && !ti.isEmpty()) {
          hashMap.putAll(this.i);
       }
       hashMap.put("abitype", x.a(this.a));
       hashMap.put("ext", this.b.d());
       return x.a(x.a(hashMap));
    }
    public final String c(){
       return m$c.a("https://dualstack-arestapi.amap.com/v3/iasdkauth", this.k);
    }
    public final String f(){
       return "3.0";
    }
    public final String g(){
       if (!TextUtils.isEmpty(this.l)) {
          return this.l;
       }
       return super.g();
    }
}
