package com.kuaishou.weapon.ks.ao;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import com.kuaishou.weapon.ks.j;
import android.os.Build$VERSION;
import android.content.pm.SigningInfo;
import org.json.JSONObject;
import java.lang.StringBuilder;
import java.io.File;
import java.lang.System;
import java.io.FileOutputStream;

public class ao	// class@0011cc
{

    public void ao(){
       super();
    }
    public static String a(Context p0){
       try{
          return j.b(p0.getPackageManager().getPackageInfo(p0.getPackageName(), 64).signatures[0].toByteArray());
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public static String b(Context p0){
       try{
          Signature[] apkContentsS = (Build$VERSION.SDK_INT >= 28)? p0.getPackageManager().getPackageInfo(p0.getPackageName(), 0x8000000).signingInfo.getApkContentsSigners(): p0.getPackageManager().getPackageInfo(p0.getPackageName(), 64).signatures;
          return j.b(apkContentsS[0].toByteArray());
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public JSONObject a(){
       try{
          JSONObject jSONObject = new JSONObject();
          boolean b = true;
          String str = "0";
          int i = (this.a("/data", b))? 1: 0;
          jSONObject.put(str, i);
          str = "1";
          i = (this.a("/system/bin", b))? 1: 0;
          jSONObject.put(str, i);
          if (!this.a("/system/lib", b)) {
             b = 0;
          }
          jSONObject.put("2", b);
          return jSONObject;
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public boolean a(String p0){
       String separator = File.separator;
       return new File(separator+"proc"+separator+p0).canWrite();
    }
    public boolean a(String p0,boolean p1){
       String str = "";
       if (p1) {
          p0 = p0+"/-"+System.currentTimeMillis();
          str = str+System.currentTimeMillis();
       }
       File uFile = new File(p0);
       FileOutputStream uFileOutputS = new FileOutputStream(uFile);
       uFileOutputS.write(str.getBytes());
       uFileOutputS.flush();
       uFileOutputS.close();
       if (p1) {
          uFile.delete();
       }
       p1 = true;
       try{
          uFileOutputS.close();
          return p1;
       }catch(java.lang.Exception e0){
       }
    }
    public boolean b(String p0){
       return this.a(p0, false);
    }
}
