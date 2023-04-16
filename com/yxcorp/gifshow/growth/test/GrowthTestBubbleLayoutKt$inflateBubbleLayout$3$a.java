package com.yxcorp.gifshow.growth.test.GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$a;
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

public final class GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$a implements GrowthTestLayout$Companion$a	// class@0014e1
{

    public void GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$a(){
       super();
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$a.class, "2")) {
       }else {
          k.b.c("KEY_K_BUBBLE_TK_BUNDLE_ID", p0);
       }
       return;
    }
    public Object b(){
       Object[] objArray1;
       Boolean tRUE;
       try{
          String str = String.class;
          Object[] objArray = null;
          objArray1 = PatchProxy.apply(objArray, this, GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$a.class, "1");
          if (objArray1 != PatchProxyResult.class) {
          }else {
             k b = k.b;
             String str1 = "KEY_K_BUBBLE_TK_BUNDLE_ID";
             if (!u.S1(str1)) {
                d uod = m0.d(str);
                boolean b1 = false;
                if (a.g(uod, m0.d(Boolean.TYPE))) {
                   if (b.a().getBoolean(str1, b1)) {
                      tRUE = Boolean.TRUE;
                   }
                }else if(a.g(uod, m0.d(str))){
                   tRUE = b.a().getString(str1, "");
                   if (tRUE == null || !tRUE.length()) {
                      b1 = true;
                   }
                   if (!b1) {
                      if (tRUE == null) {
                         throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                      }
                   }
                }else if(a.g(uod, m0.d(Integer.TYPE))){
                   int i = Integer.MIN_VALUE;
                   int intx = b.a().getInt(str1, i);
                   if (intx != i) {
                      tRUE = Integer.valueOf(intx);
                   }
                }else if(a.g(uod, m0.d(Long.TYPE))){
                   long longx = b.a().getLong(str1, Long.MIN_VALUE);
                   if (longx - Long.MIN_VALUE) {
                      tRUE = Long.valueOf(longx);
                   }
                }else if(a.g(uod, m0.d(Float.TYPE))){
                   float floatx = b.a().getFloat(str1, Float.MIN_VALUE);
                   if (floatx - Float.MIN_VALUE) {
                      tRUE = Float.valueOf(floatx);
                   }
                }
                objArray = tRUE;
             }
          label_00cc :
             objArray1 = objArray;
          }
       }catch(java.lang.Exception e0){
       }
       return objArray1;
    }
}
