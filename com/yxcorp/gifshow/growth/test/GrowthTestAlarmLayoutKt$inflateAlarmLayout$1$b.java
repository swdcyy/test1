package com.yxcorp.gifshow.growth.test.GrowthTestAlarmLayoutKt$inflateAlarmLayout$1$b;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$a;
import com.yxcorp.gifshow.growth.test.GrowthTestAlarmLayoutKt$inflateAlarmLayout$1;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
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
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;

public final class GrowthTestAlarmLayoutKt$inflateAlarmLayout$1$b implements GrowthTestLayout$Companion$a	// class@0014d3
{
    public final GrowthTestAlarmLayoutKt$inflateAlarmLayout$1 b;

    public void GrowthTestAlarmLayoutKt$inflateAlarmLayout$1$b(GrowthTestAlarmLayoutKt$inflateAlarmLayout$1 p0){
       this.b = p0;
       super();
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestAlarmLayoutKt$inflateAlarmLayout$1$b.class, "2")) {
       }else {
          k.b.c("KEY_ALARM_NAME", p0);
       }
       return;
    }
    public Object b(){
       String str1;
       long longx;
       try{
          String str = String.class;
          Object[] objArray = null;
          str1 = PatchProxy.apply(objArray, this, GrowthTestAlarmLayoutKt$inflateAlarmLayout$1$b.class, "1");
          if (str1 != PatchProxyResult.class) {
          }else {
             k b = k.b;
             GrowthTestAlarmLayoutKt$inflateAlarmLayout$1 $DEFAULT_NAM = this.b.$DEFAULT_NAME;
             if (!u.S1("KEY_ALARM_NAME")) {
                d uod = ($DEFAULT_NAM != null)? m0.d($DEFAULT_NAM.getClass()): m0.d(str);
                boolean b1 = false;
                if (a.g(uod, m0.d(Boolean.TYPE))) {
                   if ($DEFAULT_NAM instanceof Boolean) {
                      objArray = $DEFAULT_NAM;
                   }
                   if (objArray != null) {
                      b1 = objArray.booleanValue();
                   }
                   str = Boolean.valueOf(b.a().getBoolean("KEY_ALARM_NAME", b1));
                }else if(a.g(uod, m0.d(str))){
                   if ($DEFAULT_NAM instanceof String) {
                      objArray = $DEFAULT_NAM;
                   }
                   if (objArray == null) {
                      objArray = "";
                   }
                   str = b.a().getString("KEY_ALARM_NAME", objArray);
                   if (str == null || !str.length()) {
                      b1 = true;
                   }
                   if (!b1) {
                      if (str == null) {
                         throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                      }
                   }
                }else if(a.g(uod, m0.d(Integer.TYPE))){
                   if ($DEFAULT_NAM instanceof Integer) {
                      objArray = $DEFAULT_NAM;
                   }
                   str = Integer.MIN_VALUE;
                   int i = (objArray != null)? objArray.intValue(): Integer.MIN_VALUE;
                   int intx = b.a().getInt("KEY_ALARM_NAME", i);
                   if (intx != str) {
                      str = Integer.valueOf(intx);
                   }
                }else if(a.g(uod, m0.d(Long.TYPE))){
                   if ($DEFAULT_NAM instanceof Long) {
                      objArray = $DEFAULT_NAM;
                   }
                   long l = (objArray != null)? objArray.longValue(): Long.MIN_VALUE;
                   longx = b.a().getLong("KEY_ALARM_NAME", l);
                   if (longx - Long.MIN_VALUE) {
                      str = Long.valueOf(longx);
                   }
                }else if(a.g(uod, m0.d(Float.TYPE))){
                   if ($DEFAULT_NAM instanceof Float) {
                      objArray = $DEFAULT_NAM;
                   }
                   longx = 1;
                   float f = (objArray != null)? objArray.floatValue(): Float.MIN_VALUE;
                   float floatx = b.a().getFloat("KEY_ALARM_NAME", f);
                   if (floatx - longx) {
                      str = Float.valueOf(floatx);
                   }
                }
                str1 = str;
             }
          label_0123 :
             str1 = $DEFAULT_NAM;
          }
       }catch(java.lang.Exception e0){
       }
       return str1;
    }
}
