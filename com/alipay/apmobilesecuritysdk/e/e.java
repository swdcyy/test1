package com.alipay.apmobilesecuritysdk.e.e;
import android.content.Context;
import com.alipay.apmobilesecuritysdk.e.f;
import java.lang.String;
import com.alipay.apmobilesecuritysdk.f.a;
import x6.a;
import org.json.JSONObject;
import java.lang.Throwable;
import com.alipay.apmobilesecuritysdk.c.a;

public final class e	// class@000e70
{

    public static f a(Context p0){
       if (p0 == null) {
          return null;
       }
       String str = a.a(p0, "device_feature_prefs_name", "device_feature_prefs_key");
       if (a.c(str)) {
          str = a.a("device_feature_file_name", "device_feature_file_key");
       }
       if (a.c(str)) {
          return null;
       }else {
          try{
             JSONObject jSONObject = new JSONObject(str);
             f uof = new f();
             uof.a(jSONObject.getString("imei"));
             uof.b(jSONObject.getString("imsi"));
             uof.c(jSONObject.getString("mac"));
             uof.d(jSONObject.getString("bluetoothmac"));
             uof.e(jSONObject.getString("gsi"));
             return uof;
          }catch(java.lang.Exception e3){
             a.a(e3);
             return v0;
          }
       }
    }
}
