package com.yxcorp.gifshow.growth.test.GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$c;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$a;
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

public final class GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$c implements GrowthTestLayout$Companion$a	// class@0014e3
{

    public void GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$c(){
       super();
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$c.class, "2")) {
       }else {
          k.b.c("KEY_K_BUBBLE_TK_BUNDLE_PARAMS", p0);
       }
       return;
    }
    public Object b(){
       String str;
       try{
          Object[] objArray = null;
          str = PatchProxy.apply(objArray, this, GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$c.class, "1");
          if (str != PatchProxyResult.class) {
          }else {
             k b = k.b;
             String str1 = "KEY_K_BUBBLE_TK_BUNDLE_PARAMS";
             if (!u.S1(str1)) {
                d uod = m0.d("{}".getClass());
                boolean b1 = false;
                if (a.g(uod, m0.d(Boolean.TYPE))) {
                   if ("{}" instanceof Boolean) {
                      objArray = "{}";
                   }
                   if (objArray != null) {
                      b1 = objArray.booleanValue();
                   }
                   str = Boolean.valueOf(b.a().getBoolean(str1, b1));
                }else if(a.g(uod, m0.d(String.class))){
                   str = b.a().getString(str1, "{}");
                   if (str == null || !str.length()) {
                      b1 = true;
                   }
                   if (!b1) {
                      if (str == null) {
                         throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                      }
                   }
                }else if(a.g(uod, m0.d(Integer.TYPE))){
                   if ("{}" instanceof Integer) {
                      objArray = "{}";
                   }
                   int i = (objArray != null)? objArray.intValue(): Integer.MIN_VALUE;
                   int intx = b.a().getInt(str1, i);
                   if (intx != Integer.MIN_VALUE) {
                      str = Integer.valueOf(intx);
                   }
                }else if(a.g(uod, m0.d(Long.TYPE))){
                   if ("{}" instanceof Long) {
                      objArray = "{}";
                   }
                   long l = (objArray != null)? objArray.longValue(): Long.MIN_VALUE;
                   long longx = b.a().getLong(str1, l);
                   if (longx - Long.MIN_VALUE) {
                      str = Long.valueOf(longx);
                   }
                }else if(a.g(uod, m0.d(Float.TYPE))){
                   if ("{}" instanceof Float) {
                      objArray = "{}";
                   }
                   float f = (objArray != null)? objArray.floatValue(): Float.MIN_VALUE;
                   float floatx = b.a().getFloat(str1, f);
                   if (floatx - 1) {
                      str = Float.valueOf(floatx);
                   }
                }
             }
             str = "{}";
          }
       }catch(java.lang.Exception e0){
       }
       return str;
    }
}
