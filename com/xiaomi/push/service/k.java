package com.xiaomi.push.service.k;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import android.content.Context;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import ys8.n;
import java.util.List;
import java.util.Collection;
import ws8.g7;
import java.util.Iterator;
import java.lang.Object;
import android.service.notification.StatusBarNotification;
import android.app.Notification;
import ys8.o;
import ws8.a4;
import java.util.Map;
import ws8.m6;
import android.app.Notification$Builder;
import android.graphics.Bitmap;
import ys8.g0;
import android.content.Intent;
import java.lang.Class;
import java.lang.Integer;
import java.lang.reflect.Method;
import java.lang.StringBuilder;
import rs8.c;
import com.xiaomi.push.id;
import com.xiaomi.push.hu;
import android.app.PendingIntent;
import java.lang.Boolean;
import android.content.ComponentName;
import ys8.z0;
import com.xiaomi.push.g;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import java.lang.Float;
import android.content.pm.ApplicationInfo;
import java.lang.NumberFormatException;
import ys8.v;
import android.content.pm.PackageManager;
import java.lang.Exception;
import java.net.URISyntaxException;
import java.net.URL;
import android.net.Uri;
import java.net.MalformedURLException;
import android.content.pm.ResolveInfo;
import android.os.Build$VERSION;
import ys8.j;
import android.content.SharedPreferences;
import oe6.o;
import android.content.SharedPreferences$Editor;
import oe6.g;
import android.graphics.drawable.Icon;
import com.xiaomi.push.hh;
import ws8.l0;
import android.os.Parcelable;
import android.graphics.drawable.Drawable;
import com.xiaomi.push.service.k$a;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.lang.Throwable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.widget.RemoteViews;
import org.json.JSONObject;
import java.lang.System;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.xiaomi.push.service.k$b;
import android.os.Bundle;
import com.xiaomi.push.service.m$b;
import com.xiaomi.push.service.m;
import java.lang.Long;
import ys8.k;
import ys8.j0;
import java.util.Objects;
import ys8.l;
import com.xiaomi.push.service.k$c;
import com.xiaomi.push.g$b;
import ws8.y3;
import ws8.k;
import com.xiaomi.push.service.l;
import ws8.k$a;
import android.util.Pair;
import android.app.Notification$BigPictureStyle;
import android.app.Notification$Style;
import android.app.Notification$BigTextStyle;
import ws8.z3;
import ws8.c4;
import ws8.b4;
import ys8.t0;

public class k	// class@00117e
{
    public static long a;
    public static final LinkedList b;
    public static ExecutorService c;
    public static j d;

