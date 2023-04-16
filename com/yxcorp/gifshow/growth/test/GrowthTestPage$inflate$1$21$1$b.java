package com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$1$21$1$b;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$a;
import java.lang.Object;
import java.lang.Long;
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
import java.lang.Integer;
import java.lang.Float;

public final class GrowthTestPage$inflate$1$21$1$b implements GrowthTestLayout$Companion$a	// class@001529
{

    public void GrowthTestPage$inflate$1$21$1$b(){
       super();
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestPage$inflate$1$21$1$b.class, "2")) {
       }else {
          k.b.c("KEY_EXPLORE_TAB_BUBBLE_SHOW_DELAY", p0);
       }
       return;
    }
    public Object b(){
       Object[] objArray1;
       Boolean tRUE;
       try{
          Object[] objArray = null;
          objArray1 = PatchProxy.apply(objArray, this, GrowthTestPage$inflate$1$21$1$b.class, "1");
          if (objArray1 != PatchProxyResult.class) {
          }else {
             k b = k.b;
             String str = "KEY_EXPLORE_TAB_BUBBLE_SHOW_DELAY";
             if (!u.S1(str)) {
                d uod = m0.d(Long.class);
                boolean b1 = false;
                if (a.g(uod, m0.d(Boolean.TYPE))) {
                   if (b.a().getBoolean(str, b1)) {
                      tRUE = Boolean.TRUE;
                   }
                }else if(a.g(uod, m0.d(String.class))){
                   tRUE = b.a().getString(str, "");
                   if (tRUE == null || !tRUE.length()) {
                      b1 = true;
                   }
                   if (!b1) {
                      if (tRUE != null) {
                      }else {
                         throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                      }
                   }
                }else if(a.g(uod, m0.d(Integer.TYPE))){
                   int intx = b.a().getInt(str, Integer.MIN_VALUE);
                   if (intx != Integer.MIN_VALUE) {
                      tRUE = Integer.valueOf(intx);
                   }
                }else if(a.g(uod, m0.d(Long.TYPE))){
                   long longx = b.a().getLong(str, Long.MIN_VALUE);
                   if (longx - Long.MIN_VALUE) {
                      objArray = Long.valueOf(longx);
                   }
                }else if(a.g(uod, m0.d(Float.TYPE))){
                   float floatx = b.a().getFloat(str, Float.MIN_VALUE);
                   if (floatx - Float.MIN_VALUE) {
                      tRUE = Float.valueOf(floatx);
                   }
                }
                objArray = tRUE;
             }
          label_00ce :
             objArray1 = objArray;
          }
       }catch(java.lang.Exception e0){
       }
       return objArray1;
    }
}
