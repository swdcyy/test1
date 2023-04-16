package com.loc.ap;
import com.loc.r;
import java.util.Map;
import java.util.HashMap;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import com.loc.n;
import com.loc.q;
import java.lang.StringBuffer;
import java.util.Iterator;
import org.json.JSONObject;
import java.lang.StringBuilder;
import java.net.URLEncoder;
import com.loc.l;
import java.lang.Throwable;

public final class ap extends r	// class@001374
{
    public JSONObject a;
    public Context b;

    public void ap(){
       super();
       this.a = null;
       this.b = null;
    }
    public final Map a(){
       HashMap hashMap = new HashMap();
       hashMap.put("Content-Type", "application/x-www-form-urlencoded");
       hashMap.put("Accept-Encoding", "gzip");
       hashMap.put("User-Agent", "AMAP SDK Android core 4.2.9");
       hashMap.put("X-INFO", n.a(this.b));
       Object[] objArray = new Object[]{"4.2.9","core"};
       hashMap.put("platinfo", String.format("platform=Android&sdkversion=%s&product=%s", objArray));
       hashMap.put("logversion", "2.1");
       return hashMap;
    }
    public final String b(){
       if (q.a().b()) {
          return "https://restsdk.amap.com/sdk/compliance/params";
       }
       return "http://restsdk.amap.com/sdk/compliance/params";
    }
    public final Map d(){
       return null;
    }
    public final byte[] e(){
       String str1;
       StringBuffer str = "";
       ap ta = this.a;
       if (ta != null) {
          Iterator iterator = ta.keys();
          while (iterator.hasNext()) {
             str1 = iterator.next();
             StringBuilder str2 = str1;
             str = str+str2+"="+URLEncoder.encode(this.a.get(str1).toString(), "utf-8")+"&";
          }
       }
       String str3 = l.f(this.b);
       str1 = n.a();
       byte[] bytes = (str+"output=json"+("&key=").concat(String.valueOf(str3))+("&ts=").concat(String.valueOf(str1))+"&scode="+n.a(this.b, str1, ("key=").concat(String.valueOf(str3)))).getBytes("utf-8");
       return bytes;
    }
    public final String h(){
       return "core";
    }
}