    static {
       k.b = new LinkedList();
       k.c = Executors.newCachedThreadPool();
    }
    public static void A(Context p0,String p1,String p2,String p3){
       if (p0 == null || (TextUtils.isEmpty(p1) || (!TextUtils.isEmpty(p2) && !TextUtils.isEmpty(p3)))) {
          n on = n.l(p0, p1);
          List list = on.z();
          if (g7.d(list)) {
             return;
          }else {
             LinkedList linkedList = new LinkedList();
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                StatusBarNotification statusBarNot = iterator.next();
                Notification notification = statusBarNot.getNotification();
                if (notification != null && !TextUtils.isEmpty(String.valueOf(statusBarNot.getId()))) {
                   int id = statusBarNot.getId();
                   String str = o.g(notification);
                   String str1 = o.t(notification);
                   if (!TextUtils.isEmpty(str) && (!TextUtils.isEmpty(str1) && (k.K(str, p2) && k.K(str1, p3)))) {
                      linkedList.add(statusBarNot);
                      on.m(id);
                   }
                }
             }
             k.C(p0, linkedList);
          }
       }
       return;
    }
    public static void B(Context p0,String p1,a4 p2,Map p3){
       int i = k.b(p0, p1, "mipush_small_notification");
       int i1 = k.b(p0, p1, "mipush_notification");
       if (m6.j(p0)) {
          if (i > 0 && i1 > 0) {
             p2.setSmallIcon(i);
          label_0029 :
             p2.setLargeIcon(k.l(p0, i1));
          }else {
             k.T(p0, p1, p2, p3);
          }
       }else if(i > 0){
          p2.setSmallIcon(i);
       }else {
          k.T(p0, p1, p2, p3);
       }
       if (i1 > 0) {
          goto label_0029 ;
       }
       return;
    }
    public static void C(Context p0,LinkedList p1){
       if (p1.size() > 0) {
          g0.d(p0, "category_clear_notification", "clear_notification", (long)p1.size(), "");
       }
       return;
    }
    public static void D(Intent p0){
       try{
          Class[] uClassArray = new Class[]{Integer.TYPE};
          Method declaredMeth = p0.getClass().getDeclaredMethod("addMiuiFlags", uClassArray);
          declaredMeth.setAccessible(1);
          Object[] objArray = new Object[]{Integer.valueOf(2)};
          declaredMeth.invoke(p0, objArray);
       }catch(java.lang.Exception e6){
          c.s("insert flags error "+e6);
       }
       return;
    }
    public static void E(a4 p0,Context p1,String p2,id p3,byte[] p4,int p5){
       PendingIntent pendingInten;
       Map map = p3.a().a();
       String str = "notification_style_type";
       if (!TextUtils.equals("3", map.get(str)) && !TextUtils.equals("4", map.get(str))) {
          if (k.X(map)) {
             int i = 1;
             while (i <= 3) {
                Object[] objArray = new Object[]{Integer.valueOf(i)};
                Object obj = map.get(String.format("cust_btn_%s_n", objArray));
                if (!TextUtils.isEmpty(obj)) {
                   pendingInten = k.h(p1, p2, p3, p4, p5, i);
                   if (pendingInten != null) {
                      p0.addAction(0, obj, pendingInten);
                   }
                }
                i = i + 1;
             }
             return;
          }else {
             str = "notification_style_button_left_name";
             if (!TextUtils.isEmpty(map.get(str))) {
                pendingInten = k.h(p1, p2, p3, p4, p5, 1);
                if (pendingInten != null) {
                   p0.addAction(0, map.get(str), pendingInten);
                }
             }
             str = "notification_style_button_mid_name";
             if (!TextUtils.isEmpty(map.get(str))) {
                pendingInten = k.h(p1, p2, p3, p4, p5, 2);
                if (pendingInten != null) {
                   p0.addAction(0, map.get(str), pendingInten);
                }
             }
             if (!TextUtils.isEmpty(map.get("notification_style_button_right_name"))) {
                pendingInten = k.h(p1, p2, p3, p4, p5, 3);
                if (pendingInten != null) {
                   p0.addAction(0, map.get("notification_style_button_right_name"), pendingInten);
                }
             }
          }
       }
       return;
    }
    public static boolean F(Context p0,id p1,String p2){
       boolean b = false;
       if (p1 != null && (p1.a() != null && (p1.a().a() == null || TextUtils.isEmpty(p2)))) {
          c.l("should clicked activity params are null.");
          return b;
       }else if(Boolean.parseBoolean(p1.a().a().get("use_clicked_activity")) && z0.b(p0, k.i(p2))){
          b = true;
       }
       return b;
    }
    public static boolean G(Context p0,String p1){
       return g.n(p0, p1);
    }
    public static boolean H(Context p0,String p1,boolean p2){
       boolean b = false;
       if (!m6.i()) {
          return b;
       }
       if (!p2 && k.G(p0, p1)) {
          b = true;
       }
       return b;
    }
    public static boolean I(hu p0){
       int i = 0;
       if (p0 != null) {
          String str = p0.a();
          if (!TextUtils.isEmpty(str) && (str.length() == 22 && ("satuigmo").indexOf(str.charAt(i)) >= 0)) {
             i = true;
          }
       }
       return i;
    }
    public static boolean J(id p0){
       hu ohu = p0.a();
       boolean b = (k.I(ohu) && ohu.l())? true: false;
       return b;
    }
    public static boolean K(String p0,String p1){
       boolean b = (TextUtils.isEmpty(p0) || p1.contains(p0))? true: false;
       return b;
    }
    public static boolean L(Map p0){
       if (p0 != null) {
          String str = "notify_foreground";
          if (p0.containsKey(str)) {
             return ("1").equals(p0.get(str));
          }
       }
       return true;
    }
    public static String[] M(Context p0,hu p1){
       String str2;
       String str = p1.c();
       String str1 = p1.d();
       Map map = p1.a();
       if (map != null) {
          int i = Float.valueOf((((float)c.c(p0.getResources()).widthPixels / c.c(p0.getResources()).density) + 0x3f000000)).intValue();
          if (i <= 320) {
             str2 = map.get("title_short");
             if (!TextUtils.isEmpty(str2)) {
                str = str2;
             }
             str2 = map.get("description_short");
             if (TextUtils.isEmpty(str2)) {
             label_0073 :
                String[] stringArray = new String[]{str,str1};
                return stringArray;
             }
          }else if(i > 360){
             str2 = map.get("title_long");
             if (!TextUtils.isEmpty(str2)) {
                str = str2;
             }
             str2 = map.get("description_long");
             if (TextUtils.isEmpty(str2)) {
             }
          }else {
             goto label_0073 ;
          }
          str1 = str2;
          goto label_0073 ;
       }else {
          goto label_0073 ;
       }
    }
    public static int N(Context p0,String p1){
       int i = k.b(p0, p1, "mipush_notification");
       int i1 = k.b(p0, p1, "mipush_small_notification");
       if (i > 0) {
       }else if(i1 > 0){
          i = i1;
       }else {
          i = p0.getApplicationInfo().icon;
       }
       if (i == null) {
          i = p0.getApplicationInfo().logo;
       }
       return i;
    }
    public static int O(Map p0){
       int i;
       String str = p0.get("channel_importance");
       if (!TextUtils.isEmpty(str)) {
          try{
             c.t("importance="+str);
             i = Integer.parseInt(str);
          label_003d :
             return i;
          }catch(java.lang.Exception e2){
             c.u("parsing channel importance error: "+e2);
          }
          i = 3;
          goto label_003d ;
       }else {
          goto label_003c ;
       }
    }
    public static Intent P(Context p0,String p1,Map p2,int p3){
       Intent launchIntent;
       String str2;
       Intent intent;
       Intent intent1;
       if (p2 == null) {
          return null;
       }
       if (p3) {
          return k.j(p0, p1, p2, p3);
       }
       String str = "notify_effect";
       if (!p2.containsKey(str)) {
          return null;
       }
       str = p2.get(str);
       int i = -1;
       String str1 = p2.get("intent_flag");
       try{
          if (!TextUtils.isEmpty(str1)) {
             i = Integer.parseInt(str1);
          }
       }catch(java.lang.NumberFormatException e2){
          c.u("Cause by intent_flag: "+e2.getMessage());
       }
       if ((v.a).equals(str)) {
          try{
             launchIntent = p0.getPackageManager().getLaunchIntentForPackage(p1);
          }catch(java.lang.Exception e6){
             c.u("Cause: "+e6.getMessage());
          }
       }else if((v.b).equals(str)){
          str1 = "intent_uri";
          if (p2.containsKey(str1)) {
             str2 = p2.get(str1);
             if (str2 != null) {
                int i2 = 1;
                try{
                   intent = Intent.parseUri(str2, i2);
                   try{
                      intent.setPackage(p1);
                   label_00af :
                      launchIntent = intent;
                   }catch(java.net.URISyntaxException e6){
                   }
                   c.u("Cause: "+e6.getMessage());
                   goto label_00af ;
                }catch(java.net.URISyntaxException e6){
                   intent = 0;
                   goto label_0099 ;
                }
             }
          }else {
             str1 = "class_name";
             if (p2.containsKey(str1)) {
                intent1 = new Intent();
                intent1.setComponent(new ComponentName(p1, p2.get(str1)));
             label_00cd :
                launchIntent = intent1;
             }
          }
       }else if((v.c).equals(str)){
          str2 = p2.get("web_uri");
          if (str2 != null) {
             str2 = str2.trim();
             str1 = "http://";
             if (!str2.startsWith(str1) && !str2.startsWith("https://")) {
                str2 = str1+str2;
             }
             try{
                str1 = new URL(str2).getProtocol();
                if (("http").equals(str1) || ("https").equals(str1)) {
                   try{
                      intent1 = new Intent("android.intent.action.VIEW");
                      intent1.setData(Uri.parse(str2));
                      o.m(p0, p1, intent1);
                      goto label_00cd ;
                   }catch(java.net.MalformedURLException e6){
                   }
                   c.u("Cause: "+e6.getMessage());
                   goto label_00cd ;
                }
             }catch(java.net.MalformedURLException e6){
                intent1 = 0;
                goto label_0134 ;
             }
          }
       }
       if (launchIntent != null) {
          if (i >= 0) {
             launchIntent.setFlags(i);
          }
          k.U(launchIntent);
          int i1 = 0x10000000;
          try{
             launchIntent.addFlags(i1);
             if (p0.getPackageManager().resolveActivity(launchIntent, 0x10000) != null) {
                return launchIntent;
             }else if(Build$VERSION.SDK_INT >= 30 && (!m6.j(p0) && (v.c).equals(str))){
                return launchIntent;
             }else {
                c.l("not resolve activity:"+launchIntent);
             }
          }catch(java.lang.Exception e5){
             c.u("Cause: "+e5.getMessage());
          }
       }
    }
    public static String Q(id p0){
       if (k.J(p0)) {
          return "E100002";
       }
       if (k.a0(p0)) {
          return "E100000";
       }
       if (k.W(p0)) {
          return "E100001";
       }
       if (k.b0(p0)) {
          return "E100003";
       }
       return "";
    }
    public static void R(Context p0,String p1){
       if (!m6.j(p0) || (k.d != null && !TextUtils.isEmpty(p1))) {
          k.d.c(p1);
       }
    label_0016 :
       return;
    }
    public static void S(Context p0,String p1,int p2){
       g.b(o.c(p0, "pref_notify_type", 0).edit().putInt(p1, p2));
    }
    public static void T(Context p0,String p1,a4 p2,Map p3){
       if (!m6.j(p0)) {
          String str = k.u(p3, "fcm_icon_uri");
          String str1 = k.u(p3, "fcm_icon_color");
          if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str1)) {
             int i = k.b(p0, p1, str);
             if (i > 0) {
                p2.setSmallIcon(i);
                p2.f(str1);
             label_002d :
                if (!1) {
                   if (Build$VERSION.SDK_INT >= 23) {
                      p2.setSmallIcon(Icon.createWithResource(p1, o.b(p0, p1)));
                   }else {
                      p2.setSmallIcon(k.N(p0, p1));
                   }
                }
                return;
             }
          }
       }
       int i1 = 0;
       goto label_002d ;
    }
    public static void U(Intent p0){
       p0.setFlags(((((p0.getFlags() & 0xfe) & 0xfd) & 0xbf) & 0xff7f));
    }
    public static boolean V(Context p0,String p1){
       return o.c(p0, "pref_notify_type", 0).contains(p1);
    }
    public static boolean W(id p0){
       hu ohu = p0.a();
       boolean b = true;
       if (!k.I(ohu) || (ohu.b != b || k.J(p0))) {
          b = false;
       }
       return b;
    }
    public static boolean X(Map p0){
       if (p0 != null) {
          return ("6").equals(p0.get("notification_style_type"));
       }
       c.l("meta extra is null");
       return false;
    }
    public static int Y(Map p0){
       int i;
       String str = p0.get("notification_priority");
       if (!TextUtils.isEmpty(str)) {
          try{
             c.t("priority="+str);
             i = Integer.parseInt(str);
          label_003d :
             return i;
          }catch(java.lang.Exception e2){
             c.u("parsing notification priority error: "+e2);
          }
          i = 0;
          goto label_003d ;
       }else {
          goto label_003c ;
       }
    }
    public static void Z(Context p0,String p1){
       g.b(o.c(p0, "pref_notify_type", 0).edit().remove(p1));
    }
    public static int a(Context p0,String p1){
       return o.c(p0, "pref_notify_type", 0).getInt(p1, Integer.MAX_VALUE);
    }
    public static boolean a0(id p0){
       hu ohu = p0.a();
       boolean b = (k.I(ohu) && (ohu.b == null && !k.J(p0)))? true: false;
       return b;
    }
    public static int b(Context p0,String p1,String p2){
       if (p1.equals(p0.getPackageName())) {
          return p0.getResources().getIdentifier(p2, "drawable", p1);
       }
       return 0;
    }
    public static boolean b0(id p0){
       boolean b = (p0.a() == hh.a)? true: false;
       return b;
    }
    public static int c(Context p0,String p1,Map p2,int p3){
       Intent intent = k.P(p0, p1, p2, p3);
       if (intent != null) {
          ComponentName uComponentNa = z0.a(p0, intent);
          if (uComponentNa != null) {
             return uComponentNa.hashCode();
          }
       }
       return 0;
    }
    public static boolean c0(id p0){
       boolean b = (!k.J(p0) && (k.a0(p0) || k.W(p0)))? true: false;
       return b;
    }
    public static int d(Map p0){
       CharSequence uCharSequenc = (p0 == null)? null: p0.get("timeout");
       try{
          int i = 0;
          if (!TextUtils.isEmpty(uCharSequenc)) {
             i = Integer.parseInt(uCharSequenc);
          }
          return i;
       }catch(java.lang.Exception e0){
       }
    }
    public static Notification e(Notification p0){
       Object obj = l0.d(p0, "extraNotification");
       if (obj != null) {
          Object[] objArray = new Object[]{Boolean.TRUE};
          l0.e(obj, "setCustomizedIcon", objArray);
       }
       return p0;
    }
    public static PendingIntent f(Context p0,id p1,String p2,byte[] p3,int p4){
       return k.g(p0, p1, p2, p3, p4, 0, k.F(p0, p1, p2));
    }
    public static PendingIntent g(Context p0,id p1,String p2,byte[] p3,int p4,int p5,boolean p6){
       int i;
       Intent intent1;
       Context uContext = p0;
       String str = p2;
       byte[] uobyteArray = p3;
       if (k.a0(p1)) {
          i = 1000;
       }else if(k.J(p1)){
          i = 3000;
       }else {
          i = -1;
       }
       hu ohu = p1.a();
       String str1 = (ohu != null)? ohu.a(): "";
       boolean b = k.J(p1);
       String str2 = "eventMessageType";
       int i1 = 0xa000000;
       int i2 = 0x8000000;
       String str3 = 31;
       int i3 = 0;
       if (ohu != null && !TextUtils.isEmpty(ohu.e)) {
          Intent intent = new Intent("android.intent.action.VIEW");
          Uri uri = Uri.parse(ohu.e);
          try{
             intent.setData(uri);
             String protocol = new URL(ohu.e).getProtocol();
             if (("http").equals(protocol) || ("https").equals(protocol)) {
                o.m(uContext, str, intent);
             }else {
                intent.setPackage(str);
             }
          }catch(java.net.MalformedURLException e0){
             c.l("meet URL exception : "+ohu.e);
             intent.setPackage(e0);
          }
          intent.addFlags(0x10000000);
          intent.putExtra("messageId", str1);
          intent.putExtra(str2, i);
          if (Build$VERSION.SDK_INT >= str3) {
             return PendingIntent.getActivity(uContext, i3, intent, i1);
          }else {
             return PendingIntent.getActivity(uContext, i3, intent, i2);
          }
       }else {
          String str4 = "com.xiaomi.mipush.sdk.PushMessageHandler";
          if (b) {
             intent1 = new Intent();
             intent1.setComponent(new ComponentName("com.xiaomi.xmsf", str4));
          }else {
             intent1 = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
             intent1.setComponent(new ComponentName(str, str4));
          }
          intent1.putExtra("mipush_payload", uobyteArray);
          intent1.putExtra("mipush_notified", true);
          intent1.addCategory(String.valueOf(p4));
          intent1.addCategory(String.valueOf(str1));
          intent1.putExtra("notification_click_button", p5);
          intent1.putExtra("messageId", str1);
          intent1.putExtra(str2, i);
          if (!b && p6) {
             Intent intent2 = new Intent();
             intent2.setComponent(k.i(p2));
             intent2.addFlags(0x10800000);
             intent2.putExtra("mipush_serviceIntent", intent1);
             intent2.addCategory(String.valueOf(p4));
             intent2.addCategory(String.valueOf(str1));
             intent2.addCategory(String.valueOf(p5));
             k.w(p0, intent2, p1, ohu, str1, p5);
             k.D(intent2);
             if (Build$VERSION.SDK_INT >= 31) {
                return PendingIntent.getActivity(uContext, 0, intent2, 0xa000000);
             }else {
                return PendingIntent.getActivity(uContext, 0, intent2, 0x8000000);
             }
          }else {
             k.w(p0, intent1, p1, ohu, str1, p5);
             if (Build$VERSION.SDK_INT >= 31) {
                return PendingIntent.getService(uContext, 0, intent1, 0xa000000);
             }else {
                return PendingIntent.getService(uContext, 0, intent1, 0x8000000);
             }
          }
       }
    }
    public static PendingIntent h(Context p0,String p1,id p2,byte[] p3,int p4,int p5){
       Map map = p2.a().a();
       PendingIntent pendingInten = null;
       if (map == null) {
          return pendingInten;
       }
       boolean b = k.F(p0, p2, p1);
       if (b) {
          pendingInten = k.g(p0, p2, p1, p3, p4, p5, b);
       }else {
          Intent intent = k.j(p0, p1, map, p5);
          if (intent != null) {
             int i = (Build$VERSION.SDK_INT >= 31)? 0xa000000: 0x8000000;
             pendingInten = PendingIntent.getActivity(p0, 0, intent, i);
          }
       }
       return pendingInten;
    }
    public static ComponentName i(String p0){
       return new ComponentName(p0, "com.xiaomi.mipush.sdk.NotificationClickedActivity");
    }
    public static Intent j(Context p0,String p1,Map p2,int p3){
       int i = 1;
       if (k.X(p2)) {
          Object[] objArray = new Object[i];
          objArray[0] = Integer.valueOf(p3);
          objArray = new Object[i];
          objArray[0] = Integer.valueOf(p3);
          objArray = new Object[i];
          objArray[0] = Integer.valueOf(p3);
          objArray = new Object[i];
          objArray[0] = Integer.valueOf(p3);
          return k.k(p0, p1, p2, String.format("cust_btn_%s_ne", objArray), String.format("cust_btn_%s_iu", objArray), String.format("cust_btn_%s_ic", objArray), String.format("cust_btn_%s_wu", objArray));
       }else if(p3 != i){
          if (p3 == 2) {
             return k.k(p0, p1, p2, "notification_style_button_mid_notify_effect", "notification_style_button_mid_intent_uri", "notification_style_button_mid_intent_class", "notification_style_button_mid_web_uri");
          }
          if (p3 == 3) {
             return k.k(p0, p1, p2, "notification_style_button_right_notify_effect", "notification_style_button_right_intent_uri", "notification_style_button_right_intent_class", "notification_style_button_right_web_uri");
          }
          if (p3 != 4) {
             return null;
          }
          return k.k(p0, p1, p2, "notification_colorful_button_notify_effect", "notification_colorful_button_intent_uri", "notification_colorful_button_intent_class", "notification_colorful_button_web_uri");
       }else {
          return k.k(p0, p1, p2, "notification_style_button_left_notify_effect", "notification_style_button_left_intent_uri", "notification_style_button_left_intent_class", "notification_style_button_left_web_uri");
       }
    }
    public static Intent k(Context p0,String p1,Map p2,String p3,String p4,String p5,String p6){
       Intent launchIntent;
       String str;
       Intent intent;
       Intent intent1;
       p3 = p2.get(p3);
       if (TextUtils.isEmpty(p3)) {
          return null;
       }
       if ((v.a).equals(p3)) {
          try{
             launchIntent = p0.getPackageManager().getLaunchIntentForPackage(p1);
          }catch(java.lang.Exception e4){
             c.u("Cause: "+e4.getMessage());
          }
       }else if((v.b).equals(p3)){
          if (p2.containsKey(p4)) {
             str = p2.get(p4);
             if (str != null) {
                int i1 = 1;
                try{
                   intent = Intent.parseUri(str, i1);
                   try{
                      intent.setPackage(p1);
                   label_0074 :
                      launchIntent = intent;
                   }catch(java.net.URISyntaxException e4){
                   }
                   c.u("Cause: "+e4.getMessage());
                   goto label_0074 ;
                }catch(java.net.URISyntaxException e4){
                   intent = 0;
                   goto label_005e ;
                }
             }
          }else if(p2.containsKey(p5)){
             intent1 = new Intent();
             intent1.setComponent(new ComponentName(p1, p2.get(p5)));
          label_0090 :
             launchIntent = intent1;
          }
       }else if((v.c).equals(p3)){
          str = p2.get(p6);
          if (!TextUtils.isEmpty(str)) {
             str = str.trim();
             p4 = "http://";
             if (!str.startsWith(p4) && !str.startsWith("https://")) {
                str = p4+str;
             }
             try{
                p4 = new URL(str).getProtocol();
                if (("http").equals(p4) || ("https").equals(p4)) {
                   try{
                      intent1 = new Intent("android.intent.action.VIEW");
                      intent1.setData(Uri.parse(str));
                      o.m(p0, p1, intent1);
                      goto label_0090 ;
                   }catch(java.net.MalformedURLException e4){
                   }
                   c.u("Cause: "+e4.getMessage());
                   goto label_0090 ;
                }
             }catch(java.net.MalformedURLException e4){
                intent1 = 0;
                goto label_00f9 ;
             }
          }
       }
       if (launchIntent != null) {
          int i = 0x10000000;
          try{
             launchIntent.addFlags(i);
             if (p0.getPackageManager().resolveActivity(launchIntent, 0x10000) != null) {
                return launchIntent;
             }else if(Build$VERSION.SDK_INT >= 30 && (!m6.j(p0) && (v.c).equals(p3))){
                return launchIntent;
             }else {
                c.l("not resolve activity:"+launchIntent+"for buttons");
             }
          }catch(java.lang.Exception e3){
             c.u("Cause: "+e3.getMessage());
          }
       }
    }
    public static Bitmap l(Context p0,int p1){
       return k.n(p0.getResources().getDrawable(p1));
    }
    public static Bitmap m(Context p0,String p1,boolean p2){
       Bitmap uBitmap;
       Future uFuture = k.c.submit(new k$a(p1, p0, p2));
       long l = 180;
       try{
          int i = 1;
          uBitmap = uFuture.get(l, TimeUnit.SECONDS);
          if (uBitmap == null) {
             uFuture.cancel(i);
          }
       }catch(java.lang.InterruptedException e3){
       }catch(java.util.concurrent.ExecutionException e3){
       }catch(java.util.concurrent.TimeoutException e3){
       }
       return uBitmap;
    }
    public static Bitmap n(Drawable p0){
       if (p0 instanceof BitmapDrawable) {
          return p0.getBitmap();
       }
       int intrinsicWid = p0.getIntrinsicWidth();
       int i = 1;
       if (intrinsicWid <= 0) {
          intrinsicWid = 1;
       }
       int intrinsicHei = p0.getIntrinsicHeight();
       if (intrinsicHei > 0) {
          i = intrinsicHei;
       }
       Bitmap uBitmap = Bitmap.createBitmap(intrinsicWid, i, Bitmap$Config.ARGB_8888);
       Canvas uCanvas = new Canvas(uBitmap);
       p0.setBounds(0, 0, uCanvas.getWidth(), uCanvas.getHeight());
       p0.draw(uCanvas);
       return uBitmap;
    }
    public static RemoteViews o(Context p0,id p1,byte[] p2){
       String str6;
       int identifier1;
       String str = "time";
       String str1 = "image";
       String str2 = "text";
       hu ohu = p1.a();
       String str3 = k.s(p1);
       if (ohu != null && ohu.a() != null) {
          Map map = ohu.a();
          String str4 = map.get("layout_name");
          String str5 = map.get("layout_value");
          if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
             PackageManager packageManag = p0.getPackageManager();
             try{
                Resources resourcesFor = packageManag.getResourcesForApplication(str3);
                int identifier = resourcesFor.getIdentifier(str4, "layout", str3);
                if (!identifier) {
                   return null;
                }else {
                   try{
                      RemoteViews remoteViews = new RemoteViews(str3, identifier);
                      JSONObject jSONObject = new JSONObject(str5);
                      if (jSONObject.has(str2)) {
                         JSONObject jSONObject1 = jSONObject.getJSONObject(str2);
                         Iterator iterator = jSONObject1.keys();
                         while (iterator.hasNext()) {
                            str6 = iterator.next();
                            String str7 = jSONObject1.getString(str6);
                            identifier1 = resourcesFor.getIdentifier(str6, "id", str3);
                            if (identifier1 > 0) {
                               remoteViews.setTextViewText(identifier1, str7);
                            }
                         }
                      }
                      if (jSONObject.has(str1)) {
                         JSONObject jSONObject2 = jSONObject.getJSONObject(str1);
                         Iterator iterator1 = jSONObject2.keys();
                         while (iterator1.hasNext()) {
                            str5 = iterator1.next();
                            str6 = jSONObject2.getString(str5);
                            int identifier2 = resourcesFor.getIdentifier(str5, "id", str3);
                            identifier1 = resourcesFor.getIdentifier(str6, "drawable", str3);
                            if (identifier2 > 0) {
                               remoteViews.setImageViewResource(identifier2, identifier1);
                            }
                         }
                      }
                      if (jSONObject.has(str)) {
                         JSONObject jSONObject3 = jSONObject.getJSONObject(str);
                         Iterator iterator2 = jSONObject3.keys();
                         while (iterator2.hasNext()) {
                            str2 = iterator2.next();
                            str5 = jSONObject3.getString(str2);
                            if (!str5.length()) {
                               str5 = "yy-MM-dd hh:mm";
                            }
                            int identifier3 = resourcesFor.getIdentifier(str2, "id", str3);
                            if (identifier3 > 0) {
                               remoteViews.setTextViewText(identifier3, new SimpleDateFormat(str5).format(new Date(System.currentTimeMillis())));
                            }
                         }
                      }
                      return remoteViews;
                   }catch(org.json.JSONException e9){
                      c.o(e9);
                      return null;
                   }
                }
             }catch(android.content.pm.PackageManager$NameNotFoundException e9){
                c.o(e9);
             }
          }
       }
    }
    public static k$b p(Context p0,id p1,byte[] p2,RemoteViews p3,PendingIntent p4,int p5){
       a4 uoa4;
       boolean i1;
       String str3;
       int i4;
       object oobject;
       Object[] objArray1;
       StringBuilder str4;
       m$b a;
       String str5;
       boolean b;
       hu a1;
       k$b uob2;
       String obj1;
       int i5;
       String str7;
       Object[] objArray3;
       Notification notification;
       k$b uob3;
       Context uContext = p0;
       RemoteViews remoteViews = p3;
       k$b uob = new k$b();
       hu ohu = p1.a();
       String str = k.s(p1);
       Map map = ohu.a();
       String[] stringArray = k.M(uContext, ohu);
       int i = 1;
       String str1 = "notification_style_type";
       if (remoteViews) {
          uoa4 = new a4(uContext);
          uoa4.e(remoteViews);
          i1 = p5;
       }else if(map != null && map.containsKey(str1)){
          uoa4 = k.v(uContext, p1, p2, stringArray[i], p5);
       }else {
          uoa4 = new a4(uContext);
       }
       a4 uoa41 = uoa4;
       a4 uoa42 = uoa41;
       k.E(uoa41, p0, p1.b(), p1, p2, p5);
       int i2 = 0;
       uoa42.setContentTitle(stringArray[i2]);
       int i3 = 1;
       uoa42.setContentText(stringArray[i3]);
       long l = System.currentTimeMillis();
       uoa42.setWhen(l);
       String str2 = k.u(map, "notification_show_when");
       Object[] objArray = 24;
       if (TextUtils.isEmpty(str2)) {
          if (Build$VERSION.SDK_INT >= objArray) {
             uoa42.setShowWhen(i3);
          }
       }else {
          uoa42.setShowWhen(Boolean.parseBoolean(str2));
       }
       uoa42.setContentIntent(p4);
       k.B(uContext, str, uoa42, map);
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 23) {
          str3 = "notification_small_icon_uri";
          if (map == null) {
             i4 = 1;
             oobject = null;
          }else {
             i4 = true;
             oobject = k.m(uContext, map.get(str3), i4);
          }
          if (oobject != null) {
             objArray = new Object[i4];
             objArray[i2] = oobject;
             Bundle obj = l0.g("android.graphics.drawable.Icon", "createWithBitmap", objArray);
             if (obj != null) {
                objArray1 = new Object[i4];
                objArray1[0] = obj;
                l0.e(uoa42, "setSmallIcon", objArray1);
                obj = new Bundle();
                obj.putBoolean("miui.isGrayscaleIcon", i4);
                uoa42.d(obj);
             label_0101 :
                uoa42.f(k.u(map, "notification_small_icon_color"));
             }else {
                str4 = "failed te get small icon with url:";
                str3 = map.get(str3);
             }
          }else {
             str4 = "failed to get small icon url:";
             str3 = k.u(map, str3);
          }
          c.l(str4+str3);
          goto label_0101 ;
       }
       str4 = k.u(map, "__dynamic_icon_uri");
       str3 = (Boolean.parseBoolean(k.u(map, "__adiom")) || !m6.i())? 1: null;
       if (!TextUtils.isEmpty(str4) && str3) {
          if (str4.startsWith("http")) {
             m$b uob1 = m.d(uContext, str4, true);
             a = uob1.a;
             uob.b = uob1.b;
          }else {
             a = m.b(uContext, str4);
          }
          if (a != null) {
             uoa42.setLargeIcon(a);
             str3 = 1;
          label_014e :
             Bitmap uBitmap = (map == null)? null: k.m(uContext, map.get("notification_large_icon_uri"), true);
             if (uBitmap != null) {
                uoa42.setLargeIcon(uBitmap);
             }
             str4 = "com.xiaomi.xmsf";
             if (map != null && sDK_INT >= 24) {
                str5 = map.get("notification_group");
                i1 = Boolean.parseBoolean(map.get("notification_is_summary"));
                b = Boolean.parseBoolean(map.get("notification_group_disable_default"));
                if (TextUtils.isEmpty(str5) && (m6.i() || !b)) {
                   str5 = k.s(p1);
                }
                String str6 = str5;
                Object[] objArray2 = new Object[]{Boolean.valueOf(i1)};
                l0.e(uoa42, "setGroupSummary", objArray2);
                str5 = map.get(str1);
                if (str4.equals(p0.getPackageName()) && (("4").equals(str5) || ("3").equals(str5))) {
                   str5 = k.s(p1)+"_custom_"+l;
                   b = 1;
                label_01f0 :
                   uoa42.setAutoCancel(true);
                   long l1 = System.currentTimeMillis();
                   if (map != null) {
                      str1 = "ticker";
                      if (map.containsKey(str1)) {
                         uoa42.setTicker(map.get(str1));
                      }
                   }
                   if ((l1 - k.a) - 0x2710 > 0) {
                      k.a = l1;
                      a1 = ohu.a;
                      if (k.V(uContext, str)) {
                         a1 = k.a(uContext, str);
                      }
                      uoa42.setDefaults(a1);
                      if (map != null && (a1 & 0x01)) {
                         uob2 = uob;
                         obj1 = map.get("sound_uri");
                         if (!TextUtils.isEmpty(obj1)) {
                            i5 = str3;
                            str7 = str4;
                            if (obj1.startsWith("android.resource://"+str)) {
                               uoa42.setDefaults((a1 ^ 0x01));
                               uoa42.setSound(Uri.parse(obj1));
                            }
                         }else {
                            str7 = str4;
                            i5 = str3;
                         }
                      }else {
                         str7 = str4;
                         i5 = str3;
                         uob2 = uob;
                      }
                   }else {
                      str7 = str4;
                      i5 = str3;
                      uob2 = uob;
                      a1 = -100;
                   }
                   str4 = "0";
                   objArray1 = 26;
                   if (map != null && sDK_INT >= objArray1) {
                      n on = n.l(uContext, str);
                      sDK_INT = k.d(map);
                      if (sDK_INT > 0) {
                         objArray1 = new Object[]{Long.valueOf((long)(sDK_INT * 1000))};
                         obj1 = str4;
                         l0.e(uoa42, "setTimeoutAfter", objArray1);
                      }else {
                         obj1 = str4;
                      }
                      k.h(ohu);
                      Object obj2 = map.get("channel_id");
                      if (!TextUtils.isEmpty(obj2) || p0.getApplicationInfo().targetSdkVersion >= 26) {
                         j0.f(uContext, map, uoa42, l);
                         objArray1 = new Object[]{k.d(on, obj2, k.r(uContext, str, map), map.get("channel_description"), ohu.a, k.O(map), map.get("sound_uri"), map.get("channel_perm"))};
                         l0.e(uoa42, "setChannelId", objArray1);
                         if (a1 == -100 && o.r(map)) {
                            o.o(uoa42, i1);
                         }
                         if (("pulldown").equals(o.h(map)) && (o.r(map) && Objects.equals(map.get("pull_down_pop_type"), obj1))) {
                            o.o(uoa42, i1);
                         }
                      label_0326 :
                         if (("tts").equals(o.h(map)) && o.r(map)) {
                            o.o(uoa42, i1);
                         }
                      }
                   label_033b :
                      str2 = map.get("background_color");
                      if (!TextUtils.isEmpty(str2)) {
                         try{
                            uoa42.setOngoing(true);
                            uoa42.setColor(Integer.parseInt(str2));
                            objArray1 = new Object[true];
                            objArray1[0] = Boolean.TRUE;
                            l0.e(uoa42, "setColorized", objArray1);
                         }catch(java.lang.Exception e0){
                            c.o(e0);
                         }
                      }
                   }else {
                      obj1 = str4;
                      if (map != null && sDK_INT < 26) {
                         objArray1 = new Object[]{Integer.valueOf(k.Y(map))};
                         l0.e(uoa42, "setPriority", objArray1);
                      }
                   }
                }else {
                   str5 = str6;
                }
             }else {
                str5 = null;
                i1 = false;
             }
             b = 0;
             goto label_01f0 ;
          }
       }
    label_014d :
       str3 = null;
       goto label_014e ;
    }
    public static k$c q(Context p0,id p1,byte[] p2){
       int i;
       Map map;
       String str1;
       n on;
       k ok;
       int i3;
       LinkedList b;
       Context uContext = p0;
       id oid = p1;
       k$c uoc = new k$c();
       g$b uob = g.f(uContext, k.s(p1), true);
       hu ohu = p1.a();
       String str = null;
       if (ohu != null) {
          i = ohu.c();
          map = ohu.a();
       }else {
          i = 0;
          map = str;
       }
       int i1 = g7.e(k.s(p1), i);
       if (m6.j(p0) && uob == g$b.c) {
          if (ohu != null) {
             y3.a(p0.getApplicationContext()).g(p1.b(), k.Q(p1), ohu.a(), "10:"+k.s(p1));
          }
          str1 = "Do not notify because user block "+k.s(p1)+"¡®s notification";
       }else if(m6.j(p0) && (k.d != null && k.d.d(uContext, i1, k.s(p1), map))){
          if (ohu != null) {
             y3.a(p0.getApplicationContext()).g(p1.b(), k.Q(p1), ohu.a(), "14:"+k.s(p1));
          }
          str1 = "Do not notify because card notification is canceled or sequence incorrect";
       }else {
          RemoteViews remoteViews = k.o(p0, p1, p2);
          PendingIntent pendingInten = k.f(uContext, oid, p1.b(), p2, i1);
          if (pendingInten == null) {
             if (ohu != null) {
                y3.a(p0.getApplicationContext()).g(p1.b(), k.Q(p1), ohu.a(), "11");
             }
             str1 = "The click PendingIntent is null. ";
          }else {
             k$b uob1 = k.p(p0, p1, p2, remoteViews, pendingInten, i1);
             uoc.b = uob1.b;
             uoc.a = k.s(p1);
             k$b a = uob1.a;
             if (m6.i()) {
                if (!TextUtils.isEmpty(ohu.a())) {
                   a.extras.putString("message_id", ohu.a());
                }
                a.extras.putString("local_paid", p1.a());
                o.n(map, a.extras, "msg_busi_type");
                o.n(map, a.extras, "disable_notification_flags");
                CharSequence uCharSequenc = (ohu.b() == null)? str: ohu.b().get("score_info");
                if (!TextUtils.isEmpty(uCharSequenc)) {
                   a.extras.putString("score_info", uCharSequenc);
                }
                a.extras.putString("pushUid", k.u(ohu.a, "n_stats_expose"));
                int i2 = -1;
                if (k.a0(p1)) {
                   i2 = 1000;
                }else if(k.J(p1)){
                   i2 = 3000;
                }
                a.extras.putString("eventMessageType", String.valueOf(i2));
                a.extras.putString("target_package", k.s(p1));
             }
             if (ohu.a() != null) {
                str = ohu.a().get("message_count");
             }
             if (m6.i() && str != null) {
                try{
                   o.i(a, Integer.parseInt(str));
                }catch(java.lang.NumberFormatException e0){
                   y3.a(p0.getApplicationContext()).i(p1.b(), k.Q(p1), ohu.a(), "8");
                   c.u("fail to set message count. "+e0);
                }
             }
          }
       }
       c.l(str1);
       return uoc;
    }
    public static String r(Context p0,String p1,Map p2){
       if (!TextUtils.isEmpty(p2.get("channel_name"))) {
          return p2.get("channel_name");
       }
       return g.m(p0, p1);
    }
    public static String s(id p0){
       if (("com.xiaomi.xmsf").equals(p0.b)) {
          hu ohu = p0.a();
          if (ohu != null && ohu.a() != null) {
             String str = ohu.a().get("miui_package_name");
             if (!TextUtils.isEmpty(str)) {
                return str;
             }
          }
       }
       return p0.b;
    }
    public static String t(Map p0,int p1){
       String str1;
       String str = null;
       if (!p1) {
          str1 = "notify_effect";
       }else {
          int i = 1;
          if (k.X(p0)) {
             Object[] objArray = new Object[i];
             objArray[0] = Integer.valueOf(p1);
             str1 = String.format("cust_btn_%s_ne", objArray);
          }else if(p1 == i){
             str1 = "notification_style_button_left_notify_effect";
          }else if(p1 == 2){
             str1 = "notification_style_button_mid_notify_effect";
          }else if(p1 == 3){
             str1 = "notification_style_button_right_notify_effect";
          }else if(p1 == 4){
             str1 = "notification_colorful_button_notify_effect";
          }else {
             str1 = str;
          }
       }
       if (p0 != null && str1 != null) {
          str = p0.get(str1);
       }
       return str;
    }
    public static String u(Map p0,String p1){
       String str = (p0 != null)? p0.get(p1): null;
       return str;
    }
    public static a4 v(Context p0,id p1,byte[] p2,String p3,int p4){
       String str2;
       String str = k.s(p1);
       Map map = p1.a().a();
       String str1 = map.get("notification_style_type");
       Bitmap uBitmap = null;
       a4 uoa4 = (m6.j(p0) && k.d != null)? k.d.a(p0, p4, str, map): uBitmap;
       if (uoa4 != null) {
          uoa4.g(map);
       }else if(("2").equals(str1)){
          uoa4 = new a4(p0);
          str2 = "notification_bigPic_uri";
          Bitmap uBitmap1 = (TextUtils.isEmpty(map.get(str2)))? uBitmap: k.m(p0, map.get(str2), false);
          if (uBitmap1 == null) {
             c.l("can not get big picture.");
             return uoa4;
          }else {
             Notification$BigPictureStyle uBigPictureS = new Notification$BigPictureStyle(uoa4);
             uBigPictureS.bigPicture(uBitmap1);
             uBigPictureS.setSummaryText(p3);
             uBigPictureS.bigLargeIcon(uBitmap);
             uoa4.setStyle(uBigPictureS);
          }
       }else if(("1").equals(str1)){
          uoa4 = new a4(p0);
          uoa4.setStyle(new Notification$BigTextStyle().bigText(p3));
       }else if(("4").equals(str1) && m6.i()){
          uoa4 = new z3(p0, str);
          str2 = "notification_banner_image_uri";
          if (!TextUtils.isEmpty(map.get(str2))) {
             uoa4.F(k.m(p0, map.get(str2), false));
          }
          str2 = "notification_banner_icon_uri";
          if (!TextUtils.isEmpty(map.get(str2))) {
             uoa4.H(k.m(p0, map.get(str2), false));
          }
          uoa4.g(map);
       }else if(("3").equals(str1) && m6.i()){
          b4 uob4 = new b4(p0, p4, str);
          if (!TextUtils.isEmpty(map.get("notification_colorful_button_text"))) {
             PendingIntent pendingInten = k.h(p0, str, p1, p2, p4, 4);
             if (pendingInten != null) {
                uob4.H(map.get("notification_colorful_button_text"), pendingInten);
                uob4.I(map.get("notification_colorful_button_bg_color"));
             }
          }
          str2 = "notification_colorful_bg_color";
          if (!TextUtils.isEmpty(map.get(str2))) {
             uob4.K(map.get(str2));
          }else {
             str2 = "notification_colorful_bg_image_uri";
             if (!TextUtils.isEmpty(map.get(str2))) {
                uob4.G(k.m(p0, map.get(str2), false));
             }
          }
          uob4.g(map);
          uoa4 = uob4;
       }else {
          uoa4 = new a4(p0);
       }
       return uoa4;
    }
    public static void w(Context p0,Intent p1,id p2,hu p3,String p4,int p5){
       if (p3 != null && !TextUtils.isEmpty(p4)) {
          String str = k.t(p3.a(), p5);
          if (!TextUtils.isEmpty(str) && (!(v.a).equals(str) && ((v.b).equals(str) || (v.c).equals(str)))) {
             p1.putExtra("messageId", p4);
             p1.putExtra("local_paid", p2.a);
             if (!TextUtils.isEmpty(p2.b)) {
                p1.putExtra("target_package", p2.b);
             }
             p1.putExtra("job_key", k.u(p3.a(), "jobkey"));
             p1.putExtra(p5+"_"+"target_component", k.c(p0, p2.b, p3.a(), p5));
          }
       }
       return;
    }
    public static void x(Context p0,String p1){
       k.y(p0, p1, -1);
    }
    public static void y(Context p0,String p1,int p2){
       k.z(p0, p1, p2, -1);
    }
    public static void z(Context p0,String p1,int p2,int p3){
       if (p0 != null && !TextUtils.isEmpty(p1)) {
          int i = -1;
          if (p2 >= i) {
             n on = n.l(p0, p1);
             List list = on.z();
             if (g7.d(list)) {
                return;
             }else {
                LinkedList linkedList = new LinkedList();
                int i1 = 0;
                if (p2 == i) {
                   i1 = 1;
                }else {
                   int i2 = ((p1.hashCode() / 10) * 10) + p2;
                }
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   StatusBarNotification statusBarNot = iterator.next();
                   if (!TextUtils.isEmpty(String.valueOf(statusBarNot.getId()))) {
                      int id = statusBarNot.getId();
                      if (i1) {
                         linkedList.add(statusBarNot);
                         on.m(id);
                      }else if(0 == id){
                         t0.b(p0, statusBarNot, p3);
                         linkedList.add(statusBarNot);
                         on.m(id);
                         break ;
                      }
                   }
                }
                k.C(p0, linkedList);
             }
          }
       }
       return;
    }
}
