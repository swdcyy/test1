package com.unionpay.UPPayAssistEx;
import java.lang.Object;
import com.unionpay.a.d;
import android.content.Context;
import java.lang.String;
import org.json.JSONObject;
import java.lang.Integer;
import com.unionpay.utils.b;
import com.unionpay.utils.UPUtils;
import java.util.Locale;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import java.lang.StringBuilder;
import android.os.Build$VERSION;
import android.os.Build;
import java.lang.CharSequence;
import java.util.TimeZone;
import java.lang.Exception;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo$State;
import com.unionpay.utils.e;
import java.io.File;
import java.lang.StringBuffer;
import android.nfc.NfcManager;
import android.nfc.NfcAdapter;
import android.content.pm.PackageManager;
import android.app.Activity;
import android.location.Location;
import java.lang.Double;
import java.util.regex.PatternSyntaxException;
import org.json.JSONException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import org.json.JSONArray;
import java.util.ArrayList;
import com.unionpay.b;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import com.unionpay.utils.i;
import android.os.Bundle;
import android.content.Intent;
import com.unionpay.UPPayWapActivity;
import java.lang.Class;
import java.lang.System;
import android.text.TextUtils;
import android.util.Base64;
import com.unionpay.utils.j;
import com.unionpay.a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.lang.Runnable;

public class UPPayAssistEx	// class@000fec
{
    public static final String VERSION = "3.5.6";
    public static String a = "SpId";
    public static String b = "paydata";
    public static String c = "SysProvide";
    public static String d = "UseTestMode";
    public static String e = "SecurityChipType";
    public static String f = "reqOriginalId";
    public static String g = "wapurl";
    public static String h = "actionType";
    public static String i = "dlgstyle";
    public static String j = "com.unionpay.uppay.PayActivity";
    public static String k = "ex_mode";
    public static String l = "server";
    public static int m = 10;
    public static Context n;
    public static String o;
    public static String p;
    public static String q;
    public static String r;
    public static int s;
    public static d t;
    public static String u;
    public static String v;
    public static JSONArray w;

