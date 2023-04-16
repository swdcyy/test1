package com.kuaishou.weapon.ks.bq;
import java.lang.Object;
import java.lang.String;
import android.content.Context;
import com.kuaishou.weapon.ks.bb;
import java.lang.StringBuilder;
import com.kuaishou.weapon.ks.bc;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.weapon.ks.bt;
import org.json.JSONObject;
import com.kuaishou.weapon.ks.q;
import com.kuaishou.weapon.ks.bs;
import com.kuaishou.weapon.ks.o;

public class bq	// class@0011ed
{

    public void bq(){
       super();
    }
    public static String a(String p0,Context p1){
       try{
          return bq.a(p0, p1, bb.a, bb.d);
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public static String a(String p0,Context p1,String p2,String p3){
       String str = null;
       try{
          p2 = p2+p3;
          p3 = bc.a(p1);
          if (!TextUtils.isEmpty(p3)) {
             p2 = p2+"?"+p3;
          }
          if (TextUtils.isEmpty(p0)) {
             return str;
          }else {
             JSONObject jSONObject = new JSONObject();
             p0 = new bt(p1).c(p0);
             if (!TextUtils.isEmpty(p0)) {
                jSONObject.put("data", p0);
             }
             q oq = new q(p2, jSONObject);
             oq.a(bs.f());
             oq.b(bs.f(p1));
             return o.a(p1, oq);
          }
       }catch(java.lang.Exception e0){
          return e0;
       }
    }
}
