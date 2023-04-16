package com.kwai.framework.logger.e;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.framework.logger.LogManagerInitModule;
import com.google.gson.JsonObject;
import da6.d;
import java.lang.String;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import w96.d;
import q87.c;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.google.gson.JsonElement;

public final class e implements Runnable	// class@001669
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void run(){
       int r = LogManagerInitModule.r;
       try{
          JsonObject jsonObject = JsonObject.class;
          String str = "";
          String str1 = d.a.getString("LogControlConfig", str);
          jsonObject = (str1 == null || str1 == str)? null: b.a(str1, jsonObject);
          if (jsonObject != null) {
             Object[] objArray = new Object[0];
             d.C().w("LogManagerInitModule", "Set last logControlConfig to LogManager", objArray);
             b.a(0x4b316083).a(jsonObject.toString());
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