    public void UPPayAssistEx(){
       super();
    }
    public static d a(){
       return UPPayAssistEx.t;
    }
    public static String a(Context p0,boolean p1){
       int i1;
       String str;
       String str1;
       NetworkInfo activeNetwor;
       String str2;
       NfcAdapter defaultAdapt;
       String str3;
       Location location;
       Location location1;
       String str4;
       JSONObject jSONObject = new JSONObject();
       try{
          int i = 0;
          i1 = Integer.parseInt(UPPayAssistEx.r);
       }catch(java.lang.NumberFormatException e0){
          i1 = 0;
       }catch(org.json.JSONException e9){
          e9.printStackTrace();
       }catch(java.util.regex.PatternSyntaxException e9){
          e9.printStackTrace();
       }catch(java.lang.Exception e0){
       }
    }
    public static String a(String p0){
       if (p0 != null) {
          return (Pattern.compile("[\":,\\[\\]{}]").matcher(p0).replaceAll("")).trim();
       }
       return "";
    }
    public static JSONArray a(JSONArray p0,String p1){
       ArrayList uArrayList = new ArrayList();
       int i = 0;
       int i1 = 0;
       while (p0 != null && i1 < p0.length()) {
          uArrayList.add(p0.optJSONObject(i1));
          i1 = i1 + 1;
       }
       Collections.sort(uArrayList, new b(p1));
       p0 = new JSONArray();
       for (; i < uArrayList.size(); i = i + 1) {
          p0.put(uArrayList.get(i));
       }
       return p0;
    }
    public static void a(Context p0,JSONArray p1,int p2){
       String str1;
       JSONArray jSONArray;
       int i;
       String str6;
       while (p1 != null && p2 < p1.length()) {
          p1 = i.a(p1, p2);
          if (p1 != null) {
             String str = i.a(p1, "type");
             if (("app").equals(str)) {
                str1 = i.a(p1, "app_server");
                jSONArray = UPPayAssistEx.a(i.b(p1, "package_info"), "sort");
                boolean b = false;
                if (jSONArray.length() > 0) {
                   i = jSONArray.length();
                   int i1 = 0;
                   while (i1 < i) {
                      String obj = i.a(jSONArray, i1);
                      if (obj != null) {
                         String str2 = i.a(obj, "schema");
                         String str3 = i.a(obj, "sign");
                         obj = i.a(obj, "version");
                         if (b.a(p0, str2) && (str3.equalsIgnoreCase(b.b(p0, str2)) && (b.c(p0, str2)).matches(obj))) {
                            try{
                               Bundle uBundle = new Bundle();
                               UPPayAssistEx.a(UPPayAssistEx.o, uBundle, UPPayAssistEx.r);
                               uBundle.putString(UPPayAssistEx.a, UPPayAssistEx.p);
                               uBundle.putString(UPPayAssistEx.c, UPPayAssistEx.q);
                               uBundle.putString(UPPayAssistEx.b, UPPayAssistEx.o);
                               uBundle.putBoolean(UPPayAssistEx.i, b);
                               uBundle.putString(UPPayAssistEx.l, str1);
                               uBundle.putString(UPPayAssistEx.e, null);
                               uBundle.putInt(UPPayAssistEx.f, b);
                               Intent intent = new Intent();
                               intent.putExtras(uBundle);
                               intent.setClassName(str2, UPPayAssistEx.j);
                               Context n = UPPayAssistEx.n;
                               if (n instanceof Activity) {
                                  n.startActivityForResult(intent, UPPayAssistEx.m);
                               }else {
                                  intent.addFlags(0x10000000);
                                  UPPayAssistEx.n.startActivity(intent);
                               }
                               b = true;
                               break ;
                            }catch(java.lang.Exception e4){
                               e4.printStackTrace();
                            }
                         }
                      }
                      i1 = i1 + 1;
                   }
                }
                if (b) {
                   return;
                }
             }else {
                String str4 = "wap";
                String str5 = "url";
                if (str4.equals(str)) {
                   try{
                      str6 = p1.get(str5);
                      UPPayAssistEx.a(str6, str4);
                      return;
                   }catch(java.lang.Exception e0){
                   }
                }else {
                   str4 = "link";
                   if (str4.equals(str)) {
                      try{
                         str6 = p1.getString(str5);
                         UPPayAssistEx.a(str6, str4);
                         return;
                      }catch(java.lang.Exception e0){
                      }
                   }else {
                      str4 = UPPayAssistEx.n;
                   }
                }
             }
             str1 = UPPayAssistEx.w;
             jSONArray = UPPayAssistEx.s + 1;
             UPPayAssistEx.s = jSONArray;
          }else {
             break ;
          }
       }
       return;
    }
    public static void a(String p0,Bundle p1,String p2){
       if (p0 != null && (p0.trim()).length() > 0) {
          if ((p0.trim()).charAt(0) == '<') {
             if (p2 != null && (p2.trim()).equalsIgnoreCase("00")) {
                p1.putBoolean(UPPayAssistEx.d, 0);
                return;
             }else {
                p1.putBoolean(UPPayAssistEx.d, true);
                return;
             }
          }else {
             p1.putString(UPPayAssistEx.k, p2);
          }
       }
       return;
    }
    public static void a(String p0,String p1){
       Intent intent;
       Bundle uBundle = new Bundle();
       if (!("link").equals(p1)) {
          UPPayAssistEx.a(UPPayAssistEx.o, uBundle, UPPayAssistEx.r);
          uBundle.putString(UPPayAssistEx.a, UPPayAssistEx.p);
          uBundle.putString(UPPayAssistEx.c, UPPayAssistEx.q);
          try{
             int i = 0;
             i = Integer.parseInt(UPPayAssistEx.r);
             e0.putString(UPPayAssistEx.b, UPUtils.forWap(i, b.a(UPPayAssistEx.o)));
          }catch(java.lang.NumberFormatException e0){
          }
       }
    }
    public static Context b(){
       return UPPayAssistEx.n;
    }
    public static String c(){
       return UPPayAssistEx.r;
    }
    public static boolean checkWalletInstalled(Context p0){
       String str = "com.unionpay";
       if (b.a(p0, str) && ("536C79B93ACFBEA950AE365D8CE1AEF91FEA9535").equalsIgnoreCase(b.b(p0, str))) {
          return true;
       }
       return false;
    }
    public static String d(){
       return UPPayAssistEx.o;
    }
    public static int e(){
       int i;
       Context n;
       int i1;
       int i2;
       String str = "sePayConf";
       if (UPPayAssistEx.n == null) {
          return 1;
       }
       UPPayAssistEx.s = 0;
       System.loadLibrary("entryexpro");
       String str1 = "configs";
       String str2 = UPUtils.a(UPPayAssistEx.n, str1);
       String str3 = UPUtils.a(UPPayAssistEx.n, "mode");
       String str4 = UPUtils.a(UPPayAssistEx.n, "or");
       JSONArray jSONArray = null;
       if (!TextUtils.isEmpty(str2) && (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4))) {
          try{
             JSONObject jSONObject = new JSONObject(str2);
             str2 = i.a(jSONObject, "sign");
             try{
                i2 = Integer.parseInt(str3);
             }catch(java.lang.NumberFormatException e0){
                i2 = 0;
             }
             try{
                String str5 = new String(Base64.decode(jSONObject.getString(str1), 2));
                String str6 = "";
                str1 = (jSONObject.has(e0))? new String(Base64.decode(jSONObject.getString(e0), 2)): str6;
                if (!TextUtils.isEmpty(str1)) {
                   str6 = str1;
                }
                str = b.a(UPUtils.a(str5+str6+str4));
                str2 = UPUtils.forConfig(i2, str2);
                if (!TextUtils.isEmpty(str2) && str2.equals(str)) {
                   jSONArray = new JSONArray(str5);
                }
             }catch(java.lang.Exception e0){
             }
          }catch(java.lang.Exception e0){
          }
       }
    }
    public static void releaseMemory(){
       UPPayAssistEx.n = null;
    }
    public static int startPay(Context p0,String p1,String p2,String p3,String p4){
       UPPayAssistEx.n = p0;
       UPPayAssistEx.o = p3;
       UPPayAssistEx.p = p1;
       UPPayAssistEx.q = p2;
       UPPayAssistEx.r = p4;
       UPPayAssistEx.e();
       return 0;
    }
}
