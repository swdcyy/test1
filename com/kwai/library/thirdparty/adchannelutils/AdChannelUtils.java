package com.kwai.library.thirdparty.adchannelutils.AdChannelUtils;
import android.app.Application;
import java.lang.String;
import org.json.JSONObject;
import com.yxcorp.utility.RomUtils;
import com.kwai.library.thirdparty.adchannelutils.AdChannelUtils$RomType;
import java.lang.Object;
import android.content.Context;
import cz6.a;
import org.json.JSONException;
import android.net.Uri;
import android.content.ContentResolver;
import android.database.Cursor;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Exception;
import com.vivo.channel.reader.b;
import android.content.SharedPreferences;
import oe6.o;
import android.os.Bundle;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class AdChannelUtils	// class@000903
{
    public static String a;
    public static String b;

    public static String a(Application p0){
       String a = AdChannelUtils.a;
       if (a != null) {
          return a;
       }
       try{
          JSONObject jSONObject = new JSONObject();
          String str = "data";
          if (RomUtils.w()) {
             jSONObject.put("type", AdChannelUtils$RomType.VIVO.getType());
             jSONObject.put(str, AdChannelUtils.c(p0));
             jSONObject.put("data_v2", AdChannelUtils.d(p0));
          }else if(RomUtils.n()){
             jSONObject.put("type", AdChannelUtils$RomType.HUAWEI.getType());
             jSONObject.put(str, AdChannelUtils.b(p0));
          }
          jSONObject.put("activation", a.a(p0));
          AdChannelUtils.a = jSONObject.toString();
       }catch(org.json.JSONException e4){
          e4.printStackTrace();
          AdChannelUtils.a = "";
       }
       return AdChannelUtils.a;
    }
    public static String b(Application p0){
       int i1;
       int i2;
       String str;
       Uri uri = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
       ContentResolver contentResol = p0.getContentResolver();
       int i = 1;
       try{
          i1 = 0;
          String[] stringArray = new String[i];
          stringArray[0] = p0.getPackageName();
          Cursor uCursor = contentResol.query(uri, null, null, stringArray, null);
          if (uCursor != null) {
             try{
                uCursor.moveToFirst();
                int i3 = 4;
                if (uCursor.getColumnCount() > i3) {
                   str = uCursor.getString(i3);
                   if (!TextUtils.x(str)) {
                      JSONObject jSONObject = new JSONObject(str);
                      jSONObject.put("enterAgTime", uCursor.getString(i));
                      jSONObject.put("installedTime", uCursor.getString(2));
                      jSONObject.put("downloadTime", uCursor.getString(3));
                      str = jSONObject.toString();
                   }
                }
             }catch(java.lang.Exception e0){
                Cursor uCursor1 = uCursor;
                i2 = i1;
             }
             e0.printStackTrace();
             if (i1) {
                i1.close();
             }
             str = i2;
          label_0075 :
             return str;
          }
          if (uCursor != null) {
             uCursor.close();
             goto label_0075 ;
          }else {
             goto label_0075 ;
          }
       }catch(java.lang.Exception e0){
          i2 = i1;
          goto label_006c ;
       }
    }
    public static String c(Application p0){
       return b.i(p0);
    }
    public static String d(Application p0){
       String packageName = p0.getPackageName();
       String str = null;
       String str1 = o.c(p0, "com.bbk.appstore_install_referrer", 0).getString("channel", str);
       if (!TextUtils.x(str1)) {
       }else {
          try{
             Bundle uBundle = new Bundle();
             uBundle.putString("package_name", packageName);
             Bundle uBundle1 = p0.getContentResolver().call(Uri.parse("content://com.bbk.appstore.provider.appstatus"), "read_channel", str, uBundle);
             if (uBundle1 != null) {
                JSONObject jSONObject = new JSONObject(uBundle1.getString("channelValue"));
                if (!jSONObject.optInt("code")) {
                   str1 = jSONObject.optString("value");
                   SharedPreferences$Editor uEditor = o.c(p0, "com.bbk.appstore_install_referrer", 0).edit();
                   uEditor.putString("channel", str1);
                   g.a(uEditor);
                }else {
                   str1 = jSONObject.optString("message");
                }
             }
          }catch(java.lang.Exception e9){
             e9.printStackTrace();
          }
       }
    }
}
