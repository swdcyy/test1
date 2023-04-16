package ai5.k;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import android.content.SharedPreferences;
import vid.b;
import android.content.SharedPreferences$Editor;
import e66.a;
import oe6.g;
import wkd.b;
import j80.c;
import java.io.File;
import org.apache.internal.commons.io.filefilter.SizeFileFilter;
import java.io.FileFilter;

public class k	// class@0000af
{
    public static k a;

    static {
       k.a = new k();
    }
    public void k(){
       super();
    }
    public void a(Context p0){
       String str;
       String str1;
       int intx1;
       File[] uFileArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       SharedPreferences sharedPrefer = b.c(a.b(), a.w, 0);
       int intx = sharedPrefer.getInt("version_code", 0);
       if (intx <= 0) {
          return;
       }
       SharedPreferences$Editor uEditor = sharedPrefer.edit();
       a.m(0);
       uEditor.remove("check_upgrade");
       if (intx < 330) {
          str = "version";
          str1 = sharedPrefer.getString(str, null);
          uEditor.remove(str);
          if (str1 != null && ("3.20").compareTo(str1) >= 0) {
             str = "adapter_type";
             intx1 = sharedPrefer.getInt(str, 0);
             long l = 1;
             if (intx1 == l) {
                uEditor.putInt(str, 0);
             }else if(intx1 == 2){
                uEditor.putInt(str, l);
             }
          }
          if (str1 != null && ("3.17").compareTo(str1) >= 0) {
             uEditor.remove("renren_token");
             uEditor.remove("renren_expires");
             uEditor.remove("renren_name");
          }
          if (str1 == null || str1.equals("2.58")) {
             uEditor.remove("encoder");
             uEditor.remove("default_number_of_photos");
             uEditor.remove("t_qq_key");
             uEditor.remove("t_qq_secret");
             uEditor.remove("qzone_key");
             uEditor.remove("qzones_secret");
             uEditor.remove("weibo_key");
             uEditor.remove("weibo_secret");
          }
       }
       str = "hot_type";
       if (intx < 332) {
          uEditor.remove("home_overlay");
          uEditor.remove(str);
       }
       if (intx < 344) {
          uEditor.remove("native_play_count");
       }
       if (intx < 345) {
          uEditor.remove("tab_action_overlay");
       }
       if (intx < 347) {
          uEditor.remove("audio_prompt");
       }
       if (intx < 349) {
          uEditor.remove(str);
       }
       if (intx < 352) {
          uEditor.remove("disable_capture_sound");
       }
       if (intx < 354) {
          uEditor.remove("receive_message");
       }
       if (intx <= 420) {
          str1 = "LastUserName";
          if ((sharedPrefer.getString(str1, "")).length() == 32) {
             uEditor.remove(str1);
          }
       }
       uEditor.remove("receive_push");
       uEditor.remove("SectionSize");
       uEditor.remove("LatestVersion");
       uEditor.remove("UseGZip");
       uEditor.remove("ShareKeyQQ");
       uEditor.remove("show_enospc_dialog");
       uEditor.remove("LastUserCountryFlagRid");
       uEditor.remove("use_system_camera");
       uEditor.remove("rate_me_delayed");
       uEditor.remove("_bind_phone_alert");
       uEditor.remove("CacheFilePlayerEnabled");
       uEditor.remove("detail_ab_test");
       uEditor.remove("home_cache_type");
       uEditor.remove("enableAutoActivityTracking");
       uEditor.remove("CacheFilePlayerSupportModels");
       uEditor.remove("LiveHardwareEncodeModelRegex");
       uEditor.remove("PreferredPlayerTypeInt");
       uEditor.remove("add_photo_toast_time");
       uEditor.remove("photo_player_position");
       uEditor.remove("LivePictureInPictureEnabled");
       uEditor.remove("live_video_last_tab_position");
       g.a(uEditor);
       if (intx < 363) {
          g.b(b.c(a.b(), "photo_list_cache", 0).edit().clear());
       }
       int i = -1504323719;
       if (intx < 387) {
          uFileArray = b.a(i).k().listFiles(new SizeFileFilter(1, 0));
          if (uFileArray != null) {
             int len = uFileArray.length;
             int i1 = 0;
             while (i1 < len) {
                object oobject = uFileArray[i1];
                if (!oobject.length()) {
                   oobject.delete();
                }
                i1 = i1 + 1;
             }
          }
       }
       if (intx < 402) {
          uFileArray = b.a(i).a().listFiles();
          if (uFileArray != null) {
             intx = uFileArray.length;
             for (i = 0; i < intx; i = i + 1) {
                object oobject1 = uFileArray[i];
                if (oobject1.isDirectory()) {
                   File[] uFileArray1 = oobject1.listFiles();
                   if (uFileArray1 != null) {
                      intx1 = uFileArray1.length;
                      for (int i2 = 0; i2 < intx1; i2 = i2 + 1) {
                         uFileArray1[i2].delete();
                      }
                   }
                }
                oobject1.delete();
             }
          }
       }
       return;
    }
}
