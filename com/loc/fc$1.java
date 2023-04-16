package com.loc.fc$1;
import com.loc.ck;
import com.loc.fc;
import java.lang.StringBuilder;
import java.lang.String;
import com.loc.fi;
import com.loc.fd;
import com.loc.bl$a;
import com.loc.bl;
import com.loc.bl$c;
import com.loc.bg;
import com.loc.bm;
import org.json.JSONObject;
import org.json.JSONArray;
import com.loc.el;
import java.lang.Object;
import java.lang.Throwable;
import android.content.Context;
import com.loc.fo;

public final class fc$1 extends ck	// class@001426
{
    public final int a;
    public final fc b;

    public void fc$1(fc p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final void a(){
       String str = "ttl";
       String str1 = "ipsv6";
       String str2 = "ips";
       String str3 = "http://"+fi.q()+"?host=dualstack-a.apilocate.amap.com&query=";
       int i = (this.a == fc.b)? 6: 4;
       str3 = str3+i;
       fd uofd = new fd();
       uofd.b(str3);
       uofd.c(str3);
       uofd.a(bl$a.e);
       uofd.a(bl$c.a);
       bg.a();
       bm uobm = bg.a(uofd);
       JSONObject jSONObject = new JSONObject(new String(uobm.a));
       String[] stringArray = fc.a(jSONObject.optJSONArray(str2), fc.a);
       if (stringArray != null && (stringArray.length > 0 && !fc.a(stringArray, fc.a(this.b, fc.a).a()))) {
          fc.a(this.b, fc.a).a(stringArray);
          fc.b(this.b, fc.a);
       }
    label_0084 :
       stringArray = fc.a(jSONObject.optJSONArray(str1), fc.b);
       if (stringArray != null && (stringArray.length > 0 && !fc.a(stringArray, fc.a(this.b, fc.b).a()))) {
          fc.a(this.b, fc.b).a(stringArray);
          fc.b(this.b, fc.b);
       }
    label_00b7 :
       if (jSONObject.has(str2) || (jSONObject.has(str1) && jSONObject.has(str))) {
          int intx = jSONObject.getInt(str);
          if (intx > 30) {
             fc.a(this.b, (long)(intx * 1000));
          }
       }
       return;
    }
}
