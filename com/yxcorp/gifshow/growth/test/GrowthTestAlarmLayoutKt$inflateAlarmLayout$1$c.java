package com.yxcorp.gifshow.growth.test.GrowthTestAlarmLayoutKt$inflateAlarmLayout$1$c;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$a;
import com.yxcorp.gifshow.growth.test.GrowthTestAlarmLayoutKt$inflateAlarmLayout$1;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vqa.k;
import pna.k;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import zsd.u;
import vsd.d;
import nsd.m0;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences;
import java.lang.NullPointerException;
import java.lang.Long;
import java.lang.Float;

public final class GrowthTestAlarmLayoutKt$inflateAlarmLayout$1$c implements GrowthTestLayout$Companion$a	// class@0014d4
{
    public final GrowthTestAlarmLayoutKt$inflateAlarmLayout$1 b;

    public void GrowthTestAlarmLayoutKt$inflateAlarmLayout$1$c(GrowthTestAlarmLayoutKt$inflateAlarmLayout$1 p0){
       this.b = p0;
       super();
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestAlarmLayoutKt$inflateAlarmLayout$1$c.class, "2")) {
       }else {
          k.b.c("KEY_ALARM_HOUR", p0);
       }
       return;
    }
    public Object b(){
       Integer integer;
       try{
          Object[] objArray = null;
          integer = PatchProxy.apply(objArray, this, GrowthTestAlarmLayoutKt$inflateAlarmLayout$1$c.class, "1");
          if (integer != PatchProxyResult.class) {
          }else {
             k b = k.b;
             String str = "KEY_ALARM_HOUR";
             Integer integer1 = Integer.valueOf(this.b.$DEFAULT_HOUR);
             if (!u.S1(str)) {
                d uod = m0.d(integer1.getClass());
                boolean b1 = false;
                if (a.g(uod, m0.d(Boolean.TYPE))) {
                   if (integer1 instanceof Boolean) {
                      objArray = integer1;
                   }
                   if (objArray != null) {
                      b1 = objArray.booleanValue();
                   }
                   integer = Boolean.valueOf(b.a().getBoolean(str, b1));
                }else if(a.g(uod, m0.d(String.class))){
                   if (integer1 instanceof String) {
                      objArray = integer1;
                   }
                   if (objArray == null) {
                      objArray = "";
                   }
                   integer = b.a().getString(str, objArray);
                   if (integer == null || !integer.length()) {
                      b1 = true;
                   }
                   if (!b1) {
                      if (integer != null) {
                      }else {
                         throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                      }
                   }
                }else if(a.g(uod, m0.d(Integer.TYPE))){
                   int intx = b.a().getInt(str, integer1.intValue());
                   if (intx != Integer.MIN_VALUE) {
                      integer = Integer.valueOf(intx);
                   }
                }else if(a.g(uod, m0.d(Long.TYPE))){
                   if (integer1 instanceof Long) {
                      objArray = integer1;
                   }
                   long l = (objArray != null)? objArray.longValue(): Long.MIN_VALUE;
                   long longx = b.a().getLong(str, l);
                   if (longx - Long.MIN_VALUE) {
                      integer = Long.valueOf(longx);
                   }
                }else if(a.g(uod, m0.d(Float.TYPE))){
                   if (integer1 instanceof Float) {
                      objArray = integer1;
                   }
                   float f = (objArray != null)? objArray.floatValue(): Float.MIN_VALUE;
                   float floatx = b.a().getFloat(str, f);
                   if (floatx - 1) {
                      integer = Float.valueOf(floatx);
                   }
                }
             }
             integer = integer1;
          }
       }catch(java.lang.Exception e0){
       }
       return integer;
    }
}
