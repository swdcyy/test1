package com.cmic.sso.sdk.c.c.c;
import java.lang.String;
import com.cmic.sso.sdk.c.b.g;
import java.util.Map;
import java.lang.Object;
import java.util.HashMap;
import org.json.JSONObject;
import android.net.Network;
import com.cmic.sso.sdk.e.e;
import java.lang.CharSequence;

public class c	// class@000f51
{
    public String a;
    public final String b;
    public final Map c;
    public final String d;
    public boolean e;
    public final String f;
    public Network g;
    public long h;
    public final String i;
    public int j;
    public final g k;

    public void c(String p0,g p1,String p2,String p3){
       super(p0, null, p1, p2, p3);
    }
    public void c(String p0,Map p1,g p2,String p3,String p4){
       HashMap hashMap;
       super();
       this.e = false;
       this.b = p0;
       this.k = p2;
       if (p1 == null) {
          hashMap = new HashMap();
       }
       this.c = hashMap;
       p0 = "";
       String str = (p2 == null)? p0: p2.b().toString();
       this.a = str;
       this.d = p3;
       this.f = p4;
       if (p2 != null) {
          p0 = p2.a();
       }
       this.i = p0;
       this.l();
       return;
    }
    public String a(){
       return this.b;
    }
    public void a(long p0){
       this.h = p0;
    }
    public void a(Network p0){
       this.g = p0;
    }
    public void a(String p0,String p1){
       this.c.put(p0, p1);
    }
    public void a(boolean p0){
       this.e = p0;
    }
    public boolean b(){
       return this.e;
    }
    public Map c(){
       return this.c;
    }
    public String d(){
       return this.a;
    }
    public String e(){
       return this.d;
    }
    public String f(){
       return this.f;
    }
    public boolean g(){
       boolean b = (e.a(this.f) && ((this.b).contains("logReport") || (this.b).contains("uniConfig")))? true: false;
       return b;
    }
    public Network h(){
       return this.g;
    }
    public long i(){
       return this.h;
    }
    public boolean j(){
       c tj = this.j;
       this.j = tj + 1;
       boolean b = (tj < 2)? true: false;
       return b;
    }
    public g k(){
       return this.k;
    }
    public final void l(){
       this.c.put("sdkVersion", "quick_login_android_9.5.1");
       this.c.put("Content-Type", "application/json");
       this.c.put("CMCC-EncryptType", "STD");
       this.c.put("traceId", this.f);
       this.c.put("appid", this.i);
       this.c.put("Connection", "close");
    }
}
