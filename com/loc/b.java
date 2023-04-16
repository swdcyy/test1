package com.loc.b;
import android.content.Context;
import java.lang.Object;
import com.loc.q;
import com.loc.bg;
import java.lang.String;
import java.util.Map;
import java.util.HashMap;
import com.loc.l;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import com.loc.fd;
import com.loc.n;
import com.loc.x;
import java.net.Proxy;
import com.loc.v;
import com.loc.bl;
import com.loc.fj;
import com.loc.bm;
import java.lang.Throwable;

public final class b	// class@00137f
{
    public bg a;

    public void b(Context p0){
       super();
       this.a = null;
       q.a().a(p0);
       this.a = bg.a();
    }
    public static Map b(Context p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7){
       HashMap hashMap = new HashMap(16);
       hashMap.put("key", l.f(p0));
       if (!TextUtils.isEmpty(p1)) {
          hashMap.put("keywords", p1);
       }
       if (!TextUtils.isEmpty(p2)) {
          hashMap.put("types", p2);
       }
       if (!TextUtils.isEmpty(p5) && !TextUtils.isEmpty(p6)) {
          hashMap.put("location", p6+","+p5);
       }
       if (!TextUtils.isEmpty(p3)) {
          hashMap.put("city", p3);
       }
       if (!TextUtils.isEmpty(p4)) {
          hashMap.put("offset", p4);
       }
       if (!TextUtils.isEmpty(p7)) {
          hashMap.put("radius", p7);
       }
       return hashMap;
    }
    public final String a(Context p0,String p1,String p2){
       Map map = b.b(p0, p2, null, null, null, null, null, null);
       map.put("extensions", "all");
       map.put("subdistrict", "0");
       return this.a(p0, p1, map);
    }
    public final String a(Context p0,String p1,String p2,String p3,String p4,String p5){
       Map map = b.b(p0, p2, p3, p4, p5, null, null, null);
       map.put("children", "1");
       map.put("page", "1");
       map.put("extensions", "base");
       return this.a(p0, p1, map);
    }
    public final String a(Context p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7){
       Map map = b.b(p0, p2, p3, null, p4, p5, p6, p7);
       map.put("children", "1");
       map.put("page", "1");
       map.put("extensions", "base");
       return this.a(p0, p1, map);
    }
    public final String a(Context p0,String p1,Map p2){
       HashMap hashMap = new HashMap(16);
       fd uofd = new fd();
       hashMap.clear();
       hashMap.put("Content-Type", "application/x-www-form-urlencoded");
       hashMap.put("Connection", "Keep-Alive");
       hashMap.put("User-Agent", "AMAP_Location_SDK_Android 6.1.0");
       String str = n.a();
       String str1 = n.a(p0, str, x.b(p2));
       p2.put("ts", str);
       p2.put("scode", str1);
       uofd.b(p2);
       uofd.a(hashMap);
       uofd.b(p1);
       uofd.a(v.a(p0));
       uofd.a(fj.i);
       uofd.b(fj.i);
       p1 = new String(bg.a(uofd).a, "utf-8");
       return p1;
    }
}
