package com.kuaishou.weapon.ks.al;
import java.lang.Object;
import android.os.Process;
import android.content.Context;
import java.io.File;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import org.json.JSONArray;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashSet;
import java.lang.CharSequence;
import java.util.Collection;
import android.os.Build$VERSION;
import java.lang.System;
import java.io.FileOutputStream;
import java.io.FileDescriptor;
import java.lang.Integer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class al	// class@0011c8
{

    public void al(){
       super();
    }
    public boolean a(){
       boolean b = (Process.myUid() / 0x186a0)? true: false;
       return b;
    }
    public boolean a(Context p0){
       return new File(p0.getFilesDir().getParentFile().getAbsolutePath()+File.separator+"..").canRead();
    }
    public String b(Context p0){
       return p0.getFilesDir().getParentFile().getAbsolutePath();
    }
    public String c(Context p0){
       Class[] uClassArray = new Class[0];
       Object[] objArray = new Object[0];
       Map obj = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", uClassArray).invoke(null, objArray);
       Field declaredFiel = obj.getClass().getDeclaredField("mPackages");
       declaredFiel.setAccessible(true);
       obj = declaredFiel.get(obj);
       if (obj != null && obj.size() > 0) {
          Iterator iterator = obj.keySet().iterator();
          while (iterator.hasNext()) {
             Object obj1 = iterator.next();
             if ((obj1.toString()).length() > 1 && !(obj1.toString()).equals(p0.getPackageName())) {
                File uFile = new File("/data/data"+File.separator+obj1.toString());
                if (uFile.exists() && uFile.canWrite()) {
                   return obj1.toString();
                }
             }
          }
       }
       return null;
    }
    public JSONArray d(Context p0){
       BufferedReader uBufferedRea;
       int i;
       JSONArray jSONArray = null;
       try{
          FileReader uFileReader = new FileReader("/proc/self/maps");
          try{
             uBufferedRea = new BufferedReader(uFileReader);
             HashSet hashSet = new HashSet();
             String packageName = p0.getPackageName();
             String str = uBufferedRea.readLine();
             while (str != null) {
                if (str.contains("@Hw") || (!str.contains(".apk@classes.dex") && (str.contains("WebViewGoogle") || (!str.contains("FeatureFramework") && (str.contains("framework@oppo") || str.contains("framework@mediatek")))))) {
                   continue ;
                }else if(hashSet.size() > 15){
                   break ;
                }else {
                   String str1 = "/data/";
                   if (!str.contains(packageName) && (str.contains(str1) && str.contains(".so"))) {
                      i = str.indexOf(".so") + 3;
                      str = str.substring(str.indexOf(str1), i);
                   }else if(!str.contains(packageName) && (str.contains(str1) && str.contains(".dex"))){
                      i = str.indexOf(".dex") + 4;
                      str = str.substring(str.indexOf(str1), i);
                   }
                   hashSet.add(str);
                }
             }
             if (hashSet.size() > 0) {
                try{
                   JSONArray jSONArray1 = new JSONArray(hashSet);
                   uBufferedRea.close();
                   return jSONArray1;
                }catch(java.io.IOException e0){
                }
             }else {
                try{
                label_00b2 :
                   uBufferedRea.close();
                label_00c6 :
                   return jSONArray;
                }catch(java.io.IOException e0){
                }
             }
          }catch(java.lang.Exception e0){
          }
          if (!uBufferedRea) {
          label_00c6 :
             return jSONArray;
          }
          goto label_00b2 ;
       }catch(java.lang.Exception e0){
          uBufferedRea = jSONArray;
          goto label_00c3 ;
       }
    }
    public int e(Context p0){
       FileOutputStream uFileOutputS;
       FileDescriptor uFileDescrip = null;
       try{
          if (Build$VERSION.SDK_INT < 26) {
             return this.a(p0);
          }
          String str = "fk_w_"+System.currentTimeMillis();
          String separator = File.separator;
          String str1 = p0.getFilesDir().getParentFile().getAbsolutePath()+separator+str;
          try{
             uFileOutputS = new FileOutputStream(str1);
             uFileDescrip = uFileOutputS.getFD();
             Field declaredFiel = uFileDescrip.getClass().getDeclaredField("descriptor");
             declaredFiel.setAccessible(true);
             declaredFiel.get(uFileDescrip);
             Object[] objArray = new Object[true];
             objArray[0] = Integer.valueOf(declaredFiel.get(uFileDescrip).intValue());
             String[] stringArray = new String[0];
             String absolutePath = Files.readSymbolicLink(Paths.get(String.format("/proc/self/fd/%d", objArray), stringArray)).toFile().getAbsolutePath();
             if (!(absolutePath.substring(absolutePath.lastIndexOf(separator))).equals(separator+str)) {
                try{
                   uFileOutputS.close();
                   return true;
                }catch(java.lang.Exception e0){
                }
             }else {
                boolean b = new File(absolutePath.replace(str, "")).getParentFile().canRead();
                File uFile = new File(absolutePath);
                if (uFile.exists()) {
                   uFile.delete();
                }
                if (b) {
                   try{
                      uFileOutputS.close();
                      return true;
                   }catch(java.lang.Exception e0){
                   }
                }else {
                   try{
                      uFileOutputS.close();
                      return e0;
                   }catch(java.lang.Exception e0){
                   }
                }
             }
          }catch(java.lang.Exception e0){
             FileOutputStream uFileOutputS1 = uFileOutputS;
          label_00de :
             if (uFileDescrip) {
                uFileDescrip.close();
             }
             return e0;
          }
       }catch(java.lang.Exception e0){
       }
    }
}
