package com.yxcorp.gifshow.push.badge.b;
import java.util.ArrayList;
import com.yxcorp.gifshow.push.badge.impl.HuaweiHomeBadger;
import java.lang.Object;
import java.util.List;
import com.yxcorp.gifshow.push.badge.impl.HonorBadger;
import com.yxcorp.gifshow.push.badge.impl.b;
import com.yxcorp.gifshow.push.badge.impl.e;
import com.yxcorp.gifshow.push.badge.impl.OPPOHomeBadger;
import com.yxcorp.gifshow.push.badge.impl.c;
import com.yxcorp.gifshow.push.badge.impl.d;
import com.yxcorp.gifshow.push.badge.impl.a;
import com.yxcorp.gifshow.push.badge.compat.NovaHomeBadger;
import com.yxcorp.gifshow.push.badge.compat.a;
import com.yxcorp.gifshow.push.badge.compat.b;
import com.yxcorp.gifshow.push.badge.compat.c;
import k6c.a;
import com.yxcorp.gifshow.push.badge.compat.ZukHomeBadger;
import com.yxcorp.gifshow.push.badge.compat.ZTEHomeBadger;
import com.yxcorp.gifshow.push.badge.compat.EverythingMeHomeBadger;
import android.content.Context;
import android.app.Notification;
import l6c.a;
import com.yxcorp.gifshow.push.badge.a;
import java.lang.Throwable;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.pm.PackageManager;
import android.content.Intent;
import android.content.ComponentName;
import java.util.Iterator;
import android.content.pm.ResolveInfo;
import android.content.pm.ActivityInfo;
import android.os.Build;
import zsd.u;
import com.yxcorp.gifshow.push.badge.impl.OnePlusHomeBadger;
import com.yxcorp.gifshow.push.badge.impl.RealMeHomeBadger;
import com.yxcorp.gifshow.push.badge.ShortcutBadgeException;
import java.lang.Exception;
import nsd.u;

public final class b	// class@00161c
{
    public static final List a;
    public static a b;
    public static ComponentName c;
    public static final b d;

    static {
       b.d = new b();
       ArrayList uArrayList = new ArrayList();
       b.a = uArrayList;
       uArrayList.add(new HuaweiHomeBadger());
       uArrayList.add(new HonorBadger());
       uArrayList.add(new b());
       uArrayList.add(new e());
       uArrayList.add(new OPPOHomeBadger());
       uArrayList.add(new c());
       uArrayList.add(new d());
       uArrayList.add(new a());
       uArrayList.add(new NovaHomeBadger());
       uArrayList.add(new a());
       uArrayList.add(new b());
       uArrayList.add(new c());
       uArrayList.add(new a());
       uArrayList.add(new ZukHomeBadger());
       uArrayList.add(new ZTEHomeBadger());
       uArrayList.add(new EverythingMeHomeBadger());
    }
    public void b(){
       super();
    }
    public static void d(b p0,Context p1,Notification p2,int p3,Object p4){
       p0.c(p1, null);
    }
    public final void a(Context p0,Notification p1,int p2){
       try{
          this.b(p0, p1, p2);
          a.d.c(p0, b.b);
       }catch(com.yxcorp.gifshow.push.badge.ShortcutBadgeException e3){
          a.d.b(p0, b.b, e3);
       }
       return;
    }
    public final void b(Context p0,Notification p1,int p2){
       ComponentName uComponentNa;
       a b;
       ZukHomeBadger zukHomeBadge;
       if (b.b == null) {
          uComponentNa = null;
          if (p0 != null) {
             String packageName = p0.getPackageName();
             a.o(packageName, "context.packageName");
             if (!TextUtils.isEmpty(packageName)) {
                Intent launchIntent = p0.getPackageManager().getLaunchIntentForPackage(packageName);
                if (launchIntent != null) {
                   b.c = launchIntent.getComponent();
                   Intent intent = new Intent("android.intent.action.MAIN");
                   intent.addCategory("android.intent.category.HOME");
                   List list = p0.getPackageManager().queryIntentActivities(intent, 0x10000);
                   a.o(list, "context.packageManager\n ¡­nager.MATCH_DEFAULT_ONLY\)");
                   Iterator iterator = list.iterator();
                   while (iterator.hasNext()) {
                      ResolveInfo resolveInfo = iterator.next();
                      try{
                         ActivityInfo packageName1 = resolveInfo.activityInfo.packageName;
                         a.o(packageName1, "resolveInfo.activityInfo.packageName");
                      }catch(java.lang.Exception e0){
                         packageName = "";
                      }
                      if (TextUtils.isEmpty(packageName)) {
                         continue ;
                      }else {
                         Iterator iterator1 = b.a.iterator();
                         while (true) {
                            if (iterator1.hasNext()) {
                               a uoa = iterator1.next();
                               if (uoa.a().contains(packageName)) {
                                  b.b = uoa;
                               }
                            }
                            if (b.b != null) {
                            }else {
                               continue ;
                            }
                         }
                      }
                   }
                   boolean b1 = true;
                   if (b.b == null) {
                      String mANUFACTURER = Build.MANUFACTURER;
                      if (u.I1(mANUFACTURER, "ZUK", b1)) {
                         zukHomeBadge = new ZukHomeBadger();
                      }else if(u.I1(mANUFACTURER, "ONEPLUS", b1)){
                         zukHomeBadge = new OnePlusHomeBadger();
                      }else if(u.I1(mANUFACTURER, "OPPO", b1)){
                         zukHomeBadge = new OPPOHomeBadger();
                      }else if(u.I1(mANUFACTURER, "REALME", b1)){
                         zukHomeBadge = new RealMeHomeBadger();
                      }else if(u.I1(mANUFACTURER, "VIVO", b1)){
                         zukHomeBadge = new e();
                      }else if(u.I1(mANUFACTURER, "ZTE", b1)){
                         zukHomeBadge = new ZTEHomeBadger();
                      }else if(u.I1(mANUFACTURER, "HONOR", b1)){
                         zukHomeBadge = new HonorBadger();
                      }else if(u.I1(mANUFACTURER, "Xiaomi", b1)){
                         zukHomeBadge = new b();
                      }else if(u.I1(mANUFACTURER, "SONY", b1)){
                         zukHomeBadge = new d();
                      }else {
                         zukHomeBadge = new a();
                      }
                      b.b = zukHomeBadge;
                   }
                   uComponentNa = 1;
                }
             }
          }
          if (!uComponentNa) {
             throw new ShortcutBadgeException("No default launcher available", null, 2, null);
          }
       }
       try{
          uComponentNa = b.c;
          if (uComponentNa != null) {
             b = b.b;
             if (b != null) {
                b.b(p0, uComponentNa, p2, p1);
             }
          }
          return;
       }catch(java.lang.Exception e6){
          throw new ShortcutBadgeException("Unable to execute badge", e6);
       }
    }
    public final void c(Context p0,Notification p1){
       a.p(p0, "context");
       this.a(p0, p1, 0);
    }
}
