package com.kuaishou.weapon.ks.be;
import java.lang.Runnable;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.weapon.ks.d;
import java.util.HashMap;
import java.util.Map;
import com.kuaishou.weapon.ks.bs;
import org.json.JSONObject;
import com.kuaishou.weapon.ks.bt;
import com.kuaishou.weapon.ks.u;
import com.kuaishou.weapon.ks.s;
import java.lang.StringBuilder;
import com.kuaishou.weapon.ks.bb;
import com.kuaishou.weapon.ks.bc;
import com.kuaishou.weapon.ks.q;
import com.kuaishou.weapon.ks.o;

public class be implements Runnable	// class@0011e0
{
    public Context a;

    public void be(Context p0){
       this.a = p0;
    }
    public final void a(String p0){
       String str;
       if (TextUtils.isEmpty(p0)) {
          d.a(this.a).e(0);
          HashMap hashMap = new HashMap();
          hashMap.put("e", "policyData is null");
          hashMap.put("l", "policyData");
          str = "n";
          String str1 = (d.a(this.a).f("a1_p_s_p_s"))? "0": "1";
          hashMap.put(str, str1);
          bs.a(this.a, "1002001", hashMap);
          return;
       }else {
          JSONObject jSONObject = new JSONObject(p0);
          if (jSONObject.optInt("result", 0) == 1) {
             str = new bt(this.a).a(jSONObject.optString("antispamSdkRsp"));
             if (TextUtils.isEmpty(str)) {
                return;
             }else {
                u ou = s.a(str, this.a);
                d uod = d.a(this.a);
                if (ou != null) {
                   uod.a(p0, ou);
                }
             }
          }
          return;
       }
    }
    public void run(){
       String str = bb.a+bb.b;
       String str1 = bc.a(this.a);
       if (!TextUtils.isEmpty(str1)) {
          str = str+"?"+str1;
       }
       JSONObject jSONObject = new JSONObject();
       JSONObject jSONObject1 = bc.c(this.a);
       if (jSONObject1 != null) {
          jSONObject.put("data", new bt(this.a).c(jSONObject1.toString()));
       }
       q oq = new q(str, jSONObject);
       oq.a(bs.f());
       oq.b(bs.f(this.a));
       this.a(o.a(this.a, oq));
       return;
    }
}
