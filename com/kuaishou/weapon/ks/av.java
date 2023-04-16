package com.kuaishou.weapon.ks.av;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.weapon.ks.aj;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONObject;
import java.lang.System;

public class av	// class@0011d3
{

    public void av(){
       super();
    }
    public static int a(){
       try{
          String str = aj.a();
          if (!TextUtils.isEmpty(str) && (!str.contains("arm64") && !str.contains("64"))) {
             return 1;
          }
          return 0;
       }catch(java.lang.Exception e0){
       }
    }
    public static JSONObject b(){
       try{
          String env = System.getenv("LD_PRELOAD");
          String env1 = System.getenv("LD_LIBRARY_PATH");
          JSONObject jSONObject = new JSONObject();
          if (!TextUtils.isEmpty(env)) {
             jSONObject.put("0", env);
          }
          if (!TextUtils.isEmpty(env1)) {
             jSONObject.put("1", env1);
          }
          if (jSONObject.length() > 0) {
             return jSONObject;
          }else {
             return null;
          }
       }catch(java.lang.Exception e0){
       }
    }
}
