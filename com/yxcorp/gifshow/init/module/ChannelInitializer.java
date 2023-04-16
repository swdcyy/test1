package com.yxcorp.gifshow.init.module.ChannelInitializer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.SystemUtil;
import java.io.File;
import android.app.Application;
import o56.a;
import qkd.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Exception;
import android.content.res.AssetManager;
import android.content.Context;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.io.Reader;
import java.io.IOException;
import o56.c;
import android.content.SharedPreferences;
import java.lang.Boolean;
import pkd.a;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.yxcorp.utility.RomUtils;
import lnc.h0;
import ukd.a;
import android.os.Build;
import sxa.b;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import vid.b;

public class ChannelInitializer	// class@0011cb
{
    public boolean a;
    public SharedPreferences b;
    public boolean c;

    public void ChannelInitializer(){
       super();
       this.a = false;
    }
    public void a(){
       boolean b;
       String str3;
       String str4;
       CharSequence uCharSequenc;
       Application uApplication1;
       InputStreamReader inputStreamR;
       BufferedReader uBufferedRea;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, ChannelInitializer.class, "1")) {
          return;
       }
       if (this.a != null) {
          PatchProxy.onMethodExit(ChannelInitializer.class, "1");
          return;
       }else {
          this.a = true;
          String str = "2";
          String str1 = PatchProxy.applyWithListener(objArray, this, ChannelInitializer.class, str);
          if (str1 != patchProxyRe) {
          }else if(SystemUtil.P()){
             try{
                str1 = b.f0(new File(a.b().getExternalFilesDir(objArray), "performance/perfChannel"));
                if (!TextUtils.isEmpty(str1)) {
                   PatchProxy.onMethodExit(ChannelInitializer.class, str);
                }
             }catch(java.lang.Exception e6){
                e6.printStackTrace();
             }
          }
          a.k = str1;
          a.l = str1;
          if (!a.a().c() && !PatchProxy.applyVoidWithListener(objArray, this, ChannelInitializer.class, "5")) {
             str1 = this.b().getString("channel_from_vendor", objArray);
             String str2 = "4";
             String obj = PatchProxy.applyWithListener(objArray, this, ChannelInitializer.class, str2);
             boolean i = 0;
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else {
                str3 = "channel_from_vendor_version";
                if (this.b().getInt(str3, -1) != a.d) {
                   g.a(this.b().edit().putInt(str3, a.d));
                   PatchProxy.onMethodExit(ChannelInitializer.class, str2);
                   b = true;
                }else {
                   PatchProxy.onMethodExit(ChannelInitializer.class, str2);
                   b = false;
                }
             }
             if (!TextUtils.isEmpty(str1) && !b) {
                a.k = str1;
                PatchProxy.onMethodExit(ChannelInitializer.class, "5");
             }else if(b){
                Application uApplication = a.b();
                obj = "ro.preinstall.path";
                str3 = "kwai_oppo.txt";
                if (RomUtils.l()) {
                   str4 = RomUtils.g("persist.preinstall.gifmaker");
                   if (TextUtils.isEmpty(str4)) {
                      str4 = RomUtils.g(obj);
                      if (TextUtils.isEmpty(str4)) {
                         str4 = "/data/etc/appchannel";
                      }
                   }
                   objArray = h0.a(new File(str4, str3));
                }else {
                   String str5 = "/system/etc";
                   if (RomUtils.w()) {
                      str4 = RomUtils.g(obj);
                      File uFile = new File(str4, "kwai_vivo.txt");
                      if (TextUtils.isEmpty(str4) || (uFile.exists() && uFile.isFile())) {
                         str5 = str4;
                      }
                   label_0158 :
                      objArray = h0.a(new File(str5, "kwai_vivo.txt"));
                   }else if(RomUtils.n()){
                      objArray = RomUtils.g("ro.channelId.com.smile.gifmaker");
                   }else {
                      obj = "";
                      if (RomUtils.q()) {
                         str4 = uApplication.getPackageName();
                         try{
                            Object[] objArray1 = new Object[true];
                            objArray1[i] = str4;
                            str4 = a.b("miui.os.MiuiInit", "getMiuiChannelPath", objArray1);
                         }catch(java.lang.Exception e0){
                            uCharSequenc = obj;
                         }
                         if (!TextUtils.isEmpty(uCharSequenc)) {
                            objArray = h0.a(new File(uCharSequenc));
                         }else {
                            objArray = obj;
                         }
                      }else if(RomUtils.r()){
                         objArray = h0.a(new File(str5, str3));
                      }else if(RomUtils.u()){
                         objArray = h0.a(new File(str5, "kwai_samsung.txt"));
                      }else if(!TextUtils.isEmpty(Build.BOARD)){
                         str4 = (Build.BRAND).toLowerCase();
                      }else {
                         str4 = obj;
                      }
                      str2 = Build.MANUFACTURER;
                      if (!TextUtils.isEmpty(str2)) {
                         obj = str2.toLowerCase();
                      }
                      File uFile1 = (str4.contains("coolpad") || obj.contains("yulong"))? 1: null;
                      if (uFile1) {
                         objArray = h0.a(new File(str5, "kwai_kupai.txt"));
                      }else {
                         try{
                            b = (str2.toUpperCase()).contains("MOTOROLA");
                         }catch(java.lang.Exception e0){
                            e0.printStackTrace();
                            b = false;
                         }
                         if (b) {
                            objArray = h0.a(new File("/product/etc", "kwai_moto.txt"));
                         }else {
                            try{
                               i = ((Build.MANUFACTURER).toUpperCase()).contains("LENOVO");
                            }catch(java.lang.Exception e0){
                               e0.printStackTrace();
                            }
                            if (i) {
                               objArray = h0.a(new File(str5, "kwai_lenovo_pad.txt"));
                            }
                         }
                      }
                   }
                }
                if (objArray != null) {
                   objArray = objArray.toUpperCase();
                }
                if (!TextUtils.isEmpty(objArray)) {
                   a.k = objArray;
                   if (!objArray.equals(str1)) {
                      this.b().edit().putString("channel_from_vendor", objArray);
                   }
                }else if(!TextUtils.isEmpty(str1)){
                   a.k = str1;
                   this.c = true;
                }
             }
          label_026b :
             PatchProxy.onMethodExit(ChannelInitializer.class, "5");
          }
          e.g(new b(this), "logVendorChannelException");
          PatchProxy.onMethodExit(ChannelInitializer.class, "1");
          return;
       }
    }
    public final SharedPreferences b(){
       Object obj = PatchProxy.applyWithListener(null, this, ChannelInitializer.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          this.b = b.c(a.b(), a.w, 0);
       }
       PatchProxy.onMethodExit(ChannelInitializer.class, "3");
       return this.b;
    }
}
