package com.yxcorp.gifshow.growth.test.GrowthTestAlarmLayoutKt$inflateAlarmLayout$4;
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
import com.yxcorp.utility.alarm.KwaiAlarm;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;

public final class GrowthTestAlarmLayoutKt$inflateAlarmLayout$4 extends Lambda implements a	// class@0014dc
{
    public final String $DEFAULT_NAME;

    public void GrowthTestAlarmLayoutKt$inflateAlarmLayout$4(String p0){
       this.$DEFAULT_NAME = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       d uod;
       Object[] objArray1;
       int b2;
       String str3;
       GrowthTestAlarmLayoutKt$inflateAlarmLayout$4 oinflateAlar;
       Object obj = this;
       String str = String.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, GrowthTestAlarmLayoutKt$inflateAlarmLayout$4.class, "1")) {
          return;
       }
       try{
          k b = k.b;
          String str1 = "KEY_ALARM_CANCEL_NAME";
          GrowthTestAlarmLayoutKt$inflateAlarmLayout$4 $DEFAULT_NAM = obj.$DEFAULT_NAME;
          int i = 1;
          String str2 = "";
          if (!u.S1(str1)) {
             uod = ($DEFAULT_NAM != null)? m0.d($DEFAULT_NAM.getClass()): m0.d(str);
             if (a.g(uod, m0.d(Boolean.TYPE))) {
                objArray1 = (!$DEFAULT_NAM instanceof Boolean)? objArray: $DEFAULT_NAM;
                b2 = (objArray1 != null)? objArray1.booleanValue(): false;
                str3 = Boolean.valueOf(b.a().getBoolean(str1, b2));
             }else if(a.g(uod, m0.d(str))){
                objArray1 = (!$DEFAULT_NAM instanceof String)? objArray: $DEFAULT_NAM;
                if (objArray1 == null) {
                   String str4 = str2;
                }
                str3 = b.a().getString(str1, objArray1);
                str1 = (str3 == null || !str3.length())? 1: null;
                if (!str1) {
                   if (str3 == null) {
                      throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                   }
                }
             }else if(a.g(uod, m0.d(Integer.TYPE))){
                objArray1 = (!$DEFAULT_NAM instanceof Integer)? objArray: $DEFAULT_NAM;
                b2 = (objArray1 != null)? objArray1.intValue(): Integer.MIN_VALUE;
                int intx = b.a().getInt(str1, b2);
                if (intx != Integer.MIN_VALUE) {
                   str3 = Integer.valueOf(intx);
                }
             }else if(a.g(uod, m0.d(Long.TYPE))){
                objArray1 = (!$DEFAULT_NAM instanceof Long)? objArray: $DEFAULT_NAM;
                long l1 = (objArray1 != null)? objArray1.longValue(): Long.MIN_VALUE;
                l1 = b.a().getLong(str1, l1);
                if (l1 - Long.MIN_VALUE) {
                   str3 = Long.valueOf(l1);
                }
             }else if(a.g(uod, m0.d(Float.TYPE))){
                objArray1 = (!$DEFAULT_NAM instanceof Float)? objArray: $DEFAULT_NAM;
                float f1 = (objArray1 != null)? objArray1.floatValue(): Float.MIN_VALUE;
                float floatx = b.a().getFloat(str1, f1);
                if (floatx - 1) {
                   str3 = Float.valueOf(floatx);
                }
             }
             $DEFAULT_NAM = str3;
          }
       label_012b :
          b = k.b;
          if (!u.S1("KEY_ALARM_CANCEL_TOAST")) {
             try{
                uod = m0.d(str2.getClass());
                if (a.g(uod, m0.d(Boolean.TYPE))) {
                   if (str2 instanceof Boolean) {
                      objArray = str2;
                   }
                   boolean b1 = (objArray != null)? objArray.booleanValue(): false;
                   str = Boolean.valueOf(b.a().getBoolean("KEY_ALARM_CANCEL_TOAST", b1));
                }else if(a.g(uod, m0.d(str))){
                   str = b.a().getString("KEY_ALARM_CANCEL_TOAST", str2);
                   if (str != null && str.length()) {
                      i = 0;
                   }
                   if (!i) {
                      if (str == null) {
                         throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                      }
                   }
                }else if(a.g(uod, m0.d(Integer.TYPE))){
                   if (str2 instanceof Integer) {
                      objArray = str2;
                   }
                   int i1 = (objArray != null)? objArray.intValue(): Integer.MIN_VALUE;
                   i1 = b.a().getInt("KEY_ALARM_CANCEL_TOAST", i1);
                   if (i1 != Integer.MIN_VALUE) {
                      str = Integer.valueOf(i1);
                   }
                }else if(a.g(uod, m0.d(Long.TYPE))){
                   if (str2 instanceof Long) {
                      objArray = str2;
                   }
                   long l = (objArray != null)? objArray.longValue(): Long.MIN_VALUE;
                   long longx = b.a().getLong("KEY_ALARM_CANCEL_TOAST", l);
                   if (longx - Long.MIN_VALUE) {
                      str = Long.valueOf(longx);
                   }
                }else if(a.g(uod, m0.d(Float.TYPE))){
                   if (str2 instanceof Float) {
                      objArray = str2;
                   }
                   float f = (objArray != null)? objArray.floatValue(): Float.MIN_VALUE;
                   f = b.a().getFloat("KEY_ALARM_CANCEL_TOAST", f);
                   if (f - 1) {
                      str = Float.valueOf(f);
                   }
                }
                str2 = str;
             }catch(java.lang.Exception e0){
             }
          }
       label_0221 :
          ActivityContext uActivityCon = ActivityContext.g();
          a.o(uActivityCon, "ActivityContext.getInstance\(\)");
          KwaiAlarm.a($DEFAULT_NAM, str2, uActivityCon.e());
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
