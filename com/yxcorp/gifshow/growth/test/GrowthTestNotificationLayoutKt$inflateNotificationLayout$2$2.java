package com.yxcorp.gifshow.growth.test.GrowthTestNotificationLayoutKt$inflateNotificationLayout$2$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.activitycontext.ActivityContext;
import kotlin.jvm.internal.a;
import android.app.Activity;
import vqa.k;
import java.lang.CharSequence;
import zsd.u;
import vsd.d;
import nsd.m0;
import java.lang.Boolean;
import android.content.SharedPreferences;
import pna.k;
import java.lang.NullPointerException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import android.net.Uri;
import android.content.Intent;
import android.content.Context;
import android.app.PendingIntent;
import androidx.core.app.NotificationCompat$Builder;
import pna.i;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.app.Notification;
import s7.b;

public final class GrowthTestNotificationLayoutKt$inflateNotificationLayout$2$2 extends Lambda implements a	// class@00150d
{
    public final String $notifyContentKey;
    public final String $notifyTitleKey;
    public final String $schemeKey;

    public void GrowthTestNotificationLayoutKt$inflateNotificationLayout$2$2(String p0,String p1,String p2){
       this.$schemeKey = p0;
       this.$notifyTitleKey = p1;
       this.$notifyContentKey = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray1;
       d uod;
       CharSequence uCharSequenc;
       int i;
       Object obj = this;
       String str = String.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, GrowthTestNotificationLayoutKt$inflateNotificationLayout$2$2.class, "1")) {
          return;
       }
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       Activity uActivity = uActivityCon.e();
       if (uActivity != null) {
          k b = k.b;
          GrowthTestNotificationLayoutKt$inflateNotificationLayout$2$2 $schemeKey = obj.$schemeKey;
          GrowthTestNotificationLayoutKt$inflateNotificationLayout$2$2 oinflateNoti = ($schemeKey == null || u.S1($schemeKey))? 1: null;
          try{
             if (!oinflateNoti) {
                d uod1 = m0.d(str);
                if (a.g(uod1, m0.d(Boolean.TYPE))) {
                   if (b.a().getBoolean($schemeKey, 0)) {
                      objArray1 = Boolean.TRUE;
                   }
                }else if(a.g(uod1, m0.d(str))){
                   objArray1 = b.a().getString($schemeKey, "");
                   i = (objArray1 == null || !objArray1.length())? 1: 0;
                   if (!i) {
                      if (objArray1 != null) {
                      }else {
                         throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                      }
                   }
                }else if(a.g(uod1, m0.d(Integer.TYPE))){
                   int intx2 = b.a().getInt($schemeKey, Integer.MIN_VALUE);
                   if (intx2 != Integer.MIN_VALUE) {
                      objArray1 = Integer.valueOf(intx2);
                   }
                }else if(a.g(uod1, m0.d(Long.TYPE))){
                   long longx2 = b.a().getLong($schemeKey, Long.MIN_VALUE);
                   if (longx2 - Long.MIN_VALUE) {
                      objArray1 = Long.valueOf(longx2);
                   }
                }else if(a.g(uod1, m0.d(Float.TYPE))){
                   float floatx2 = b.a().getFloat($schemeKey, Float.MIN_VALUE);
                   if (floatx2 - Float.MIN_VALUE) {
                      objArray1 = Float.valueOf(floatx2);
                   }
                }
             }
             objArray1 = objArray;
          }catch(java.lang.Exception e0){
          }
          if (objArray1 != null) {
             k ok = (objArray1.length() > 0)? 1: null;
             if (!ok) {
                objArray1 = objArray;
             }
             if (objArray1 != null) {
                ok = k.b;
                oinflateNoti = obj.$notifyTitleKey;
                boolean b1 = (oinflateNoti == null || u.S1(oinflateNoti))? true: false;
                try{
                   if (!b1) {
                      uod = m0.d(str);
                      if (a.g(uod, m0.d(Boolean.TYPE))) {
                         if (ok.a().getBoolean(oinflateNoti, 0)) {
                            objArray = Boolean.TRUE;
                         }
                      }else if(a.g(uod, m0.d(str))){
                         objArray = ok.a().getString(oinflateNoti, "");
                         i = (objArray == null || !objArray.length())? 1: 0;
                         if (!i) {
                            if (objArray == null) {
                               throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                         }
                      }else if(a.g(uod, m0.d(Integer.TYPE))){
                         int intx1 = ok.a().getInt(oinflateNoti, Integer.MIN_VALUE);
                         if (intx1 != Integer.MIN_VALUE) {
                            objArray = Integer.valueOf(intx1);
                         }
                      }else if(a.g(uod, m0.d(Long.TYPE))){
                         long longx1 = ok.a().getLong(oinflateNoti, Long.MIN_VALUE);
                         if (longx1 - Long.MIN_VALUE) {
                            objArray = Long.valueOf(longx1);
                         }
                      }else if(a.g(uod, m0.d(Float.TYPE))){
                         float floatx1 = ok.a().getFloat(oinflateNoti, Float.MIN_VALUE);
                         if (floatx1 - Float.MIN_VALUE) {
                            objArray = Float.valueOf(floatx1);
                         }
                      }
                      objArray = null;
                   }
                }catch(java.lang.Exception e0){
                }
                if (objArray != null) {
                   ok = (objArray.length() > 0)? 1: null;
                   if (!ok) {
                      objArray = null;
                   }
                   if (objArray != null) {
                      ok = k.b;
                      oinflateNoti = obj.$notifyContentKey;
                      uod = (oinflateNoti == null || u.S1(oinflateNoti))? 1: null;
                      try{
                         if (!uod) {
                            uod = m0.d(str);
                            if (a.g(uod, m0.d(Boolean.TYPE))) {
                               if (ok.a().getBoolean(oinflateNoti, 0)) {
                                  uCharSequenc = Boolean.TRUE;
                               }
                            }else if(a.g(uod, m0.d(str))){
                               uCharSequenc = ok.a().getString(oinflateNoti, "");
                               i = (uCharSequenc == null || !uCharSequenc.length())? 1: 0;
                               if (!i) {
                                  if (uCharSequenc != null) {
                                  }else {
                                     throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                  }
                               }
                            }else if(a.g(uod, m0.d(Integer.TYPE))){
                               int intx = ok.a().getInt(oinflateNoti, Integer.MIN_VALUE);
                               if (intx != Integer.MIN_VALUE) {
                                  uCharSequenc = Integer.valueOf(intx);
                               }
                            }else if(a.g(uod, m0.d(Long.TYPE))){
                               long longx = ok.a().getLong(oinflateNoti, Long.MIN_VALUE);
                               if (longx - Long.MIN_VALUE) {
                                  uCharSequenc = Long.valueOf(longx);
                               }
                            }else if(a.g(uod, m0.d(Float.TYPE))){
                               float floatx = ok.a().getFloat(oinflateNoti, Float.MIN_VALUE);
                               if (floatx - Float.MIN_VALUE) {
                                  uCharSequenc = Float.valueOf(floatx);
                               }
                            }
                         }
                         uCharSequenc = null;
                      }catch(java.lang.Exception e0){
                      }
                      if (uCharSequenc != null) {
                         Intent intent = (uCharSequenc.length() > 0)? 1: null;
                         if (!intent) {
                            uCharSequenc = null;
                         }
                         if (uCharSequenc != null) {
                            intent = new Intent("android.intent.action.VIEW", Uri.parse(objArray1));
                            intent.putExtra("PUSH", true);
                            PendingIntent activity = PendingIntent.getActivity(uActivity, 0, intent, 0);
                            Notification notification = new NotificationCompat$Builder(uActivity, i.b.a()).setPriority(true).setContentTitle(objArray).setContentText(uCharSequenc).setLargeIcon(BitmapFactory.decodeResource(uActivity.getResources(), R.drawable.arg_RES_7f080d05)).setSmallIcon(R.drawable.notification_icon_small).setContentIntent(activity).setAutoCancel(0).build();
                            a.o(notification, "NotificationCompat.Build¡­l\(false\)\n        .build\(\)");
                            b.g(0x12d451, notification);
                         }
                      }
                   }
                }
             }
          }
       }
    label_02df :
       return;
    }
}
