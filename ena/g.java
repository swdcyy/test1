package ena.g;
import com.kwai.framework.activitycontext.ActivityContext$b;
import android.content.ComponentCallbacks;
import java.lang.Object;
import android.app.Activity;
import m56.a;
import java.lang.String;
import java.lang.Long;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerPushSwitch;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerPushSwitch$a;
import fg6.a;
import com.kwai.sdk.switchconfig.a;
import com.google.gson.Gson;
import qrd.p;
import java.io.File;
import android.os.Environment;
import kotlin.jvm.internal.a;
import qkd.b;
import com.yxcorp.utility.SystemUtil;
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
import java.lang.Float;
import java.lang.Number;
import o56.a;
import vma.a;
import java.lang.System;
import android.content.SharedPreferences$Editor;
import oe6.g;
import android.net.Uri;
import android.content.Intent;
import android.content.Context;
import android.app.PendingIntent;
import androidx.core.app.NotificationCompat$Builder;
import pna.i;
import android.content.res.Resources;
import android.app.Application;
import nsd.r0;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerHelper;
import fna.f;
import java.util.Arrays;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.app.Notification;
import ena.h;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import q2b.h$b;
import k2b.u1;
import s7.b;
import android.os.Bundle;
import android.content.res.Configuration;

public final class g implements ActivityContext$b, ComponentCallbacks	// class@00277b
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public void a(Activity p0){
       a.b(this, p0);
    }
    public final void b(){
       k b;
       long l3;
       Number number;
       long l4;
       long l6;
       Long longx2;
       SharedPreferences a;
       int i;
       int intx;
       String str6;
       int i1;
       int i2;
       SharedPreferences$Editor uEditor;
       SharedPreferences$Editor uEditor1;
       SharedPreferences$Editor uEditor2;
       Intent intent;
       Object[] objArray1;
       NotificationCompat$Builder uBuilder;
       Notification notification;
       ClientEvent$ElementPackage uElementPack;
       h$b uob;
       Object obj = this;
       String str = String.class;
       Long longx = Long.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, g.class, "5")) {
          return;
       }
       CleanerPushSwitch$a companion = CleanerPushSwitch.Companion;
       Objects.requireNonNull(companion);
       CleanerPushSwitch uCleanerPush = PatchProxy.apply(objArray, companion, CleanerPushSwitch$a.class, "2");
       String str1 = "1";
       if (uCleanerPush != PatchProxyResult.class) {
       }else {
          uCleanerPush = a.a.h(a.t().c("cleanerPushSwitch", "{}"), CleanerPushSwitch.class);
       }
       File externalStor = Environment.getExternalStorageDirectory();
       if (!externalStor.exists()) {
          return;
       }else {
          a.o(externalStor, "storageDir");
          long l = b.a(externalStor.getAbsolutePath());
          if (l - null <= 0) {
             return;
          }else {
             long l1 = (long)1024;
             long l2 = (uCleanerPush.pushLeftMB * l1) * l1;
             String str2 = "null cannot be cast to non-null type kotlin.Long";
             String str3 = "";
             if (SystemUtil.K()) {
                try{
                   b = k.b;
                   if (u.S1("KEY_CLEANER_NOTIFICATION_SIZE")) {
                      l3 = l2;
                   }else {
                      d uod1 = m0.d(longx);
                      Class tYPE1 = Boolean.TYPE;
                      l3 = l2;
                      if (a.g(uod1, m0.d(tYPE1))) {
                         if (b.a().getBoolean("KEY_CLEANER_NOTIFICATION_SIZE", false)) {
                            number = Boolean.TRUE;
                         }
                      }else if(a.g(uod1, m0.d(str))){
                         number = b.a().getString("KEY_CLEANER_NOTIFICATION_SIZE", str3);
                         l4 = (number == null || !number.length())? 1: 0;
                         if (!l4) {
                            if (number != null) {
                            }else {
                               throw new NullPointerException(str2);
                            }
                         }
                      }else if(a.g(uod1, m0.d(Integer.TYPE))){
                         int i3 = Integer.MIN_VALUE;
                         int intx2 = b.a().getInt("KEY_CLEANER_NOTIFICATION_SIZE", i3);
                         if (intx2 != i3) {
                            number = Integer.valueOf(intx2);
                         }
                      }else if(a.g(uod1, m0.d(Long.TYPE))){
                         l4 = Long.MIN_VALUE;
                         long longx3 = b.a().getLong("KEY_CLEANER_NOTIFICATION_SIZE", l4);
                         if (longx3 - l4) {
                            number = Long.valueOf(longx3);
                         }
                      }else if(a.g(uod1, m0.d(Float.TYPE))){
                         float f = Float.MIN_VALUE;
                         float floatx1 = b.a().getFloat("KEY_CLEANER_NOTIFICATION_SIZE", f);
                         if (floatx1 - f) {
                            number = Float.valueOf(floatx1);
                         }
                      }
                   }
                }catch(java.lang.Exception e0){
                }catch(java.lang.Exception e0){
                }
                if (number != null) {
                   l4 = (number.longValue() >= 0)? 1: 0;
                   if (!l4) {
                      number = null;
                   }
                   if (number != null) {
                      l2 = (number.longValue() * l1) * l1;
                   label_0160 :
                      if (l - l2 < 0) {
                         a.o(uCleanerPush, "switch");
                         if (!PatchProxy.isSupport(g.class) || !PatchProxy.applyVoidTwoRefs(uCleanerPush, Long.valueOf(l), obj, g.class, "6")) {
                            Application b1 = a.B;
                            if (b1 != null) {
                               try{
                                  long longx1 = a.a.getLong("lastTimeShowNotification", 0);
                                  long l5 = System.currentTimeMillis();
                                  k b2 = k.b;
                                  String str4 = str1;
                                  str1 = "KEY_CLEANER_NOTIFICATION_TIME";
                                  if (u.S1(str1)) {
                                     l6 = l;
                                  }else {
                                     d uod = m0.d(longx);
                                     Class tYPE = Boolean.TYPE;
                                     try{
                                        l6 = l;
                                        if (a.g(uod, m0.d(tYPE))) {
                                           if (b2.a().getBoolean(str1, false)) {
                                              longx2 = Boolean.TRUE;
                                           }
                                        }else if(a.g(uod, m0.d(str))){
                                           longx2 = b2.a().getString(str1, str3);
                                           String str5 = (longx2 == null || !longx2.length())? 1: null;
                                           if (!str5) {
                                              if (longx2 != null) {
                                              }else {
                                                 throw new NullPointerException(str2);
                                              }
                                           }
                                        }else if(a.g(uod, m0.d(Integer.TYPE))){
                                           int i4 = Integer.MIN_VALUE;
                                           int intx1 = b2.a().getInt(str1, i4);
                                           if (intx1 != i4) {
                                              longx2 = Integer.valueOf(intx1);
                                           }
                                        }else if(a.g(uod, m0.d(Long.TYPE))){
                                           long l8 = Long.MIN_VALUE;
                                           long l7 = b2.a().getLong(str1, l8);
                                           if (l7 - l8) {
                                              longx2 = Long.valueOf(l7);
                                           }
                                        }else if(a.g(uod, m0.d(Float.TYPE))){
                                           float floatx = b2.a().getFloat(str1, Float.MIN_VALUE);
                                           if (floatx - Float.MIN_VALUE) {
                                              longx2 = Float.valueOf(floatx);
                                           }
                                        }
                                     }catch(java.lang.Exception e0){
                                     }
                                  }
                               }catch(java.lang.Exception e0){
                               }
                               longx2 = null;
                            }
                         }
                      }
                   label_0384 :
                      return;
                   }
                }
             }else {
                l3 = l2;
             }
             l2 = l3;
             goto label_0160 ;
          }
       }
    }
    public final boolean c(CleanerPushSwitch p0,int p1,int p2){
       if (p1 >= p0.pushCycleNotClickCount && 1 <= p1) {
          int i = 1;
          int i1 = 0;
          int i2 = p1 - i;
          i2 = 1 << i2;
          i2 = i2 & p2;
          while (!i2) {
             i1 = i1 + 1;
             break ;
             i = i + 1;
          }
          if (i1 >= p0.pushCycleNotClickCount) {
             return 1;
          }else if(i != p1){
             goto label_001a ;
          }
       }
       return false;
    }
    public void d(Activity p0){
       a.d(this, p0);
    }
    public void e(Activity p0){
       a.c(this, p0);
    }
    public void f(Activity p0,Bundle p1){
       a.a(this, p0, p1);
    }
    public void onBackground(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       this.b();
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       a.p(p0, "newConfig");
       return;
    }
    public void onForeground(){
       a.f(this);
    }
    public void onLowMemory(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       this.b();
       return;
    }
}
