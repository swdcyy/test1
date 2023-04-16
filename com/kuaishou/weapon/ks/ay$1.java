package com.kuaishou.weapon.ks.ay$1;
import java.lang.Runnable;
import com.kuaishou.weapon.ks.ay;
import java.lang.Object;
import android.content.Context;
import com.kuaishou.weapon.ks.d;
import java.lang.String;
import com.kuaishou.weapon.ks.bs;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.weapon.ks.bn;
import com.kuaishou.weapon.ks.ba;
import org.json.JSONObject;
import com.kuaishou.weapon.ks.ah;
import java.util.List;
import com.kuaishou.weapon.ks.aa;
import com.kuaishou.weapon.ks.bq;

public class ay$1 implements Runnable	// class@0011d6
{
    public final ay a;

    public void ay$1(ay p0){
       this.a = p0;
       super();
    }
    public void run(){
       aa d;
       d uod = d.a(ay.a(this.a));
       String str = bs.f();
       if (!TextUtils.isEmpty(str) && uod != null) {
          uod.d(str);
       }
       int i = 1;
       if (uod.b("plc001_pd_cb_ps", i) == i) {
          JSONObject jSONObject = new bn(ba.d, ba.e).a(ay.a(this.a));
          if (jSONObject == null) {
             return;
          }else {
             JSONObject jSONObject1 = new JSONObject();
             List list = ah.a(ay.a(this.a)).b();
             jSONObject1.put("11030", list.size());
             String str1 = "11031";
             String str2 = "";
             d = (list.size() > 0)? list.get(0).d: str2;
             jSONObject1.put(str1, d);
             if (list.size() > i) {
                str2 = list.get(i).d;
             }
             jSONObject1.put("11032", str2);
             jSONObject1.put("11027", bs.d());
             jSONObject1.put("11127", bs.e());
             jSONObject.put("module_section", jSONObject1);
             bq.a(jSONObject.toString(), ay.a(this.a));
          }
       }
       return;
    }
}
