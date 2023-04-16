package com.hpplay.sdk.source.b.a;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.lang.StringBuilder;
import com.hpplay.sdk.source.a.a;
import java.lang.System;
import java.io.File;
import java.io.FileInputStream;
import java.lang.Integer;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.Throwable;
import com.hpplay.sdk.source.api.ILelinkSourceSdk;
import com.hpplay.sdk.source.process.LelinkSourceSdkImp;
import java.lang.Class;
import java.lang.reflect.Method;
import java.io.IOException;
import java.io.FileOutputStream;
import dalvik.system.DexClassLoader;
import java.lang.ClassLoader;
import com.hpplay.sdk.source.browse.api.ILelinkServiceManager;
import java.lang.reflect.Constructor;
import android.os.Build;
import java.lang.CharSequence;
import com.hpplay.sdk.source.api.ILelinkPlayer;

public class a	// class@000640
{
    public static DexClassLoader l;
    public static boolean m;

    public void a(){
       super();
    }
    public static int a(Context p0,String p1,String p2){
       int len;
       SharedPreferences sharedPrefer;
       Context uContext = p0;
       String str = "ptach_support";
       String str1 = "ptach_version";
       a.f("ModuleLoader", "--------------> patchHandle----"+a.m);
       long l = System.currentTimeMillis();
       String str2 = "lelink";
       byte[] bytes = str2.getBytes();
       String str3 = p1;
       try{
          File uFile = new File(str3);
          int i = (int)uFile.length();
          a.f("ModuleLoader", "--------------> totlaLen len "+i);
          FileInputStream uFileInputSt = new FileInputStream(uFile);
          len = bytes.length;
          byte[] uobyteArray = new byte[len];
          int i1 = 0;
          uFileInputSt.read(uobyteArray, i1, len);
          if ((new String(uobyteArray)).equals(str2)) {
             int i2 = 5;
             uobyteArray = new byte[i2];
             uFileInputSt.read(uobyteArray, i1, i2);
             int i3 = Integer.valueOf(new String(uobyteArray)).intValue();
             SharedPreferences defaultShare = PreferenceManager.getDefaultSharedPreferences(p0);
             int intx = defaultShare.getInt(str1, i1);
             int i4 = 1;
             int b = (defaultShare.getInt(str, i1) == i4)? true: false;
             a.f("ModuleLoader", "--------------> version code "+i3+"  old version "+intx+"  patchSupport "+b);
             if (intx > 0 && (i3 == intx && b == a.m)) {
                a.f("ModuleLoader", "is loaded ");
                return i4;
             }else {
                byte[] uobyteArray1 = new byte[4];
                uFileInputSt.read(uobyteArray1, 0, 4);
                b = a.a(uobyteArray1);
                a.f("ModuleLoader", "--------------> arm 64 len "+b);
                i2 = b + 0;
                int i5 = intx;
                a.f("ModuleLoader", " so len "+b);
                byte[] uobyteArray2 = new byte[b];
                uFileInputSt.read(uobyteArray2, 0, b);
                String str4 = str;
                String str5 = str1;
                str1 = " path ";
                int i6 = i3;
                if ((a.b()).equals("v8a")) {
                   sharedPrefer = defaultShare;
                   a.f("ModuleLoader", " SUPPORT V8A "+b+str1+"/files/lib/");
                   a.a(uContext, uobyteArray2, "/files/lib/", "libed25519.so");
                }else {
                   sharedPrefer = defaultShare;
                }
                uFileInputSt.read(uobyteArray1, 0, 4);
                int i7 = a.a(uobyteArray1);
                a.f("ModuleLoader", "--------------> arm 32 len "+i7);
                i2 = i2 + i7;
                uobyteArray1 = new byte[i7];
                uFileInputSt.read(uobyteArray1, 0, i7);
                if ((a.b()).equals("v7a")) {
                   a.a(uContext, uobyteArray1, "/files/lib/", "libed25519.so");
                   a.f("ModuleLoader", "JUST SUPPORT V7A "+i7+str1+"/files/lib/");
                }
                i = (((i - i2) - 8) - len) - 5;
                byte[] uobyteArray3 = new byte[i];
                a.f("ModuleLoader", " dexData len "+i);
                uFileInputSt.read(uobyteArray3, 0, i);
                a.f("ModuleLoader", "--------------> dexData len "+i);
                a.a(uContext, uobyteArray3, "/files/lelink/dex/", "core.dex");
                uFileInputSt.close();
                a.f("ModuleLoader", " handle success "+(System.currentTimeMillis() - l));
                i7 = i6;
                g.a(sharedPrefer.edit().putInt(str5, i7));
                SharedPreferences$Editor uEditor = sharedPrefer.edit();
                str1 = str4;
                i1 = (a.m)? 1: 0;
                g.a(uEditor.putInt(str1, i1));
                int i8 = i5;
                if (i7 > i8 && i8 > 0) {
                   return 2;
                }else {
                   return 1;
                }
             }
          }
       }catch(java.lang.Exception e0){
          a.b("ModuleLoader", e0);
       }
       return -2;
    }
    public static int a(Context p0,String p1,String p2,boolean p3){
       try{
          a.m = p3;
          int i = a.a(p0, p1, p2);
          if (i == 1 || i == 2) {
             if (a.l == null) {
                a.a(p0);
             }
             if (a.l != null) {
                g.a(PreferenceManager.getDefaultSharedPreferences(p0).edit().putBoolean("ptach_load", true));
             }
             return i;
          }
       }catch(java.lang.Exception e0){
          a.b("ModuleLoader", e0);
       }
       return -2;
    }
    public static int a(byte[] p0){
       return (((p0[3] & 0x00ff) << 24) | (((p0[0] & 0x00ff) | ((p0[1] & 0x00ff) << 8)) | ((p0[2] & 0x00ff) << 16)));
    }
    public static ILelinkSourceSdk a(){
       Class[] uClassArray = null;
       try{
          Object[] objArray = new Object[0];
          Object[] objArray1 = new Object[0];
          return LelinkSourceSdkImp.class.getDeclaredMethod("getInstance", uClassArray).invoke(objArray, objArray1);
       }catch(java.lang.Exception e1){
          a.b("ModuleLoader", e1);
          return uClassArray;
       }
    }
    public static String a(Context p0,byte[] p1,String p2,String p3){
       FileOutputStream uFileOutputS;
       String str = p0.getFilesDir().getParent()+p2;
       File uFile = new File(str);
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       uFile = new File(str, p3);
       if (!uFile.exists()) {
          try{
             uFile.createNewFile();
          }catch(java.io.IOException e2){
             e2.printStackTrace();
          }
       }
    }
    public static void a(Context p0){
       String str = "\r\n";
       String str1 = "ModuleLoader";
       try{
          String parent = p0.getFilesDir().getParent();
          String str2 = parent+"/files/lelink/dex/"+"core.dex";
          String str3 = parent;
          parent = str3+"/files/lib/"+"libed25519.so";
          str3 = new File(str2).getParent()+"/opt/";
          File uFile = new File(str3);
          if (!uFile.exists()) {
             uFile.mkdirs();
          }
          a.f(str1, "---->  paths "+str2+str+parent+str+str3);
          a.l = new DexClassLoader(str2, str3, new File(parent).getParent(), p0.getClassLoader());
       }catch(java.lang.Exception e7){
          a.b(str1, e7);
       }
       return;
    }
    public static ILelinkServiceManager b(Context p0){
       long l = System.currentTimeMillis();
       try{
          if (a.l == null) {
             a.a(p0);
          }
          Class[] uClassArray = new Class[]{Context.class};
          Object[] objArray = new Object[]{p0};
          a.f("ModuleLoader", "loadLelinkServiceManager time:"+(System.currentTimeMillis() - l));
          a.f("ModuleLoader", "com.hpplay.sdk.source.browse.impl.LelinkServiceManagerImpl initializ success");
          return a.l.loadClass("com.hpplay.sdk.source.browse.impl.LelinkServiceManagerImpl").getConstructor(uClassArray).newInstance(objArray);
       }catch(java.lang.Exception e8){
          a.b("ModuleLoader", e8);
          return null;
       }
    }
    public static String b(){
       String[] sUPPORTED_AB = Build.SUPPORTED_ABIS;
       StringBuilder str = "";
       int len = sUPPORTED_AB.length;
       for (int i = 0; i < len; i = i + 1) {
          str = str+sUPPORTED_AB[i]+',';
       }
       if (!a.m) {
          return "v7a";
       }
       if ((str).contains("v8a")) {
          return "v8a";
       }
       (str).contains("v7a");
       return "v7a";
    }
    public static ILelinkPlayer c(Context p0){
       long l = System.currentTimeMillis();
       try{
          if (a.l == null) {
             a.a(p0);
          }
          Class[] uClassArray = new Class[]{Context.class};
          Object[] objArray = new Object[]{p0};
          a.f("ModuleLoader", "loadLelinkPlayer time:"+(System.currentTimeMillis() - l));
          a.f("ModuleLoader", "com.hpplay.sdk.source.player.LelinkPlayerImpl initializ success");
          return a.l.loadClass("com.hpplay.sdk.source.player.LelinkPlayerImpl").getConstructor(uClassArray).newInstance(objArray);
       }catch(java.lang.Exception e8){
          a.b("ModuleLoader", e8);
          return null;
       }
    }
}
