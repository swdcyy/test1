package com.kuaishou.weapon.ks.ar;
import java.lang.Object;
import android.content.Context;
import org.json.JSONObject;
import android.os.Build$VERSION;
import java.io.File;
import java.lang.String;
import java.lang.StringBuilder;

public class ar	// class@0011cf
{

    public void ar(){
       super();
    }
    public static JSONObject a(Context p0){
       try{
          JSONObject jSONObject = new JSONObject();
          File uFile = (Build$VERSION.SDK_INT >= 24)? new File(p0.getDataDir(), "xreplace"): new File("/data/data/"+p0.getPackageName()+"/xreplace");
          if (uFile.exists()) {
             jSONObject.put("xreplace", 1);
          }
          if (new File("/storage/emulated/0/xxsq").exists()) {
             jSONObject.put("xxsq", 1);
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
}
