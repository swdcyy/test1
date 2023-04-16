package lv8.c;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.res.Resources;
import cw9.c;
import java.lang.reflect.Field;
import java.lang.Integer;
import java.lang.Float;
import android.util.DisplayMetrics;
import java.lang.Long;
import java.util.Locale;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import java.lang.Boolean;
import android.view.ViewTreeObserver;
import lv8.c$a;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.lang.StringBuilder;
import lv8.g;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Objects;
import com.yxcorp.gateway.pay.api.PayManager;
import com.yxcorp.gateway.pay.api.KwaiPayConfig;
import java.util.Collection;
import java.util.Map;
import android.content.Intent;
import android.net.Uri;
import java.util.List;
import java.util.Iterator;
import android.content.pm.ResolveInfo;
import android.content.pm.ActivityInfo;
import android.content.ComponentName;

public class c	// class@002dad
{
    public static int a;

    public static int a(Context p0){
       Class obj = PatchProxy.applyOneRefs(p0, null, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int a = c.a;
       if (a > 0) {
          return a;
       }
       String str = "status_bar_height";
       a = p0.getResources().getIdentifier(str, "dimen", "android");
       if (a > 0) {
          c.a = c.b(p0.getResources(), a);
       }else {
          obj = Class.forName("com.android.internal.R$dimen");
          Object obj1 = obj.newInstance();
          Field field = obj.getField(str);
          field.setAccessible(true);
          c.a = c.b(p0.getResources(), Integer.parseInt(field.get(obj1).toString()));
       }
       if (c.a <= 0) {
          c.a = c.b(p0, 25.00f);
       }
       return c.a;
    }
    public static int b(Context p0,float p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), null, uoc, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return (int)((p1 * c.c(p0.getResources()).density) + 0x3f000000);
    }
    public static String c(long p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), null, uoc, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[]{Float.valueOf(((float)p0 / 100.00f))};
       return String.format(Locale.US, "%.2f", objArray);
    }
    public static String d(JsonObject p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       JsonElement jsonElement = p0.e0(p1);
       if (jsonElement != null && jsonElement.F()) {
          p2 = jsonElement.w();
       }
       return p2;
    }
    public static void e(View p0,int p1,int p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, c.class, "13")) {
          return;
       }
       p0.clearAnimation();
       p0.setVisibility(p1);
       p0.startAnimation(AnimationUtils.loadAnimation(p0.getContext().getApplicationContext(), p2));
       return;
    }
    public static void f(View p0,View p1,float p2,boolean p3,int p4){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,Float.valueOf(p2),Boolean.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, uoc, "12")) {
             return;
          }
       }
       c$a uoa = new c$a(p0, p2, p4, p1, p3);
       p0.getViewTreeObserver().addOnPreDrawListener(v7);
       return;
    }
    public static boolean g(Context p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       try{
          p0.getPackageManager().getPackageInfo(p1, i);
          return true;
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          g.d("PayUtils: isIntalled: package "+p1+" not found");
          return e0;
       }
    }
    public static boolean h(String p0){
       boolean b;
       String obj = PatchProxy.applyOneRefs(p0, null, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.isEmpty(p0)) {
          return false;
       }
       obj = p0.toLowerCase();
       Objects.requireNonNull(obj);
       int i = -1;
       switch (obj.hashCode()){
           case 0xaba96a4a:
             if (obj.equals("alipay")) {
                i = 0;
             }
             break;
           case 0xd0ce8b26:
             if (obj.equals("wechat")) {
                i = 1;
             }
             break;
           case 0xdc1b3738:
             if (obj.equals("union_pay")) {
                i = 2;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             b = PayManager.getInstance().isSupportAlipay();
             break;
           case 1:
             b = PayManager.getInstance().isSupportWechatPay();
             break;
           case 2:
             b = PayManager.getInstance().isSupportUnionPay();
             break;
           default:
             g.d("PayUtils: isSupportProvider: sdk "+p0+" not exist");
             return false;
       }
       return b;
    }
    public static boolean i(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (TextUtils.isEmpty(p0)) {
          return b;
       }
       if (("alipay").equalsIgnoreCase(p0) || (("wechat").equalsIgnoreCase(p0) && (("NORMAL").equalsIgnoreCase(p1) || (PayManager.getInstance().getKwaiPayConfig() != null && (PayManager.getInstance().getKwaiPayConfig().enableNativePayAfterUse() && ("PAY_AFTER_USE").equalsIgnoreCase(p1)))))) {
          b = true;
       }
    label_0055 :
       return b;
    }
    public static boolean j(Collection p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 == null || p0.isEmpty())? true: false;
       return b;
    }
    public static boolean k(Map p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 == null || p0.isEmpty())? true: false;
       return b;
    }
    public static Intent l(Context p0){
       Intent intent = null;
       String obj = PatchProxy.applyOneRefs(p0, intent, c.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "com.smile.gifmaker";
       if (!c.g(p0, obj)) {
          return intent;
       }
       Intent intent1 = new Intent("android.intent.action.VIEW", Uri.parse("kwai://kscoinpay"));
       List list = p0.getPackageManager().queryIntentActivities(intent1, 0x10000);
       if (c.j(list)) {
          return intent;
       }
       Iterator iterator = list.iterator();
       while (true) {
          if (iterator.hasNext()) {
             ResolveInfo resolveInfo = iterator.next();
             if (obj.equals(resolveInfo.activityInfo.packageName)) {
                ResolveInfo activityInfo = resolveInfo.activityInfo;
                intent1.setClassName(activityInfo.packageName, activityInfo.name);
             }
          }
          if (intent1.getComponent() != null) {
             intent = intent1;
             break ;
          }
          break ;
       }
       return intent;
    }
    public static boolean m(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (TextUtils.isEmpty(p0)) {
          return b;
       }
       if (("alipay").equalsIgnoreCase(p0) || ("wechat").equalsIgnoreCase(p0)) {
          b = true;
       }
       return b;
    }
}
