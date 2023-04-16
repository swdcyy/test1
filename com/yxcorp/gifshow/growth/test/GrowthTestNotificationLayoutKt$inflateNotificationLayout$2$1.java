package com.yxcorp.gifshow.growth.test.GrowthTestNotificationLayoutKt$inflateNotificationLayout$2$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import vqa.k;
import java.lang.CharSequence;
import zsd.u;
import vsd.d;
import nsd.m0;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences;
import pna.k;
import java.lang.NullPointerException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import android.content.Intent;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import java.lang.Exception;

public final class GrowthTestNotificationLayoutKt$inflateNotificationLayout$2$1 extends Lambda implements a	// class@00150c
{
    public final String $schemeKey;

    public void GrowthTestNotificationLayoutKt$inflateNotificationLayout$2$1(String p0){
       this.$schemeKey = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray1;
       int i1;
       String str = String.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GrowthTestNotificationLayoutKt$inflateNotificationLayout$2$1.class, "1")) {
          return;
       }
       try{
          k b = k.b;
          GrowthTestNotificationLayoutKt$inflateNotificationLayout$2$1 t$schemeKey = this.$schemeKey;
          int i = 1;
          d uod = (t$schemeKey == null || u.S1(t$schemeKey))? 1: null;
          try{
             if (!uod) {
                uod = m0.d(str);
                if (a.g(uod, m0.d(Boolean.TYPE))) {
                   if (b.a().getBoolean(t$schemeKey, 0)) {
                      objArray1 = Boolean.TRUE;
                   }
                }else if(a.g(uod, m0.d(str))){
                   objArray1 = b.a().getString(t$schemeKey, "");
                   i1 = (objArray1 == null || !objArray1.length())? 1: 0;
                   if (!i1) {
                      if (objArray1 != null) {
                      }else {
                         throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                      }
                   }
                }else if(a.g(uod, m0.d(Integer.TYPE))){
                   int i2 = Integer.MIN_VALUE;
                   i1 = b.a().getInt(t$schemeKey, i2);
                   if (i1 != i2) {
                      objArray1 = Integer.valueOf(i1);
                   }
                }else if(a.g(uod, m0.d(Long.TYPE))){
                   long longx = b.a().getLong(t$schemeKey, Long.MIN_VALUE);
                   if (longx - Long.MIN_VALUE) {
                      objArray1 = Long.valueOf(longx);
                   }
                }else if(a.g(uod, m0.d(Float.TYPE))){
                   float floatx = b.a().getFloat(t$schemeKey, Float.MIN_VALUE);
                   if (floatx - Float.MIN_VALUE) {
                      objArray1 = Float.valueOf(floatx);
                   }
                }
             }
             objArray1 = objArray;
          }catch(java.lang.Exception e0){
          }
          if (objArray1 != null) {
             try{
                if (objArray1.length() > 0) {
                label_00db :
                   if (i) {
                      objArray = objArray1;
                   }
                   if (objArray != null) {
                      Intent intent = Intent.parseUri(objArray, 0);
                      ActivityContext uActivityCon = ActivityContext.g();
                      a.o(uActivityCon, "ActivityContext.getInstance\(\)");
                      Activity uActivity = uActivityCon.e();
                      if (uActivity != null) {
                         uActivity.startActivity(intent);
                      }
                   }
                }else {
                   i = 0;
                   goto label_00db ;
                }
             }catch(java.lang.Exception e0){
                e0.printStackTrace();
             }
             return;
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
